// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.accountcenter20241209.models;

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
 * {@link EnterpriseRoleQueryBizRoleDetailResponseBody} extends {@link TeaModel}
 *
 * <p>EnterpriseRoleQueryBizRoleDetailResponseBody</p>
 */
public class EnterpriseRoleQueryBizRoleDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BizRoleDetail")
    private BizRoleDetail bizRoleDetail;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private EnterpriseRoleQueryBizRoleDetailResponseBody(Builder builder) {
        this.bizRoleDetail = builder.bizRoleDetail;
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnterpriseRoleQueryBizRoleDetailResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizRoleDetail
     */
    public BizRoleDetail getBizRoleDetail() {
        return this.bizRoleDetail;
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private BizRoleDetail bizRoleDetail; 
        private String code; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(EnterpriseRoleQueryBizRoleDetailResponseBody model) {
            this.bizRoleDetail = model.bizRoleDetail;
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * BizRoleDetail.
         */
        public Builder bizRoleDetail(BizRoleDetail bizRoleDetail) {
            this.bizRoleDetail = bizRoleDetail;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public EnterpriseRoleQueryBizRoleDetailResponseBody build() {
            return new EnterpriseRoleQueryBizRoleDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link EnterpriseRoleQueryBizRoleDetailResponseBody} extends {@link TeaModel}
     *
     * <p>EnterpriseRoleQueryBizRoleDetailResponseBody</p>
     */
    public static class BizPermissions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BizPermissionCode")
        private String bizPermissionCode;

        @com.aliyun.core.annotation.NameInMap("BizPermissionDesc")
        private String bizPermissionDesc;

        @com.aliyun.core.annotation.NameInMap("BizPermissionName")
        private String bizPermissionName;

        private BizPermissions(Builder builder) {
            this.bizPermissionCode = builder.bizPermissionCode;
            this.bizPermissionDesc = builder.bizPermissionDesc;
            this.bizPermissionName = builder.bizPermissionName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BizPermissions create() {
            return builder().build();
        }

        /**
         * @return bizPermissionCode
         */
        public String getBizPermissionCode() {
            return this.bizPermissionCode;
        }

        /**
         * @return bizPermissionDesc
         */
        public String getBizPermissionDesc() {
            return this.bizPermissionDesc;
        }

        /**
         * @return bizPermissionName
         */
        public String getBizPermissionName() {
            return this.bizPermissionName;
        }

        public static final class Builder {
            private String bizPermissionCode; 
            private String bizPermissionDesc; 
            private String bizPermissionName; 

            private Builder() {
            } 

            private Builder(BizPermissions model) {
                this.bizPermissionCode = model.bizPermissionCode;
                this.bizPermissionDesc = model.bizPermissionDesc;
                this.bizPermissionName = model.bizPermissionName;
            } 

            /**
             * BizPermissionCode.
             */
            public Builder bizPermissionCode(String bizPermissionCode) {
                this.bizPermissionCode = bizPermissionCode;
                return this;
            }

            /**
             * BizPermissionDesc.
             */
            public Builder bizPermissionDesc(String bizPermissionDesc) {
                this.bizPermissionDesc = bizPermissionDesc;
                return this;
            }

            /**
             * BizPermissionName.
             */
            public Builder bizPermissionName(String bizPermissionName) {
                this.bizPermissionName = bizPermissionName;
                return this;
            }

            public BizPermissions build() {
                return new BizPermissions(this);
            } 

        } 

    }
    /**
     * 
     * {@link EnterpriseRoleQueryBizRoleDetailResponseBody} extends {@link TeaModel}
     *
     * <p>EnterpriseRoleQueryBizRoleDetailResponseBody</p>
     */
    public static class BizRoleDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BizPermissions")
        private java.util.List<BizPermissions> bizPermissions;

        @com.aliyun.core.annotation.NameInMap("BizRoleCode")
        private String bizRoleCode;

        @com.aliyun.core.annotation.NameInMap("BizRoleDesc")
        private String bizRoleDesc;

        @com.aliyun.core.annotation.NameInMap("BizRoleName")
        private String bizRoleName;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("SrcType")
        private String srcType;

        private BizRoleDetail(Builder builder) {
            this.bizPermissions = builder.bizPermissions;
            this.bizRoleCode = builder.bizRoleCode;
            this.bizRoleDesc = builder.bizRoleDesc;
            this.bizRoleName = builder.bizRoleName;
            this.resourceType = builder.resourceType;
            this.srcType = builder.srcType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BizRoleDetail create() {
            return builder().build();
        }

        /**
         * @return bizPermissions
         */
        public java.util.List<BizPermissions> getBizPermissions() {
            return this.bizPermissions;
        }

        /**
         * @return bizRoleCode
         */
        public String getBizRoleCode() {
            return this.bizRoleCode;
        }

        /**
         * @return bizRoleDesc
         */
        public String getBizRoleDesc() {
            return this.bizRoleDesc;
        }

        /**
         * @return bizRoleName
         */
        public String getBizRoleName() {
            return this.bizRoleName;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        /**
         * @return srcType
         */
        public String getSrcType() {
            return this.srcType;
        }

        public static final class Builder {
            private java.util.List<BizPermissions> bizPermissions; 
            private String bizRoleCode; 
            private String bizRoleDesc; 
            private String bizRoleName; 
            private String resourceType; 
            private String srcType; 

            private Builder() {
            } 

            private Builder(BizRoleDetail model) {
                this.bizPermissions = model.bizPermissions;
                this.bizRoleCode = model.bizRoleCode;
                this.bizRoleDesc = model.bizRoleDesc;
                this.bizRoleName = model.bizRoleName;
                this.resourceType = model.resourceType;
                this.srcType = model.srcType;
            } 

            /**
             * BizPermissions.
             */
            public Builder bizPermissions(java.util.List<BizPermissions> bizPermissions) {
                this.bizPermissions = bizPermissions;
                return this;
            }

            /**
             * BizRoleCode.
             */
            public Builder bizRoleCode(String bizRoleCode) {
                this.bizRoleCode = bizRoleCode;
                return this;
            }

            /**
             * BizRoleDesc.
             */
            public Builder bizRoleDesc(String bizRoleDesc) {
                this.bizRoleDesc = bizRoleDesc;
                return this;
            }

            /**
             * BizRoleName.
             */
            public Builder bizRoleName(String bizRoleName) {
                this.bizRoleName = bizRoleName;
                return this;
            }

            /**
             * ResourceType.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * SrcType.
             */
            public Builder srcType(String srcType) {
                this.srcType = srcType;
                return this;
            }

            public BizRoleDetail build() {
                return new BizRoleDetail(this);
            } 

        } 

    }
}
