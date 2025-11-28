// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.lingmou20250527.models;

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
 * {@link CreateBroadcastStickerRequest} extends {@link RequestModel}
 *
 * <p>CreateBroadcastStickerRequest</p>
 */
public class CreateBroadcastStickerRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("fileName")
    private String fileName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ossKey")
    private String ossKey;

    private CreateBroadcastStickerRequest(Builder builder) {
        super(builder);
        this.fileName = builder.fileName;
        this.ossKey = builder.ossKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateBroadcastStickerRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fileName
     */
    public String getFileName() {
        return this.fileName;
    }

    /**
     * @return ossKey
     */
    public String getOssKey() {
        return this.ossKey;
    }

    public static final class Builder extends Request.Builder<CreateBroadcastStickerRequest, Builder> {
        private String fileName; 
        private String ossKey; 

        private Builder() {
            super();
        } 

        private Builder(CreateBroadcastStickerRequest request) {
            super(request);
            this.fileName = request.fileName;
            this.ossKey = request.ossKey;
        } 

        /**
         * fileName.
         */
        public Builder fileName(String fileName) {
            this.putBodyParameter("fileName", fileName);
            this.fileName = fileName;
            return this;
        }

        /**
         * ossKey.
         */
        public Builder ossKey(String ossKey) {
            this.putBodyParameter("ossKey", ossKey);
            this.ossKey = ossKey;
            return this;
        }

        @Override
        public CreateBroadcastStickerRequest build() {
            return new CreateBroadcastStickerRequest(this);
        } 

    } 

}
