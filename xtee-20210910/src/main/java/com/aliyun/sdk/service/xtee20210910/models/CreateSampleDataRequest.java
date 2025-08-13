// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

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
         * <p>Set the language type for requests and received messages, default value is <strong>zh</strong>. Values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese</li>
         * <li><strong>en</strong>: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>Description.</p>
         * 
         * <strong>example:</strong>
         * <p>描述</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>Encryption type</p>
         * 
         * <strong>example:</strong>
         * <p>LABEL</p>
         */
        public Builder encryptType(String encryptType) {
            this.putQueryParameter("encryptType", encryptType);
            this.encryptType = encryptType;
            return this;
        }

        /**
         * <p>Name</p>
         * 
         * <strong>example:</strong>
         * <p>注册样本</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>Region code</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regId(String regId) {
            this.putQueryParameter("regId", regId);
            this.regId = regId;
            return this;
        }

        /**
         * <p>Specified risk value</p>
         * 
         * <strong>example:</strong>
         * <p>black</p>
         */
        public Builder riskValue(String riskValue) {
            this.putQueryParameter("riskValue", riskValue);
            this.riskValue = riskValue;
            return this;
        }

        /**
         * <p>Scene</p>
         * 
         * <strong>example:</strong>
         * <p>PHONE</p>
         */
        public Builder scene(String scene) {
            this.putQueryParameter("scene", scene);
            this.scene = scene;
            return this;
        }

        /**
         * <p>Storage path</p>
         * 
         * <strong>example:</strong>
         * <p>saf/de/sample/3dc2spspHKq4G3YI9d08</p>
         */
        public Builder storePath(String storePath) {
            this.putQueryParameter("storePath", storePath);
            this.storePath = storePath;
            return this;
        }

        /**
         * <p>Storage type</p>
         * 
         * <strong>example:</strong>
         * <p>OSS</p>
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
