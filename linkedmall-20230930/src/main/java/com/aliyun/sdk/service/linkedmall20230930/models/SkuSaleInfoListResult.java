// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20230930.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SkuSaleInfoListResult} extends {@link TeaModel}
 *
 * <p>SkuSaleInfoListResult</p>
 */
public class SkuSaleInfoListResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("skuSaleInfos")
    private java.util.List<SkuSaleInfo> skuSaleInfos;

    private SkuSaleInfoListResult(Builder builder) {
        this.requestId = builder.requestId;
        this.skuSaleInfos = builder.skuSaleInfos;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SkuSaleInfoListResult create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return skuSaleInfos
     */
    public java.util.List<SkuSaleInfo> getSkuSaleInfos() {
        return this.skuSaleInfos;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<SkuSaleInfo> skuSaleInfos; 

        private Builder() {
        } 

        private Builder(SkuSaleInfoListResult model) {
            this.requestId = model.requestId;
            this.skuSaleInfos = model.skuSaleInfos;
        } 

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * skuSaleInfos.
         */
        public Builder skuSaleInfos(java.util.List<SkuSaleInfo> skuSaleInfos) {
            this.skuSaleInfos = skuSaleInfos;
            return this;
        }

        public SkuSaleInfoListResult build() {
            return new SkuSaleInfoListResult(this);
        } 

    } 

}
