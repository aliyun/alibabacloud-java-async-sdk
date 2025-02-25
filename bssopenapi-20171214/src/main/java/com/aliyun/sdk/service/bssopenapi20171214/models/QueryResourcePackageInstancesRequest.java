// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

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
 * {@link QueryResourcePackageInstancesRequest} extends {@link RequestModel}
 *
 * <p>QueryResourcePackageInstancesRequest</p>
 */
public class QueryResourcePackageInstancesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExpiryTimeEnd")
    private String expiryTimeEnd;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExpiryTimeStart")
    private String expiryTimeStart;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IncludePartner")
    private Boolean includePartner;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNum")
    private Integer pageNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductCode")
    private String productCode;

    private QueryResourcePackageInstancesRequest(Builder builder) {
        super(builder);
        this.expiryTimeEnd = builder.expiryTimeEnd;
        this.expiryTimeStart = builder.expiryTimeStart;
        this.includePartner = builder.includePartner;
        this.ownerId = builder.ownerId;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.productCode = builder.productCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryResourcePackageInstancesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return expiryTimeEnd
     */
    public String getExpiryTimeEnd() {
        return this.expiryTimeEnd;
    }

    /**
     * @return expiryTimeStart
     */
    public String getExpiryTimeStart() {
        return this.expiryTimeStart;
    }

    /**
     * @return includePartner
     */
    public Boolean getIncludePartner() {
        return this.includePartner;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return pageNum
     */
    public Integer getPageNum() {
        return this.pageNum;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return productCode
     */
    public String getProductCode() {
        return this.productCode;
    }

    public static final class Builder extends Request.Builder<QueryResourcePackageInstancesRequest, Builder> {
        private String expiryTimeEnd; 
        private String expiryTimeStart; 
        private Boolean includePartner; 
        private Long ownerId; 
        private Integer pageNum; 
        private Integer pageSize; 
        private String productCode; 

        private Builder() {
            super();
        } 

        private Builder(QueryResourcePackageInstancesRequest request) {
            super(request);
            this.expiryTimeEnd = request.expiryTimeEnd;
            this.expiryTimeStart = request.expiryTimeStart;
            this.includePartner = request.includePartner;
            this.ownerId = request.ownerId;
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
            this.productCode = request.productCode;
        } 

        /**
         * <p>The end of the expiration time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-02-02T13:00:00Z</p>
         */
        public Builder expiryTimeEnd(String expiryTimeEnd) {
            this.putQueryParameter("ExpiryTimeEnd", expiryTimeEnd);
            this.expiryTimeEnd = expiryTimeEnd;
            return this;
        }

        /**
         * <p>The beginning of the expiration time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-02-02T12:00:00Z</p>
         */
        public Builder expiryTimeStart(String expiryTimeStart) {
            this.putQueryParameter("ExpiryTimeStart", expiryTimeStart);
            this.expiryTimeStart = expiryTimeStart;
            return this;
        }

        /**
         * <p>Specifies whether partners are involved.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder includePartner(Boolean includePartner) {
            this.putQueryParameter("IncludePartner", includePartner);
            this.includePartner = includePartner;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>The number of the page to return. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNum(Integer pageNum) {
            this.putQueryParameter("PageNum", pageNum);
            this.pageNum = pageNum;
            return this;
        }

        /**
         * <p>The number of entries to return on each page. Default value: 20. Maximum value: 300.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The code of the service.</p>
         * 
         * <strong>example:</strong>
         * <p>rds</p>
         */
        public Builder productCode(String productCode) {
            this.putQueryParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        @Override
        public QueryResourcePackageInstancesRequest build() {
            return new QueryResourcePackageInstancesRequest(this);
        } 

    } 

}
