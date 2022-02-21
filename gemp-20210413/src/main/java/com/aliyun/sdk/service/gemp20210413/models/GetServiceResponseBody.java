// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetServiceResponseBody} extends {@link TeaModel}
 *
 * <p>GetServiceResponseBody</p>
 */
public class GetServiceResponseBody extends TeaModel {
    @NameInMap("data")
    private Data data;

    @NameInMap("requestId")
    private String requestId;

    private GetServiceResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetServiceResponseBody create() {
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
         * 服务详情
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

        public GetServiceResponseBody build() {
            return new GetServiceResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("serviceDescription")
        private String serviceDescription;

        @NameInMap("serviceId")
        private Long serviceId;

        @NameInMap("serviceName")
        private String serviceName;

        @NameInMap("updateTime")
        private String updateTime;

        private Data(Builder builder) {
            this.serviceDescription = builder.serviceDescription;
            this.serviceId = builder.serviceId;
            this.serviceName = builder.serviceName;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return serviceDescription
         */
        public String getServiceDescription() {
            return this.serviceDescription;
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
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String serviceDescription; 
            private Long serviceId; 
            private String serviceName; 
            private String updateTime; 

            /**
             * 服务描述
             */
            public Builder serviceDescription(String serviceDescription) {
                this.serviceDescription = serviceDescription;
                return this;
            }

            /**
             * 服务ID
             */
            public Builder serviceId(Long serviceId) {
                this.serviceId = serviceId;
                return this;
            }

            /**
             * 服务名字
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            /**
             * 修改时间
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
