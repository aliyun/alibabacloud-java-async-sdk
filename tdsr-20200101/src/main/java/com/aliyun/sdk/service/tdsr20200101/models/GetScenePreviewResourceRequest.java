// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetScenePreviewResourceRequest} extends {@link RequestModel}
 *
 * <p>GetScenePreviewResourceRequest</p>
 */
public class GetScenePreviewResourceRequest extends Request {
    @Query
    @NameInMap("Draft")
    private Boolean draft;

    @Query
    @NameInMap("PreviewToken")
    @Validation(required = true)
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
         * 是否草稿预览
         */
        public Builder draft(Boolean draft) {
            this.putQueryParameter("Draft", draft);
            this.draft = draft;
            return this;
        }

        /**
         * 预览token
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
