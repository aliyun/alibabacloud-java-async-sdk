// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link UpdateModelTemplateRequest} extends {@link RequestModel}
 *
 * <p>UpdateModelTemplateRequest</p>
 */
public class UpdateModelTemplateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Config")
    private String config;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModelTemplateId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String modelTemplateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RefScope")
    private String refScope;

    private UpdateModelTemplateRequest(Builder builder) {
        super(builder);
        this.config = builder.config;
        this.description = builder.description;
        this.modelTemplateId = builder.modelTemplateId;
        this.name = builder.name;
        this.refScope = builder.refScope;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateModelTemplateRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return config
     */
    public String getConfig() {
        return this.config;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return modelTemplateId
     */
    public String getModelTemplateId() {
        return this.modelTemplateId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return refScope
     */
    public String getRefScope() {
        return this.refScope;
    }

    public static final class Builder extends Request.Builder<UpdateModelTemplateRequest, Builder> {
        private String config; 
        private String description; 
        private String modelTemplateId; 
        private String name; 
        private String refScope; 

        private Builder() {
            super();
        } 

        private Builder(UpdateModelTemplateRequest request) {
            super(request);
            this.config = request.config;
            this.description = request.description;
            this.modelTemplateId = request.modelTemplateId;
            this.name = request.name;
            this.refScope = request.refScope;
        } 

        /**
         * Config.
         */
        public Builder config(String config) {
            this.putQueryParameter("Config", config);
            this.config = config;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mt-xxxx</p>
         */
        public Builder modelTemplateId(String modelTemplateId) {
            this.putQueryParameter("ModelTemplateId", modelTemplateId);
            this.modelTemplateId = modelTemplateId;
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
         * RefScope.
         */
        public Builder refScope(String refScope) {
            this.putQueryParameter("RefScope", refScope);
            this.refScope = refScope;
            return this;
        }

        @Override
        public UpdateModelTemplateRequest build() {
            return new UpdateModelTemplateRequest(this);
        } 

    } 

}
