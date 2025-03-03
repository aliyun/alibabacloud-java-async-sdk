// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

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
 * {@link MoveResourcesResponseBody} extends {@link TeaModel}
 *
 * <p>MoveResourcesResponseBody</p>
 */
public class MoveResourcesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Responses")
    private java.util.List<Responses> responses;

    private MoveResourcesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.responses = builder.responses;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MoveResourcesResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return responses
     */
    public java.util.List<Responses> getResponses() {
        return this.responses;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<Responses> responses; 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>C00B89D3-3247-11DE-95D8-A7C01FB0AB4F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The returned results.</p>
         */
        public Builder responses(java.util.List<Responses> responses) {
            this.responses = responses;
            return this;
        }

        public MoveResourcesResponseBody build() {
            return new MoveResourcesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link MoveResourcesResponseBody} extends {@link TeaModel}
     *
     * <p>MoveResourcesResponseBody</p>
     */
    public static class Responses extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("ErrorMsg")
        private String errorMsg;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("RequestId")
        private String requestId;

        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("Service")
        private String service;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Responses(Builder builder) {
            this.errorCode = builder.errorCode;
            this.errorMsg = builder.errorMsg;
            this.regionId = builder.regionId;
            this.requestId = builder.requestId;
            this.resourceId = builder.resourceId;
            this.resourceType = builder.resourceType;
            this.service = builder.service;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Responses create() {
            return builder().build();
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return errorMsg
         */
        public String getErrorMsg() {
            return this.errorMsg;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return requestId
         */
        public String getRequestId() {
            return this.requestId;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        /**
         * @return service
         */
        public String getService() {
            return this.service;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String errorCode; 
            private String errorMsg; 
            private String regionId; 
            private String requestId; 
            private String resourceId; 
            private String resourceType; 
            private String service; 
            private String status; 

            /**
             * <p>The error code returned.</p>
             * <blockquote>
             * <p> This parameter is returned if the resource failed to be moved.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>NoPermission</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>The error message returned.</p>
             * <blockquote>
             * <p> This parameter is returned if the resource failed to be moved.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>No permissions</p>
             */
            public Builder errorMsg(String errorMsg) {
                this.errorMsg = errorMsg;
                return this;
            }

            /**
             * <p>The region ID of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The ID of the request.</p>
             * 
             * <strong>example:</strong>
             * <p>C00B89D3-3247-11DE-95D8-A7C01FB0AB4F</p>
             */
            public Builder requestId(String requestId) {
                this.requestId = requestId;
                return this;
            }

            /**
             * <p>The ID of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-bp1sig0mjktx5ewx1****</p>
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * <p>The type of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud service.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc</p>
             */
            public Builder service(String service) {
                this.service = service;
                return this;
            }

            /**
             * <p>The status of the move task. Valid values:</p>
             * <ul>
             * <li>SUCCESS</li>
             * <li>FAIL</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>FAIL</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Responses build() {
                return new Responses(this);
            } 

        } 

    }
}
