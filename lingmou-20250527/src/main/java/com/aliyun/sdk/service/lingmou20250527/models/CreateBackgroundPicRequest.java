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
 * {@link CreateBackgroundPicRequest} extends {@link RequestModel}
 *
 * <p>CreateBackgroundPicRequest</p>
 */
public class CreateBackgroundPicRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("filename")
    private String filename;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ossKey")
    private String ossKey;

    private CreateBackgroundPicRequest(Builder builder) {
        super(builder);
        this.filename = builder.filename;
        this.ossKey = builder.ossKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateBackgroundPicRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return filename
     */
    public String getFilename() {
        return this.filename;
    }

    /**
     * @return ossKey
     */
    public String getOssKey() {
        return this.ossKey;
    }

    public static final class Builder extends Request.Builder<CreateBackgroundPicRequest, Builder> {
        private String filename; 
        private String ossKey; 

        private Builder() {
            super();
        } 

        private Builder(CreateBackgroundPicRequest request) {
            super(request);
            this.filename = request.filename;
            this.ossKey = request.ossKey;
        } 

        /**
         * filename.
         */
        public Builder filename(String filename) {
            this.putQueryParameter("filename", filename);
            this.filename = filename;
            return this;
        }

        /**
         * ossKey.
         */
        public Builder ossKey(String ossKey) {
            this.putQueryParameter("ossKey", ossKey);
            this.ossKey = ossKey;
            return this;
        }

        @Override
        public CreateBackgroundPicRequest build() {
            return new CreateBackgroundPicRequest(this);
        } 

    } 

}
