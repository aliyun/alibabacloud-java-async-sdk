// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20171016.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDrdsDBIpWhiteListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDrdsDBIpWhiteListResponseBody</p>
 */
public class DescribeDrdsDBIpWhiteListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeDrdsDBIpWhiteListResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDrdsDBIpWhiteListResponseBody create() {
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 
        private Boolean success; 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeDrdsDBIpWhiteListResponseBody build() {
            return new DescribeDrdsDBIpWhiteListResponseBody(this);
        } 

    } 

    public static class IpWhiteList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Ip")
        private java.util.List < String > ip;

        private IpWhiteList(Builder builder) {
            this.ip = builder.ip;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IpWhiteList create() {
            return builder().build();
        }

        /**
         * @return ip
         */
        public java.util.List < String > getIp() {
            return this.ip;
        }

        public static final class Builder {
            private java.util.List < String > ip; 

            /**
             * Ip.
             */
            public Builder ip(java.util.List < String > ip) {
                this.ip = ip;
                return this;
            }

            public IpWhiteList build() {
                return new IpWhiteList(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IpWhiteList")
        private IpWhiteList ipWhiteList;

        private Data(Builder builder) {
            this.ipWhiteList = builder.ipWhiteList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return ipWhiteList
         */
        public IpWhiteList getIpWhiteList() {
            return this.ipWhiteList;
        }

        public static final class Builder {
            private IpWhiteList ipWhiteList; 

            /**
             * IpWhiteList.
             */
            public Builder ipWhiteList(IpWhiteList ipWhiteList) {
                this.ipWhiteList = ipWhiteList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
