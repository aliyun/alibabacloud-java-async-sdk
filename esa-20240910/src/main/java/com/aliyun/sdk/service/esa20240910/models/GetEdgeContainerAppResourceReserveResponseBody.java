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
 * {@link GetEdgeContainerAppResourceReserveResponseBody} extends {@link TeaModel}
 *
 * <p>GetEdgeContainerAppResourceReserveResponseBody</p>
 */
public class GetEdgeContainerAppResourceReserveResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DurationTime")
    private String durationTime;

    @com.aliyun.core.annotation.NameInMap("Enable")
    private Boolean enable;

    @com.aliyun.core.annotation.NameInMap("Forever")
    private Boolean forever;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ReserveSet")
    private java.util.List<ReserveSet> reserveSet;

    private GetEdgeContainerAppResourceReserveResponseBody(Builder builder) {
        this.durationTime = builder.durationTime;
        this.enable = builder.enable;
        this.forever = builder.forever;
        this.requestId = builder.requestId;
        this.reserveSet = builder.reserveSet;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetEdgeContainerAppResourceReserveResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return reserveSet
     */
    public java.util.List<ReserveSet> getReserveSet() {
        return this.reserveSet;
    }

    public static final class Builder {
        private String durationTime; 
        private Boolean enable; 
        private Boolean forever; 
        private String requestId; 
        private java.util.List<ReserveSet> reserveSet; 

        private Builder() {
        } 

        private Builder(GetEdgeContainerAppResourceReserveResponseBody model) {
            this.durationTime = model.durationTime;
            this.enable = model.enable;
            this.forever = model.forever;
            this.requestId = model.requestId;
            this.reserveSet = model.reserveSet;
        } 

        /**
         * DurationTime.
         */
        public Builder durationTime(String durationTime) {
            this.durationTime = durationTime;
            return this;
        }

        /**
         * Enable.
         */
        public Builder enable(Boolean enable) {
            this.enable = enable;
            return this;
        }

        /**
         * Forever.
         */
        public Builder forever(Boolean forever) {
            this.forever = forever;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ReserveSet.
         */
        public Builder reserveSet(java.util.List<ReserveSet> reserveSet) {
            this.reserveSet = reserveSet;
            return this;
        }

        public GetEdgeContainerAppResourceReserveResponseBody build() {
            return new GetEdgeContainerAppResourceReserveResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetEdgeContainerAppResourceReserveResponseBody} extends {@link TeaModel}
     *
     * <p>GetEdgeContainerAppResourceReserveResponseBody</p>
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
