// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateQualityProjectRequest} extends {@link RequestModel}
 *
 * <p>CreateQualityProjectRequest</p>
 */
public class CreateQualityProjectRequest extends Request {
    @Body
    @NameInMap("AnalysisIds")
    @Validation(required = true)
    private java.util.List < Long > analysisIds;

    @Body
    @NameInMap("ChannelTouchType")
    private java.util.List < Integer > channelTouchType;

    @Body
    @NameInMap("CheckFreqType")
    @Validation(required = true, maximum = 100, minimum = 1)
    private Integer checkFreqType;

    @Body
    @NameInMap("DepList")
    private java.util.List < Long > depList;

    @Body
    @NameInMap("GroupList")
    private java.util.List < Long > groupList;

    @Body
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Body
    @NameInMap("ProjectName")
    @Validation(required = true)
    private String projectName;

    @Body
    @NameInMap("ScopeType")
    @Validation(required = true, maximum = 100, minimum = 1)
    private Integer scopeType;

    @Body
    @NameInMap("ServicerList")
    private java.util.List < String > servicerList;

    @Body
    @NameInMap("TimeRangeEnd")
    private String timeRangeEnd;

    @Body
    @NameInMap("TimeRangeStart")
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
    public java.util.List < Long > getAnalysisIds() {
        return this.analysisIds;
    }

    /**
     * @return channelTouchType
     */
    public java.util.List < Integer > getChannelTouchType() {
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
    public java.util.List < Long > getDepList() {
        return this.depList;
    }

    /**
     * @return groupList
     */
    public java.util.List < Long > getGroupList() {
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
    public java.util.List < String > getServicerList() {
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
        private java.util.List < Long > analysisIds; 
        private java.util.List < Integer > channelTouchType; 
        private Integer checkFreqType; 
        private java.util.List < Long > depList; 
        private java.util.List < Long > groupList; 
        private String instanceId; 
        private String projectName; 
        private Integer scopeType; 
        private java.util.List < String > servicerList; 
        private String timeRangeEnd; 
        private String timeRangeStart; 

        private Builder() {
            super();
        } 

        private Builder(CreateQualityProjectRequest response) {
            super(response);
            this.analysisIds = response.analysisIds;
            this.channelTouchType = response.channelTouchType;
            this.checkFreqType = response.checkFreqType;
            this.depList = response.depList;
            this.groupList = response.groupList;
            this.instanceId = response.instanceId;
            this.projectName = response.projectName;
            this.scopeType = response.scopeType;
            this.servicerList = response.servicerList;
            this.timeRangeEnd = response.timeRangeEnd;
            this.timeRangeStart = response.timeRangeStart;
        } 

        /**
         * AnalysisIds.
         */
        public Builder analysisIds(java.util.List < Long > analysisIds) {
            this.putBodyParameter("AnalysisIds", analysisIds);
            this.analysisIds = analysisIds;
            return this;
        }

        /**
         * ChannelTouchType.
         */
        public Builder channelTouchType(java.util.List < Integer > channelTouchType) {
            this.putBodyParameter("ChannelTouchType", channelTouchType);
            this.channelTouchType = channelTouchType;
            return this;
        }

        /**
         * CheckFreqType.
         */
        public Builder checkFreqType(Integer checkFreqType) {
            this.putBodyParameter("CheckFreqType", checkFreqType);
            this.checkFreqType = checkFreqType;
            return this;
        }

        /**
         * DepList.
         */
        public Builder depList(java.util.List < Long > depList) {
            this.putBodyParameter("DepList", depList);
            this.depList = depList;
            return this;
        }

        /**
         * GroupList.
         */
        public Builder groupList(java.util.List < Long > groupList) {
            this.putBodyParameter("GroupList", groupList);
            this.groupList = groupList;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * ProjectName.
         */
        public Builder projectName(String projectName) {
            this.putBodyParameter("ProjectName", projectName);
            this.projectName = projectName;
            return this;
        }

        /**
         * ScopeType.
         */
        public Builder scopeType(Integer scopeType) {
            this.putBodyParameter("ScopeType", scopeType);
            this.scopeType = scopeType;
            return this;
        }

        /**
         * ServicerList.
         */
        public Builder servicerList(java.util.List < String > servicerList) {
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
