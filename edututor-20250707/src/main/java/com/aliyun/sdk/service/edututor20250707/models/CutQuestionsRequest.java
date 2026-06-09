// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edututor20250707.models;

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
 * {@link CutQuestionsRequest} extends {@link RequestModel}
 *
 * <p>CutQuestionsRequest</p>
 */
public class CutQuestionsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("image")
    @com.aliyun.core.annotation.Validation(required = true)
    private String image;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("parameters")
    @com.aliyun.core.annotation.Validation(required = true)
    private Parameters parameters;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private CutQuestionsRequest(Builder builder) {
        super(builder);
        this.image = builder.image;
        this.parameters = builder.parameters;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CutQuestionsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return image
     */
    public String getImage() {
        return this.image;
    }

    /**
     * @return parameters
     */
    public Parameters getParameters() {
        return this.parameters;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<CutQuestionsRequest, Builder> {
        private String image; 
        private Parameters parameters; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(CutQuestionsRequest request) {
            super(request);
            this.image = request.image;
            this.parameters = request.parameters;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder image(String image) {
            this.putBodyParameter("image", image);
            this.image = image;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder parameters(Parameters parameters) {
            this.putBodyParameter("parameters", parameters);
            this.parameters = parameters;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>llm-1ijrzuv3v0ivvls7</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public CutQuestionsRequest build() {
            return new CutQuestionsRequest(this);
        } 

    } 

    /**
     * 
     * {@link CutQuestionsRequest} extends {@link TeaModel}
     *
     * <p>CutQuestionsRequest</p>
     */
    public static class Parameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("extract_images")
        @com.aliyun.core.annotation.Validation(required = true)
        private Boolean extractImages;

        @com.aliyun.core.annotation.NameInMap("struct")
        @com.aliyun.core.annotation.Validation(required = true)
        private Boolean struct;

        private Parameters(Builder builder) {
            this.extractImages = builder.extractImages;
            this.struct = builder.struct;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Parameters create() {
            return builder().build();
        }

        /**
         * @return extractImages
         */
        public Boolean getExtractImages() {
            return this.extractImages;
        }

        /**
         * @return struct
         */
        public Boolean getStruct() {
            return this.struct;
        }

        public static final class Builder {
            private Boolean extractImages; 
            private Boolean struct; 

            private Builder() {
            } 

            private Builder(Parameters model) {
                this.extractImages = model.extractImages;
                this.struct = model.struct;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder extractImages(Boolean extractImages) {
                this.extractImages = extractImages;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder struct(Boolean struct) {
                this.struct = struct;
                return this;
            }

            public Parameters build() {
                return new Parameters(this);
            } 

        } 

    }
}
