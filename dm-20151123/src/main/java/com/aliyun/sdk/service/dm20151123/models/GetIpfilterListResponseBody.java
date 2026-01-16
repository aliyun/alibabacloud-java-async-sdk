// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20151123.models;

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
 * {@link GetIpfilterListResponseBody} extends {@link TeaModel}
 *
 * <p>GetIpfilterListResponseBody</p>
 */
public class GetIpfilterListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("data")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetIpfilterListResponseBody model) {
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
            this.data = model.data;
        } 

        /**
         * <p>Current page number</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>Number of items per page</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Request ID</p>
         * 
         * <strong>example:</strong>
         * <p>84DD77C7-A091-5139-9530-2D1F7CCE59E0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Total count</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>Data records</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        public GetIpfilterListResponseBody build() {
            return new GetIpfilterListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetIpfilterListResponseBody} extends {@link TeaModel}
     *
     * <p>GetIpfilterListResponseBody</p>
     */
    public static class Ipfilters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("IpAddress")
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

            private Builder() {
            } 

            private Builder(Ipfilters model) {
                this.createTime = model.createTime;
                this.id = model.id;
                this.ipAddress = model.ipAddress;
            } 

            /**
             * <p>timestamp</p>
             * 
             * <strong>example:</strong>
             * <p>1653547140</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>Record ID</p>
             * 
             * <strong>example:</strong>
             * <p>10083</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>IP address/IP range/IP segment</p>
             * 
             * <strong>example:</strong>
             * <p>xxx.xxx.xxx.xxx
             * xxx.xxx.xxx.xxx-xxx.xxx.xxx.xxx
             * xxx.xxx.xxx.xxx/xxx</p>
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
    /**
     * 
     * {@link GetIpfilterListResponseBody} extends {@link TeaModel}
     *
     * <p>GetIpfilterListResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ipfilters")
        private java.util.List<Ipfilters> ipfilters;

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
        public java.util.List<Ipfilters> getIpfilters() {
            return this.ipfilters;
        }

        public static final class Builder {
            private java.util.List<Ipfilters> ipfilters; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.ipfilters = model.ipfilters;
            } 

            /**
             * ipfilters.
             */
            public Builder ipfilters(java.util.List<Ipfilters> ipfilters) {
                this.ipfilters = ipfilters;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
