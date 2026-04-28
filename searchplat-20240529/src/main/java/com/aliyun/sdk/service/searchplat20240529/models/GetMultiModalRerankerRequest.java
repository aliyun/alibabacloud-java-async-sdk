// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchplat20240529.models;

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
 * {@link GetMultiModalRerankerRequest} extends {@link RequestModel}
 *
 * <p>GetMultiModalRerankerRequest</p>
 */
public class GetMultiModalRerankerRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspace_name")
    private String workspaceName;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("service_id")
    private String serviceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("docs")
    private java.util.List<Docs> docs;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("options")
    private java.util.Map<String, ?> options;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("query")
    private GetMultiModalRerankerRequestQuery query;

    private GetMultiModalRerankerRequest(Builder builder) {
        super(builder);
        this.workspaceName = builder.workspaceName;
        this.serviceId = builder.serviceId;
        this.docs = builder.docs;
        this.options = builder.options;
        this.query = builder.query;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMultiModalRerankerRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceName
     */
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    /**
     * @return serviceId
     */
    public String getServiceId() {
        return this.serviceId;
    }

    /**
     * @return docs
     */
    public java.util.List<Docs> getDocs() {
        return this.docs;
    }

    /**
     * @return options
     */
    public java.util.Map<String, ?> getOptions() {
        return this.options;
    }

    /**
     * @return query
     */
    public GetMultiModalRerankerRequestQuery getQuery() {
        return this.query;
    }

    public static final class Builder extends Request.Builder<GetMultiModalRerankerRequest, Builder> {
        private String workspaceName; 
        private String serviceId; 
        private java.util.List<Docs> docs; 
        private java.util.Map<String, ?> options; 
        private GetMultiModalRerankerRequestQuery query; 

        private Builder() {
            super();
        } 

        private Builder(GetMultiModalRerankerRequest request) {
            super(request);
            this.workspaceName = request.workspaceName;
            this.serviceId = request.serviceId;
            this.docs = request.docs;
            this.options = request.options;
            this.query = request.query;
        } 

        /**
         * workspace_name.
         */
        public Builder workspaceName(String workspaceName) {
            this.putPathParameter("workspace_name", workspaceName);
            this.workspaceName = workspaceName;
            return this;
        }

        /**
         * service_id.
         */
        public Builder serviceId(String serviceId) {
            this.putPathParameter("service_id", serviceId);
            this.serviceId = serviceId;
            return this;
        }

        /**
         * docs.
         */
        public Builder docs(java.util.List<Docs> docs) {
            this.putBodyParameter("docs", docs);
            this.docs = docs;
            return this;
        }

        /**
         * options.
         */
        public Builder options(java.util.Map<String, ?> options) {
            this.putBodyParameter("options", options);
            this.options = options;
            return this;
        }

        /**
         * query.
         */
        public Builder query(GetMultiModalRerankerRequestQuery query) {
            this.putBodyParameter("query", query);
            this.query = query;
            return this;
        }

        @Override
        public GetMultiModalRerankerRequest build() {
            return new GetMultiModalRerankerRequest(this);
        } 

    } 

    /**
     * 
     * {@link GetMultiModalRerankerRequest} extends {@link TeaModel}
     *
     * <p>GetMultiModalRerankerRequest</p>
     */
    public static class Docs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("image")
        private String image;

        @com.aliyun.core.annotation.NameInMap("text")
        private String text;

        private Docs(Builder builder) {
            this.image = builder.image;
            this.text = builder.text;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Docs create() {
            return builder().build();
        }

        /**
         * @return image
         */
        public String getImage() {
            return this.image;
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        public static final class Builder {
            private String image; 
            private String text; 

            private Builder() {
            } 

            private Builder(Docs model) {
                this.image = model.image;
                this.text = model.text;
            } 

            /**
             * image.
             */
            public Builder image(String image) {
                this.image = image;
                return this;
            }

            /**
             * text.
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            public Docs build() {
                return new Docs(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetMultiModalRerankerRequest} extends {@link TeaModel}
     *
     * <p>GetMultiModalRerankerRequest</p>
     */
    public static class GetMultiModalRerankerRequestQuery extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("image")
        private String image;

        @com.aliyun.core.annotation.NameInMap("text")
        private String text;

        private GetMultiModalRerankerRequestQuery(Builder builder) {
            this.image = builder.image;
            this.text = builder.text;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GetMultiModalRerankerRequestQuery create() {
            return builder().build();
        }

        /**
         * @return image
         */
        public String getImage() {
            return this.image;
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        public static final class Builder {
            private String image; 
            private String text; 

            private Builder() {
            } 

            private Builder(GetMultiModalRerankerRequestQuery model) {
                this.image = model.image;
                this.text = model.text;
            } 

            /**
             * image.
             */
            public Builder image(String image) {
                this.image = image;
                return this;
            }

            /**
             * text.
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            public GetMultiModalRerankerRequestQuery build() {
                return new GetMultiModalRerankerRequestQuery(this);
            } 

        } 

    }
}
