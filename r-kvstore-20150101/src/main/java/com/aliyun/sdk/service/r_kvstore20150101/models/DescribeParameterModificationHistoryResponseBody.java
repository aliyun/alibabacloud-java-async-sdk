// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeParameterModificationHistoryResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeParameterModificationHistoryResponseBody</p>
 */
public class DescribeParameterModificationHistoryResponseBody extends TeaModel {
    @NameInMap("HistoricalParameters")
    private HistoricalParameters historicalParameters;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeParameterModificationHistoryResponseBody(Builder builder) {
        this.historicalParameters = builder.historicalParameters;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeParameterModificationHistoryResponseBody create() {
        return builder().build();
    }

    /**
     * @return historicalParameters
     */
    public HistoricalParameters getHistoricalParameters() {
        return this.historicalParameters;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private HistoricalParameters historicalParameters; 
        private String requestId; 

        /**
         * Details of the parameter modification records.
         */
        public Builder historicalParameters(HistoricalParameters historicalParameters) {
            this.historicalParameters = historicalParameters;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeParameterModificationHistoryResponseBody build() {
            return new DescribeParameterModificationHistoryResponseBody(this);
        } 

    } 

    public static class HistoricalParameter extends TeaModel {
        @NameInMap("ModifyTime")
        private String modifyTime;

        @NameInMap("NewParameterValue")
        private String newParameterValue;

        @NameInMap("OldParameterValue")
        private String oldParameterValue;

        @NameInMap("ParameterName")
        private String parameterName;

        private HistoricalParameter(Builder builder) {
            this.modifyTime = builder.modifyTime;
            this.newParameterValue = builder.newParameterValue;
            this.oldParameterValue = builder.oldParameterValue;
            this.parameterName = builder.parameterName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HistoricalParameter create() {
            return builder().build();
        }

        /**
         * @return modifyTime
         */
        public String getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return newParameterValue
         */
        public String getNewParameterValue() {
            return this.newParameterValue;
        }

        /**
         * @return oldParameterValue
         */
        public String getOldParameterValue() {
            return this.oldParameterValue;
        }

        /**
         * @return parameterName
         */
        public String getParameterName() {
            return this.parameterName;
        }

        public static final class Builder {
            private String modifyTime; 
            private String newParameterValue; 
            private String oldParameterValue; 
            private String parameterName; 

            /**
             * The time when the parameter was modified. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * The parameter value after modification.
             */
            public Builder newParameterValue(String newParameterValue) {
                this.newParameterValue = newParameterValue;
                return this;
            }

            /**
             * The parameter value before modification.
             */
            public Builder oldParameterValue(String oldParameterValue) {
                this.oldParameterValue = oldParameterValue;
                return this;
            }

            /**
             * The name of the parameter.
             */
            public Builder parameterName(String parameterName) {
                this.parameterName = parameterName;
                return this;
            }

            public HistoricalParameter build() {
                return new HistoricalParameter(this);
            } 

        } 

    }
    public static class HistoricalParameters extends TeaModel {
        @NameInMap("HistoricalParameter")
        private java.util.List < HistoricalParameter> historicalParameter;

        private HistoricalParameters(Builder builder) {
            this.historicalParameter = builder.historicalParameter;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HistoricalParameters create() {
            return builder().build();
        }

        /**
         * @return historicalParameter
         */
        public java.util.List < HistoricalParameter> getHistoricalParameter() {
            return this.historicalParameter;
        }

        public static final class Builder {
            private java.util.List < HistoricalParameter> historicalParameter; 

            /**
             * HistoricalParameter.
             */
            public Builder historicalParameter(java.util.List < HistoricalParameter> historicalParameter) {
                this.historicalParameter = historicalParameter;
                return this;
            }

            public HistoricalParameters build() {
                return new HistoricalParameters(this);
            } 

        } 

    }
}
