// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20170823.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAuditRangeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAuditRangeResponseBody</p>
 */
public class DescribeAuditRangeResponseBody extends TeaModel {
    @NameInMap("AuditRange")
    private AuditRange auditRange;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeAuditRangeResponseBody(Builder builder) {
        this.auditRange = builder.auditRange;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAuditRangeResponseBody create() {
        return builder().build();
    }

    /**
     * @return auditRange
     */
    public AuditRange getAuditRange() {
        return this.auditRange;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private AuditRange auditRange; 
        private String requestId; 

        /**
         * AuditRange.
         */
        public Builder auditRange(AuditRange auditRange) {
            this.auditRange = auditRange;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeAuditRangeResponseBody build() {
            return new DescribeAuditRangeResponseBody(this);
        } 

    } 

    public static class AuditRange extends TeaModel {
        @NameInMap("block")
        private Boolean block;

        @NameInMap("pass")
        private Boolean pass;

        @NameInMap("review")
        private Boolean review;

        private AuditRange(Builder builder) {
            this.block = builder.block;
            this.pass = builder.pass;
            this.review = builder.review;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AuditRange create() {
            return builder().build();
        }

        /**
         * @return block
         */
        public Boolean getBlock() {
            return this.block;
        }

        /**
         * @return pass
         */
        public Boolean getPass() {
            return this.pass;
        }

        /**
         * @return review
         */
        public Boolean getReview() {
            return this.review;
        }

        public static final class Builder {
            private Boolean block; 
            private Boolean pass; 
            private Boolean review; 

            /**
             * block.
             */
            public Builder block(Boolean block) {
                this.block = block;
                return this;
            }

            /**
             * pass.
             */
            public Builder pass(Boolean pass) {
                this.pass = pass;
                return this;
            }

            /**
             * review.
             */
            public Builder review(Boolean review) {
                this.review = review;
                return this;
            }

            public AuditRange build() {
                return new AuditRange(this);
            } 

        } 

    }
}
