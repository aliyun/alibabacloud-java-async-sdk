// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCommonOverallConfigListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCommonOverallConfigListResponseBody</p>
 */
public class DescribeCommonOverallConfigListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("OverallList")
    private java.util.List < OverallList> overallList;

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

    /**
     * @return overallList
     */
    public java.util.List < OverallList> getOverallList() {
        return this.overallList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < OverallList> overallList; 
        private String requestId; 

        /**
         * An array that consists of the configurations of features.
         */
        public Builder overallList(java.util.List < OverallList> overallList) {
            this.overallList = overallList;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeCommonOverallConfigListResponseBody build() {
            return new DescribeCommonOverallConfigListResponseBody(this);
        } 

    } 

    public static class OverallList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthVersionList")
        private java.util.List < String > authVersionList;

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
        public java.util.List < String > getAuthVersionList() {
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
            private java.util.List < String > authVersionList; 
            private String config; 
            private Integer totalCount; 
            private String type; 

            /**
             * AuthVersionList.
             */
            public Builder authVersionList(java.util.List < String > authVersionList) {
                this.authVersionList = authVersionList;
                return this;
            }

            /**
             * Indicates the status of the switch. Valid values:
             * <p>
             * 
             * *   **off**
             * *   **on**
             */
            public Builder config(String config) {
                this.config = config;
                return this;
            }

            /**
             * The total number of entries that are returned.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            /**
             * The type of the configuration. Valid values:
             * <p>
             * 
             * *   **kdump_switch**: Active defense experience optimization.
             * *   **threat_detect**: Adaptive threat detection.
             * *   **suspicious_aggregation**: Alert association.
             * *   **alidetect**: File detection.
             * *   **USER-ENABLE-SWITCH-TYPE\_38857**: Entrance service performs high-risk operations (Linux).
             * *   **USER-ENABLE-SWITCH-TYPE\_50858**: Web service performs high-risk operations (Linux).
             * *   **USER-ENABLE-SWITCH-TYPE\_50859**: Entrance service performs suspicious operations (Linux).
             * *   **USER-ENABLE-SWITCH-TYPE\_50862**: Cloud Assistant advanced protection (Linux).
             * *   **USER-ENABLE-SWITCH-TYPE\_50867**: Injects malicious files (Linux).
             * *   **USER-ENABLE-SWITCH-TYPE\_50868**: Injects suspicious files (Linux).
             * *   **USER-ENABLE-SWITCH-TYPE\_64025**: Entrance service executes commands in an enhanced mode (Linux).
             * *   **USER-ENABLE-SWITCH-TYPE\_51229**: Browser service performs high-risk operations (Windows).
             * *   **USER-ENABLE-SWITCH-TYPE\_51230**: Entrance service performs suspicious operations (Windows).
             * *   **USER-ENABLE-SWITCH-TYPE\_51232**: System processes perform high-risk operations (Windows).
             * *   **USER-ENABLE-SWITCH-TYPE\_51233**: Java service performs high-risk operations (Windows).
             * *   **USER-ENABLE-SWITCH-TYPE\_51234**: Office components perform high-risk operations (Windows).
             * *   **USER-ENABLE-SWITCH-TYPE\_51235**: Web service performs high-risk operations (Windows).
             * *   **USER-ENABLE-SWITCH-TYPE\_52820**: Injects malicious files (Windows).
             * *   **USER-ENABLE-SWITCH-TYPE\_52826**: Entrance service performs high-risk operations (Windows).
             * *   **USER-ENABLE-SWITCH-TYPE\_55251**: Database services perform high-risk operations (Windows).
             * *   **USER-ENABLE-SWITCH-TYPE\_63725**: Entrance service injects suspicious scripts or binary files (Windows).
             * *   **USER-ENABLE-SWITCH-TYPE\_3277**: Suspicious process startup (Linux).
             * *   **USER-ENABLE-SWITCH-TYPE\_50983**: Obfuscated commands (Linux).
             * *   **USER-ENABLE-SWITCH-TYPE\_51200**: Uses command line to download and run malicious files (Linux).
             * *   **USER-ENABLE-SWITCH-TYPE\_71131**: Entrance service executes sequence of suspicious behavior (Linux).
             * *   **USER-ENABLE-SWITCH-TYPE\_51225**: Powershell executes high-risk commands (Windows).
             * *   **USER-ENABLE-SWITCH-TYPE\_51226**: Powershell executes suspicious commands (Windows).
             * *   **USER-ENABLE-SWITCH-TYPE\_52821**: Suspicious process startup (Windows).
             * *   **USER-ENABLE-SWITCH-TYPE\_57242**: Malicious command execution (Windows).
             * *   **USER-ENABLE-SWITCH-TYPE\_57340**: Uses command line to download and run malicious files (Windows).
             * *   **USER-ENABLE-SWITCH-TYPE\_39659**: Sensitive registry key protection (Windows).
             * *   **USER-ENABLE-SWITCH-TYPE\_52816**: High-risk account manipulation behavior (Windows).
             * *   **USER-ENABLE-SWITCH-TYPE\_54365**: Creates service auto-startup items (Windows).
             * *   **USER-ENABLE-SWITCH-TYPE\_54366**: Creates high-risk auto-startup items (Windows).
             * *   **USER-ENABLE-SWITCH-TYPE\_54367**: Creates scheduled task auto-startup items (Windows).
             * *   **USER-ENABLE-SWITCH-TYPE\_54368**: Creates registry auto-startup items (Windows).
             * *   **USER-ENABLE-SWITCH-TYPE\_54369**: Creates WMI auto-startup items (Windows).
             * *   **USER-ENABLE-SWITCH-TYPE\_50869**: Unauthorized execution of high-risk commands (Linux).
             * *   **USER-ENABLE-SWITCH-TYPE\_53272**: Exploits kernel vulnerabilities to elevate privileges (Linux).
             * *   **USER-ENABLE-SWITCH-TYPE\_54395**: Unauthorized reading and writing of sensitive files (Linux).
             * *   **USER-ENABLE-SWITCH-TYPE\_57897**: Suspected privilege escalation (Linux).
             * *   **USER-ENABLE-SWITCH-TYPE\_52825**: Unauthorized execution of high-risk commands (Windows).
             * *   **USER-ENABLE-SWITCH-TYPE\_5507**: Malicious drivers (Linux).
             * *   **USER-ENABLE-SWITCH-TYPE\_50876**: Uninstalls security software (Linux).
             * *   **USER-ENABLE-SWITCH-TYPE\_53168**: Process debugging (Linux).
             * *   **USER-ENABLE-SWITCH-TYPE\_54699**: Hijacks dynamic link library (Linux).
             * *   **USER-ENABLE-SWITCH-TYPE\_62981**: Bypasses security monitoring (Linux).
             * *   **USER-ENABLE-SWITCH-TYPE\_52815**: Loads high-risk drivers (Windows).
             * *   **USER-ENABLE-SWITCH-TYPE\_52823**: Runs high-risk anti-rootkit (ARK) tools (Windows).
             * *   **USER-ENABLE-SWITCH-TYPE\_54373**: Uninstalls security software (Windows).
             * *   **USER-ENABLE-SWITCH-TYPE\_54374**: Intrusion trace cleanup (Windows).
             * *   **USER-ENABLE-SWITCH-TYPE\_54265**: Hijacks the pluggable authentication module (PAM) (Linux).
             * *   **USER-ENABLE-SWITCH-TYPE\_54953**: Hashdump attack (Linux).
             * *   **USER-ENABLE-SWITCH-TYPE\_54383**: MimiKatz credential stealing (Windows).
             * *   **USER-ENABLE-SWITCH-TYPE\_54384**: Hashdump attack (Windows).
             * *   **USER-ENABLE-SWITCH-TYPE\_50861**: Information detection (Linux).
             * *   **USER-ENABLE-SWITCH-TYPE\_52818**: Information detection (Windows).
             * *   **USER-ENABLE-SWITCH-TYPE\_54034**: Intranet scan (Linux).
             * *   **USER-ENABLE-SWITCH-TYPE\_51228**: High-risk lateral penetration tools (Windows).
             * *   **USER-ENABLE-SWITCH-TYPE\_50870**: Rebound shell (Linux).
             * *   **USER-ENABLE-SWITCH-TYPE\_50873**: WebShell executes commands.
             * *   **USER-ENABLE-SWITCH-TYPE\_51236**: Rebound shell (Windows).
             * *   **USER-ENABLE-SWITCH-TYPE\_50877**: Malicious program communication (Linux).
             * *   **USER-ENABLE-SWITCH-TYPE\_50884**: Suspicious worm script behavior (Linux).
             * *   **USER-ENABLE-SWITCH-TYPE\_50885**: Malicious script behavior (Linux).
             * *   **USER-ENABLE-SWITCH-TYPE\_51201**: Ransomware (Linux).
             * *   **USER-ENABLE-SWITCH-TYPE\_51202**: Suspected extortion (Linux).
             * *   **USER-ENABLE-SWITCH-TYPE\_52827**: Ransomware (Windows).
             * *   **USER-ENABLE-SWITCH-TYPE\_52828**: Suspected extortion (Windows).
             * *   **USER-ENABLE-SWITCH-TYPE\_52829**: Deletes system backup behavior (Windows).
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
