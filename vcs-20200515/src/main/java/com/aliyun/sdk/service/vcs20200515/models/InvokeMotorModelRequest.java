// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InvokeMotorModelRequest} extends {@link RequestModel}
 *
 * <p>InvokeMotorModelRequest</p>
 */
public class InvokeMotorModelRequest extends Request {
    @Body
    @NameInMap("CorpId")
    @Validation(required = true)
    private String corpId;

    @Body
    @NameInMap("PicId")
    @Validation(required = true)
    private String picId;

    @Body
    @NameInMap("PicPath")
    @Validation(maximum = 9999999999D)
    private String picPath;

    @Body
    @NameInMap("PicUrl")
    private String picUrl;

    private InvokeMotorModelRequest(Builder builder) {
        super(builder);
        this.corpId = builder.corpId;
        this.picId = builder.picId;
        this.picPath = builder.picPath;
        this.picUrl = builder.picUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InvokeMotorModelRequest create() {
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
     * @return picId
     */
    public String getPicId() {
        return this.picId;
    }

    /**
     * @return picPath
     */
    public String getPicPath() {
        return this.picPath;
    }

    /**
     * @return picUrl
     */
    public String getPicUrl() {
        return this.picUrl;
    }

    public static final class Builder extends Request.Builder<InvokeMotorModelRequest, Builder> {
        private String corpId; 
        private String picId; 
        private String picPath; 
        private String picUrl; 

        private Builder() {
            super();
        } 

        private Builder(InvokeMotorModelRequest response) {
            super(response);
            this.corpId = response.corpId;
            this.picId = response.picId;
            this.picPath = response.picPath;
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
         * PicId.
         */
        public Builder picId(String picId) {
            this.putBodyParameter("PicId", picId);
            this.picId = picId;
            return this;
        }

        /**
         * PicPath.
         */
        public Builder picPath(String picPath) {
            this.putBodyParameter("PicPath", picPath);
            this.picPath = picPath;
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
        public InvokeMotorModelRequest build() {
            return new InvokeMotorModelRequest(this);
        } 

    } 

}
