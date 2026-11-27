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
 * {@link DescribeCommonOverallConfigRequest} extends {@link RequestModel}
 *
 * <p>DescribeCommonOverallConfigRequest</p>
 */
public class DescribeCommonOverallConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceDirectoryAccountId")
    private Long resourceDirectoryAccountId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    private String sourceIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private DescribeCommonOverallConfigRequest(Builder builder) {
        super(builder);
        this.resourceDirectoryAccountId = builder.resourceDirectoryAccountId;
        this.sourceIp = builder.sourceIp;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCommonOverallConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return resourceDirectoryAccountId
     */
    public Long getResourceDirectoryAccountId() {
        return this.resourceDirectoryAccountId;
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

    public static final class Builder extends Request.Builder<DescribeCommonOverallConfigRequest, Builder> {
        private Long resourceDirectoryAccountId; 
        private String sourceIp; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCommonOverallConfigRequest request) {
            super(request);
            this.resourceDirectoryAccountId = request.resourceDirectoryAccountId;
            this.sourceIp = request.sourceIp;
            this.type = request.type;
        } 

        /**
         * <p>The ID of the member accounts in the resource folder, which is an Alibaba Cloud account. You can invoke the <a href="~~DescribeMonitorAccounts~~">DescribeMonitorAccounts</a> operation to obtain this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>1766185894104675</p>
         */
        public Builder resourceDirectoryAccountId(Long resourceDirectoryAccountId) {
            this.putQueryParameter("ResourceDirectoryAccountId", resourceDirectoryAccountId);
            this.resourceDirectoryAccountId = resourceDirectoryAccountId;
            return this;
        }

        /**
         * <p>The IP address of the access source.</p>
         * 
         * <strong>example:</strong>
         * <p>59.61.XX.XX</p>
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * <p>The configuration type. Valid values:</p>
         * <ul>
         * <li><strong>kdump_switch</strong>: Proactive defense experience optimization</li>
         * <li><strong>threat_detect</strong>: Adaptive threat detection</li>
         * <li><strong>suspicious_aggregation</strong>: Alerting associate</li>
         * <li><strong>alidetect</strong>: File detection</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_3277</strong>: Suspicious process startup</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_5507</strong>: Malicious driver</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_38857</strong>: High-risk operations executed by entry services</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_50858</strong>: High-risk operations executed by web services</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_50859</strong>: Suspicious operations executed by entry services</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_50861</strong>: Information probing</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_50862</strong>: Cloud Assistant advanced protection</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_50867</strong>: Malicious file implantation</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_50868</strong>: Suspicious file implantation</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_50869</strong>: Unauthorized execution of high-risk commands</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_50870</strong>: Reverse shell</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_50873</strong>: WebShell command execution</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_50876</strong>: Evasion of security software</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_50877</strong>: Malicious program communication</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_50884</strong>: Suspicious worm script behavior</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_50885</strong>: Malicious script behavior</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_50983</strong>: Obfuscation command</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_51200</strong>: Command line download and execution of malicious files</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_51201</strong>: Ransomware virus</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_51202</strong>: Suspicious ransomware behavior</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_53168</strong>: Process debugging</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_53272</strong>: Privilege escalation by exploiting kernel vulnerabilities</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_54034</strong>: Internal network scanning</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_54265</strong>: PAM module hijacking</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_54395</strong>: Unauthorized read and write of sensitive files</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_54699</strong>: Dynamic-link library hijacking</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_54953</strong>: HashDump attack</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_57897</strong>: Suspected privilege escalation behavior</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_62981</strong>: Bypassing security monitoring</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_64025</strong>: Command execution by entry services [enhanced pattern]</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_39659</strong>: Sensitive registry key protection</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_51225</strong>: High-risk command execution by PowerShell</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_51226</strong>: Suspicious command execution by PowerShell</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_51228</strong>: High-risk lateral movement tool</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_51229</strong>: High-risk operations executed by browser services</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_51230</strong>: Suspicious operations executed by entry services</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_51232</strong>: High-risk operations executed by system processes</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_51233</strong>: High-risk operations executed by Java services</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_51234</strong>: High-risk operations executed by Office components</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_51235</strong>: High-risk operations executed by web services</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_51236</strong>: Reverse shell</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_52815</strong>: High-risk driver loading</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_52816</strong>: High-risk account manipulation behavior</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_52818</strong>: Information probing</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_52820</strong>: Malicious file implantation</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_52821</strong>: Suspicious process startup</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_52823</strong>: Execution of high-risk ARK tools</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_52825</strong>: Unauthorized execution of high-risk commands</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_52826</strong>: High-risk operations executed by entry services</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_52827</strong>: Ransomware virus</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_52828</strong>: Suspicious ransomware behavior</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_52829</strong>: System backup delete behavior</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_54168</strong>: LSA security authority service protection</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_54365</strong>: Creation of service auto-start items</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_54366</strong>: Creation of high-risk auto-start items</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_54367</strong>: Creation of scheduled node auto-start items</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_54368</strong>: Creation of registry auto-start items</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_54369</strong>: Creation of WMI auto-start items</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_54373</strong>: Evasion of security software</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_54374</strong>: Intrusion trace cleanup</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_54384</strong>: HashDump attack</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_55251</strong>: High-risk operations executed by database services</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_57242</strong>: Malicious command execution</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_57340</strong>: Command line download and execution of malicious files</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_62357</strong>: Cloud Assistant service information probing</li>
         * <li><strong>USER-ENABLE-SWITCH-TYPE_63725</strong>: Suspicious script or binary file implantation by entry services</li>
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
        public DescribeCommonOverallConfigRequest build() {
            return new DescribeCommonOverallConfigRequest(this);
        } 

    } 

}
