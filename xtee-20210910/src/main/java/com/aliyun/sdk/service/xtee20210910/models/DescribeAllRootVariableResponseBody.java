// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAllRootVariableResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAllRootVariableResponseBody</p>
 */
public class DescribeAllRootVariableResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("resultObject")
    private java.util.List < ResultObject> resultObject;

    private DescribeAllRootVariableResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resultObject = builder.resultObject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAllRootVariableResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resultObject
     */
    public java.util.List < ResultObject> getResultObject() {
        return this.resultObject;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < ResultObject> resultObject; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * resultObject.
         */
        public Builder resultObject(java.util.List < ResultObject> resultObject) {
            this.resultObject = resultObject;
            return this;
        }

        public DescribeAllRootVariableResponseBody build() {
            return new DescribeAllRootVariableResponseBody(this);
        } 

    } 

    public static class OutputThreshold extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("maxValue")
        private Double maxValue;

        @com.aliyun.core.annotation.NameInMap("minValue")
        private Double minValue;

        private OutputThreshold(Builder builder) {
            this.maxValue = builder.maxValue;
            this.minValue = builder.minValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OutputThreshold create() {
            return builder().build();
        }

        /**
         * @return maxValue
         */
        public Double getMaxValue() {
            return this.maxValue;
        }

        /**
         * @return minValue
         */
        public Double getMinValue() {
            return this.minValue;
        }

        public static final class Builder {
            private Double maxValue; 
            private Double minValue; 

            /**
             * maxValue.
             */
            public Builder maxValue(Double maxValue) {
                this.maxValue = maxValue;
                return this;
            }

            /**
             * minValue.
             */
            public Builder minValue(Double minValue) {
                this.minValue = minValue;
                return this;
            }

            public OutputThreshold build() {
                return new OutputThreshold(this);
            } 

        } 

    }
    public static class ResultObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("displayType")
        private String displayType;

        @com.aliyun.core.annotation.NameInMap("favoriteFlag")
        private Boolean favoriteFlag;

        @com.aliyun.core.annotation.NameInMap("fieldRank")
        private Long fieldRank;

        @com.aliyun.core.annotation.NameInMap("fieldType")
        private String fieldType;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("inputFieldType")
        private String inputFieldType;

        @com.aliyun.core.annotation.NameInMap("inputs")
        private String inputs;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("outputThreshold")
        private OutputThreshold outputThreshold;

        @com.aliyun.core.annotation.NameInMap("sourceType")
        private String sourceType;

        @com.aliyun.core.annotation.NameInMap("title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private ResultObject(Builder builder) {
            this.code = builder.code;
            this.description = builder.description;
            this.displayType = builder.displayType;
            this.favoriteFlag = builder.favoriteFlag;
            this.fieldRank = builder.fieldRank;
            this.fieldType = builder.fieldType;
            this.id = builder.id;
            this.inputFieldType = builder.inputFieldType;
            this.inputs = builder.inputs;
            this.name = builder.name;
            this.outputThreshold = builder.outputThreshold;
            this.sourceType = builder.sourceType;
            this.title = builder.title;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultObject create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return displayType
         */
        public String getDisplayType() {
            return this.displayType;
        }

        /**
         * @return favoriteFlag
         */
        public Boolean getFavoriteFlag() {
            return this.favoriteFlag;
        }

        /**
         * @return fieldRank
         */
        public Long getFieldRank() {
            return this.fieldRank;
        }

        /**
         * @return fieldType
         */
        public String getFieldType() {
            return this.fieldType;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return inputFieldType
         */
        public String getInputFieldType() {
            return this.inputFieldType;
        }

        /**
         * @return inputs
         */
        public String getInputs() {
            return this.inputs;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return outputThreshold
         */
        public OutputThreshold getOutputThreshold() {
            return this.outputThreshold;
        }

        /**
         * @return sourceType
         */
        public String getSourceType() {
            return this.sourceType;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String code; 
            private String description; 
            private String displayType; 
            private Boolean favoriteFlag; 
            private Long fieldRank; 
            private String fieldType; 
            private Long id; 
            private String inputFieldType; 
            private String inputs; 
            private String name; 
            private OutputThreshold outputThreshold; 
            private String sourceType; 
            private String title; 
            private String type; 

            /**
             * code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * displayType.
             */
            public Builder displayType(String displayType) {
                this.displayType = displayType;
                return this;
            }

            /**
             * favoriteFlag.
             */
            public Builder favoriteFlag(Boolean favoriteFlag) {
                this.favoriteFlag = favoriteFlag;
                return this;
            }

            /**
             * fieldRank.
             */
            public Builder fieldRank(Long fieldRank) {
                this.fieldRank = fieldRank;
                return this;
            }

            /**
             * fieldType.
             */
            public Builder fieldType(String fieldType) {
                this.fieldType = fieldType;
                return this;
            }

            /**
             * id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * inputFieldType.
             */
            public Builder inputFieldType(String inputFieldType) {
                this.inputFieldType = inputFieldType;
                return this;
            }

            /**
             * inputs.
             */
            public Builder inputs(String inputs) {
                this.inputs = inputs;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * outputThreshold.
             */
            public Builder outputThreshold(OutputThreshold outputThreshold) {
                this.outputThreshold = outputThreshold;
                return this;
            }

            /**
             * sourceType.
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public ResultObject build() {
                return new ResultObject(this);
            } 

        } 

    }
}
