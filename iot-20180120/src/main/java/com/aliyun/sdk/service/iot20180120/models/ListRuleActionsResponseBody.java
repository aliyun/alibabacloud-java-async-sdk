// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

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
 * {@link ListRuleActionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListRuleActionsResponseBody</p>
 */
public class ListRuleActionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RuleActionList")
    private RuleActionList ruleActionList;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListRuleActionsResponseBody(Builder builder) {
        this.code = builder.code;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.ruleActionList = builder.ruleActionList;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRuleActionsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return ruleActionList
     */
    public RuleActionList getRuleActionList() {
        return this.ruleActionList;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private String errorMessage; 
        private String requestId; 
        private RuleActionList ruleActionList; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListRuleActionsResponseBody model) {
            this.code = model.code;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.ruleActionList = model.ruleActionList;
            this.success = model.success;
        } 

        /**
         * <p>The error code returned if the call fails. For more information about error codes, see <a href="https://help.aliyun.com/document_detail/87387.html">Error codes</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>iot.system.SystemException</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The error message returned if the call fails.</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>22254BDB-3DC1-4643-8D1B-EE0437EF09A9</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>If the call is successful, all configured data forwarding actions of the specified rule are returned. For more information about the returned data, see the following <strong>RuleActionInfo</strong> parameter.</p>
         */
        public Builder ruleActionList(RuleActionList ruleActionList) {
            this.ruleActionList = ruleActionList;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful. </p>
         * <ul>
         * <li><strong>true</strong>: The call was successful.</li>
         * <li><strong>false</strong>: The call failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListRuleActionsResponseBody build() {
            return new ListRuleActionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListRuleActionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListRuleActionsResponseBody</p>
     */
    public static class RuleActionInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Configuration")
        private String configuration;

        @com.aliyun.core.annotation.NameInMap("ErrorActionFlag")
        private Boolean errorActionFlag;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("RuleId")
        private Long ruleId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private RuleActionInfo(Builder builder) {
            this.configuration = builder.configuration;
            this.errorActionFlag = builder.errorActionFlag;
            this.id = builder.id;
            this.ruleId = builder.ruleId;
            this.status = builder.status;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RuleActionInfo create() {
            return builder().build();
        }

        /**
         * @return configuration
         */
        public String getConfiguration() {
            return this.configuration;
        }

        /**
         * @return errorActionFlag
         */
        public Boolean getErrorActionFlag() {
            return this.errorActionFlag;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return ruleId
         */
        public Long getRuleId() {
            return this.ruleId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String configuration; 
            private Boolean errorActionFlag; 
            private Long id; 
            private Long ruleId; 
            private String status; 
            private String type; 

            private Builder() {
            } 

            private Builder(RuleActionInfo model) {
                this.configuration = model.configuration;
                this.errorActionFlag = model.errorActionFlag;
                this.id = model.id;
                this.ruleId = model.ruleId;
                this.status = model.status;
                this.type = model.type;
            } 

            /**
             * <p>The configurations of the data destination.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;endPoint&quot;:&quot;<a href="http://ShanghaiRegion.cn-shanghai.ots.aliyuncs.com%5C%22,%5C%22instanceName%5C%22:%5C%22ShanghaiRegion%5C%22,%5C%22primaryKeys%5C%22:%5B%7B%5C%22columnName%5C%22:%5C%22temperature%5C%22,%5C%22columnType%5C%22:%5C%22INTEGER%5C%22,%5C%22columnValue%5C%22:%5C%22$%7BdeviceName%7D%5C%22%7D%5D,%5C%22regionName%5C%22:%5C%22cn-shanghai%5C%22,%5C%22role%5C%22:%7B%5C%22roleArn%5C%22:%5C%22acs:ram::1231579085******:role/aliyuniotaccessingotsrole%5C%22,%5C%22roleName%5C%22:%5C%22AliyunIOTAccessingOTSRole%5C%22%7D,%5C%22tableName%5C%22:%5C%22iottest%5C%22,%5C%22uid%5C%22:%5C%221231579085******%5C%22%7D">http://ShanghaiRegion.cn-shanghai.ots.aliyuncs.com\&quot;,\&quot;instanceName\&quot;:\&quot;ShanghaiRegion\&quot;,\&quot;primaryKeys\&quot;:[{\&quot;columnName\&quot;:\&quot;temperature\&quot;,\&quot;columnType\&quot;:\&quot;INTEGER\&quot;,\&quot;columnValue\&quot;:\&quot;${deviceName}\&quot;}],\&quot;regionName\&quot;:\&quot;cn-shanghai\&quot;,\&quot;role\&quot;:{\&quot;roleArn\&quot;:\&quot;acs:ram::1231579085******:role/aliyuniotaccessingotsrole\&quot;,\&quot;roleName\&quot;:\&quot;AliyunIOTAccessingOTSRole\&quot;},\&quot;tableName\&quot;:\&quot;iottest\&quot;,\&quot;uid\&quot;:\&quot;1231579085******\&quot;}</a></p>
             */
            public Builder configuration(String configuration) {
                this.configuration = configuration;
                return this;
            }

            /**
             * <p>Indicates whether the data destination is used to receive the error operation data. The error operation data is data that failed to be forwarded two consecutive times.</p>
             * <ul>
             * <li><strong>true</strong>: This destination is used to receive error operation data.</li>
             * <li><strong>false</strong>: This destination is not used to receive error operation data.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder errorActionFlag(Boolean errorActionFlag) {
                this.errorActionFlag = errorActionFlag;
                return this;
            }

            /**
             * <p>The ID of the action in which data is forwarded to the destination.</p>
             * 
             * <strong>example:</strong>
             * <p>139099</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The ID of the rule based on which data is forwarded to the destination.</p>
             * 
             * <strong>example:</strong>
             * <p>10000</p>
             */
            public Builder ruleId(Long ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * <p>The status of the data forwarding action. Valid values:</p>
             * <ul>
             * <li><strong>INIT</strong>: The action is being configured.</li>
             * <li><strong>NORMAL</strong>: The configuration is complete, and the action can run properly.</li>
             * <li><strong>INVALID</strong>: The configuration data is invalid, and the action fails to run.</li>
             * <li><strong>SHORTCUT</strong>: An exception occurs and the data forwarding action is stopped.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NORMAL</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The type of the action in which data is forwarded to a destination. Valid values:</p>
             * <ul>
             * <li><strong>REPUBLISH</strong>: Data is forwarded to a topic.</li>
             * <li><strong>OTS</strong>: Data is stored in Tablestore.</li>
             * <li><strong>MNS</strong>: Data is forwarded to Message Service (MNS).</li>
             * <li><strong>ONS</strong>: Data is forwarded to Message Queue for Apache RocketMQ.</li>
             * <li><strong>TSDB</strong>: Data is stored in Time Series Database.</li>
             * <li><strong>FC</strong>: Data is forwarded to Function Compute.</li>
             * <li><strong>RDS</strong>: Data is forwarded to ApsaraDB RDS.</li>
             * <li><strong>AMQP</strong>: Data is forwarded to an Advanced Message Queuing Protocol (AMQP) consumer group.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>OTS</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public RuleActionInfo build() {
                return new RuleActionInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListRuleActionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListRuleActionsResponseBody</p>
     */
    public static class RuleActionList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RuleActionInfo")
        private java.util.List<RuleActionInfo> ruleActionInfo;

        private RuleActionList(Builder builder) {
            this.ruleActionInfo = builder.ruleActionInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RuleActionList create() {
            return builder().build();
        }

        /**
         * @return ruleActionInfo
         */
        public java.util.List<RuleActionInfo> getRuleActionInfo() {
            return this.ruleActionInfo;
        }

        public static final class Builder {
            private java.util.List<RuleActionInfo> ruleActionInfo; 

            private Builder() {
            } 

            private Builder(RuleActionList model) {
                this.ruleActionInfo = model.ruleActionInfo;
            } 

            /**
             * RuleActionInfo.
             */
            public Builder ruleActionInfo(java.util.List<RuleActionInfo> ruleActionInfo) {
                this.ruleActionInfo = ruleActionInfo;
                return this;
            }

            public RuleActionList build() {
                return new RuleActionList(this);
            } 

        } 

    }
}
