// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

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
 * {@link DescribeParameterModificationHistoryResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeParameterModificationHistoryResponseBody</p>
 */
public class DescribeParameterModificationHistoryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("HistoricalParameters")
    private HistoricalParameters historicalParameters;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeParameterModificationHistoryResponseBody model) {
            this.historicalParameters = model.historicalParameters;
            this.requestId = model.requestId;
        } 

        /**
         * HistoricalParameters.
         */
        public Builder historicalParameters(HistoricalParameters historicalParameters) {
            this.historicalParameters = historicalParameters;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>963C20F0-7CE1-4591-AAF3-6F3CD1CE****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeParameterModificationHistoryResponseBody build() {
            return new DescribeParameterModificationHistoryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeParameterModificationHistoryResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeParameterModificationHistoryResponseBody</p>
     */
    public static class HistoricalParameter extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private String modifyTime;

        @com.aliyun.core.annotation.NameInMap("NewParameterValue")
        private String newParameterValue;

        @com.aliyun.core.annotation.NameInMap("OldParameterValue")
        private String oldParameterValue;

        @com.aliyun.core.annotation.NameInMap("ParameterName")
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

            private Builder() {
            } 

            private Builder(HistoricalParameter model) {
                this.modifyTime = model.modifyTime;
                this.newParameterValue = model.newParameterValue;
                this.oldParameterValue = model.oldParameterValue;
                this.parameterName = model.parameterName;
            } 

            /**
             * ModifyTime.
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * NewParameterValue.
             */
            public Builder newParameterValue(String newParameterValue) {
                this.newParameterValue = newParameterValue;
                return this;
            }

            /**
             * OldParameterValue.
             */
            public Builder oldParameterValue(String oldParameterValue) {
                this.oldParameterValue = oldParameterValue;
                return this;
            }

            /**
             * ParameterName.
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
    /**
     * 
     * {@link DescribeParameterModificationHistoryResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeParameterModificationHistoryResponseBody</p>
     */
    public static class HistoricalParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HistoricalParameter")
        private java.util.List<HistoricalParameter> historicalParameter;

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
        public java.util.List<HistoricalParameter> getHistoricalParameter() {
            return this.historicalParameter;
        }

        public static final class Builder {
            private java.util.List<HistoricalParameter> historicalParameter; 

            private Builder() {
            } 

            private Builder(HistoricalParameters model) {
                this.historicalParameter = model.historicalParameter;
            } 

            /**
             * HistoricalParameter.
             */
            public Builder historicalParameter(java.util.List<HistoricalParameter> historicalParameter) {
                this.historicalParameter = historicalParameter;
                return this;
            }

            public HistoricalParameters build() {
                return new HistoricalParameters(this);
            } 

        } 

    }
}
