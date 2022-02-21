// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAIAppRequest} extends {@link RequestModel}
 *
 * <p>CreateAIAppRequest</p>
 */
public class CreateAIAppRequest extends Request {
    @Query
    @NameInMap("AppTemplateId")
    @Validation(required = true)
    private String appTemplateId;

    @Query
    @NameInMap("AppTemplateVersion")
    @Validation(required = true)
    private String appTemplateVersion;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("Level")
    @Validation(required = true)
    private Integer level;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    private CreateAIAppRequest(Builder builder) {
        super(builder);
        this.appTemplateId = builder.appTemplateId;
        this.appTemplateVersion = builder.appTemplateVersion;
        this.description = builder.description;
        this.level = builder.level;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAIAppRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appTemplateId
     */
    public String getAppTemplateId() {
        return this.appTemplateId;
    }

    /**
     * @return appTemplateVersion
     */
    public String getAppTemplateVersion() {
        return this.appTemplateVersion;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return level
     */
    public Integer getLevel() {
        return this.level;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<CreateAIAppRequest, Builder> {
        private String appTemplateId; 
        private String appTemplateVersion; 
        private String description; 
        private Integer level; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(CreateAIAppRequest response) {
            super(response);
            this.appTemplateId = response.appTemplateId;
            this.appTemplateVersion = response.appTemplateVersion;
            this.description = response.description;
            this.level = response.level;
            this.name = response.name;
        } 

        /**
         * AppTemplateId.
         */
        public Builder appTemplateId(String appTemplateId) {
            this.putQueryParameter("AppTemplateId", appTemplateId);
            this.appTemplateId = appTemplateId;
            return this;
        }

        /**
         * AppTemplateVersion.
         */
        public Builder appTemplateVersion(String appTemplateVersion) {
            this.putQueryParameter("AppTemplateVersion", appTemplateVersion);
            this.appTemplateVersion = appTemplateVersion;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * Level.
         */
        public Builder level(Integer level) {
            this.putQueryParameter("Level", level);
            this.level = level;
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

        @Override
        public CreateAIAppRequest build() {
            return new CreateAIAppRequest(this);
        } 

    } 

}
