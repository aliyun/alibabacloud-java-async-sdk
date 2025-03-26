// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aicontent20240611.models;

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
 * {@link CreateProjectResponseBody} extends {@link TeaModel}
 *
 * <p>CreateProjectResponseBody</p>
 */
public class CreateProjectResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("errCode")
    private String errCode;

    @com.aliyun.core.annotation.NameInMap("errMessage")
    private String errMessage;

    @com.aliyun.core.annotation.NameInMap("httpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private CreateProjectResponseBody(Builder builder) {
        this.data = builder.data;
        this.errCode = builder.errCode;
        this.errMessage = builder.errMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateProjectResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errCode
     */
    public String getErrCode() {
        return this.errCode;
    }

    /**
     * @return errMessage
     */
    public String getErrMessage() {
        return this.errMessage;
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
        private String errCode; 
        private String errMessage; 
        private Integer httpStatusCode; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(CreateProjectResponseBody model) {
            this.data = model.data;
            this.errCode = model.errCode;
            this.errMessage = model.errMessage;
            this.httpStatusCode = model.httpStatusCode;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * errCode.
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * errMessage.
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * httpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public CreateProjectResponseBody build() {
            return new CreateProjectResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateProjectResponseBody} extends {@link TeaModel}
     *
     * <p>CreateProjectResponseBody</p>
     */
    public static class ApplicationAccessIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("applicationAccessId")
        private String applicationAccessId;

        @com.aliyun.core.annotation.NameInMap("applicationAccessSecret")
        private String applicationAccessSecret;

        private ApplicationAccessIds(Builder builder) {
            this.applicationAccessId = builder.applicationAccessId;
            this.applicationAccessSecret = builder.applicationAccessSecret;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApplicationAccessIds create() {
            return builder().build();
        }

        /**
         * @return applicationAccessId
         */
        public String getApplicationAccessId() {
            return this.applicationAccessId;
        }

        /**
         * @return applicationAccessSecret
         */
        public String getApplicationAccessSecret() {
            return this.applicationAccessSecret;
        }

        public static final class Builder {
            private String applicationAccessId; 
            private String applicationAccessSecret; 

            private Builder() {
            } 

            private Builder(ApplicationAccessIds model) {
                this.applicationAccessId = model.applicationAccessId;
                this.applicationAccessSecret = model.applicationAccessSecret;
            } 

            /**
             * applicationAccessId.
             */
            public Builder applicationAccessId(String applicationAccessId) {
                this.applicationAccessId = applicationAccessId;
                return this;
            }

            /**
             * applicationAccessSecret.
             */
            public Builder applicationAccessSecret(String applicationAccessSecret) {
                this.applicationAccessSecret = applicationAccessSecret;
                return this;
            }

            public ApplicationAccessIds build() {
                return new ApplicationAccessIds(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateProjectResponseBody} extends {@link TeaModel}
     *
     * <p>CreateProjectResponseBody</p>
     */
    public static class ProjectApps extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApplicationAccessIds")
        private java.util.List<ApplicationAccessIds> applicationAccessIds;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private String projectId;

        private ProjectApps(Builder builder) {
            this.applicationAccessIds = builder.applicationAccessIds;
            this.id = builder.id;
            this.projectId = builder.projectId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProjectApps create() {
            return builder().build();
        }

        /**
         * @return applicationAccessIds
         */
        public java.util.List<ApplicationAccessIds> getApplicationAccessIds() {
            return this.applicationAccessIds;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return projectId
         */
        public String getProjectId() {
            return this.projectId;
        }

        public static final class Builder {
            private java.util.List<ApplicationAccessIds> applicationAccessIds; 
            private String id; 
            private String projectId; 

            private Builder() {
            } 

            private Builder(ProjectApps model) {
                this.applicationAccessIds = model.applicationAccessIds;
                this.id = model.id;
                this.projectId = model.projectId;
            } 

            /**
             * ApplicationAccessIds.
             */
            public Builder applicationAccessIds(java.util.List<ApplicationAccessIds> applicationAccessIds) {
                this.applicationAccessIds = applicationAccessIds;
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
             * ProjectId.
             */
            public Builder projectId(String projectId) {
                this.projectId = projectId;
                return this;
            }

            public ProjectApps build() {
                return new ProjectApps(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateProjectResponseBody} extends {@link TeaModel}
     *
     * <p>CreateProjectResponseBody</p>
     */
    public static class ProjectSDK extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DemoUrl")
        private String demoUrl;

        @com.aliyun.core.annotation.NameInMap("DeployMode")
        private String deployMode;

        @com.aliyun.core.annotation.NameInMap("DevelopLanguage")
        private String developLanguage;

        @com.aliyun.core.annotation.NameInMap("DocUrl")
        private String docUrl;

        @com.aliyun.core.annotation.NameInMap("SdkName")
        private String sdkName;

        @com.aliyun.core.annotation.NameInMap("SdkUrl")
        private String sdkUrl;

        @com.aliyun.core.annotation.NameInMap("SdkVersion")
        private String sdkVersion;

        private ProjectSDK(Builder builder) {
            this.createTime = builder.createTime;
            this.demoUrl = builder.demoUrl;
            this.deployMode = builder.deployMode;
            this.developLanguage = builder.developLanguage;
            this.docUrl = builder.docUrl;
            this.sdkName = builder.sdkName;
            this.sdkUrl = builder.sdkUrl;
            this.sdkVersion = builder.sdkVersion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProjectSDK create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return demoUrl
         */
        public String getDemoUrl() {
            return this.demoUrl;
        }

        /**
         * @return deployMode
         */
        public String getDeployMode() {
            return this.deployMode;
        }

        /**
         * @return developLanguage
         */
        public String getDevelopLanguage() {
            return this.developLanguage;
        }

        /**
         * @return docUrl
         */
        public String getDocUrl() {
            return this.docUrl;
        }

        /**
         * @return sdkName
         */
        public String getSdkName() {
            return this.sdkName;
        }

        /**
         * @return sdkUrl
         */
        public String getSdkUrl() {
            return this.sdkUrl;
        }

        /**
         * @return sdkVersion
         */
        public String getSdkVersion() {
            return this.sdkVersion;
        }

        public static final class Builder {
            private String createTime; 
            private String demoUrl; 
            private String deployMode; 
            private String developLanguage; 
            private String docUrl; 
            private String sdkName; 
            private String sdkUrl; 
            private String sdkVersion; 

            private Builder() {
            } 

            private Builder(ProjectSDK model) {
                this.createTime = model.createTime;
                this.demoUrl = model.demoUrl;
                this.deployMode = model.deployMode;
                this.developLanguage = model.developLanguage;
                this.docUrl = model.docUrl;
                this.sdkName = model.sdkName;
                this.sdkUrl = model.sdkUrl;
                this.sdkVersion = model.sdkVersion;
            } 

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * DemoUrl.
             */
            public Builder demoUrl(String demoUrl) {
                this.demoUrl = demoUrl;
                return this;
            }

            /**
             * DeployMode.
             */
            public Builder deployMode(String deployMode) {
                this.deployMode = deployMode;
                return this;
            }

            /**
             * DevelopLanguage.
             */
            public Builder developLanguage(String developLanguage) {
                this.developLanguage = developLanguage;
                return this;
            }

            /**
             * DocUrl.
             */
            public Builder docUrl(String docUrl) {
                this.docUrl = docUrl;
                return this;
            }

            /**
             * SdkName.
             */
            public Builder sdkName(String sdkName) {
                this.sdkName = sdkName;
                return this;
            }

            /**
             * SdkUrl.
             */
            public Builder sdkUrl(String sdkUrl) {
                this.sdkUrl = sdkUrl;
                return this;
            }

            /**
             * SdkVersion.
             */
            public Builder sdkVersion(String sdkVersion) {
                this.sdkVersion = sdkVersion;
                return this;
            }

            public ProjectSDK build() {
                return new ProjectSDK(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateProjectResponseBody} extends {@link TeaModel}
     *
     * <p>CreateProjectResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("ProjectApps")
        private java.util.List<ProjectApps> projectApps;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private String projectId;

        @com.aliyun.core.annotation.NameInMap("ProjectName")
        private String projectName;

        @com.aliyun.core.annotation.NameInMap("ProjectSDK")
        private java.util.List<ProjectSDK> projectSDK;

        @com.aliyun.core.annotation.NameInMap("ProjectType")
        private String projectType;

        private Data(Builder builder) {
            this.createTime = builder.createTime;
            this.projectApps = builder.projectApps;
            this.projectId = builder.projectId;
            this.projectName = builder.projectName;
            this.projectSDK = builder.projectSDK;
            this.projectType = builder.projectType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return projectApps
         */
        public java.util.List<ProjectApps> getProjectApps() {
            return this.projectApps;
        }

        /**
         * @return projectId
         */
        public String getProjectId() {
            return this.projectId;
        }

        /**
         * @return projectName
         */
        public String getProjectName() {
            return this.projectName;
        }

        /**
         * @return projectSDK
         */
        public java.util.List<ProjectSDK> getProjectSDK() {
            return this.projectSDK;
        }

        /**
         * @return projectType
         */
        public String getProjectType() {
            return this.projectType;
        }

        public static final class Builder {
            private String createTime; 
            private java.util.List<ProjectApps> projectApps; 
            private String projectId; 
            private String projectName; 
            private java.util.List<ProjectSDK> projectSDK; 
            private String projectType; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.createTime = model.createTime;
                this.projectApps = model.projectApps;
                this.projectId = model.projectId;
                this.projectName = model.projectName;
                this.projectSDK = model.projectSDK;
                this.projectType = model.projectType;
            } 

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * ProjectApps.
             */
            public Builder projectApps(java.util.List<ProjectApps> projectApps) {
                this.projectApps = projectApps;
                return this;
            }

            /**
             * ProjectId.
             */
            public Builder projectId(String projectId) {
                this.projectId = projectId;
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
             * ProjectSDK.
             */
            public Builder projectSDK(java.util.List<ProjectSDK> projectSDK) {
                this.projectSDK = projectSDK;
                return this;
            }

            /**
             * ProjectType.
             */
            public Builder projectType(String projectType) {
                this.projectType = projectType;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
