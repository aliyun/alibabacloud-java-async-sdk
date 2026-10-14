// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sysom20231230.models;

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
 * {@link GetGpuClusterListAlarmRecordRequest} extends {@link RequestModel}
 *
 * <p>GetGpuClusterListAlarmRecordRequest</p>
 */
public class GetGpuClusterListAlarmRecordRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("alarmCluster")
    private String alarmCluster;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("alarmExtInfo")
    private String alarmExtInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("alarmTask")
    private String alarmTask;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("alarmTime")
    private String alarmTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("alarmType")
    private String alarmType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("current")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long current;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    private GetGpuClusterListAlarmRecordRequest(Builder builder) {
        super(builder);
        this.alarmCluster = builder.alarmCluster;
        this.alarmExtInfo = builder.alarmExtInfo;
        this.alarmTask = builder.alarmTask;
        this.alarmTime = builder.alarmTime;
        this.alarmType = builder.alarmType;
        this.current = builder.current;
        this.pageSize = builder.pageSize;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetGpuClusterListAlarmRecordRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alarmCluster
     */
    public String getAlarmCluster() {
        return this.alarmCluster;
    }

    /**
     * @return alarmExtInfo
     */
    public String getAlarmExtInfo() {
        return this.alarmExtInfo;
    }

    /**
     * @return alarmTask
     */
    public String getAlarmTask() {
        return this.alarmTask;
    }

    /**
     * @return alarmTime
     */
    public String getAlarmTime() {
        return this.alarmTime;
    }

    /**
     * @return alarmType
     */
    public String getAlarmType() {
        return this.alarmType;
    }

    /**
     * @return current
     */
    public Long getCurrent() {
        return this.current;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<GetGpuClusterListAlarmRecordRequest, Builder> {
        private String alarmCluster; 
        private String alarmExtInfo; 
        private String alarmTask; 
        private String alarmTime; 
        private String alarmType; 
        private Long current; 
        private Long pageSize; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(GetGpuClusterListAlarmRecordRequest request) {
            super(request);
            this.alarmCluster = request.alarmCluster;
            this.alarmExtInfo = request.alarmExtInfo;
            this.alarmTask = request.alarmTask;
            this.alarmTime = request.alarmTime;
            this.alarmType = request.alarmType;
            this.current = request.current;
            this.pageSize = request.pageSize;
            this.status = request.status;
        } 

        /**
         * <p>Query by a specific cluster, such as &quot;cluster1&quot;. To query multiple clusters, separate them with commas: &quot;cluster1,cluster2,cluster3&quot;.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;cluster1&quot;</p>
         */
        public Builder alarmCluster(String alarmCluster) {
            this.putQueryParameter("alarmCluster", alarmCluster);
            this.alarmCluster = alarmCluster;
            return this;
        }

        /**
         * <p>Filter anomalies by instance ID or container.</p>
         * 
         * <strong>example:</strong>
         * <p>instance id</p>
         */
        public Builder alarmExtInfo(String alarmExtInfo) {
            this.putQueryParameter("alarmExtInfo", alarmExtInfo);
            this.alarmExtInfo = alarmExtInfo;
            return this;
        }

        /**
         * <p>Query by a specific task, such as &quot;task1&quot;. To query multiple tasks, separate them with commas: &quot;task1,task2,task3&quot;.</p>
         * 
         * <strong>example:</strong>
         * <p>task id</p>
         */
        public Builder alarmTask(String alarmTask) {
            this.putQueryParameter("alarmTask", alarmTask);
            this.alarmTask = alarmTask;
            return this;
        }

        /**
         * <p>Query by a specific point in time, such as &quot;2025-08-22 18:16:25&quot;. Query by a time range using the &quot;start,end&quot; format, such as &quot;2025-08-22 18:16:25,2025-08-23 18:16:25&quot;.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;2025-08-22 18:16:25,2025-08-23 18:16:25&quot;</p>
         */
        public Builder alarmTime(String alarmTime) {
            this.putQueryParameter("alarmTime", alarmTime);
            this.alarmTime = alarmTime;
            return this;
        }

        /**
         * <p>Filter by anomaly type, such as GPU memory access out-of-bounds or task hang.</p>
         * 
         * <strong>example:</strong>
         * <p>cuda error</p>
         */
        public Builder alarmType(String alarmType) {
            this.putQueryParameter("alarmType", alarmType);
            this.alarmType = alarmType;
            return this;
        }

        /**
         * <p>The current page number for pagination.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder current(Long current) {
            this.putQueryParameter("current", current);
            this.current = current;
            return this;
        }

        /**
         * <p>The number of entries per page for pagination.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Filter by task status, such as blocking, running, exited, or restart.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("status", status);
            this.status = status;
            return this;
        }

        @Override
        public GetGpuClusterListAlarmRecordRequest build() {
            return new GetGpuClusterListAlarmRecordRequest(this);
        } 

    } 

}
