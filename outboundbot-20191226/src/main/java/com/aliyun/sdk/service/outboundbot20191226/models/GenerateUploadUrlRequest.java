// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GenerateUploadUrlRequest} extends {@link RequestModel}
 *
 * <p>GenerateUploadUrlRequest</p>
 */
public class GenerateUploadUrlRequest extends Request {
    @Query
    @NameInMap("FileName")
    private String fileName;

    @Query
    @NameInMap("Key")
    private String key;

    private GenerateUploadUrlRequest(Builder builder) {
        super(builder);
        this.fileName = builder.fileName;
        this.key = builder.key;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateUploadUrlRequest create() {
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
     * @return key
     */
    public String getKey() {
        return this.key;
    }

    public static final class Builder extends Request.Builder<GenerateUploadUrlRequest, Builder> {
        private String fileName; 
        private String key; 

        private Builder() {
            super();
        } 

        private Builder(GenerateUploadUrlRequest request) {
            super(request);
            this.fileName = request.fileName;
            this.key = request.key;
        } 

        /**
         * FileName.
         */
        public Builder fileName(String fileName) {
            this.putQueryParameter("FileName", fileName);
            this.fileName = fileName;
            return this;
        }

        /**
         * Key.
         */
        public Builder key(String key) {
            this.putQueryParameter("Key", key);
            this.key = key;
            return this;
        }

        @Override
        public GenerateUploadUrlRequest build() {
            return new GenerateUploadUrlRequest(this);
        } 

    } 

}
