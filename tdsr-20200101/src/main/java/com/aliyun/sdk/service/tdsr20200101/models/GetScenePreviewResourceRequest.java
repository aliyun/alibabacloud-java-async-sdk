// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

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
 * {@link GetScenePreviewResourceRequest} extends {@link RequestModel}
 *
 * <p>GetScenePreviewResourceRequest</p>
 */
public class GetScenePreviewResourceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Draft")
    private Boolean draft;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PreviewToken")
    @com.aliyun.core.annotation.Validation(required = true)
    private String previewToken;

    private GetScenePreviewResourceRequest(Builder builder) {
        super(builder);
        this.draft = builder.draft;
        this.previewToken = builder.previewToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetScenePreviewResourceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return draft
     */
    public Boolean getDraft() {
        return this.draft;
    }

    /**
     * @return previewToken
     */
    public String getPreviewToken() {
        return this.previewToken;
    }

    public static final class Builder extends Request.Builder<GetScenePreviewResourceRequest, Builder> {
        private Boolean draft; 
        private String previewToken; 

        private Builder() {
            super();
        } 

        private Builder(GetScenePreviewResourceRequest request) {
            super(request);
            this.draft = request.draft;
            this.previewToken = request.previewToken;
        } 

        /**
         * Draft.
         */
        public Builder draft(Boolean draft) {
            this.putQueryParameter("Draft", draft);
            this.draft = draft;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2deb941b3e1****</p>
         */
        public Builder previewToken(String previewToken) {
            this.putQueryParameter("PreviewToken", previewToken);
            this.previewToken = previewToken;
            return this;
        }

        @Override
        public GetScenePreviewResourceRequest build() {
            return new GetScenePreviewResourceRequest(this);
        } 

    } 

}
