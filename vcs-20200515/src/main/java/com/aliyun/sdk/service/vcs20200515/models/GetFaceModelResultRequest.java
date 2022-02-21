// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetFaceModelResultRequest} extends {@link RequestModel}
 *
 * <p>GetFaceModelResultRequest</p>
 */
public class GetFaceModelResultRequest extends Request {
    @Body
    @NameInMap("PictureContent")
    private String pictureContent;

    @Body
    @NameInMap("PictureId")
    @Validation(required = true)
    private String pictureId;

    @Body
    @NameInMap("PictureUrl")
    private String pictureUrl;

    private GetFaceModelResultRequest(Builder builder) {
        super(builder);
        this.pictureContent = builder.pictureContent;
        this.pictureId = builder.pictureId;
        this.pictureUrl = builder.pictureUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFaceModelResultRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pictureContent
     */
    public String getPictureContent() {
        return this.pictureContent;
    }

    /**
     * @return pictureId
     */
    public String getPictureId() {
        return this.pictureId;
    }

    /**
     * @return pictureUrl
     */
    public String getPictureUrl() {
        return this.pictureUrl;
    }

    public static final class Builder extends Request.Builder<GetFaceModelResultRequest, Builder> {
        private String pictureContent; 
        private String pictureId; 
        private String pictureUrl; 

        private Builder() {
            super();
        } 

        private Builder(GetFaceModelResultRequest response) {
            super(response);
            this.pictureContent = response.pictureContent;
            this.pictureId = response.pictureId;
            this.pictureUrl = response.pictureUrl;
        } 

        /**
         * PictureContent.
         */
        public Builder pictureContent(String pictureContent) {
            this.putBodyParameter("PictureContent", pictureContent);
            this.pictureContent = pictureContent;
            return this;
        }

        /**
         * PictureId.
         */
        public Builder pictureId(String pictureId) {
            this.putBodyParameter("PictureId", pictureId);
            this.pictureId = pictureId;
            return this;
        }

        /**
         * PictureUrl.
         */
        public Builder pictureUrl(String pictureUrl) {
            this.putBodyParameter("PictureUrl", pictureUrl);
            this.pictureUrl = pictureUrl;
            return this;
        }

        @Override
        public GetFaceModelResultRequest build() {
            return new GetFaceModelResultRequest(this);
        } 

    } 

}
