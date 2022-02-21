// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ImAuditResponseBody} extends {@link TeaModel}
 *
 * <p>ImAuditResponseBody</p>
 */
public class ImAuditResponseBody extends TeaModel {
    @NameInMap("ImageQuotaExceed")
    private Boolean imageQuotaExceed;

    @NameInMap("ImageResults")
    private ImageResults imageResults;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TextQuotaExceed")
    private Boolean textQuotaExceed;

    @NameInMap("TextResults")
    private TextResults textResults;

    private ImAuditResponseBody(Builder builder) {
        this.imageQuotaExceed = builder.imageQuotaExceed;
        this.imageResults = builder.imageResults;
        this.requestId = builder.requestId;
        this.textQuotaExceed = builder.textQuotaExceed;
        this.textResults = builder.textResults;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ImAuditResponseBody create() {
        return builder().build();
    }

    /**
     * @return imageQuotaExceed
     */
    public Boolean getImageQuotaExceed() {
        return this.imageQuotaExceed;
    }

    /**
     * @return imageResults
     */
    public ImageResults getImageResults() {
        return this.imageResults;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return textQuotaExceed
     */
    public Boolean getTextQuotaExceed() {
        return this.textQuotaExceed;
    }

    /**
     * @return textResults
     */
    public TextResults getTextResults() {
        return this.textResults;
    }

    public static final class Builder {
        private Boolean imageQuotaExceed; 
        private ImageResults imageResults; 
        private String requestId; 
        private Boolean textQuotaExceed; 
        private TextResults textResults; 

        /**
         * ImageQuotaExceed.
         */
        public Builder imageQuotaExceed(Boolean imageQuotaExceed) {
            this.imageQuotaExceed = imageQuotaExceed;
            return this;
        }

        /**
         * ImageResults.
         */
        public Builder imageResults(ImageResults imageResults) {
            this.imageResults = imageResults;
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
         * TextQuotaExceed.
         */
        public Builder textQuotaExceed(Boolean textQuotaExceed) {
            this.textQuotaExceed = textQuotaExceed;
            return this;
        }

        /**
         * TextResults.
         */
        public Builder textResults(TextResults textResults) {
            this.textResults = textResults;
            return this;
        }

        public ImAuditResponseBody build() {
            return new ImAuditResponseBody(this);
        } 

    } 

    public static class Results extends TeaModel {
        @NameInMap("Label")
        private String label;

        @NameInMap("Rate")
        private Double rate;

        @NameInMap("Scene")
        private String scene;

        @NameInMap("Suggestion")
        private String suggestion;

        private Results(Builder builder) {
            this.label = builder.label;
            this.rate = builder.rate;
            this.scene = builder.scene;
            this.suggestion = builder.suggestion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Results create() {
            return builder().build();
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * @return rate
         */
        public Double getRate() {
            return this.rate;
        }

        /**
         * @return scene
         */
        public String getScene() {
            return this.scene;
        }

        /**
         * @return suggestion
         */
        public String getSuggestion() {
            return this.suggestion;
        }

        public static final class Builder {
            private String label; 
            private Double rate; 
            private String scene; 
            private String suggestion; 

            /**
             * Label.
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * Rate.
             */
            public Builder rate(Double rate) {
                this.rate = rate;
                return this;
            }

            /**
             * Scene.
             */
            public Builder scene(String scene) {
                this.scene = scene;
                return this;
            }

            /**
             * Suggestion.
             */
            public Builder suggestion(String suggestion) {
                this.suggestion = suggestion;
                return this;
            }

            public Results build() {
                return new Results(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @NameInMap("code")
        private Long code;

        @NameInMap("dataId")
        private String dataId;

        @NameInMap("extras")
        private java.util.Map < String, ? > extras;

        @NameInMap("msg")
        private String msg;

        @NameInMap("results")
        private java.util.List < Results> results;

        @NameInMap("taskId")
        private String taskId;

        @NameInMap("url")
        private String url;

        private Result(Builder builder) {
            this.code = builder.code;
            this.dataId = builder.dataId;
            this.extras = builder.extras;
            this.msg = builder.msg;
            this.results = builder.results;
            this.taskId = builder.taskId;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public Long getCode() {
            return this.code;
        }

        /**
         * @return dataId
         */
        public String getDataId() {
            return this.dataId;
        }

        /**
         * @return extras
         */
        public java.util.Map < String, ? > getExtras() {
            return this.extras;
        }

        /**
         * @return msg
         */
        public String getMsg() {
            return this.msg;
        }

        /**
         * @return results
         */
        public java.util.List < Results> getResults() {
            return this.results;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private Long code; 
            private String dataId; 
            private java.util.Map < String, ? > extras; 
            private String msg; 
            private java.util.List < Results> results; 
            private String taskId; 
            private String url; 

            /**
             * code.
             */
            public Builder code(Long code) {
                this.code = code;
                return this;
            }

            /**
             * dataId.
             */
            public Builder dataId(String dataId) {
                this.dataId = dataId;
                return this;
            }

            /**
             * extras.
             */
            public Builder extras(java.util.Map < String, ? > extras) {
                this.extras = extras;
                return this;
            }

            /**
             * msg.
             */
            public Builder msg(String msg) {
                this.msg = msg;
                return this;
            }

            /**
             * results.
             */
            public Builder results(java.util.List < Results> results) {
                this.results = results;
                return this;
            }

            /**
             * taskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
    public static class ImageResults extends TeaModel {
        @NameInMap("result")
        private java.util.List < Result> result;

        private ImageResults(Builder builder) {
            this.result = builder.result;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImageResults create() {
            return builder().build();
        }

        /**
         * @return result
         */
        public java.util.List < Result> getResult() {
            return this.result;
        }

        public static final class Builder {
            private java.util.List < Result> result; 

            /**
             * result.
             */
            public Builder result(java.util.List < Result> result) {
                this.result = result;
                return this;
            }

            public ImageResults build() {
                return new ImageResults(this);
            } 

        } 

    }
    public static class Details extends TeaModel {
        @NameInMap("Label")
        private String label;

        private Details(Builder builder) {
            this.label = builder.label;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Details create() {
            return builder().build();
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        public static final class Builder {
            private String label; 

            /**
             * Label.
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            public Details build() {
                return new Details(this);
            } 

        } 

    }
    public static class ResultResults extends TeaModel {
        @NameInMap("details")
        private java.util.List < Details> details;

        @NameInMap("label")
        private String label;

        @NameInMap("rate")
        private Double rate;

        @NameInMap("scene")
        private String scene;

        @NameInMap("suggestion")
        private String suggestion;

        private ResultResults(Builder builder) {
            this.details = builder.details;
            this.label = builder.label;
            this.rate = builder.rate;
            this.scene = builder.scene;
            this.suggestion = builder.suggestion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultResults create() {
            return builder().build();
        }

        /**
         * @return details
         */
        public java.util.List < Details> getDetails() {
            return this.details;
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * @return rate
         */
        public Double getRate() {
            return this.rate;
        }

        /**
         * @return scene
         */
        public String getScene() {
            return this.scene;
        }

        /**
         * @return suggestion
         */
        public String getSuggestion() {
            return this.suggestion;
        }

        public static final class Builder {
            private java.util.List < Details> details; 
            private String label; 
            private Double rate; 
            private String scene; 
            private String suggestion; 

            /**
             * details.
             */
            public Builder details(java.util.List < Details> details) {
                this.details = details;
                return this;
            }

            /**
             * label.
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * rate.
             */
            public Builder rate(Double rate) {
                this.rate = rate;
                return this;
            }

            /**
             * scene.
             */
            public Builder scene(String scene) {
                this.scene = scene;
                return this;
            }

            /**
             * suggestion.
             */
            public Builder suggestion(String suggestion) {
                this.suggestion = suggestion;
                return this;
            }

            public ResultResults build() {
                return new ResultResults(this);
            } 

        } 

    }
    public static class TextResultsResult extends TeaModel {
        @NameInMap("code")
        private Long code;

        @NameInMap("content")
        private String content;

        @NameInMap("dataId")
        private String dataId;

        @NameInMap("msg")
        private String msg;

        @NameInMap("results")
        private java.util.List < ResultResults> results;

        @NameInMap("taskId")
        private String taskId;

        private TextResultsResult(Builder builder) {
            this.code = builder.code;
            this.content = builder.content;
            this.dataId = builder.dataId;
            this.msg = builder.msg;
            this.results = builder.results;
            this.taskId = builder.taskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TextResultsResult create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public Long getCode() {
            return this.code;
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return dataId
         */
        public String getDataId() {
            return this.dataId;
        }

        /**
         * @return msg
         */
        public String getMsg() {
            return this.msg;
        }

        /**
         * @return results
         */
        public java.util.List < ResultResults> getResults() {
            return this.results;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        public static final class Builder {
            private Long code; 
            private String content; 
            private String dataId; 
            private String msg; 
            private java.util.List < ResultResults> results; 
            private String taskId; 

            /**
             * code.
             */
            public Builder code(Long code) {
                this.code = code;
                return this;
            }

            /**
             * content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * dataId.
             */
            public Builder dataId(String dataId) {
                this.dataId = dataId;
                return this;
            }

            /**
             * msg.
             */
            public Builder msg(String msg) {
                this.msg = msg;
                return this;
            }

            /**
             * results.
             */
            public Builder results(java.util.List < ResultResults> results) {
                this.results = results;
                return this;
            }

            /**
             * taskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            public TextResultsResult build() {
                return new TextResultsResult(this);
            } 

        } 

    }
    public static class TextResults extends TeaModel {
        @NameInMap("result")
        private java.util.List < TextResultsResult> result;

        private TextResults(Builder builder) {
            this.result = builder.result;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TextResults create() {
            return builder().build();
        }

        /**
         * @return result
         */
        public java.util.List < TextResultsResult> getResult() {
            return this.result;
        }

        public static final class Builder {
            private java.util.List < TextResultsResult> result; 

            /**
             * result.
             */
            public Builder result(java.util.List < TextResultsResult> result) {
                this.result = result;
                return this;
            }

            public TextResults build() {
                return new TextResults(this);
            } 

        } 

    }
}
