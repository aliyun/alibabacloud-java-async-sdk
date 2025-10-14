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
 * {@link GetEdgeContainerAppResourceStatusResponseBody} extends {@link TeaModel}
 *
 * <p>GetEdgeContainerAppResourceStatusResponseBody</p>
 */
public class GetEdgeContainerAppResourceStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Regions")
    private java.util.List<Regions> regions;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetEdgeContainerAppResourceStatusResponseBody(Builder builder) {
        this.regions = builder.regions;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetEdgeContainerAppResourceStatusResponseBody create() {
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

        private Builder(GetEdgeContainerAppResourceStatusResponseBody model) {
            this.regions = model.regions;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Queries the regions of deployment.</p>
         */
        public Builder regions(java.util.List<Regions> regions) {
            this.regions = regions;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>15C66C7B-671A-4297-9187-2C4477247A74</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetEdgeContainerAppResourceStatusResponseBody build() {
            return new GetEdgeContainerAppResourceStatusResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetEdgeContainerAppResourceStatusResponseBody} extends {@link TeaModel}
     *
     * <p>GetEdgeContainerAppResourceStatusResponseBody</p>
     */
    public static class Regions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IsOffline")
        private Boolean isOffline;

        @com.aliyun.core.annotation.NameInMap("IsStaging")
        private Boolean isStaging;

        @com.aliyun.core.annotation.NameInMap("Isp")
        private String isp;

        @com.aliyun.core.annotation.NameInMap("Ready")
        private Integer ready;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Integer total;

        private Regions(Builder builder) {
            this.isOffline = builder.isOffline;
            this.isStaging = builder.isStaging;
            this.isp = builder.isp;
            this.ready = builder.ready;
            this.region = builder.region;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Regions create() {
            return builder().build();
        }

        /**
         * @return isOffline
         */
        public Boolean getIsOffline() {
            return this.isOffline;
        }

        /**
         * @return isStaging
         */
        public Boolean getIsStaging() {
            return this.isStaging;
        }

        /**
         * @return isp
         */
        public String getIsp() {
            return this.isp;
        }

        /**
         * @return ready
         */
        public Integer getReady() {
            return this.ready;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        public static final class Builder {
            private Boolean isOffline; 
            private Boolean isStaging; 
            private String isp; 
            private Integer ready; 
            private String region; 
            private Integer total; 

            private Builder() {
            } 

            private Builder(Regions model) {
                this.isOffline = model.isOffline;
                this.isStaging = model.isStaging;
                this.isp = model.isp;
                this.ready = model.ready;
                this.region = model.region;
                this.total = model.total;
            } 

            /**
             * <p>Whether smooth offline is being used.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isOffline(Boolean isOffline) {
                this.isOffline = isOffline;
                return this;
            }

            /**
             * <p>Whether it is a test environment.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isStaging(Boolean isStaging) {
                this.isStaging = isStaging;
                return this;
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
             * <p>The number of ready replicas.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder ready(Integer ready) {
                this.ready = ready;
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
             * <p>The number of replicas that are deployed.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            public Regions build() {
                return new Regions(this);
            } 

        } 

    }
}
