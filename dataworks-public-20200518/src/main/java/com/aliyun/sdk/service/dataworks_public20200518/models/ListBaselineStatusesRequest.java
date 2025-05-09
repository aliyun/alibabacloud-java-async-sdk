// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

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
 * {@link ListBaselineStatusesRequest} extends {@link RequestModel}
 *
 * <p>ListBaselineStatusesRequest</p>
 */
public class ListBaselineStatusesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BaselineTypes")
    private String baselineTypes;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Bizdate")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bizdate;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FinishStatus")
    private String finishStatus;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Owner")
    private String owner;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageNumber;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Priority")
    private String priority;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SearchText")
    private String searchText;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TopicId")
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
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The type of the baseline. Valid values: DAILY and HOURLY. The value DAILY indicates that the baseline is scheduled by day. The value HOURLY indicates that the baseline is scheduled by hour. Multiple types are separated by commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>DAILY,HOURLY</p>
         */
        public Builder baselineTypes(String baselineTypes) {
            this.putBodyParameter("BaselineTypes", baselineTypes);
            this.baselineTypes = baselineTypes;
            return this;
        }

        /**
         * <p>The data timestamp of the baseline instance. Specify the time in the ISO 8601 standard in the yyyy-MM-dd&quot;T&quot;HH:mm:ssZ format. The time must be in UTC.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-07-07T00:00:00+0800</p>
         */
        public Builder bizdate(String bizdate) {
            this.putBodyParameter("Bizdate", bizdate);
            this.bizdate = bizdate;
            return this;
        }

        /**
         * <p>The status of the baseline instance. Valid values: UNFINISH and FINISH. The value UNFINISH indicates that the baseline instance is still running. The value FINISH indicates that the baseline instance finishes running. Multiple states are separated by commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>FINISH,UNFINISH</p>
         */
        public Builder finishStatus(String finishStatus) {
            this.putBodyParameter("FinishStatus", finishStatus);
            this.finishStatus = finishStatus;
            return this;
        }

        /**
         * <p>The ID of the Alibaba Cloud account used by the baseline owner.</p>
         * 
         * <strong>example:</strong>
         * <p>9527952795****</p>
         */
        public Builder owner(String owner) {
            this.putBodyParameter("Owner", owner);
            this.owner = owner;
            return this;
        }

        /**
         * <p>The number of the page to return. Valid values: 1 to 30. Default value: 1.</p>
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
         * <p>The number of entries to return on each page. Default value: 10. Maximum value: 100.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The priority of the baseline. Valid values: 1, 3, 5, 7, and 8. Multiple priorities are separated by commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>1,3,5,7,8</p>
         */
        public Builder priority(String priority) {
            this.putBodyParameter("Priority", priority);
            this.priority = priority;
            return this;
        }

        /**
         * <p>The keyword of the baseline name used to search for the baseline.</p>
         * 
         * <strong>example:</strong>
         * <p>Keyword of the baseline name</p>
         */
        public Builder searchText(String searchText) {
            this.putBodyParameter("SearchText", searchText);
            this.searchText = searchText;
            return this;
        }

        /**
         * <p>The status of the baseline. Valid values: ERROR, SAFE, DANGEROUS, and OVER. The value ERROR indicates that no nodes are associated with the baseline, or all nodes associated with the baseline are suspended. The value SAFE indicates that nodes finish running before the alerting time. The value DANGEROUS indicates that nodes are still running after the alerting time but before the committed completion time. The value OVER indicates that nodes are still running after the committed completion time. Multiple states are separated by commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>SAFE,DANGROUS,OVER</p>
         */
        public Builder status(String status) {
            this.putBodyParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The ID of the event.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
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
