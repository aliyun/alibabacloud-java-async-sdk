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
 * {@link BatchCreateQualityProjectsRequest} extends {@link RequestModel}
 *
 * <p>BatchCreateQualityProjectsRequest</p>
 */
public class BatchCreateQualityProjectsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AnalysisIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Long> analysisIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChannelTouchType")
    private java.util.List<Integer> channelTouchType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CheckFreqType")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 100, minimum = 1)
    private Integer checkFreqType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> instanceList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TimeRangeEnd")
    private String timeRangeEnd;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TimeRangeStart")
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
     * @return instanceList
     */
    public java.util.List<String> getInstanceList() {
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
        private java.util.List<Long> analysisIds; 
        private java.util.List<Integer> channelTouchType; 
        private Integer checkFreqType; 
        private java.util.List<String> instanceList; 
        private String projectName; 
        private String timeRangeEnd; 
        private String timeRangeStart; 

        private Builder() {
            super();
        } 

        private Builder(BatchCreateQualityProjectsRequest request) {
            super(request);
            this.analysisIds = request.analysisIds;
            this.channelTouchType = request.channelTouchType;
            this.checkFreqType = request.checkFreqType;
            this.instanceList = request.instanceList;
            this.projectName = request.projectName;
            this.timeRangeEnd = request.timeRangeEnd;
            this.timeRangeStart = request.timeRangeStart;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder analysisIds(java.util.List<Long> analysisIds) {
            this.putQueryParameter("AnalysisIds", analysisIds);
            this.analysisIds = analysisIds;
            return this;
        }

        /**
         * ChannelTouchType.
         */
        public Builder channelTouchType(java.util.List<Integer> channelTouchType) {
            this.putQueryParameter("ChannelTouchType", channelTouchType);
            this.channelTouchType = channelTouchType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder checkFreqType(Integer checkFreqType) {
            this.putQueryParameter("CheckFreqType", checkFreqType);
            this.checkFreqType = checkFreqType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder instanceList(java.util.List<String> instanceList) {
            this.putQueryParameter("InstanceList", instanceList);
            this.instanceList = instanceList;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
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
