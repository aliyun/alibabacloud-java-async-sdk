// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20151123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRegionListResponseBody} extends {@link TeaModel}
 *
 * <p>GetRegionListResponseBody</p>
 */
public class GetRegionListResponseBody extends TeaModel {
    @NameInMap("PageNo")
    private Integer pageNo;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Total")
    private Integer total;

    @NameInMap("data")
    private Data data;

    private GetRegionListResponseBody(Builder builder) {
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.total = builder.total;
        this.data = builder.data;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRegionListResponseBody create() {
        return builder().build();
    }

    /**
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    public static final class Builder {
        private Integer pageNo; 
        private Integer pageSize; 
        private String requestId; 
        private Integer total; 
        private Data data; 

        /**
         * PageNo.
         */
        public Builder pageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * Total.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        public GetRegionListResponseBody build() {
            return new GetRegionListResponseBody(this);
        } 

    } 

    public static class RegionList extends TeaModel {
        @NameInMap("Region")
        private String region;

        @NameInMap("RegionDesc")
        private String regionDesc;

        private RegionList(Builder builder) {
            this.region = builder.region;
            this.regionDesc = builder.regionDesc;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RegionList create() {
            return builder().build();
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return regionDesc
         */
        public String getRegionDesc() {
            return this.regionDesc;
        }

        public static final class Builder {
            private String region; 
            private String regionDesc; 

            /**
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * RegionDesc.
             */
            public Builder regionDesc(String regionDesc) {
                this.regionDesc = regionDesc;
                return this;
            }

            public RegionList build() {
                return new RegionList(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("regionList")
        private java.util.List < RegionList> regionList;

        private Data(Builder builder) {
            this.regionList = builder.regionList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return regionList
         */
        public java.util.List < RegionList> getRegionList() {
            return this.regionList;
        }

        public static final class Builder {
            private java.util.List < RegionList> regionList; 

            /**
             * regionList.
             */
            public Builder regionList(java.util.List < RegionList> regionList) {
                this.regionList = regionList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
