// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link DescribeSdlStatisticResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSdlStatisticResponseBody</p>
 */
public class DescribeSdlStatisticResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SdlStatisticResp")
    private SdlStatisticResp sdlStatisticResp;

    private DescribeSdlStatisticResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.sdlStatisticResp = builder.sdlStatisticResp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSdlStatisticResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sdlStatisticResp
     */
    public SdlStatisticResp getSdlStatisticResp() {
        return this.sdlStatisticResp;
    }

    public static final class Builder {
        private String requestId; 
        private SdlStatisticResp sdlStatisticResp; 

        private Builder() {
        } 

        private Builder(DescribeSdlStatisticResponseBody model) {
            this.requestId = model.requestId;
            this.sdlStatisticResp = model.sdlStatisticResp;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SdlStatisticResp.
         */
        public Builder sdlStatisticResp(SdlStatisticResp sdlStatisticResp) {
            this.sdlStatisticResp = sdlStatisticResp;
            return this;
        }

        public DescribeSdlStatisticResponseBody build() {
            return new DescribeSdlStatisticResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSdlStatisticResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSdlStatisticResponseBody</p>
     */
    public static class SdlAssetTopList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AssetType")
        private String assetType;

        @com.aliyun.core.annotation.NameInMap("PublicIp")
        private String publicIp;

        @com.aliyun.core.annotation.NameInMap("TrafficBytes")
        private Long trafficBytes;

        private SdlAssetTopList(Builder builder) {
            this.assetType = builder.assetType;
            this.publicIp = builder.publicIp;
            this.trafficBytes = builder.trafficBytes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SdlAssetTopList create() {
            return builder().build();
        }

        /**
         * @return assetType
         */
        public String getAssetType() {
            return this.assetType;
        }

        /**
         * @return publicIp
         */
        public String getPublicIp() {
            return this.publicIp;
        }

        /**
         * @return trafficBytes
         */
        public Long getTrafficBytes() {
            return this.trafficBytes;
        }

        public static final class Builder {
            private String assetType; 
            private String publicIp; 
            private Long trafficBytes; 

            private Builder() {
            } 

            private Builder(SdlAssetTopList model) {
                this.assetType = model.assetType;
                this.publicIp = model.publicIp;
                this.trafficBytes = model.trafficBytes;
            } 

            /**
             * AssetType.
             */
            public Builder assetType(String assetType) {
                this.assetType = assetType;
                return this;
            }

            /**
             * PublicIp.
             */
            public Builder publicIp(String publicIp) {
                this.publicIp = publicIp;
                return this;
            }

            /**
             * TrafficBytes.
             */
            public Builder trafficBytes(Long trafficBytes) {
                this.trafficBytes = trafficBytes;
                return this;
            }

            public SdlAssetTopList build() {
                return new SdlAssetTopList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSdlStatisticResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSdlStatisticResponseBody</p>
     */
    public static class SdlDstTopList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PublicIp")
        private String publicIp;

        @com.aliyun.core.annotation.NameInMap("TrafficBytes")
        private Long trafficBytes;

        private SdlDstTopList(Builder builder) {
            this.publicIp = builder.publicIp;
            this.trafficBytes = builder.trafficBytes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SdlDstTopList create() {
            return builder().build();
        }

        /**
         * @return publicIp
         */
        public String getPublicIp() {
            return this.publicIp;
        }

        /**
         * @return trafficBytes
         */
        public Long getTrafficBytes() {
            return this.trafficBytes;
        }

        public static final class Builder {
            private String publicIp; 
            private Long trafficBytes; 

            private Builder() {
            } 

            private Builder(SdlDstTopList model) {
                this.publicIp = model.publicIp;
                this.trafficBytes = model.trafficBytes;
            } 

            /**
             * PublicIp.
             */
            public Builder publicIp(String publicIp) {
                this.publicIp = publicIp;
                return this;
            }

            /**
             * TrafficBytes.
             */
            public Builder trafficBytes(Long trafficBytes) {
                this.trafficBytes = trafficBytes;
                return this;
            }

            public SdlDstTopList build() {
                return new SdlDstTopList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSdlStatisticResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSdlStatisticResponseBody</p>
     */
    public static class SdlEventTypeCountList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private String count;

        @com.aliyun.core.annotation.NameInMap("EventType")
        private String eventType;

        private SdlEventTypeCountList(Builder builder) {
            this.count = builder.count;
            this.eventType = builder.eventType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SdlEventTypeCountList create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public String getCount() {
            return this.count;
        }

        /**
         * @return eventType
         */
        public String getEventType() {
            return this.eventType;
        }

        public static final class Builder {
            private String count; 
            private String eventType; 

            private Builder() {
            } 

            private Builder(SdlEventTypeCountList model) {
                this.count = model.count;
                this.eventType = model.eventType;
            } 

            /**
             * Count.
             */
            public Builder count(String count) {
                this.count = count;
                return this;
            }

            /**
             * EventType.
             */
            public Builder eventType(String eventType) {
                this.eventType = eventType;
                return this;
            }

            public SdlEventTypeCountList build() {
                return new SdlEventTypeCountList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSdlStatisticResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSdlStatisticResponseBody</p>
     */
    public static class SdlStatisticResp extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SdlAssetTopList")
        private java.util.List<SdlAssetTopList> sdlAssetTopList;

        @com.aliyun.core.annotation.NameInMap("SdlDstTopList")
        private java.util.List<SdlDstTopList> sdlDstTopList;

        @com.aliyun.core.annotation.NameInMap("SdlEventTypeCountList")
        private java.util.List<SdlEventTypeCountList> sdlEventTypeCountList;

        private SdlStatisticResp(Builder builder) {
            this.sdlAssetTopList = builder.sdlAssetTopList;
            this.sdlDstTopList = builder.sdlDstTopList;
            this.sdlEventTypeCountList = builder.sdlEventTypeCountList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SdlStatisticResp create() {
            return builder().build();
        }

        /**
         * @return sdlAssetTopList
         */
        public java.util.List<SdlAssetTopList> getSdlAssetTopList() {
            return this.sdlAssetTopList;
        }

        /**
         * @return sdlDstTopList
         */
        public java.util.List<SdlDstTopList> getSdlDstTopList() {
            return this.sdlDstTopList;
        }

        /**
         * @return sdlEventTypeCountList
         */
        public java.util.List<SdlEventTypeCountList> getSdlEventTypeCountList() {
            return this.sdlEventTypeCountList;
        }

        public static final class Builder {
            private java.util.List<SdlAssetTopList> sdlAssetTopList; 
            private java.util.List<SdlDstTopList> sdlDstTopList; 
            private java.util.List<SdlEventTypeCountList> sdlEventTypeCountList; 

            private Builder() {
            } 

            private Builder(SdlStatisticResp model) {
                this.sdlAssetTopList = model.sdlAssetTopList;
                this.sdlDstTopList = model.sdlDstTopList;
                this.sdlEventTypeCountList = model.sdlEventTypeCountList;
            } 

            /**
             * SdlAssetTopList.
             */
            public Builder sdlAssetTopList(java.util.List<SdlAssetTopList> sdlAssetTopList) {
                this.sdlAssetTopList = sdlAssetTopList;
                return this;
            }

            /**
             * SdlDstTopList.
             */
            public Builder sdlDstTopList(java.util.List<SdlDstTopList> sdlDstTopList) {
                this.sdlDstTopList = sdlDstTopList;
                return this;
            }

            /**
             * SdlEventTypeCountList.
             */
            public Builder sdlEventTypeCountList(java.util.List<SdlEventTypeCountList> sdlEventTypeCountList) {
                this.sdlEventTypeCountList = sdlEventTypeCountList;
                return this;
            }

            public SdlStatisticResp build() {
                return new SdlStatisticResp(this);
            } 

        } 

    }
}
