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
 * {@link DiduiAreaDeductionProRequest} extends {@link RequestModel}
 *
 * <p>DiduiAreaDeductionProRequest</p>
 */
public class DiduiAreaDeductionProRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageUrl")
    @com.aliyun.core.annotation.Validation(required = true)
    private String imageUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RagId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ragId;

    private DiduiAreaDeductionProRequest(Builder builder) {
        super(builder);
        this.imageUrl = builder.imageUrl;
        this.ragId = builder.ragId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DiduiAreaDeductionProRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<DiduiAreaDeductionProRequest, Builder> {
        private String imageUrl; 
        private String ragId; 

        private Builder() {
            super();
        } 

        private Builder(DiduiAreaDeductionProRequest request) {
            super(request);
            this.imageUrl = request.imageUrl;
            this.ragId = request.ragId;
        } 

        /**
         * <p>The HTTP(S) URL of the overall floor display image.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/image.jpg">https://example.com/image.jpg</a></p>
         */
        public Builder imageUrl(String imageUrl) {
            this.putQueryParameter("ImageUrl", imageUrl);
            this.imageUrl = imageUrl;
            return this;
        }

        /**
         * <p>The ID of the SKU asset knowledge base.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rag_9c1f2b7d4e5a4c8fa1b2c3d4e5f60718</p>
         */
        public Builder ragId(String ragId) {
            this.putQueryParameter("RagId", ragId);
            this.ragId = ragId;
            return this;
        }

        @Override
        public DiduiAreaDeductionProRequest build() {
            return new DiduiAreaDeductionProRequest(this);
        } 

    } 

}
