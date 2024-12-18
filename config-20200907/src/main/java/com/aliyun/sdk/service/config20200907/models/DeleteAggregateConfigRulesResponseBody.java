// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

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
 * {@link DeleteAggregateConfigRulesResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteAggregateConfigRulesResponseBody</p>
 */
public class DeleteAggregateConfigRulesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("OperateRuleResult")
    private OperateRuleResult operateRuleResult;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DeleteAggregateConfigRulesResponseBody(Builder builder) {
        this.operateRuleResult = builder.operateRuleResult;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAggregateConfigRulesResponseBody create() {
        return builder().build();
    }

    /**
     * @return operateRuleResult
     */
    public OperateRuleResult getOperateRuleResult() {
        return this.operateRuleResult;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private OperateRuleResult operateRuleResult; 
        private String requestId; 

        /**
         * <p>The results of the delete operations.</p>
         */
        public Builder operateRuleResult(OperateRuleResult operateRuleResult) {
            this.operateRuleResult = operateRuleResult;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6EC7AED1-172F-42AE-9C12-295BC2ADB751</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteAggregateConfigRulesResponseBody build() {
            return new DeleteAggregateConfigRulesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DeleteAggregateConfigRulesResponseBody} extends {@link TeaModel}
     *
     * <p>DeleteAggregateConfigRulesResponseBody</p>
     */
    public static class OperateRuleItemList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfigRuleId")
        private String configRuleId;

        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Boolean success;

        private OperateRuleItemList(Builder builder) {
            this.configRuleId = builder.configRuleId;
            this.errorCode = builder.errorCode;
            this.success = builder.success;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OperateRuleItemList create() {
            return builder().build();
        }

        /**
         * @return configRuleId
         */
        public String getConfigRuleId() {
            return this.configRuleId;
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return success
         */
        public Boolean getSuccess() {
            return this.success;
        }

        public static final class Builder {
            private String configRuleId; 
            private String errorCode; 
            private Boolean success; 

            /**
             * <p>The rule ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cr-4e3d626622af0080****</p>
             */
            public Builder configRuleId(String configRuleId) {
                this.configRuleId = configRuleId;
                return this;
            }

            /**
             * <p>The error code returned.</p>
             * <ul>
             * <li>If the rule is deleted, no error code is returned.</li>
             * <li>If the rule fails to be deleted, an error code is returned. For more information about error codes, see <a href="https://error-center.alibabacloud.com/status/product/Config">Error codes</a>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ConfigRuleCanNotDelete</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>Indicates whether the request was successful. Valid values:</p>
             * <ul>
             * <li>true: The request was successful.</li>
             * <li>false: The request failed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder success(Boolean success) {
                this.success = success;
                return this;
            }

            public OperateRuleItemList build() {
                return new OperateRuleItemList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DeleteAggregateConfigRulesResponseBody} extends {@link TeaModel}
     *
     * <p>DeleteAggregateConfigRulesResponseBody</p>
     */
    public static class OperateRuleResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OperateRuleItemList")
        private java.util.List<OperateRuleItemList> operateRuleItemList;

        private OperateRuleResult(Builder builder) {
            this.operateRuleItemList = builder.operateRuleItemList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OperateRuleResult create() {
            return builder().build();
        }

        /**
         * @return operateRuleItemList
         */
        public java.util.List<OperateRuleItemList> getOperateRuleItemList() {
            return this.operateRuleItemList;
        }

        public static final class Builder {
            private java.util.List<OperateRuleItemList> operateRuleItemList; 

            /**
             * <p>The details of the result.</p>
             */
            public Builder operateRuleItemList(java.util.List<OperateRuleItemList> operateRuleItemList) {
                this.operateRuleItemList = operateRuleItemList;
                return this;
            }

            public OperateRuleResult build() {
                return new OperateRuleResult(this);
            } 

        } 

    }
}
