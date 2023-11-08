// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateControlPlaneLogConfigRequest} extends {@link RequestModel}
 *
 * <p>UpdateControlPlaneLogConfigRequest</p>
 */
public class UpdateControlPlaneLogConfigRequest extends Request {
    @Body
    @NameInMap("Enabled")
    @Validation(required = true)
    private Boolean enabled;

    @Body
    @NameInMap("LogTTLInDay")
    @Validation(maximum = 3000, minimum = 1)
    private Integer logTTLInDay;

    @Body
    @NameInMap("Project")
    private String project;

    @Body
    @NameInMap("ServiceMeshId")
    @Validation(required = true)
    private String serviceMeshId;

    private UpdateControlPlaneLogConfigRequest(Builder builder) {
        super(builder);
        this.enabled = builder.enabled;
        this.logTTLInDay = builder.logTTLInDay;
        this.project = builder.project;
        this.serviceMeshId = builder.serviceMeshId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateControlPlaneLogConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return enabled
     */
    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * @return logTTLInDay
     */
    public Integer getLogTTLInDay() {
        return this.logTTLInDay;
    }

    /**
     * @return project
     */
    public String getProject() {
        return this.project;
    }

    /**
     * @return serviceMeshId
     */
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

    public static final class Builder extends Request.Builder<UpdateControlPlaneLogConfigRequest, Builder> {
        private Boolean enabled; 
        private Integer logTTLInDay; 
        private String project; 
        private String serviceMeshId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateControlPlaneLogConfigRequest request) {
            super(request);
            this.enabled = request.enabled;
            this.logTTLInDay = request.logTTLInDay;
            this.project = request.project;
            this.serviceMeshId = request.serviceMeshId;
        } 

        /**
         * Specifies whether to collect control plane logs to Simple Log Service.
         */
        public Builder enabled(Boolean enabled) {
            this.putBodyParameter("Enabled", enabled);
            this.enabled = enabled;
            return this;
        }

        /**
         * The time to live (TTL) period of the collected logs. Unit: day.
         */
        public Builder logTTLInDay(Integer logTTLInDay) {
            this.putBodyParameter("LogTTLInDay", logTTLInDay);
            this.logTTLInDay = logTTLInDay;
            return this;
        }

        /**
         * The name of the Simple Log Service project to which control plane logs are collected.
         */
        public Builder project(String project) {
            this.putBodyParameter("Project", project);
            this.project = project;
            return this;
        }

        /**
         * The ID of the Service Mesh (ASM) instance.
         */
        public Builder serviceMeshId(String serviceMeshId) {
            this.putBodyParameter("ServiceMeshId", serviceMeshId);
            this.serviceMeshId = serviceMeshId;
            return this;
        }

        @Override
        public UpdateControlPlaneLogConfigRequest build() {
            return new UpdateControlPlaneLogConfigRequest(this);
        } 

    } 

}
