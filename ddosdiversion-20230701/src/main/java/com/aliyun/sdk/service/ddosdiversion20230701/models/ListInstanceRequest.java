// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosdiversion20230701.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListInstanceRequest} extends {@link RequestModel}
 *
 * <p>ListInstanceRequest</p>
 */
public class ListInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Num")
    private Long num;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Page")
    private Long page;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SaleId")
    private String saleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private ListInstanceRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
        this.num = builder.num;
        this.page = builder.page;
        this.saleId = builder.saleId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
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

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<ListInstanceRequest, Builder> {
        private String name; 
        private Long num; 
        private Long page; 
        private String saleId; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(ListInstanceRequest request) {
            super(request);
            this.name = request.name;
            this.num = request.num;
            this.page = request.page;
            this.saleId = request.saleId;
            this.status = request.status;
        } 

        /**
         * The name of the instance.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
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

        /**
         * The status of the instance. Valid values:
         * <p>
         * 
         * - normal
         * - expired
         * - deleting
         * - stopped
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public ListInstanceRequest build() {
            return new ListInstanceRequest(this);
        } 

    } 

}
