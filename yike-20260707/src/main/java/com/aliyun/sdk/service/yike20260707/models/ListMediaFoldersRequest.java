// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yike20260707.models;

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
 * {@link ListMediaFoldersRequest} extends {@link RequestModel}
 *
 * <p>ListMediaFoldersRequest</p>
 */
public class ListMediaFoldersRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Integer pageNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductionId")
    private String productionId;

    private ListMediaFoldersRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.productionId = builder.productionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMediaFoldersRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return productionId
     */
    public String getProductionId() {
        return this.productionId;
    }

    public static final class Builder extends Request.Builder<ListMediaFoldersRequest, Builder> {
        private String regionId; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String productionId; 

        private Builder() {
            super();
        } 

        private Builder(ListMediaFoldersRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.productionId = request.productionId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The page number. Pages start from 1. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNo(Integer pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * <p>The number of entries per page. Default value: 20. Maximum value: 50. If the value exceeds 50, it is truncated to 50.</p>
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
         * <p>The project ID. If this parameter is not specified, the default project of the current account is used. The value format is <code>pd_{uid}</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>pd_1585***</p>
         */
        public Builder productionId(String productionId) {
            this.putQueryParameter("ProductionId", productionId);
            this.productionId = productionId;
            return this;
        }

        @Override
        public ListMediaFoldersRequest build() {
            return new ListMediaFoldersRequest(this);
        } 

    } 

}
