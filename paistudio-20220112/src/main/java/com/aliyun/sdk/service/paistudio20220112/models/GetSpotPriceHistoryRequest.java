// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

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
 * {@link GetSpotPriceHistoryRequest} extends {@link RequestModel}
 *
 * <p>GetSpotPriceHistoryRequest</p>
 */
public class GetSpotPriceHistoryRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("InstanceType")
    private String instanceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Order")
    private String order;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortBy")
    private String sortBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SpotDuration")
    private Integer spotDuration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    private GetSpotPriceHistoryRequest(Builder builder) {
        super(builder);
        this.instanceType = builder.instanceType;
        this.endTime = builder.endTime;
        this.order = builder.order;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.sortBy = builder.sortBy;
        this.spotDuration = builder.spotDuration;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSpotPriceHistoryRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return order
     */
    public String getOrder() {
        return this.order;
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
     * @return sortBy
     */
    public String getSortBy() {
        return this.sortBy;
    }

    /**
     * @return spotDuration
     */
    public Integer getSpotDuration() {
        return this.spotDuration;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<GetSpotPriceHistoryRequest, Builder> {
        private String instanceType; 
        private String endTime; 
        private String order; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String sortBy; 
        private Integer spotDuration; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(GetSpotPriceHistoryRequest request) {
            super(request);
            this.instanceType = request.instanceType;
            this.endTime = request.endTime;
            this.order = request.order;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.sortBy = request.sortBy;
            this.spotDuration = request.spotDuration;
            this.startTime = request.startTime;
        } 

        /**
         * <p>The instance type of the spot instance. ECS instance types and Lingjun instance types are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>ml.gu7xf.8xlarge-gu108</p>
         */
        public Builder instanceType(String instanceType) {
            this.putPathParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * <p>The end time for querying the historical prices of spot instances. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC. Default value: null, which indicates the current time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-12-30T09:36:46Z</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The sort order. Default value: asc. Valid values:</p>
         * <ul>
         * <li>desc: descending order.</li>
         * <li>asc: ascending order.</li>
         * </ul>
         * <p>This parameter takes effect only when you query the historical prices of Lingjun instance types.</p>
         * 
         * <strong>example:</strong>
         * <p>asc</p>
         */
        public Builder order(String order) {
            this.putQueryParameter("Order", order);
            this.order = order;
            return this;
        }

        /**
         * <p>The page number. Default value: <em><strong>1</strong></em>. This parameter takes effect only when you query the historical prices of Lingjun instance types.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Default value: <strong>10</strong>. This parameter takes effect only when you query the historical prices of Lingjun instance types.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The field used for sorting. Default value: GmtCreatedTime. Valid values:</p>
         * <ul>
         * <li>GmtCreatedTime</li>
         * </ul>
         * <p>This parameter takes effect only when you query the historical prices of Lingjun instance types.</p>
         * 
         * <strong>example:</strong>
         * <p>GmtCreatedTime</p>
         */
        public Builder sortBy(String sortBy) {
            this.putQueryParameter("SortBy", sortBy);
            this.sortBy = sortBy;
            return this;
        }

        /**
         * <p>The protection period of the spot instance. Unit: hours. Note that only ECS instance types support Settings for the protection period of spot instances. Default value: 0. Valid values:</p>
         * <ul>
         * <li>1: After the spot instance is created, Alibaba Cloud ensures that the instance runs for 1 hour without automatic release. After 1 hour, the system automatically compares the bid price with the marketplace price and checks resource inventory to determine whether to retain or revoke the instance.</li>
         * <li>0: After the spot instance is created, Alibaba Cloud does not guarantee that the instance runs for 1 hour. The system automatically compares the bid price with the marketplace price and checks resource inventory to determine whether to retain or revoke the instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder spotDuration(Integer spotDuration) {
            this.putQueryParameter("SpotDuration", spotDuration);
            this.spotDuration = spotDuration;
            return this;
        }

        /**
         * <p>The start time for querying the historical prices of spot instances. The maximum value cannot exceed 7 days before the specified end time. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC. Default value: null, which indicates 3 days before the end time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-12-26T09:36:46Z</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public GetSpotPriceHistoryRequest build() {
            return new GetSpotPriceHistoryRequest(this);
        } 

    } 

}
