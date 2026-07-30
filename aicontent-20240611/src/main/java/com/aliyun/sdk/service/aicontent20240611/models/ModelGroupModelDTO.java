// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aicontent20240611.models;

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
 * {@link ModelGroupModelDTO} extends {@link TeaModel}
 *
 * <p>ModelGroupModelDTO</p>
 */
public class ModelGroupModelDTO extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("id")
    private Long id;

    @com.aliyun.core.annotation.NameInMap("modelCode")
    private String modelCode;

    @com.aliyun.core.annotation.NameInMap("modelType")
    private String modelType;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("platform")
    private String platform;

    @com.aliyun.core.annotation.NameInMap("version")
    private String version;

    private ModelGroupModelDTO(Builder builder) {
        this.id = builder.id;
        this.modelCode = builder.modelCode;
        this.modelType = builder.modelType;
        this.name = builder.name;
        this.platform = builder.platform;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModelGroupModelDTO create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return modelCode
     */
    public String getModelCode() {
        return this.modelCode;
    }

    /**
     * @return modelType
     */
    public String getModelType() {
        return this.modelType;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return platform
     */
    public String getPlatform() {
        return this.platform;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder {
        private Long id; 
        private String modelCode; 
        private String modelType; 
        private String name; 
        private String platform; 
        private String version; 

        private Builder() {
        } 

        private Builder(ModelGroupModelDTO model) {
            this.id = model.id;
            this.modelCode = model.modelCode;
            this.modelType = model.modelType;
            this.name = model.name;
            this.platform = model.platform;
            this.version = model.version;
        } 

        /**
         * id.
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * modelCode.
         */
        public Builder modelCode(String modelCode) {
            this.modelCode = modelCode;
            return this;
        }

        /**
         * modelType.
         */
        public Builder modelType(String modelType) {
            this.modelType = modelType;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * platform.
         */
        public Builder platform(String platform) {
            this.platform = platform;
            return this;
        }

        /**
         * version.
         */
        public Builder version(String version) {
            this.version = version;
            return this;
        }

        public ModelGroupModelDTO build() {
            return new ModelGroupModelDTO(this);
        } 

    } 

}
