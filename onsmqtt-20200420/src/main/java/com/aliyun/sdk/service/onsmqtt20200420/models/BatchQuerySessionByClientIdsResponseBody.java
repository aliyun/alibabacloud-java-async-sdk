// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.onsmqtt20200420.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchQuerySessionByClientIdsResponseBody} extends {@link TeaModel}
 *
 * <p>BatchQuerySessionByClientIdsResponseBody</p>
 */
public class BatchQuerySessionByClientIdsResponseBody extends TeaModel {
    @NameInMap("OnlineStatusList")
    private java.util.List < OnlineStatusList> onlineStatusList;

    @NameInMap("RequestId")
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
         * OnlineStatusList.
         */
        public Builder onlineStatusList(java.util.List < OnlineStatusList> onlineStatusList) {
            this.onlineStatusList = onlineStatusList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public BatchQuerySessionByClientIdsResponseBody build() {
            return new BatchQuerySessionByClientIdsResponseBody(this);
        } 

    } 

    public static class OnlineStatusList extends TeaModel {
        @NameInMap("ClientId")
        private String clientId;

        @NameInMap("OnlineStatus")
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
             * ClientId.
             */
            public Builder clientId(String clientId) {
                this.clientId = clientId;
                return this;
            }

            /**
             * OnlineStatus.
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
