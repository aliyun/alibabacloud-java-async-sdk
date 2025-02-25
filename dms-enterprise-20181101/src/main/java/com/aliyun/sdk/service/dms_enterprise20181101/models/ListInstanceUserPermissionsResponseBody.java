// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

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
 * {@link ListInstanceUserPermissionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListInstanceUserPermissionsResponseBody</p>
 */
public class ListInstanceUserPermissionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    @com.aliyun.core.annotation.NameInMap("UserPermissions")
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
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>UnknownError</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>UnknownError</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>7D162AAE-6501-5691-BF14-D7018F662895</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful. Valid values:</p>
         * <ul>
         * <li>true: The request is successful.</li>
         * <li>false: The request fails.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The total number of returned entries.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>The permissions of the user on the instance.</p>
         */
        public Builder userPermissions(UserPermissions userPermissions) {
            this.userPermissions = userPermissions;
            return this;
        }

        public ListInstanceUserPermissionsResponseBody build() {
            return new ListInstanceUserPermissionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListInstanceUserPermissionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListInstanceUserPermissionsResponseBody</p>
     */
    public static class PermDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateDate")
        private String createDate;

        @com.aliyun.core.annotation.NameInMap("ExpireDate")
        private String expireDate;

        @com.aliyun.core.annotation.NameInMap("ExtraData")
        private String extraData;

        @com.aliyun.core.annotation.NameInMap("OriginFrom")
        private String originFrom;

        @com.aliyun.core.annotation.NameInMap("PermType")
        private String permType;

        @com.aliyun.core.annotation.NameInMap("UserAccessId")
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
             * <p>The time when the permissions were granted.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-12-12 00:00:00</p>
             */
            public Builder createDate(String createDate) {
                this.createDate = createDate;
                return this;
            }

            /**
             * <p>The time when the permissions expire.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-12-12 00:00:00</p>
             */
            public Builder expireDate(String expireDate) {
                this.expireDate = expireDate;
                return this;
            }

            /**
             * <p>This parameter is reserved.</p>
             * 
             * <strong>example:</strong>
             * <p>XXX</p>
             */
            public Builder extraData(String extraData) {
                this.extraData = extraData;
                return this;
            }

            /**
             * <p>The user who grants the permissions.</p>
             * 
             * <strong>example:</strong>
             * <p>xxx authorization</p>
             */
            public Builder originFrom(String originFrom) {
                this.originFrom = originFrom;
                return this;
            }

            /**
             * <p>The type of the permissions. Valid values:</p>
             * <ul>
             * <li>LOGIN: the logon permissions</li>
             * <li>PERF: the query permissions on the instance</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>LOGIN</p>
             */
            public Builder permType(String permType) {
                this.permType = permType;
                return this;
            }

            /**
             * <p>The ID of the authorization record.</p>
             * 
             * <strong>example:</strong>
             * <p>773****</p>
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
    /**
     * 
     * {@link ListInstanceUserPermissionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListInstanceUserPermissionsResponseBody</p>
     */
    public static class PermDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PermDetail")
        private java.util.List<PermDetail> permDetail;

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
        public java.util.List<PermDetail> getPermDetail() {
            return this.permDetail;
        }

        public static final class Builder {
            private java.util.List<PermDetail> permDetail; 

            /**
             * PermDetail.
             */
            public Builder permDetail(java.util.List<PermDetail> permDetail) {
                this.permDetail = permDetail;
                return this;
            }

            public PermDetails build() {
                return new PermDetails(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListInstanceUserPermissionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListInstanceUserPermissionsResponseBody</p>
     */
    public static class UserPermission extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("PermDetails")
        private PermDetails permDetails;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("UserNickName")
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
             * <p>The ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>174****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The details of permissions.</p>
             */
            public Builder permDetails(PermDetails permDetails) {
                this.permDetails = permDetails;
                return this;
            }

            /**
             * <p>The ID of the user.</p>
             * 
             * <strong>example:</strong>
             * <p>51****</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * <p>The nickname of the user.</p>
             * 
             * <strong>example:</strong>
             * <p>test_nick_name</p>
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
    /**
     * 
     * {@link ListInstanceUserPermissionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListInstanceUserPermissionsResponseBody</p>
     */
    public static class UserPermissions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("UserPermission")
        private java.util.List<UserPermission> userPermission;

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
        public java.util.List<UserPermission> getUserPermission() {
            return this.userPermission;
        }

        public static final class Builder {
            private java.util.List<UserPermission> userPermission; 

            /**
             * UserPermission.
             */
            public Builder userPermission(java.util.List<UserPermission> userPermission) {
                this.userPermission = userPermission;
                return this;
            }

            public UserPermissions build() {
                return new UserPermissions(this);
            } 

        } 

    }
}
