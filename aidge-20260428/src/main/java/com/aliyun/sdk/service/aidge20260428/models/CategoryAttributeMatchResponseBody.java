// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aidge20260428.models;

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
 * {@link CategoryAttributeMatchResponseBody} extends {@link TeaModel}
 *
 * <p>CategoryAttributeMatchResponseBody</p>
 */
public class CategoryAttributeMatchResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private CategoryAttributeMatchResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CategoryAttributeMatchResponseBody create() {
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
     * @return data
     */
    public Data getData() {
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
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(CategoryAttributeMatchResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
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
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>9927B72F-3C8F-54C0-AAE3-2B1AC94BB6EF</p>
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

        public CategoryAttributeMatchResponseBody build() {
            return new CategoryAttributeMatchResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CategoryAttributeMatchResponseBody} extends {@link TeaModel}
     *
     * <p>CategoryAttributeMatchResponseBody</p>
     */
    public static class Attributes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AttrId")
        private Integer attrId;

        @com.aliyun.core.annotation.NameInMap("Confidence")
        private Integer confidence;

        @com.aliyun.core.annotation.NameInMap("InputType")
        private String inputType;

        @com.aliyun.core.annotation.NameInMap("Matched")
        private Boolean matched;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NameEn")
        private String nameEn;

        @com.aliyun.core.annotation.NameInMap("Reason")
        private String reason;

        @com.aliyun.core.annotation.NameInMap("SelectedValues")
        private java.util.List<String> selectedValues;

        @com.aliyun.core.annotation.NameInMap("SelectedVids")
        private java.util.List<Integer> selectedVids;

        private Attributes(Builder builder) {
            this.attrId = builder.attrId;
            this.confidence = builder.confidence;
            this.inputType = builder.inputType;
            this.matched = builder.matched;
            this.name = builder.name;
            this.nameEn = builder.nameEn;
            this.reason = builder.reason;
            this.selectedValues = builder.selectedValues;
            this.selectedVids = builder.selectedVids;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Attributes create() {
            return builder().build();
        }

        /**
         * @return attrId
         */
        public Integer getAttrId() {
            return this.attrId;
        }

        /**
         * @return confidence
         */
        public Integer getConfidence() {
            return this.confidence;
        }

        /**
         * @return inputType
         */
        public String getInputType() {
            return this.inputType;
        }

        /**
         * @return matched
         */
        public Boolean getMatched() {
            return this.matched;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return nameEn
         */
        public String getNameEn() {
            return this.nameEn;
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        /**
         * @return selectedValues
         */
        public java.util.List<String> getSelectedValues() {
            return this.selectedValues;
        }

        /**
         * @return selectedVids
         */
        public java.util.List<Integer> getSelectedVids() {
            return this.selectedVids;
        }

        public static final class Builder {
            private Integer attrId; 
            private Integer confidence; 
            private String inputType; 
            private Boolean matched; 
            private String name; 
            private String nameEn; 
            private String reason; 
            private java.util.List<String> selectedValues; 
            private java.util.List<Integer> selectedVids; 

            private Builder() {
            } 

            private Builder(Attributes model) {
                this.attrId = model.attrId;
                this.confidence = model.confidence;
                this.inputType = model.inputType;
                this.matched = model.matched;
                this.name = model.name;
                this.nameEn = model.nameEn;
                this.reason = model.reason;
                this.selectedValues = model.selectedValues;
                this.selectedVids = model.selectedVids;
            } 

            /**
             * AttrId.
             */
            public Builder attrId(Integer attrId) {
                this.attrId = attrId;
                return this;
            }

            /**
             * Confidence.
             */
            public Builder confidence(Integer confidence) {
                this.confidence = confidence;
                return this;
            }

            /**
             * InputType.
             */
            public Builder inputType(String inputType) {
                this.inputType = inputType;
                return this;
            }

            /**
             * Matched.
             */
            public Builder matched(Boolean matched) {
                this.matched = matched;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * NameEn.
             */
            public Builder nameEn(String nameEn) {
                this.nameEn = nameEn;
                return this;
            }

            /**
             * Reason.
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * SelectedValues.
             */
            public Builder selectedValues(java.util.List<String> selectedValues) {
                this.selectedValues = selectedValues;
                return this;
            }

            /**
             * SelectedVids.
             */
            public Builder selectedVids(java.util.List<Integer> selectedVids) {
                this.selectedVids = selectedVids;
                return this;
            }

            public Attributes build() {
                return new Attributes(this);
            } 

        } 

    }
    /**
     * 
     * {@link CategoryAttributeMatchResponseBody} extends {@link TeaModel}
     *
     * <p>CategoryAttributeMatchResponseBody</p>
     */
    public static class UsageMap extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ProcessingCount")
        private Integer processingCount;

        private UsageMap(Builder builder) {
            this.processingCount = builder.processingCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UsageMap create() {
            return builder().build();
        }

        /**
         * @return processingCount
         */
        public Integer getProcessingCount() {
            return this.processingCount;
        }

        public static final class Builder {
            private Integer processingCount; 

            private Builder() {
            } 

            private Builder(UsageMap model) {
                this.processingCount = model.processingCount;
            } 

            /**
             * ProcessingCount.
             */
            public Builder processingCount(Integer processingCount) {
                this.processingCount = processingCount;
                return this;
            }

            public UsageMap build() {
                return new UsageMap(this);
            } 

        } 

    }
    /**
     * 
     * {@link CategoryAttributeMatchResponseBody} extends {@link TeaModel}
     *
     * <p>CategoryAttributeMatchResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Attributes")
        private java.util.List<Attributes> attributes;

        @com.aliyun.core.annotation.NameInMap("CategoryId")
        private Integer categoryId;

        @com.aliyun.core.annotation.NameInMap("CategoryName")
        private String categoryName;

        @com.aliyun.core.annotation.NameInMap("CategoryPath")
        private String categoryPath;

        @com.aliyun.core.annotation.NameInMap("FilledCount")
        private Integer filledCount;

        @com.aliyun.core.annotation.NameInMap("Matched")
        private Boolean matched;

        @com.aliyun.core.annotation.NameInMap("TotalAttributes")
        private Integer totalAttributes;

        @com.aliyun.core.annotation.NameInMap("UsageMap")
        private UsageMap usageMap;

        private Data(Builder builder) {
            this.attributes = builder.attributes;
            this.categoryId = builder.categoryId;
            this.categoryName = builder.categoryName;
            this.categoryPath = builder.categoryPath;
            this.filledCount = builder.filledCount;
            this.matched = builder.matched;
            this.totalAttributes = builder.totalAttributes;
            this.usageMap = builder.usageMap;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return attributes
         */
        public java.util.List<Attributes> getAttributes() {
            return this.attributes;
        }

        /**
         * @return categoryId
         */
        public Integer getCategoryId() {
            return this.categoryId;
        }

        /**
         * @return categoryName
         */
        public String getCategoryName() {
            return this.categoryName;
        }

        /**
         * @return categoryPath
         */
        public String getCategoryPath() {
            return this.categoryPath;
        }

        /**
         * @return filledCount
         */
        public Integer getFilledCount() {
            return this.filledCount;
        }

        /**
         * @return matched
         */
        public Boolean getMatched() {
            return this.matched;
        }

        /**
         * @return totalAttributes
         */
        public Integer getTotalAttributes() {
            return this.totalAttributes;
        }

        /**
         * @return usageMap
         */
        public UsageMap getUsageMap() {
            return this.usageMap;
        }

        public static final class Builder {
            private java.util.List<Attributes> attributes; 
            private Integer categoryId; 
            private String categoryName; 
            private String categoryPath; 
            private Integer filledCount; 
            private Boolean matched; 
            private Integer totalAttributes; 
            private UsageMap usageMap; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.attributes = model.attributes;
                this.categoryId = model.categoryId;
                this.categoryName = model.categoryName;
                this.categoryPath = model.categoryPath;
                this.filledCount = model.filledCount;
                this.matched = model.matched;
                this.totalAttributes = model.totalAttributes;
                this.usageMap = model.usageMap;
            } 

            /**
             * Attributes.
             */
            public Builder attributes(java.util.List<Attributes> attributes) {
                this.attributes = attributes;
                return this;
            }

            /**
             * CategoryId.
             */
            public Builder categoryId(Integer categoryId) {
                this.categoryId = categoryId;
                return this;
            }

            /**
             * CategoryName.
             */
            public Builder categoryName(String categoryName) {
                this.categoryName = categoryName;
                return this;
            }

            /**
             * CategoryPath.
             */
            public Builder categoryPath(String categoryPath) {
                this.categoryPath = categoryPath;
                return this;
            }

            /**
             * FilledCount.
             */
            public Builder filledCount(Integer filledCount) {
                this.filledCount = filledCount;
                return this;
            }

            /**
             * Matched.
             */
            public Builder matched(Boolean matched) {
                this.matched = matched;
                return this;
            }

            /**
             * TotalAttributes.
             */
            public Builder totalAttributes(Integer totalAttributes) {
                this.totalAttributes = totalAttributes;
                return this;
            }

            /**
             * UsageMap.
             */
            public Builder usageMap(UsageMap usageMap) {
                this.usageMap = usageMap;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
