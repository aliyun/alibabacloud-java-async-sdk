// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.onsmqtt20200420.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link BatchQuerySessionByClientIdsResponseBody} extends {@link TeaModel}
 *
 * <p>BatchQuerySessionByClientIdsResponseBody</p>
 */
public class BatchQuerySessionByClientIdsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("OnlineStatusList")
    private java.util.List < OnlineStatusList> onlineStatusList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private BatchQuerySessionByClientIdsResponseBody(Builder builder) {
        this.onlineStatusList = builder.onlineStatusList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchQuerySessionByClientIdsResponseBody create() {
        return builder().build();
    }

    /**
     * @return onlineStatusList
     */
    public java.util.List < OnlineStatusList> getOnlineStatusList() {
        return this.onlineStatusList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < OnlineStatusList> onlineStatusList; 
        private String requestId; 

        /**
         * <p>The status list of all queried ApsaraMQ for MQTT clients.</p>
         */
        public Builder onlineStatusList(java.util.List < OnlineStatusList> onlineStatusList) {
            this.onlineStatusList = onlineStatusList;
            return this;
        }

        /**
         * <p>The request ID. This parameter is a common parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>63309FDB-ED6C-46AE-B31C-A172FBA0****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public BatchQuerySessionByClientIdsResponseBody build() {
            return new BatchQuerySessionByClientIdsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link BatchQuerySessionByClientIdsResponseBody} extends {@link TeaModel}
     *
     * <p>BatchQuerySessionByClientIdsResponseBody</p>
     */
    public static class OnlineStatusList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClientId")
        private String clientId;

        @com.aliyun.core.annotation.NameInMap("OnlineStatus")
        private Boolean onlineStatus;

        private OnlineStatusList(Builder builder) {
            this.clientId = builder.clientId;
            this.onlineStatus = builder.onlineStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OnlineStatusList create() {
            return builder().build();
        }

        /**
         * @return clientId
         */
        public String getClientId() {
            return this.clientId;
        }

        /**
         * @return onlineStatus
         */
        public Boolean getOnlineStatus() {
            return this.onlineStatus;
        }

        public static final class Builder {
            private String clientId; 
            private Boolean onlineStatus; 

            /**
             * <p>The ID of the ApsaraMQ for MQTT client. For more information about client IDs, see <a href="https://help.aliyun.com/document_detail/42420.html">Terms</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>GID_test@0001</p>
             */
            public Builder clientId(String clientId) {
                this.clientId = clientId;
                return this;
            }

            /**
             * <p>Indicates whether the ApsaraMQ for MQTT client is online. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder onlineStatus(Boolean onlineStatus) {
                this.onlineStatus = onlineStatus;
                return this;
            }

            public OnlineStatusList build() {
                return new OnlineStatusList(this);
            } 

        } 

    }
}
