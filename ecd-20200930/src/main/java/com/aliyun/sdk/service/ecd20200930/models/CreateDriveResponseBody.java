// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDriveResponseBody} extends {@link TeaModel}
 *
 * <p>CreateDriveResponseBody</p>
 */
public class CreateDriveResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Drive")
    private Drive drive;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
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

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Drive.
         */
        public Builder drive(Drive drive) {
            this.drive = drive;
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
         * Id of the request
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

        public CreateDriveResponseBody build() {
            return new CreateDriveResponseBody(this);
        } 

    } 

    public static class Drive extends TeaModel {
        @NameInMap("AliUid")
        private String aliUid;

        @NameInMap("Description")
        private String description;

        @NameInMap("DomainId")
        private String domainId;

        @NameInMap("DriveId")
        private String driveId;

        @NameInMap("ExternalDriveId")
        private String externalDriveId;

        @NameInMap("ExternalUserId")
        private String externalUserId;

        @NameInMap("GmtCreate")
        private String gmtCreate;

        @NameInMap("GmtModified")
        private String gmtModified;

        @NameInMap("Id")
        private String id;

        @NameInMap("Name")
        private String name;

        @NameInMap("ProfileRoaming")
        private Boolean profileRoaming;

        @NameInMap("Status")
        private String status;

        @NameInMap("TotalSize")
        private Long totalSize;

        @NameInMap("Type")
        private String type;

        @NameInMap("UsedSize")
        private Long usedSize;

        @NameInMap("UserId")
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

            /**
             * AliUid.
             */
            public Builder aliUid(String aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * DomainId.
             */
            public Builder domainId(String domainId) {
                this.domainId = domainId;
                return this;
            }

            /**
             * DriveId.
             */
            public Builder driveId(String driveId) {
                this.driveId = driveId;
                return this;
            }

            /**
             * ExternalDriveId.
             */
            public Builder externalDriveId(String externalDriveId) {
                this.externalDriveId = externalDriveId;
                return this;
            }

            /**
             * ExternalUserId.
             */
            public Builder externalUserId(String externalUserId) {
                this.externalUserId = externalUserId;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * ProfileRoaming.
             */
            public Builder profileRoaming(Boolean profileRoaming) {
                this.profileRoaming = profileRoaming;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * TotalSize.
             */
            public Builder totalSize(Long totalSize) {
                this.totalSize = totalSize;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * UsedSize.
             */
            public Builder usedSize(Long usedSize) {
                this.usedSize = usedSize;
                return this;
            }

            /**
             * UserId.
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
