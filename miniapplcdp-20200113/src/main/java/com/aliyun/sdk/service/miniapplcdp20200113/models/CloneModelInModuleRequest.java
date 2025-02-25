// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.miniapplcdp20200113.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CloneModelInModuleRequest} extends {@link RequestModel}
 *
 * <p>CloneModelInModuleRequest</p>
 */
public class CloneModelInModuleRequest extends Request {
    @Query
    @NameInMap("ModelId")
    @Validation(required = true)
    private String modelId;

    @Query
    @NameInMap("ModuleId")
    @Validation(required = true)
    private String moduleId;

    @Query
    @NameInMap("Source")
    private String source;

    @Query
    @NameInMap("TargetName")
    private String targetName;

    @Query
    @NameInMap("TargetSubType")
    private String targetSubType;

    private CloneModelInModuleRequest(Builder builder) {
        super(builder);
        this.modelId = builder.modelId;
        this.moduleId = builder.moduleId;
        this.source = builder.source;
        this.targetName = builder.targetName;
        this.targetSubType = builder.targetSubType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CloneModelInModuleRequest create() {
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
     * @return moduleId
     */
    public String getModuleId() {
        return this.moduleId;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
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

    public static final class Builder extends Request.Builder<CloneModelInModuleRequest, Builder> {
        private String modelId; 
        private String moduleId; 
        private String source; 
        private String targetName; 
        private String targetSubType; 

        private Builder() {
            super();
        } 

        private Builder(CloneModelInModuleRequest request) {
            super(request);
            this.modelId = request.modelId;
            this.moduleId = request.moduleId;
            this.source = request.source;
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
         * ModuleId.
         */
        public Builder moduleId(String moduleId) {
            this.putQueryParameter("ModuleId", moduleId);
            this.moduleId = moduleId;
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
        public CloneModelInModuleRequest build() {
            return new CloneModelInModuleRequest(this);
        } 

    } 

}
