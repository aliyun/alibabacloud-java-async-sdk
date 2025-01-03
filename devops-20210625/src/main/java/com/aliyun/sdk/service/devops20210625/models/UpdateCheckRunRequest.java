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
 * {@link UpdateCheckRunRequest} extends {@link RequestModel}
 *
 * <p>UpdateCheckRunRequest</p>
 */
public class UpdateCheckRunRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("accessToken")
    private String accessToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("annotations")
    private java.util.List<Annotations> annotations;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("completedAt")
    private String completedAt;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("conclusion")
    private String conclusion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("detailsUrl")
    private String detailsUrl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("externalId")
    private String externalId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("output")
    private Output output;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("startedAt")
    private String startedAt;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("checkRunId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long checkRunId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("organizationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String organizationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("repositoryIdentity")
    @com.aliyun.core.annotation.Validation(required = true)
    private String repositoryIdentity;

    private UpdateCheckRunRequest(Builder builder) {
        super(builder);
        this.accessToken = builder.accessToken;
        this.annotations = builder.annotations;
        this.completedAt = builder.completedAt;
        this.conclusion = builder.conclusion;
        this.detailsUrl = builder.detailsUrl;
        this.externalId = builder.externalId;
        this.name = builder.name;
        this.output = builder.output;
        this.startedAt = builder.startedAt;
        this.status = builder.status;
        this.checkRunId = builder.checkRunId;
        this.organizationId = builder.organizationId;
        this.repositoryIdentity = builder.repositoryIdentity;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateCheckRunRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessToken
     */
    public String getAccessToken() {
        return this.accessToken;
    }

    /**
     * @return annotations
     */
    public java.util.List<Annotations> getAnnotations() {
        return this.annotations;
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
     * @return checkRunId
     */
    public Long getCheckRunId() {
        return this.checkRunId;
    }

    /**
     * @return organizationId
     */
    public String getOrganizationId() {
        return this.organizationId;
    }

    /**
     * @return repositoryIdentity
     */
    public String getRepositoryIdentity() {
        return this.repositoryIdentity;
    }

    public static final class Builder extends Request.Builder<UpdateCheckRunRequest, Builder> {
        private String accessToken; 
        private java.util.List<Annotations> annotations; 
        private String completedAt; 
        private String conclusion; 
        private String detailsUrl; 
        private String externalId; 
        private String name; 
        private Output output; 
        private String startedAt; 
        private String status; 
        private Long checkRunId; 
        private String organizationId; 
        private String repositoryIdentity; 

        private Builder() {
            super();
        } 

        private Builder(UpdateCheckRunRequest request) {
            super(request);
            this.accessToken = request.accessToken;
            this.annotations = request.annotations;
            this.completedAt = request.completedAt;
            this.conclusion = request.conclusion;
            this.detailsUrl = request.detailsUrl;
            this.externalId = request.externalId;
            this.name = request.name;
            this.output = request.output;
            this.startedAt = request.startedAt;
            this.status = request.status;
            this.checkRunId = request.checkRunId;
            this.organizationId = request.organizationId;
            this.repositoryIdentity = request.repositoryIdentity;
        } 

        /**
         * accessToken.
         */
        public Builder accessToken(String accessToken) {
            this.putQueryParameter("accessToken", accessToken);
            this.accessToken = accessToken;
            return this;
        }

        /**
         * annotations.
         */
        public Builder annotations(java.util.List<Annotations> annotations) {
            this.putBodyParameter("annotations", annotations);
            this.annotations = annotations;
            return this;
        }

        /**
         * completedAt.
         */
        public Builder completedAt(String completedAt) {
            this.putBodyParameter("completedAt", completedAt);
            this.completedAt = completedAt;
            return this;
        }

        /**
         * conclusion.
         */
        public Builder conclusion(String conclusion) {
            this.putBodyParameter("conclusion", conclusion);
            this.conclusion = conclusion;
            return this;
        }

        /**
         * detailsUrl.
         */
        public Builder detailsUrl(String detailsUrl) {
            this.putBodyParameter("detailsUrl", detailsUrl);
            this.detailsUrl = detailsUrl;
            return this;
        }

        /**
         * externalId.
         */
        public Builder externalId(String externalId) {
            this.putBodyParameter("externalId", externalId);
            this.externalId = externalId;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * output.
         */
        public Builder output(Output output) {
            this.putBodyParameter("output", output);
            this.output = output;
            return this;
        }

        /**
         * startedAt.
         */
        public Builder startedAt(String startedAt) {
            this.putBodyParameter("startedAt", startedAt);
            this.startedAt = startedAt;
            return this;
        }

        /**
         * status.
         */
        public Builder status(String status) {
            this.putBodyParameter("status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder checkRunId(Long checkRunId) {
            this.putQueryParameter("checkRunId", checkRunId);
            this.checkRunId = checkRunId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>60de7a6852743a5162b5f957</p>
         */
        public Builder organizationId(String organizationId) {
            this.putQueryParameter("organizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder repositoryIdentity(String repositoryIdentity) {
            this.putQueryParameter("repositoryIdentity", repositoryIdentity);
            this.repositoryIdentity = repositoryIdentity;
            return this;
        }

        @Override
        public UpdateCheckRunRequest build() {
            return new UpdateCheckRunRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateCheckRunRequest} extends {@link TeaModel}
     *
     * <p>UpdateCheckRunRequest</p>
     */
    public static class Annotations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("annotationLevel")
        @com.aliyun.core.annotation.Validation(required = true)
        private String annotationLevel;

        @com.aliyun.core.annotation.NameInMap("endColumn")
        private Long endColumn;

        @com.aliyun.core.annotation.NameInMap("endLine")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long endLine;

        @com.aliyun.core.annotation.NameInMap("message")
        @com.aliyun.core.annotation.Validation(required = true)
        private String message;

        @com.aliyun.core.annotation.NameInMap("path")
        @com.aliyun.core.annotation.Validation(required = true)
        private String path;

        @com.aliyun.core.annotation.NameInMap("rawDetails")
        private String rawDetails;

        @com.aliyun.core.annotation.NameInMap("startColumn")
        private Long startColumn;

        @com.aliyun.core.annotation.NameInMap("startLine")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long startLine;

        @com.aliyun.core.annotation.NameInMap("title")
        private String title;

        private Annotations(Builder builder) {
            this.annotationLevel = builder.annotationLevel;
            this.endColumn = builder.endColumn;
            this.endLine = builder.endLine;
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
            private String message; 
            private String path; 
            private String rawDetails; 
            private Long startColumn; 
            private Long startLine; 
            private String title; 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>failure</p>
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
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder endLine(Long endLine) {
                this.endLine = endLine;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>demo/test.txt</p>
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
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
     * {@link UpdateCheckRunRequest} extends {@link TeaModel}
     *
     * <p>UpdateCheckRunRequest</p>
     */
    public static class Images extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("alt")
        @com.aliyun.core.annotation.Validation(required = true)
        private String alt;

        @com.aliyun.core.annotation.NameInMap("caption")
        private String caption;

        @com.aliyun.core.annotation.NameInMap("imageUrl")
        @com.aliyun.core.annotation.Validation(required = true)
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
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>test-image-alt</p>
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
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
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
     * {@link UpdateCheckRunRequest} extends {@link TeaModel}
     *
     * <p>UpdateCheckRunRequest</p>
     */
    public static class Output extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("images")
        private java.util.List<Images> images;

        @com.aliyun.core.annotation.NameInMap("summary")
        @com.aliyun.core.annotation.Validation(required = true)
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
             * <p>This parameter is required.</p>
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
}
