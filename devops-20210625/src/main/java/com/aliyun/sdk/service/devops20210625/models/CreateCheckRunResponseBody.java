// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

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
 * {@link CreateCheckRunResponseBody} extends {@link TeaModel}
 *
 * <p>CreateCheckRunResponseBody</p>
 */
public class CreateCheckRunResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("errorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("errorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private Result result;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private CreateCheckRunResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCheckRunResponseBody create() {
        return builder().build();
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private Result result; 
        private Boolean success; 

        /**
         * errorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * errorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public CreateCheckRunResponseBody build() {
            return new CreateCheckRunResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateCheckRunResponseBody} extends {@link TeaModel}
     *
     * <p>CreateCheckRunResponseBody</p>
     */
    public static class Annotations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("annotationLevel")
        private String annotationLevel;

        @com.aliyun.core.annotation.NameInMap("endColumn")
        private Long endColumn;

        @com.aliyun.core.annotation.NameInMap("endLine")
        private Long endLine;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("path")
        private String path;

        @com.aliyun.core.annotation.NameInMap("rawDetails")
        private String rawDetails;

        @com.aliyun.core.annotation.NameInMap("startColumn")
        private Long startColumn;

        @com.aliyun.core.annotation.NameInMap("startLine")
        private Long startLine;

        @com.aliyun.core.annotation.NameInMap("title")
        private String title;

        private Annotations(Builder builder) {
            this.annotationLevel = builder.annotationLevel;
            this.endColumn = builder.endColumn;
            this.endLine = builder.endLine;
            this.id = builder.id;
            this.message = builder.message;
            this.path = builder.path;
            this.rawDetails = builder.rawDetails;
            this.startColumn = builder.startColumn;
            this.startLine = builder.startLine;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Annotations create() {
            return builder().build();
        }

        /**
         * @return annotationLevel
         */
        public String getAnnotationLevel() {
            return this.annotationLevel;
        }

        /**
         * @return endColumn
         */
        public Long getEndColumn() {
            return this.endColumn;
        }

        /**
         * @return endLine
         */
        public Long getEndLine() {
            return this.endLine;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        /**
         * @return rawDetails
         */
        public String getRawDetails() {
            return this.rawDetails;
        }

        /**
         * @return startColumn
         */
        public Long getStartColumn() {
            return this.startColumn;
        }

        /**
         * @return startLine
         */
        public Long getStartLine() {
            return this.startLine;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String annotationLevel; 
            private Long endColumn; 
            private Long endLine; 
            private Long id; 
            private String message; 
            private String path; 
            private String rawDetails; 
            private Long startColumn; 
            private Long startLine; 
            private String title; 

            /**
             * annotationLevel.
             */
            public Builder annotationLevel(String annotationLevel) {
                this.annotationLevel = annotationLevel;
                return this;
            }

            /**
             * endColumn.
             */
            public Builder endColumn(Long endColumn) {
                this.endColumn = endColumn;
                return this;
            }

            /**
             * endLine.
             */
            public Builder endLine(Long endLine) {
                this.endLine = endLine;
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
             * message.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * path.
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * rawDetails.
             */
            public Builder rawDetails(String rawDetails) {
                this.rawDetails = rawDetails;
                return this;
            }

            /**
             * startColumn.
             */
            public Builder startColumn(Long startColumn) {
                this.startColumn = startColumn;
                return this;
            }

            /**
             * startLine.
             */
            public Builder startLine(Long startLine) {
                this.startLine = startLine;
                return this;
            }

            /**
             * title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public Annotations build() {
                return new Annotations(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateCheckRunResponseBody} extends {@link TeaModel}
     *
     * <p>CreateCheckRunResponseBody</p>
     */
    public static class CheckSuite extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        private CheckSuite(Builder builder) {
            this.id = builder.id;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CheckSuite create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        public static final class Builder {
            private Long id; 

            /**
             * id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            public CheckSuite build() {
                return new CheckSuite(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateCheckRunResponseBody} extends {@link TeaModel}
     *
     * <p>CreateCheckRunResponseBody</p>
     */
    public static class Images extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("alt")
        private String alt;

        @com.aliyun.core.annotation.NameInMap("caption")
        private String caption;

        @com.aliyun.core.annotation.NameInMap("imageUrl")
        private String imageUrl;

        private Images(Builder builder) {
            this.alt = builder.alt;
            this.caption = builder.caption;
            this.imageUrl = builder.imageUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Images create() {
            return builder().build();
        }

        /**
         * @return alt
         */
        public String getAlt() {
            return this.alt;
        }

        /**
         * @return caption
         */
        public String getCaption() {
            return this.caption;
        }

        /**
         * @return imageUrl
         */
        public String getImageUrl() {
            return this.imageUrl;
        }

        public static final class Builder {
            private String alt; 
            private String caption; 
            private String imageUrl; 

            /**
             * alt.
             */
            public Builder alt(String alt) {
                this.alt = alt;
                return this;
            }

            /**
             * caption.
             */
            public Builder caption(String caption) {
                this.caption = caption;
                return this;
            }

            /**
             * imageUrl.
             */
            public Builder imageUrl(String imageUrl) {
                this.imageUrl = imageUrl;
                return this;
            }

            public Images build() {
                return new Images(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateCheckRunResponseBody} extends {@link TeaModel}
     *
     * <p>CreateCheckRunResponseBody</p>
     */
    public static class Output extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("images")
        private java.util.List<Images> images;

        @com.aliyun.core.annotation.NameInMap("summary")
        private String summary;

        @com.aliyun.core.annotation.NameInMap("text")
        private String text;

        @com.aliyun.core.annotation.NameInMap("title")
        private String title;

        private Output(Builder builder) {
            this.images = builder.images;
            this.summary = builder.summary;
            this.text = builder.text;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Output create() {
            return builder().build();
        }

        /**
         * @return images
         */
        public java.util.List<Images> getImages() {
            return this.images;
        }

        /**
         * @return summary
         */
        public String getSummary() {
            return this.summary;
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private java.util.List<Images> images; 
            private String summary; 
            private String text; 
            private String title; 

            /**
             * images.
             */
            public Builder images(java.util.List<Images> images) {
                this.images = images;
                return this;
            }

            /**
             * summary.
             */
            public Builder summary(String summary) {
                this.summary = summary;
                return this;
            }

            /**
             * text.
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            /**
             * title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public Output build() {
                return new Output(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateCheckRunResponseBody} extends {@link TeaModel}
     *
     * <p>CreateCheckRunResponseBody</p>
     */
    public static class Writer extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("logoUrl")
        private String logoUrl;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("slug")
        private String slug;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private Writer(Builder builder) {
            this.id = builder.id;
            this.logoUrl = builder.logoUrl;
            this.name = builder.name;
            this.slug = builder.slug;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Writer create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return logoUrl
         */
        public String getLogoUrl() {
            return this.logoUrl;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return slug
         */
        public String getSlug() {
            return this.slug;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String id; 
            private String logoUrl; 
            private String name; 
            private String slug; 
            private String type; 

            /**
             * id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * logoUrl.
             */
            public Builder logoUrl(String logoUrl) {
                this.logoUrl = logoUrl;
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
             * slug.
             */
            public Builder slug(String slug) {
                this.slug = slug;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Writer build() {
                return new Writer(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateCheckRunResponseBody} extends {@link TeaModel}
     *
     * <p>CreateCheckRunResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("annotations")
        private java.util.List<Annotations> annotations;

        @com.aliyun.core.annotation.NameInMap("checkSuite")
        private CheckSuite checkSuite;

        @com.aliyun.core.annotation.NameInMap("completedAt")
        private String completedAt;

        @com.aliyun.core.annotation.NameInMap("conclusion")
        private String conclusion;

        @com.aliyun.core.annotation.NameInMap("createdAt")
        private String createdAt;

        @com.aliyun.core.annotation.NameInMap("detailsUrl")
        private String detailsUrl;

        @com.aliyun.core.annotation.NameInMap("externalId")
        private String externalId;

        @com.aliyun.core.annotation.NameInMap("headSha")
        private String headSha;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("output")
        private Output output;

        @com.aliyun.core.annotation.NameInMap("startedAt")
        private String startedAt;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("updatedAt")
        private String updatedAt;

        @com.aliyun.core.annotation.NameInMap("writer")
        private Writer writer;

        private Result(Builder builder) {
            this.annotations = builder.annotations;
            this.checkSuite = builder.checkSuite;
            this.completedAt = builder.completedAt;
            this.conclusion = builder.conclusion;
            this.createdAt = builder.createdAt;
            this.detailsUrl = builder.detailsUrl;
            this.externalId = builder.externalId;
            this.headSha = builder.headSha;
            this.id = builder.id;
            this.name = builder.name;
            this.output = builder.output;
            this.startedAt = builder.startedAt;
            this.status = builder.status;
            this.updatedAt = builder.updatedAt;
            this.writer = builder.writer;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return annotations
         */
        public java.util.List<Annotations> getAnnotations() {
            return this.annotations;
        }

        /**
         * @return checkSuite
         */
        public CheckSuite getCheckSuite() {
            return this.checkSuite;
        }

        /**
         * @return completedAt
         */
        public String getCompletedAt() {
            return this.completedAt;
        }

        /**
         * @return conclusion
         */
        public String getConclusion() {
            return this.conclusion;
        }

        /**
         * @return createdAt
         */
        public String getCreatedAt() {
            return this.createdAt;
        }

        /**
         * @return detailsUrl
         */
        public String getDetailsUrl() {
            return this.detailsUrl;
        }

        /**
         * @return externalId
         */
        public String getExternalId() {
            return this.externalId;
        }

        /**
         * @return headSha
         */
        public String getHeadSha() {
            return this.headSha;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return output
         */
        public Output getOutput() {
            return this.output;
        }

        /**
         * @return startedAt
         */
        public String getStartedAt() {
            return this.startedAt;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return updatedAt
         */
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        /**
         * @return writer
         */
        public Writer getWriter() {
            return this.writer;
        }

        public static final class Builder {
            private java.util.List<Annotations> annotations; 
            private CheckSuite checkSuite; 
            private String completedAt; 
            private String conclusion; 
            private String createdAt; 
            private String detailsUrl; 
            private String externalId; 
            private String headSha; 
            private Long id; 
            private String name; 
            private Output output; 
            private String startedAt; 
            private String status; 
            private String updatedAt; 
            private Writer writer; 

            /**
             * annotations.
             */
            public Builder annotations(java.util.List<Annotations> annotations) {
                this.annotations = annotations;
                return this;
            }

            /**
             * checkSuite.
             */
            public Builder checkSuite(CheckSuite checkSuite) {
                this.checkSuite = checkSuite;
                return this;
            }

            /**
             * completedAt.
             */
            public Builder completedAt(String completedAt) {
                this.completedAt = completedAt;
                return this;
            }

            /**
             * conclusion.
             */
            public Builder conclusion(String conclusion) {
                this.conclusion = conclusion;
                return this;
            }

            /**
             * createdAt.
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * detailsUrl.
             */
            public Builder detailsUrl(String detailsUrl) {
                this.detailsUrl = detailsUrl;
                return this;
            }

            /**
             * externalId.
             */
            public Builder externalId(String externalId) {
                this.externalId = externalId;
                return this;
            }

            /**
             * headSha.
             */
            public Builder headSha(String headSha) {
                this.headSha = headSha;
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
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * output.
             */
            public Builder output(Output output) {
                this.output = output;
                return this;
            }

            /**
             * startedAt.
             */
            public Builder startedAt(String startedAt) {
                this.startedAt = startedAt;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * updatedAt.
             */
            public Builder updatedAt(String updatedAt) {
                this.updatedAt = updatedAt;
                return this;
            }

            /**
             * writer.
             */
            public Builder writer(Writer writer) {
                this.writer = writer;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
