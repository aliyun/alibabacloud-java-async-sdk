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
         * <p>The application ID, which can be obtained by calling the <a href="~~ListEdgeContainerApps~~">ListEdgeContainerApps</a> operation.</p>
         * 
         * <strong>example:</strong>
         * <p>app-88068867578379****</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The end time of the reservation. The input time is UTC. It takes +8 hours to enter Beijing time. For example, if the current time is 2006-01-02 06:04:05, you need to enter &quot;2006-01-02T14:04:05Z&quot;.</p>
         * 
         * <strong>example:</strong>
         * <p>2006-01-02T15:04:05Z</p>
         */
        public Builder durationTime(String durationTime) {
            this.putQueryParameter("DurationTime", durationTime);
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
            this.putQueryParameter("Enable", enable);
            this.enable = enable;
            return this;
        }

        /**
         * <p>Whether to permanently enable the reservation. Once it is enabled, you are not allowed to set the reservation deadline.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder forever(Boolean forever) {
            this.putQueryParameter("Forever", forever);
            this.forever = forever;
            return this;
        }

        /**
         * <p>Reserved resource list.</p>
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
