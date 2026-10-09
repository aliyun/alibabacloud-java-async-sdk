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
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    @com.aliyun.core.annotation.Validation(maxLength = 64)
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Config")
    @com.aliyun.core.annotation.Validation(required = true)
    private String config;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

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
        this.clientToken = builder.clientToken;
        this.config = builder.config;
        this.dryRun = builder.dryRun;
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
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return config
     */
    public String getConfig() {
        return this.config;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
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
        private String clientToken; 
        private String config; 
        private Boolean dryRun; 
        private Boolean noTargetAsOn; 
        private String sourceIp; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(OperateCommonOverallConfigRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.config = request.config;
            this.dryRun = request.dryRun;
            this.noTargetAsOn = request.noTargetAsOn;
            this.sourceIp = request.sourceIp;
            this.type = request.type;
        } 

        /**
         * <p>The client token used to ensure request idempotence. Use a different token for each request. Only ASCII characters are supported. The token can be up to 64 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>02fb3da4-130e-11e9-8e44-0016e04115b</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The switch status. Valid values:</p>
         * <ul>
         * <li><strong>on</strong>: enabled</li>
         * <li><strong>off</strong>: disabled</li>
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
         * <p>Specifies whether to perform only a dry run for this request. Valid values: true: performs only a dry run without executing the actual operation. false: sends the request normally. Default value: false.</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>Specifies whether asset configuration is required. Default value: <strong>false</strong>. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: required</li>
         * <li><strong>false</strong>: not required<blockquote>
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
         * <p>223.79.XX.XX</p>
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * <p>The configuration type. Valid values:</p>
         * <ul>
         * <li><strong>kdump_switch</strong>: proactive defense optimization experience</li>
         * <li><strong>threat_detect</strong>: adaptive threat detection capability</li>
         * <li><strong>suspicious_aggregation</strong>: alert correlation</li>
         * <li><strong>alidetect</strong>: file detection</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_38857</strong>: Linux entry service executes high-risk operations</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_50858</strong>: Linux web service executes high-risk operations</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_50859</strong>: Linux entry service executes suspicious operations</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_50862</strong>: Linux Cloud Assistant advanced protection</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_50867</strong>: Linux implants malicious files</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_50868</strong>: Linux implants suspicious files</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_64025</strong>: Linux entry service executes commands [enhanced mode]</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_51229</strong>: Windows browser service executes high-risk operations</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_51230</strong>: Windows entry service executes suspicious operations</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_51232</strong>: Windows system process executes high-risk operations</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_51233</strong>: Windows Java service executes high-risk operations</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_51234</strong>: Windows Office component executes high-risk operations</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_51235</strong>: Windows web service executes high-risk operations</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_52820</strong>: Windows implants malicious files</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_52826</strong>: Windows entry service executes high-risk operations</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_55251</strong>: Windows database service executes high-risk operations</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_63725</strong>: Windows entry service implants suspicious scripts or binary files</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_3277</strong>: Linux suspicious process startup</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_50983</strong>: Linux obfuscation commands</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_51200</strong>: Linux command line downloads and runs malicious files</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_71131</strong>: Linux entry service executes suspicious behavior sequences</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_51225</strong>: Windows PowerShell executes high-risk commands</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_51226</strong>: Windows PowerShell executes suspicious commands</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_52821</strong>: Windows suspicious process startup</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_57242</strong>: Windows malicious command execution</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_57340</strong>: Windows command line downloads and runs malicious files</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_39659</strong>: Windows sensitive registry key protection</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_52816</strong>: Windows high-risk account manipulation</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_54365</strong>: Windows creates service auto-start entry</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_54366</strong>: Windows creates high-risk auto-start entry</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_54367</strong>: Windows creates scheduled task auto-start entry</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_54368</strong>: Windows creates registry auto-start entry</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_54369</strong>: Windows creates WMI auto-start entry</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_50869</strong>: Linux unauthorized execution of high-risk commands</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_53272</strong>: Linux privilege escalation via kernel vulnerability</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_54395</strong>: Linux unauthorized read/write of sensitive files</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_57897</strong>: Linux suspected privilege escalation behavior</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_52825</strong>: Windows unauthorized execution of high-risk commands</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_5507</strong>: Linux malicious driver</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_50876</strong>: Linux counters security software</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_53168</strong>: Linux process debugging</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_54699</strong>: Linux hijacks dynamic-link library</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_62981</strong>: Linux bypasses security monitoring</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_52815</strong>: Windows loads high-risk driver</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_52823</strong>: Windows runs high-risk ARK tool</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_54373</strong>: Windows counters security software</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_54374</strong>: Windows clears intrusion traces</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_54265</strong>: Linux hijacks PAM module</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_54953</strong>: Linux HashDump attack</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_54383</strong>: Windows MimiKatz credential theft</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_54384</strong>: Windows HashDump attack</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_50861</strong>: Linux information detection</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_52818</strong>: Windows information detection</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_54034</strong>: Linux internal network scan</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_51228</strong>: Windows high-risk lateral movement tool</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_50870</strong>: Linux reverse shell</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_50873</strong>: WebShell command execution</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_51236</strong>: Windows reverse shell</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_50877</strong>: Linux malicious program communication</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_50884</strong>: Linux suspicious worm script behavior</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_50885</strong>: Linux malicious script behavior</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_51201</strong>: Linux ransomware</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_51202</strong>: Linux suspected ransomware behavior</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_52827</strong>: Windows ransomware</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_52828</strong>: Windows suspected ransomware behavior</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_52829</strong>: Windows deletes system backup</li>
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
