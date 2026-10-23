// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.winnexo20260512.models;

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
 * {@link CheckAppResourcePermissionsBatchResponseBody} extends {@link TeaModel}
 *
 * <p>CheckAppResourcePermissionsBatchResponseBody</p>
 */
public class CheckAppResourcePermissionsBatchResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("results")
    private java.util.List<Results> results;

    private CheckAppResourcePermissionsBatchResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.results = builder.results;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckAppResourcePermissionsBatchResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return results
     */
    public java.util.List<Results> getResults() {
        return this.results;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private java.util.List<Results> results; 

        private Builder() {
        } 

        private Builder(CheckAppResourcePermissionsBatchResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.results = model.results;
        } 

        /**
         * <p>The business status code. A value of 200 indicates success.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The error message. This field is empty if the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>The requested resource does not exist</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The results, returned in the same order as the requested items.</p>
         */
        public Builder results(java.util.List<Results> results) {
            this.results = results;
            return this;
        }

        public CheckAppResourcePermissionsBatchResponseBody build() {
            return new CheckAppResourcePermissionsBatchResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CheckAppResourcePermissionsBatchResponseBody} extends {@link TeaModel}
     *
     * <p>CheckAppResourcePermissionsBatchResponseBody</p>
     */
    public static class Results extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("allowed")
        private Boolean allowed;

        @com.aliyun.core.annotation.NameInMap("permission")
        private String permission;

        @com.aliyun.core.annotation.NameInMap("resourceKey")
        private String resourceKey;

        @com.aliyun.core.annotation.NameInMap("resourceType")
        private String resourceType;

        private Results(Builder builder) {
            this.allowed = builder.allowed;
            this.permission = builder.permission;
            this.resourceKey = builder.resourceKey;
            this.resourceType = builder.resourceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Results create() {
            return builder().build();
        }

        /**
         * @return allowed
         */
        public Boolean getAllowed() {
            return this.allowed;
        }

        /**
         * @return permission
         */
        public String getPermission() {
            return this.permission;
        }

        /**
         * @return resourceKey
         */
        public String getResourceKey() {
            return this.resourceKey;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        public static final class Builder {
            private Boolean allowed; 
            private String permission; 
            private String resourceKey; 
            private String resourceType; 

            private Builder() {
            } 

            private Builder(Results model) {
                this.allowed = model.allowed;
                this.permission = model.permission;
                this.resourceKey = model.resourceKey;
                this.resourceType = model.resourceType;
            } 

            /**
             * <p>Indicates whether the user has the permission.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder allowed(Boolean allowed) {
                this.allowed = allowed;
                return this;
            }

            /**
             * <p>The target permission.</p>
             * 
             * <strong>example:</strong>
             * <p>APP/VIEW</p>
             */
            public Builder permission(String permission) {
                this.permission = permission;
                return this;
            }

            /**
             * <p>The dot-separated resource key whose first segment is the APP application key.</p>
             * 
             * <strong>example:</strong>
             * <p>app.demo.resource_1</p>
             */
            public Builder resourceKey(String resourceKey) {
                this.resourceKey = resourceKey;
                return this;
            }

            /**
             * <p>The resource type. Set the value to APP_RESOURCE.</p>
             * 
             * <strong>example:</strong>
             * <p>APP_RESOURCE</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            public Results build() {
                return new Results(this);
            } 

        } 

    }
}
