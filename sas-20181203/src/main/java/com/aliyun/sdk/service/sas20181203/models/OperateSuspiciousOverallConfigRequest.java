// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link OperateSuspiciousOverallConfigRequest} extends {@link RequestModel}
 *
 * <p>OperateSuspiciousOverallConfigRequest</p>
 */
public class OperateSuspiciousOverallConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Config")
    @com.aliyun.core.annotation.Validation(required = true)
    private String config;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NoTargetAsOn")
    private Boolean noTargetAsOn;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    private String sourceIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private OperateSuspiciousOverallConfigRequest(Builder builder) {
        super(builder);
        this.config = builder.config;
        this.lang = builder.lang;
        this.noTargetAsOn = builder.noTargetAsOn;
        this.sourceIp = builder.sourceIp;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OperateSuspiciousOverallConfigRequest create() {
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
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return noTargetAsOn
     */
    public Boolean getNoTargetAsOn() {
        return this.noTargetAsOn;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<OperateSuspiciousOverallConfigRequest, Builder> {
        private String config; 
        private String lang; 
        private Boolean noTargetAsOn; 
        private String sourceIp; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(OperateSuspiciousOverallConfigRequest request) {
            super(request);
            this.config = request.config;
            this.lang = request.lang;
            this.noTargetAsOn = request.noTargetAsOn;
            this.sourceIp = request.sourceIp;
            this.type = request.type;
        } 

        /**
         * <p>The switch status. Valid values:</p>
         * <ul>
         * <li><strong>on</strong>: Enable</li>
         * <li><strong>off</strong>: Disable</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        public Builder config(String config) {
            this.putQueryParameter("Config", config);
            this.config = config;
            return this;
        }

        /**
         * <p>The language type for the request and response messages. Default value: <strong>zh</strong>. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese</li>
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
         * <p>Specifies whether asset configuration is required. Default value: <strong>false</strong>. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Required</li>
         * <li><strong>false</strong>: Not required<blockquote>
         * <p>This value takes effect only when <strong>config</strong> is set to <strong>on</strong>.</p>
         * </blockquote>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder noTargetAsOn(Boolean noTargetAsOn) {
            this.putQueryParameter("NoTargetAsOn", noTargetAsOn);
            this.noTargetAsOn = noTargetAsOn;
            return this;
        }

        /**
         * <p>The IP address of the access source.</p>
         * 
         * <strong>example:</strong>
         * <p>222.178.XX.XX</p>
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * <p>The switch type. Valid values:</p>
         * <ul>
         * <li><strong>auto_breaking</strong>: Anti-virus</li>
         * <li><strong>ransomware_breaking</strong>: Anti-ransomware (bait capture)</li>
         * <li><strong>webshell_cloud_breaking</strong>: Website backdoor connection defense</li>
         * <li><strong>alinet</strong>: Malicious network behavior defense</li>
         * <li><strong>k8s_log_analysis</strong>: Container K8s threat detection</li>
         * <li><strong>alisecguard</strong>: Client self-protection defense mode</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>k8s_log_analysis</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public OperateSuspiciousOverallConfigRequest build() {
            return new OperateSuspiciousOverallConfigRequest(this);
        } 

    } 

}
