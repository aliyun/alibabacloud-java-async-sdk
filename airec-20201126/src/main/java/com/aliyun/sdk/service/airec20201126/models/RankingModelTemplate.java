// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20201126.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link RankingModelTemplate} extends {@link TeaModel}
 *
 * <p>RankingModelTemplate</p>
 */
public class RankingModelTemplate extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Meta")
    private Meta meta;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("TemplateId")
    private String templateId;

    @com.aliyun.core.annotation.NameInMap("VersionNum")
    private Long versionNum;

    private RankingModelTemplate(Builder builder) {
        this.meta = builder.meta;
        this.status = builder.status;
        this.templateId = builder.templateId;
        this.versionNum = builder.versionNum;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RankingModelTemplate create() {
        return builder().build();
    }

    /**
     * @return meta
     */
    public Meta getMeta() {
        return this.meta;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    /**
     * @return versionNum
     */
    public Long getVersionNum() {
        return this.versionNum;
    }

    public static final class Builder {
        private Meta meta; 
        private String status; 
        private String templateId; 
        private Long versionNum; 

        /**
         * Meta.
         */
        public Builder meta(Meta meta) {
            this.meta = meta;
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
         * TemplateId.
         */
        public Builder templateId(String templateId) {
            this.templateId = templateId;
            return this;
        }

        /**
         * VersionNum.
         */
        public Builder versionNum(Long versionNum) {
            this.versionNum = versionNum;
            return this;
        }

        public RankingModelTemplate build() {
            return new RankingModelTemplate(this);
        } 

    } 

    /**
     * 
     * {@link RankingModelTemplate} extends {@link TeaModel}
     *
     * <p>RankingModelTemplate</p>
     */
    public static class Meta extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Authorized")
        private Boolean authorized;

        @com.aliyun.core.annotation.NameInMap("AutoRun")
        private Boolean autoRun;

        @com.aliyun.core.annotation.NameInMap("AutoRunTime")
        private Long autoRunTime;

        @com.aliyun.core.annotation.NameInMap("AutoRunType")
        private String autoRunType;

        @com.aliyun.core.annotation.NameInMap("CanDeploy")
        private Boolean canDeploy;

        @com.aliyun.core.annotation.NameInMap("Conf")
        private String conf;

        @com.aliyun.core.annotation.NameInMap("DeployStatus")
        private String deployStatus;

        @com.aliyun.core.annotation.NameInMap("LastEditTime")
        private String lastEditTime;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("OssArn")
        private String ossArn;

        @com.aliyun.core.annotation.NameInMap("OssBucket")
        private String ossBucket;

        @com.aliyun.core.annotation.NameInMap("OssEndpoint")
        private String ossEndpoint;

        @com.aliyun.core.annotation.NameInMap("SampleId")
        private String sampleId;

        @com.aliyun.core.annotation.NameInMap("SampleName")
        private String sampleName;

        @com.aliyun.core.annotation.NameInMap("SampleTimeWindow")
        private Long sampleTimeWindow;

        @com.aliyun.core.annotation.NameInMap("SampleTimeWindowType")
        private String sampleTimeWindowType;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Meta(Builder builder) {
            this.authorized = builder.authorized;
            this.autoRun = builder.autoRun;
            this.autoRunTime = builder.autoRunTime;
            this.autoRunType = builder.autoRunType;
            this.canDeploy = builder.canDeploy;
            this.conf = builder.conf;
            this.deployStatus = builder.deployStatus;
            this.lastEditTime = builder.lastEditTime;
            this.name = builder.name;
            this.ossArn = builder.ossArn;
            this.ossBucket = builder.ossBucket;
            this.ossEndpoint = builder.ossEndpoint;
            this.sampleId = builder.sampleId;
            this.sampleName = builder.sampleName;
            this.sampleTimeWindow = builder.sampleTimeWindow;
            this.sampleTimeWindowType = builder.sampleTimeWindowType;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Meta create() {
            return builder().build();
        }

        /**
         * @return authorized
         */
        public Boolean getAuthorized() {
            return this.authorized;
        }

        /**
         * @return autoRun
         */
        public Boolean getAutoRun() {
            return this.autoRun;
        }

        /**
         * @return autoRunTime
         */
        public Long getAutoRunTime() {
            return this.autoRunTime;
        }

        /**
         * @return autoRunType
         */
        public String getAutoRunType() {
            return this.autoRunType;
        }

        /**
         * @return canDeploy
         */
        public Boolean getCanDeploy() {
            return this.canDeploy;
        }

        /**
         * @return conf
         */
        public String getConf() {
            return this.conf;
        }

        /**
         * @return deployStatus
         */
        public String getDeployStatus() {
            return this.deployStatus;
        }

        /**
         * @return lastEditTime
         */
        public String getLastEditTime() {
            return this.lastEditTime;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return ossArn
         */
        public String getOssArn() {
            return this.ossArn;
        }

        /**
         * @return ossBucket
         */
        public String getOssBucket() {
            return this.ossBucket;
        }

        /**
         * @return ossEndpoint
         */
        public String getOssEndpoint() {
            return this.ossEndpoint;
        }

        /**
         * @return sampleId
         */
        public String getSampleId() {
            return this.sampleId;
        }

        /**
         * @return sampleName
         */
        public String getSampleName() {
            return this.sampleName;
        }

        /**
         * @return sampleTimeWindow
         */
        public Long getSampleTimeWindow() {
            return this.sampleTimeWindow;
        }

        /**
         * @return sampleTimeWindowType
         */
        public String getSampleTimeWindowType() {
            return this.sampleTimeWindowType;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Boolean authorized; 
            private Boolean autoRun; 
            private Long autoRunTime; 
            private String autoRunType; 
            private Boolean canDeploy; 
            private String conf; 
            private String deployStatus; 
            private String lastEditTime; 
            private String name; 
            private String ossArn; 
            private String ossBucket; 
            private String ossEndpoint; 
            private String sampleId; 
            private String sampleName; 
            private Long sampleTimeWindow; 
            private String sampleTimeWindowType; 
            private String type; 

            /**
             * Authorized.
             */
            public Builder authorized(Boolean authorized) {
                this.authorized = authorized;
                return this;
            }

            /**
             * AutoRun.
             */
            public Builder autoRun(Boolean autoRun) {
                this.autoRun = autoRun;
                return this;
            }

            /**
             * AutoRunTime.
             */
            public Builder autoRunTime(Long autoRunTime) {
                this.autoRunTime = autoRunTime;
                return this;
            }

            /**
             * AutoRunType.
             */
            public Builder autoRunType(String autoRunType) {
                this.autoRunType = autoRunType;
                return this;
            }

            /**
             * CanDeploy.
             */
            public Builder canDeploy(Boolean canDeploy) {
                this.canDeploy = canDeploy;
                return this;
            }

            /**
             * Conf.
             */
            public Builder conf(String conf) {
                this.conf = conf;
                return this;
            }

            /**
             * DeployStatus.
             */
            public Builder deployStatus(String deployStatus) {
                this.deployStatus = deployStatus;
                return this;
            }

            /**
             * LastEditTime.
             */
            public Builder lastEditTime(String lastEditTime) {
                this.lastEditTime = lastEditTime;
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
             * OssArn.
             */
            public Builder ossArn(String ossArn) {
                this.ossArn = ossArn;
                return this;
            }

            /**
             * OssBucket.
             */
            public Builder ossBucket(String ossBucket) {
                this.ossBucket = ossBucket;
                return this;
            }

            /**
             * OssEndpoint.
             */
            public Builder ossEndpoint(String ossEndpoint) {
                this.ossEndpoint = ossEndpoint;
                return this;
            }

            /**
             * SampleId.
             */
            public Builder sampleId(String sampleId) {
                this.sampleId = sampleId;
                return this;
            }

            /**
             * SampleName.
             */
            public Builder sampleName(String sampleName) {
                this.sampleName = sampleName;
                return this;
            }

            /**
             * SampleTimeWindow.
             */
            public Builder sampleTimeWindow(Long sampleTimeWindow) {
                this.sampleTimeWindow = sampleTimeWindow;
                return this;
            }

            /**
             * SampleTimeWindowType.
             */
            public Builder sampleTimeWindowType(String sampleTimeWindowType) {
                this.sampleTimeWindowType = sampleTimeWindowType;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Meta build() {
                return new Meta(this);
            } 

        } 

    }
}
