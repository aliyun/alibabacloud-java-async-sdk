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
         * <p>The reservation end time. This parameter uses UTC time. To convert from UTC+8, add 8 hours. For example, if the current time is 2006-01-02 06:04:05 in UTC+8, enter &quot;2006-01-02T14:04:05Z&quot;.</p>
         * 
         * <strong>example:</strong>
         * <p>2006-01-02T15:04:05Z</p>
         */
        public Builder durationTime(String durationTime) {
            this.durationTime = durationTime;
            return this;
        }

        /**
         * <p>Specifies whether to enable resource reservation.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enable(Boolean enable) {
            this.enable = enable;
            return this;
        }

        /**
         * <p>Indicates whether reservation is permanently enabled.</p>
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
         * <p>The list of reserved resources.</p>
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
             * <p>The Internet service provider (ISP). The following ISPs are supported. You do not need to specify an ISP for special administrative regions or areas outside China:</p>
             * <ul>
             * <li>China Mobile: cmcc</li>
             * <li>China Telecom: chinanet</li>
             * <li>China Unicom: unicom.</li>
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
             * <p>The region information. For the Chinese mainland, you can specify a major region. For special administrative regions and areas outside China, you can specify a country or region. The following list shows the parameter mappings:</p>
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
             * <p>Special administrative regions and outside China:</p>
             * <ul>
             * <li>Taiwan (China): tw</li>
             * <li>Macao (China): mo</li>
             * <li>Hong Kong (China): hk</li>
             * <li>Japan: jp</li>
             * <li>United States: us</li>
             * <li>Thailand: th</li>
             * <li>South Korea: kr</li>
             * <li>Russia: ru</li>
             * <li>Singapore: sg</li>
             * <li>France: fr</li>
             * <li>Spain: es</li>
             * <li>Italy: it</li>
             * <li>Sweden: se</li>
             * <li>United Arab Emirates: ae</li>
             * <li>Indonesia: id</li>
             * <li>Chile: cl</li>
             * <li>Philippines: ph</li>
             * <li>Malaysia: my</li>
             * <li>Vietnam: vn</li>
             * <li>Argentina: ar</li>
             * <li>Australia: au</li>
             * <li>Brazil: br</li>
             * <li>Colombia: co</li>
             * <li>Germany: de</li>
             * <li>United Kingdom: gb</li>
             * <li>Peru: pe</li>
             * <li>Saudi Arabia: sa</li>
             * <li>Netherlands: nl</li>
             * <li>South Africa: za.</li>
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
