// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cd2021127.models;

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
 * {@link ListMenuDataRequest} extends {@link RequestModel}
 *
 * <p>ListMenuDataRequest</p>
 */
public class ListMenuDataRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BatchId")
    private String batchId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Country")
    private String country;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CreateRequestId")
    private String createRequestId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageNumber;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProductContainerId")
    private String productContainerId;

    private ListMenuDataRequest(Builder builder) {
        super(builder);
        this.batchId = builder.batchId;
        this.country = builder.country;
        this.createRequestId = builder.createRequestId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.productContainerId = builder.productContainerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMenuDataRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return batchId
     */
    public String getBatchId() {
        return this.batchId;
    }

    /**
     * @return country
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * @return createRequestId
     */
    public String getCreateRequestId() {
        return this.createRequestId;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return productContainerId
     */
    public String getProductContainerId() {
        return this.productContainerId;
    }

    public static final class Builder extends Request.Builder<ListMenuDataRequest, Builder> {
        private String batchId; 
        private String country; 
        private String createRequestId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String productContainerId; 

        private Builder() {
            super();
        } 

        private Builder(ListMenuDataRequest request) {
            super(request);
            this.batchId = request.batchId;
            this.country = request.country;
            this.createRequestId = request.createRequestId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.productContainerId = request.productContainerId;
        } 

        /**
         * BatchId.
         */
        public Builder batchId(String batchId) {
            this.putBodyParameter("BatchId", batchId);
            this.batchId = batchId;
            return this;
        }

        /**
         * Country.
         */
        public Builder country(String country) {
            this.putBodyParameter("Country", country);
            this.country = country;
            return this;
        }

        /**
         * CreateRequestId.
         */
        public Builder createRequestId(String createRequestId) {
            this.putBodyParameter("CreateRequestId", createRequestId);
            this.createRequestId = createRequestId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * ProductContainerId.
         */
        public Builder productContainerId(String productContainerId) {
            this.putBodyParameter("ProductContainerId", productContainerId);
            this.productContainerId = productContainerId;
            return this;
        }

        @Override
        public ListMenuDataRequest build() {
            return new ListMenuDataRequest(this);
        } 

    } 

}
