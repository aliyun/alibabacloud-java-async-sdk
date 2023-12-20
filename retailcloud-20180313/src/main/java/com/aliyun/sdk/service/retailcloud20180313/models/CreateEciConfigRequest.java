// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateEciConfigRequest} extends {@link RequestModel}
 *
 * <p>CreateEciConfigRequest</p>
 */
public class CreateEciConfigRequest extends Request {
    @Query
    @NameInMap("AppEnvId")
    private Long appEnvId;

    @Query
    @NameInMap("EipBandwidth")
    private Integer eipBandwidth;

    @Query
    @NameInMap("EnableEciSchedulePolicy")
    private Boolean enableEciSchedulePolicy;

    @Query
    @NameInMap("MirrorCache")
    private Boolean mirrorCache;

    @Query
    @NameInMap("NormalInstanceLimit")
    private Integer normalInstanceLimit;

    @Query
    @NameInMap("ScheduleVirtualNode")
    private Boolean scheduleVirtualNode;

    private CreateEciConfigRequest(Builder builder) {
        super(builder);
        this.appEnvId = builder.appEnvId;
        this.eipBandwidth = builder.eipBandwidth;
        this.enableEciSchedulePolicy = builder.enableEciSchedulePolicy;
        this.mirrorCache = builder.mirrorCache;
        this.normalInstanceLimit = builder.normalInstanceLimit;
        this.scheduleVirtualNode = builder.scheduleVirtualNode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateEciConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appEnvId
     */
    public Long getAppEnvId() {
        return this.appEnvId;
    }

    /**
     * @return eipBandwidth
     */
    public Integer getEipBandwidth() {
        return this.eipBandwidth;
    }

    /**
     * @return enableEciSchedulePolicy
     */
    public Boolean getEnableEciSchedulePolicy() {
        return this.enableEciSchedulePolicy;
    }

    /**
     * @return mirrorCache
     */
    public Boolean getMirrorCache() {
        return this.mirrorCache;
    }

    /**
     * @return normalInstanceLimit
     */
    public Integer getNormalInstanceLimit() {
        return this.normalInstanceLimit;
    }

    /**
     * @return scheduleVirtualNode
     */
    public Boolean getScheduleVirtualNode() {
        return this.scheduleVirtualNode;
    }

    public static final class Builder extends Request.Builder<CreateEciConfigRequest, Builder> {
        private Long appEnvId; 
        private Integer eipBandwidth; 
        private Boolean enableEciSchedulePolicy; 
        private Boolean mirrorCache; 
        private Integer normalInstanceLimit; 
        private Boolean scheduleVirtualNode; 

        private Builder() {
            super();
        } 

        private Builder(CreateEciConfigRequest request) {
            super(request);
            this.appEnvId = request.appEnvId;
            this.eipBandwidth = request.eipBandwidth;
            this.enableEciSchedulePolicy = request.enableEciSchedulePolicy;
            this.mirrorCache = request.mirrorCache;
            this.normalInstanceLimit = request.normalInstanceLimit;
            this.scheduleVirtualNode = request.scheduleVirtualNode;
        } 

        /**
         * AppEnvId.
         */
        public Builder appEnvId(Long appEnvId) {
            this.putQueryParameter("AppEnvId", appEnvId);
            this.appEnvId = appEnvId;
            return this;
        }

        /**
         * EipBandwidth.
         */
        public Builder eipBandwidth(Integer eipBandwidth) {
            this.putQueryParameter("EipBandwidth", eipBandwidth);
            this.eipBandwidth = eipBandwidth;
            return this;
        }

        /**
         * EnableEciSchedulePolicy.
         */
        public Builder enableEciSchedulePolicy(Boolean enableEciSchedulePolicy) {
            this.putQueryParameter("EnableEciSchedulePolicy", enableEciSchedulePolicy);
            this.enableEciSchedulePolicy = enableEciSchedulePolicy;
            return this;
        }

        /**
         * MirrorCache.
         */
        public Builder mirrorCache(Boolean mirrorCache) {
            this.putQueryParameter("MirrorCache", mirrorCache);
            this.mirrorCache = mirrorCache;
            return this;
        }

        /**
         * NormalInstanceLimit.
         */
        public Builder normalInstanceLimit(Integer normalInstanceLimit) {
            this.putQueryParameter("NormalInstanceLimit", normalInstanceLimit);
            this.normalInstanceLimit = normalInstanceLimit;
            return this;
        }

        /**
         * ScheduleVirtualNode.
         */
        public Builder scheduleVirtualNode(Boolean scheduleVirtualNode) {
            this.putQueryParameter("ScheduleVirtualNode", scheduleVirtualNode);
            this.scheduleVirtualNode = scheduleVirtualNode;
            return this;
        }

        @Override
        public CreateEciConfigRequest build() {
            return new CreateEciConfigRequest(this);
        } 

    } 

}
