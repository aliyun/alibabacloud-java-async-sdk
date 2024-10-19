// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribePluginTemplatesRequest} extends {@link RequestModel}
 *
 * <p>DescribePluginTemplatesRequest</p>
 */
public class DescribePluginTemplatesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Language")
    private String language;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PluginName")
    private String pluginName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    private DescribePluginTemplatesRequest(Builder builder) {
        super(builder);
        this.language = builder.language;
        this.pluginName = builder.pluginName;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePluginTemplatesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return language
     */
    public String getLanguage() {
        return this.language;
    }

    /**
     * @return pluginName
     */
    public String getPluginName() {
        return this.pluginName;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<DescribePluginTemplatesRequest, Builder> {
        private String language; 
        private String pluginName; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(DescribePluginTemplatesRequest request) {
            super(request);
            this.language = request.language;
            this.pluginName = request.pluginName;
            this.securityToken = request.securityToken;
        } 

        /**
         * <p>The language that is used to return the description of the system policy. Valid values:</p>
         * <ul>
         * <li>en: English</li>
         * <li>zh-CN: Chinese.</li>
         * <li>ja: Japanese</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder language(String language) {
            this.putQueryParameter("Language", language);
            this.language = language;
            return this;
        }

        /**
         * <p>The name of the plug-in.</p>
         * 
         * <strong>example:</strong>
         * <p>jwtAuth</p>
         */
        public Builder pluginName(String pluginName) {
            this.putQueryParameter("PluginName", pluginName);
            this.pluginName = pluginName;
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

        @Override
        public DescribePluginTemplatesRequest build() {
            return new DescribePluginTemplatesRequest(this);
        } 

    } 

}
