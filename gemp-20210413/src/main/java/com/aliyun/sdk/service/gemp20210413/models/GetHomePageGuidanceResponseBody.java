// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetHomePageGuidanceResponseBody} extends {@link TeaModel}
 *
 * <p>GetHomePageGuidanceResponseBody</p>
 */
public class GetHomePageGuidanceResponseBody extends TeaModel {
    @NameInMap("data")
    private Data data;

    @NameInMap("requestId")
    private String requestId;

    private GetHomePageGuidanceResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetHomePageGuidanceResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetHomePageGuidanceResponseBody build() {
            return new GetHomePageGuidanceResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("notifySubscriptionStatus")
        private Boolean notifySubscriptionStatus;

        @NameInMap("serviceGroupStatus")
        private Boolean serviceGroupStatus;

        @NameInMap("serviceStatus")
        private Boolean serviceStatus;

        @NameInMap("usersStatus")
        private Boolean usersStatus;

        private Data(Builder builder) {
            this.notifySubscriptionStatus = builder.notifySubscriptionStatus;
            this.serviceGroupStatus = builder.serviceGroupStatus;
            this.serviceStatus = builder.serviceStatus;
            this.usersStatus = builder.usersStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return notifySubscriptionStatus
         */
        public Boolean getNotifySubscriptionStatus() {
            return this.notifySubscriptionStatus;
        }

        /**
         * @return serviceGroupStatus
         */
        public Boolean getServiceGroupStatus() {
            return this.serviceGroupStatus;
        }

        /**
         * @return serviceStatus
         */
        public Boolean getServiceStatus() {
            return this.serviceStatus;
        }

        /**
         * @return usersStatus
         */
        public Boolean getUsersStatus() {
            return this.usersStatus;
        }

        public static final class Builder {
            private Boolean notifySubscriptionStatus; 
            private Boolean serviceGroupStatus; 
            private Boolean serviceStatus; 
            private Boolean usersStatus; 

            /**
             * notifySubscriptionStatus.
             */
            public Builder notifySubscriptionStatus(Boolean notifySubscriptionStatus) {
                this.notifySubscriptionStatus = notifySubscriptionStatus;
                return this;
            }

            /**
             * serviceGroupStatus.
             */
            public Builder serviceGroupStatus(Boolean serviceGroupStatus) {
                this.serviceGroupStatus = serviceGroupStatus;
                return this;
            }

            /**
             * serviceStatus.
             */
            public Builder serviceStatus(Boolean serviceStatus) {
                this.serviceStatus = serviceStatus;
                return this;
            }

            /**
             * usersStatus.
             */
            public Builder usersStatus(Boolean usersStatus) {
                this.usersStatus = usersStatus;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
