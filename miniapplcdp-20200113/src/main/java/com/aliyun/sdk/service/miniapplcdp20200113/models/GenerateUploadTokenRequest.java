// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.miniapplcdp20200113.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GenerateUploadTokenRequest} extends {@link RequestModel}
 *
 * <p>GenerateUploadTokenRequest</p>
 */
public class GenerateUploadTokenRequest extends Request {
    @Query
    @NameInMap("AppId")
    private String appId;

    @Query
    @NameInMap("MaterialId")
    private String materialId;

    @Query
    @NameInMap("ModuleId")
    private String moduleId;

    @Query
    @NameInMap("Source")
    private String source;

    @Query
    @NameInMap("UploadTokenType")
    private String uploadTokenType;

    private GenerateUploadTokenRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.materialId = builder.materialId;
        this.moduleId = builder.moduleId;
        this.source = builder.source;
        this.uploadTokenType = builder.uploadTokenType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateUploadTokenRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return materialId
     */
    public String getMaterialId() {
        return this.materialId;
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
     * @return uploadTokenType
     */
    public String getUploadTokenType() {
        return this.uploadTokenType;
    }

    public static final class Builder extends Request.Builder<GenerateUploadTokenRequest, Builder> {
        private String appId; 
        private String materialId; 
        private String moduleId; 
        private String source; 
        private String uploadTokenType; 

        private Builder() {
            super();
        } 

        private Builder(GenerateUploadTokenRequest request) {
            super(request);
            this.appId = request.appId;
            this.materialId = request.materialId;
            this.moduleId = request.moduleId;
            this.source = request.source;
            this.uploadTokenType = request.uploadTokenType;
        } 

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * MaterialId.
         */
        public Builder materialId(String materialId) {
            this.putQueryParameter("MaterialId", materialId);
            this.materialId = materialId;
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
         * UploadTokenType.
         */
        public Builder uploadTokenType(String uploadTokenType) {
            this.putQueryParameter("UploadTokenType", uploadTokenType);
            this.uploadTokenType = uploadTokenType;
            return this;
        }

        @Override
        public GenerateUploadTokenRequest build() {
            return new GenerateUploadTokenRequest(this);
        } 

    } 

}
