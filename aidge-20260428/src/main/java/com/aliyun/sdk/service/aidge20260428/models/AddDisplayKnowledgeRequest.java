// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aidge20260428.models;

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
 * {@link AddDisplayKnowledgeRequest} extends {@link RequestModel}
 *
 * <p>AddDisplayKnowledgeRequest</p>
 */
public class AddDisplayKnowledgeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RagId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ragId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Records")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Records> records;

    private AddDisplayKnowledgeRequest(Builder builder) {
        super(builder);
        this.ragId = builder.ragId;
        this.records = builder.records;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddDisplayKnowledgeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ragId
     */
    public String getRagId() {
        return this.ragId;
    }

    /**
     * @return records
     */
    public java.util.List<Records> getRecords() {
        return this.records;
    }

    public static final class Builder extends Request.Builder<AddDisplayKnowledgeRequest, Builder> {
        private String ragId; 
        private java.util.List<Records> records; 

        private Builder() {
            super();
        } 

        private Builder(AddDisplayKnowledgeRequest request) {
            super(request);
            this.ragId = request.ragId;
            this.records = request.records;
        } 

        /**
         * <p>The knowledge base ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rag_xxx</p>
         */
        public Builder ragId(String ragId) {
            this.putQueryParameter("RagId", ragId);
            this.ragId = ragId;
            return this;
        }

        /**
         * <p>The records to add. A maximum of 500 records are supported.</p>
         * <p>This parameter is required.</p>
         */
        public Builder records(java.util.List<Records> records) {
            String recordsShrink = shrink(records, "Records", "json");
            this.putQueryParameter("Records", recordsShrink);
            this.records = records;
            return this;
        }

        @Override
        public AddDisplayKnowledgeRequest build() {
            return new AddDisplayKnowledgeRequest(this);
        } 

    } 

    /**
     * 
     * {@link AddDisplayKnowledgeRequest} extends {@link TeaModel}
     *
     * <p>AddDisplayKnowledgeRequest</p>
     */
    public static class Records extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ImageUrl")
        private String imageUrl;

        @com.aliyun.core.annotation.NameInMap("SkuId")
        private String skuId;

        @com.aliyun.core.annotation.NameInMap("SkuName")
        private String skuName;

        private Records(Builder builder) {
            this.imageUrl = builder.imageUrl;
            this.skuId = builder.skuId;
            this.skuName = builder.skuName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Records create() {
            return builder().build();
        }

        /**
         * @return imageUrl
         */
        public String getImageUrl() {
            return this.imageUrl;
        }

        /**
         * @return skuId
         */
        public String getSkuId() {
            return this.skuId;
        }

        /**
         * @return skuName
         */
        public String getSkuName() {
            return this.skuName;
        }

        public static final class Builder {
            private String imageUrl; 
            private String skuId; 
            private String skuName; 

            private Builder() {
            } 

            private Builder(Records model) {
                this.imageUrl = model.imageUrl;
                this.skuId = model.skuId;
                this.skuName = model.skuName;
            } 

            /**
             * <p>The HTTP(S) URL of the product image.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://xxxx/img_1784599244373_9c2309a0.jpg">https://xxxx/img_1784599244373_9c2309a0.jpg</a></p>
             */
            public Builder imageUrl(String imageUrl) {
                this.imageUrl = imageUrl;
                return this;
            }

            /**
             * <p>The SKU ID. If this parameter is left empty, the platform generates the ID.</p>
             * 
             * <strong>example:</strong>
             * <p>sku-001</p>
             */
            public Builder skuId(String skuId) {
                this.skuId = skuId;
                return this;
            }

            /**
             * <p>The SKU name.</p>
             * 
             * <strong>example:</strong>
             * <p>Product front image</p>
             */
            public Builder skuName(String skuName) {
                this.skuName = skuName;
                return this;
            }

            public Records build() {
                return new Records(this);
            } 

        } 

    }
}
