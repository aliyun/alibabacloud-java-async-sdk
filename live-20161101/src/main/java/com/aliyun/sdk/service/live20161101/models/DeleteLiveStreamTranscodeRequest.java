// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteLiveStreamTranscodeRequest} extends {@link RequestModel}
 *
 * <p>DeleteLiveStreamTranscodeRequest</p>
 */
public class DeleteLiveStreamTranscodeRequest extends Request {
    @Query
    @NameInMap("App")
    @Validation(required = true)
    private String app;

    @Query
    @NameInMap("Domain")
    @Validation(required = true)
    private String domain;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    @Query
    @NameInMap("Template")
    @Validation(required = true)
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
         * App.
         */
        public Builder app(String app) {
            this.putQueryParameter("App", app);
            this.app = app;
            return this;
        }

        /**
         * Domain.
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
         * Template.
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
