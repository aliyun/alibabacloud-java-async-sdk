// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RunCloudMetricProfilingRequest} extends {@link RequestModel}
 *
 * <p>RunCloudMetricProfilingRequest</p>
 */
public class RunCloudMetricProfilingRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("Duration")
    private Integer duration;

    @Query
    @NameInMap("Freq")
    private Integer freq;

    @Query
    @NameInMap("HostName")
    @Validation(required = true)
    private String hostName;

    @Query
    @NameInMap("ProcessId")
    @Validation(required = true)
    private Integer processId;

    @Query
    @NameInMap("RegionId")
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

        private Builder(RunCloudMetricProfilingRequest response) {
            super(response);
            this.clusterId = response.clusterId;
            this.duration = response.duration;
            this.freq = response.freq;
            this.hostName = response.hostName;
            this.processId = response.processId;
            this.regionId = response.regionId;
        } 

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * Duration.
         */
        public Builder duration(Integer duration) {
            this.putQueryParameter("Duration", duration);
            this.duration = duration;
            return this;
        }

        /**
         * Freq.
         */
        public Builder freq(Integer freq) {
            this.putQueryParameter("Freq", freq);
            this.freq = freq;
            return this;
        }

        /**
         * HostName.
         */
        public Builder hostName(String hostName) {
            this.putQueryParameter("HostName", hostName);
            this.hostName = hostName;
            return this;
        }

        /**
         * ProcessId.
         */
        public Builder processId(Integer processId) {
            this.putQueryParameter("ProcessId", processId);
            this.processId = processId;
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

        @Override
        public RunCloudMetricProfilingRequest build() {
            return new RunCloudMetricProfilingRequest(this);
        } 

    } 

}
