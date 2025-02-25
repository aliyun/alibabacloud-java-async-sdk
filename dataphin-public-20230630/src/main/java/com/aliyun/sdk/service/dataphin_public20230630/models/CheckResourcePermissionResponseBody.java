// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

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
 * {@link CheckResourcePermissionResponseBody} extends {@link TeaModel}
 *
 * <p>CheckResourcePermissionResponseBody</p>
 */
public class CheckResourcePermissionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourcePermissionList")
    private java.util.List<ResourcePermissionList> resourcePermissionList;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private CheckResourcePermissionResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.resourcePermissionList = builder.resourcePermissionList;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckResourcePermissionResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
     * @return resourcePermissionList
     */
    public java.util.List<ResourcePermissionList> getResourcePermissionList() {
        return this.resourcePermissionList;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private java.util.List<ResourcePermissionList> resourcePermissionList; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ResourcePermissionList.
         */
        public Builder resourcePermissionList(java.util.List<ResourcePermissionList> resourcePermissionList) {
            this.resourcePermissionList = resourcePermissionList;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public CheckResourcePermissionResponseBody build() {
            return new CheckResourcePermissionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CheckResourcePermissionResponseBody} extends {@link TeaModel}
     *
     * <p>CheckResourcePermissionResponseBody</p>
     */
    public static class ResourcePermissionList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HasPermission")
        private Boolean hasPermission;

        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        private ResourcePermissionList(Builder builder) {
            this.hasPermission = builder.hasPermission;
            this.resourceId = builder.resourceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourcePermissionList create() {
            return builder().build();
        }

        /**
         * @return hasPermission
         */
        public Boolean getHasPermission() {
            return this.hasPermission;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        public static final class Builder {
            private Boolean hasPermission; 
            private String resourceId; 

            /**
             * HasPermission.
             */
            public Builder hasPermission(Boolean hasPermission) {
                this.hasPermission = hasPermission;
                return this;
            }

            /**
             * ResourceId.
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            public ResourcePermissionList build() {
                return new ResourcePermissionList(this);
            } 

        } 

    }
}
