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
 * {@link GetMultiModalEmbeddingRequest} extends {@link RequestModel}
 *
 * <p>GetMultiModalEmbeddingRequest</p>
 */
public class GetMultiModalEmbeddingRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspace_name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceName;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("service_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("input")
    private java.util.List<Input> input;

    private GetMultiModalEmbeddingRequest(Builder builder) {
        super(builder);
        this.workspaceName = builder.workspaceName;
        this.serviceId = builder.serviceId;
        this.input = builder.input;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMultiModalEmbeddingRequest create() {
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
     * @return input
     */
    public java.util.List<Input> getInput() {
        return this.input;
    }

    public static final class Builder extends Request.Builder<GetMultiModalEmbeddingRequest, Builder> {
        private String workspaceName; 
        private String serviceId; 
        private java.util.List<Input> input; 

        private Builder() {
            super();
        } 

        private Builder(GetMultiModalEmbeddingRequest request) {
            super(request);
            this.workspaceName = request.workspaceName;
            this.serviceId = request.serviceId;
            this.input = request.input;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder workspaceName(String workspaceName) {
            this.putPathParameter("workspace_name", workspaceName);
            this.workspaceName = workspaceName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder serviceId(String serviceId) {
            this.putPathParameter("service_id", serviceId);
            this.serviceId = serviceId;
            return this;
        }

        /**
         * input.
         */
        public Builder input(java.util.List<Input> input) {
            this.putBodyParameter("input", input);
            this.input = input;
            return this;
        }

        @Override
        public GetMultiModalEmbeddingRequest build() {
            return new GetMultiModalEmbeddingRequest(this);
        } 

    } 

    /**
     * 
     * {@link GetMultiModalEmbeddingRequest} extends {@link TeaModel}
     *
     * <p>GetMultiModalEmbeddingRequest</p>
     */
    public static class Input extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("image")
        private String image;

        @com.aliyun.core.annotation.NameInMap("text")
        private String text;

        private Input(Builder builder) {
            this.image = builder.image;
            this.text = builder.text;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Input create() {
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

            private Builder(Input model) {
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

            public Input build() {
                return new Input(this);
            } 

        } 

    }
}
