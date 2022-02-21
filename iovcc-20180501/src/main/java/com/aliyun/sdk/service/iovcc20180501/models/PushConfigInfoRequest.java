// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PushConfigInfoRequest} extends {@link RequestModel}
 *
 * <p>PushConfigInfoRequest</p>
 */
public class PushConfigInfoRequest extends Request {
    @Query
    @NameInMap("Config")
    @Validation(required = true)
    private String config;

    @Query
    @NameInMap("HostDeviceId")
    @Validation(required = true)
    private String hostDeviceId;

    @Query
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private PushConfigInfoRequest(Builder builder) {
        super(builder);
        this.config = builder.config;
        this.hostDeviceId = builder.hostDeviceId;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PushConfigInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return config
     */
    public String getConfig() {
        return this.config;
    }

    /**
     * @return hostDeviceId
     */
    public String getHostDeviceId() {
        return this.hostDeviceId;
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

    public static final class Builder extends Request.Builder<PushConfigInfoRequest, Builder> {
        private String config; 
        private String hostDeviceId; 
        private String projectId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(PushConfigInfoRequest response) {
            super(response);
            this.config = response.config;
            this.hostDeviceId = response.hostDeviceId;
            this.projectId = response.projectId;
            this.regionId = response.regionId;
        } 

        /**
         * 配置信息
         */
        public Builder config(String config) {
            this.putQueryParameter("Config", config);
            this.config = config;
            return this;
        }

        /**
         * 主机设备id
         */
        public Builder hostDeviceId(String hostDeviceId) {
            this.putQueryParameter("HostDeviceId", hostDeviceId);
            this.hostDeviceId = hostDeviceId;
            return this;
        }

        /**
         * 项目ID
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
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public PushConfigInfoRequest build() {
            return new PushConfigInfoRequest(this);
        } 

    } 

}
