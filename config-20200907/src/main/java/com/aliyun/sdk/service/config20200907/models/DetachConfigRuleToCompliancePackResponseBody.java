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
 * {@link DetachConfigRuleToCompliancePackResponseBody} extends {@link TeaModel}
 *
 * <p>DetachConfigRuleToCompliancePackResponseBody</p>
 */
public class DetachConfigRuleToCompliancePackResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("OperateRuleResult")
    private OperateRuleResult operateRuleResult;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DetachConfigRuleToCompliancePackResponseBody(Builder builder) {
        this.operateRuleResult = builder.operateRuleResult;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DetachConfigRuleToCompliancePackResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DetachConfigRuleToCompliancePackResponseBody model) {
            this.operateRuleResult = model.operateRuleResult;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The results of the operations to remove one or more rules.</p>
         */
        public Builder operateRuleResult(OperateRuleResult operateRuleResult) {
            this.operateRuleResult = operateRuleResult;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1AC7AED1-172F-42AE-9C12-295BC2ADB12A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DetachConfigRuleToCompliancePackResponseBody build() {
            return new DetachConfigRuleToCompliancePackResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DetachConfigRuleToCompliancePackResponseBody} extends {@link TeaModel}
     *
     * <p>DetachConfigRuleToCompliancePackResponseBody</p>
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

            private Builder() {
            } 

            private Builder(OperateRuleItemList model) {
                this.configRuleId = model.configRuleId;
                this.errorCode = model.errorCode;
                this.success = model.success;
            } 

            /**
             * <p>The rule ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cr-6cc4626622af00e7****</p>
             */
            public Builder configRuleId(String configRuleId) {
                this.configRuleId = configRuleId;
                return this;
            }

            /**
             * <p>The error code returned.</p>
             * <ul>
             * <li>This parameter is empty if the rule is removed from the compliance package.</li>
             * <li>An error code is returned if the rule fails to be removed from the compliance package. For more information about error codes, see <a href="https://error-center.alibabacloud.com/status/product/Config">Error codes</a>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ConfigRuleNotExists</p>
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
             * <p>true</p>
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
     * {@link DetachConfigRuleToCompliancePackResponseBody} extends {@link TeaModel}
     *
     * <p>DetachConfigRuleToCompliancePackResponseBody</p>
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

            private Builder() {
            } 

            private Builder(OperateRuleResult model) {
                this.operateRuleItemList = model.operateRuleItemList;
            } 

            /**
             * <p>The result of the operation to remove the rule.</p>
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
