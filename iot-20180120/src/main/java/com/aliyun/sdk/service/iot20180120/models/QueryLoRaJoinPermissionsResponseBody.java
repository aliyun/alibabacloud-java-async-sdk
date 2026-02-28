// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

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
 * {@link QueryLoRaJoinPermissionsResponseBody} extends {@link TeaModel}
 *
 * <p>QueryLoRaJoinPermissionsResponseBody</p>
 */
public class QueryLoRaJoinPermissionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("JoinPermissions")
    private JoinPermissions joinPermissions;

    @com.aliyun.core.annotation.NameInMap("ProductKey")
    private String productKey;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryLoRaJoinPermissionsResponseBody(Builder builder) {
        this.code = builder.code;
        this.errorMessage = builder.errorMessage;
        this.joinPermissions = builder.joinPermissions;
        this.productKey = builder.productKey;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryLoRaJoinPermissionsResponseBody create() {
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
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return joinPermissions
     */
    public JoinPermissions getJoinPermissions() {
        return this.joinPermissions;
    }

    /**
     * @return productKey
     */
    public String getProductKey() {
        return this.productKey;
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
        private String code; 
        private String errorMessage; 
        private JoinPermissions joinPermissions; 
        private String productKey; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(QueryLoRaJoinPermissionsResponseBody model) {
            this.code = model.code;
            this.errorMessage = model.errorMessage;
            this.joinPermissions = model.joinPermissions;
            this.productKey = model.productKey;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * JoinPermissions.
         */
        public Builder joinPermissions(JoinPermissions joinPermissions) {
            this.joinPermissions = joinPermissions;
            return this;
        }

        /**
         * ProductKey.
         */
        public Builder productKey(String productKey) {
            this.productKey = productKey;
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

        public QueryLoRaJoinPermissionsResponseBody build() {
            return new QueryLoRaJoinPermissionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryLoRaJoinPermissionsResponseBody} extends {@link TeaModel}
     *
     * <p>QueryLoRaJoinPermissionsResponseBody</p>
     */
    public static class JoinPermission extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClassMode")
        private String classMode;

        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("JoinPermissionId")
        private String joinPermissionId;

        @com.aliyun.core.annotation.NameInMap("JoinPermissionName")
        private String joinPermissionName;

        @com.aliyun.core.annotation.NameInMap("JoinPermissionType")
        private String joinPermissionType;

        @com.aliyun.core.annotation.NameInMap("OwnerAliyunPk")
        private String ownerAliyunPk;

        private JoinPermission(Builder builder) {
            this.classMode = builder.classMode;
            this.enabled = builder.enabled;
            this.joinPermissionId = builder.joinPermissionId;
            this.joinPermissionName = builder.joinPermissionName;
            this.joinPermissionType = builder.joinPermissionType;
            this.ownerAliyunPk = builder.ownerAliyunPk;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static JoinPermission create() {
            return builder().build();
        }

        /**
         * @return classMode
         */
        public String getClassMode() {
            return this.classMode;
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return joinPermissionId
         */
        public String getJoinPermissionId() {
            return this.joinPermissionId;
        }

        /**
         * @return joinPermissionName
         */
        public String getJoinPermissionName() {
            return this.joinPermissionName;
        }

        /**
         * @return joinPermissionType
         */
        public String getJoinPermissionType() {
            return this.joinPermissionType;
        }

        /**
         * @return ownerAliyunPk
         */
        public String getOwnerAliyunPk() {
            return this.ownerAliyunPk;
        }

        public static final class Builder {
            private String classMode; 
            private Boolean enabled; 
            private String joinPermissionId; 
            private String joinPermissionName; 
            private String joinPermissionType; 
            private String ownerAliyunPk; 

            private Builder() {
            } 

            private Builder(JoinPermission model) {
                this.classMode = model.classMode;
                this.enabled = model.enabled;
                this.joinPermissionId = model.joinPermissionId;
                this.joinPermissionName = model.joinPermissionName;
                this.joinPermissionType = model.joinPermissionType;
                this.ownerAliyunPk = model.ownerAliyunPk;
            } 

            /**
             * ClassMode.
             */
            public Builder classMode(String classMode) {
                this.classMode = classMode;
                return this;
            }

            /**
             * Enabled.
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * JoinPermissionId.
             */
            public Builder joinPermissionId(String joinPermissionId) {
                this.joinPermissionId = joinPermissionId;
                return this;
            }

            /**
             * JoinPermissionName.
             */
            public Builder joinPermissionName(String joinPermissionName) {
                this.joinPermissionName = joinPermissionName;
                return this;
            }

            /**
             * JoinPermissionType.
             */
            public Builder joinPermissionType(String joinPermissionType) {
                this.joinPermissionType = joinPermissionType;
                return this;
            }

            /**
             * OwnerAliyunPk.
             */
            public Builder ownerAliyunPk(String ownerAliyunPk) {
                this.ownerAliyunPk = ownerAliyunPk;
                return this;
            }

            public JoinPermission build() {
                return new JoinPermission(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryLoRaJoinPermissionsResponseBody} extends {@link TeaModel}
     *
     * <p>QueryLoRaJoinPermissionsResponseBody</p>
     */
    public static class JoinPermissions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("JoinPermission")
        private java.util.List<JoinPermission> joinPermission;

        private JoinPermissions(Builder builder) {
            this.joinPermission = builder.joinPermission;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static JoinPermissions create() {
            return builder().build();
        }

        /**
         * @return joinPermission
         */
        public java.util.List<JoinPermission> getJoinPermission() {
            return this.joinPermission;
        }

        public static final class Builder {
            private java.util.List<JoinPermission> joinPermission; 

            private Builder() {
            } 

            private Builder(JoinPermissions model) {
                this.joinPermission = model.joinPermission;
            } 

            /**
             * JoinPermission.
             */
            public Builder joinPermission(java.util.List<JoinPermission> joinPermission) {
                this.joinPermission = joinPermission;
                return this;
            }

            public JoinPermissions build() {
                return new JoinPermissions(this);
            } 

        } 

    }
}
