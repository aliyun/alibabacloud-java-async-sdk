// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePreCheckResultResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePreCheckResultResponseBody</p>
 */
public class DescribePreCheckResultResponseBody extends TeaModel {
    @NameInMap("PreCheckResult")
    private PreCheckResult preCheckResult;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
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
         * PreCheckResult.
         */
        public Builder preCheckResult(PreCheckResult preCheckResult) {
            this.preCheckResult = preCheckResult;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribePreCheckResultResponseBody build() {
            return new DescribePreCheckResultResponseBody(this);
        } 

    } 

    public static class SubCheckItems extends TeaModel {
        @NameInMap("ErrorMsgCode")
        private String errorMsgCode;

        @NameInMap("ErrorMsgParams")
        private java.util.List < String > errorMsgParams;

        @NameInMap("PreCheckItemName")
        private String preCheckItemName;

        @NameInMap("State")
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
        public java.util.List < String > getErrorMsgParams() {
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
            private java.util.List < String > errorMsgParams; 
            private String preCheckItemName; 
            private String state; 

            /**
             * ErrorMsgCode.
             */
            public Builder errorMsgCode(String errorMsgCode) {
                this.errorMsgCode = errorMsgCode;
                return this;
            }

            /**
             * ErrorMsgParams.
             */
            public Builder errorMsgParams(java.util.List < String > errorMsgParams) {
                this.errorMsgParams = errorMsgParams;
                return this;
            }

            /**
             * PreCheckItemName.
             */
            public Builder preCheckItemName(String preCheckItemName) {
                this.preCheckItemName = preCheckItemName;
                return this;
            }

            /**
             * State.
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
    public static class PreCheckResult extends TeaModel {
        @NameInMap("PreCheckName")
        private String preCheckName;

        @NameInMap("State")
        private String state;

        @NameInMap("SubCheckItems")
        private java.util.List < SubCheckItems> subCheckItems;

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
        public java.util.List < SubCheckItems> getSubCheckItems() {
            return this.subCheckItems;
        }

        public static final class Builder {
            private String preCheckName; 
            private String state; 
            private java.util.List < SubCheckItems> subCheckItems; 

            /**
             * PreCheckName.
             */
            public Builder preCheckName(String preCheckName) {
                this.preCheckName = preCheckName;
                return this;
            }

            /**
             * State.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * SubCheckItems.
             */
            public Builder subCheckItems(java.util.List < SubCheckItems> subCheckItems) {
                this.subCheckItems = subCheckItems;
                return this;
            }

            public PreCheckResult build() {
                return new PreCheckResult(this);
            } 

        } 

    }
}
