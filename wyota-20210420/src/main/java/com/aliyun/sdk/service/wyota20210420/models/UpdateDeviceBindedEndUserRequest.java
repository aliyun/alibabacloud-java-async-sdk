// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wyota20210420.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateDeviceBindedEndUserRequest} extends {@link RequestModel}
 *
 * <p>UpdateDeviceBindedEndUserRequest</p>
 */
public class UpdateDeviceBindedEndUserRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SerialNo")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serialNo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SourceAdEndUsers")
    private java.util.List < SourceAdEndUsers> sourceAdEndUsers;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SourceEndUserIds")
    private String sourceEndUserIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TargetAdEndUsers")
    private java.util.List < TargetAdEndUsers> targetAdEndUsers;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TargetEndUserIds")
    private String targetEndUserIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserType")
    private String userType;

    private UpdateDeviceBindedEndUserRequest(Builder builder) {
        super(builder);
        this.serialNo = builder.serialNo;
        this.sourceAdEndUsers = builder.sourceAdEndUsers;
        this.sourceEndUserIds = builder.sourceEndUserIds;
        this.targetAdEndUsers = builder.targetAdEndUsers;
        this.targetEndUserIds = builder.targetEndUserIds;
        this.userType = builder.userType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDeviceBindedEndUserRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return serialNo
     */
    public String getSerialNo() {
        return this.serialNo;
    }

    /**
     * @return sourceAdEndUsers
     */
    public java.util.List < SourceAdEndUsers> getSourceAdEndUsers() {
        return this.sourceAdEndUsers;
    }

    /**
     * @return sourceEndUserIds
     */
    public String getSourceEndUserIds() {
        return this.sourceEndUserIds;
    }

    /**
     * @return targetAdEndUsers
     */
    public java.util.List < TargetAdEndUsers> getTargetAdEndUsers() {
        return this.targetAdEndUsers;
    }

    /**
     * @return targetEndUserIds
     */
    public String getTargetEndUserIds() {
        return this.targetEndUserIds;
    }

    /**
     * @return userType
     */
    public String getUserType() {
        return this.userType;
    }

    public static final class Builder extends Request.Builder<UpdateDeviceBindedEndUserRequest, Builder> {
        private String serialNo; 
        private java.util.List < SourceAdEndUsers> sourceAdEndUsers; 
        private String sourceEndUserIds; 
        private java.util.List < TargetAdEndUsers> targetAdEndUsers; 
        private String targetEndUserIds; 
        private String userType; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDeviceBindedEndUserRequest request) {
            super(request);
            this.serialNo = request.serialNo;
            this.sourceAdEndUsers = request.sourceAdEndUsers;
            this.sourceEndUserIds = request.sourceEndUserIds;
            this.targetAdEndUsers = request.targetAdEndUsers;
            this.targetEndUserIds = request.targetEndUserIds;
            this.userType = request.userType;
        } 

        /**
         * SerialNo.
         */
        public Builder serialNo(String serialNo) {
            this.putBodyParameter("SerialNo", serialNo);
            this.serialNo = serialNo;
            return this;
        }

        /**
         * SourceAdEndUsers.
         */
        public Builder sourceAdEndUsers(java.util.List < SourceAdEndUsers> sourceAdEndUsers) {
            this.putBodyParameter("SourceAdEndUsers", sourceAdEndUsers);
            this.sourceAdEndUsers = sourceAdEndUsers;
            return this;
        }

        /**
         * SourceEndUserIds.
         */
        public Builder sourceEndUserIds(String sourceEndUserIds) {
            this.putBodyParameter("SourceEndUserIds", sourceEndUserIds);
            this.sourceEndUserIds = sourceEndUserIds;
            return this;
        }

        /**
         * TargetAdEndUsers.
         */
        public Builder targetAdEndUsers(java.util.List < TargetAdEndUsers> targetAdEndUsers) {
            this.putBodyParameter("TargetAdEndUsers", targetAdEndUsers);
            this.targetAdEndUsers = targetAdEndUsers;
            return this;
        }

        /**
         * TargetEndUserIds.
         */
        public Builder targetEndUserIds(String targetEndUserIds) {
            this.putBodyParameter("TargetEndUserIds", targetEndUserIds);
            this.targetEndUserIds = targetEndUserIds;
            return this;
        }

        /**
         * UserType.
         */
        public Builder userType(String userType) {
            this.putBodyParameter("UserType", userType);
            this.userType = userType;
            return this;
        }

        @Override
        public UpdateDeviceBindedEndUserRequest build() {
            return new UpdateDeviceBindedEndUserRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateDeviceBindedEndUserRequest} extends {@link TeaModel}
     *
     * <p>UpdateDeviceBindedEndUserRequest</p>
     */
    public static class SourceAdEndUsers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AdDomain")
        private String adDomain;

        @com.aliyun.core.annotation.NameInMap("DirectoryId")
        private String directoryId;

        @com.aliyun.core.annotation.NameInMap("EndUserId")
        private String endUserId;

        private SourceAdEndUsers(Builder builder) {
            this.adDomain = builder.adDomain;
            this.directoryId = builder.directoryId;
            this.endUserId = builder.endUserId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SourceAdEndUsers create() {
            return builder().build();
        }

        /**
         * @return adDomain
         */
        public String getAdDomain() {
            return this.adDomain;
        }

        /**
         * @return directoryId
         */
        public String getDirectoryId() {
            return this.directoryId;
        }

        /**
         * @return endUserId
         */
        public String getEndUserId() {
            return this.endUserId;
        }

        public static final class Builder {
            private String adDomain; 
            private String directoryId; 
            private String endUserId; 

            /**
             * AdDomain.
             */
            public Builder adDomain(String adDomain) {
                this.adDomain = adDomain;
                return this;
            }

            /**
             * DirectoryId.
             */
            public Builder directoryId(String directoryId) {
                this.directoryId = directoryId;
                return this;
            }

            /**
             * EndUserId.
             */
            public Builder endUserId(String endUserId) {
                this.endUserId = endUserId;
                return this;
            }

            public SourceAdEndUsers build() {
                return new SourceAdEndUsers(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateDeviceBindedEndUserRequest} extends {@link TeaModel}
     *
     * <p>UpdateDeviceBindedEndUserRequest</p>
     */
    public static class TargetAdEndUsers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AdDomain")
        private String adDomain;

        @com.aliyun.core.annotation.NameInMap("DirectoryId")
        private String directoryId;

        @com.aliyun.core.annotation.NameInMap("EndUserId")
        private String endUserId;

        private TargetAdEndUsers(Builder builder) {
            this.adDomain = builder.adDomain;
            this.directoryId = builder.directoryId;
            this.endUserId = builder.endUserId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TargetAdEndUsers create() {
            return builder().build();
        }

        /**
         * @return adDomain
         */
        public String getAdDomain() {
            return this.adDomain;
        }

        /**
         * @return directoryId
         */
        public String getDirectoryId() {
            return this.directoryId;
        }

        /**
         * @return endUserId
         */
        public String getEndUserId() {
            return this.endUserId;
        }

        public static final class Builder {
            private String adDomain; 
            private String directoryId; 
            private String endUserId; 

            /**
             * AdDomain.
             */
            public Builder adDomain(String adDomain) {
                this.adDomain = adDomain;
                return this;
            }

            /**
             * DirectoryId.
             */
            public Builder directoryId(String directoryId) {
                this.directoryId = directoryId;
                return this;
            }

            /**
             * EndUserId.
             */
            public Builder endUserId(String endUserId) {
                this.endUserId = endUserId;
                return this;
            }

            public TargetAdEndUsers build() {
                return new TargetAdEndUsers(this);
            } 

        } 

    }
}
