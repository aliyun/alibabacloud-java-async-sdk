// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link MoveResourcesResponseBody} extends {@link TeaModel}
 *
 * <p>MoveResourcesResponseBody</p>
 */
public class MoveResourcesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Responses")
    private java.util.List < Responses> responses;

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
    public java.util.List < Responses> getResponses() {
        return this.responses;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < Responses> responses; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The returned results.
         */
        public Builder responses(java.util.List < Responses> responses) {
            this.responses = responses;
            return this;
        }

        public MoveResourcesResponseBody build() {
            return new MoveResourcesResponseBody(this);
        } 

    } 

    public static class Responses extends TeaModel {
        @NameInMap("ErrorCode")
        private String errorCode;

        @NameInMap("ErrorMsg")
        private String errorMsg;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("RequestId")
        private String requestId;

        @NameInMap("ResourceId")
        private String resourceId;

        @NameInMap("ResourceType")
        private String resourceType;

        @NameInMap("Service")
        private String service;

        @NameInMap("Status")
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
             * The error code returned.
             * <p>
             * 
             * >  This parameter is returned if the resource failed to be moved.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * The error message returned.
             * <p>
             * 
             * >  This parameter is returned if the resource failed to be moved.
             */
            public Builder errorMsg(String errorMsg) {
                this.errorMsg = errorMsg;
                return this;
            }

            /**
             * The region ID of the resource.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The ID of the request.
             */
            public Builder requestId(String requestId) {
                this.requestId = requestId;
                return this;
            }

            /**
             * The ID of the resource.
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * The type of the resource.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * The ID of the Alibaba Cloud service.
             */
            public Builder service(String service) {
                this.service = service;
                return this;
            }

            /**
             * The status of the move task. Valid values:
             * <p>
             * 
             * *   SUCCESS
             * *   FAIL
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
