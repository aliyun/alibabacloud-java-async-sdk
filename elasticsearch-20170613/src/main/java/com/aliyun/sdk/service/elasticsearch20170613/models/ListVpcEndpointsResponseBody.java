// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListVpcEndpointsResponseBody} extends {@link TeaModel}
 *
 * <p>ListVpcEndpointsResponseBody</p>
 */
public class ListVpcEndpointsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private java.util.List < Result> result;

    private ListVpcEndpointsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListVpcEndpointsResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public java.util.List < Result> getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < Result> result; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Result.
         */
        public Builder result(java.util.List < Result> result) {
            this.result = result;
            return this;
        }

        public ListVpcEndpointsResponseBody build() {
            return new ListVpcEndpointsResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("connectionStatus")
        private String connectionStatus;

        @NameInMap("createTime")
        private String createTime;

        @NameInMap("endpointBusinessStatus")
        private String endpointBusinessStatus;

        @NameInMap("endpointDomain")
        private String endpointDomain;

        @NameInMap("endpointId")
        private String endpointId;

        @NameInMap("endpointName")
        private String endpointName;

        @NameInMap("endpointStatus")
        private String endpointStatus;

        @NameInMap("serviceId")
        private String serviceId;

        @NameInMap("serviceName")
        private String serviceName;

        private Result(Builder builder) {
            this.connectionStatus = builder.connectionStatus;
            this.createTime = builder.createTime;
            this.endpointBusinessStatus = builder.endpointBusinessStatus;
            this.endpointDomain = builder.endpointDomain;
            this.endpointId = builder.endpointId;
            this.endpointName = builder.endpointName;
            this.endpointStatus = builder.endpointStatus;
            this.serviceId = builder.serviceId;
            this.serviceName = builder.serviceName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return connectionStatus
         */
        public String getConnectionStatus() {
            return this.connectionStatus;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return endpointBusinessStatus
         */
        public String getEndpointBusinessStatus() {
            return this.endpointBusinessStatus;
        }

        /**
         * @return endpointDomain
         */
        public String getEndpointDomain() {
            return this.endpointDomain;
        }

        /**
         * @return endpointId
         */
        public String getEndpointId() {
            return this.endpointId;
        }

        /**
         * @return endpointName
         */
        public String getEndpointName() {
            return this.endpointName;
        }

        /**
         * @return endpointStatus
         */
        public String getEndpointStatus() {
            return this.endpointStatus;
        }

        /**
         * @return serviceId
         */
        public String getServiceId() {
            return this.serviceId;
        }

        /**
         * @return serviceName
         */
        public String getServiceName() {
            return this.serviceName;
        }

        public static final class Builder {
            private String connectionStatus; 
            private String createTime; 
            private String endpointBusinessStatus; 
            private String endpointDomain; 
            private String endpointId; 
            private String endpointName; 
            private String endpointStatus; 
            private String serviceId; 
            private String serviceName; 

            /**
             * connectionStatus.
             */
            public Builder connectionStatus(String connectionStatus) {
                this.connectionStatus = connectionStatus;
                return this;
            }

            /**
             * createTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * endpointBusinessStatus.
             */
            public Builder endpointBusinessStatus(String endpointBusinessStatus) {
                this.endpointBusinessStatus = endpointBusinessStatus;
                return this;
            }

            /**
             * endpointDomain.
             */
            public Builder endpointDomain(String endpointDomain) {
                this.endpointDomain = endpointDomain;
                return this;
            }

            /**
             * endpointId.
             */
            public Builder endpointId(String endpointId) {
                this.endpointId = endpointId;
                return this;
            }

            /**
             * endpointName.
             */
            public Builder endpointName(String endpointName) {
                this.endpointName = endpointName;
                return this;
            }

            /**
             * endpointStatus.
             */
            public Builder endpointStatus(String endpointStatus) {
                this.endpointStatus = endpointStatus;
                return this;
            }

            /**
             * serviceId.
             */
            public Builder serviceId(String serviceId) {
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

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
