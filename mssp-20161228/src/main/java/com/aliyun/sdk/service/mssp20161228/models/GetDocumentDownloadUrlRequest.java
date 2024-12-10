// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mssp20161228.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetDocumentDownloadUrlRequest} extends {@link RequestModel}
 *
 * <p>GetDocumentDownloadUrlRequest</p>
 */
public class GetDocumentDownloadUrlRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long id;

    private GetDocumentDownloadUrlRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDocumentDownloadUrlRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    public static final class Builder extends Request.Builder<GetDocumentDownloadUrlRequest, Builder> {
        private Long id; 

        private Builder() {
            super();
        } 

        private Builder(GetDocumentDownloadUrlRequest request) {
            super(request);
            this.id = request.id;
        } 

        /**
         * <p>Document management ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>175815</p>
         */
        public Builder id(Long id) {
            this.putBodyParameter("Id", id);
            this.id = id;
            return this;
        }

        @Override
        public GetDocumentDownloadUrlRequest build() {
            return new GetDocumentDownloadUrlRequest(this);
        } 

    } 

}
