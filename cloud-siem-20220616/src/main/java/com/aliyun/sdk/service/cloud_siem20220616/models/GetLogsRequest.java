// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetLogsRequest} extends {@link RequestModel}
 *
 * <p>GetLogsRequest</p>
 */
public class GetLogsRequest extends Request {
    @Body
    @NameInMap("From")
    @Validation(required = true)
    private Integer from;

    @Body
    @NameInMap("PageIndex")
    @Validation(required = true)
    private Integer pageIndex;

    @Body
    @NameInMap("PageSize")
    @Validation(required = true)
    private Integer pageSize;

    @Body
    @NameInMap("Query")
    private String query;

    @Body
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("ReverseOrNot")
    private Boolean reverseOrNot;

    @Body
    @NameInMap("To")
    @Validation(required = true)
    private Integer to;

    @Body
    @NameInMap("Total")
    private Long total;

    private GetLogsRequest(Builder builder) {
        super(builder);
        this.from = builder.from;
        this.pageIndex = builder.pageIndex;
        this.pageSize = builder.pageSize;
        this.query = builder.query;
        this.regionId = builder.regionId;
        this.reverseOrNot = builder.reverseOrNot;
        this.to = builder.to;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLogsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return from
     */
    public Integer getFrom() {
        return this.from;
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
     * @return query
     */
    public String getQuery() {
        return this.query;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return reverseOrNot
     */
    public Boolean getReverseOrNot() {
        return this.reverseOrNot;
    }

    /**
     * @return to
     */
    public Integer getTo() {
        return this.to;
    }

    /**
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    public static final class Builder extends Request.Builder<GetLogsRequest, Builder> {
        private Integer from; 
        private Integer pageIndex; 
        private Integer pageSize; 
        private String query; 
        private String regionId; 
        private Boolean reverseOrNot; 
        private Integer to; 
        private Long total; 

        private Builder() {
            super();
        } 

        private Builder(GetLogsRequest request) {
            super(request);
            this.from = request.from;
            this.pageIndex = request.pageIndex;
            this.pageSize = request.pageSize;
            this.query = request.query;
            this.regionId = request.regionId;
            this.reverseOrNot = request.reverseOrNot;
            this.to = request.to;
            this.total = request.total;
        } 

        /**
         * From.
         */
        public Builder from(Integer from) {
            this.putBodyParameter("From", from);
            this.from = from;
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
         * Query.
         */
        public Builder query(String query) {
            this.putBodyParameter("Query", query);
            this.query = query;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ReverseOrNot.
         */
        public Builder reverseOrNot(Boolean reverseOrNot) {
            this.putBodyParameter("ReverseOrNot", reverseOrNot);
            this.reverseOrNot = reverseOrNot;
            return this;
        }

        /**
         * To.
         */
        public Builder to(Integer to) {
            this.putBodyParameter("To", to);
            this.to = to;
            return this;
        }

        /**
         * Total.
         */
        public Builder total(Long total) {
            this.putBodyParameter("Total", total);
            this.total = total;
            return this;
        }

        @Override
        public GetLogsRequest build() {
            return new GetLogsRequest(this);
        } 

    } 

}
