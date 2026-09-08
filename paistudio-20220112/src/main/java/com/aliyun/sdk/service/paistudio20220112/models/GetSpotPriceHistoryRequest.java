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
         * <p>The instance type of the spot instance. Supports ECS and Lingjun instance types.</p>
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
         * <p>The end time for querying historical spot instance prices. Specify the time in ISO 8601 format using UTC+0, as yyyy-MM-ddTHH:mm:ssZ. Default value: empty. An empty value means the current time.</p>
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
         * <li><p>desc: descending order.</p>
         * </li>
         * <li><p>asc: ascending order.</p>
         * </li>
         * </ul>
         * <p>This parameter applies only when you query historical prices for Lingjun instance types.</p>
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
         * <p>The page number of the current page. Default value: <em><strong>1</strong></em>. This parameter applies only when you query historical prices for Lingjun instance types.</p>
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
         * <p>The number of entries per page. Default value: <strong>10</strong>. This parameter applies only when you query historical prices for Lingjun instance types.</p>
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
         * <p>The field to sort by. Default value: GmtCreatedTime. Valid values:</p>
         * <ul>
         * <li>GmtCreatedTime</li>
         * </ul>
         * <p>This parameter applies only when you query historical prices for Lingjun instance types.</p>
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
         * <p>The retention period for the spot instance, in hours. Note that only ECS instance types support this parameter. Default value: 0. Valid values:</p>
         * <ul>
         * <li><p>1: Alibaba Cloud guarantees that the instance runs for at least one hour after creation. After one hour, the system compares your bid price with the current market price and checks resource inventory to decide whether to retain or revoke the instance.</p>
         * </li>
         * <li><p>0: Alibaba Cloud does not guarantee one-hour runtime. The system compares your bid price with the current market price and checks resource inventory to decide whether to retain or revoke the instance.</p>
         * </li>
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
         * <p>The start time for querying historical spot instance prices. This time must be no more than seven days before the end time. Specify the time in ISO 8601 format using UTC+0, as yyyy-MM-ddTHH:mm:ssZ. Default value: empty. An empty value means three days before the end time.</p>
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
