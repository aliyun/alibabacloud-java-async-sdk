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
 * {@link MerchandisePlacementDetectionRequest} extends {@link RequestModel}
 *
 * <p>MerchandisePlacementDetectionRequest</p>
 */
public class MerchandisePlacementDetectionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApiId")
    private String apiId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageUrl")
    @com.aliyun.core.annotation.Validation(required = true)
    private String imageUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RagId")
    private String ragId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private MerchandisePlacementDetectionRequest(Builder builder) {
        super(builder);
        this.apiId = builder.apiId;
        this.imageUrl = builder.imageUrl;
        this.ragId = builder.ragId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MerchandisePlacementDetectionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiId
     */
    public String getApiId() {
        return this.apiId;
    }

    /**
     * @return imageUrl
     */
    public String getImageUrl() {
        return this.imageUrl;
    }

    /**
     * @return ragId
     */
    public String getRagId() {
        return this.ragId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<MerchandisePlacementDetectionRequest, Builder> {
        private String apiId; 
        private String imageUrl; 
        private String ragId; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(MerchandisePlacementDetectionRequest request) {
            super(request);
            this.apiId = request.apiId;
            this.imageUrl = request.imageUrl;
            this.ragId = request.ragId;
            this.type = request.type;
        } 

        /**
         * <p>Specify this parameter to use a custom API version. If you created a custom API during the trial phase, you can find the corresponding ApiId in the product console under <strong>Intelligent Inspection &gt; API Management &gt; My APIs</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>api_xxx</p>
         */
        public Builder apiId(String apiId) {
            this.putQueryParameter("ApiId", apiId);
            this.apiId = apiId;
            return this;
        }

        /**
         * <p>The URL of the shelf or floor-stack photo to be recognized (accessible over the Internet or from OSS).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/shelf.jpg">https://example.com/shelf.jpg</a></p>
         */
        public Builder imageUrl(String imageUrl) {
            this.putQueryParameter("ImageUrl", imageUrl);
            this.imageUrl = imageUrl;
            return this;
        }

        /**
         * <p>The ID of the customer-specific SKU vector library, which determines which library is used for recall. The library must be created in advance through the library creation process.</p>
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
         * <p>The business type (reserved for future routing by business line). The current release supports skincare.</p>
         * 
         * <strong>example:</strong>
         * <p>skincare</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public MerchandisePlacementDetectionRequest build() {
            return new MerchandisePlacementDetectionRequest(this);
        } 

    } 

}
