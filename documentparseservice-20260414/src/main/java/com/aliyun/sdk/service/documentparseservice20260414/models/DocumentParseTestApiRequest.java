// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.documentparseservice20260414.models;

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
 * {@link DocumentParseTestApiRequest} extends {@link RequestModel}
 *
 * <p>DocumentParseTestApiRequest</p>
 */
public class DocumentParseTestApiRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ImageUrl")
    private String imageUrl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Type")
    private Long type;

    private DocumentParseTestApiRequest(Builder builder) {
        super(builder);
        this.imageUrl = builder.imageUrl;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DocumentParseTestApiRequest create() {
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
     * @return type
     */
    public Long getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<DocumentParseTestApiRequest, Builder> {
        private String imageUrl; 
        private Long type; 

        private Builder() {
            super();
        } 

        private Builder(DocumentParseTestApiRequest request) {
            super(request);
            this.imageUrl = request.imageUrl;
            this.type = request.type;
        } 

        /**
         * ImageUrl.
         */
        public Builder imageUrl(String imageUrl) {
            this.putBodyParameter("ImageUrl", imageUrl);
            this.imageUrl = imageUrl;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(Long type) {
            this.putBodyParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public DocumentParseTestApiRequest build() {
            return new DocumentParseTestApiRequest(this);
        } 

    } 

}
