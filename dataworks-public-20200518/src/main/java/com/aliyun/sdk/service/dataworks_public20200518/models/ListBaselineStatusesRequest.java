// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListBaselineStatusesRequest} extends {@link RequestModel}
 *
 * <p>ListBaselineStatusesRequest</p>
 */
public class ListBaselineStatusesRequest extends Request {
    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Body
    @NameInMap("BaselineTypes")
    private String baselineTypes;

    @Body
    @NameInMap("Bizdate")
    @Validation(required = true)
    private String bizdate;

    @Body
    @NameInMap("FinishStatus")
    private String finishStatus;

    @Body
    @NameInMap("Owner")
    private String owner;

    @Body
    @NameInMap("PageNumber")
    @Validation(required = true)
    private Integer pageNumber;

    @Body
    @NameInMap("PageSize")
    @Validation(required = true)
    private Integer pageSize;

    @Body
    @NameInMap("Priority")
    private String priority;

    @Body
    @NameInMap("SearchText")
    private String searchText;

    @Body
    @NameInMap("Status")
    private String status;

    @Body
    @NameInMap("TopicId")
    private Long topicId;

    private ListBaselineStatusesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.baselineTypes = builder.baselineTypes;
        this.bizdate = builder.bizdate;
        this.finishStatus = builder.finishStatus;
        this.owner = builder.owner;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.priority = builder.priority;
        this.searchText = builder.searchText;
        this.status = builder.status;
        this.topicId = builder.topicId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListBaselineStatusesRequest create() {
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
     * @return baselineTypes
     */
    public String getBaselineTypes() {
        return this.baselineTypes;
    }

    /**
     * @return bizdate
     */
    public String getBizdate() {
        return this.bizdate;
    }

    /**
     * @return finishStatus
     */
    public String getFinishStatus() {
        return this.finishStatus;
    }

    /**
     * @return owner
     */
    public String getOwner() {
        return this.owner;
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
     * @return priority
     */
    public String getPriority() {
        return this.priority;
    }

    /**
     * @return searchText
     */
    public String getSearchText() {
        return this.searchText;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return topicId
     */
    public Long getTopicId() {
        return this.topicId;
    }

    public static final class Builder extends Request.Builder<ListBaselineStatusesRequest, Builder> {
        private String regionId; 
        private String baselineTypes; 
        private String bizdate; 
        private String finishStatus; 
        private String owner; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String priority; 
        private String searchText; 
        private String status; 
        private Long topicId; 

        private Builder() {
            super();
        } 

        private Builder(ListBaselineStatusesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.baselineTypes = request.baselineTypes;
            this.bizdate = request.bizdate;
            this.finishStatus = request.finishStatus;
            this.owner = request.owner;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.priority = request.priority;
            this.searchText = request.searchText;
            this.status = request.status;
            this.topicId = request.topicId;
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
         * The type of the baseline. Valid values: DAILY and HOURLY. The value DAILY indicates that the baseline is scheduled by day. The value HOURLY indicates that the baseline is scheduled by hour. Multiple types are separated by commas (,).
         */
        public Builder baselineTypes(String baselineTypes) {
            this.putBodyParameter("BaselineTypes", baselineTypes);
            this.baselineTypes = baselineTypes;
            return this;
        }

        /**
         * The data timestamp of the baseline instance. Specify the time in the ISO 8601 standard in the yyyy-MM-dd\"T\"HH:mm:ssZ format. The time must be in UTC.
         */
        public Builder bizdate(String bizdate) {
            this.putBodyParameter("Bizdate", bizdate);
            this.bizdate = bizdate;
            return this;
        }

        /**
         * The status of the baseline instance. Valid values: UNFINISH and FINISH. The value UNFINISH indicates that the baseline instance is still running. The value FINISH indicates that the baseline instance finishes running. Multiple states are separated by commas (,).
         */
        public Builder finishStatus(String finishStatus) {
            this.putBodyParameter("FinishStatus", finishStatus);
            this.finishStatus = finishStatus;
            return this;
        }

        /**
         * The ID of the Alibaba Cloud account used by the baseline owner.
         */
        public Builder owner(String owner) {
            this.putBodyParameter("Owner", owner);
            this.owner = owner;
            return this;
        }

        /**
         * The number of the page to return. Valid values: 1 to 30. Default value: 1.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries to return on each page. Default value: 10. Maximum value: 100.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The priority of the baseline. Valid values: 1, 3, 5, 7, and 8. Multiple priorities are separated by commas (,).
         */
        public Builder priority(String priority) {
            this.putBodyParameter("Priority", priority);
            this.priority = priority;
            return this;
        }

        /**
         * The keyword of the baseline name used to search for the baseline.
         */
        public Builder searchText(String searchText) {
            this.putBodyParameter("SearchText", searchText);
            this.searchText = searchText;
            return this;
        }

        /**
         * The status of the baseline. Valid values: ERROR, SAFE, DANGEROUS, and OVER. The value ERROR indicates that no nodes are associated with the baseline, or all nodes associated with the baseline are suspended. The value SAFE indicates that nodes finish running before the alerting time. The value DANGEROUS indicates that nodes are still running after the alerting time but before the committed completion time. The value OVER indicates that nodes are still running after the committed completion time. Multiple states are separated by commas (,).
         */
        public Builder status(String status) {
            this.putBodyParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * The ID of the event.
         */
        public Builder topicId(Long topicId) {
            this.putBodyParameter("TopicId", topicId);
            this.topicId = topicId;
            return this;
        }

        @Override
        public ListBaselineStatusesRequest build() {
            return new ListBaselineStatusesRequest(this);
        } 

    } 

}
