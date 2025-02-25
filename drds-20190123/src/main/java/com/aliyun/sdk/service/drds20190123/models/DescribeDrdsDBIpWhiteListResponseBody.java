// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDrdsDBIpWhiteListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDrdsDBIpWhiteListResponseBody</p>
 */
public class DescribeDrdsDBIpWhiteListResponseBody extends TeaModel {
    @NameInMap("IpWhiteList")
    private IpWhiteList ipWhiteList;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private DescribeDrdsDBIpWhiteListResponseBody(Builder builder) {
        this.ipWhiteList = builder.ipWhiteList;
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
     * @return ipWhiteList
     */
    public IpWhiteList getIpWhiteList() {
        return this.ipWhiteList;
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
        private IpWhiteList ipWhiteList; 
        private String requestId; 
        private Boolean success; 

        /**
         * The IP address whitelist.
         */
        public Builder ipWhiteList(IpWhiteList ipWhiteList) {
            this.ipWhiteList = ipWhiteList;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request is successful.
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
        @NameInMap("Ip")
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
}
