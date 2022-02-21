// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAutoCcWhitelistResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAutoCcWhitelistResponseBody</p>
 */
public class DescribeAutoCcWhitelistResponseBody extends TeaModel {
    @NameInMap("AutoCcWhitelist")
    private java.util.List < AutoCcWhitelist> autoCcWhitelist;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
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
         * AutoCcWhitelist.
         */
        public Builder autoCcWhitelist(java.util.List < AutoCcWhitelist> autoCcWhitelist) {
            this.autoCcWhitelist = autoCcWhitelist;
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
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeAutoCcWhitelistResponseBody build() {
            return new DescribeAutoCcWhitelistResponseBody(this);
        } 

    } 

    public static class AutoCcWhitelist extends TeaModel {
        @NameInMap("DestIp")
        private String destIp;

        @NameInMap("EndTime")
        private Long endTime;

        @NameInMap("SourceIp")
        private String sourceIp;

        @NameInMap("Type")
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
             * DestIp.
             */
            public Builder destIp(String destIp) {
                this.destIp = destIp;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * SourceIp.
             */
            public Builder sourceIp(String sourceIp) {
                this.sourceIp = sourceIp;
                return this;
            }

            /**
             * Type.
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
