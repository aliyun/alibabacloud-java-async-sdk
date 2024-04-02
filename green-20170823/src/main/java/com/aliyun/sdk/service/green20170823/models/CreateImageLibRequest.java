// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20170823.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateImageLibRequest} extends {@link RequestModel}
 *
 * <p>CreateImageLibRequest</p>
 */
public class CreateImageLibRequest extends Request {
    @Query
    @NameInMap("BizTypes")
    private String bizTypes;

    @Query
    @NameInMap("Category")
    @Validation(required = true)
    private String category;

    @Query
    @NameInMap("Enable")
    private Boolean enable;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("Scene")
    @Validation(required = true)
    private String scene;

    @Query
    @NameInMap("ServiceModule")
    @Validation(required = true)
    private String serviceModule;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    private CreateImageLibRequest(Builder builder) {
        super(builder);
        this.bizTypes = builder.bizTypes;
        this.category = builder.category;
        this.enable = builder.enable;
        this.name = builder.name;
        this.scene = builder.scene;
        this.serviceModule = builder.serviceModule;
        this.sourceIp = builder.sourceIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateImageLibRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizTypes
     */
    public String getBizTypes() {
        return this.bizTypes;
    }

    /**
     * @return category
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * @return enable
     */
    public Boolean getEnable() {
        return this.enable;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return scene
     */
    public String getScene() {
        return this.scene;
    }

    /**
     * @return serviceModule
     */
    public String getServiceModule() {
        return this.serviceModule;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    public static final class Builder extends Request.Builder<CreateImageLibRequest, Builder> {
        private String bizTypes; 
        private String category; 
        private Boolean enable; 
        private String name; 
        private String scene; 
        private String serviceModule; 
        private String sourceIp; 

        private Builder() {
            super();
        } 

        private Builder(CreateImageLibRequest request) {
            super(request);
            this.bizTypes = request.bizTypes;
            this.category = request.category;
            this.enable = request.enable;
            this.name = request.name;
            this.scene = request.scene;
            this.serviceModule = request.serviceModule;
            this.sourceIp = request.sourceIp;
        } 

        /**
         * BizTypes.
         */
        public Builder bizTypes(String bizTypes) {
            this.putQueryParameter("BizTypes", bizTypes);
            this.bizTypes = bizTypes;
            return this;
        }

        /**
         * Category.
         */
        public Builder category(String category) {
            this.putQueryParameter("Category", category);
            this.category = category;
            return this;
        }

        /**
         * Enable.
         */
        public Builder enable(Boolean enable) {
            this.putQueryParameter("Enable", enable);
            this.enable = enable;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * Scene.
         */
        public Builder scene(String scene) {
            this.putQueryParameter("Scene", scene);
            this.scene = scene;
            return this;
        }

        /**
         * ServiceModule.
         */
        public Builder serviceModule(String serviceModule) {
            this.putQueryParameter("ServiceModule", serviceModule);
            this.serviceModule = serviceModule;
            return this;
        }

        /**
         * SourceIp.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        @Override
        public CreateImageLibRequest build() {
            return new CreateImageLibRequest(this);
        } 

    } 

}
