// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSampleDataRequest} extends {@link RequestModel}
 *
 * <p>CreateSampleDataRequest</p>
 */
public class CreateSampleDataRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("encryptType")
    private String encryptType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    private String regId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("riskValue")
    private String riskValue;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("scene")
    private String scene;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("storePath")
    private String storePath;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("storeType")
    private String storeType;

    private CreateSampleDataRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.description = builder.description;
        this.encryptType = builder.encryptType;
        this.name = builder.name;
        this.regId = builder.regId;
        this.riskValue = builder.riskValue;
        this.scene = builder.scene;
        this.storePath = builder.storePath;
        this.storeType = builder.storeType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSampleDataRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return encryptType
     */
    public String getEncryptType() {
        return this.encryptType;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return regId
     */
    public String getRegId() {
        return this.regId;
    }

    /**
     * @return riskValue
     */
    public String getRiskValue() {
        return this.riskValue;
    }

    /**
     * @return scene
     */
    public String getScene() {
        return this.scene;
    }

    /**
     * @return storePath
     */
    public String getStorePath() {
        return this.storePath;
    }

    /**
     * @return storeType
     */
    public String getStoreType() {
        return this.storeType;
    }

    public static final class Builder extends Request.Builder<CreateSampleDataRequest, Builder> {
        private String lang; 
        private String description; 
        private String encryptType; 
        private String name; 
        private String regId; 
        private String riskValue; 
        private String scene; 
        private String storePath; 
        private String storeType; 

        private Builder() {
            super();
        } 

        private Builder(CreateSampleDataRequest request) {
            super(request);
            this.lang = request.lang;
            this.description = request.description;
            this.encryptType = request.encryptType;
            this.name = request.name;
            this.regId = request.regId;
            this.riskValue = request.riskValue;
            this.scene = request.scene;
            this.storePath = request.storePath;
            this.storeType = request.storeType;
        } 

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.putQueryParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * encryptType.
         */
        public Builder encryptType(String encryptType) {
            this.putQueryParameter("encryptType", encryptType);
            this.encryptType = encryptType;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.putQueryParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * regId.
         */
        public Builder regId(String regId) {
            this.putQueryParameter("regId", regId);
            this.regId = regId;
            return this;
        }

        /**
         * riskValue.
         */
        public Builder riskValue(String riskValue) {
            this.putQueryParameter("riskValue", riskValue);
            this.riskValue = riskValue;
            return this;
        }

        /**
         * scene.
         */
        public Builder scene(String scene) {
            this.putQueryParameter("scene", scene);
            this.scene = scene;
            return this;
        }

        /**
         * storePath.
         */
        public Builder storePath(String storePath) {
            this.putQueryParameter("storePath", storePath);
            this.storePath = storePath;
            return this;
        }

        /**
         * storeType.
         */
        public Builder storeType(String storeType) {
            this.putQueryParameter("storeType", storeType);
            this.storeType = storeType;
            return this;
        }

        @Override
        public CreateSampleDataRequest build() {
            return new CreateSampleDataRequest(this);
        } 

    } 

}
