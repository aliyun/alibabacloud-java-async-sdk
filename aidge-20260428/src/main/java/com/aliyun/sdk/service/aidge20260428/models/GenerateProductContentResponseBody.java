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
 * {@link GenerateProductContentResponseBody} extends {@link TeaModel}
 *
 * <p>GenerateProductContentResponseBody</p>
 */
public class GenerateProductContentResponseBody extends TeaModel {
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

    private GenerateProductContentResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateProductContentResponseBody create() {
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

        private Builder(GenerateProductContentResponseBody model) {
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

        public GenerateProductContentResponseBody build() {
            return new GenerateProductContentResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GenerateProductContentResponseBody} extends {@link TeaModel}
     *
     * <p>GenerateProductContentResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ContentType")
        private String contentType;

        @com.aliyun.core.annotation.NameInMap("Length")
        private Integer length;

        @com.aliyun.core.annotation.NameInMap("OutputLanguage")
        private String outputLanguage;

        @com.aliyun.core.annotation.NameInMap("PointLengths")
        private java.util.List<Integer> pointLengths;

        @com.aliyun.core.annotation.NameInMap("Points")
        private java.util.List<String> points;

        @com.aliyun.core.annotation.NameInMap("Text")
        private String text;

        @com.aliyun.core.annotation.NameInMap("UsageMap")
        private java.util.Map<String, Integer> usageMap;

        private Data(Builder builder) {
            this.contentType = builder.contentType;
            this.length = builder.length;
            this.outputLanguage = builder.outputLanguage;
            this.pointLengths = builder.pointLengths;
            this.points = builder.points;
            this.text = builder.text;
            this.usageMap = builder.usageMap;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return contentType
         */
        public String getContentType() {
            return this.contentType;
        }

        /**
         * @return length
         */
        public Integer getLength() {
            return this.length;
        }

        /**
         * @return outputLanguage
         */
        public String getOutputLanguage() {
            return this.outputLanguage;
        }

        /**
         * @return pointLengths
         */
        public java.util.List<Integer> getPointLengths() {
            return this.pointLengths;
        }

        /**
         * @return points
         */
        public java.util.List<String> getPoints() {
            return this.points;
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        /**
         * @return usageMap
         */
        public java.util.Map<String, Integer> getUsageMap() {
            return this.usageMap;
        }

        public static final class Builder {
            private String contentType; 
            private Integer length; 
            private String outputLanguage; 
            private java.util.List<Integer> pointLengths; 
            private java.util.List<String> points; 
            private String text; 
            private java.util.Map<String, Integer> usageMap; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.contentType = model.contentType;
                this.length = model.length;
                this.outputLanguage = model.outputLanguage;
                this.pointLengths = model.pointLengths;
                this.points = model.points;
                this.text = model.text;
                this.usageMap = model.usageMap;
            } 

            /**
             * ContentType.
             */
            public Builder contentType(String contentType) {
                this.contentType = contentType;
                return this;
            }

            /**
             * Length.
             */
            public Builder length(Integer length) {
                this.length = length;
                return this;
            }

            /**
             * OutputLanguage.
             */
            public Builder outputLanguage(String outputLanguage) {
                this.outputLanguage = outputLanguage;
                return this;
            }

            /**
             * PointLengths.
             */
            public Builder pointLengths(java.util.List<Integer> pointLengths) {
                this.pointLengths = pointLengths;
                return this;
            }

            /**
             * Points.
             */
            public Builder points(java.util.List<String> points) {
                this.points = points;
                return this;
            }

            /**
             * Text.
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            /**
             * UsageMap.
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
