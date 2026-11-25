// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.websitebuild20250429.models;

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
 * {@link PublishAppInstanceRequest} extends {@link RequestModel}
 *
 * <p>PublishAppInstanceRequest</p>
 */
public class PublishAppInstanceRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ArtifactDigest")
    private String artifactDigest;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizId")
    private String bizId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CandidateId")
    private String candidateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeployChannel")
    private String deployChannel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ext")
    private String ext;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IdempotencyKey")
    private String idempotencyKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LogicalNumber")
    private Integer logicalNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PlatformAppid")
    private String platformAppid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PluginDeclarationHash")
    private String pluginDeclarationHash;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PrivacyDraftId")
    private String privacyDraftId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PrivacyRevision")
    private String privacyRevision;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PublishNumber")
    private String publishNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PublishOrderId")
    private Long publishOrderId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UploadSequence")
    private Long uploadSequence;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WeappAction")
    private String weappAction;

    private PublishAppInstanceRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.artifactDigest = builder.artifactDigest;
        this.bizId = builder.bizId;
        this.candidateId = builder.candidateId;
        this.deployChannel = builder.deployChannel;
        this.description = builder.description;
        this.ext = builder.ext;
        this.idempotencyKey = builder.idempotencyKey;
        this.logicalNumber = builder.logicalNumber;
        this.platformAppid = builder.platformAppid;
        this.pluginDeclarationHash = builder.pluginDeclarationHash;
        this.privacyDraftId = builder.privacyDraftId;
        this.privacyRevision = builder.privacyRevision;
        this.publishNumber = builder.publishNumber;
        this.publishOrderId = builder.publishOrderId;
        this.uploadSequence = builder.uploadSequence;
        this.weappAction = builder.weappAction;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PublishAppInstanceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return artifactDigest
     */
    public String getArtifactDigest() {
        return this.artifactDigest;
    }

    /**
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return candidateId
     */
    public String getCandidateId() {
        return this.candidateId;
    }

    /**
     * @return deployChannel
     */
    public String getDeployChannel() {
        return this.deployChannel;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return ext
     */
    public String getExt() {
        return this.ext;
    }

    /**
     * @return idempotencyKey
     */
    public String getIdempotencyKey() {
        return this.idempotencyKey;
    }

    /**
     * @return logicalNumber
     */
    public Integer getLogicalNumber() {
        return this.logicalNumber;
    }

    /**
     * @return platformAppid
     */
    public String getPlatformAppid() {
        return this.platformAppid;
    }

    /**
     * @return pluginDeclarationHash
     */
    public String getPluginDeclarationHash() {
        return this.pluginDeclarationHash;
    }

    /**
     * @return privacyDraftId
     */
    public String getPrivacyDraftId() {
        return this.privacyDraftId;
    }

    /**
     * @return privacyRevision
     */
    public String getPrivacyRevision() {
        return this.privacyRevision;
    }

    /**
     * @return publishNumber
     */
    public String getPublishNumber() {
        return this.publishNumber;
    }

    /**
     * @return publishOrderId
     */
    public Long getPublishOrderId() {
        return this.publishOrderId;
    }

    /**
     * @return uploadSequence
     */
    public Long getUploadSequence() {
        return this.uploadSequence;
    }

    /**
     * @return weappAction
     */
    public String getWeappAction() {
        return this.weappAction;
    }

    public static final class Builder extends Request.Builder<PublishAppInstanceRequest, Builder> {
        private String regionId; 
        private String artifactDigest; 
        private String bizId; 
        private String candidateId; 
        private String deployChannel; 
        private String description; 
        private String ext; 
        private String idempotencyKey; 
        private Integer logicalNumber; 
        private String platformAppid; 
        private String pluginDeclarationHash; 
        private String privacyDraftId; 
        private String privacyRevision; 
        private String publishNumber; 
        private Long publishOrderId; 
        private Long uploadSequence; 
        private String weappAction; 

        private Builder() {
            super();
        } 

        private Builder(PublishAppInstanceRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.artifactDigest = request.artifactDigest;
            this.bizId = request.bizId;
            this.candidateId = request.candidateId;
            this.deployChannel = request.deployChannel;
            this.description = request.description;
            this.ext = request.ext;
            this.idempotencyKey = request.idempotencyKey;
            this.logicalNumber = request.logicalNumber;
            this.platformAppid = request.platformAppid;
            this.pluginDeclarationHash = request.pluginDeclarationHash;
            this.privacyDraftId = request.privacyDraftId;
            this.privacyRevision = request.privacyRevision;
            this.publishNumber = request.publishNumber;
            this.publishOrderId = request.publishOrderId;
            this.uploadSequence = request.uploadSequence;
            this.weappAction = request.weappAction;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ArtifactDigest.
         */
        public Builder artifactDigest(String artifactDigest) {
            this.putQueryParameter("ArtifactDigest", artifactDigest);
            this.artifactDigest = artifactDigest;
            return this;
        }

        /**
         * <p>The business ID.</p>
         * 
         * <strong>example:</strong>
         * <p>WD20250821161210000001</p>
         */
        public Builder bizId(String bizId) {
            this.putQueryParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * CandidateId.
         */
        public Builder candidateId(String candidateId) {
            this.putQueryParameter("CandidateId", candidateId);
            this.candidateId = candidateId;
            return this;
        }

        /**
         * <p>The deployment channel.</p>
         * 
         * <strong>example:</strong>
         * <p>PC</p>
         */
        public Builder deployChannel(String deployChannel) {
            this.putQueryParameter("DeployChannel", deployChannel);
            this.deployChannel = deployChannel;
            return this;
        }

        /**
         * <p>The publish description.</p>
         * 
         * <strong>example:</strong>
         * <p>CREATE_BY_NLB.nlb-jcvs5sm9l8um84zbfa</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * Ext.
         */
        public Builder ext(String ext) {
            this.putQueryParameter("Ext", ext);
            this.ext = ext;
            return this;
        }

        /**
         * IdempotencyKey.
         */
        public Builder idempotencyKey(String idempotencyKey) {
            this.putQueryParameter("IdempotencyKey", idempotencyKey);
            this.idempotencyKey = idempotencyKey;
            return this;
        }

        /**
         * <p>The logical version number.</p>
         * 
         * <strong>example:</strong>
         * <p>111</p>
         */
        public Builder logicalNumber(Integer logicalNumber) {
            this.putQueryParameter("LogicalNumber", logicalNumber);
            this.logicalNumber = logicalNumber;
            return this;
        }

        /**
         * PlatformAppid.
         */
        public Builder platformAppid(String platformAppid) {
            this.putQueryParameter("PlatformAppid", platformAppid);
            this.platformAppid = platformAppid;
            return this;
        }

        /**
         * PluginDeclarationHash.
         */
        public Builder pluginDeclarationHash(String pluginDeclarationHash) {
            this.putQueryParameter("PluginDeclarationHash", pluginDeclarationHash);
            this.pluginDeclarationHash = pluginDeclarationHash;
            return this;
        }

        /**
         * PrivacyDraftId.
         */
        public Builder privacyDraftId(String privacyDraftId) {
            this.putQueryParameter("PrivacyDraftId", privacyDraftId);
            this.privacyDraftId = privacyDraftId;
            return this;
        }

        /**
         * PrivacyRevision.
         */
        public Builder privacyRevision(String privacyRevision) {
            this.putQueryParameter("PrivacyRevision", privacyRevision);
            this.privacyRevision = privacyRevision;
            return this;
        }

        /**
         * <p>The publish number.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder publishNumber(String publishNumber) {
            this.putQueryParameter("PublishNumber", publishNumber);
            this.publishNumber = publishNumber;
            return this;
        }

        /**
         * PublishOrderId.
         */
        public Builder publishOrderId(Long publishOrderId) {
            this.putQueryParameter("PublishOrderId", publishOrderId);
            this.publishOrderId = publishOrderId;
            return this;
        }

        /**
         * UploadSequence.
         */
        public Builder uploadSequence(Long uploadSequence) {
            this.putQueryParameter("UploadSequence", uploadSequence);
            this.uploadSequence = uploadSequence;
            return this;
        }

        /**
         * <p>The action.</p>
         * 
         * <strong>example:</strong>
         * <p>BUILD</p>
         */
        public Builder weappAction(String weappAction) {
            this.putQueryParameter("WeappAction", weappAction);
            this.weappAction = weappAction;
            return this;
        }

        @Override
        public PublishAppInstanceRequest build() {
            return new PublishAppInstanceRequest(this);
        } 

    } 

}
