// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alikafka20190916.models;

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
 * {@link FailoverTestRequest} extends {@link RequestModel}
 *
 * <p>FailoverTestRequest</p>
 */
public class FailoverTestRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Configs")
    private String configs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Duration")
    private Long duration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExecuteTime")
    private Long executeTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private FailoverTestRequest(Builder builder) {
        super(builder);
        this.configs = builder.configs;
        this.description = builder.description;
        this.duration = builder.duration;
        this.executeTime = builder.executeTime;
        this.instanceId = builder.instanceId;
        this.name = builder.name;
        this.regionId = builder.regionId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FailoverTestRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return configs
     */
    public String getConfigs() {
        return this.configs;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return duration
     */
    public Long getDuration() {
        return this.duration;
    }

    /**
     * @return executeTime
     */
    public Long getExecuteTime() {
        return this.executeTime;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<FailoverTestRequest, Builder> {
        private String configs; 
        private String description; 
        private Long duration; 
        private Long executeTime; 
        private String instanceId; 
        private String name; 
        private String regionId; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(FailoverTestRequest request) {
            super(request);
            this.configs = request.configs;
            this.description = request.description;
            this.duration = request.duration;
            this.executeTime = request.executeTime;
            this.instanceId = request.instanceId;
            this.name = request.name;
            this.regionId = request.regionId;
            this.type = request.type;
        } 

        /**
         * Configs.
         */
        public Builder configs(String configs) {
            this.putQueryParameter("Configs", configs);
            this.configs = configs;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * Duration.
         */
        public Builder duration(Long duration) {
            this.putQueryParameter("Duration", duration);
            this.duration = duration;
            return this;
        }

        /**
         * ExecuteTime.
         */
        public Builder executeTime(Long executeTime) {
            this.putQueryParameter("ExecuteTime", executeTime);
            this.executeTime = executeTime;
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
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
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
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public FailoverTestRequest build() {
            return new FailoverTestRequest(this);
        } 

    } 

}
