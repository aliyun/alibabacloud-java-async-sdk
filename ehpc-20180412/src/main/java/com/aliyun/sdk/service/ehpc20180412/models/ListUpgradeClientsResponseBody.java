// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListUpgradeClientsResponseBody} extends {@link TeaModel}
 *
 * <p>ListUpgradeClientsResponseBody</p>
 */
public class ListUpgradeClientsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ClientRecords")
    private java.util.List<ClientRecords> clientRecords;

    @com.aliyun.core.annotation.NameInMap("CurrentVersion")
    private String currentVersion;

    @com.aliyun.core.annotation.NameInMap("LatestVersion")
    private String latestVersion;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientRecords
     */
    public java.util.List<ClientRecords> getClientRecords() {
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
        private java.util.List<ClientRecords> clientRecords; 
        private String currentVersion; 
        private String latestVersion; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListUpgradeClientsResponseBody model) {
            this.clientRecords = model.clientRecords;
            this.currentVersion = model.currentVersion;
            this.latestVersion = model.latestVersion;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The update records of ehpcutil in the cluster.</p>
         */
        public Builder clientRecords(java.util.List<ClientRecords> clientRecords) {
            this.clientRecords = clientRecords;
            return this;
        }

        /**
         * <p>The current version of ehpcutil in the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>1.2.21</p>
         */
        public Builder currentVersion(String currentVersion) {
            this.currentVersion = currentVersion;
            return this;
        }

        /**
         * <p>The latest version of ehpcutil that is released.</p>
         * 
         * <strong>example:</strong>
         * <p>1.2.22</p>
         */
        public Builder latestVersion(String latestVersion) {
            this.latestVersion = latestVersion;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>89A1AC0F-4A6C-4F3D-98F9-BEF9A823****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListUpgradeClientsResponseBody build() {
            return new ListUpgradeClientsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListUpgradeClientsResponseBody} extends {@link TeaModel}
     *
     * <p>ListUpgradeClientsResponseBody</p>
     */
    public static class ClientRecords extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NewVersion")
        private String newVersion;

        @com.aliyun.core.annotation.NameInMap("OldVersion")
        private String oldVersion;

        @com.aliyun.core.annotation.NameInMap("SubUid")
        private String subUid;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
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

            private Builder() {
            } 

            private Builder(ClientRecords model) {
                this.newVersion = model.newVersion;
                this.oldVersion = model.oldVersion;
                this.subUid = model.subUid;
                this.updateTime = model.updateTime;
            } 

            /**
             * <p>The version of ehpcutil after the update.</p>
             * 
             * <strong>example:</strong>
             * <p>1.2.21</p>
             */
            public Builder newVersion(String newVersion) {
                this.newVersion = newVersion;
                return this;
            }

            /**
             * <p>The version of ehpcutil before the update.</p>
             * 
             * <strong>example:</strong>
             * <p>1.2.16</p>
             */
            public Builder oldVersion(String oldVersion) {
                this.oldVersion = oldVersion;
                return this;
            }

            /**
             * <p>The user ID (UID) whose ehpcutil is updated.</p>
             * 
             * <strong>example:</strong>
             * <p>129******84</p>
             */
            public Builder subUid(String subUid) {
                this.subUid = subUid;
                return this;
            }

            /**
             * <p>The update time.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-08-26T06:26:57.000Z</p>
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
