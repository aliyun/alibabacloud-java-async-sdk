// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateImageInfosRequest} extends {@link RequestModel}
 *
 * <p>UpdateImageInfosRequest</p>
 */
public class UpdateImageInfosRequest extends Request {
    @Query
    @NameInMap("UpdateContent")
    @Validation(required = true)
    private String updateContent;

    private UpdateImageInfosRequest(Builder builder) {
        super(builder);
        this.updateContent = builder.updateContent;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateImageInfosRequest create() {
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

    public static final class Builder extends Request.Builder<UpdateImageInfosRequest, Builder> {
        private String updateContent; 

        private Builder() {
            super();
        } 

        private Builder(UpdateImageInfosRequest request) {
            super(request);
            this.updateContent = request.updateContent;
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
        public UpdateImageInfosRequest build() {
            return new UpdateImageInfosRequest(this);
        } 

    } 

}
