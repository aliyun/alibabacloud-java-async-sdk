// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAutoCcBlacklistResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAutoCcBlacklistResponseBody</p>
 */
public class DescribeAutoCcBlacklistResponseBody extends TeaModel {
    @NameInMap("AutoCcBlacklist")
    private java.util.List < AutoCcBlacklist> autoCcBlacklist;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Long totalCount;

    private DescribeAutoCcBlacklistResponseBody(Builder builder) {
        this.autoCcBlacklist = builder.autoCcBlacklist;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAutoCcBlacklistResponseBody create() {
        return builder().build();
    }

    /**
     * @return autoCcBlacklist
     */
    public java.util.List < AutoCcBlacklist> getAutoCcBlacklist() {
        return this.autoCcBlacklist;
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
        private java.util.List < AutoCcBlacklist> autoCcBlacklist; 
        private String requestId; 
        private Long totalCount; 

        /**
         * An array that consists of the details of the IP addresses in the blacklist of the instance.
         */
        public Builder autoCcBlacklist(java.util.List < AutoCcBlacklist> autoCcBlacklist) {
            this.autoCcBlacklist = autoCcBlacklist;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of returned IP addresses in the blacklist.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeAutoCcBlacklistResponseBody build() {
            return new DescribeAutoCcBlacklistResponseBody(this);
        } 

    } 

    public static class AutoCcBlacklist extends TeaModel {
        @NameInMap("DestIp")
        private String destIp;

        @NameInMap("EndTime")
        private Long endTime;

        @NameInMap("SourceIp")
        private String sourceIp;

        @NameInMap("Type")
        private String type;

        private AutoCcBlacklist(Builder builder) {
            this.destIp = builder.destIp;
            this.endTime = builder.endTime;
            this.sourceIp = builder.sourceIp;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AutoCcBlacklist create() {
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
             * The IP address of the instance.
             */
            public Builder destIp(String destIp) {
                this.destIp = destIp;
                return this;
            }

            /**
             * The validity period of the IP address in the blacklist. The value is a UNIX timestamp. Unit: seconds.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * The IP address in the blacklist.
             */
            public Builder sourceIp(String sourceIp) {
                this.sourceIp = sourceIp;
                return this;
            }

            /**
             * The mode of how the IP address is added to the blacklist. Valid values:
             * <p>
             * 
             * *   **manual**: manually added
             * *   **auto**: automatically added
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public AutoCcBlacklist build() {
                return new AutoCcBlacklist(this);
            } 

        } 

    }
}
