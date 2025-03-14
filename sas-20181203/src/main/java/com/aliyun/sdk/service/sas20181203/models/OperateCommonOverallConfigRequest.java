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
 * {@link OperateCommonOverallConfigRequest} extends {@link RequestModel}
 *
 * <p>OperateCommonOverallConfigRequest</p>
 */
public class OperateCommonOverallConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Config")
    @com.aliyun.core.annotation.Validation(required = true)
    private String config;

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

    private OperateCommonOverallConfigRequest(Builder builder) {
        super(builder);
        this.config = builder.config;
        this.noTargetAsOn = builder.noTargetAsOn;
        this.sourceIp = builder.sourceIp;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OperateCommonOverallConfigRequest create() {
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

    public static final class Builder extends Request.Builder<OperateCommonOverallConfigRequest, Builder> {
        private String config; 
        private Boolean noTargetAsOn; 
        private String sourceIp; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(OperateCommonOverallConfigRequest request) {
            super(request);
            this.config = request.config;
            this.noTargetAsOn = request.noTargetAsOn;
            this.sourceIp = request.sourceIp;
            this.type = request.type;
        } 

        /**
         * <p>Specifies whether to enable or disable the feature. Valid values:</p>
         * <ul>
         * <li><strong>on</strong>: enable</li>
         * <li><strong>off</strong>: disable</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder config(String config) {
            this.putQueryParameter("Config", config);
            this.config = config;
            return this;
        }

        /**
         * <p>Specifies whether to configure assets for the feature. Default value: <strong>false</strong>. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
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
         * <p>223.79.XX.XX</p>
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * <p>The type of the feature. Valid values:</p>
         * <ul>
         * <li><strong>kdump_switch</strong>: Active defense experience optimization</li>
         * <li><strong>threat_detect</strong>: Dynamic adaptive threat detection capability</li>
         * <li><strong>suspicious_aggregation</strong>: Alert Association</li>
         * <li><strong>alidetect</strong>: File Test</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_38857</strong>: Entrance service execution high-risk operation (Linux)</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_50858</strong>: Web service performs high-risk operations (Linux)</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_50859</strong>: Entrance service execution suspicious operation (Linux)</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_50862</strong>: Cloud Assistant Advanced Protection (Linux)</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_50867</strong>: Create malicious files (Linux)</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_50868</strong>: Create suspicious files (Linux)</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_64025</strong>: Ingress service execute command [enhanced mode] (Linux)</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_51229</strong>: Browser service execution a high-risk operation (Windows)</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_51230</strong>: Entrance service execution suspicious operation (Windows)</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_51232</strong>: System processes execution high-risk operations (Windows)</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_51233</strong>: Java service execution high-risk operations (Windows)</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_51234</strong>: Office components execution high-risk operations (Windows)</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_51235</strong>: Web service performs high-risk operations (Windows)</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_52820</strong>: Create malicious files (Windows)</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_52826</strong>: Entrance service execution high-risk operation (Windows)</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_55251</strong>: Database services execution high-risk operations (Windows)</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_63725</strong>: Ingress service implants suspicious script/binary file (Windows)</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_3277</strong>: Suspicious process startup (Linux)</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_50983</strong>: obfuscated command (Linux)</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_51200</strong>: Command line download and run malicious files (Linux)</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_71131</strong>: Ingress service executes sequence of suspicious behavior (Linux)</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_51225</strong>: Powershell executes high-risk commands (Windows)</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_51226</strong>: Powershell execute suspicious command (Windows)</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_52821</strong>: Suspicious process startup (Windows)</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_57242</strong>: Malicious command execution (Windows)</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_57340</strong>: Command line download and run malicious files (Windows)</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_39659</strong>: Sensitive Registry Key Protection (Windows)</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_52816</strong>: high-risk account manipulation behavior (Windows)</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_54365</strong>: Create service autorun item (Windows)</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_54366</strong>: Create high-risk autorun item (Windows)</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_54367</strong>: Create scheduled task autorun item (Windows)</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_54368</strong>: Create registry autorun item (Windows)</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_54369</strong>: Create WMI autorun item (Windows)</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_50869</strong>: Unauthorized execution of high-risk orders (Linux)</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_53272</strong>: Exploiting Kernel Vulnerabilities to Elevate Privileges (Linux)</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_54395</strong>: Unauthorized reading and writing of sensitive files (Linux)</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_57897</strong>: suspected privilege escalation (Linux)</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_52825</strong>: Unauthorized execution of high-risk orders (Windows)</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_5507</strong>: malicious drivers (Linux)</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_50876</strong>: Against security software (Linux)</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_53168</strong>: process debugging (Linux)</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_54699</strong>: Hijack dynamic link library (Linux)</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_62981</strong>: Bypassing security monitoring (Linux)</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_52815</strong>: Load high-risk drivers (Windows)</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_52823</strong>: Running high-risk ARK tools (Windows)</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_54373</strong>: Against security software (Windows)</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_54374</strong>: Intrusion trace cleanup (Windows)</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_54265</strong>: Hijacking the PAM Module (Linux)</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_54953</strong>: Hashdump Attack (Linux)</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_54383</strong>: MimiKatz Credential Stealing (Windows)</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_54384</strong>: Hashdump Attack (Windows)</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_50861</strong>: Information detection (Linux)</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_52818</strong>: Information detection (Windows)</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_54034</strong>: Intranet scan (Linux)</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_51228</strong>: High-risk lateral penetration tools (Windows)</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_50870</strong>: Rebound Shell (Linux)</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_50873</strong>: WebShell execute command</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_51236</strong>: Rebound Shell (Windows)</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_50877</strong>: Malicious soft communication (Linux)</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_50884</strong>: Suspicious worm script behavior (Linux)</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_50885</strong>: malicious script behavior (Linux)</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_51201</strong>: ransomware (Linux)</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_51202</strong>: Suspected Extortion (Linux)</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_52827</strong>: ransomware (Windows)</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_52828</strong>: Suspected Extortion (Windows)</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_52829</strong>: delete system backup behavior (Windows)</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>kdump_switch</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public OperateCommonOverallConfigRequest build() {
            return new OperateCommonOverallConfigRequest(this);
        } 

    } 

}
