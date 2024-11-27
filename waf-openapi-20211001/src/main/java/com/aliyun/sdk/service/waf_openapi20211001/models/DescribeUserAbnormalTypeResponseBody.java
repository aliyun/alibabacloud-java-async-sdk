// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeUserAbnormalTypeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUserAbnormalTypeResponseBody</p>
 */
public class DescribeUserAbnormalTypeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Abnormal")
    private java.util.List < Abnormal> abnormal;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeUserAbnormalTypeResponseBody(Builder builder) {
        this.abnormal = builder.abnormal;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUserAbnormalTypeResponseBody create() {
        return builder().build();
    }

    /**
     * @return abnormal
     */
    public java.util.List < Abnormal> getAbnormal() {
        return this.abnormal;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Abnormal> abnormal; 
        private String requestId; 

        /**
         * <p>The types and statistics of risks.</p>
         */
        public Builder abnormal(java.util.List < Abnormal> abnormal) {
            this.abnormal = abnormal;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3E1CB966-1407-5988-9432-7***D784</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeUserAbnormalTypeResponseBody build() {
            return new DescribeUserAbnormalTypeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeUserAbnormalTypeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeUserAbnormalTypeResponseBody</p>
     */
    public static class Abnormal extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AbnormalCode")
        private String abnormalCode;

        @com.aliyun.core.annotation.NameInMap("AbnormalCount")
        private Long abnormalCount;

        @com.aliyun.core.annotation.NameInMap("AbnormalParentType")
        private String abnormalParentType;

        @com.aliyun.core.annotation.NameInMap("AbnormalType")
        private String abnormalType;

        private Abnormal(Builder builder) {
            this.abnormalCode = builder.abnormalCode;
            this.abnormalCount = builder.abnormalCount;
            this.abnormalParentType = builder.abnormalParentType;
            this.abnormalType = builder.abnormalType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Abnormal create() {
            return builder().build();
        }

        /**
         * @return abnormalCode
         */
        public String getAbnormalCode() {
            return this.abnormalCode;
        }

        /**
         * @return abnormalCount
         */
        public Long getAbnormalCount() {
            return this.abnormalCount;
        }

        /**
         * @return abnormalParentType
         */
        public String getAbnormalParentType() {
            return this.abnormalParentType;
        }

        /**
         * @return abnormalType
         */
        public String getAbnormalType() {
            return this.abnormalType;
        }

        public static final class Builder {
            private String abnormalCode; 
            private Long abnormalCount; 
            private String abnormalParentType; 
            private String abnormalType; 

            /**
             * <p>The code of the risk.</p>
             * 
             * <strong>example:</strong>
             * <p>Risk_InternalWeakPasswd</p>
             */
            public Builder abnormalCode(String abnormalCode) {
                this.abnormalCode = abnormalCode;
                return this;
            }

            /**
             * <p>The number of risks.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder abnormalCount(Long abnormalCount) {
                this.abnormalCount = abnormalCount;
                return this;
            }

            /**
             * <p>The parent type of the risk.</p>
             * 
             * <strong>example:</strong>
             * <p>RiskType_Account</p>
             */
            public Builder abnormalParentType(String abnormalParentType) {
                this.abnormalParentType = abnormalParentType;
                return this;
            }

            /**
             * <p>The type of the risk.</p>
             * <blockquote>
             * <p> You can call the <a href="https://help.aliyun.com/document_detail/2859155.html">DescribeApisecRules</a> operation to query the supported types of risks.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>LackOfSpeedLimit</p>
             */
            public Builder abnormalType(String abnormalType) {
                this.abnormalType = abnormalType;
                return this;
            }

            public Abnormal build() {
                return new Abnormal(this);
            } 

        } 

    }
}
