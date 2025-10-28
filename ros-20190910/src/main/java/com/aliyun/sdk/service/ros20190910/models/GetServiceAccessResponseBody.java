// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

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
 * {@link GetServiceAccessResponseBody} extends {@link TeaModel}
 *
 * <p>GetServiceAccessResponseBody</p>
 */
public class GetServiceAccessResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ServiceAccessInfo")
    private ServiceAccessInfo serviceAccessInfo;

    private GetServiceAccessResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.serviceAccessInfo = builder.serviceAccessInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetServiceAccessResponseBody create() {
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
     * @return serviceAccessInfo
     */
    public ServiceAccessInfo getServiceAccessInfo() {
        return this.serviceAccessInfo;
    }

    public static final class Builder {
        private String requestId; 
        private ServiceAccessInfo serviceAccessInfo; 

        private Builder() {
        } 

        private Builder(GetServiceAccessResponseBody model) {
            this.requestId = model.requestId;
            this.serviceAccessInfo = model.serviceAccessInfo;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ServiceAccessInfo.
         */
        public Builder serviceAccessInfo(ServiceAccessInfo serviceAccessInfo) {
            this.serviceAccessInfo = serviceAccessInfo;
            return this;
        }

        public GetServiceAccessResponseBody build() {
            return new GetServiceAccessResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetServiceAccessResponseBody} extends {@link TeaModel}
     *
     * <p>GetServiceAccessResponseBody</p>
     */
    public static class ServiceAccessInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private ServiceAccessInfo(Builder builder) {
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServiceAccessInfo create() {
            return builder().build();
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String status; 

            private Builder() {
            } 

            private Builder(ServiceAccessInfo model) {
                this.status = model.status;
            } 

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public ServiceAccessInfo build() {
                return new ServiceAccessInfo(this);
            } 

        } 

    }
}
