// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ons20190214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OnsRegionListResponseBody} extends {@link TeaModel}
 *
 * <p>OnsRegionListResponseBody</p>
 */
public class OnsRegionListResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    private OnsRegionListResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OnsRegionListResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * The information about the message that is queried.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The ID of the request. This parameter is a common parameter. Each request has a unique ID. You can use this ID to troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public OnsRegionListResponseBody build() {
            return new OnsRegionListResponseBody(this);
        } 

    } 

    public static class RegionDo extends TeaModel {
        @NameInMap("OnsRegionId")
        private String onsRegionId;

        @NameInMap("RegionName")
        private String regionName;

        private RegionDo(Builder builder) {
            this.onsRegionId = builder.onsRegionId;
            this.regionName = builder.regionName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RegionDo create() {
            return builder().build();
        }

        /**
         * @return onsRegionId
         */
        public String getOnsRegionId() {
            return this.onsRegionId;
        }

        /**
         * @return regionName
         */
        public String getRegionName() {
            return this.regionName;
        }

        public static final class Builder {
            private String onsRegionId; 
            private String regionName; 

            /**
             * The ID of the region.
             */
            public Builder onsRegionId(String onsRegionId) {
                this.onsRegionId = onsRegionId;
                return this;
            }

            /**
             * The ID of the region.
             */
            public Builder regionName(String regionName) {
                this.regionName = regionName;
                return this;
            }

            public RegionDo build() {
                return new RegionDo(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("RegionDo")
        private java.util.List < RegionDo> regionDo;

        private Data(Builder builder) {
            this.regionDo = builder.regionDo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return regionDo
         */
        public java.util.List < RegionDo> getRegionDo() {
            return this.regionDo;
        }

        public static final class Builder {
            private java.util.List < RegionDo> regionDo; 

            /**
             * RegionDo.
             */
            public Builder regionDo(java.util.List < RegionDo> regionDo) {
                this.regionDo = regionDo;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
