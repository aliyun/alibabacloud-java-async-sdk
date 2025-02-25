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
 * {@link DescribeCommonOverallConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCommonOverallConfigResponseBody</p>
 */
public class DescribeCommonOverallConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("OverallConfig")
    private OverallConfig overallConfig;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeCommonOverallConfigResponseBody(Builder builder) {
        this.overallConfig = builder.overallConfig;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCommonOverallConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return overallConfig
     */
    public OverallConfig getOverallConfig() {
        return this.overallConfig;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private OverallConfig overallConfig; 
        private String requestId; 

        /**
         * <p>The information about the feature.</p>
         */
        public Builder overallConfig(OverallConfig overallConfig) {
            this.overallConfig = overallConfig;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>6D9CDB47-6191-4415-BE63-7E8B12CD4FBE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeCommonOverallConfigResponseBody build() {
            return new DescribeCommonOverallConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCommonOverallConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCommonOverallConfigResponseBody</p>
     */
    public static class OverallConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Config")
        private String config;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private OverallConfig(Builder builder) {
            this.config = builder.config;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OverallConfig create() {
            return builder().build();
        }

        /**
         * @return config
         */
        public String getConfig() {
            return this.config;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String config; 
            private String type; 

            /**
             * <p>The status of the feature. Valid values:</p>
             * <ul>
             * <li><strong>on</strong>: enabled</li>
             * <li><strong>off</strong>: disabled</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>on</p>
             */
            public Builder config(String config) {
                this.config = config;
                return this;
            }

            /**
             * <p>The type of the feature. Valid values:</p>
             * <ul>
             * <li><strong>kdump_switch</strong>: Active defense experience optimization</li>
             * <li><strong>threat_detect</strong>: Dynamic adaptive threat detection capability</li>
             * <li><strong>suspicious_aggregation</strong>: Alert Association</li>
             * <li><strong>alidetect</strong>: File Test</li>
             * <li><strong>USER-ENABLE-SWITCH-TYPE_3277</strong>: Suspicious process startup</li>
             * <li><strong>USER-ENABLE-SWITCH-TYPE_5507</strong>: malicious drivers</li>
             * <li><strong>USER-ENABLE-SWITCH-TYPE_38857</strong>: Entrance service execution high-risk operation</li>
             * <li><strong>USER-ENABLE-SWITCH-TYPE_50858</strong>: Web service performs high-risk operations</li>
             * <li><strong>USER-ENABLE-SWITCH-TYPE_50859</strong>: Entrance service execution suspicious operation</li>
             * <li><strong>USER-ENABLE-SWITCH-TYPE_50861</strong>: Information detection</li>
             * <li><strong>USER-ENABLE-SWITCH-TYPE_50862</strong>: Cloud Assistant Advanced Protection</li>
             * <li><strong>USER-ENABLE-SWITCH-TYPE_50867</strong>: Create malicious files</li>
             * <li><strong>USER-ENABLE-SWITCH-TYPE_50868</strong>: Create suspicious files</li>
             * <li><strong>USER-ENABLE-SWITCH-TYPE_50869</strong>: Unauthorized execution of high-risk orders</li>
             * <li><strong>USER-ENABLE-SWITCH-TYPE_50870</strong>: Rebound Shell</li>
             * <li><strong>USER-ENABLE-SWITCH-TYPE_50873</strong>: WebShell execute command</li>
             * <li><strong>USER-ENABLE-SWITCH-TYPE_50876</strong>: Against security software</li>
             * <li><strong>USER-ENABLE-SWITCH-TYPE_50877</strong>: Malicious soft communication</li>
             * <li><strong>USER-ENABLE-SWITCH-TYPE_50884</strong>: Suspicious worm script behavior</li>
             * <li><strong>USER-ENABLE-SWITCH-TYPE_50885</strong>: malicious script behavior</li>
             * <li><strong>USER-ENABLE-SWITCH-TYPE_50983</strong>: obfuscated command</li>
             * <li><strong>USER-ENABLE-SWITCH-TYPE_51200</strong>: Command line download and run malicious files</li>
             * <li><strong>USER-ENABLE-SWITCH-TYPE_51201</strong>: ransomware</li>
             * <li><strong>USER-ENABLE-SWITCH-TYPE_51202</strong>: Suspected Extortion</li>
             * <li><strong>USER-ENABLE-SWITCH-TYPE_53168</strong>: process debugging</li>
             * <li><strong>USER-ENABLE-SWITCH-TYPE_53272</strong>: Exploiting Kernel Vulnerabilities to Elevate Privileges</li>
             * <li><strong>USER-ENABLE-SWITCH-TYPE_54034</strong>: Intranet scan</li>
             * <li><strong>USER-ENABLE-SWITCH-TYPE_54265</strong>: Hijacking the PAM Module</li>
             * <li><strong>USER-ENABLE-SWITCH-TYPE_54395</strong>: Unauthorized reading and writing of sensitive files</li>
             * <li><strong>USER-ENABLE-SWITCH-TYPE_54699</strong>: Hijack dynamic link library</li>
             * <li><strong>USER-ENABLE-SWITCH-TYPE_54953</strong>: Hashdump Attack</li>
             * <li><strong>USER-ENABLE-SWITCH-TYPE_57897</strong>: suspected privilege escalation</li>
             * <li><strong>USER-ENABLE-SWITCH-TYPE_62981</strong>: Bypassing security monitoring</li>
             * <li><strong>USER-ENABLE-SWITCH-TYPE_64025</strong>: Ingress service execute command [enhanced mode]</li>
             * <li><strong>USER-ENABLE-SWITCH-TYPE_39659</strong>: Sensitive Registry Key Protection</li>
             * <li><strong>USER-ENABLE-SWITCH-TYPE_51225</strong>: Powershell executes high-risk commands</li>
             * <li><strong>USER-ENABLE-SWITCH-TYPE_51226</strong>: Powershell execute suspicious command</li>
             * <li><strong>USER-ENABLE-SWITCH-TYPE_51228</strong>: High-risk lateral penetration tools</li>
             * <li><strong>USER-ENABLE-SWITCH-TYPE_51229</strong>: Browser service execution a high-risk operation</li>
             * <li><strong>USER-ENABLE-SWITCH-TYPE_51230</strong>: Entrance service execution suspicious operation</li>
             * <li><strong>USER-ENABLE-SWITCH-TYPE_51232</strong>: System processes execution high-risk operations</li>
             * <li><strong>USER-ENABLE-SWITCH-TYPE_51233</strong>: Java service execution high-risk operations</li>
             * <li><strong>USER-ENABLE-SWITCH-TYPE_51234</strong>: Office components execution high-risk operations</li>
             * <li><strong>USER-ENABLE-SWITCH-TYPE_51235</strong>: Web service performs high-risk operations</li>
             * <li><strong>USER-ENABLE-SWITCH-TYPE_51236</strong>: Rebound shells</li>
             * <li><strong>USER-ENABLE-SWITCH-TYPE_52815</strong>: Load high-risk drivers</li>
             * <li><strong>USER-ENABLE-SWITCH-TYPE_52816</strong>: high-risk account manipulation behavior</li>
             * <li><strong>USER-ENABLE-SWITCH-TYPE_52818</strong>: Information detection</li>
             * <li><strong>USER-ENABLE-SWITCH-TYPE_52820</strong>: Create malicious files</li>
             * <li><strong>USER-ENABLE-SWITCH-TYPE_52821</strong>: Suspicious process startup</li>
             * <li><strong>USER-ENABLE-SWITCH-TYPE_52823</strong>: Running high-risk ARK tools</li>
             * <li><strong>USER-ENABLE-SWITCH-TYPE_52825</strong>: Unauthorized execution of high-risk orders</li>
             * <li><strong>USER-ENABLE-SWITCH-TYPE_52826</strong>: Entrance service execution high-risk operation</li>
             * <li><strong>USER-ENABLE-SWITCH-TYPE_52827</strong>: Ransomware</li>
             * <li><strong>USER-ENABLE-SWITCH-TYPE_52828</strong>: Suspected Extortion</li>
             * <li><strong>USER-ENABLE-SWITCH-TYPE_52829</strong>: delete system backup behavior</li>
             * <li><strong>USER-ENABLE-SWITCH-TYPE_54168</strong>: LSA security permission service protection</li>
             * <li><strong>USER-ENABLE-SWITCH-TYPE_54365</strong>: Create service autorun item</li>
             * <li><strong>USER-ENABLE-SWITCH-TYPE_54366</strong>: Create high-risk autorun item</li>
             * <li><strong>USER-ENABLE-SWITCH-TYPE_54367</strong>: Create scheduled task autorun item</li>
             * <li><strong>USER-ENABLE-SWITCH-TYPE_54368</strong>: Create registry autorun item</li>
             * <li><strong>USER-ENABLE-SWITCH-TYPE_54369</strong>: Create WMI autorun item</li>
             * <li><strong>USER-ENABLE-SWITCH-TYPE_54373</strong>: Against security software</li>
             * <li><strong>USER-ENABLE-SWITCH-TYPE_54374</strong>: Intrusion trace cleanup</li>
             * <li><strong>USER-ENABLE-SWITCH-TYPE_54384</strong>: Hashdump Attack</li>
             * <li><strong>USER-ENABLE-SWITCH-TYPE_55251</strong>: Database services execution high-risk operations</li>
             * <li><strong>USER-ENABLE-SWITCH-TYPE_57242</strong>: Malicious command execution</li>
             * <li><strong>USER-ENABLE-SWITCH-TYPE_57340</strong>: Command line download and run malicious files</li>
             * <li><strong>USER-ENABLE-SWITCH-TYPE_62357</strong>: Cloud Assistant service information detection</li>
             * <li><strong>USER-ENABLE-SWITCH-TYPE_63725</strong>: Ingress service implants suspicious script/binary file</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>kdump_switch</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public OverallConfig build() {
                return new OverallConfig(this);
            } 

        } 

    }
}
