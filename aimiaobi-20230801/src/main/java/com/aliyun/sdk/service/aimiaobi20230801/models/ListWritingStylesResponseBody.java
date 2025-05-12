// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

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
 * {@link ListWritingStylesResponseBody} extends {@link TeaModel}
 *
 * <p>ListWritingStylesResponseBody</p>
 */
public class ListWritingStylesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListWritingStylesResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.maxResults = builder.maxResults;
        this.message = builder.message;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListWritingStylesResponseBody create() {
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
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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
    public String getSuccess() {
        return this.success;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private java.util.List<Data> data; 
        private Integer maxResults; 
        private String message; 
        private String nextToken; 
        private String requestId; 
        private String success; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListWritingStylesResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.maxResults = model.maxResults;
            this.message = model.message;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.success = model.success;
            this.totalCount = model.totalCount;
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
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
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
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>1813ceee-7fe5-41b4-87e5-982a4d18cca5</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListWritingStylesResponseBody build() {
            return new ListWritingStylesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListWritingStylesResponseBody} extends {@link TeaModel}
     *
     * <p>ListWritingStylesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DistributeStepTemplateDefine")
        private WritingStyleTemplateDefine distributeStepTemplateDefine;

        @com.aliyun.core.annotation.NameInMap("DistributeWriting")
        private Boolean distributeWriting;

        @com.aliyun.core.annotation.NameInMap("Emoji")
        private String emoji;

        @com.aliyun.core.annotation.NameInMap("StyleDescription")
        private String styleDescription;

        @com.aliyun.core.annotation.NameInMap("StyleImage")
        private String styleImage;

        @com.aliyun.core.annotation.NameInMap("StyleKey")
        private String styleKey;

        @com.aliyun.core.annotation.NameInMap("StyleName")
        private String styleName;

        @com.aliyun.core.annotation.NameInMap("TemplateDefine")
        private WritingStyleTemplateDefine templateDefine;

        private Data(Builder builder) {
            this.distributeStepTemplateDefine = builder.distributeStepTemplateDefine;
            this.distributeWriting = builder.distributeWriting;
            this.emoji = builder.emoji;
            this.styleDescription = builder.styleDescription;
            this.styleImage = builder.styleImage;
            this.styleKey = builder.styleKey;
            this.styleName = builder.styleName;
            this.templateDefine = builder.templateDefine;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return distributeStepTemplateDefine
         */
        public WritingStyleTemplateDefine getDistributeStepTemplateDefine() {
            return this.distributeStepTemplateDefine;
        }

        /**
         * @return distributeWriting
         */
        public Boolean getDistributeWriting() {
            return this.distributeWriting;
        }

        /**
         * @return emoji
         */
        public String getEmoji() {
            return this.emoji;
        }

        /**
         * @return styleDescription
         */
        public String getStyleDescription() {
            return this.styleDescription;
        }

        /**
         * @return styleImage
         */
        public String getStyleImage() {
            return this.styleImage;
        }

        /**
         * @return styleKey
         */
        public String getStyleKey() {
            return this.styleKey;
        }

        /**
         * @return styleName
         */
        public String getStyleName() {
            return this.styleName;
        }

        /**
         * @return templateDefine
         */
        public WritingStyleTemplateDefine getTemplateDefine() {
            return this.templateDefine;
        }

        public static final class Builder {
            private WritingStyleTemplateDefine distributeStepTemplateDefine; 
            private Boolean distributeWriting; 
            private String emoji; 
            private String styleDescription; 
            private String styleImage; 
            private String styleKey; 
            private String styleName; 
            private WritingStyleTemplateDefine templateDefine; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.distributeStepTemplateDefine = model.distributeStepTemplateDefine;
                this.distributeWriting = model.distributeWriting;
                this.emoji = model.emoji;
                this.styleDescription = model.styleDescription;
                this.styleImage = model.styleImage;
                this.styleKey = model.styleKey;
                this.styleName = model.styleName;
                this.templateDefine = model.templateDefine;
            } 

            /**
             * DistributeStepTemplateDefine.
             */
            public Builder distributeStepTemplateDefine(WritingStyleTemplateDefine distributeStepTemplateDefine) {
                this.distributeStepTemplateDefine = distributeStepTemplateDefine;
                return this;
            }

            /**
             * DistributeWriting.
             */
            public Builder distributeWriting(Boolean distributeWriting) {
                this.distributeWriting = distributeWriting;
                return this;
            }

            /**
             * Emoji.
             */
            public Builder emoji(String emoji) {
                this.emoji = emoji;
                return this;
            }

            /**
             * StyleDescription.
             */
            public Builder styleDescription(String styleDescription) {
                this.styleDescription = styleDescription;
                return this;
            }

            /**
             * StyleImage.
             */
            public Builder styleImage(String styleImage) {
                this.styleImage = styleImage;
                return this;
            }

            /**
             * StyleKey.
             */
            public Builder styleKey(String styleKey) {
                this.styleKey = styleKey;
                return this;
            }

            /**
             * StyleName.
             */
            public Builder styleName(String styleName) {
                this.styleName = styleName;
                return this;
            }

            /**
             * TemplateDefine.
             */
            public Builder templateDefine(WritingStyleTemplateDefine templateDefine) {
                this.templateDefine = templateDefine;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
