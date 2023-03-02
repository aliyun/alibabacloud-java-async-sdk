// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ltl20190510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMemberCapacityInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMemberCapacityInfoResponseBody</p>
 */
public class DescribeMemberCapacityInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private DescribeMemberCapacityInfoResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMemberCapacityInfoResponseBody create() {
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
    public java.util.List < Data> getData() {
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
        private java.util.List < Data> data; 
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
        public Builder data(java.util.List < Data> data) {
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

        public DescribeMemberCapacityInfoResponseBody build() {
            return new DescribeMemberCapacityInfoResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("MemberId")
        private String memberId;

        @NameInMap("MemberName")
        private String memberName;

        @NameInMap("MemberUid")
        private String memberUid;

        @NameInMap("UsedCapacity")
        private String usedCapacity;

        @NameInMap("UsedCount")
        private String usedCount;

        private Data(Builder builder) {
            this.memberId = builder.memberId;
            this.memberName = builder.memberName;
            this.memberUid = builder.memberUid;
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
         * @return memberId
         */
        public String getMemberId() {
            return this.memberId;
        }

        /**
         * @return memberName
         */
        public String getMemberName() {
            return this.memberName;
        }

        /**
         * @return memberUid
         */
        public String getMemberUid() {
            return this.memberUid;
        }

        /**
         * @return usedCapacity
         */
        public String getUsedCapacity() {
            return this.usedCapacity;
        }

        /**
         * @return usedCount
         */
        public String getUsedCount() {
            return this.usedCount;
        }

        public static final class Builder {
            private String memberId; 
            private String memberName; 
            private String memberUid; 
            private String usedCapacity; 
            private String usedCount; 

            /**
             * MemberId.
             */
            public Builder memberId(String memberId) {
                this.memberId = memberId;
                return this;
            }

            /**
             * MemberName.
             */
            public Builder memberName(String memberName) {
                this.memberName = memberName;
                return this;
            }

            /**
             * MemberUid.
             */
            public Builder memberUid(String memberUid) {
                this.memberUid = memberUid;
                return this;
            }

            /**
             * UsedCapacity.
             */
            public Builder usedCapacity(String usedCapacity) {
                this.usedCapacity = usedCapacity;
                return this;
            }

            /**
             * UsedCount.
             */
            public Builder usedCount(String usedCount) {
                this.usedCount = usedCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
