// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CountLatestReportsRequest} extends {@link RequestModel}
 *
 * <p>CountLatestReportsRequest</p>
 */
public class CountLatestReportsRequest extends Request {
    @Query
    @NameInMap("LogStore")
    private String logStore;

    @Query
    @NameInMap("ProductCode")
    private String productCode;

    @Query
    @NameInMap("Uid")
    private Long uid;

    private CountLatestReportsRequest(Builder builder) {
        super(builder);
        this.logStore = builder.logStore;
        this.productCode = builder.productCode;
        this.uid = builder.uid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CountLatestReportsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return logStore
     */
    public String getLogStore() {
        return this.logStore;
    }

    /**
     * @return productCode
     */
    public String getProductCode() {
        return this.productCode;
    }

    /**
     * @return uid
     */
    public Long getUid() {
        return this.uid;
    }

    public static final class Builder extends Request.Builder<CountLatestReportsRequest, Builder> {
        private String logStore; 
        private String productCode; 
        private Long uid; 

        private Builder() {
            super();
        } 

        private Builder(CountLatestReportsRequest request) {
            super(request);
            this.logStore = request.logStore;
            this.productCode = request.productCode;
            this.uid = request.uid;
        } 

        /**
         * LogStore.
         */
        public Builder logStore(String logStore) {
            this.putQueryParameter("LogStore", logStore);
            this.logStore = logStore;
            return this;
        }

        /**
         * ProductCode.
         */
        public Builder productCode(String productCode) {
            this.putQueryParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        /**
         * Uid.
         */
        public Builder uid(Long uid) {
            this.putQueryParameter("Uid", uid);
            this.uid = uid;
            return this;
        }

        @Override
        public CountLatestReportsRequest build() {
            return new CountLatestReportsRequest(this);
        } 

    } 

}
