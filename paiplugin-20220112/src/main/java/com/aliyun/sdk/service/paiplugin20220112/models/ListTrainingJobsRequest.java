// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiplugin20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTrainingJobsRequest} extends {@link RequestModel}
 *
 * <p>ListTrainingJobsRequest</p>
 */
public class ListTrainingJobsRequest extends Request {
    @Query
    @NameInMap("CampaignId")
    private String campaignId;

    @Query
    @NameInMap("CampaignName")
    private String campaignName;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("Remark")
    private String remark;

    @Query
    @NameInMap("Status")
    private Integer status;

    @Query
    @NameInMap("TrainingScheduleId")
    private String trainingScheduleId;

    private ListTrainingJobsRequest(Builder builder) {
        super(builder);
        this.campaignId = builder.campaignId;
        this.campaignName = builder.campaignName;
        this.name = builder.name;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.remark = builder.remark;
        this.status = builder.status;
        this.trainingScheduleId = builder.trainingScheduleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTrainingJobsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return campaignId
     */
    public String getCampaignId() {
        return this.campaignId;
    }

    /**
     * @return campaignName
     */
    public String getCampaignName() {
        return this.campaignName;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
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
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * @return trainingScheduleId
     */
    public String getTrainingScheduleId() {
        return this.trainingScheduleId;
    }

    public static final class Builder extends Request.Builder<ListTrainingJobsRequest, Builder> {
        private String campaignId; 
        private String campaignName; 
        private String name; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String remark; 
        private Integer status; 
        private String trainingScheduleId; 

        private Builder() {
            super();
        } 

        private Builder(ListTrainingJobsRequest request) {
            super(request);
            this.campaignId = request.campaignId;
            this.campaignName = request.campaignName;
            this.name = request.name;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.remark = request.remark;
            this.status = request.status;
            this.trainingScheduleId = request.trainingScheduleId;
        } 

        /**
         * 归属运营活动过滤。
         */
        public Builder campaignId(String campaignId) {
            this.putQueryParameter("CampaignId", campaignId);
            this.campaignId = campaignId;
            return this;
        }

        /**
         * 关联运营活动名称
         */
        public Builder campaignName(String campaignName) {
            this.putQueryParameter("CampaignName", campaignName);
            this.campaignName = campaignName;
            return this;
        }

        /**
         * 训练任务名称过滤。
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * 分页数，从1开始，默认为1。
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * 分页大小，默认为10。
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * 训练任务备注过滤。
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * 训练任务状态过滤。
         * <p>
         * - 0: 队列中。
         * - 1: 已提交。
         * - 2: 运行中。
         * - 3: 成功。
         * - 4: 失败。
         */
        public Builder status(Integer status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * 归属训练计划过滤。
         */
        public Builder trainingScheduleId(String trainingScheduleId) {
            this.putQueryParameter("TrainingScheduleId", trainingScheduleId);
            this.trainingScheduleId = trainingScheduleId;
            return this;
        }

        @Override
        public ListTrainingJobsRequest build() {
            return new ListTrainingJobsRequest(this);
        } 

    } 

}
