// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link SelectObjectRequest} extends {@link RequestModel}
 *
 * <p>SelectObjectRequest</p>
 */
public class SelectObjectRequest extends Request {
    @Path
    @NameInMap("key")
    @Validation(required = true)
    private String key;

    @Body
    @NameInMap("SelectRequest")
    @Validation(required = true)
    private SelectRequest selectRequest;

    @Host
    @NameInMap("bucket")
    @Validation(required = true)
    private String bucket;

    private SelectObjectRequest(Builder builder) {
        super(builder);
        this.key = builder.key;
        this.selectRequest = builder.selectRequest;
        this.bucket = builder.bucket;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SelectObjectRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return key
     */
    public String getKey() {
        return this.key;
    }

    /**
     * @return selectRequest
     */
    public SelectRequest getSelectRequest() {
        return this.selectRequest;
    }

    /**
     * @return bucket
     */
    public String getBucket() {
        return this.bucket;
    }

    public static final class Builder extends Request.Builder<SelectObjectRequest, Builder> {
        private String key; 
        private SelectRequest selectRequest; 
        private String bucket; 

        private Builder() {
            super();
        } 

        private Builder(SelectObjectRequest request) {
            super(request);
            this.key = request.key;
            this.selectRequest = request.selectRequest;
            this.bucket = request.bucket;
        } 

        /**
         * key.
         */
        public Builder key(String key) {
            this.putPathParameter("key", key);
            this.key = key;
            return this;
        }

        /**
         * SelectRequest.
         */
        public Builder selectRequest(SelectRequest selectRequest) {
            this.putBodyParameter("SelectRequest", selectRequest);
            this.selectRequest = selectRequest;
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

        @Override
        public SelectObjectRequest build() {
            return new SelectObjectRequest(this);
        } 

    } 

}
