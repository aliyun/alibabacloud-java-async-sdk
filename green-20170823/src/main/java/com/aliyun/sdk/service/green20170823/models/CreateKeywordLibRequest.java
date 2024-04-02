// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20170823.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateKeywordLibRequest} extends {@link RequestModel}
 *
 * <p>CreateKeywordLibRequest</p>
 */
public class CreateKeywordLibRequest extends Request {
    @Query
    @NameInMap("BizTypes")
    private String bizTypes;

    @Query
    @NameInMap("Category")
    private String category;

    @Query
    @NameInMap("Enable")
    private Boolean enable;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("Language")
    private String language;

    @Query
    @NameInMap("LibType")
    private String libType;

    @Query
    @NameInMap("MatchMode")
    private String matchMode;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("ResourceType")
    @Validation(required = true)
    private String resourceType;

    @Query
    @NameInMap("ServiceModule")
    @Validation(required = true)
    private String serviceModule;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    private CreateKeywordLibRequest(Builder builder) {
        super(builder);
        this.bizTypes = builder.bizTypes;
        this.category = builder.category;
        this.enable = builder.enable;
        this.lang = builder.lang;
        this.language = builder.language;
        this.libType = builder.libType;
        this.matchMode = builder.matchMode;
        this.name = builder.name;
        this.resourceType = builder.resourceType;
        this.serviceModule = builder.serviceModule;
        this.sourceIp = builder.sourceIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateKeywordLibRequest create() {
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
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return language
     */
    public String getLanguage() {
        return this.language;
    }

    /**
     * @return libType
     */
    public String getLibType() {
        return this.libType;
    }

    /**
     * @return matchMode
     */
    public String getMatchMode() {
        return this.matchMode;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
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

    public static final class Builder extends Request.Builder<CreateKeywordLibRequest, Builder> {
        private String bizTypes; 
        private String category; 
        private Boolean enable; 
        private String lang; 
        private String language; 
        private String libType; 
        private String matchMode; 
        private String name; 
        private String resourceType; 
        private String serviceModule; 
        private String sourceIp; 

        private Builder() {
            super();
        } 

        private Builder(CreateKeywordLibRequest request) {
            super(request);
            this.bizTypes = request.bizTypes;
            this.category = request.category;
            this.enable = request.enable;
            this.lang = request.lang;
            this.language = request.language;
            this.libType = request.libType;
            this.matchMode = request.matchMode;
            this.name = request.name;
            this.resourceType = request.resourceType;
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
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * Language.
         */
        public Builder language(String language) {
            this.putQueryParameter("Language", language);
            this.language = language;
            return this;
        }

        /**
         * LibType.
         */
        public Builder libType(String libType) {
            this.putQueryParameter("LibType", libType);
            this.libType = libType;
            return this;
        }

        /**
         * MatchMode.
         */
        public Builder matchMode(String matchMode) {
            this.putQueryParameter("MatchMode", matchMode);
            this.matchMode = matchMode;
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
         * ResourceType.
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
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
        public CreateKeywordLibRequest build() {
            return new CreateKeywordLibRequest(this);
        } 

    } 

}
