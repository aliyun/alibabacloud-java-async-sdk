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
 * {@link GetEdgeContainerAppResourceCapacityResponseBody} extends {@link TeaModel}
 *
 * <p>GetEdgeContainerAppResourceCapacityResponseBody</p>
 */
public class GetEdgeContainerAppResourceCapacityResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Regions")
    private java.util.List<Regions> regions;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetEdgeContainerAppResourceCapacityResponseBody(Builder builder) {
        this.regions = builder.regions;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetEdgeContainerAppResourceCapacityResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regions
     */
    public java.util.List<Regions> getRegions() {
        return this.regions;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Regions> regions; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetEdgeContainerAppResourceCapacityResponseBody model) {
            this.regions = model.regions;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The queried region.</p>
         */
        public Builder regions(java.util.List<Regions> regions) {
            this.regions = regions;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>50423A7F-A83D-1E24-B80E-86DD25790759</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetEdgeContainerAppResourceCapacityResponseBody build() {
            return new GetEdgeContainerAppResourceCapacityResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetEdgeContainerAppResourceCapacityResponseBody} extends {@link TeaModel}
     *
     * <p>GetEdgeContainerAppResourceCapacityResponseBody</p>
     */
    public static class Regions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Isp")
        private String isp;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("Replicas")
        private Integer replicas;

        private Regions(Builder builder) {
            this.isp = builder.isp;
            this.region = builder.region;
            this.replicas = builder.replicas;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Regions create() {
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

            private Builder(Regions model) {
                this.isp = model.isp;
                this.region = model.region;
                this.replicas = model.replicas;
            } 

            /**
             * <p>Supported ISPs are as follows. The parameter is left empty for regions outside the Chinese mainland. ISP:</p>
             * <ul>
             * <li>China Mobile: cmcc</li>
             * <li>China Telecom: chinanet</li>
             * <li>China Unicom: unicom</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>unicom</p>
             */
            public Builder isp(String isp) {
                this.isp = isp;
                return this;
            }

            /**
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
             * <p>Special Administrative Regions and Overseas:</p>
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
             * <p>huadong</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>The number of container replicas that can be deployed.</p>
             * 
             * <strong>example:</strong>
             * <p>16</p>
             */
            public Builder replicas(Integer replicas) {
                this.replicas = replicas;
                return this;
            }

            public Regions build() {
                return new Regions(this);
            } 

        } 

    }
}
