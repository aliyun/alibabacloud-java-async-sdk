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
 * {@link UpdateEdgeContainerAppResourceReserveResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateEdgeContainerAppResourceReserveResponseBody</p>
 */
public class UpdateEdgeContainerAppResourceReserveResponseBody extends TeaModel {
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

    private UpdateEdgeContainerAppResourceReserveResponseBody(Builder builder) {
        this.durationTime = builder.durationTime;
        this.enable = builder.enable;
        this.forever = builder.forever;
        this.requestId = builder.requestId;
        this.reserveSet = builder.reserveSet;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateEdgeContainerAppResourceReserveResponseBody create() {
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

        private Builder(UpdateEdgeContainerAppResourceReserveResponseBody model) {
            this.durationTime = model.durationTime;
            this.enable = model.enable;
            this.forever = model.forever;
            this.requestId = model.requestId;
            this.reserveSet = model.reserveSet;
        } 

        /**
         * <p>The end time of the reservation. The input time is UTC. It takes +8 hours to enter Beijing time. For example, if the current time is 2006-01-02 06:04:05, you need to enter &quot;2006-01-02T14:04:05Z&quot;.</p>
         * 
         * <strong>example:</strong>
         * <p>2006-01-02T15:04:05Z</p>
         */
        public Builder durationTime(String durationTime) {
            this.durationTime = durationTime;
            return this;
        }

        /**
         * <p>Whether to enable resource reservation.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enable(Boolean enable) {
            this.enable = enable;
            return this;
        }

        /**
         * <p>Enable Permanent Incremental Backup</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder forever(Boolean forever) {
            this.forever = forever;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1AB799CF-562A-5CAF-A99E-4354053D814F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Reserved resource list.</p>
         */
        public Builder reserveSet(java.util.List<ReserveSet> reserveSet) {
            this.reserveSet = reserveSet;
            return this;
        }

        public UpdateEdgeContainerAppResourceReserveResponseBody build() {
            return new UpdateEdgeContainerAppResourceReserveResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UpdateEdgeContainerAppResourceReserveResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateEdgeContainerAppResourceReserveResponseBody</p>
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
             * <p>The ISP. The following types are supported. You do not need to enter the ISP in regions outside the Chinese mainland:</p>
             * <ul>
             * <li>China Mobile: cmcc</li>
             * <li>China Telecom: chinanet</li>
             * <li>China Unicom: unicom</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>cmcc</p>
             */
            public Builder isp(String isp) {
                this.isp = isp;
                return this;
            }

            /**
             * <p>Information about the region. The Chinese mainland supports the input of regions and special administrative regions, and the regions outside the Chinese mainland support the input of countries. The following is the corresponding parameter mapping:</p>
             * <p>Chinese mainland:</p>
             * <ul>
             * <li>East China: huadong</li>
             * <li>South China: huanan</li>
             * <li>Central China: huazhong</li>
             * <li>North China: huabei</li>
             * <li>Northwest China: xibei</li>
             * <li>Southwest China: xinan</li>
             * <li>Northeast China: dongbei</li>
             * </ul>
             * <p>Special Administrative Regions and overseas:</p>
             * <ul>
             * <li>Taiwan, China: tw</li>
             * <li>Macau, China: mo</li>
             * <li>Hong Kong, China: hk</li>
             * <li>Japan: jp</li>
             * <li>United States: us</li>
             * <li>Thailand: th</li>
             * <li>Korea: kr</li>
             * <li>Russia: ru</li>
             * <li>Singapore: sg</li>
             * <li>France: fr</li>
             * <li>Spain: es</li>
             * <li>Italy: it</li>
             * <li>Sweden: se</li>
             * <li>UAE: ae</li>
             * <li>Indonesia: id</li>
             * <li>Chile: cl</li>
             * <li>Philippines: ph</li>
             * <li>Malaysia: my</li>
             * <li>Vietnam: vn</li>
             * <li>Argentina: AR</li>
             * <li>Australia: au</li>
             * <li>Brazil: br</li>
             * <li>Colombia: co</li>
             * <li>Germany: de</li>
             * <li>UK: GB</li>
             * <li>Peru: pe</li>
             * <li>Saudi Arabia: sa</li>
             * <li>Netherlands: nl</li>
             * <li>South Africa: za</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>huazhong</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>The number of container replicas.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
