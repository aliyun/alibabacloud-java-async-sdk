// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDrivesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDrivesResponseBody</p>
 */
public class DescribeDrivesResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Drives")
    private java.util.List < Drives> drives;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private DescribeDrivesResponseBody(Builder builder) {
        this.code = builder.code;
        this.drives = builder.drives;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDrivesResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return drives
     */
    public java.util.List < Drives> getDrives() {
        return this.drives;
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
        private java.util.List < Drives> drives; 
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
         * Drives.
         */
        public Builder drives(java.util.List < Drives> drives) {
            this.drives = drives;
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

        public DescribeDrivesResponseBody build() {
            return new DescribeDrivesResponseBody(this);
        } 

    } 

    public static class DesktopGroups extends TeaModel {
        @NameInMap("DesktopGroupId")
        private String desktopGroupId;

        @NameInMap("DesktopGroupName")
        private String desktopGroupName;

        private DesktopGroups(Builder builder) {
            this.desktopGroupId = builder.desktopGroupId;
            this.desktopGroupName = builder.desktopGroupName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DesktopGroups create() {
            return builder().build();
        }

        /**
         * @return desktopGroupId
         */
        public String getDesktopGroupId() {
            return this.desktopGroupId;
        }

        /**
         * @return desktopGroupName
         */
        public String getDesktopGroupName() {
            return this.desktopGroupName;
        }

        public static final class Builder {
            private String desktopGroupId; 
            private String desktopGroupName; 

            /**
             * DesktopGroupId.
             */
            public Builder desktopGroupId(String desktopGroupId) {
                this.desktopGroupId = desktopGroupId;
                return this;
            }

            /**
             * DesktopGroupName.
             */
            public Builder desktopGroupName(String desktopGroupName) {
                this.desktopGroupName = desktopGroupName;
                return this;
            }

            public DesktopGroups build() {
                return new DesktopGroups(this);
            } 

        } 

    }
    public static class Drives extends TeaModel {
        @NameInMap("AliUid")
        private Long aliUid;

        @NameInMap("Description")
        private String description;

        @NameInMap("DesktopGroupCount")
        private Integer desktopGroupCount;

        @NameInMap("DesktopGroups")
        private java.util.List < DesktopGroups> desktopGroups;

        @NameInMap("DomainId")
        private String domainId;

        @NameInMap("DriveId")
        private String driveId;

        @NameInMap("EnableProfileManagement")
        private Boolean enableProfileManagement;

        @NameInMap("ExternalDomainId")
        private String externalDomainId;

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

        private Drives(Builder builder) {
            this.aliUid = builder.aliUid;
            this.description = builder.description;
            this.desktopGroupCount = builder.desktopGroupCount;
            this.desktopGroups = builder.desktopGroups;
            this.domainId = builder.domainId;
            this.driveId = builder.driveId;
            this.enableProfileManagement = builder.enableProfileManagement;
            this.externalDomainId = builder.externalDomainId;
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

        public static Drives create() {
            return builder().build();
        }

        /**
         * @return aliUid
         */
        public Long getAliUid() {
            return this.aliUid;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return desktopGroupCount
         */
        public Integer getDesktopGroupCount() {
            return this.desktopGroupCount;
        }

        /**
         * @return desktopGroups
         */
        public java.util.List < DesktopGroups> getDesktopGroups() {
            return this.desktopGroups;
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
         * @return enableProfileManagement
         */
        public Boolean getEnableProfileManagement() {
            return this.enableProfileManagement;
        }

        /**
         * @return externalDomainId
         */
        public String getExternalDomainId() {
            return this.externalDomainId;
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
            private Long aliUid; 
            private String description; 
            private Integer desktopGroupCount; 
            private java.util.List < DesktopGroups> desktopGroups; 
            private String domainId; 
            private String driveId; 
            private Boolean enableProfileManagement; 
            private String externalDomainId; 
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
            public Builder aliUid(Long aliUid) {
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
             * DesktopGroupCount.
             */
            public Builder desktopGroupCount(Integer desktopGroupCount) {
                this.desktopGroupCount = desktopGroupCount;
                return this;
            }

            /**
             * DesktopGroups.
             */
            public Builder desktopGroups(java.util.List < DesktopGroups> desktopGroups) {
                this.desktopGroups = desktopGroups;
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
             * EnableProfileManagement.
             */
            public Builder enableProfileManagement(Boolean enableProfileManagement) {
                this.enableProfileManagement = enableProfileManagement;
                return this;
            }

            /**
             * ExternalDomainId.
             */
            public Builder externalDomainId(String externalDomainId) {
                this.externalDomainId = externalDomainId;
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

            public Drives build() {
                return new Drives(this);
            } 

        } 

    }
}
