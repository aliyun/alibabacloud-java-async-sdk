// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link UpdateEdgeContainerAppResourceReserveRequest} extends {@link RequestModel}
 *
 * <p>UpdateEdgeContainerAppResourceReserveRequest</p>
 */
public class UpdateEdgeContainerAppResourceReserveRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DurationTime")
    private String durationTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Enable")
    private Boolean enable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Forever")
    private Boolean forever;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReserveSet")
    private java.util.List<ReserveSet> reserveSet;

    private UpdateEdgeContainerAppResourceReserveRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.durationTime = builder.durationTime;
        this.enable = builder.enable;
        this.forever = builder.forever;
        this.reserveSet = builder.reserveSet;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateEdgeContainerAppResourceReserveRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return durationTime
     */
    public String getDurationTime() {
        return this.durationTime;
    }

    /**
     * @return enable
     */
    public Boolean getEnable() {
        return this.enable;
    }

    /**
     * @return forever
     */
    public Boolean getForever() {
        return this.forever;
    }

    /**
     * @return reserveSet
     */
    public java.util.List<ReserveSet> getReserveSet() {
        return this.reserveSet;
    }

    public static final class Builder extends Request.Builder<UpdateEdgeContainerAppResourceReserveRequest, Builder> {
        private String appId; 
        private String durationTime; 
        private Boolean enable; 
        private Boolean forever; 
        private java.util.List<ReserveSet> reserveSet; 

        private Builder() {
            super();
        } 

        private Builder(UpdateEdgeContainerAppResourceReserveRequest request) {
            super(request);
            this.appId = request.appId;
            this.durationTime = request.durationTime;
            this.enable = request.enable;
            this.forever = request.forever;
            this.reserveSet = request.reserveSet;
        } 

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * DurationTime.
         */
        public Builder durationTime(String durationTime) {
            this.putQueryParameter("DurationTime", durationTime);
            this.durationTime = durationTime;
            return this;
        }

        /**
         * Enable.
         */
        public Builder enable(Boolean enable) {
            this.putQueryParameter("Enable", enable);
            this.enable = enable;
            return this;
        }

        /**
         * Forever.
         */
        public Builder forever(Boolean forever) {
            this.putQueryParameter("Forever", forever);
            this.forever = forever;
            return this;
        }

        /**
         * ReserveSet.
         */
        public Builder reserveSet(java.util.List<ReserveSet> reserveSet) {
            String reserveSetShrink = shrink(reserveSet, "ReserveSet", "json");
            this.putQueryParameter("ReserveSet", reserveSetShrink);
            this.reserveSet = reserveSet;
            return this;
        }

        @Override
        public UpdateEdgeContainerAppResourceReserveRequest build() {
            return new UpdateEdgeContainerAppResourceReserveRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateEdgeContainerAppResourceReserveRequest} extends {@link TeaModel}
     *
     * <p>UpdateEdgeContainerAppResourceReserveRequest</p>
     */
    public static class ReserveSet extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Isp")
        private String isp;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("Replicas")
        private Integer replicas;

        private ReserveSet(Builder builder) {
            this.isp = builder.isp;
            this.region = builder.region;
            this.replicas = builder.replicas;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReserveSet create() {
            return builder().build();
        }

        /**
         * @return isp
         */
        public String getIsp() {
            return this.isp;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return replicas
         */
        public Integer getReplicas() {
            return this.replicas;
        }

        public static final class Builder {
            private String isp; 
            private String region; 
            private Integer replicas; 

            private Builder() {
            } 

            private Builder(ReserveSet model) {
                this.isp = model.isp;
                this.region = model.region;
                this.replicas = model.replicas;
            } 

            /**
             * Isp.
             */
            public Builder isp(String isp) {
                this.isp = isp;
                return this;
            }

            /**
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * Replicas.
             */
            public Builder replicas(Integer replicas) {
                this.replicas = replicas;
                return this;
            }

            public ReserveSet build() {
                return new ReserveSet(this);
            } 

        } 

    }
}
