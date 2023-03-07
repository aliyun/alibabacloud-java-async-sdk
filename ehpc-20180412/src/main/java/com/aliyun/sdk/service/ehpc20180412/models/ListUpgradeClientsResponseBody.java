// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListUpgradeClientsResponseBody} extends {@link TeaModel}
 *
 * <p>ListUpgradeClientsResponseBody</p>
 */
public class ListUpgradeClientsResponseBody extends TeaModel {
    @NameInMap("ClientRecords")
    private java.util.List < ClientRecords> clientRecords;

    @NameInMap("CurrentVersion")
    private String currentVersion;

    @NameInMap("LatestVersion")
    private String latestVersion;

    @NameInMap("RequestId")
    private String requestId;

    private ListUpgradeClientsResponseBody(Builder builder) {
        this.clientRecords = builder.clientRecords;
        this.currentVersion = builder.currentVersion;
        this.latestVersion = builder.latestVersion;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUpgradeClientsResponseBody create() {
        return builder().build();
    }

    /**
     * @return clientRecords
     */
    public java.util.List < ClientRecords> getClientRecords() {
        return this.clientRecords;
    }

    /**
     * @return currentVersion
     */
    public String getCurrentVersion() {
        return this.currentVersion;
    }

    /**
     * @return latestVersion
     */
    public String getLatestVersion() {
        return this.latestVersion;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < ClientRecords> clientRecords; 
        private String currentVersion; 
        private String latestVersion; 
        private String requestId; 

        /**
         * The upgrade records of the cluster.
         */
        public Builder clientRecords(java.util.List < ClientRecords> clientRecords) {
            this.clientRecords = clientRecords;
            return this;
        }

        /**
         * The current version of the E-HPC client.
         */
        public Builder currentVersion(String currentVersion) {
            this.currentVersion = currentVersion;
            return this;
        }

        /**
         * The latest version of the E-HPC client.
         */
        public Builder latestVersion(String latestVersion) {
            this.latestVersion = latestVersion;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListUpgradeClientsResponseBody build() {
            return new ListUpgradeClientsResponseBody(this);
        } 

    } 

    public static class ClientRecords extends TeaModel {
        @NameInMap("NewVersion")
        private String newVersion;

        @NameInMap("OldVersion")
        private String oldVersion;

        @NameInMap("SubUid")
        private String subUid;

        @NameInMap("UpdateTime")
        private String updateTime;

        private ClientRecords(Builder builder) {
            this.newVersion = builder.newVersion;
            this.oldVersion = builder.oldVersion;
            this.subUid = builder.subUid;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClientRecords create() {
            return builder().build();
        }

        /**
         * @return newVersion
         */
        public String getNewVersion() {
            return this.newVersion;
        }

        /**
         * @return oldVersion
         */
        public String getOldVersion() {
            return this.oldVersion;
        }

        /**
         * @return subUid
         */
        public String getSubUid() {
            return this.subUid;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String newVersion; 
            private String oldVersion; 
            private String subUid; 
            private String updateTime; 

            /**
             * The version of the E-HPC client after the upgrade.
             */
            public Builder newVersion(String newVersion) {
                this.newVersion = newVersion;
                return this;
            }

            /**
             * The version of the E-HPC client before the upgrade.
             */
            public Builder oldVersion(String oldVersion) {
                this.oldVersion = oldVersion;
                return this;
            }

            /**
             * The ID of the user that upgraded the E-HPC client.
             */
            public Builder subUid(String subUid) {
                this.subUid = subUid;
                return this;
            }

            /**
             * The time when the operation was performed.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public ClientRecords build() {
                return new ClientRecords(this);
            } 

        } 

    }
}
