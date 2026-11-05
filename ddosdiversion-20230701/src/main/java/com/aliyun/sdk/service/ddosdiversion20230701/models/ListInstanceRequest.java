// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosdiversion20230701.models;

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
         * <p>The name of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>Test instance.</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The number of entries per page. Default value: 100.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder num(Long num) {
            this.putQueryParameter("Num", num);
            this.num = num;
            return this;
        }

        /**
         * <p>The page number. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder page(Long page) {
            this.putQueryParameter("Page", page);
            this.page = page;
            return this;
        }

        /**
         * <p>The ID of the diversion instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ddos_diversion_public_cn-xxxxxxxxxxxxx</p>
         */
        public Builder saleId(String saleId) {
            this.putQueryParameter("SaleId", saleId);
            this.saleId = saleId;
            return this;
        }

        /**
         * <p>The instance status. Valid values:</p>
         * <ul>
         * <li>normal: The instance is running normally.</li>
         * <li>expired: The instance has expired.</li>
         * <li>deleting: The instance is being deleted.</li>
         * <li>stopped: The instance is stopped.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
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
