// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RecognizeImageRequest} extends {@link RequestModel}
 *
 * <p>RecognizeImageRequest</p>
 */
public class RecognizeImageRequest extends Request {
    @Body
    @NameInMap("CorpId")
    @Validation(required = true)
    private String corpId;

    @Body
    @NameInMap("PicContent")
    private String picContent;

    @Body
    @NameInMap("PicFormat")
    @Validation(required = true)
    private String picFormat;

    @Body
    @NameInMap("PicUrl")
    private String picUrl;

    private RecognizeImageRequest(Builder builder) {
        super(builder);
        this.corpId = builder.corpId;
        this.picContent = builder.picContent;
        this.picFormat = builder.picFormat;
        this.picUrl = builder.picUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RecognizeImageRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return corpId
     */
    public String getCorpId() {
        return this.corpId;
    }

    /**
     * @return picContent
     */
    public String getPicContent() {
        return this.picContent;
    }

    /**
     * @return picFormat
     */
    public String getPicFormat() {
        return this.picFormat;
    }

    /**
     * @return picUrl
     */
    public String getPicUrl() {
        return this.picUrl;
    }

    public static final class Builder extends Request.Builder<RecognizeImageRequest, Builder> {
        private String corpId; 
        private String picContent; 
        private String picFormat; 
        private String picUrl; 

        private Builder() {
            super();
        } 

        private Builder(RecognizeImageRequest response) {
            super(response);
            this.corpId = response.corpId;
            this.picContent = response.picContent;
            this.picFormat = response.picFormat;
            this.picUrl = response.picUrl;
        } 

        /**
         * CorpId.
         */
        public Builder corpId(String corpId) {
            this.putBodyParameter("CorpId", corpId);
            this.corpId = corpId;
            return this;
        }

        /**
         * PicContent.
         */
        public Builder picContent(String picContent) {
            this.putBodyParameter("PicContent", picContent);
            this.picContent = picContent;
            return this;
        }

        /**
         * PicFormat.
         */
        public Builder picFormat(String picFormat) {
            this.putBodyParameter("PicFormat", picFormat);
            this.picFormat = picFormat;
            return this;
        }

        /**
         * PicUrl.
         */
        public Builder picUrl(String picUrl) {
            this.putBodyParameter("PicUrl", picUrl);
            this.picUrl = picUrl;
            return this;
        }

        @Override
        public RecognizeImageRequest build() {
            return new RecognizeImageRequest(this);
        } 

    } 

}
