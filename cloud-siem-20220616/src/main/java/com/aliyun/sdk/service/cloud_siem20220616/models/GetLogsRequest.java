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
         * The time when the query starts. The value is a UNIX timestamp representing the number of seconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.
         */
        public Builder from(Integer from) {
            this.putBodyParameter("From", from);
            this.from = from;
            return this;
        }

        /**
         * The page number. Pages start from page 1.
         */
        public Builder pageIndex(Integer pageIndex) {
            this.putBodyParameter("PageIndex", pageIndex);
            this.pageIndex = pageIndex;
            return this;
        }

        /**
         * The number of entries per page. Valid values: 0 to 100.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The search statement or the analytic statement. For more information, see [Log search overview](https://help.aliyun.com/zh/sls/user-guide/log-analysis-overview?spm=a2c4g.11186623.0.i1#t13103.html) and [Log analysis overview](https://help.aliyun.com/zh/sls/user-guide/search-syntax?spm=a2c4g.11186623.0.i0#concept-tnd-1jq-zdb).
         */
        public Builder query(String query) {
            this.putBodyParameter("Query", query);
            this.query = query;
            return this;
        }

        /**
         * The region in which the data management center of the threat analysis feature resides. Specify this parameter based on the region where your assets reside. Valid values:
         * <p>
         * 
         * *   cn-hangzhou: Your assets reside in regions inside the Chinese mainland or in the China (Hong Kong) region.
         * *   ap-southeast-1: Your assets reside in regions outside the Chinese mainland, excluding the China (Hong Kong) region.
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Specifies whether to sort the results of the log query by time in minutes in descending order. Default value: true. Valid values:
         * <p>
         * 
         * *   true
         * *   false
         */
        public Builder reverseOrNot(Boolean reverseOrNot) {
            this.putBodyParameter("ReverseOrNot", reverseOrNot);
            this.reverseOrNot = reverseOrNot;
            return this;
        }

        /**
         * The time when the query ends. The value is a UNIX timestamp representing the number of seconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.
         */
        public Builder to(Integer to) {
            this.putBodyParameter("To", to);
            this.to = to;
            return this;
        }

        /**
         * The total number of entries returned.
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
