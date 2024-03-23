// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link Experiment} extends {@link TeaModel}
 *
 * <p>Experiment</p>
 */
public class Experiment extends TeaModel {
    @NameInMap("ArtifactUri")
    private String artifactUri;

    @NameInMap("ExperimentId")
    private String experimentId;

    @NameInMap("GmtCreateTime")
    private String gmtCreateTime;

    @NameInMap("GmtModifiedTime")
    private String gmtModifiedTime;

    @NameInMap("Labels")
    private java.util.List < java.util.Map<String, ?>> labels;

    @NameInMap("Name")
    private String name;

    @NameInMap("OwnerId")
    private String ownerId;

    @NameInMap("TensorboardLogUri")
    private String tensorboardLogUri;

    @NameInMap("UserId")
    private String userId;

    @NameInMap("WorkspaceId")
    private String workspaceId;

    private Experiment(Builder builder) {
        this.artifactUri = builder.artifactUri;
        this.experimentId = builder.experimentId;
        this.gmtCreateTime = builder.gmtCreateTime;
        this.gmtModifiedTime = builder.gmtModifiedTime;
        this.labels = builder.labels;
        this.name = builder.name;
        this.ownerId = builder.ownerId;
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
    public java.util.List < java.util.Map<String, ?>> getLabels() {
        return this.labels;
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
        private String artifactUri; 
        private String experimentId; 
        private String gmtCreateTime; 
        private String gmtModifiedTime; 
        private java.util.List < java.util.Map<String, ?>> labels; 
        private String name; 
        private String ownerId; 
        private String tensorboardLogUri; 
        private String userId; 
        private String workspaceId; 

        /**
         * ArtifactUri.
         */
        public Builder artifactUri(String artifactUri) {
            this.artifactUri = artifactUri;
            return this;
        }

        /**
         * ExperimentId.
         */
        public Builder experimentId(String experimentId) {
            this.experimentId = experimentId;
            return this;
        }

        /**
         * GmtCreateTime.
         */
        public Builder gmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }

        /**
         * GmtModifiedTime.
         */
        public Builder gmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }

        /**
         * Labels.
         */
        public Builder labels(java.util.List < java.util.Map<String, ?>> labels) {
            this.labels = labels;
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
         * OwnerId.
         */
        public Builder ownerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }

        /**
         * TensorboardLogUri.
         */
        public Builder tensorboardLogUri(String tensorboardLogUri) {
            this.tensorboardLogUri = tensorboardLogUri;
            return this;
        }

        /**
         * UserId.
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        /**
         * WorkspaceId.
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
