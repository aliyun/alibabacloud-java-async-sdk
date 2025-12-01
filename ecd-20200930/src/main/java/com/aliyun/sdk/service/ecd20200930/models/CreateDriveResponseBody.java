// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link CreateDriveResponseBody} extends {@link TeaModel}
 *
 * <p>CreateDriveResponseBody</p>
 */
public class CreateDriveResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Drive")
    private Drive drive;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private CreateDriveResponseBody(Builder builder) {
        this.code = builder.code;
        this.drive = builder.drive;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDriveResponseBody create() {
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
     * @return drive
     */
    public Drive getDrive() {
        return this.drive;
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
        private String code; 
        private Drive drive; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(CreateDriveResponseBody model) {
            this.code = model.code;
            this.drive = model.drive;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The response code. The value 200 indicates that the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The user-level storage resource.</p>
         */
        public Builder drive(Drive drive) {
            this.drive = drive;
            return this;
        }

        /**
         * <p>The response message.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>B7AA****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public CreateDriveResponseBody build() {
            return new CreateDriveResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateDriveResponseBody} extends {@link TeaModel}
     *
     * <p>CreateDriveResponseBody</p>
     */
    public static class Drive extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliUid")
        private String aliUid;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DomainId")
        private String domainId;

        @com.aliyun.core.annotation.NameInMap("DriveId")
        private String driveId;

        @com.aliyun.core.annotation.NameInMap("ExternalDriveId")
        private String externalDriveId;

        @com.aliyun.core.annotation.NameInMap("ExternalUserId")
        private String externalUserId;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ProfileRoaming")
        private Boolean profileRoaming;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TotalSize")
        private Long totalSize;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("UsedSize")
        private Long usedSize;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private Drive(Builder builder) {
            this.aliUid = builder.aliUid;
            this.description = builder.description;
            this.domainId = builder.domainId;
            this.driveId = builder.driveId;
            this.externalDriveId = builder.externalDriveId;
            this.externalUserId = builder.externalUserId;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.name = builder.name;
            this.profileRoaming = builder.profileRoaming;
            this.status = builder.status;
            this.totalSize = builder.totalSize;
            this.type = builder.type;
            this.usedSize = builder.usedSize;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Drive create() {
            return builder().build();
        }

        /**
         * @return aliUid
         */
        public String getAliUid() {
            return this.aliUid;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return domainId
         */
        public String getDomainId() {
            return this.domainId;
        }

        /**
         * @return driveId
         */
        public String getDriveId() {
            return this.driveId;
        }

        /**
         * @return externalDriveId
         */
        public String getExternalDriveId() {
            return this.externalDriveId;
        }

        /**
         * @return externalUserId
         */
        public String getExternalUserId() {
            return this.externalUserId;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return profileRoaming
         */
        public Boolean getProfileRoaming() {
            return this.profileRoaming;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return totalSize
         */
        public Long getTotalSize() {
            return this.totalSize;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return usedSize
         */
        public Long getUsedSize() {
            return this.usedSize;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String aliUid; 
            private String description; 
            private String domainId; 
            private String driveId; 
            private String externalDriveId; 
            private String externalUserId; 
            private String gmtCreate; 
            private String gmtModified; 
            private String id; 
            private String name; 
            private Boolean profileRoaming; 
            private String status; 
            private Long totalSize; 
            private String type; 
            private Long usedSize; 
            private String userId; 

            private Builder() {
            } 

            private Builder(Drive model) {
                this.aliUid = model.aliUid;
                this.description = model.description;
                this.domainId = model.domainId;
                this.driveId = model.driveId;
                this.externalDriveId = model.externalDriveId;
                this.externalUserId = model.externalUserId;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.id = model.id;
                this.name = model.name;
                this.profileRoaming = model.profileRoaming;
                this.status = model.status;
                this.totalSize = model.totalSize;
                this.type = model.type;
                this.usedSize = model.usedSize;
                this.userId = model.userId;
            } 

            /**
             * <p>The ID of the Alibaba Cloud account.</p>
             * 
             * <strong>example:</strong>
             * <p>1202****</p>
             */
            public Builder aliUid(String aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * <p>The description of the storage resource.</p>
             * 
             * <strong>example:</strong>
             * <p>test****</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The ID of the storage resource.</p>
             * 
             * <strong>example:</strong>
             * <p>dom-aaaa****</p>
             */
            public Builder domainId(String domainId) {
                this.domainId = domainId;
                return this;
            }

            /**
             * <p>The ID of the user-level storage resource.</p>
             * 
             * <strong>example:</strong>
             * <p>dri-aaaa****</p>
             */
            public Builder driveId(String driveId) {
                this.driveId = driveId;
                return this;
            }

            /**
             * <p>The ID of the external user-level storage resource.</p>
             * <blockquote>
             * <p> A value is returned for this parameter only if ResourceType is set to PDS.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1100****</p>
             */
            public Builder externalDriveId(String externalDriveId) {
                this.externalDriveId = externalDriveId;
                return this;
            }

            /**
             * <p>The ID of the external user.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="mailto:user01@cn-hangzhou.120">user01@cn-hangzhou.120</a>****</p>
             */
            public Builder externalUserId(String externalUserId) {
                this.externalUserId = externalUserId;
                return this;
            }

            /**
             * <p>The time when the storage resource was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-07-02T08:42:26.000+00:00</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The time when the storage resource was last modified.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-07-07T02:46:04.000+00:00</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The name of the storage resource.</p>
             * 
             * <strong>example:</strong>
             * <p>test****</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <blockquote>
             * <p> This parameter is deprecated.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder profileRoaming(Boolean profileRoaming) {
                this.profileRoaming = profileRoaming;
                return this;
            }

            /**
             * <p>The status of the user-level storage resource.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>INIT: initializing</li>
             * <li>MAINTAIN: maintaining</li>
             * <li>DELETING</li>
             * <li>INVALID</li>
             * <li>NORMAL</li>
             * <li>FAIL: failed</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NORMAL</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The total amount of the user-level storage resource capacity.</p>
             * <blockquote>
             * <p> Unit: bytes.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>536870912000</p>
             */
            public Builder totalSize(Long totalSize) {
                this.totalSize = totalSize;
                return this;
            }

            /**
             * <p>The usage of the storage resource.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>DESKTOP: data disk space</li>
             * <li>USER_PROFILE: space for personal data of the user</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>USER_PROFILE</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The amount of user-level storage resource capacity used.</p>
             * <blockquote>
             * <p> Unit: bytes.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>243175936</p>
             */
            public Builder usedSize(Long usedSize) {
                this.usedSize = usedSize;
                return this;
            }

            /**
             * <p>The user ID.</p>
             * 
             * <strong>example:</strong>
             * <p>user01</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public Drive build() {
                return new Drive(this);
            } 

        } 

    }
}
