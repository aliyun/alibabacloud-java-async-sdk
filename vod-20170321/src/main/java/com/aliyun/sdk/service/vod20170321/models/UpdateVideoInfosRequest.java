// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateVideoInfosRequest} extends {@link RequestModel}
 *
 * <p>UpdateVideoInfosRequest</p>
 */
public class UpdateVideoInfosRequest extends Request {
    @Query
    @NameInMap("UpdateContent")
    @Validation(required = true)
    private String updateContent;

    private UpdateVideoInfosRequest(Builder builder) {
        super(builder);
        this.updateContent = builder.updateContent;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateVideoInfosRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return updateContent
     */
    public String getUpdateContent() {
        return this.updateContent;
    }

    public static final class Builder extends Request.Builder<UpdateVideoInfosRequest, Builder> {
        private String updateContent; 

        private Builder() {
            super();
        } 

        private Builder(UpdateVideoInfosRequest response) {
            super(response);
            this.updateContent = response.updateContent;
        } 

        /**
         * UpdateContent.
         */
        public Builder updateContent(String updateContent) {
            this.putQueryParameter("UpdateContent", updateContent);
            this.updateContent = updateContent;
            return this;
        }

        @Override
        public UpdateVideoInfosRequest build() {
            return new UpdateVideoInfosRequest(this);
        } 

    } 

}
