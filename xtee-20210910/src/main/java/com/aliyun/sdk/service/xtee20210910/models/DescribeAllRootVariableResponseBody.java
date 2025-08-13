// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

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
 * {@link DescribeAllRootVariableResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAllRootVariableResponseBody</p>
 */
public class DescribeAllRootVariableResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("resultObject")
    private java.util.List<ResultObject> resultObject;

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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<ResultObject> getResultObject() {
        return this.resultObject;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<ResultObject> resultObject; 

        private Builder() {
        } 

        private Builder(DescribeAllRootVariableResponseBody model) {
            this.requestId = model.requestId;
            this.resultObject = model.resultObject;
        } 

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A32FE941-35F2-5378-B37C-4B8FDB16F094</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Return object</p>
         */
        public Builder resultObject(java.util.List<ResultObject> resultObject) {
            this.resultObject = resultObject;
            return this;
        }

        public DescribeAllRootVariableResponseBody build() {
            return new DescribeAllRootVariableResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAllRootVariableResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAllRootVariableResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(OutputThreshold model) {
                this.maxValue = model.maxValue;
                this.minValue = model.minValue;
            } 

            /**
             * <p>Maximum value</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder maxValue(Double maxValue) {
                this.maxValue = maxValue;
                return this;
            }

            /**
             * <p>Minimum value.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
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
    /**
     * 
     * {@link DescribeAllRootVariableResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAllRootVariableResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(ResultObject model) {
                this.code = model.code;
                this.description = model.description;
                this.displayType = model.displayType;
                this.favoriteFlag = model.favoriteFlag;
                this.fieldRank = model.fieldRank;
                this.fieldType = model.fieldType;
                this.id = model.id;
                this.inputFieldType = model.inputFieldType;
                this.inputs = model.inputs;
                this.name = model.name;
                this.outputThreshold = model.outputThreshold;
                this.sourceType = model.sourceType;
                this.title = model.title;
                this.type = model.type;
            } 

            /**
             * <p>Variable code</p>
             * 
             * <strong>example:</strong>
             * <p>age</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>Variable description.</p>
             * 
             * <strong>example:</strong>
             * <p>年龄</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Display type and group label</p>
             * 
             * <strong>example:</strong>
             * <p>NATIVE</p>
             */
            public Builder displayType(String displayType) {
                this.displayType = displayType;
                return this;
            }

            /**
             * <p>Favorite flag</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder favoriteFlag(Boolean favoriteFlag) {
                this.favoriteFlag = favoriteFlag;
                return this;
            }

            /**
             * <p>Field ranking</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder fieldRank(Long fieldRank) {
                this.fieldRank = fieldRank;
                return this;
            }

            /**
             * <p>Field type.</p>
             * 
             * <strong>example:</strong>
             * <p>STRING</p>
             */
            public Builder fieldType(String fieldType) {
                this.fieldType = fieldType;
                return this;
            }

            /**
             * <p>Variable ID.</p>
             * 
             * <strong>example:</strong>
             * <p>497</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Input field type.</p>
             * 
             * <strong>example:</strong>
             * <p>STRING</p>
             */
            public Builder inputFieldType(String inputFieldType) {
                this.inputFieldType = inputFieldType;
                return this;
            }

            /**
             * <p>Variable input.</p>
             * 
             * <strong>example:</strong>
             * <p>age</p>
             */
            public Builder inputs(String inputs) {
                this.inputs = inputs;
                return this;
            }

            /**
             * <p>Variable name.</p>
             * 
             * <strong>example:</strong>
             * <p>age</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Maximum cross-sectional area of the checkbox.</p>
             */
            public Builder outputThreshold(OutputThreshold outputThreshold) {
                this.outputThreshold = outputThreshold;
                return this;
            }

            /**
             * <p>Data source</p>
             * 
             * <strong>example:</strong>
             * <p>SAF</p>
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * <p>Title.</p>
             * 
             * <strong>example:</strong>
             * <p>年龄</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * <p>Variable type.</p>
             * 
             * <strong>example:</strong>
             * <p>NATIVE</p>
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
