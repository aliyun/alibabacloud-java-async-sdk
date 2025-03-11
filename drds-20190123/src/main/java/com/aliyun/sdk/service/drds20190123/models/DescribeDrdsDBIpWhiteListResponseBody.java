// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

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
 * {@link DescribeDrdsDBIpWhiteListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDrdsDBIpWhiteListResponseBody</p>
 */
public class DescribeDrdsDBIpWhiteListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("IpWhiteList")
    private IpWhiteList ipWhiteList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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
         * <p>The IP address whitelist.</p>
         */
        public Builder ipWhiteList(IpWhiteList ipWhiteList) {
            this.ipWhiteList = ipWhiteList;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>017453B9-0001-4745-87BF-DD612D850ED0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeDrdsDBIpWhiteListResponseBody build() {
            return new DescribeDrdsDBIpWhiteListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDrdsDBIpWhiteListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDrdsDBIpWhiteListResponseBody</p>
     */
    public static class IpWhiteList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Ip")
        private java.util.List<String> ip;

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
        public java.util.List<String> getIp() {
            return this.ip;
        }

        public static final class Builder {
            private java.util.List<String> ip; 

            /**
             * Ip.
             */
            public Builder ip(java.util.List<String> ip) {
                this.ip = ip;
                return this;
            }

            public IpWhiteList build() {
                return new IpWhiteList(this);
            } 

        } 

    }
}
