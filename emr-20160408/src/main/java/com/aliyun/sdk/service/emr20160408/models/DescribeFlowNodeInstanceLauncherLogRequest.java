// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeFlowNodeInstanceLauncherLogRequest} extends {@link RequestModel}
 *
 * <p>DescribeFlowNodeInstanceLauncherLogRequest</p>
 */
public class DescribeFlowNodeInstanceLauncherLogRequest extends Request {
    @Query
    @NameInMap("EndTime")
    private Long endTime;

    @Query
    @NameInMap("Length")
    private Integer length;

    @Query
    @NameInMap("Lines")
    private Integer lines;

    @Query
    @NameInMap("NodeInstanceId")
    @Validation(required = true)
    private String nodeInstanceId;

    @Query
    @NameInMap("Offset")
    private Integer offset;

    @Query
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("Reverse")
    private Boolean reverse;

    @Query
    @NameInMap("Start")
    private Integer start;

    @Query
    @NameInMap("StartTime")
    private Long startTime;

    private DescribeFlowNodeInstanceLauncherLogRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.length = builder.length;
        this.lines = builder.lines;
        this.nodeInstanceId = builder.nodeInstanceId;
        this.offset = builder.offset;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
        this.reverse = builder.reverse;
        this.start = builder.start;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFlowNodeInstanceLauncherLogRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return length
     */
    public Integer getLength() {
        return this.length;
    }

    /**
     * @return lines
     */
    public Integer getLines() {
        return this.lines;
    }

    /**
     * @return nodeInstanceId
     */
    public String getNodeInstanceId() {
        return this.nodeInstanceId;
    }

    /**
     * @return offset
     */
    public Integer getOffset() {
        return this.offset;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return reverse
     */
    public Boolean getReverse() {
        return this.reverse;
    }

    /**
     * @return start
     */
    public Integer getStart() {
        return this.start;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<DescribeFlowNodeInstanceLauncherLogRequest, Builder> {
        private Long endTime; 
        private Integer length; 
        private Integer lines; 
        private String nodeInstanceId; 
        private Integer offset; 
        private String projectId; 
        private String regionId; 
        private Boolean reverse; 
        private Integer start; 
        private Long startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeFlowNodeInstanceLauncherLogRequest request) {
            super(request);
            this.endTime = request.endTime;
            this.length = request.length;
            this.lines = request.lines;
            this.nodeInstanceId = request.nodeInstanceId;
            this.offset = request.offset;
            this.projectId = request.projectId;
            this.regionId = request.regionId;
            this.reverse = request.reverse;
            this.start = request.start;
            this.startTime = request.startTime;
        } 

        /**
         * EndTime.
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * Length.
         */
        public Builder length(Integer length) {
            this.putQueryParameter("Length", length);
            this.length = length;
            return this;
        }

        /**
         * Lines.
         */
        public Builder lines(Integer lines) {
            this.putQueryParameter("Lines", lines);
            this.lines = lines;
            return this;
        }

        /**
         * NodeInstanceId.
         */
        public Builder nodeInstanceId(String nodeInstanceId) {
            this.putQueryParameter("NodeInstanceId", nodeInstanceId);
            this.nodeInstanceId = nodeInstanceId;
            return this;
        }

        /**
         * Offset.
         */
        public Builder offset(Integer offset) {
            this.putQueryParameter("Offset", offset);
            this.offset = offset;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(String projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Reverse.
         */
        public Builder reverse(Boolean reverse) {
            this.putQueryParameter("Reverse", reverse);
            this.reverse = reverse;
            return this;
        }

        /**
         * Start.
         */
        public Builder start(Integer start) {
            this.putQueryParameter("Start", start);
            this.start = start;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeFlowNodeInstanceLauncherLogRequest build() {
            return new DescribeFlowNodeInstanceLauncherLogRequest(this);
        } 

    } 

}
