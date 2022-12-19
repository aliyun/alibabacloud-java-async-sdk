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
    @NameInMap("HashKey")
    @Validation(required = true)
    private String hashKey;

    @Query
    @NameInMap("OssKey")
    @Validation(required = true)
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
        private String hashKey; 
        private String ossKey; 
        private String sourceIp; 
        private Integer type; 

        private Builder() {
            super();
        } 

        private Builder(CreateFileDetectRequest request) {
            super(request);
            this.hashKey = request.hashKey;
            this.ossKey = request.ossKey;
            this.sourceIp = request.sourceIp;
            this.type = request.type;
        } 

        /**
         * The identifier of the file. Only MD5 hash values are supported.
         */
        public Builder hashKey(String hashKey) {
            this.putQueryParameter("HashKey", hashKey);
            this.hashKey = hashKey;
            return this;
        }

        /**
         * The key of the file that is stored in the Object Storage Service (OSS) bucket. You can call the [CreateFileDetectUploadUrl](~~CreateFileDetectUploadUrl~~) operation to query the keys of files.
         */
        public Builder ossKey(String ossKey) {
            this.putQueryParameter("OssKey", ossKey);
            this.ossKey = ossKey;
            return this;
        }

        /**
         * The source IP address of the request.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * The type of the file. Valid values:
         * <p>
         * 
         * *   **0**: unknown files
         * *   **1**: binary files
         * *   **2**: webshell files
         * *   **4**: script files
         * 
         * >  If you do not know the type of the file, set this parameter to 0.
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
