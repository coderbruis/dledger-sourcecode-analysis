/*
 * Copyright 2017-2022 The DLedger Authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.openmessaging.storage.dledger.protocol;

public class LeadershipTransferRequest extends RequestOrResponse {

    // 转让领导者ID
    private String transferId;
    // 受让领导者ID
    private String transfereeId;
    private long takeLeadershipLedgerIndex;

    public String getTransfereeId() {
        return transfereeId;
    }

    public void setTransfereeId(String transfereeId) {
        this.transfereeId = transfereeId;
    }

    public String getTransferId() {
        return transferId;
    }

    public void setTransferId(String transferId) {
        this.transferId = transferId;
    }

    public long getTakeLeadershipLedgerIndex() {
        return takeLeadershipLedgerIndex;
    }

    public void setTakeLeadershipLedgerIndex(long takeLeadershipLedgerIndex) {
        this.takeLeadershipLedgerIndex = takeLeadershipLedgerIndex;
    }

    @Override
    public String toString() {
        return "LeadershipTransferRequest{" +
            "transferId='" + transferId + '\'' +
            ", transfereeId='" + transfereeId + '\'' +
            ", takeLeadershipLedgerIndex=" + takeLeadershipLedgerIndex +
            ", group='" + group + '\'' +
            ", remoteId='" + remoteId + '\'' +
            ", localId='" + localId + '\'' +
            ", code=" + code +
            ", leaderId='" + leaderId + '\'' +
            ", term=" + term +
            '}';
    }
}
