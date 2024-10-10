// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetFileDetectReportResponseBody} extends {@link TeaModel}
 *
 * <p>GetFileDetectReportResponseBody</p>
 */
public class GetFileDetectReportResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetFileDetectReportResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFileDetectReportResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * <p>The status code that is returned. The status code <strong>200</strong> indicates that the request was successful. Other status codes indicate that the request failed. You can identify the cause of the failure based on the status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The response parameters.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A4EB8B1C-1DEC-5E18-BCD0-D1BBB393XXXX</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetFileDetectReportResponseBody build() {
            return new GetFileDetectReportResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetFileDetectReportResponseBody} extends {@link TeaModel}
     *
     * <p>GetFileDetectReportResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Basic")
        private String basic;

        @com.aliyun.core.annotation.NameInMap("FileHash")
        private String fileHash;

        @com.aliyun.core.annotation.NameInMap("Filename")
        private String filename;

        @com.aliyun.core.annotation.NameInMap("HasData")
        private Boolean hasData;

        @com.aliyun.core.annotation.NameInMap("Intelligences")
        private String intelligences;

        @com.aliyun.core.annotation.NameInMap("Sandbox")
        private String sandbox;

        @com.aliyun.core.annotation.NameInMap("ShowTab")
        private Boolean showTab;

        @com.aliyun.core.annotation.NameInMap("ThreatLevel")
        private Long threatLevel;

        @com.aliyun.core.annotation.NameInMap("ThreatTypes")
        private String threatTypes;

        private Data(Builder builder) {
            this.basic = builder.basic;
            this.fileHash = builder.fileHash;
            this.filename = builder.filename;
            this.hasData = builder.hasData;
            this.intelligences = builder.intelligences;
            this.sandbox = builder.sandbox;
            this.showTab = builder.showTab;
            this.threatLevel = builder.threatLevel;
            this.threatTypes = builder.threatTypes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return basic
         */
        public String getBasic() {
            return this.basic;
        }

        /**
         * @return fileHash
         */
        public String getFileHash() {
            return this.fileHash;
        }

        /**
         * @return filename
         */
        public String getFilename() {
            return this.filename;
        }

        /**
         * @return hasData
         */
        public Boolean getHasData() {
            return this.hasData;
        }

        /**
         * @return intelligences
         */
        public String getIntelligences() {
            return this.intelligences;
        }

        /**
         * @return sandbox
         */
        public String getSandbox() {
            return this.sandbox;
        }

        /**
         * @return showTab
         */
        public Boolean getShowTab() {
            return this.showTab;
        }

        /**
         * @return threatLevel
         */
        public Long getThreatLevel() {
            return this.threatLevel;
        }

        /**
         * @return threatTypes
         */
        public String getThreatTypes() {
            return this.threatTypes;
        }

        public static final class Builder {
            private String basic; 
            private String fileHash; 
            private String filename; 
            private Boolean hasData; 
            private String intelligences; 
            private String sandbox; 
            private Boolean showTab; 
            private Long threatLevel; 
            private String threatTypes; 

            /**
             * <p>The basic information about the detected file.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *         &quot;sha256&quot;: &quot;&quot;,
             *         &quot;sha512&quot;: &quot;&quot;,
             *         &quot;source&quot;: &quot;aegis&quot;,
             *         &quot;gmt_first_submit&quot;: &quot;&quot;,
             *         &quot;sha1&quot;: &quot;&quot;,
             *         &quot;virus_result&quot;: &quot;&quot;,
             *         &quot;webshell_result&quot;: &quot;&quot;,
             *         &quot;gmt_update&quot;: &quot;&quot;,
             *         &quot;sandbox_result&quot;: &quot;2&quot;,
             *         &quot;fileSize&quot;: &quot;363752&quot;,
             *         &quot;virus_name&quot;: &quot;&quot;,
             *     }</p>
             */
            public Builder basic(String basic) {
                this.basic = basic;
                return this;
            }

            /**
             * <p>The hash value of the file.</p>
             * 
             * <strong>example:</strong>
             * <p>c42b5f6bde0b730ece2923266333****</p>
             */
            public Builder fileHash(String fileHash) {
                this.fileHash = fileHash;
                return this;
            }

            /**
             * <p>The name of the file.</p>
             * 
             * <strong>example:</strong>
             * <p>test.zip</p>
             */
            public Builder filename(String filename) {
                this.filename = filename;
                return this;
            }

            /**
             * <p>Indicates whether the file data exists in the cloud sandbox. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder hasData(Boolean hasData) {
                this.hasData = hasData;
                return this;
            }

            /**
             * <p>The threat intelligence event, which is a JSON array.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>The threat type. The value is an array. The elements in the array can be DDoS trojans, mining programs, network layer intrusions, network service scans, network sharing and discovery, mining pools, exploits, dark webs, malicious logons, malicious download sources, C&amp;C servers, webshells, and web attacks.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>[&quot;The threat type&quot;]</p>
             */
            public Builder intelligences(String intelligences) {
                this.intelligences = intelligences;
                return this;
            }

            /**
             * <p>The details of the cloud sandbox check results.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;BehaviorData&quot;: {}, &quot;ProcessData&quot;: {}, &quot;SandboxData&quot;: {}, &quot;AttackData&quot;: [], &quot;NetworkData&quot;: {}, &quot;SolutionData&quot;: {}, &quot;FileData&quot;: {}}</p>
             */
            public Builder sandbox(String sandbox) {
                this.sandbox = sandbox;
                return this;
            }

            /**
             * <p>Indicates whether the check report is displayed. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder showTab(Boolean showTab) {
                this.showTab = showTab;
                return this;
            }

            /**
             * <p>The threat level. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: normal</li>
             * <li><strong>1</strong>: suspicious</li>
             * <li><strong>2</strong>: high</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder threatLevel(Long threatLevel) {
                this.threatLevel = threatLevel;
                return this;
            }

            /**
             * <p>The risk tags and server tags that are generated by analyzing threat intelligence and security events. The value is a string array. The array includes the following elements:</p>
             * <ul>
             * <li><strong>threat_type_desc</strong>: the threat type.</li>
             * <li><strong>last_find_time</strong>: the last time the threat was detected.</li>
             * <li><strong>risk_type</strong>: indicates whether the tag is malicious. The value 0 indicates that the tag is not malicious. The value 1 indicates that the tag is malicious. The value -1 indicates that whether the tag type is malicious is unknown.</li>
             * <li><strong>threat_type</strong>: the threat type. The value is an array. The elements in the array can be network layer intrusion, network service scanning, network sharing and discovery, mining pool, exploits, darknet, malicious logon, malicious download source, central control, web shell, and web attack.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;threat_type_desc&quot;: &quot;test&quot;,&quot;risk_type&quot;: 1,&quot;threat_type&quot;: &quot;&quot;}]</p>
             */
            public Builder threatTypes(String threatTypes) {
                this.threatTypes = threatTypes;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
