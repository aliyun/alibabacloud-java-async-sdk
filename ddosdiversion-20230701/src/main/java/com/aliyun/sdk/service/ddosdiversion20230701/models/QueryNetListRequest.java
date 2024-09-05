// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosdiversion20230701.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryNetListRequest} extends {@link RequestModel}
 *
 * <p>QueryNetListRequest</p>
 */
public class QueryNetListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MainNet")
    private String mainNet;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Mode")
    private String mode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Net")
    private String net;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Num")
    private Long num;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Page")
    private Long page;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SaleId")
    private String saleId;

    private QueryNetListRequest(Builder builder) {
        super(builder);
        this.mainNet = builder.mainNet;
        this.mode = builder.mode;
        this.net = builder.net;
        this.num = builder.num;
        this.page = builder.page;
        this.saleId = builder.saleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryNetListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return mainNet
     */
    public String getMainNet() {
        return this.mainNet;
    }

    /**
     * @return mode
     */
    public String getMode() {
        return this.mode;
    }

    /**
     * @return net
     */
    public String getNet() {
        return this.net;
    }

    /**
     * @return num
     */
    public Long getNum() {
        return this.num;
    }

    /**
     * @return page
     */
    public Long getPage() {
        return this.page;
    }

    /**
     * @return saleId
     */
    public String getSaleId() {
        return this.saleId;
    }

    public static final class Builder extends Request.Builder<QueryNetListRequest, Builder> {
        private String mainNet; 
        private String mode; 
        private String net; 
        private Long num; 
        private Long page; 
        private String saleId; 

        private Builder() {
            super();
        } 

        private Builder(QueryNetListRequest request) {
            super(request);
            this.mainNet = request.mainNet;
            this.mode = request.mode;
            this.net = request.net;
            this.num = request.num;
            this.page = request.page;
            this.saleId = request.saleId;
        } 

        /**
         * The primary CIDR block of the anti-DDoS diversion instance for which an extended CIDR block is configured. If no extended CIDR blocks are configured for the anti-DDoS diversion instance, leave this parameter empty.
         */
        public Builder mainNet(String mainNet) {
            this.putQueryParameter("MainNet", mainNet);
            this.mainNet = mainNet;
            return this;
        }

        /**
         * The scheduling mode. Valid values:
         * <p>
         * 
         * - manual: manual scheduling
         * - netflow-auto: automatic scheduling
         */
        public Builder mode(String mode) {
            this.putQueryParameter("Mode", mode);
            this.mode = mode;
            return this;
        }

        /**
         * The CIDR block of the anti-DDoS diversion instance.
         * <p>
         * 
         * 
         * > If no extended CIDR blocks are configured for the anti-DDoS diversion instance, this parameter specifies the CIDR block of the instance. If an extended CIDR block is configured for the anti-DDoS diversion instance, this parameter specifies the extended CIDR block that is configured for the instance. If this parameter is specified, the MainNet parameter is required.
         */
        public Builder net(String net) {
            this.putQueryParameter("Net", net);
            this.net = net;
            return this;
        }

        /**
         * The number of entries per page. Default value: 100.
         */
        public Builder num(Long num) {
            this.putQueryParameter("Num", num);
            this.num = num;
            return this;
        }

        /**
         * The page number. Default value: 1
         */
        public Builder page(Long page) {
            this.putQueryParameter("Page", page);
            this.page = page;
            return this;
        }

        /**
         * The ID of the anti-DDoS diversion instance.
         */
        public Builder saleId(String saleId) {
            this.putQueryParameter("SaleId", saleId);
            this.saleId = saleId;
            return this;
        }

        @Override
        public QueryNetListRequest build() {
            return new QueryNetListRequest(this);
        } 

    } 

}
