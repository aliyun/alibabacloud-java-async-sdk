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
 * {@link CreateBroadcastAudioRequest} extends {@link RequestModel}
 *
 * <p>CreateBroadcastAudioRequest</p>
 */
public class CreateBroadcastAudioRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("fileName")
    private String fileName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ossKey")
    private String ossKey;

    private CreateBroadcastAudioRequest(Builder builder) {
        super(builder);
        this.fileName = builder.fileName;
        this.ossKey = builder.ossKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateBroadcastAudioRequest create() {
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

    public static final class Builder extends Request.Builder<CreateBroadcastAudioRequest, Builder> {
        private String fileName; 
        private String ossKey; 

        private Builder() {
            super();
        } 

        private Builder(CreateBroadcastAudioRequest request) {
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
        public CreateBroadcastAudioRequest build() {
            return new CreateBroadcastAudioRequest(this);
        } 

    } 

}
