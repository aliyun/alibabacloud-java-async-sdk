// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link GetMediaAiAnalysisResponseBody} extends {@link TeaModel}
 *
 * <p>GetMediaAiAnalysisResponseBody</p>
 */
public class GetMediaAiAnalysisResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AiAnalysisResultList")
    private AiAnalysisResultList aiAnalysisResultList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetMediaAiAnalysisResponseBody(Builder builder) {
        this.aiAnalysisResultList = builder.aiAnalysisResultList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMediaAiAnalysisResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aiAnalysisResultList
     */
    public AiAnalysisResultList getAiAnalysisResultList() {
        return this.aiAnalysisResultList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private AiAnalysisResultList aiAnalysisResultList; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetMediaAiAnalysisResponseBody model) {
            this.aiAnalysisResultList = model.aiAnalysisResultList;
            this.requestId = model.requestId;
        } 

        /**
         * AiAnalysisResultList.
         */
        public Builder aiAnalysisResultList(AiAnalysisResultList aiAnalysisResultList) {
            this.aiAnalysisResultList = aiAnalysisResultList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetMediaAiAnalysisResponseBody build() {
            return new GetMediaAiAnalysisResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetMediaAiAnalysisResponseBody} extends {@link TeaModel}
     *
     * <p>GetMediaAiAnalysisResponseBody</p>
     */
    public static class AiAnalysisResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("Extra")
        private String extra;

        @com.aliyun.core.annotation.NameInMap("ResultType")
        private String resultType;

        @com.aliyun.core.annotation.NameInMap("Summary")
        private String summary;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        private AiAnalysisResult(Builder builder) {
            this.content = builder.content;
            this.extra = builder.extra;
            this.resultType = builder.resultType;
            this.summary = builder.summary;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AiAnalysisResult create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return extra
         */
        public String getExtra() {
            return this.extra;
        }

        /**
         * @return resultType
         */
        public String getResultType() {
            return this.resultType;
        }

        /**
         * @return summary
         */
        public String getSummary() {
            return this.summary;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String content; 
            private String extra; 
            private String resultType; 
            private String summary; 
            private String title; 

            private Builder() {
            } 

            private Builder(AiAnalysisResult model) {
                this.content = model.content;
                this.extra = model.extra;
                this.resultType = model.resultType;
                this.summary = model.summary;
                this.title = model.title;
            } 

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * Extra.
             */
            public Builder extra(String extra) {
                this.extra = extra;
                return this;
            }

            /**
             * ResultType.
             */
            public Builder resultType(String resultType) {
                this.resultType = resultType;
                return this;
            }

            /**
             * Summary.
             */
            public Builder summary(String summary) {
                this.summary = summary;
                return this;
            }

            /**
             * Title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public AiAnalysisResult build() {
                return new AiAnalysisResult(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetMediaAiAnalysisResponseBody} extends {@link TeaModel}
     *
     * <p>GetMediaAiAnalysisResponseBody</p>
     */
    public static class AiAnalysisResultList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AiAnalysisResult")
        private java.util.List<AiAnalysisResult> aiAnalysisResult;

        private AiAnalysisResultList(Builder builder) {
            this.aiAnalysisResult = builder.aiAnalysisResult;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AiAnalysisResultList create() {
            return builder().build();
        }

        /**
         * @return aiAnalysisResult
         */
        public java.util.List<AiAnalysisResult> getAiAnalysisResult() {
            return this.aiAnalysisResult;
        }

        public static final class Builder {
            private java.util.List<AiAnalysisResult> aiAnalysisResult; 

            private Builder() {
            } 

            private Builder(AiAnalysisResultList model) {
                this.aiAnalysisResult = model.aiAnalysisResult;
            } 

            /**
             * AiAnalysisResult.
             */
            public Builder aiAnalysisResult(java.util.List<AiAnalysisResult> aiAnalysisResult) {
                this.aiAnalysisResult = aiAnalysisResult;
                return this;
            }

            public AiAnalysisResultList build() {
                return new AiAnalysisResultList(this);
            } 

        } 

    }
}
