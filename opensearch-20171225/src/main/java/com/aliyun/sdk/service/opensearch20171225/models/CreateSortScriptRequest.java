// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSortScriptRequest} extends {@link RequestModel}
 *
 * <p>CreateSortScriptRequest</p>
 */
public class CreateSortScriptRequest extends Request {
    @Path
    @NameInMap("appGroupIdentity")
    @Validation(required = true)
    private String appGroupIdentity;

    @Path
    @NameInMap("appVersionId")
    @Validation(required = true)
    private String appVersionId;

    @Body
    @NameInMap("scope")
    private String scope;

    @Body
    @NameInMap("scriptName")
    private String scriptName;

    @Body
    @NameInMap("type")
    private String type;

    private CreateSortScriptRequest(Builder builder) {
        super(builder);
        this.appGroupIdentity = builder.appGroupIdentity;
        this.appVersionId = builder.appVersionId;
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
            this.scope = request.scope;
            this.scriptName = request.scriptName;
            this.type = request.type;
        } 

        /**
         * search
         */
        public Builder appGroupIdentity(String appGroupIdentity) {
            this.putPathParameter("appGroupIdentity", appGroupIdentity);
            this.appGroupIdentity = appGroupIdentity;
            return this;
        }

        /**
         * 1234567
         */
        public Builder appVersionId(String appVersionId) {
            this.putPathParameter("appVersionId", appVersionId);
            this.appVersionId = appVersionId;
            return this;
        }

        /**
         * 脚本的作用范围
         */
        public Builder scope(String scope) {
            this.putBodyParameter("scope", scope);
            this.scope = scope;
            return this;
        }

        /**
         * 脚本名称
         */
        public Builder scriptName(String scriptName) {
            this.putBodyParameter("scriptName", scriptName);
            this.scriptName = scriptName;
            return this;
        }

        /**
         * 脚本的类型，目前只支持cava_script
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
