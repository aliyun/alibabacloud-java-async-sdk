// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EditQualityProjectRequest} extends {@link RequestModel}
 *
 * <p>EditQualityProjectRequest</p>
 */
public class EditQualityProjectRequest extends Request {
    @Query
    @NameInMap("AnalysisIds")
    @Validation(required = true)
    private java.util.List < Long > analysisIds;

    @Query
    @NameInMap("ChannelTouchType")
    @Validation(required = true)
    private java.util.List < Integer > channelTouchType;

    @Query
    @NameInMap("CheckFreqType")
    @Validation(required = true, maximum = 100, minimum = 1)
    private Integer checkFreqType;

    @Query
    @NameInMap("DepList")
    @Validation()
    private java.util.List < Long > depList;

    @Query
    @NameInMap("GroupList")
    @Validation()
    private java.util.List < Long > groupList;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("ProjectId")
    @Validation(required = true)
    private Long projectId;

    @Body
    @NameInMap("ProjectName")
    @Validation(required = true)
    private String projectName;

    @Query
    @NameInMap("ProjectVersion")
    @Validation(required = true, maximum = 100, minimum = 1)
    private Integer projectVersion;

    @Query
    @NameInMap("ScopeType")
    @Validation(required = true, maximum = 100, minimum = 1)
    private Integer scopeType;

    @Query
    @NameInMap("ServicerList")
    private java.util.List < String > servicerList;

    @Query
    @NameInMap("TimeRangeEnd")
    private String timeRangeEnd;

    @Query
    @NameInMap("TimeRangeStart")
    private String timeRangeStart;

    private EditQualityProjectRequest(Builder builder) {
        super(builder);
        this.analysisIds = builder.analysisIds;
        this.channelTouchType = builder.channelTouchType;
        this.checkFreqType = builder.checkFreqType;
        this.depList = builder.depList;
        this.groupList = builder.groupList;
        this.instanceId = builder.instanceId;
        this.projectId = builder.projectId;
        this.projectName = builder.projectName;
        this.projectVersion = builder.projectVersion;
        this.scopeType = builder.scopeType;
        this.servicerList = builder.servicerList;
        this.timeRangeEnd = builder.timeRangeEnd;
        this.timeRangeStart = builder.timeRangeStart;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EditQualityProjectRequest create() {
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
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    /**
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
    }

    /**
     * @return projectVersion
     */
    public Integer getProjectVersion() {
        return this.projectVersion;
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

    public static final class Builder extends Request.Builder<EditQualityProjectRequest, Builder> {
        private java.util.List < Long > analysisIds; 
        private java.util.List < Integer > channelTouchType; 
        private Integer checkFreqType; 
        private java.util.List < Long > depList; 
        private java.util.List < Long > groupList; 
        private String instanceId; 
        private Long projectId; 
        private String projectName; 
        private Integer projectVersion; 
        private Integer scopeType; 
        private java.util.List < String > servicerList; 
        private String timeRangeEnd; 
        private String timeRangeStart; 

        private Builder() {
            super();
        } 

        private Builder(EditQualityProjectRequest request) {
            super(request);
            this.analysisIds = request.analysisIds;
            this.channelTouchType = request.channelTouchType;
            this.checkFreqType = request.checkFreqType;
            this.depList = request.depList;
            this.groupList = request.groupList;
            this.instanceId = request.instanceId;
            this.projectId = request.projectId;
            this.projectName = request.projectName;
            this.projectVersion = request.projectVersion;
            this.scopeType = request.scopeType;
            this.servicerList = request.servicerList;
            this.timeRangeEnd = request.timeRangeEnd;
            this.timeRangeStart = request.timeRangeStart;
        } 

        /**
         * AnalysisIds.
         */
        public Builder analysisIds(java.util.List < Long > analysisIds) {
            this.putQueryParameter("AnalysisIds", analysisIds);
            this.analysisIds = analysisIds;
            return this;
        }

        /**
         * ChannelTouchType.
         */
        public Builder channelTouchType(java.util.List < Integer > channelTouchType) {
            this.putQueryParameter("ChannelTouchType", channelTouchType);
            this.channelTouchType = channelTouchType;
            return this;
        }

        /**
         * CheckFreqType.
         */
        public Builder checkFreqType(Integer checkFreqType) {
            this.putQueryParameter("CheckFreqType", checkFreqType);
            this.checkFreqType = checkFreqType;
            return this;
        }

        /**
         * DepList.
         */
        public Builder depList(java.util.List < Long > depList) {
            this.putQueryParameter("DepList", depList);
            this.depList = depList;
            return this;
        }

        /**
         * GroupList.
         */
        public Builder groupList(java.util.List < Long > groupList) {
            this.putQueryParameter("GroupList", groupList);
            this.groupList = groupList;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(Long projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
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
         * ProjectVersion.
         */
        public Builder projectVersion(Integer projectVersion) {
            this.putQueryParameter("ProjectVersion", projectVersion);
            this.projectVersion = projectVersion;
            return this;
        }

        /**
         * ScopeType.
         */
        public Builder scopeType(Integer scopeType) {
            this.putQueryParameter("ScopeType", scopeType);
            this.scopeType = scopeType;
            return this;
        }

        /**
         * ServicerList.
         */
        public Builder servicerList(java.util.List < String > servicerList) {
            this.putQueryParameter("ServicerList", servicerList);
            this.servicerList = servicerList;
            return this;
        }

        /**
         * TimeRangeEnd.
         */
        public Builder timeRangeEnd(String timeRangeEnd) {
            this.putQueryParameter("TimeRangeEnd", timeRangeEnd);
            this.timeRangeEnd = timeRangeEnd;
            return this;
        }

        /**
         * TimeRangeStart.
         */
        public Builder timeRangeStart(String timeRangeStart) {
            this.putQueryParameter("TimeRangeStart", timeRangeStart);
            this.timeRangeStart = timeRangeStart;
            return this;
        }

        @Override
        public EditQualityProjectRequest build() {
            return new EditQualityProjectRequest(this);
        } 

    } 

}
