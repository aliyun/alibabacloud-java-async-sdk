// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

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
 * {@link CreateLinkRequest} extends {@link RequestModel}
 *
 * <p>CreateLinkRequest</p>
 */
public class CreateLinkRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Cors")
    private Boolean cors;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Domain")
    private String domain;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Dynamicfield")
    private String dynamicfield;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TargetUrl")
    @com.aliyun.core.annotation.Validation(required = true)
    private String targetUrl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private CreateLinkRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.cors = builder.cors;
        this.domain = builder.domain;
        this.dynamicfield = builder.dynamicfield;
        this.targetUrl = builder.targetUrl;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateLinkRequest create() {
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
     * @return cors
     */
    public Boolean getCors() {
        return this.cors;
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return dynamicfield
     */
    public String getDynamicfield() {
        return this.dynamicfield;
    }

    /**
     * @return targetUrl
     */
    public String getTargetUrl() {
        return this.targetUrl;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<CreateLinkRequest, Builder> {
        private String appId; 
        private Boolean cors; 
        private String domain; 
        private String dynamicfield; 
        private String targetUrl; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(CreateLinkRequest request) {
            super(request);
            this.appId = request.appId;
            this.cors = request.cors;
            this.domain = request.domain;
            this.dynamicfield = request.dynamicfield;
            this.targetUrl = request.targetUrl;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder appId(String appId) {
            this.putBodyParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * Cors.
         */
        public Builder cors(Boolean cors) {
            this.putBodyParameter("Cors", cors);
            this.cors = cors;
            return this;
        }

        /**
         * Domain.
         */
        public Builder domain(String domain) {
            this.putBodyParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * Dynamicfield.
         */
        public Builder dynamicfield(String dynamicfield) {
            this.putBodyParameter("Dynamicfield", dynamicfield);
            this.dynamicfield = dynamicfield;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder targetUrl(String targetUrl) {
            this.putBodyParameter("TargetUrl", targetUrl);
            this.targetUrl = targetUrl;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public CreateLinkRequest build() {
            return new CreateLinkRequest(this);
        } 

    } 

}
