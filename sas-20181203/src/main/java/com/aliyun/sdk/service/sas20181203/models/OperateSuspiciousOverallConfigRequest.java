// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
         * <p>Specifies whether to enable the feature. Valid values:</p>
         * <ul>
         * <li><strong>on</strong>: yes</li>
         * <li><strong>off</strong>: no</li>
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
         * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
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
         * <p>Specifies whether to configure assets for the feature. Default value: <strong>false</strong>. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: yes</li>
         * <li><strong>false</strong>: no</li>
         * </ul>
         * <blockquote>
         * <p> This parameter takes effect only when you set <strong>Config</strong> to <strong>on</strong>.</p>
         * </blockquote>
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
         * <p>The source IP address of the request.</p>
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
         * <p>The type of the feature. Valid values:</p>
         * <ul>
         * <li><strong>auto_breaking</strong>: Anti-Virus</li>
         * <li><strong>ransomware_breaking</strong>: Anti-ransomware (Bait Capture)</li>
         * <li><strong>webshell_cloud_breaking</strong>: Webshell Protection</li>
         * <li><strong>alinet</strong>: Behavior prevention</li>
         * <li><strong>k8s_log_analysis</strong>: K8s Threat Detection</li>
         * <li><strong>alisecguard</strong>: Defense mode for Client Protection</li>
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
