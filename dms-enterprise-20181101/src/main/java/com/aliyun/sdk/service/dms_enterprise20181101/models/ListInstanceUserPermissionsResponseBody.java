// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListInstanceUserPermissionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListInstanceUserPermissionsResponseBody</p>
 */
public class ListInstanceUserPermissionsResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TotalCount")
    private Long totalCount;

    @NameInMap("UserPermissions")
    private UserPermissions userPermissions;

    private ListInstanceUserPermissionsResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
        this.userPermissions = builder.userPermissions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInstanceUserPermissionsResponseBody create() {
        return builder().build();
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
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

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return userPermissions
     */
    public UserPermissions getUserPermissions() {
        return this.userPermissions;
    }

    public static final class Builder {
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 
        private Long totalCount; 
        private UserPermissions userPermissions; 

        /**
         * The error code.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The error message.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
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
         * Indicates whether the request is successful. Valid values:
         * <p>
         * 
         * - true: The request is successful.
         * - false: The request fails.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * The total number of returned entries.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * The permissions of the user on the instance.
         */
        public Builder userPermissions(UserPermissions userPermissions) {
            this.userPermissions = userPermissions;
            return this;
        }

        public ListInstanceUserPermissionsResponseBody build() {
            return new ListInstanceUserPermissionsResponseBody(this);
        } 

    } 

    public static class PermDetail extends TeaModel {
        @NameInMap("CreateDate")
        private String createDate;

        @NameInMap("ExpireDate")
        private String expireDate;

        @NameInMap("ExtraData")
        private String extraData;

        @NameInMap("OriginFrom")
        private String originFrom;

        @NameInMap("PermType")
        private String permType;

        @NameInMap("UserAccessId")
        private String userAccessId;

        private PermDetail(Builder builder) {
            this.createDate = builder.createDate;
            this.expireDate = builder.expireDate;
            this.extraData = builder.extraData;
            this.originFrom = builder.originFrom;
            this.permType = builder.permType;
            this.userAccessId = builder.userAccessId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PermDetail create() {
            return builder().build();
        }

        /**
         * @return createDate
         */
        public String getCreateDate() {
            return this.createDate;
        }

        /**
         * @return expireDate
         */
        public String getExpireDate() {
            return this.expireDate;
        }

        /**
         * @return extraData
         */
        public String getExtraData() {
            return this.extraData;
        }

        /**
         * @return originFrom
         */
        public String getOriginFrom() {
            return this.originFrom;
        }

        /**
         * @return permType
         */
        public String getPermType() {
            return this.permType;
        }

        /**
         * @return userAccessId
         */
        public String getUserAccessId() {
            return this.userAccessId;
        }

        public static final class Builder {
            private String createDate; 
            private String expireDate; 
            private String extraData; 
            private String originFrom; 
            private String permType; 
            private String userAccessId; 

            /**
             * The time when the permissions were granted.
             */
            public Builder createDate(String createDate) {
                this.createDate = createDate;
                return this;
            }

            /**
             * The time when the permissions expire.
             */
            public Builder expireDate(String expireDate) {
                this.expireDate = expireDate;
                return this;
            }

            /**
             * This parameter is reserved.
             */
            public Builder extraData(String extraData) {
                this.extraData = extraData;
                return this;
            }

            /**
             * The user who grants the permissions.
             */
            public Builder originFrom(String originFrom) {
                this.originFrom = originFrom;
                return this;
            }

            /**
             * The type of the permissions. Valid values:
             * <p>
             * 
             * *   LOGIN: the logon permissions
             * *   PERF: the query permissions on the instance
             */
            public Builder permType(String permType) {
                this.permType = permType;
                return this;
            }

            /**
             * The ID of the authorization record.
             */
            public Builder userAccessId(String userAccessId) {
                this.userAccessId = userAccessId;
                return this;
            }

            public PermDetail build() {
                return new PermDetail(this);
            } 

        } 

    }
    public static class PermDetails extends TeaModel {
        @NameInMap("PermDetail")
        private java.util.List < PermDetail> permDetail;

        private PermDetails(Builder builder) {
            this.permDetail = builder.permDetail;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PermDetails create() {
            return builder().build();
        }

        /**
         * @return permDetail
         */
        public java.util.List < PermDetail> getPermDetail() {
            return this.permDetail;
        }

        public static final class Builder {
            private java.util.List < PermDetail> permDetail; 

            /**
             * PermDetail.
             */
            public Builder permDetail(java.util.List < PermDetail> permDetail) {
                this.permDetail = permDetail;
                return this;
            }

            public PermDetails build() {
                return new PermDetails(this);
            } 

        } 

    }
    public static class UserPermission extends TeaModel {
        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("PermDetails")
        private PermDetails permDetails;

        @NameInMap("UserId")
        private String userId;

        @NameInMap("UserNickName")
        private String userNickName;

        private UserPermission(Builder builder) {
            this.instanceId = builder.instanceId;
            this.permDetails = builder.permDetails;
            this.userId = builder.userId;
            this.userNickName = builder.userNickName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserPermission create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return permDetails
         */
        public PermDetails getPermDetails() {
            return this.permDetails;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return userNickName
         */
        public String getUserNickName() {
            return this.userNickName;
        }

        public static final class Builder {
            private String instanceId; 
            private PermDetails permDetails; 
            private String userId; 
            private String userNickName; 

            /**
             * The ID of the instance.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The details of permissions.
             */
            public Builder permDetails(PermDetails permDetails) {
                this.permDetails = permDetails;
                return this;
            }

            /**
             * The ID of the user.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * The nickname of the user.
             */
            public Builder userNickName(String userNickName) {
                this.userNickName = userNickName;
                return this;
            }

            public UserPermission build() {
                return new UserPermission(this);
            } 

        } 

    }
    public static class UserPermissions extends TeaModel {
        @NameInMap("UserPermission")
        private java.util.List < UserPermission> userPermission;

        private UserPermissions(Builder builder) {
            this.userPermission = builder.userPermission;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserPermissions create() {
            return builder().build();
        }

        /**
         * @return userPermission
         */
        public java.util.List < UserPermission> getUserPermission() {
            return this.userPermission;
        }

        public static final class Builder {
            private java.util.List < UserPermission> userPermission; 

            /**
             * UserPermission.
             */
            public Builder userPermission(java.util.List < UserPermission> userPermission) {
                this.userPermission = userPermission;
                return this;
            }

            public UserPermissions build() {
                return new UserPermissions(this);
            } 

        } 

    }
}
