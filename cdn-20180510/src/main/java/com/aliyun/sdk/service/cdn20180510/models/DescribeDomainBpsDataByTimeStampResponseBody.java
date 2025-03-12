// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

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
 * {@link DescribeDomainBpsDataByTimeStampResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDomainBpsDataByTimeStampResponseBody</p>
 */
public class DescribeDomainBpsDataByTimeStampResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BpsDataList")
    private BpsDataList bpsDataList;

    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TimeStamp")
    private String timeStamp;

    private DescribeDomainBpsDataByTimeStampResponseBody(Builder builder) {
        this.bpsDataList = builder.bpsDataList;
        this.domainName = builder.domainName;
        this.requestId = builder.requestId;
        this.timeStamp = builder.timeStamp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainBpsDataByTimeStampResponseBody create() {
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
         * <p>A list of bandwidth values by ISP and region.</p>
         */
        public Builder bpsDataList(BpsDataList bpsDataList) {
            this.bpsDataList = bpsDataList;
            return this;
        }

        /**
         * <p>The accelerated domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder domainName(String domainName) {
            this.domainName = domainName;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>16A96B9A-F203-4EC5-8E43-CB92E68F4CD8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The point in time.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-11-30T05:40:00Z</p>
         */
        public Builder timeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }

        public DescribeDomainBpsDataByTimeStampResponseBody build() {
            return new DescribeDomainBpsDataByTimeStampResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDomainBpsDataByTimeStampResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDomainBpsDataByTimeStampResponseBody</p>
     */
    public static class BpsDataModel extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bps")
        private Long bps;

        @com.aliyun.core.annotation.NameInMap("IspName")
        private String ispName;

        @com.aliyun.core.annotation.NameInMap("LocationName")
        private String locationName;

        @com.aliyun.core.annotation.NameInMap("TimeStamp")
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
             * <p>The bandwidth value.</p>
             * 
             * <strong>example:</strong>
             * <p>52119553</p>
             */
            public Builder bps(Long bps) {
                this.bps = bps;
                return this;
            }

            /**
             * <p>The name of the ISP.</p>
             * 
             * <strong>example:</strong>
             * <p>unicom</p>
             */
            public Builder ispName(String ispName) {
                this.ispName = ispName;
                return this;
            }

            /**
             * <p>The name of the region.</p>
             * 
             * <strong>example:</strong>
             * <p>Liaoning</p>
             */
            public Builder locationName(String locationName) {
                this.locationName = locationName;
                return this;
            }

            /**
             * <p>The timestamp of the data returned.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-11-30T05:40:00Z</p>
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
    /**
     * 
     * {@link DescribeDomainBpsDataByTimeStampResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDomainBpsDataByTimeStampResponseBody</p>
     */
    public static class BpsDataList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BpsDataModel")
        private java.util.List<BpsDataModel> bpsDataModel;

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
        public java.util.List<BpsDataModel> getBpsDataModel() {
            return this.bpsDataModel;
        }

        public static final class Builder {
            private java.util.List<BpsDataModel> bpsDataModel; 

            /**
             * BpsDataModel.
             */
            public Builder bpsDataModel(java.util.List<BpsDataModel> bpsDataModel) {
                this.bpsDataModel = bpsDataModel;
                return this;
            }

            public BpsDataList build() {
                return new BpsDataList(this);
            } 

        } 

    }
}
