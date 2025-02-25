// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

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
 * {@link GetQualityResultRequest} extends {@link RequestModel}
 *
 * <p>GetQualityResultRequest</p>
 */
public class GetQualityResultRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChannelType")
    private String channelType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupIds")
    private java.util.List<Long> groupIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HitStatus")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer hitStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNo")
    @com.aliyun.core.annotation.Validation(maximum = 1000, minimum = 1)
    private Integer pageNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 1000, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectIds")
    private java.util.List<Long> projectIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QualityRuleIds")
    private java.util.List<Long> qualityRuleIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TouchEndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String touchEndTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TouchStartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String touchStartTime;

    private GetQualityResultRequest(Builder builder) {
        super(builder);
        this.channelType = builder.channelType;
        this.groupIds = builder.groupIds;
        this.hitStatus = builder.hitStatus;
        this.instanceId = builder.instanceId;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.projectIds = builder.projectIds;
        this.qualityRuleIds = builder.qualityRuleIds;
        this.touchEndTime = builder.touchEndTime;
        this.touchStartTime = builder.touchStartTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetQualityResultRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return channelType
     */
    public String getChannelType() {
        return this.channelType;
    }

    /**
     * @return groupIds
     */
    public java.util.List<Long> getGroupIds() {
        return this.groupIds;
    }

    /**
     * @return hitStatus
     */
    public Integer getHitStatus() {
        return this.hitStatus;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
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
     * @return projectIds
     */
    public java.util.List<Long> getProjectIds() {
        return this.projectIds;
    }

    /**
     * @return qualityRuleIds
     */
    public java.util.List<Long> getQualityRuleIds() {
        return this.qualityRuleIds;
    }

    /**
     * @return touchEndTime
     */
    public String getTouchEndTime() {
        return this.touchEndTime;
    }

    /**
     * @return touchStartTime
     */
    public String getTouchStartTime() {
        return this.touchStartTime;
    }

    public static final class Builder extends Request.Builder<GetQualityResultRequest, Builder> {
        private String channelType; 
        private java.util.List<Long> groupIds; 
        private Integer hitStatus; 
        private String instanceId; 
        private Integer pageNo; 
        private Integer pageSize; 
        private java.util.List<Long> projectIds; 
        private java.util.List<Long> qualityRuleIds; 
        private String touchEndTime; 
        private String touchStartTime; 

        private Builder() {
            super();
        } 

        private Builder(GetQualityResultRequest request) {
            super(request);
            this.channelType = request.channelType;
            this.groupIds = request.groupIds;
            this.hitStatus = request.hitStatus;
            this.instanceId = request.instanceId;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.projectIds = request.projectIds;
            this.qualityRuleIds = request.qualityRuleIds;
            this.touchEndTime = request.touchEndTime;
            this.touchStartTime = request.touchStartTime;
        } 

        /**
         * ChannelType.
         */
        public Builder channelType(String channelType) {
            this.putQueryParameter("ChannelType", channelType);
            this.channelType = channelType;
            return this;
        }

        /**
         * GroupIds.
         */
        public Builder groupIds(java.util.List<Long> groupIds) {
            this.putQueryParameter("GroupIds", groupIds);
            this.groupIds = groupIds;
            return this;
        }

        /**
         * HitStatus.
         */
        public Builder hitStatus(Integer hitStatus) {
            this.putQueryParameter("HitStatus", hitStatus);
            this.hitStatus = hitStatus;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * PageNo.
         */
        public Builder pageNo(Integer pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * ProjectIds.
         */
        public Builder projectIds(java.util.List<Long> projectIds) {
            this.putQueryParameter("ProjectIds", projectIds);
            this.projectIds = projectIds;
            return this;
        }

        /**
         * QualityRuleIds.
         */
        public Builder qualityRuleIds(java.util.List<Long> qualityRuleIds) {
            this.putQueryParameter("QualityRuleIds", qualityRuleIds);
            this.qualityRuleIds = qualityRuleIds;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder touchEndTime(String touchEndTime) {
            this.putQueryParameter("TouchEndTime", touchEndTime);
            this.touchEndTime = touchEndTime;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder touchStartTime(String touchStartTime) {
            this.putQueryParameter("TouchStartTime", touchStartTime);
            this.touchStartTime = touchStartTime;
            return this;
        }

        @Override
        public GetQualityResultRequest build() {
            return new GetQualityResultRequest(this);
        } 

    } 

}
