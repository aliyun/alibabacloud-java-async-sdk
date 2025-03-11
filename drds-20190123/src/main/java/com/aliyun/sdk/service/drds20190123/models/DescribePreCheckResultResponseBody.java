// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

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
 * {@link DescribePreCheckResultResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePreCheckResultResponseBody</p>
 */
public class DescribePreCheckResultResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PreCheckResult")
    private PreCheckResult preCheckResult;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribePreCheckResultResponseBody(Builder builder) {
        this.preCheckResult = builder.preCheckResult;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePreCheckResultResponseBody create() {
        return builder().build();
    }

    /**
     * @return preCheckResult
     */
    public PreCheckResult getPreCheckResult() {
        return this.preCheckResult;
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
        private PreCheckResult preCheckResult; 
        private String requestId; 
        private Boolean success; 

        /**
         * <p>Indicates the result of the precheck task.</p>
         */
        public Builder preCheckResult(PreCheckResult preCheckResult) {
            this.preCheckResult = preCheckResult;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>EED1A59A-CFEA-5CF8-BB4A-090E75B3D05E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribePreCheckResultResponseBody build() {
            return new DescribePreCheckResultResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribePreCheckResultResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePreCheckResultResponseBody</p>
     */
    public static class SubCheckItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorMsgCode")
        private String errorMsgCode;

        @com.aliyun.core.annotation.NameInMap("ErrorMsgParams")
        private java.util.List<String> errorMsgParams;

        @com.aliyun.core.annotation.NameInMap("PreCheckItemName")
        private String preCheckItemName;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        private SubCheckItems(Builder builder) {
            this.errorMsgCode = builder.errorMsgCode;
            this.errorMsgParams = builder.errorMsgParams;
            this.preCheckItemName = builder.preCheckItemName;
            this.state = builder.state;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubCheckItems create() {
            return builder().build();
        }

        /**
         * @return errorMsgCode
         */
        public String getErrorMsgCode() {
            return this.errorMsgCode;
        }

        /**
         * @return errorMsgParams
         */
        public java.util.List<String> getErrorMsgParams() {
            return this.errorMsgParams;
        }

        /**
         * @return preCheckItemName
         */
        public String getPreCheckItemName() {
            return this.preCheckItemName;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        public static final class Builder {
            private String errorMsgCode; 
            private java.util.List<String> errorMsgParams; 
            private String preCheckItemName; 
            private String state; 

            /**
             * <p>Indicates the error code that is returned by a subtask.</p>
             * 
             * <strong>example:</strong>
             * <p>1004</p>
             */
            public Builder errorMsgCode(String errorMsgCode) {
                this.errorMsgCode = errorMsgCode;
                return this;
            }

            /**
             * <p>Indicates an error message.</p>
             */
            public Builder errorMsgParams(java.util.List<String> errorMsgParams) {
                this.errorMsgParams = errorMsgParams;
                return this;
            }

            /**
             * <p>Indicates the name of the subtask.</p>
             */
            public Builder preCheckItemName(String preCheckItemName) {
                this.preCheckItemName = preCheckItemName;
                return this;
            }

            /**
             * <p>Indicates the state of the subtask.</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            public SubCheckItems build() {
                return new SubCheckItems(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribePreCheckResultResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePreCheckResultResponseBody</p>
     */
    public static class PreCheckResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PreCheckName")
        private String preCheckName;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("SubCheckItems")
        private java.util.List<SubCheckItems> subCheckItems;

        private PreCheckResult(Builder builder) {
            this.preCheckName = builder.preCheckName;
            this.state = builder.state;
            this.subCheckItems = builder.subCheckItems;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PreCheckResult create() {
            return builder().build();
        }

        /**
         * @return preCheckName
         */
        public String getPreCheckName() {
            return this.preCheckName;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return subCheckItems
         */
        public java.util.List<SubCheckItems> getSubCheckItems() {
            return this.subCheckItems;
        }

        public static final class Builder {
            private String preCheckName; 
            private String state; 
            private java.util.List<SubCheckItems> subCheckItems; 

            /**
             * <p>Indicates the name of the precheck task.</p>
             */
            public Builder preCheckName(String preCheckName) {
                this.preCheckName = preCheckName;
                return this;
            }

            /**
             * <p>Indicates the state of the precheck task.</p>
             * 
             * <strong>example:</strong>
             * <p>FAIL</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * <p>Indicates the details about the subtasks of the precheck task.</p>
             */
            public Builder subCheckItems(java.util.List<SubCheckItems> subCheckItems) {
                this.subCheckItems = subCheckItems;
                return this;
            }

            public PreCheckResult build() {
                return new PreCheckResult(this);
            } 

        } 

    }
}
