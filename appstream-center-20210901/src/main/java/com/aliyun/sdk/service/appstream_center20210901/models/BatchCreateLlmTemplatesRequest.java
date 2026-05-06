// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link BatchCreateLlmTemplatesRequest} extends {@link RequestModel}
 *
 * <p>BatchCreateLlmTemplatesRequest</p>
 */
public class BatchCreateLlmTemplatesRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LlmTemplateItems")
    private java.util.List<LlmTemplateItems> llmTemplateItems;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ModelTemplateId")
    private String modelTemplateId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProviderTemplateId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String providerTemplateId;

    private BatchCreateLlmTemplatesRequest(Builder builder) {
        super(builder);
        this.llmTemplateItems = builder.llmTemplateItems;
        this.modelTemplateId = builder.modelTemplateId;
        this.providerTemplateId = builder.providerTemplateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchCreateLlmTemplatesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return llmTemplateItems
     */
    public java.util.List<LlmTemplateItems> getLlmTemplateItems() {
        return this.llmTemplateItems;
    }

    /**
     * @return modelTemplateId
     */
    public String getModelTemplateId() {
        return this.modelTemplateId;
    }

    /**
     * @return providerTemplateId
     */
    public String getProviderTemplateId() {
        return this.providerTemplateId;
    }

    public static final class Builder extends Request.Builder<BatchCreateLlmTemplatesRequest, Builder> {
        private java.util.List<LlmTemplateItems> llmTemplateItems; 
        private String modelTemplateId; 
        private String providerTemplateId; 

        private Builder() {
            super();
        } 

        private Builder(BatchCreateLlmTemplatesRequest request) {
            super(request);
            this.llmTemplateItems = request.llmTemplateItems;
            this.modelTemplateId = request.modelTemplateId;
            this.providerTemplateId = request.providerTemplateId;
        } 

        /**
         * LlmTemplateItems.
         */
        public Builder llmTemplateItems(java.util.List<LlmTemplateItems> llmTemplateItems) {
            this.putBodyParameter("LlmTemplateItems", llmTemplateItems);
            this.llmTemplateItems = llmTemplateItems;
            return this;
        }

        /**
         * ModelTemplateId.
         */
        public Builder modelTemplateId(String modelTemplateId) {
            this.putBodyParameter("ModelTemplateId", modelTemplateId);
            this.modelTemplateId = modelTemplateId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mpt-xxxx</p>
         */
        public Builder providerTemplateId(String providerTemplateId) {
            this.putBodyParameter("ProviderTemplateId", providerTemplateId);
            this.providerTemplateId = providerTemplateId;
            return this;
        }

        @Override
        public BatchCreateLlmTemplatesRequest build() {
            return new BatchCreateLlmTemplatesRequest(this);
        } 

    } 

    /**
     * 
     * {@link BatchCreateLlmTemplatesRequest} extends {@link TeaModel}
     *
     * <p>BatchCreateLlmTemplatesRequest</p>
     */
    public static class LlmTemplateItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Config")
        private String config;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("IsDefaultModel")
        private Boolean isDefaultModel;

        @com.aliyun.core.annotation.NameInMap("LlmCode")
        private String llmCode;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private LlmTemplateItems(Builder builder) {
            this.config = builder.config;
            this.description = builder.description;
            this.isDefaultModel = builder.isDefaultModel;
            this.llmCode = builder.llmCode;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LlmTemplateItems create() {
            return builder().build();
        }

        /**
         * @return config
         */
        public String getConfig() {
            return this.config;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return isDefaultModel
         */
        public Boolean getIsDefaultModel() {
            return this.isDefaultModel;
        }

        /**
         * @return llmCode
         */
        public String getLlmCode() {
            return this.llmCode;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String config; 
            private String description; 
            private Boolean isDefaultModel; 
            private String llmCode; 
            private String name; 

            private Builder() {
            } 

            private Builder(LlmTemplateItems model) {
                this.config = model.config;
                this.description = model.description;
                this.isDefaultModel = model.isDefaultModel;
                this.llmCode = model.llmCode;
                this.name = model.name;
            } 

            /**
             * Config.
             */
            public Builder config(String config) {
                this.config = config;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * IsDefaultModel.
             */
            public Builder isDefaultModel(Boolean isDefaultModel) {
                this.isDefaultModel = isDefaultModel;
                return this;
            }

            /**
             * LlmCode.
             */
            public Builder llmCode(String llmCode) {
                this.llmCode = llmCode;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public LlmTemplateItems build() {
                return new LlmTemplateItems(this);
            } 

        } 

    }
}
