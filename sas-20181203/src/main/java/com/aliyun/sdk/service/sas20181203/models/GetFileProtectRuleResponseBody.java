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
 * {@link GetFileProtectRuleResponseBody} extends {@link TeaModel}
 *
 * <p>GetFileProtectRuleResponseBody</p>
 */
public class GetFileProtectRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetFileProtectRuleResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFileProtectRuleResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetFileProtectRuleResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The response parameters.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>C0DF9057-67C5-574D-A2D2-0CA9AC74C4D3</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetFileProtectRuleResponseBody build() {
            return new GetFileProtectRuleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetFileProtectRuleResponseBody} extends {@link TeaModel}
     *
     * <p>GetFileProtectRuleResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Action")
        private String action;

        @com.aliyun.core.annotation.NameInMap("AlertLevel")
        private Integer alertLevel;

        @com.aliyun.core.annotation.NameInMap("FileOps")
        private java.util.List<String> fileOps;

        @com.aliyun.core.annotation.NameInMap("FilePaths")
        private java.util.List<String> filePaths;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Platform")
        private String platform;

        @com.aliyun.core.annotation.NameInMap("ProcPaths")
        private java.util.List<String> procPaths;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("SwitchId")
        private String switchId;

        private Data(Builder builder) {
            this.action = builder.action;
            this.alertLevel = builder.alertLevel;
            this.fileOps = builder.fileOps;
            this.filePaths = builder.filePaths;
            this.id = builder.id;
            this.platform = builder.platform;
            this.procPaths = builder.procPaths;
            this.ruleName = builder.ruleName;
            this.status = builder.status;
            this.switchId = builder.switchId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return action
         */
        public String getAction() {
            return this.action;
        }

        /**
         * @return alertLevel
         */
        public Integer getAlertLevel() {
            return this.alertLevel;
        }

        /**
         * @return fileOps
         */
        public java.util.List<String> getFileOps() {
            return this.fileOps;
        }

        /**
         * @return filePaths
         */
        public java.util.List<String> getFilePaths() {
            return this.filePaths;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return platform
         */
        public String getPlatform() {
            return this.platform;
        }

        /**
         * @return procPaths
         */
        public java.util.List<String> getProcPaths() {
            return this.procPaths;
        }

        /**
         * @return ruleName
         */
        public String getRuleName() {
            return this.ruleName;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return switchId
         */
        public String getSwitchId() {
            return this.switchId;
        }

        public static final class Builder {
            private String action; 
            private Integer alertLevel; 
            private java.util.List<String> fileOps; 
            private java.util.List<String> filePaths; 
            private Long id; 
            private String platform; 
            private java.util.List<String> procPaths; 
            private String ruleName; 
            private Integer status; 
            private String switchId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.action = model.action;
                this.alertLevel = model.alertLevel;
                this.fileOps = model.fileOps;
                this.filePaths = model.filePaths;
                this.id = model.id;
                this.platform = model.platform;
                this.procPaths = model.procPaths;
                this.ruleName = model.ruleName;
                this.status = model.status;
                this.switchId = model.switchId;
            } 

            /**
             * <p>The handling method of the rule. Valid values:</p>
             * <ol>
             * <li>pass: allow</li>
             * <li>alert</li>
             * </ol>
             * 
             * <strong>example:</strong>
             * <p>pass</p>
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * <p>The severity of alerts. Valid values:</p>
             * <ul>
             * <li>0: does not generate alerts</li>
             * <li>1: sends notifications</li>
             * <li>2: suspicious</li>
             * <li>3: high-risk</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder alertLevel(Integer alertLevel) {
                this.alertLevel = alertLevel;
                return this;
            }

            /**
             * <p>The operations performed on the files.</p>
             */
            public Builder fileOps(java.util.List<String> fileOps) {
                this.fileOps = fileOps;
                return this;
            }

            /**
             * <p>The paths to the monitored files.</p>
             */
            public Builder filePaths(java.util.List<String> filePaths) {
                this.filePaths = filePaths;
                return this;
            }

            /**
             * <p>The ID of the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>44616</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The type of the operating system. Valid values:</p>
             * <ul>
             * <li><strong>windows</strong>: Windows</li>
             * <li><strong>linux</strong>: Linux</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>linux</p>
             */
            public Builder platform(String platform) {
                this.platform = platform;
                return this;
            }

            /**
             * <p>The paths to the monitored processes.</p>
             */
            public Builder procPaths(java.util.List<String> procPaths) {
                this.procPaths = procPaths;
                return this;
            }

            /**
             * <p>The name of the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>test-000</p>
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * <p>The status of the rule. Valid values:</p>
             * <ol>
             * <li>0: disabled</li>
             * <li>1: enabled</li>
             * </ol>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The switch ID of the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>FILE_PROTECT_RULE_SWITCH_TYPE_0000</p>
             */
            public Builder switchId(String switchId) {
                this.switchId = switchId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
