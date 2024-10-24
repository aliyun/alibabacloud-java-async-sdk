// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeAutoCcWhitelistResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAutoCcWhitelistResponseBody</p>
 */
public class DescribeAutoCcWhitelistResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AutoCcWhitelist")
    private java.util.List < AutoCcWhitelist> autoCcWhitelist;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private DescribeAutoCcWhitelistResponseBody(Builder builder) {
        this.autoCcWhitelist = builder.autoCcWhitelist;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAutoCcWhitelistResponseBody create() {
        return builder().build();
    }

    /**
     * @return autoCcWhitelist
     */
    public java.util.List < AutoCcWhitelist> getAutoCcWhitelist() {
        return this.autoCcWhitelist;
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
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < AutoCcWhitelist> autoCcWhitelist; 
        private String requestId; 
        private Long totalCount; 

        /**
         * <p>An array that consists of details of the IP address in the whitelist of the instance.</p>
         */
        public Builder autoCcWhitelist(java.util.List < AutoCcWhitelist> autoCcWhitelist) {
            this.autoCcWhitelist = autoCcWhitelist;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>F09D085E-5E0F-4FF2-B32E-F4A644049162</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of returned IP addresses in the whitelist.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeAutoCcWhitelistResponseBody build() {
            return new DescribeAutoCcWhitelistResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAutoCcWhitelistResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAutoCcWhitelistResponseBody</p>
     */
    public static class AutoCcWhitelist extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DestIp")
        private String destIp;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("SourceIp")
        private String sourceIp;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private AutoCcWhitelist(Builder builder) {
            this.destIp = builder.destIp;
            this.endTime = builder.endTime;
            this.sourceIp = builder.sourceIp;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AutoCcWhitelist create() {
            return builder().build();
        }

        /**
         * @return destIp
         */
        public String getDestIp() {
            return this.destIp;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return sourceIp
         */
        public String getSourceIp() {
            return this.sourceIp;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String destIp; 
            private Long endTime; 
            private String sourceIp; 
            private String type; 

            /**
             * <p>The IP address of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>203.<em><strong>.</strong></em>.117</p>
             */
            public Builder destIp(String destIp) {
                this.destIp = destIp;
                return this;
            }

            /**
             * <p>The validity period of the IP address in the whitelist. Unit: seconds. <strong>0</strong> indicates that the IP address in the whitelist never expires.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The IP addresses that is contained in the IP address whitelist.</p>
             * 
             * <strong>example:</strong>
             * <p>2.2.2.2</p>
             */
            public Builder sourceIp(String sourceIp) {
                this.sourceIp = sourceIp;
                return this;
            }

            /**
             * <p>The mode of how an IP address is added to the whitelist. Valid values:</p>
             * <ul>
             * <li><strong>manual</strong>: manually added</li>
             * <li><strong>auto</strong>: automatically added</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>manual</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public AutoCcWhitelist build() {
                return new AutoCcWhitelist(this);
            } 

        } 

    }
}
