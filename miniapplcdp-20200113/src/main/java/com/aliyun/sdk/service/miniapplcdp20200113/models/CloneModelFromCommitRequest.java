// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.miniapplcdp20200113.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CloneModelFromCommitRequest} extends {@link RequestModel}
 *
 * <p>CloneModelFromCommitRequest</p>
 */
public class CloneModelFromCommitRequest extends Request {
    @Query
    @NameInMap("ModelId")
    @Validation(required = true)
    private String modelId;

    @Query
    @NameInMap("Source")
    private String source;

    @Query
    @NameInMap("SourceCommitId")
    @Validation(required = true)
    private String sourceCommitId;

    @Query
    @NameInMap("SourceModuleId")
    @Validation(required = true)
    private String sourceModuleId;

    @Query
    @NameInMap("SubType")
    @Validation(required = true)
    private String subType;

    @Query
    @NameInMap("TargetModuleId")
    @Validation(required = true)
    private String targetModuleId;

    @Query
    @NameInMap("TargetName")
    private String targetName;

    @Query
    @NameInMap("TargetSubType")
    private String targetSubType;

    private CloneModelFromCommitRequest(Builder builder) {
        super(builder);
        this.modelId = builder.modelId;
        this.source = builder.source;
        this.sourceCommitId = builder.sourceCommitId;
        this.sourceModuleId = builder.sourceModuleId;
        this.subType = builder.subType;
        this.targetModuleId = builder.targetModuleId;
        this.targetName = builder.targetName;
        this.targetSubType = builder.targetSubType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CloneModelFromCommitRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return modelId
     */
    public String getModelId() {
        return this.modelId;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return sourceCommitId
     */
    public String getSourceCommitId() {
        return this.sourceCommitId;
    }

    /**
     * @return sourceModuleId
     */
    public String getSourceModuleId() {
        return this.sourceModuleId;
    }

    /**
     * @return subType
     */
    public String getSubType() {
        return this.subType;
    }

    /**
     * @return targetModuleId
     */
    public String getTargetModuleId() {
        return this.targetModuleId;
    }

    /**
     * @return targetName
     */
    public String getTargetName() {
        return this.targetName;
    }

    /**
     * @return targetSubType
     */
    public String getTargetSubType() {
        return this.targetSubType;
    }

    public static final class Builder extends Request.Builder<CloneModelFromCommitRequest, Builder> {
        private String modelId; 
        private String source; 
        private String sourceCommitId; 
        private String sourceModuleId; 
        private String subType; 
        private String targetModuleId; 
        private String targetName; 
        private String targetSubType; 

        private Builder() {
            super();
        } 

        private Builder(CloneModelFromCommitRequest request) {
            super(request);
            this.modelId = request.modelId;
            this.source = request.source;
            this.sourceCommitId = request.sourceCommitId;
            this.sourceModuleId = request.sourceModuleId;
            this.subType = request.subType;
            this.targetModuleId = request.targetModuleId;
            this.targetName = request.targetName;
            this.targetSubType = request.targetSubType;
        } 

        /**
         * ModelId.
         */
        public Builder modelId(String modelId) {
            this.putQueryParameter("ModelId", modelId);
            this.modelId = modelId;
            return this;
        }

        /**
         * Source.
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        /**
         * SourceCommitId.
         */
        public Builder sourceCommitId(String sourceCommitId) {
            this.putQueryParameter("SourceCommitId", sourceCommitId);
            this.sourceCommitId = sourceCommitId;
            return this;
        }

        /**
         * SourceModuleId.
         */
        public Builder sourceModuleId(String sourceModuleId) {
            this.putQueryParameter("SourceModuleId", sourceModuleId);
            this.sourceModuleId = sourceModuleId;
            return this;
        }

        /**
         * SubType.
         */
        public Builder subType(String subType) {
            this.putQueryParameter("SubType", subType);
            this.subType = subType;
            return this;
        }

        /**
         * TargetModuleId.
         */
        public Builder targetModuleId(String targetModuleId) {
            this.putQueryParameter("TargetModuleId", targetModuleId);
            this.targetModuleId = targetModuleId;
            return this;
        }

        /**
         * TargetName.
         */
        public Builder targetName(String targetName) {
            this.putQueryParameter("TargetName", targetName);
            this.targetName = targetName;
            return this;
        }

        /**
         * TargetSubType.
         */
        public Builder targetSubType(String targetSubType) {
            this.putQueryParameter("TargetSubType", targetSubType);
            this.targetSubType = targetSubType;
            return this;
        }

        @Override
        public CloneModelFromCommitRequest build() {
            return new CloneModelFromCommitRequest(this);
        } 

    } 

}
