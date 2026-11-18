// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.schedulerx320240624.models;

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
 * {@link GetPageLogRequest} extends {@link RequestModel}
 *
 * <p>GetPageLogRequest</p>
 */
public class GetPageLogRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    private String appName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobExecutionId")
    private String jobExecutionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobName")
    private String jobName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Keyword")
    private String keyword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNum")
    private Integer pageNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Reverse")
    private Boolean reverse;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private Long startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkerAddr")
    private String workerAddr;

    private GetPageLogRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.appName = builder.appName;
        this.clusterId = builder.clusterId;
        this.endTime = builder.endTime;
        this.jobExecutionId = builder.jobExecutionId;
        this.jobName = builder.jobName;
        this.keyword = builder.keyword;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.reverse = builder.reverse;
        this.startTime = builder.startTime;
        this.workerAddr = builder.workerAddr;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPageLogRequest create() {
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
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return jobExecutionId
     */
    public String getJobExecutionId() {
        return this.jobExecutionId;
    }

    /**
     * @return jobName
     */
    public String getJobName() {
        return this.jobName;
    }

    /**
     * @return keyword
     */
    public String getKeyword() {
        return this.keyword;
    }

    /**
     * @return pageNum
     */
    public Integer getPageNum() {
        return this.pageNum;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return reverse
     */
    public Boolean getReverse() {
        return this.reverse;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return workerAddr
     */
    public String getWorkerAddr() {
        return this.workerAddr;
    }

    public static final class Builder extends Request.Builder<GetPageLogRequest, Builder> {
        private String regionId; 
        private String appName; 
        private String clusterId; 
        private Long endTime; 
        private String jobExecutionId; 
        private String jobName; 
        private String keyword; 
        private Integer pageNum; 
        private Integer pageSize; 
        private Boolean reverse; 
        private Long startTime; 
        private String workerAddr; 

        private Builder() {
            super();
        } 

        private Builder(GetPageLogRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.appName = request.appName;
            this.clusterId = request.clusterId;
            this.endTime = request.endTime;
            this.jobExecutionId = request.jobExecutionId;
            this.jobName = request.jobName;
            this.keyword = request.keyword;
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
            this.reverse = request.reverse;
            this.startTime = request.startTime;
            this.workerAddr = request.workerAddr;
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
         * <p>The application name.</p>
         * 
         * <strong>example:</strong>
         * <p>test-app</p>
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * <p>The cluster ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>xxljob-b6ec1xxxx</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The end timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1777292662000</p>
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The job execution ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1310630367761285120</p>
         */
        public Builder jobExecutionId(String jobExecutionId) {
            this.putQueryParameter("JobExecutionId", jobExecutionId);
            this.jobExecutionId = jobExecutionId;
            return this;
        }

        /**
         * <p>The job name.</p>
         * 
         * <strong>example:</strong>
         * <p>job01</p>
         */
        public Builder jobName(String jobName) {
            this.putQueryParameter("JobName", jobName);
            this.jobName = jobName;
            return this;
        }

        /**
         * <p>The search keyword.</p>
         * 
         * <strong>example:</strong>
         * <p>hello word</p>
         */
        public Builder keyword(String keyword) {
            this.putQueryParameter("Keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNum(Integer pageNum) {
            this.putQueryParameter("PageNum", pageNum);
            this.pageNum = pageNum;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Specifies whether to sort the results in descending order. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Sorts the results in descending order.</li>
         * <li><strong>false</strong>: Sorts the results in ascending order.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder reverse(Boolean reverse) {
            this.putQueryParameter("Reverse", reverse);
            this.reverse = reverse;
            return this;
        }

        /**
         * <p>The start timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1777292662000</p>
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The executor address.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.1.100</p>
         */
        public Builder workerAddr(String workerAddr) {
            this.putQueryParameter("WorkerAddr", workerAddr);
            this.workerAddr = workerAddr;
            return this;
        }

        @Override
        public GetPageLogRequest build() {
            return new GetPageLogRequest(this);
        } 

    } 

}
