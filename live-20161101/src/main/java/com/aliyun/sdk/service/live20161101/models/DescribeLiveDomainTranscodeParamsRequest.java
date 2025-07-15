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
 * {@link DescribeLiveDomainTranscodeParamsRequest} extends {@link RequestModel}
 *
 * <p>DescribeLiveDomainTranscodeParamsRequest</p>
 */
public class DescribeLiveDomainTranscodeParamsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("app")
    @com.aliyun.core.annotation.Validation(required = true)
    private String app;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pushdomain")
    @com.aliyun.core.annotation.Validation(required = true)
    private String pushdomain;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("template_name")
    private String templateName;

    private DescribeLiveDomainTranscodeParamsRequest(Builder builder) {
        super(builder);
        this.securityToken = builder.securityToken;
        this.app = builder.app;
        this.pushdomain = builder.pushdomain;
        this.templateName = builder.templateName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLiveDomainTranscodeParamsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    /**
     * @return app
     */
    public String getApp() {
        return this.app;
    }

    /**
     * @return pushdomain
     */
    public String getPushdomain() {
        return this.pushdomain;
    }

    /**
     * @return templateName
     */
    public String getTemplateName() {
        return this.templateName;
    }

    public static final class Builder extends Request.Builder<DescribeLiveDomainTranscodeParamsRequest, Builder> {
        private String securityToken; 
        private String app; 
        private String pushdomain; 
        private String templateName; 

        private Builder() {
            super();
        } 

        private Builder(DescribeLiveDomainTranscodeParamsRequest request) {
            super(request);
            this.securityToken = request.securityToken;
            this.app = request.app;
            this.pushdomain = request.pushdomain;
            this.templateName = request.templateName;
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
         * <p>This parameter is required.</p>
         */
        public Builder app(String app) {
            this.putQueryParameter("app", app);
            this.app = app;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder pushdomain(String pushdomain) {
            this.putQueryParameter("pushdomain", pushdomain);
            this.pushdomain = pushdomain;
            return this;
        }

        /**
         * template_name.
         */
        public Builder templateName(String templateName) {
            this.putQueryParameter("template_name", templateName);
            this.templateName = templateName;
            return this;
        }

        @Override
        public DescribeLiveDomainTranscodeParamsRequest build() {
            return new DescribeLiveDomainTranscodeParamsRequest(this);
        } 

    } 

}
