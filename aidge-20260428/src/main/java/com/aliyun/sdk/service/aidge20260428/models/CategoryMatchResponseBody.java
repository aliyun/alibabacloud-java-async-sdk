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
 * {@link CategoryMatchResponseBody} extends {@link TeaModel}
 *
 * <p>CategoryMatchResponseBody</p>
 */
public class CategoryMatchResponseBody extends TeaModel {
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

    private CategoryMatchResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CategoryMatchResponseBody create() {
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

        private Builder(CategoryMatchResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The status code. The value &quot;success&quot; is returned for successful calls.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The product category matching result.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message. The value &quot;Success&quot; is returned for successful calls.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID, which uniquely identifies the request.</p>
         * 
         * <strong>example:</strong>
         * <p>2157065A-D6C8-1F3E-A4D0-B1234567890</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call is successful. A value of true indicates success. A value of false indicates failure.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public CategoryMatchResponseBody build() {
            return new CategoryMatchResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CategoryMatchResponseBody} extends {@link TeaModel}
     *
     * <p>CategoryMatchResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CategoryId")
        private String categoryId;

        @com.aliyun.core.annotation.NameInMap("CategoryName")
        private String categoryName;

        @com.aliyun.core.annotation.NameInMap("CategoryPath")
        private String categoryPath;

        @com.aliyun.core.annotation.NameInMap("Confidence")
        private Integer confidence;

        @com.aliyun.core.annotation.NameInMap("MatchSuccessful")
        private Boolean matchSuccessful;

        @com.aliyun.core.annotation.NameInMap("Reason")
        private String reason;

        @com.aliyun.core.annotation.NameInMap("UsageMap")
        private java.util.Map<String, Integer> usageMap;

        private Data(Builder builder) {
            this.categoryId = builder.categoryId;
            this.categoryName = builder.categoryName;
            this.categoryPath = builder.categoryPath;
            this.confidence = builder.confidence;
            this.matchSuccessful = builder.matchSuccessful;
            this.reason = builder.reason;
            this.usageMap = builder.usageMap;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return categoryId
         */
        public String getCategoryId() {
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
         * @return confidence
         */
        public Integer getConfidence() {
            return this.confidence;
        }

        /**
         * @return matchSuccessful
         */
        public Boolean getMatchSuccessful() {
            return this.matchSuccessful;
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        /**
         * @return usageMap
         */
        public java.util.Map<String, Integer> getUsageMap() {
            return this.usageMap;
        }

        public static final class Builder {
            private String categoryId; 
            private String categoryName; 
            private String categoryPath; 
            private Integer confidence; 
            private Boolean matchSuccessful; 
            private String reason; 
            private java.util.Map<String, Integer> usageMap; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.categoryId = model.categoryId;
                this.categoryName = model.categoryName;
                this.categoryPath = model.categoryPath;
                this.confidence = model.confidence;
                this.matchSuccessful = model.matchSuccessful;
                this.reason = model.reason;
                this.usageMap = model.usageMap;
            } 

            /**
             * <p>The ID of the matched category.</p>
             * 
             * <strong>example:</strong>
             * <p>1522</p>
             */
            public Builder categoryId(String categoryId) {
                this.categoryId = categoryId;
                return this;
            }

            /**
             * <p>The name of the matched category.</p>
             * 
             * <strong>example:</strong>
             * <p>位置和活动跟踪器</p>
             */
            public Builder categoryName(String categoryName) {
                this.categoryName = categoryName;
                return this;
            }

            /**
             * <p>The full path of the category, separated by forward slashes (/).</p>
             * 
             * <strong>example:</strong>
             * <p>宠物用品/猫用品/猫挂饰、项圈、牵引带/位置和活动跟踪器</p>
             */
            public Builder categoryPath(String categoryPath) {
                this.categoryPath = categoryPath;
                return this;
            }

            /**
             * <p>The match confidence score. Valid values: 0 to 100.</p>
             * 
             * <strong>example:</strong>
             * <p>96</p>
             */
            public Builder confidence(Integer confidence) {
                this.confidence = confidence;
                return this;
            }

            /**
             * <p>Indicates whether the category matching is successful.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder matchSuccessful(Boolean matchSuccessful) {
                this.matchSuccessful = matchSuccessful;
                return this;
            }

            /**
             * <p>The reason for the category match.</p>
             * 
             * <strong>example:</strong>
             * <p>The core product is a cat collar with AirTag positioning functionality, belonging to the \&quot;Location and Activity Trackers\&quot; category. The leaf node semantically matches its tracking functionality and cat-use attributes precisely</p>
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * <p>The usage information.</p>
             */
            public Builder usageMap(java.util.Map<String, Integer> usageMap) {
                this.usageMap = usageMap;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
