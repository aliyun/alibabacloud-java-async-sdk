// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateFileDetectRequest} extends {@link RequestModel}
 *
 * <p>CreateFileDetectRequest</p>
 */
public class CreateFileDetectRequest extends Request {
    @Query
    @NameInMap("DownloadUrl")
    private String downloadUrl;

    @Query
    @NameInMap("HashKey")
    @Validation(required = true)
    private String hashKey;

    @Query
    @NameInMap("OssKey")
    private String ossKey;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    @Query
    @NameInMap("Type")
    @Validation(required = true)
    private Integer type;

    private CreateFileDetectRequest(Builder builder) {
        super(builder);
        this.downloadUrl = builder.downloadUrl;
        this.hashKey = builder.hashKey;
        this.ossKey = builder.ossKey;
        this.sourceIp = builder.sourceIp;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateFileDetectRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return downloadUrl
     */
    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    /**
     * @return hashKey
     */
    public String getHashKey() {
        return this.hashKey;
    }

    /**
     * @return ossKey
     */
    public String getOssKey() {
        return this.ossKey;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * @return type
     */
    public Integer getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<CreateFileDetectRequest, Builder> {
        private String downloadUrl; 
        private String hashKey; 
        private String ossKey; 
        private String sourceIp; 
        private Integer type; 

        private Builder() {
            super();
        } 

        private Builder(CreateFileDetectRequest request) {
            super(request);
            this.downloadUrl = request.downloadUrl;
            this.hashKey = request.hashKey;
            this.ossKey = request.ossKey;
            this.sourceIp = request.sourceIp;
            this.type = request.type;
        } 

        /**
         * DownloadUrl.
         */
        public Builder downloadUrl(String downloadUrl) {
            this.putQueryParameter("DownloadUrl", downloadUrl);
            this.downloadUrl = downloadUrl;
            return this;
        }

        /**
         * HashKey.
         */
        public Builder hashKey(String hashKey) {
            this.putQueryParameter("HashKey", hashKey);
            this.hashKey = hashKey;
            return this;
        }

        /**
         * OssKey.
         */
        public Builder ossKey(String ossKey) {
            this.putQueryParameter("OssKey", ossKey);
            this.ossKey = ossKey;
            return this;
        }

        /**
         * SourceIp.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(Integer type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public CreateFileDetectRequest build() {
            return new CreateFileDetectRequest(this);
        } 

    } 

}
