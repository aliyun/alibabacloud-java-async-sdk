// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetProblemEffectionServiceResponseBody} extends {@link TeaModel}
 *
 * <p>GetProblemEffectionServiceResponseBody</p>
 */
public class GetProblemEffectionServiceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetProblemEffectionServiceResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetProblemEffectionServiceResponseBody create() {
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
         * data
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * requestId
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetProblemEffectionServiceResponseBody build() {
            return new GetProblemEffectionServiceResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("effectionServiceId")
        private Long effectionServiceId;

        @com.aliyun.core.annotation.NameInMap("level")
        private Long level;

        @com.aliyun.core.annotation.NameInMap("picUrl")
        private java.util.List < String > picUrl;

        @com.aliyun.core.annotation.NameInMap("serviceId")
        private Long serviceId;

        @com.aliyun.core.annotation.NameInMap("serviceName")
        private String serviceName;

        @com.aliyun.core.annotation.NameInMap("status")
        private Long status;

        private Data(Builder builder) {
            this.description = builder.description;
            this.effectionServiceId = builder.effectionServiceId;
            this.level = builder.level;
            this.picUrl = builder.picUrl;
            this.serviceId = builder.serviceId;
            this.serviceName = builder.serviceName;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return effectionServiceId
         */
        public Long getEffectionServiceId() {
            return this.effectionServiceId;
        }

        /**
         * @return level
         */
        public Long getLevel() {
            return this.level;
        }

        /**
         * @return picUrl
         */
        public java.util.List < String > getPicUrl() {
            return this.picUrl;
        }

        /**
         * @return serviceId
         */
        public Long getServiceId() {
            return this.serviceId;
        }

        /**
         * @return serviceName
         */
        public String getServiceName() {
            return this.serviceName;
        }

        /**
         * @return status
         */
        public Long getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String description; 
            private Long effectionServiceId; 
            private Long level; 
            private java.util.List < String > picUrl; 
            private Long serviceId; 
            private String serviceName; 
            private Long status; 

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * effectionServiceId.
             */
            public Builder effectionServiceId(Long effectionServiceId) {
                this.effectionServiceId = effectionServiceId;
                return this;
            }

            /**
             * level.
             */
            public Builder level(Long level) {
                this.level = level;
                return this;
            }

            /**
             * picUrl.
             */
            public Builder picUrl(java.util.List < String > picUrl) {
                this.picUrl = picUrl;
                return this;
            }

            /**
             * serviceId.
             */
            public Builder serviceId(Long serviceId) {
                this.serviceId = serviceId;
                return this;
            }

            /**
             * serviceName.
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            /**
             * status.
             */
            public Builder status(Long status) {
                this.status = status;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
