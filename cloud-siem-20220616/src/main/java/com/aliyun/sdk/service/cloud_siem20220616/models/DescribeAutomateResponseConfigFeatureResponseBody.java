// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAutomateResponseConfigFeatureResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAutomateResponseConfigFeatureResponseBody</p>
 */
public class DescribeAutomateResponseConfigFeatureResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private DescribeAutomateResponseConfigFeatureResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAutomateResponseConfigFeatureResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
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
        private Integer code; 
        private java.util.List < Data> data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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

        public DescribeAutomateResponseConfigFeatureResponseBody build() {
            return new DescribeAutomateResponseConfigFeatureResponseBody(this);
        } 

    } 

    public static class RightValueEnums extends TeaModel {
        @NameInMap("Value")
        private String value;

        @NameInMap("ValueMds")
        private String valueMds;

        private RightValueEnums(Builder builder) {
            this.value = builder.value;
            this.valueMds = builder.valueMds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RightValueEnums create() {
            return builder().build();
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        /**
         * @return valueMds
         */
        public String getValueMds() {
            return this.valueMds;
        }

        public static final class Builder {
            private String value; 
            private String valueMds; 

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            /**
             * ValueMds.
             */
            public Builder valueMds(String valueMds) {
                this.valueMds = valueMds;
                return this;
            }

            public RightValueEnums build() {
                return new RightValueEnums(this);
            } 

        } 

    }
    public static class SupportOperators extends TeaModel {
        @NameInMap("HasRightValue")
        private Boolean hasRightValue;

        @NameInMap("Index")
        private Integer index;

        @NameInMap("Operator")
        private String operator;

        @NameInMap("OperatorDescCn")
        private String operatorDescCn;

        @NameInMap("OperatorDescEn")
        private String operatorDescEn;

        @NameInMap("OperatorName")
        private String operatorName;

        @NameInMap("SupportDataType")
        private String supportDataType;

        @NameInMap("SupportTag")
        private java.util.List < String > supportTag;

        private SupportOperators(Builder builder) {
            this.hasRightValue = builder.hasRightValue;
            this.index = builder.index;
            this.operator = builder.operator;
            this.operatorDescCn = builder.operatorDescCn;
            this.operatorDescEn = builder.operatorDescEn;
            this.operatorName = builder.operatorName;
            this.supportDataType = builder.supportDataType;
            this.supportTag = builder.supportTag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SupportOperators create() {
            return builder().build();
        }

        /**
         * @return hasRightValue
         */
        public Boolean getHasRightValue() {
            return this.hasRightValue;
        }

        /**
         * @return index
         */
        public Integer getIndex() {
            return this.index;
        }

        /**
         * @return operator
         */
        public String getOperator() {
            return this.operator;
        }

        /**
         * @return operatorDescCn
         */
        public String getOperatorDescCn() {
            return this.operatorDescCn;
        }

        /**
         * @return operatorDescEn
         */
        public String getOperatorDescEn() {
            return this.operatorDescEn;
        }

        /**
         * @return operatorName
         */
        public String getOperatorName() {
            return this.operatorName;
        }

        /**
         * @return supportDataType
         */
        public String getSupportDataType() {
            return this.supportDataType;
        }

        /**
         * @return supportTag
         */
        public java.util.List < String > getSupportTag() {
            return this.supportTag;
        }

        public static final class Builder {
            private Boolean hasRightValue; 
            private Integer index; 
            private String operator; 
            private String operatorDescCn; 
            private String operatorDescEn; 
            private String operatorName; 
            private String supportDataType; 
            private java.util.List < String > supportTag; 

            /**
             * HasRightValue.
             */
            public Builder hasRightValue(Boolean hasRightValue) {
                this.hasRightValue = hasRightValue;
                return this;
            }

            /**
             * Index.
             */
            public Builder index(Integer index) {
                this.index = index;
                return this;
            }

            /**
             * Operator.
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * OperatorDescCn.
             */
            public Builder operatorDescCn(String operatorDescCn) {
                this.operatorDescCn = operatorDescCn;
                return this;
            }

            /**
             * OperatorDescEn.
             */
            public Builder operatorDescEn(String operatorDescEn) {
                this.operatorDescEn = operatorDescEn;
                return this;
            }

            /**
             * OperatorName.
             */
            public Builder operatorName(String operatorName) {
                this.operatorName = operatorName;
                return this;
            }

            /**
             * SupportDataType.
             */
            public Builder supportDataType(String supportDataType) {
                this.supportDataType = supportDataType;
                return this;
            }

            /**
             * SupportTag.
             */
            public Builder supportTag(java.util.List < String > supportTag) {
                this.supportTag = supportTag;
                return this;
            }

            public SupportOperators build() {
                return new SupportOperators(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("DataType")
        private String dataType;

        @NameInMap("Feature")
        private String feature;

        @NameInMap("RightValueEnums")
        private java.util.List < RightValueEnums> rightValueEnums;

        @NameInMap("SupportOperators")
        private java.util.List < SupportOperators> supportOperators;

        private Data(Builder builder) {
            this.dataType = builder.dataType;
            this.feature = builder.feature;
            this.rightValueEnums = builder.rightValueEnums;
            this.supportOperators = builder.supportOperators;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return dataType
         */
        public String getDataType() {
            return this.dataType;
        }

        /**
         * @return feature
         */
        public String getFeature() {
            return this.feature;
        }

        /**
         * @return rightValueEnums
         */
        public java.util.List < RightValueEnums> getRightValueEnums() {
            return this.rightValueEnums;
        }

        /**
         * @return supportOperators
         */
        public java.util.List < SupportOperators> getSupportOperators() {
            return this.supportOperators;
        }

        public static final class Builder {
            private String dataType; 
            private String feature; 
            private java.util.List < RightValueEnums> rightValueEnums; 
            private java.util.List < SupportOperators> supportOperators; 

            /**
             * DataType.
             */
            public Builder dataType(String dataType) {
                this.dataType = dataType;
                return this;
            }

            /**
             * Feature.
             */
            public Builder feature(String feature) {
                this.feature = feature;
                return this;
            }

            /**
             * RightValueEnums.
             */
            public Builder rightValueEnums(java.util.List < RightValueEnums> rightValueEnums) {
                this.rightValueEnums = rightValueEnums;
                return this;
            }

            /**
             * SupportOperators.
             */
            public Builder supportOperators(java.util.List < SupportOperators> supportOperators) {
                this.supportOperators = supportOperators;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
