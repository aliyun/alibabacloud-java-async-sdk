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
 * {@link DescribeCommonOverallConfigListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCommonOverallConfigListResponseBody</p>
 */
public class DescribeCommonOverallConfigListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("OverallList")
    private java.util.List<OverallList> overallList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeCommonOverallConfigListResponseBody(Builder builder) {
        this.overallList = builder.overallList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCommonOverallConfigListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return overallList
     */
    public java.util.List<OverallList> getOverallList() {
        return this.overallList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<OverallList> overallList; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeCommonOverallConfigListResponseBody model) {
            this.overallList = model.overallList;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The information about the configuration items.</p>
         */
        public Builder overallList(java.util.List<OverallList> overallList) {
            this.overallList = overallList;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>CE500770-42D3-442E-9DDD-156E0F9F3B45</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeCommonOverallConfigListResponseBody build() {
            return new DescribeCommonOverallConfigListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCommonOverallConfigListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCommonOverallConfigListResponseBody</p>
     */
    public static class OverallList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthVersionList")
        private java.util.List<String> authVersionList;

        @com.aliyun.core.annotation.NameInMap("Config")
        private String config;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private OverallList(Builder builder) {
            this.authVersionList = builder.authVersionList;
            this.config = builder.config;
            this.totalCount = builder.totalCount;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OverallList create() {
            return builder().build();
        }

        /**
         * @return authVersionList
         */
        public java.util.List<String> getAuthVersionList() {
            return this.authVersionList;
        }

        /**
         * @return config
         */
        public String getConfig() {
            return this.config;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private java.util.List<String> authVersionList; 
            private String config; 
            private Integer totalCount; 
            private String type; 

            private Builder() {
            } 

            private Builder(OverallList model) {
                this.authVersionList = model.authVersionList;
                this.config = model.config;
                this.totalCount = model.totalCount;
                this.type = model.type;
            } 

            /**
             * <p>The editions of Security Center.</p>
             */
            public Builder authVersionList(java.util.List<String> authVersionList) {
                this.authVersionList = authVersionList;
                return this;
            }

            /**
             * <p>Indicates the status of the switch. Valid values:</p>
             * <ul>
             * <li><strong>off</strong></li>
             * <li><strong>on</strong></li>
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
             * <p>The total number of entries that are returned.</p>
             * 
             * <strong>example:</strong>
             * <p>184</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            /**
             * <p>The type of the configuration. Valid values:</p>
             * <ul>
             * <li><strong>kdump_switch</strong>: Active defense experience optimization.</li>
             * <li><strong>threat_detect</strong>: Adaptive threat detection.</li>
             * <li><strong>suspicious_aggregation</strong>: Alert association.</li>
             * <li><strong>alidetect</strong>: File detection.</li>
             * <li><strong>USER-ENABLE-SWITCH-TYPE_38857</strong>: Entrance service performs high-risk operations (Linux).</li>
             * <li><strong>USER-ENABLE-SWITCH-TYPE_50858</strong>: Web service performs high-risk operations (Linux).</li>
             * <li><strong>USER-ENABLE-SWITCH-TYPE_50859</strong>: Entrance service performs suspicious operations (Linux).</li>
             * <li><strong>USER-ENABLE-SWITCH-TYPE_50862</strong>: Cloud Assistant advanced protection (Linux).</li>
             * <li><strong>USER-ENABLE-SWITCH-TYPE_50867</strong>: Injects malicious files (Linux).</li>
             * <li><strong>USER-ENABLE-SWITCH-TYPE_50868</strong>: Injects suspicious files (Linux).</li>
             * <li><strong>USER-ENABLE-SWITCH-TYPE_64025</strong>: Entrance service executes commands in an enhanced mode (Linux).</li>
             * <li><strong>USER-ENABLE-SWITCH-TYPE_51229</strong>: Browser service performs high-risk operations (Windows).</li>
             * <li><strong>USER-ENABLE-SWITCH-TYPE_51230</strong>: Entrance service performs suspicious operations (Windows).</li>
             * <li><strong>USER-ENABLE-SWITCH-TYPE_51232</strong>: System processes perform high-risk operations (Windows).</li>
             * <li><strong>USER-ENABLE-SWITCH-TYPE_51233</strong>: Java service performs high-risk operations (Windows).</li>
             * <li><strong>USER-ENABLE-SWITCH-TYPE_51234</strong>: Office components perform high-risk operations (Windows).</li>
             * <li><strong>USER-ENABLE-SWITCH-TYPE_51235</strong>: Web service performs high-risk operations (Windows).</li>
             * <li><strong>USER-ENABLE-SWITCH-TYPE_52820</strong>: Injects malicious files (Windows).</li>
             * <li><strong>USER-ENABLE-SWITCH-TYPE_52826</strong>: Entrance service performs high-risk operations (Windows).</li>
             * <li><strong>USER-ENABLE-SWITCH-TYPE_55251</strong>: Database services perform high-risk operations (Windows).</li>
             * <li><strong>USER-ENABLE-SWITCH-TYPE_63725</strong>: Entrance service injects suspicious scripts or binary files (Windows).</li>
             * <li><strong>USER-ENABLE-SWITCH-TYPE_3277</strong>: Suspicious process startup (Linux).</li>
             * <li><strong>USER-ENABLE-SWITCH-TYPE_50983</strong>: Obfuscated commands (Linux).</li>
             * <li><strong>USER-ENABLE-SWITCH-TYPE_51200</strong>: Uses command line to download and run malicious files (Linux).</li>
             * <li><strong>USER-ENABLE-SWITCH-TYPE_71131</strong>: Entrance service executes sequence of suspicious behavior (Linux).</li>
             * <li><strong>USER-ENABLE-SWITCH-TYPE_51225</strong>: Powershell executes high-risk commands (Windows).</li>
             * <li><strong>USER-ENABLE-SWITCH-TYPE_51226</strong>: Powershell executes suspicious commands (Windows).</li>
             * <li><strong>USER-ENABLE-SWITCH-TYPE_52821</strong>: Suspicious process startup (Windows).</li>
             * <li><strong>USER-ENABLE-SWITCH-TYPE_57242</strong>: Malicious command execution (Windows).</li>
             * <li><strong>USER-ENABLE-SWITCH-TYPE_57340</strong>: Uses command line to download and run malicious files (Windows).</li>
             * <li><strong>USER-ENABLE-SWITCH-TYPE_39659</strong>: Sensitive registry key protection (Windows).</li>
             * <li><strong>USER-ENABLE-SWITCH-TYPE_52816</strong>: High-risk account manipulation behavior (Windows).</li>
             * <li><strong>USER-ENABLE-SWITCH-TYPE_54365</strong>: Creates service auto-startup items (Windows).</li>
             * <li><strong>USER-ENABLE-SWITCH-TYPE_54366</strong>: Creates high-risk auto-startup items (Windows).</li>
             * <li><strong>USER-ENABLE-SWITCH-TYPE_54367</strong>: Creates scheduled task auto-startup items (Windows).</li>
             * <li><strong>USER-ENABLE-SWITCH-TYPE_54368</strong>: Creates registry auto-startup items (Windows).</li>
             * <li><strong>USER-ENABLE-SWITCH-TYPE_54369</strong>: Creates WMI auto-startup items (Windows).</li>
             * <li><strong>USER-ENABLE-SWITCH-TYPE_50869</strong>: Unauthorized execution of high-risk commands (Linux).</li>
             * <li><strong>USER-ENABLE-SWITCH-TYPE_53272</strong>: Exploits kernel vulnerabilities to elevate privileges (Linux).</li>
             * <li><strong>USER-ENABLE-SWITCH-TYPE_54395</strong>: Unauthorized reading and writing of sensitive files (Linux).</li>
             * <li><strong>USER-ENABLE-SWITCH-TYPE_57897</strong>: Suspected privilege escalation (Linux).</li>
             * <li><strong>USER-ENABLE-SWITCH-TYPE_52825</strong>: Unauthorized execution of high-risk commands (Windows).</li>
             * <li><strong>USER-ENABLE-SWITCH-TYPE_5507</strong>: Malicious drivers (Linux).</li>
             * <li><strong>USER-ENABLE-SWITCH-TYPE_50876</strong>: Uninstalls security software (Linux).</li>
             * <li><strong>USER-ENABLE-SWITCH-TYPE_53168</strong>: Process debugging (Linux).</li>
             * <li><strong>USER-ENABLE-SWITCH-TYPE_54699</strong>: Hijacks dynamic link library (Linux).</li>
             * <li><strong>USER-ENABLE-SWITCH-TYPE_62981</strong>: Bypasses security monitoring (Linux).</li>
             * <li><strong>USER-ENABLE-SWITCH-TYPE_52815</strong>: Loads high-risk drivers (Windows).</li>
             * <li><strong>USER-ENABLE-SWITCH-TYPE_52823</strong>: Runs high-risk anti-rootkit (ARK) tools (Windows).</li>
             * <li><strong>USER-ENABLE-SWITCH-TYPE_54373</strong>: Uninstalls security software (Windows).</li>
             * <li><strong>USER-ENABLE-SWITCH-TYPE_54374</strong>: Intrusion trace cleanup (Windows).</li>
             * <li><strong>USER-ENABLE-SWITCH-TYPE_54265</strong>: Hijacks the pluggable authentication module (PAM) (Linux).</li>
             * <li><strong>USER-ENABLE-SWITCH-TYPE_54953</strong>: Hashdump attack (Linux).</li>
             * <li><strong>USER-ENABLE-SWITCH-TYPE_54383</strong>: MimiKatz credential stealing (Windows).</li>
             * <li><strong>USER-ENABLE-SWITCH-TYPE_54384</strong>: Hashdump attack (Windows).</li>
             * <li><strong>USER-ENABLE-SWITCH-TYPE_50861</strong>: Information detection (Linux).</li>
             * <li><strong>USER-ENABLE-SWITCH-TYPE_52818</strong>: Information detection (Windows).</li>
             * <li><strong>USER-ENABLE-SWITCH-TYPE_54034</strong>: Intranet scan (Linux).</li>
             * <li><strong>USER-ENABLE-SWITCH-TYPE_51228</strong>: High-risk lateral penetration tools (Windows).</li>
             * <li><strong>USER-ENABLE-SWITCH-TYPE_50870</strong>: Rebound shell (Linux).</li>
             * <li><strong>USER-ENABLE-SWITCH-TYPE_50873</strong>: WebShell executes commands.</li>
             * <li><strong>USER-ENABLE-SWITCH-TYPE_51236</strong>: Rebound shell (Windows).</li>
             * <li><strong>USER-ENABLE-SWITCH-TYPE_50877</strong>: Malicious program communication (Linux).</li>
             * <li><strong>USER-ENABLE-SWITCH-TYPE_50884</strong>: Suspicious worm script behavior (Linux).</li>
             * <li><strong>USER-ENABLE-SWITCH-TYPE_50885</strong>: Malicious script behavior (Linux).</li>
             * <li><strong>USER-ENABLE-SWITCH-TYPE_51201</strong>: Ransomware (Linux).</li>
             * <li><strong>USER-ENABLE-SWITCH-TYPE_51202</strong>: Suspected extortion (Linux).</li>
             * <li><strong>USER-ENABLE-SWITCH-TYPE_52827</strong>: Ransomware (Windows).</li>
             * <li><strong>USER-ENABLE-SWITCH-TYPE_52828</strong>: Suspected extortion (Windows).</li>
             * <li><strong>USER-ENABLE-SWITCH-TYPE_52829</strong>: Deletes system backup behavior (Windows).</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>kdump_switch</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public OverallList build() {
                return new OverallList(this);
            } 

        } 

    }
}
