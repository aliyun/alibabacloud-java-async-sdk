// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

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
 * {@link Experiment} extends {@link TeaModel}
 *
 * <p>Experiment</p>
 */
public class Experiment extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Accessibility")
    private String accessibility;

    @com.aliyun.core.annotation.NameInMap("ArtifactUri")
    private String artifactUri;

    @com.aliyun.core.annotation.NameInMap("ExperimentId")
    private String experimentId;

    @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
    private String gmtCreateTime;

    @com.aliyun.core.annotation.NameInMap("GmtModifiedTime")
    private String gmtModifiedTime;

    @com.aliyun.core.annotation.NameInMap("Labels")
    private java.util.List<ExperimentLabel> labels;

    @com.aliyun.core.annotation.NameInMap("LatestRun")
    private Run latestRun;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private String ownerId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TensorboardLogUri")
    private String tensorboardLogUri;

    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private Experiment(Builder builder) {
        this.accessibility = builder.accessibility;
        this.artifactUri = builder.artifactUri;
        this.experimentId = builder.experimentId;
        this.gmtCreateTime = builder.gmtCreateTime;
        this.gmtModifiedTime = builder.gmtModifiedTime;
        this.labels = builder.labels;
        this.latestRun = builder.latestRun;
        this.name = builder.name;
        this.ownerId = builder.ownerId;
        this.requestId = builder.requestId;
        this.tensorboardLogUri = builder.tensorboardLogUri;
        this.userId = builder.userId;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Experiment create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessibility
     */
    public String getAccessibility() {
        return this.accessibility;
    }

    /**
     * @return artifactUri
     */
    public String getArtifactUri() {
        return this.artifactUri;
    }

    /**
     * @return experimentId
     */
    public String getExperimentId() {
        return this.experimentId;
    }

    /**
     * @return gmtCreateTime
     */
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    /**
     * @return gmtModifiedTime
     */
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    /**
     * @return labels
     */
    public java.util.List<ExperimentLabel> getLabels() {
        return this.labels;
    }

    /**
     * @return latestRun
     */
    public Run getLatestRun() {
        return this.latestRun;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return ownerId
     */
    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return tensorboardLogUri
     */
    public String getTensorboardLogUri() {
        return this.tensorboardLogUri;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder {
        private String accessibility; 
        private String artifactUri; 
        private String experimentId; 
        private String gmtCreateTime; 
        private String gmtModifiedTime; 
        private java.util.List<ExperimentLabel> labels; 
        private Run latestRun; 
        private String name; 
        private String ownerId; 
        private String requestId; 
        private String tensorboardLogUri; 
        private String userId; 
        private String workspaceId; 

        private Builder() {
        } 

        private Builder(Experiment model) {
            this.accessibility = model.accessibility;
            this.artifactUri = model.artifactUri;
            this.experimentId = model.experimentId;
            this.gmtCreateTime = model.gmtCreateTime;
            this.gmtModifiedTime = model.gmtModifiedTime;
            this.labels = model.labels;
            this.latestRun = model.latestRun;
            this.name = model.name;
            this.ownerId = model.ownerId;
            this.requestId = model.requestId;
            this.tensorboardLogUri = model.tensorboardLogUri;
            this.userId = model.userId;
            this.workspaceId = model.workspaceId;
        } 

        /**
         * <p>The visibility of the experiment. PRIVATE indicates that the experiment is visible only to the creator and their Alibaba Cloud account. PUBLIC indicates that the experiment is visible to all users.</p>
         * 
         * <strong>example:</strong>
         * <p>PRIVATE</p>
         */
        public Builder accessibility(String accessibility) {
            this.accessibility = accessibility;
            return this;
        }

        /**
         * <p>The default artifact output path for tasks associated with the experiment. Currently, only OSS paths are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://test-bucket.oss-cn-hangzhou.aliyuncs.com/test</p>
         */
        public Builder artifactUri(String artifactUri) {
            this.artifactUri = artifactUri;
            return this;
        }

        /**
         * <p>The experiment ID.</p>
         * 
         * <strong>example:</strong>
         * <p>exp-1zpfthdx******</p>
         */
        public Builder experimentId(String experimentId) {
            this.experimentId = experimentId;
            return this;
        }

        /**
         * <p>The time when the experiment was created.</p>
         */
        public Builder gmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }

        /**
         * <p>The time when the experiment was last modified.</p>
         */
        public Builder gmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }

        /**
         * <p>The list of experiment labels.</p>
         */
        public Builder labels(java.util.List<ExperimentLabel> labels) {
            this.labels = labels;
            return this;
        }

        /**
         * <p>The information about the latest run associated with the experiment.</p>
         */
        public Builder latestRun(Run latestRun) {
            this.latestRun = latestRun;
            return this;
        }

        /**
         * <p>The experiment name.</p>
         * 
         * <strong>example:</strong>
         * <p>exp-test</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The Alibaba Cloud account ID of the experiment owner.</p>
         * 
         * <strong>example:</strong>
         * <p>1631044****3440</p>
         */
        public Builder ownerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0C6835C5-A424-5AFB-ACC2-F1E3CA1ABF7C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The default OSS storage path for TensorBoard logs of each trial in the experiment.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://test-bucket.oss-cn-hangzhou.aliyuncs.com/tensorboard/</p>
         */
        public Builder tensorboardLogUri(String tensorboardLogUri) {
            this.tensorboardLogUri = tensorboardLogUri;
            return this;
        }

        /**
         * <p>The user ID of the experiment creator.</p>
         * 
         * <strong>example:</strong>
         * <p>1557702098******</p>
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        /**
         * <p>The ID of the workspace to which the experiment belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>1517**</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }

        public Experiment build() {
            return new Experiment(this);
        } 

    } 

}
