// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyPolicyAdvancedConfigRequest} extends {@link RequestModel}
 *
 * <p>ModifyPolicyAdvancedConfigRequest</p>
 */
public class ModifyPolicyAdvancedConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InternetSwitch")
    @com.aliyun.core.annotation.Validation(required = true)
    private String internetSwitch;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    @Deprecated
    private String sourceIp;

    private ModifyPolicyAdvancedConfigRequest(Builder builder) {
        super(builder);
        this.internetSwitch = builder.internetSwitch;
        this.lang = builder.lang;
        this.sourceIp = builder.sourceIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyPolicyAdvancedConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return internetSwitch
     */
    public String getInternetSwitch() {
        return this.internetSwitch;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    public static final class Builder extends Request.Builder<ModifyPolicyAdvancedConfigRequest, Builder> {
        private String internetSwitch; 
        private String lang; 
        private String sourceIp; 

        private Builder() {
            super();
        } 

        private Builder(ModifyPolicyAdvancedConfigRequest request) {
            super(request);
            this.internetSwitch = request.internetSwitch;
            this.lang = request.lang;
            this.sourceIp = request.sourceIp;
        } 

        /**
         * <p>Specifies whether to enable the strict mode for the access control policy. Valid values:</p>
         * <ul>
         * <li><strong>on</strong>: enables the strict mode.</li>
         * <li><strong>off</strong>: disables the strict mode.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        public Builder internetSwitch(String internetSwitch) {
            this.putQueryParameter("InternetSwitch", internetSwitch);
            this.internetSwitch = internetSwitch;
            return this;
        }

        /**
         * <p>The natural language of the request and response. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese (default)</li>
         * <li><strong>en</strong>: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The source IP address of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>192.0.XX.XX</p>
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        @Override
        public ModifyPolicyAdvancedConfigRequest build() {
            return new ModifyPolicyAdvancedConfigRequest(this);
        } 

    } 

}
