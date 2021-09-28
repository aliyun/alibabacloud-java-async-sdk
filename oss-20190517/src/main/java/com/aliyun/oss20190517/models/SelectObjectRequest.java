// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link SelectObjectRequest} extends {@link RequestModel}
 *
 * <p>SelectObjectRequest</p>
 */
public class SelectObjectRequest extends Request {
    @Host
    @NameInMap("bucket")
    private String bucket;

    @Path
    @NameInMap("key")
    private String key;

    @Body
    @NameInMap("selectRequest")
    private SelectRequest selectRequest;


    private SelectObjectRequest(Builder builder) {
        super(builder);
        this.bucket = builder.bucket;
        this.key = builder.key;
        this.selectRequest = builder.selectRequest;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SelectObjectRequest create() {
        return builder().build();
    }

    /**
     * @return bucket
     */
    public String bucket() {
        return this.bucket;
    }

    /**
     * @return key
     */
    public String key() {
        return this.key;
    }

    /**
     * @return selectRequest
     */
    public SelectRequest selectRequest() {
        return this.selectRequest;
    }

    public static final class Builder extends Request.Builder<SelectObjectRequest.Builder> {
        private String bucket; 
        private String key; 
        private SelectRequest selectRequest; 

        /**
         * <p>bucket.</p>
         */
        public Builder bucket(String bucket) {
            this.putHostParameter("bucket", bucket);
            this.bucket = bucket;
            return this;
        }

        /**
         * <p>key.</p>
         */
        public Builder key(String key) {
            this.putPathParameter("key", key);
            this.key = key;
            return this;
        }

        /**
         * <p>selectRequest.</p>
         */
        public Builder selectRequest(SelectRequest selectRequest) {
            this.putBodyParameter("selectRequest", selectRequest);
            this.selectRequest = selectRequest;
            return this;
        }

        public SelectObjectRequest build() {
            return new SelectObjectRequest(this);
        } 

    } 

}
