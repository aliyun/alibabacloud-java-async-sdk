// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

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
 * {@link ListVpcEndpointsResponseBody} extends {@link TeaModel}
 *
 * <p>ListVpcEndpointsResponseBody</p>
 */
public class ListVpcEndpointsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private java.util.List<Result> result;

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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<Result> getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<Result> result; 

        private Builder() {
        } 

        private Builder(ListVpcEndpointsResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F99407AB-2FA9-489E-A259-40CF6DCC47D9</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The details of the endpoints.</p>
         */
        public Builder result(java.util.List<Result> result) {
            this.result = result;
            return this;
        }

        public ListVpcEndpointsResponseBody build() {
            return new ListVpcEndpointsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListVpcEndpointsResponseBody} extends {@link TeaModel}
     *
     * <p>ListVpcEndpointsResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("connectionStatus")
        private String connectionStatus;

        @com.aliyun.core.annotation.NameInMap("createTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("endpointBusinessStatus")
        private String endpointBusinessStatus;

        @com.aliyun.core.annotation.NameInMap("endpointDomain")
        private String endpointDomain;

        @com.aliyun.core.annotation.NameInMap("endpointId")
        private String endpointId;

        @com.aliyun.core.annotation.NameInMap("endpointName")
        private String endpointName;

        @com.aliyun.core.annotation.NameInMap("endpointStatus")
        private String endpointStatus;

        @com.aliyun.core.annotation.NameInMap("serviceId")
        private String serviceId;

        @com.aliyun.core.annotation.NameInMap("serviceName")
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

            private Builder() {
            } 

            private Builder(Result model) {
                this.connectionStatus = model.connectionStatus;
                this.createTime = model.createTime;
                this.endpointBusinessStatus = model.endpointBusinessStatus;
                this.endpointDomain = model.endpointDomain;
                this.endpointId = model.endpointId;
                this.endpointName = model.endpointName;
                this.endpointStatus = model.endpointStatus;
                this.serviceId = model.serviceId;
                this.serviceName = model.serviceName;
            } 

            /**
             * <p>The status of the endpoint connection. Valid values:</p>
             * <ul>
             * <li>Pending</li>
             * <li>Connecting</li>
             * <li>Connected</li>
             * <li>Disconnecting</li>
             * <li>Disconnected</li>
             * <li>Deleting</li>
             * <li>ServiceDeleted</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Disconnected</p>
             */
            public Builder connectionStatus(String connectionStatus) {
                this.connectionStatus = connectionStatus;
                return this;
            }

            /**
             * <p>The time when the endpoint was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-07-22T01:19:24Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The business status of the endpoint. Valid values:</p>
             * <ul>
             * <li>Normal</li>
             * <li>FinancialLocked</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
             */
            public Builder endpointBusinessStatus(String endpointBusinessStatus) {
                this.endpointBusinessStatus = endpointBusinessStatus;
                return this;
            }

            /**
             * <p>The domain name of the endpoint. The domain name is used for connection configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>ep-bp18s6wy9420wdi4****.epsrv-bp1bz3efowa4kc0****.cn-hangzhou.privatelink.aliyuncs.com</p>
             */
            public Builder endpointDomain(String endpointDomain) {
                this.endpointDomain = endpointDomain;
                return this;
            }

            /**
             * <p>The ID of the endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p>ep-bp1tah7zbrwmkjef****</p>
             */
            public Builder endpointId(String endpointId) {
                this.endpointId = endpointId;
                return this;
            }

            /**
             * <p>The name of the endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder endpointName(String endpointName) {
                this.endpointName = endpointName;
                return this;
            }

            /**
             * <p>The status of the endpoint. Valid values:</p>
             * <ul>
             * <li>Creating</li>
             * <li>Active</li>
             * <li>Pending</li>
             * <li>Deleting</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Active</p>
             */
            public Builder endpointStatus(String endpointStatus) {
                this.endpointStatus = endpointStatus;
                return this;
            }

            /**
             * <p>The ID of the endpoint service with which the endpoint is associated.</p>
             * 
             * <strong>example:</strong>
             * <p>epsrv-bp1w0p3jdirbfmt6****</p>
             */
            public Builder serviceId(String serviceId) {
                this.serviceId = serviceId;
                return this;
            }

            /**
             * <p>The name of the endpoint service with which the endpoint is associated.</p>
             * 
             * <strong>example:</strong>
             * <p>com.aliyuncs.privatelink.cn-hangzhou.epsrv-bp1w0p3jdirbfmt6****</p>
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
