// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

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
 * {@link DescribeAutoCcBlacklistResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAutoCcBlacklistResponseBody</p>
 */
public class DescribeAutoCcBlacklistResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AutoCcBlacklist")
    private java.util.List<AutoCcBlacklist> autoCcBlacklist;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoCcBlacklist
     */
    public java.util.List<AutoCcBlacklist> getAutoCcBlacklist() {
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
        private java.util.List<AutoCcBlacklist> autoCcBlacklist; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(DescribeAutoCcBlacklistResponseBody model) {
            this.autoCcBlacklist = model.autoCcBlacklist;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>An array that consists of the details of the IP addresses in the blacklist of the instance.</p>
         */
        public Builder autoCcBlacklist(java.util.List<AutoCcBlacklist> autoCcBlacklist) {
            this.autoCcBlacklist = autoCcBlacklist;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>E78C8472-0B15-42D5-AF22-A32A78818AB2</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of returned IP addresses in the blacklist.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeAutoCcBlacklistResponseBody build() {
            return new DescribeAutoCcBlacklistResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAutoCcBlacklistResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAutoCcBlacklistResponseBody</p>
     */
    public static class AutoCcBlacklist extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DestIp")
        private String destIp;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("SourceIp")
        private String sourceIp;

        @com.aliyun.core.annotation.NameInMap("Type")
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

            private Builder() {
            } 

            private Builder(AutoCcBlacklist model) {
                this.destIp = model.destIp;
                this.endTime = model.endTime;
                this.sourceIp = model.sourceIp;
                this.type = model.type;
            } 

            /**
             * <p>The IP address of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>192.0.XX.XX</p>
             */
            public Builder destIp(String destIp) {
                this.destIp = destIp;
                return this;
            }

            /**
             * <p>The validity period of the IP address in the blacklist. The value is a UNIX timestamp. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1584093569</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The IP address in the blacklist.</p>
             * 
             * <strong>example:</strong>
             * <p>47.100.XX.XX</p>
             */
            public Builder sourceIp(String sourceIp) {
                this.sourceIp = sourceIp;
                return this;
            }

            /**
             * <p>The mode of how the IP address is added to the blacklist. Valid values:</p>
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

            public AutoCcBlacklist build() {
                return new AutoCcBlacklist(this);
            } 

        } 

    }
}
