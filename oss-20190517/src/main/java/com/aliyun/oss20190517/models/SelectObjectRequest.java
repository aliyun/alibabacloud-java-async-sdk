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
    @Path
    @NameInMap("key")
    private String key;

    @Body
    @NameInMap("SelectRequest")
    private SelectRequest selectRequest;

    @Host
    @NameInMap("bucket")
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

    public static final class Builder extends Request.Builder<Builder> {
        private String key; 
        private SelectRequest selectRequest; 
        private String bucket; 

        /**
         * <p>key.</p>
         */
        public Builder key(String key) {
            this.putPathParameter("key", key);
            this.key = key;
            return this;
        }

        /**
         * <p>SelectRequest.</p>
         */
        public Builder selectRequest(SelectRequest selectRequest) {
            this.putBodyParameter("SelectRequest", selectRequest);
            this.selectRequest = selectRequest;
            return this;
        }

        /**
         * <p>bucket.</p>
         */
        public Builder bucket(String bucket) {
            this.putHostParameter("bucket", bucket);
            this.bucket = bucket;
            return this;
        }

        public SelectObjectRequest build() {
            return new SelectObjectRequest(this);
        } 

    } 

}
