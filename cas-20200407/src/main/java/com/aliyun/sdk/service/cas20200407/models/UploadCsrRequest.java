// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UploadCsrRequest} extends {@link RequestModel}
 *
 * <p>UploadCsrRequest</p>
 */
public class UploadCsrRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Csr")
    @com.aliyun.core.annotation.Validation(required = true)
    private String csr;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Key")
    private String key;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    private UploadCsrRequest(Builder builder) {
        super(builder);
        this.csr = builder.csr;
        this.key = builder.key;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UploadCsrRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return csr
     */
    public String getCsr() {
        return this.csr;
    }

    /**
     * @return key
     */
    public String getKey() {
        return this.key;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<UploadCsrRequest, Builder> {
        private String csr; 
        private String key; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(UploadCsrRequest request) {
            super(request);
            this.csr = request.csr;
            this.key = request.key;
            this.name = request.name;
        } 

        /**
         * Csr.
         */
        public Builder csr(String csr) {
            this.putQueryParameter("Csr", csr);
            this.csr = csr;
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

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        @Override
        public UploadCsrRequest build() {
            return new UploadCsrRequest(this);
        } 

    } 

}
