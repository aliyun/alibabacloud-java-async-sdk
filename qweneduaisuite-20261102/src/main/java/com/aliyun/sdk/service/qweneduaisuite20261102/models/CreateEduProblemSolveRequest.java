// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qweneduaisuite20261102.models;

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
 * {@link CreateEduProblemSolveRequest} extends {@link RequestModel}
 *
 * <p>CreateEduProblemSolveRequest</p>
 */
public class CreateEduProblemSolveRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("query")
    private CreateEduProblemSolveRequestQuery query;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private CreateEduProblemSolveRequest(Builder builder) {
        super(builder);
        this.query = builder.query;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateEduProblemSolveRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return query
     */
    public CreateEduProblemSolveRequestQuery getQuery() {
        return this.query;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder extends Request.Builder<CreateEduProblemSolveRequest, Builder> {
        private CreateEduProblemSolveRequestQuery query; 
        private String requestId; 

        private Builder() {
            super();
        } 

        private Builder(CreateEduProblemSolveRequest request) {
            super(request);
            this.query = request.query;
            this.requestId = request.requestId;
        } 

        /**
         * <p><strong>The question image container.</strong></p>
         */
        public Builder query(CreateEduProblemSolveRequestQuery query) {
            String queryShrink = shrink(query, "query", "json");
            this.putBodyParameter("query", queryShrink);
            this.query = query;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>019F593F-D6EE-5F44-819A-6CDA127D1637</p>
         */
        public Builder requestId(String requestId) {
            this.putBodyParameter("requestId", requestId);
            this.requestId = requestId;
            return this;
        }

        @Override
        public CreateEduProblemSolveRequest build() {
            return new CreateEduProblemSolveRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateEduProblemSolveRequest} extends {@link TeaModel}
     *
     * <p>CreateEduProblemSolveRequest</p>
     */
    public static class Image extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("base64")
        private String base64;

        @com.aliyun.core.annotation.NameInMap("format")
        @com.aliyun.core.annotation.Validation(required = true)
        private String format;

        @com.aliyun.core.annotation.NameInMap("url")
        private String url;

        private Image(Builder builder) {
            this.base64 = builder.base64;
            this.format = builder.format;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Image create() {
            return builder().build();
        }

        /**
         * @return base64
         */
        public String getBase64() {
            return this.base64;
        }

        /**
         * @return format
         */
        public String getFormat() {
            return this.format;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String base64; 
            private String format; 
            private String url; 

            private Builder() {
            } 

            private Builder(Image model) {
                this.base64 = model.base64;
                this.format = model.format;
                this.url = model.url;
            } 

            /**
             * <p><strong>The Base64-encoded image</strong>. If both this parameter and the URL are provided, this parameter takes precedence.</p>
             * 
             * <strong>example:</strong>
             * <p>iVBORw0KGgoAAAANSUhEUgAAAAUA...</p>
             */
            public Builder base64(String base64) {
                this.base64 = base64;
                return this;
            }

            /**
             * <p><strong>The image format</strong>: jpg, jpeg, or png. The value must match the actual file format.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>jpg</p>
             */
            public Builder format(String format) {
                this.format = format;
                return this;
            }

            /**
             * <p>The URL of a single question image.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://your-cdn.example.com/question.jpg">https://your-cdn.example.com/question.jpg</a></p>
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public Image build() {
                return new Image(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateEduProblemSolveRequest} extends {@link TeaModel}
     *
     * <p>CreateEduProblemSolveRequest</p>
     */
    public static class CreateEduProblemSolveRequestQuery extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("image")
        private Image image;

        private CreateEduProblemSolveRequestQuery(Builder builder) {
            this.image = builder.image;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CreateEduProblemSolveRequestQuery create() {
            return builder().build();
        }

        /**
         * @return image
         */
        public Image getImage() {
            return this.image;
        }

        public static final class Builder {
            private Image image; 

            private Builder() {
            } 

            private Builder(CreateEduProblemSolveRequestQuery model) {
                this.image = model.image;
            } 

            /**
             * <p><strong>The image information.</strong></p>
             */
            public Builder image(Image image) {
                this.image = image;
                return this;
            }

            public CreateEduProblemSolveRequestQuery build() {
                return new CreateEduProblemSolveRequestQuery(this);
            } 

        } 

    }
}
