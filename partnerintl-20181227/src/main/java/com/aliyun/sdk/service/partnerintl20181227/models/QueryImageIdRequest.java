// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.partnerintl20181227.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryImageIdRequest} extends {@link RequestModel}
 *
 * <p>QueryImageIdRequest</p>
 */
public class QueryImageIdRequest extends Request {
    @Body
    @NameInMap("CommodityCode")
    private String commodityCode;

    @Body
    @NameInMap("ImageVersion")
    private String imageVersion;

    @Body
    @NameInMap("PageIndex")
    private Integer pageIndex;

    @Body
    @NameInMap("PageSize")
    private Integer pageSize;

    @Body
    @NameInMap("RegionNo")
    private String regionNo;

    @Body
    @NameInMap("RequestId")
    private String requestId;

    private QueryImageIdRequest(Builder builder) {
        super(builder);
        this.commodityCode = builder.commodityCode;
        this.imageVersion = builder.imageVersion;
        this.pageIndex = builder.pageIndex;
        this.pageSize = builder.pageSize;
        this.regionNo = builder.regionNo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryImageIdRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return commodityCode
     */
    public String getCommodityCode() {
        return this.commodityCode;
    }

    /**
     * @return imageVersion
     */
    public String getImageVersion() {
        return this.imageVersion;
    }

    /**
     * @return pageIndex
     */
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return regionNo
     */
    public String getRegionNo() {
        return this.regionNo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder extends Request.Builder<QueryImageIdRequest, Builder> {
        private String commodityCode; 
        private String imageVersion; 
        private Integer pageIndex; 
        private Integer pageSize; 
        private String regionNo; 
        private String requestId; 

        private Builder() {
            super();
        } 

        private Builder(QueryImageIdRequest request) {
            super(request);
            this.commodityCode = request.commodityCode;
            this.imageVersion = request.imageVersion;
            this.pageIndex = request.pageIndex;
            this.pageSize = request.pageSize;
            this.regionNo = request.regionNo;
            this.requestId = request.requestId;
        } 

        /**
         * CommodityCode.
         */
        public Builder commodityCode(String commodityCode) {
            this.putBodyParameter("CommodityCode", commodityCode);
            this.commodityCode = commodityCode;
            return this;
        }

        /**
         * ImageVersion.
         */
        public Builder imageVersion(String imageVersion) {
            this.putBodyParameter("ImageVersion", imageVersion);
            this.imageVersion = imageVersion;
            return this;
        }

        /**
         * PageIndex.
         */
        public Builder pageIndex(Integer pageIndex) {
            this.putBodyParameter("PageIndex", pageIndex);
            this.pageIndex = pageIndex;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RegionNo.
         */
        public Builder regionNo(String regionNo) {
            this.putBodyParameter("RegionNo", regionNo);
            this.regionNo = regionNo;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.putBodyParameter("RequestId", requestId);
            this.requestId = requestId;
            return this;
        }

        @Override
        public QueryImageIdRequest build() {
            return new QueryImageIdRequest(this);
        } 

    } 

}
