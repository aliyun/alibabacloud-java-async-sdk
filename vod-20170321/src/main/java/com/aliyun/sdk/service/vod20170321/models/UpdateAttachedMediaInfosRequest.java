// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAttachedMediaInfosRequest} extends {@link RequestModel}
 *
 * <p>UpdateAttachedMediaInfosRequest</p>
 */
public class UpdateAttachedMediaInfosRequest extends Request {
    @Query
    @NameInMap("UpdateContent")
    @Validation(required = true)
    private String updateContent;

    private UpdateAttachedMediaInfosRequest(Builder builder) {
        super(builder);
        this.updateContent = builder.updateContent;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAttachedMediaInfosRequest create() {
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

    public static final class Builder extends Request.Builder<UpdateAttachedMediaInfosRequest, Builder> {
        private String updateContent; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAttachedMediaInfosRequest request) {
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
        public UpdateAttachedMediaInfosRequest build() {
            return new UpdateAttachedMediaInfosRequest(this);
        } 

    } 

}
