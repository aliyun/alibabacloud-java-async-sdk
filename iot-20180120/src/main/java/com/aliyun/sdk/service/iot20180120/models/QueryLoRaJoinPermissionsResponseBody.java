// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryLoRaJoinPermissionsResponseBody} extends {@link TeaModel}
 *
 * <p>QueryLoRaJoinPermissionsResponseBody</p>
 */
public class QueryLoRaJoinPermissionsResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("JoinPermissions")
    private JoinPermissions joinPermissions;

    @NameInMap("ProductKey")
    private String productKey;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
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

    public static class JoinPermission extends TeaModel {
        @NameInMap("ClassMode")
        private String classMode;

        @NameInMap("Enabled")
        private Boolean enabled;

        @NameInMap("JoinPermissionId")
        private String joinPermissionId;

        @NameInMap("JoinPermissionName")
        private String joinPermissionName;

        @NameInMap("JoinPermissionType")
        private String joinPermissionType;

        @NameInMap("OwnerAliyunPk")
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
    public static class JoinPermissions extends TeaModel {
        @NameInMap("JoinPermission")
        private java.util.List < JoinPermission> joinPermission;

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
        public java.util.List < JoinPermission> getJoinPermission() {
            return this.joinPermission;
        }

        public static final class Builder {
            private java.util.List < JoinPermission> joinPermission; 

            /**
             * JoinPermission.
             */
            public Builder joinPermission(java.util.List < JoinPermission> joinPermission) {
                this.joinPermission = joinPermission;
                return this;
            }

            public JoinPermissions build() {
                return new JoinPermissions(this);
            } 

        } 

    }
}
