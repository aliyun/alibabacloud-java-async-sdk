// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

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
 * {@link CreateSortScriptRequest} extends {@link RequestModel}
 *
 * <p>CreateSortScriptRequest</p>
 */
public class CreateSortScriptRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("appGroupIdentity")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appGroupIdentity;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("appVersionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appVersionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("scope")
    private String scope;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("scriptName")
    private String scriptName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private CreateSortScriptRequest(Builder builder) {
        super(builder);
        this.appGroupIdentity = builder.appGroupIdentity;
        this.appVersionId = builder.appVersionId;
        this.description = builder.description;
        this.scope = builder.scope;
        this.scriptName = builder.scriptName;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSortScriptRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appGroupIdentity
     */
    public String getAppGroupIdentity() {
        return this.appGroupIdentity;
    }

    /**
     * @return appVersionId
     */
    public String getAppVersionId() {
        return this.appVersionId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return scope
     */
    public String getScope() {
        return this.scope;
    }

    /**
     * @return scriptName
     */
    public String getScriptName() {
        return this.scriptName;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<CreateSortScriptRequest, Builder> {
        private String appGroupIdentity; 
        private String appVersionId; 
        private String description; 
        private String scope; 
        private String scriptName; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(CreateSortScriptRequest request) {
            super(request);
            this.appGroupIdentity = request.appGroupIdentity;
            this.appVersionId = request.appVersionId;
            this.description = request.description;
            this.scope = request.scope;
            this.scriptName = request.scriptName;
            this.type = request.type;
        } 

        /**
         * <p>The application name or ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>search</p>
         */
        public Builder appGroupIdentity(String appGroupIdentity) {
            this.putPathParameter("appGroupIdentity", appGroupIdentity);
            this.appGroupIdentity = appGroupIdentity;
            return this;
        }

        /**
         * <p>The ID of the report in the application.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567</p>
         */
        public Builder appVersionId(String appVersionId) {
            this.putPathParameter("appVersionId", appVersionId);
            this.appVersionId = appVersionId;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The sort phase to which the script applies.</p>
         * 
         * <strong>example:</strong>
         * <p>second_rank</p>
         */
        public Builder scope(String scope) {
            this.putBodyParameter("scope", scope);
            this.scope = scope;
            return this;
        }

        /**
         * <p>The script name.</p>
         * 
         * <strong>example:</strong>
         * <p>rank_cava_20230606_v7</p>
         */
        public Builder scriptName(String scriptName) {
            this.putBodyParameter("scriptName", scriptName);
            this.scriptName = scriptName;
            return this;
        }

        /**
         * <p>The script type. Set the value to cava_script.</p>
         * 
         * <strong>example:</strong>
         * <p>cava_script</p>
         */
        public Builder type(String type) {
            this.putBodyParameter("type", type);
            this.type = type;
            return this;
        }

        @Override
        public CreateSortScriptRequest build() {
            return new CreateSortScriptRequest(this);
        } 

    } 

}
