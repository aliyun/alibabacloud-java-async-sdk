// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.antiddos_public20170518.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeBgpPackByIpResponseBody model) {
            this.code = model.code;
            this.ddosbgpInfo = model.ddosbgpInfo;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The HTTP status code of the request.</p>
         * <p>For more information about status codes, see <a href="https://help.aliyun.com/document_detail/118841.html">Common parameters</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The configurations of the instance that is associated with the asset.</p>
         */
        public Builder ddosbgpInfo(DdosbgpInfo ddosbgpInfo) {
            this.ddosbgpInfo = ddosbgpInfo;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>E46A08E4-A1CD-5BE9-B580-C4D6E9BC5484</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: yes</li>
         * <li><strong>false</strong>: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeBgpPackByIpResponseBody build() {
            return new DescribeBgpPackByIpResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeBgpPackByIpResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBgpPackByIpResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(DdosbgpInfo model) {
                this.baseThreshold = model.baseThreshold;
                this.ddosbgpInstanceId = model.ddosbgpInstanceId;
                this.elasticThreshold = model.elasticThreshold;
                this.expireTime = model.expireTime;
                this.ip = model.ip;
            } 

            /**
             * <p>The basic protection threshold of the instance. Unit: Gbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder baseThreshold(Integer baseThreshold) {
                this.baseThreshold = baseThreshold;
                return this;
            }

            /**
             * <p>The ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>ddosbgp-cn-n6w1r7nz****</p>
             */
            public Builder ddosbgpInstanceId(String ddosbgpInstanceId) {
                this.ddosbgpInstanceId = ddosbgpInstanceId;
                return this;
            }

            /**
             * <p>The burstable protection threshold of the instance. Unit: Gbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>301</p>
             */
            public Builder elasticThreshold(Integer elasticThreshold) {
                this.elasticThreshold = elasticThreshold;
                return this;
            }

            /**
             * <p>The expiration time of the instance. The value is a UNIX timestamp. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1640448000000</p>
             */
            public Builder expireTime(Long expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * <p>The IP address of the asset.</p>
             * 
             * <strong>example:</strong>
             * <p>118.31.XX.XX</p>
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
