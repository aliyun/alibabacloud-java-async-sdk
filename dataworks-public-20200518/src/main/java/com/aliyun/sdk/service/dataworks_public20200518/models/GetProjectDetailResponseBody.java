// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetProjectDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetProjectDetailResponseBody</p>
 */
public class GetProjectDetailResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GetProjectDetailResponseBody(Builder builder) {
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetProjectDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
        private Data data; 
        private Integer httpStatusCode; 
        private String requestId; 
        private Boolean success; 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
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

        public GetProjectDetailResponseBody build() {
            return new GetProjectDetailResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("DefaultDiResourceGroupIdentifier")
        private String defaultDiResourceGroupIdentifier;

        @NameInMap("DevelopmentType")
        private Integer developmentType;

        @NameInMap("EnvTypes")
        private java.util.List < String > envTypes;

        @NameInMap("GmtCreate")
        private String gmtCreate;

        @NameInMap("GmtModified")
        private String gmtModified;

        @NameInMap("IsAllowDownload")
        private Integer isAllowDownload;

        @NameInMap("ProjectDescription")
        private String projectDescription;

        @NameInMap("ProjectId")
        private Integer projectId;

        @NameInMap("ProjectIdentifier")
        private String projectIdentifier;

        @NameInMap("ProjectMode")
        private Integer projectMode;

        @NameInMap("ProjectName")
        private String projectName;

        @NameInMap("ProjectOwnerBaseId")
        private String projectOwnerBaseId;

        @NameInMap("ProtectedMode")
        private Integer protectedMode;

        @NameInMap("ResidentArea")
        private String residentArea;

        @NameInMap("SchedulerMaxRetryTimes")
        private Integer schedulerMaxRetryTimes;

        @NameInMap("SchedulerRetryInterval")
        private Integer schedulerRetryInterval;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("TenantId")
        private Long tenantId;

        private Data(Builder builder) {
            this.defaultDiResourceGroupIdentifier = builder.defaultDiResourceGroupIdentifier;
            this.developmentType = builder.developmentType;
            this.envTypes = builder.envTypes;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.isAllowDownload = builder.isAllowDownload;
            this.projectDescription = builder.projectDescription;
            this.projectId = builder.projectId;
            this.projectIdentifier = builder.projectIdentifier;
            this.projectMode = builder.projectMode;
            this.projectName = builder.projectName;
            this.projectOwnerBaseId = builder.projectOwnerBaseId;
            this.protectedMode = builder.protectedMode;
            this.residentArea = builder.residentArea;
            this.schedulerMaxRetryTimes = builder.schedulerMaxRetryTimes;
            this.schedulerRetryInterval = builder.schedulerRetryInterval;
            this.status = builder.status;
            this.tenantId = builder.tenantId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return defaultDiResourceGroupIdentifier
         */
        public String getDefaultDiResourceGroupIdentifier() {
            return this.defaultDiResourceGroupIdentifier;
        }

        /**
         * @return developmentType
         */
        public Integer getDevelopmentType() {
            return this.developmentType;
        }

        /**
         * @return envTypes
         */
        public java.util.List < String > getEnvTypes() {
            return this.envTypes;
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
         * @return isAllowDownload
         */
        public Integer getIsAllowDownload() {
            return this.isAllowDownload;
        }

        /**
         * @return projectDescription
         */
        public String getProjectDescription() {
            return this.projectDescription;
        }

        /**
         * @return projectId
         */
        public Integer getProjectId() {
            return this.projectId;
        }

        /**
         * @return projectIdentifier
         */
        public String getProjectIdentifier() {
            return this.projectIdentifier;
        }

        /**
         * @return projectMode
         */
        public Integer getProjectMode() {
            return this.projectMode;
        }

        /**
         * @return projectName
         */
        public String getProjectName() {
            return this.projectName;
        }

        /**
         * @return projectOwnerBaseId
         */
        public String getProjectOwnerBaseId() {
            return this.projectOwnerBaseId;
        }

        /**
         * @return protectedMode
         */
        public Integer getProtectedMode() {
            return this.protectedMode;
        }

        /**
         * @return residentArea
         */
        public String getResidentArea() {
            return this.residentArea;
        }

        /**
         * @return schedulerMaxRetryTimes
         */
        public Integer getSchedulerMaxRetryTimes() {
            return this.schedulerMaxRetryTimes;
        }

        /**
         * @return schedulerRetryInterval
         */
        public Integer getSchedulerRetryInterval() {
            return this.schedulerRetryInterval;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return tenantId
         */
        public Long getTenantId() {
            return this.tenantId;
        }

        public static final class Builder {
            private String defaultDiResourceGroupIdentifier; 
            private Integer developmentType; 
            private java.util.List < String > envTypes; 
            private String gmtCreate; 
            private String gmtModified; 
            private Integer isAllowDownload; 
            private String projectDescription; 
            private Integer projectId; 
            private String projectIdentifier; 
            private Integer projectMode; 
            private String projectName; 
            private String projectOwnerBaseId; 
            private Integer protectedMode; 
            private String residentArea; 
            private Integer schedulerMaxRetryTimes; 
            private Integer schedulerRetryInterval; 
            private Integer status; 
            private Long tenantId; 

            /**
             * DefaultDiResourceGroupIdentifier.
             */
            public Builder defaultDiResourceGroupIdentifier(String defaultDiResourceGroupIdentifier) {
                this.defaultDiResourceGroupIdentifier = defaultDiResourceGroupIdentifier;
                return this;
            }

            /**
             * DevelopmentType.
             */
            public Builder developmentType(Integer developmentType) {
                this.developmentType = developmentType;
                return this;
            }

            /**
             * EnvTypes.
             */
            public Builder envTypes(java.util.List < String > envTypes) {
                this.envTypes = envTypes;
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
             * IsAllowDownload.
             */
            public Builder isAllowDownload(Integer isAllowDownload) {
                this.isAllowDownload = isAllowDownload;
                return this;
            }

            /**
             * ProjectDescription.
             */
            public Builder projectDescription(String projectDescription) {
                this.projectDescription = projectDescription;
                return this;
            }

            /**
             * ProjectId.
             */
            public Builder projectId(Integer projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * ProjectIdentifier.
             */
            public Builder projectIdentifier(String projectIdentifier) {
                this.projectIdentifier = projectIdentifier;
                return this;
            }

            /**
             * ProjectMode.
             */
            public Builder projectMode(Integer projectMode) {
                this.projectMode = projectMode;
                return this;
            }

            /**
             * ProjectName.
             */
            public Builder projectName(String projectName) {
                this.projectName = projectName;
                return this;
            }

            /**
             * ProjectOwnerBaseId.
             */
            public Builder projectOwnerBaseId(String projectOwnerBaseId) {
                this.projectOwnerBaseId = projectOwnerBaseId;
                return this;
            }

            /**
             * ProtectedMode.
             */
            public Builder protectedMode(Integer protectedMode) {
                this.protectedMode = protectedMode;
                return this;
            }

            /**
             * ResidentArea.
             */
            public Builder residentArea(String residentArea) {
                this.residentArea = residentArea;
                return this;
            }

            /**
             * SchedulerMaxRetryTimes.
             */
            public Builder schedulerMaxRetryTimes(Integer schedulerMaxRetryTimes) {
                this.schedulerMaxRetryTimes = schedulerMaxRetryTimes;
                return this;
            }

            /**
             * SchedulerRetryInterval.
             */
            public Builder schedulerRetryInterval(Integer schedulerRetryInterval) {
                this.schedulerRetryInterval = schedulerRetryInterval;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * TenantId.
             */
            public Builder tenantId(Long tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
