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
 * {@link CreateQualityProjectRequest} extends {@link RequestModel}
 *
 * <p>CreateQualityProjectRequest</p>
 */
public class CreateQualityProjectRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AnalysisIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Long> analysisIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ChannelTouchType")
    private java.util.List<Integer> channelTouchType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CheckFreqType")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 100, minimum = 1)
    private Integer checkFreqType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DepList")
    private java.util.List<Long> depList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("GroupList")
    private java.util.List<Long> groupList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ScopeType")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 100, minimum = 1)
    private Integer scopeType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ServicerList")
    private java.util.List<String> servicerList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TimeRangeEnd")
    private String timeRangeEnd;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TimeRangeStart")
    private String timeRangeStart;

    private CreateQualityProjectRequest(Builder builder) {
        super(builder);
        this.analysisIds = builder.analysisIds;
        this.channelTouchType = builder.channelTouchType;
        this.checkFreqType = builder.checkFreqType;
        this.depList = builder.depList;
        this.groupList = builder.groupList;
        this.instanceId = builder.instanceId;
        this.projectName = builder.projectName;
        this.scopeType = builder.scopeType;
        this.servicerList = builder.servicerList;
        this.timeRangeEnd = builder.timeRangeEnd;
        this.timeRangeStart = builder.timeRangeStart;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateQualityProjectRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return analysisIds
     */
    public java.util.List<Long> getAnalysisIds() {
        return this.analysisIds;
    }

    /**
     * @return channelTouchType
     */
    public java.util.List<Integer> getChannelTouchType() {
        return this.channelTouchType;
    }

    /**
     * @return checkFreqType
     */
    public Integer getCheckFreqType() {
        return this.checkFreqType;
    }

    /**
     * @return depList
     */
    public java.util.List<Long> getDepList() {
        return this.depList;
    }

    /**
     * @return groupList
     */
    public java.util.List<Long> getGroupList() {
        return this.groupList;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
    }

    /**
     * @return scopeType
     */
    public Integer getScopeType() {
        return this.scopeType;
    }

    /**
     * @return servicerList
     */
    public java.util.List<String> getServicerList() {
        return this.servicerList;
    }

    /**
     * @return timeRangeEnd
     */
    public String getTimeRangeEnd() {
        return this.timeRangeEnd;
    }

    /**
     * @return timeRangeStart
     */
    public String getTimeRangeStart() {
        return this.timeRangeStart;
    }

    public static final class Builder extends Request.Builder<CreateQualityProjectRequest, Builder> {
        private java.util.List<Long> analysisIds; 
        private java.util.List<Integer> channelTouchType; 
        private Integer checkFreqType; 
        private java.util.List<Long> depList; 
        private java.util.List<Long> groupList; 
        private String instanceId; 
        private String projectName; 
        private Integer scopeType; 
        private java.util.List<String> servicerList; 
        private String timeRangeEnd; 
        private String timeRangeStart; 

        private Builder() {
            super();
        } 

        private Builder(CreateQualityProjectRequest request) {
            super(request);
            this.analysisIds = request.analysisIds;
            this.channelTouchType = request.channelTouchType;
            this.checkFreqType = request.checkFreqType;
            this.depList = request.depList;
            this.groupList = request.groupList;
            this.instanceId = request.instanceId;
            this.projectName = request.projectName;
            this.scopeType = request.scopeType;
            this.servicerList = request.servicerList;
            this.timeRangeEnd = request.timeRangeEnd;
            this.timeRangeStart = request.timeRangeStart;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder analysisIds(java.util.List<Long> analysisIds) {
            this.putBodyParameter("AnalysisIds", analysisIds);
            this.analysisIds = analysisIds;
            return this;
        }

        /**
         * ChannelTouchType.
         */
        public Builder channelTouchType(java.util.List<Integer> channelTouchType) {
            this.putBodyParameter("ChannelTouchType", channelTouchType);
            this.channelTouchType = channelTouchType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder checkFreqType(Integer checkFreqType) {
            this.putBodyParameter("CheckFreqType", checkFreqType);
            this.checkFreqType = checkFreqType;
            return this;
        }

        /**
         * DepList.
         */
        public Builder depList(java.util.List<Long> depList) {
            this.putBodyParameter("DepList", depList);
            this.depList = depList;
            return this;
        }

        /**
         * GroupList.
         */
        public Builder groupList(java.util.List<Long> groupList) {
            this.putBodyParameter("GroupList", groupList);
            this.groupList = groupList;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder projectName(String projectName) {
            this.putBodyParameter("ProjectName", projectName);
            this.projectName = projectName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder scopeType(Integer scopeType) {
            this.putBodyParameter("ScopeType", scopeType);
            this.scopeType = scopeType;
            return this;
        }

        /**
         * ServicerList.
         */
        public Builder servicerList(java.util.List<String> servicerList) {
            this.putBodyParameter("ServicerList", servicerList);
            this.servicerList = servicerList;
            return this;
        }

        /**
         * TimeRangeEnd.
         */
        public Builder timeRangeEnd(String timeRangeEnd) {
            this.putBodyParameter("TimeRangeEnd", timeRangeEnd);
            this.timeRangeEnd = timeRangeEnd;
            return this;
        }

        /**
         * TimeRangeStart.
         */
        public Builder timeRangeStart(String timeRangeStart) {
            this.putBodyParameter("TimeRangeStart", timeRangeStart);
            this.timeRangeStart = timeRangeStart;
            return this;
        }

        @Override
        public CreateQualityProjectRequest build() {
            return new CreateQualityProjectRequest(this);
        } 

    } 

}
