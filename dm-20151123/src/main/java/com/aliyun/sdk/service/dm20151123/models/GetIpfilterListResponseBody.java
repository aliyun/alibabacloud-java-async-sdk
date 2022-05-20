// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20151123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetIpfilterListResponseBody} extends {@link TeaModel}
 *
 * <p>GetIpfilterListResponseBody</p>
 */
public class GetIpfilterListResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    @NameInMap("data")
    private Data data;

    private GetIpfilterListResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.data = builder.data;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetIpfilterListResponseBody create() {
        return builder().build();
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
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
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 
        private Data data; 

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
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
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        public GetIpfilterListResponseBody build() {
            return new GetIpfilterListResponseBody(this);
        } 

    } 

    public static class Ipfilters extends TeaModel {
        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("Id")
        private String id;

        @NameInMap("IpAddress")
        private String ipAddress;

        private Ipfilters(Builder builder) {
            this.createTime = builder.createTime;
            this.id = builder.id;
            this.ipAddress = builder.ipAddress;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Ipfilters create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return ipAddress
         */
        public String getIpAddress() {
            return this.ipAddress;
        }

        public static final class Builder {
            private String createTime; 
            private String id; 
            private String ipAddress; 

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * IpAddress.
             */
            public Builder ipAddress(String ipAddress) {
                this.ipAddress = ipAddress;
                return this;
            }

            public Ipfilters build() {
                return new Ipfilters(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("ipfilters")
        private java.util.List < Ipfilters> ipfilters;

        private Data(Builder builder) {
            this.ipfilters = builder.ipfilters;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return ipfilters
         */
        public java.util.List < Ipfilters> getIpfilters() {
            return this.ipfilters;
        }

        public static final class Builder {
            private java.util.List < Ipfilters> ipfilters; 

            /**
             * ipfilters.
             */
            public Builder ipfilters(java.util.List < Ipfilters> ipfilters) {
                this.ipfilters = ipfilters;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
