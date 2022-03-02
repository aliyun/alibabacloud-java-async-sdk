// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link DeleteMultipleObjectsRequest} extends {@link RequestModel}
 *
 * <p>DeleteMultipleObjectsRequest</p>
 */
public class DeleteMultipleObjectsRequest extends Request {
    @Body
    @NameInMap("Delete")
    @Validation(required = true)
    private Delete delete;

    @Host
    @NameInMap("bucket")
    @Validation(required = true)
    private String bucket;

    @Query
    @NameInMap("encoding-type")
    private String encodingType;

    private DeleteMultipleObjectsRequest(Builder builder) {
        super(builder);
        this.delete = builder.delete;
        this.bucket = builder.bucket;
        this.encodingType = builder.encodingType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteMultipleObjectsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return delete
     */
    public Delete getDelete() {
        return this.delete;
    }

    /**
     * @return bucket
     */
    public String getBucket() {
        return this.bucket;
    }

    /**
     * @return encodingType
     */
    public String getEncodingType() {
        return this.encodingType;
    }

    public static final class Builder extends Request.Builder<DeleteMultipleObjectsRequest, Builder> {
        private Delete delete; 
        private String bucket; 
        private String encodingType; 

        private Builder() {
            super();
        } 

        private Builder(DeleteMultipleObjectsRequest request) {
            super(request);
            this.delete = request.delete;
            this.bucket = request.bucket;
            this.encodingType = request.encodingType;
        } 

        /**
         * Delete.
         */
        public Builder delete(Delete delete) {
            this.putBodyParameter("Delete", delete);
            this.delete = delete;
            return this;
        }

        /**
         * bucket.
         */
        public Builder bucket(String bucket) {
            this.putHostParameter("bucket", bucket);
            this.bucket = bucket;
            return this;
        }

        /**
         * encoding-type.
         */
        public Builder encodingType(String encodingType) {
            this.putQueryParameter("encoding-type", encodingType);
            this.encodingType = encodingType;
            return this;
        }

        /**
         * encoding-type.
         */
        public Builder encodingType(EncodeType encodingType) {
            this.putQueryParameter("encoding-type", encodingType.getValue());
            this.encodingType = encodingType.getValue();
            return this;
        }

        @Override
        public DeleteMultipleObjectsRequest build() {
            return new DeleteMultipleObjectsRequest(this);
        } 

    } 

}
