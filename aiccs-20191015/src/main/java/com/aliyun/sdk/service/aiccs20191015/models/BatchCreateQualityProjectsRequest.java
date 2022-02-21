// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchCreateQualityProjectsRequest} extends {@link RequestModel}
 *
 * <p>BatchCreateQualityProjectsRequest</p>
 */
public class BatchCreateQualityProjectsRequest extends Request {
    @Query
    @NameInMap("AnalysisIds")
    @Validation(required = true)
    private java.util.List < Long > analysisIds;

    @Query
    @NameInMap("ChannelTouchType")
    private java.util.List < Integer > channelTouchType;

    @Query
    @NameInMap("CheckFreqType")
    @Validation(required = true, maximum = 100, minimum = 1)
    private Integer checkFreqType;

    @Query
    @NameInMap("InstanceList")
    @Validation(required = true)
    private java.util.List < String > instanceList;

    @Query
    @NameInMap("ProjectName")
    @Validation(required = true)
    private String projectName;

    @Query
    @NameInMap("TimeRangeEnd")
    private String timeRangeEnd;

    @Query
    @NameInMap("TimeRangeStart")
    private String timeRangeStart;

    private BatchCreateQualityProjectsRequest(Builder builder) {
        super(builder);
        this.analysisIds = builder.analysisIds;
        this.channelTouchType = builder.channelTouchType;
        this.checkFreqType = builder.checkFreqType;
        this.instanceList = builder.instanceList;
        this.projectName = builder.projectName;
        this.timeRangeEnd = builder.timeRangeEnd;
        this.timeRangeStart = builder.timeRangeStart;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchCreateQualityProjectsRequest create() {
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
     * @return instanceList
     */
    public java.util.List < String > getInstanceList() {
        return this.instanceList;
    }

    /**
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
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

    public static final class Builder extends Request.Builder<BatchCreateQualityProjectsRequest, Builder> {
        private java.util.List < Long > analysisIds; 
        private java.util.List < Integer > channelTouchType; 
        private Integer checkFreqType; 
        private java.util.List < String > instanceList; 
        private String projectName; 
        private String timeRangeEnd; 
        private String timeRangeStart; 

        private Builder() {
            super();
        } 

        private Builder(BatchCreateQualityProjectsRequest response) {
            super(response);
            this.analysisIds = response.analysisIds;
            this.channelTouchType = response.channelTouchType;
            this.checkFreqType = response.checkFreqType;
            this.instanceList = response.instanceList;
            this.projectName = response.projectName;
            this.timeRangeEnd = response.timeRangeEnd;
            this.timeRangeStart = response.timeRangeStart;
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
         * InstanceList.
         */
        public Builder instanceList(java.util.List < String > instanceList) {
            this.putQueryParameter("InstanceList", instanceList);
            this.instanceList = instanceList;
            return this;
        }

        /**
         * ProjectName.
         */
        public Builder projectName(String projectName) {
            this.putQueryParameter("ProjectName", projectName);
            this.projectName = projectName;
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
        public BatchCreateQualityProjectsRequest build() {
            return new BatchCreateQualityProjectsRequest(this);
        } 

    } 

}
