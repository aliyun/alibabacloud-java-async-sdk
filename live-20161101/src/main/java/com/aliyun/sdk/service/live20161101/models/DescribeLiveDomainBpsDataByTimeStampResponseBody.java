// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLiveDomainBpsDataByTimeStampResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveDomainBpsDataByTimeStampResponseBody</p>
 */
public class DescribeLiveDomainBpsDataByTimeStampResponseBody extends TeaModel {
    @NameInMap("BpsDataList")
    private BpsDataList bpsDataList;

    @NameInMap("DomainName")
    private String domainName;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TimeStamp")
    private String timeStamp;

    private DescribeLiveDomainBpsDataByTimeStampResponseBody(Builder builder) {
        this.bpsDataList = builder.bpsDataList;
        this.domainName = builder.domainName;
        this.requestId = builder.requestId;
        this.timeStamp = builder.timeStamp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLiveDomainBpsDataByTimeStampResponseBody create() {
        return builder().build();
    }

    /**
     * @return bpsDataList
     */
    public BpsDataList getBpsDataList() {
        return this.bpsDataList;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return timeStamp
     */
    public String getTimeStamp() {
        return this.timeStamp;
    }

    public static final class Builder {
        private BpsDataList bpsDataList; 
        private String domainName; 
        private String requestId; 
        private String timeStamp; 

        /**
         * BpsDataList.
         */
        public Builder bpsDataList(BpsDataList bpsDataList) {
            this.bpsDataList = bpsDataList;
            return this;
        }

        /**
         * DomainName.
         */
        public Builder domainName(String domainName) {
            this.domainName = domainName;
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
         * TimeStamp.
         */
        public Builder timeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }

        public DescribeLiveDomainBpsDataByTimeStampResponseBody build() {
            return new DescribeLiveDomainBpsDataByTimeStampResponseBody(this);
        } 

    } 

    public static class BpsDataModel extends TeaModel {
        @NameInMap("Bps")
        private Long bps;

        @NameInMap("IspName")
        private String ispName;

        @NameInMap("LocationName")
        private String locationName;

        @NameInMap("TimeStamp")
        private String timeStamp;

        private BpsDataModel(Builder builder) {
            this.bps = builder.bps;
            this.ispName = builder.ispName;
            this.locationName = builder.locationName;
            this.timeStamp = builder.timeStamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BpsDataModel create() {
            return builder().build();
        }

        /**
         * @return bps
         */
        public Long getBps() {
            return this.bps;
        }

        /**
         * @return ispName
         */
        public String getIspName() {
            return this.ispName;
        }

        /**
         * @return locationName
         */
        public String getLocationName() {
            return this.locationName;
        }

        /**
         * @return timeStamp
         */
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public static final class Builder {
            private Long bps; 
            private String ispName; 
            private String locationName; 
            private String timeStamp; 

            /**
             * Bps.
             */
            public Builder bps(Long bps) {
                this.bps = bps;
                return this;
            }

            /**
             * IspName.
             */
            public Builder ispName(String ispName) {
                this.ispName = ispName;
                return this;
            }

            /**
             * LocationName.
             */
            public Builder locationName(String locationName) {
                this.locationName = locationName;
                return this;
            }

            /**
             * TimeStamp.
             */
            public Builder timeStamp(String timeStamp) {
                this.timeStamp = timeStamp;
                return this;
            }

            public BpsDataModel build() {
                return new BpsDataModel(this);
            } 

        } 

    }
    public static class BpsDataList extends TeaModel {
        @NameInMap("BpsDataModel")
        private java.util.List < BpsDataModel> bpsDataModel;

        private BpsDataList(Builder builder) {
            this.bpsDataModel = builder.bpsDataModel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BpsDataList create() {
            return builder().build();
        }

        /**
         * @return bpsDataModel
         */
        public java.util.List < BpsDataModel> getBpsDataModel() {
            return this.bpsDataModel;
        }

        public static final class Builder {
            private java.util.List < BpsDataModel> bpsDataModel; 

            /**
             * BpsDataModel.
             */
            public Builder bpsDataModel(java.util.List < BpsDataModel> bpsDataModel) {
                this.bpsDataModel = bpsDataModel;
                return this;
            }

            public BpsDataList build() {
                return new BpsDataList(this);
            } 

        } 

    }
}
