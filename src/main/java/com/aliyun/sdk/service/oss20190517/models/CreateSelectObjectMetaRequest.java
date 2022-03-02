// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link CreateSelectObjectMetaRequest} extends {@link RequestModel}
 *
 * <p>CreateSelectObjectMetaRequest</p>
 */
public class CreateSelectObjectMetaRequest extends Request {
    @Path
    @NameInMap("key")
    @Validation(required = true)
    private String key;

    @Body
    @NameInMap("body")
    private SelectMetaRequest selectMetaRequest;

    @Host
    @NameInMap("bucket")
    @Validation(required = true)
    private String bucket;

    private CreateSelectObjectMetaRequest(Builder builder) {
        super(builder);
        this.key = builder.key;
        this.selectMetaRequest = builder.selectMetaRequest;
        this.bucket = builder.bucket;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSelectObjectMetaRequest create() {
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
     * @return selectMetaRequest
     */
    public SelectMetaRequest getSelectMetaRequest() {
        return this.selectMetaRequest;
    }

    /**
     * @return bucket
     */
    public String getBucket() {
        return this.bucket;
    }

    public static final class Builder extends Request.Builder<CreateSelectObjectMetaRequest, Builder> {
        private String key; 
        private SelectMetaRequest selectMetaRequest; 
        private String bucket; 

        private Builder() {
            super();
        } 

        private Builder(CreateSelectObjectMetaRequest request) {
            super(request);
            this.key = request.key;
            this.selectMetaRequest = request.selectMetaRequest;
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
         * body.
         */
        public Builder selectMetaRequest(SelectMetaRequest selectMetaRequest) {
            this.putBodyParameter("body", selectMetaRequest);
            this.selectMetaRequest = selectMetaRequest;
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
        public CreateSelectObjectMetaRequest build() {
            return new CreateSelectObjectMetaRequest(this);
        } 

    } 

}
