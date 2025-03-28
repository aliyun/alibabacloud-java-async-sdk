// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devs20230714.models;

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
 * {@link TemplateStatus} extends {@link TeaModel}
 *
 * <p>TemplateStatus</p>
 */
public class TemplateStatus extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("latestDeployment")
    private LatestDeployment latestDeployment;

    @com.aliyun.core.annotation.NameInMap("latestVersion")
    private String latestVersion;

    @com.aliyun.core.annotation.NameInMap("packageUrl")
    private String packageUrl;

    @com.aliyun.core.annotation.NameInMap("phase")
    private String phase;

    @com.aliyun.core.annotation.NameInMap("templateUrl")
    private String templateUrl;

    private TemplateStatus(Builder builder) {
        this.latestDeployment = builder.latestDeployment;
        this.latestVersion = builder.latestVersion;
        this.packageUrl = builder.packageUrl;
        this.phase = builder.phase;
        this.templateUrl = builder.templateUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TemplateStatus create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return latestDeployment
     */
    public LatestDeployment getLatestDeployment() {
        return this.latestDeployment;
    }

    /**
     * @return latestVersion
     */
    public String getLatestVersion() {
        return this.latestVersion;
    }

    /**
     * @return packageUrl
     */
    public String getPackageUrl() {
        return this.packageUrl;
    }

    /**
     * @return phase
     */
    public String getPhase() {
        return this.phase;
    }

    /**
     * @return templateUrl
     */
    public String getTemplateUrl() {
        return this.templateUrl;
    }

    public static final class Builder {
        private LatestDeployment latestDeployment; 
        private String latestVersion; 
        private String packageUrl; 
        private String phase; 
        private String templateUrl; 

        private Builder() {
        } 

        private Builder(TemplateStatus model) {
            this.latestDeployment = model.latestDeployment;
            this.latestVersion = model.latestVersion;
            this.packageUrl = model.packageUrl;
            this.phase = model.phase;
            this.templateUrl = model.templateUrl;
        } 

        /**
         * latestDeployment.
         */
        public Builder latestDeployment(LatestDeployment latestDeployment) {
            this.latestDeployment = latestDeployment;
            return this;
        }

        /**
         * latestVersion.
         */
        public Builder latestVersion(String latestVersion) {
            this.latestVersion = latestVersion;
            return this;
        }

        /**
         * packageUrl.
         */
        public Builder packageUrl(String packageUrl) {
            this.packageUrl = packageUrl;
            return this;
        }

        /**
         * phase.
         */
        public Builder phase(String phase) {
            this.phase = phase;
            return this;
        }

        /**
         * templateUrl.
         */
        public Builder templateUrl(String templateUrl) {
            this.templateUrl = templateUrl;
            return this;
        }

        public TemplateStatus build() {
            return new TemplateStatus(this);
        } 

    } 

    /**
     * 
     * {@link TemplateStatus} extends {@link TeaModel}
     *
     * <p>TemplateStatus</p>
     */
    public static class LatestDeployment extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("finishedTime")
        private String finishedTime;

        @com.aliyun.core.annotation.NameInMap("phase")
        private String phase;

        @com.aliyun.core.annotation.NameInMap("pipelineName")
        private String pipelineName;

        @com.aliyun.core.annotation.NameInMap("startTime")
        private String startTime;

        private LatestDeployment(Builder builder) {
            this.finishedTime = builder.finishedTime;
            this.phase = builder.phase;
            this.pipelineName = builder.pipelineName;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LatestDeployment create() {
            return builder().build();
        }

        /**
         * @return finishedTime
         */
        public String getFinishedTime() {
            return this.finishedTime;
        }

        /**
         * @return phase
         */
        public String getPhase() {
            return this.phase;
        }

        /**
         * @return pipelineName
         */
        public String getPipelineName() {
            return this.pipelineName;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private String finishedTime; 
            private String phase; 
            private String pipelineName; 
            private String startTime; 

            private Builder() {
            } 

            private Builder(LatestDeployment model) {
                this.finishedTime = model.finishedTime;
                this.phase = model.phase;
                this.pipelineName = model.pipelineName;
                this.startTime = model.startTime;
            } 

            /**
             * finishedTime.
             */
            public Builder finishedTime(String finishedTime) {
                this.finishedTime = finishedTime;
                return this;
            }

            /**
             * phase.
             */
            public Builder phase(String phase) {
                this.phase = phase;
                return this;
            }

            /**
             * pipelineName.
             */
            public Builder pipelineName(String pipelineName) {
                this.pipelineName = pipelineName;
                return this;
            }

            /**
             * startTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            public LatestDeployment build() {
                return new LatestDeployment(this);
            } 

        } 

    }
}
