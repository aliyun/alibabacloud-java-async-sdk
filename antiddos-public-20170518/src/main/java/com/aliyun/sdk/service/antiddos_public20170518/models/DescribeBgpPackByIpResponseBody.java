// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.antiddos_public20170518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBgpPackByIpResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBgpPackByIpResponseBody</p>
 */
public class DescribeBgpPackByIpResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("DdosbgpInfo")
    private DdosbgpInfo ddosbgpInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeBgpPackByIpResponseBody(Builder builder) {
        this.code = builder.code;
        this.ddosbgpInfo = builder.ddosbgpInfo;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBgpPackByIpResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return ddosbgpInfo
     */
    public DdosbgpInfo getDdosbgpInfo() {
        return this.ddosbgpInfo;
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
        private Integer code; 
        private DdosbgpInfo ddosbgpInfo; 
        private String requestId; 
        private Boolean success; 

        /**
         * The HTTP status code of the request.
         * <p>
         * 
         * For more information about status codes, see [Common parameters](~~118841~~).
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The configurations of the instance that is associated with the asset.
         */
        public Builder ddosbgpInfo(DdosbgpInfo ddosbgpInfo) {
            this.ddosbgpInfo = ddosbgpInfo;
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
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   **true**: yes
         * *   **false**: no
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeBgpPackByIpResponseBody build() {
            return new DescribeBgpPackByIpResponseBody(this);
        } 

    } 

    public static class DdosbgpInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BaseThreshold")
        private Integer baseThreshold;

        @com.aliyun.core.annotation.NameInMap("DdosbgpInstanceId")
        private String ddosbgpInstanceId;

        @com.aliyun.core.annotation.NameInMap("ElasticThreshold")
        private Integer elasticThreshold;

        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private Long expireTime;

        @com.aliyun.core.annotation.NameInMap("Ip")
        private String ip;

        private DdosbgpInfo(Builder builder) {
            this.baseThreshold = builder.baseThreshold;
            this.ddosbgpInstanceId = builder.ddosbgpInstanceId;
            this.elasticThreshold = builder.elasticThreshold;
            this.expireTime = builder.expireTime;
            this.ip = builder.ip;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DdosbgpInfo create() {
            return builder().build();
        }

        /**
         * @return baseThreshold
         */
        public Integer getBaseThreshold() {
            return this.baseThreshold;
        }

        /**
         * @return ddosbgpInstanceId
         */
        public String getDdosbgpInstanceId() {
            return this.ddosbgpInstanceId;
        }

        /**
         * @return elasticThreshold
         */
        public Integer getElasticThreshold() {
            return this.elasticThreshold;
        }

        /**
         * @return expireTime
         */
        public Long getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        public static final class Builder {
            private Integer baseThreshold; 
            private String ddosbgpInstanceId; 
            private Integer elasticThreshold; 
            private Long expireTime; 
            private String ip; 

            /**
             * The basic protection threshold of the instance. Unit: Gbit/s.
             */
            public Builder baseThreshold(Integer baseThreshold) {
                this.baseThreshold = baseThreshold;
                return this;
            }

            /**
             * The ID of the instance.
             */
            public Builder ddosbgpInstanceId(String ddosbgpInstanceId) {
                this.ddosbgpInstanceId = ddosbgpInstanceId;
                return this;
            }

            /**
             * The burstable protection threshold of the instance. Unit: Gbit/s.
             */
            public Builder elasticThreshold(Integer elasticThreshold) {
                this.elasticThreshold = elasticThreshold;
                return this;
            }

            /**
             * The expiration time of the instance. The value is a UNIX timestamp. Unit: milliseconds.
             */
            public Builder expireTime(Long expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * The IP address of the asset.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            public DdosbgpInfo build() {
                return new DdosbgpInfo(this);
            } 

        } 

    }
}
