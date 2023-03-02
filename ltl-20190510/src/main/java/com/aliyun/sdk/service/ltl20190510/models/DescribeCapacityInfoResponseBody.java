// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ltl20190510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCapacityInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCapacityInfoResponseBody</p>
 */
public class DescribeCapacityInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private DescribeCapacityInfoResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCapacityInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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

        public DescribeCapacityInfoResponseBody build() {
            return new DescribeCapacityInfoResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("CapacityQuota")
        private Long capacityQuota;

        @NameInMap("CountQuota")
        private Long countQuota;

        @NameInMap("MemberUsedCapacity")
        private Long memberUsedCapacity;

        @NameInMap("MemberUsedCount")
        private Long memberUsedCount;

        @NameInMap("UsedCapacity")
        private Long usedCapacity;

        @NameInMap("UsedCount")
        private Long usedCount;

        private Data(Builder builder) {
            this.capacityQuota = builder.capacityQuota;
            this.countQuota = builder.countQuota;
            this.memberUsedCapacity = builder.memberUsedCapacity;
            this.memberUsedCount = builder.memberUsedCount;
            this.usedCapacity = builder.usedCapacity;
            this.usedCount = builder.usedCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return capacityQuota
         */
        public Long getCapacityQuota() {
            return this.capacityQuota;
        }

        /**
         * @return countQuota
         */
        public Long getCountQuota() {
            return this.countQuota;
        }

        /**
         * @return memberUsedCapacity
         */
        public Long getMemberUsedCapacity() {
            return this.memberUsedCapacity;
        }

        /**
         * @return memberUsedCount
         */
        public Long getMemberUsedCount() {
            return this.memberUsedCount;
        }

        /**
         * @return usedCapacity
         */
        public Long getUsedCapacity() {
            return this.usedCapacity;
        }

        /**
         * @return usedCount
         */
        public Long getUsedCount() {
            return this.usedCount;
        }

        public static final class Builder {
            private Long capacityQuota; 
            private Long countQuota; 
            private Long memberUsedCapacity; 
            private Long memberUsedCount; 
            private Long usedCapacity; 
            private Long usedCount; 

            /**
             * CapacityQuota.
             */
            public Builder capacityQuota(Long capacityQuota) {
                this.capacityQuota = capacityQuota;
                return this;
            }

            /**
             * CountQuota.
             */
            public Builder countQuota(Long countQuota) {
                this.countQuota = countQuota;
                return this;
            }

            /**
             * MemberUsedCapacity.
             */
            public Builder memberUsedCapacity(Long memberUsedCapacity) {
                this.memberUsedCapacity = memberUsedCapacity;
                return this;
            }

            /**
             * MemberUsedCount.
             */
            public Builder memberUsedCount(Long memberUsedCount) {
                this.memberUsedCount = memberUsedCount;
                return this;
            }

            /**
             * UsedCapacity.
             */
            public Builder usedCapacity(Long usedCapacity) {
                this.usedCapacity = usedCapacity;
                return this;
            }

            /**
             * UsedCount.
             */
            public Builder usedCount(Long usedCount) {
                this.usedCount = usedCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
