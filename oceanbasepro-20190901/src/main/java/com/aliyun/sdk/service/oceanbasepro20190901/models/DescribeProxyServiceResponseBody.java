// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

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
 * {@link DescribeProxyServiceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeProxyServiceResponseBody</p>
 */
public class DescribeProxyServiceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeProxyServiceResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeProxyServiceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeProxyServiceResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

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

        public DescribeProxyServiceResponseBody build() {
            return new DescribeProxyServiceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeProxyServiceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeProxyServiceResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("CurrentEndpointNum")
        private Long currentEndpointNum;

        @com.aliyun.core.annotation.NameInMap("EndpointNumQuota")
        private Long endpointNumQuota;

        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private String expireTime;

        @com.aliyun.core.annotation.NameInMap("ProxyClusterId")
        private String proxyClusterId;

        @com.aliyun.core.annotation.NameInMap("ProxyMode")
        private String proxyMode;

        @com.aliyun.core.annotation.NameInMap("ProxyServiceVersion")
        private String proxyServiceVersion;

        @com.aliyun.core.annotation.NameInMap("ProxyVersion")
        private String proxyVersion;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UnitNum")
        private Long unitNum;

        @com.aliyun.core.annotation.NameInMap("UnitNumLimit")
        private Long unitNumLimit;

        @com.aliyun.core.annotation.NameInMap("UnitSpec")
        private String unitSpec;

        @com.aliyun.core.annotation.NameInMap("Zone")
        private String zone;

        private Data(Builder builder) {
            this.createTime = builder.createTime;
            this.currentEndpointNum = builder.currentEndpointNum;
            this.endpointNumQuota = builder.endpointNumQuota;
            this.expireTime = builder.expireTime;
            this.proxyClusterId = builder.proxyClusterId;
            this.proxyMode = builder.proxyMode;
            this.proxyServiceVersion = builder.proxyServiceVersion;
            this.proxyVersion = builder.proxyVersion;
            this.status = builder.status;
            this.unitNum = builder.unitNum;
            this.unitNumLimit = builder.unitNumLimit;
            this.unitSpec = builder.unitSpec;
            this.zone = builder.zone;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return currentEndpointNum
         */
        public Long getCurrentEndpointNum() {
            return this.currentEndpointNum;
        }

        /**
         * @return endpointNumQuota
         */
        public Long getEndpointNumQuota() {
            return this.endpointNumQuota;
        }

        /**
         * @return expireTime
         */
        public String getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return proxyClusterId
         */
        public String getProxyClusterId() {
            return this.proxyClusterId;
        }

        /**
         * @return proxyMode
         */
        public String getProxyMode() {
            return this.proxyMode;
        }

        /**
         * @return proxyServiceVersion
         */
        public String getProxyServiceVersion() {
            return this.proxyServiceVersion;
        }

        /**
         * @return proxyVersion
         */
        public String getProxyVersion() {
            return this.proxyVersion;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return unitNum
         */
        public Long getUnitNum() {
            return this.unitNum;
        }

        /**
         * @return unitNumLimit
         */
        public Long getUnitNumLimit() {
            return this.unitNumLimit;
        }

        /**
         * @return unitSpec
         */
        public String getUnitSpec() {
            return this.unitSpec;
        }

        /**
         * @return zone
         */
        public String getZone() {
            return this.zone;
        }

        public static final class Builder {
            private String createTime; 
            private Long currentEndpointNum; 
            private Long endpointNumQuota; 
            private String expireTime; 
            private String proxyClusterId; 
            private String proxyMode; 
            private String proxyServiceVersion; 
            private String proxyVersion; 
            private String status; 
            private Long unitNum; 
            private Long unitNumLimit; 
            private String unitSpec; 
            private String zone; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.createTime = model.createTime;
                this.currentEndpointNum = model.currentEndpointNum;
                this.endpointNumQuota = model.endpointNumQuota;
                this.expireTime = model.expireTime;
                this.proxyClusterId = model.proxyClusterId;
                this.proxyMode = model.proxyMode;
                this.proxyServiceVersion = model.proxyServiceVersion;
                this.proxyVersion = model.proxyVersion;
                this.status = model.status;
                this.unitNum = model.unitNum;
                this.unitNumLimit = model.unitNumLimit;
                this.unitSpec = model.unitSpec;
                this.zone = model.zone;
            } 

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * CurrentEndpointNum.
             */
            public Builder currentEndpointNum(Long currentEndpointNum) {
                this.currentEndpointNum = currentEndpointNum;
                return this;
            }

            /**
             * EndpointNumQuota.
             */
            public Builder endpointNumQuota(Long endpointNumQuota) {
                this.endpointNumQuota = endpointNumQuota;
                return this;
            }

            /**
             * ExpireTime.
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * ProxyClusterId.
             */
            public Builder proxyClusterId(String proxyClusterId) {
                this.proxyClusterId = proxyClusterId;
                return this;
            }

            /**
             * ProxyMode.
             */
            public Builder proxyMode(String proxyMode) {
                this.proxyMode = proxyMode;
                return this;
            }

            /**
             * ProxyServiceVersion.
             */
            public Builder proxyServiceVersion(String proxyServiceVersion) {
                this.proxyServiceVersion = proxyServiceVersion;
                return this;
            }

            /**
             * ProxyVersion.
             */
            public Builder proxyVersion(String proxyVersion) {
                this.proxyVersion = proxyVersion;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * UnitNum.
             */
            public Builder unitNum(Long unitNum) {
                this.unitNum = unitNum;
                return this;
            }

            /**
             * UnitNumLimit.
             */
            public Builder unitNumLimit(Long unitNumLimit) {
                this.unitNumLimit = unitNumLimit;
                return this;
            }

            /**
             * UnitSpec.
             */
            public Builder unitSpec(String unitSpec) {
                this.unitSpec = unitSpec;
                return this;
            }

            /**
             * Zone.
             */
            public Builder zone(String zone) {
                this.zone = zone;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
