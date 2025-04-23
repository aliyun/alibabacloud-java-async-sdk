// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

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
 * {@link RunCloudMetricProfilingRequest} extends {@link RequestModel}
 *
 * <p>RunCloudMetricProfilingRequest</p>
 */
public class RunCloudMetricProfilingRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Duration")
    private Integer duration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Freq")
    private Integer freq;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HostName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String hostName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProcessId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer processId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private RunCloudMetricProfilingRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.duration = builder.duration;
        this.freq = builder.freq;
        this.hostName = builder.hostName;
        this.processId = builder.processId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunCloudMetricProfilingRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return duration
     */
    public Integer getDuration() {
        return this.duration;
    }

    /**
     * @return freq
     */
    public Integer getFreq() {
        return this.freq;
    }

    /**
     * @return hostName
     */
    public String getHostName() {
        return this.hostName;
    }

    /**
     * @return processId
     */
    public Integer getProcessId() {
        return this.processId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<RunCloudMetricProfilingRequest, Builder> {
        private String clusterId; 
        private Integer duration; 
        private Integer freq; 
        private String hostName; 
        private Integer processId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(RunCloudMetricProfilingRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.duration = request.duration;
            this.freq = request.freq;
            this.hostName = request.hostName;
            this.processId = request.processId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The ID of the E-HPC cluster.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ehpc-hz-jeJki6****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The duration of the profiling process. Unit: seconds.</p>
         * <p>Value values: 10 to 300.</p>
         * <p>Default value: 30.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        public Builder duration(Integer duration) {
            this.putQueryParameter("Duration", duration);
            this.duration = duration;
            return this;
        }

        /**
         * <p>The sampling frequency. Unit: Hz. Valid values: 1 to 2000.</p>
         * <p>Default value: 2000.</p>
         * 
         * <strong>example:</strong>
         * <p>2000</p>
         */
        public Builder freq(Integer freq) {
            this.putQueryParameter("Freq", freq);
            this.freq = freq;
            return this;
        }

        /**
         * <p>The hostname.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>compute0</p>
         */
        public Builder hostName(String hostName) {
            this.putQueryParameter("HostName", hostName);
            this.hostName = hostName;
            return this;
        }

        /**
         * <p>The ID of the profiling process.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>29075</p>
         */
        public Builder processId(Integer processId) {
            this.putQueryParameter("ProcessId", processId);
            this.processId = processId;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public RunCloudMetricProfilingRequest build() {
            return new RunCloudMetricProfilingRequest(this);
        } 

    } 

}
