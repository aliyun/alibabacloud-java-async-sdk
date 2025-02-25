// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20170823.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeOssStockStatusRequest} extends {@link RequestModel}
 *
 * <p>DescribeOssStockStatusRequest</p>
 */
public class DescribeOssStockStatusRequest extends Request {
    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    @Query
    @NameInMap("StockTaskId")
    private Long stockTaskId;

    private DescribeOssStockStatusRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.sourceIp = builder.sourceIp;
        this.stockTaskId = builder.stockTaskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeOssStockStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * @return stockTaskId
     */
    public Long getStockTaskId() {
        return this.stockTaskId;
    }

    public static final class Builder extends Request.Builder<DescribeOssStockStatusRequest, Builder> {
        private String lang; 
        private String sourceIp; 
        private Long stockTaskId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeOssStockStatusRequest request) {
            super(request);
            this.lang = request.lang;
            this.sourceIp = request.sourceIp;
            this.stockTaskId = request.stockTaskId;
        } 

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
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
         * StockTaskId.
         */
        public Builder stockTaskId(Long stockTaskId) {
            this.putQueryParameter("StockTaskId", stockTaskId);
            this.stockTaskId = stockTaskId;
            return this;
        }

        @Override
        public DescribeOssStockStatusRequest build() {
            return new DescribeOssStockStatusRequest(this);
        } 

    } 

}
