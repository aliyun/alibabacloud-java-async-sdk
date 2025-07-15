// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link DeleteLiveStreamTranscodeRequest} extends {@link RequestModel}
 *
 * <p>DeleteLiveStreamTranscodeRequest</p>
 */
public class DeleteLiveStreamTranscodeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("App")
    @com.aliyun.core.annotation.Validation(required = true)
    private String app;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Domain")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domain;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Template")
    @com.aliyun.core.annotation.Validation(required = true)
    private String template;

    private DeleteLiveStreamTranscodeRequest(Builder builder) {
        super(builder);
        this.app = builder.app;
        this.domain = builder.domain;
        this.ownerId = builder.ownerId;
        this.securityToken = builder.securityToken;
        this.template = builder.template;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteLiveStreamTranscodeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return app
     */
    public String getApp() {
        return this.app;
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    /**
     * @return template
     */
    public String getTemplate() {
        return this.template;
    }

    public static final class Builder extends Request.Builder<DeleteLiveStreamTranscodeRequest, Builder> {
        private String app; 
        private String domain; 
        private Long ownerId; 
        private String securityToken; 
        private String template; 

        private Builder() {
            super();
        } 

        private Builder(DeleteLiveStreamTranscodeRequest request) {
            super(request);
            this.app = request.app;
            this.domain = request.domain;
            this.ownerId = request.ownerId;
            this.securityToken = request.securityToken;
            this.template = request.template;
        } 

        /**
         * <p>The name of the application to which the live stream belongs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>liveApp****</p>
         */
        public Builder app(String app) {
            this.putQueryParameter("App", app);
            this.app = app;
            return this;
        }

        /**
         * <p>The main streaming domain.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        /**
         * <p>The transcoding template ID. Valid values:</p>
         * <ul>
         * <li><p>Standard transcoding:</p>
         * <ul>
         * <li>lld: low definition</li>
         * <li>lsd: standard definition</li>
         * <li>lhd: high definition</li>
         * <li>lud : ultra-high definition</li>
         * </ul>
         * </li>
         * <li><p>Narrowband HD™ transcoding:</p>
         * <ul>
         * <li>ld: low definition</li>
         * <li>sd: standard definition</li>
         * <li>hd: high definition</li>
         * <li>ud: ultra-high definition</li>
         * </ul>
         * </li>
         * <li><p>Custom transcoding: a custom ID</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>lld</p>
         */
        public Builder template(String template) {
            this.putQueryParameter("Template", template);
            this.template = template;
            return this;
        }

        @Override
        public DeleteLiveStreamTranscodeRequest build() {
            return new DeleteLiveStreamTranscodeRequest(this);
        } 

    } 

}
