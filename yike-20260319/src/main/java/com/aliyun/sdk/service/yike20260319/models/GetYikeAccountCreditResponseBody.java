// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yike20260319.models;

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
 * {@link GetYikeAccountCreditResponseBody} extends {@link TeaModel}
 *
 * <p>GetYikeAccountCreditResponseBody</p>
 */
public class GetYikeAccountCreditResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CreditInfo")
    private CreditInfo creditInfo;

    @com.aliyun.core.annotation.NameInMap("MembershipInfo")
    private MembershipInfo membershipInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetYikeAccountCreditResponseBody(Builder builder) {
        this.creditInfo = builder.creditInfo;
        this.membershipInfo = builder.membershipInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetYikeAccountCreditResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return creditInfo
     */
    public CreditInfo getCreditInfo() {
        return this.creditInfo;
    }

    /**
     * @return membershipInfo
     */
    public MembershipInfo getMembershipInfo() {
        return this.membershipInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private CreditInfo creditInfo; 
        private MembershipInfo membershipInfo; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetYikeAccountCreditResponseBody model) {
            this.creditInfo = model.creditInfo;
            this.membershipInfo = model.membershipInfo;
            this.requestId = model.requestId;
        } 

        /**
         * CreditInfo.
         */
        public Builder creditInfo(CreditInfo creditInfo) {
            this.creditInfo = creditInfo;
            return this;
        }

        /**
         * MembershipInfo.
         */
        public Builder membershipInfo(MembershipInfo membershipInfo) {
            this.membershipInfo = membershipInfo;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>63E8B7C7-4812-46AD-0FA56029AC86</strong></strong></p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetYikeAccountCreditResponseBody build() {
            return new GetYikeAccountCreditResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetYikeAccountCreditResponseBody} extends {@link TeaModel}
     *
     * <p>GetYikeAccountCreditResponseBody</p>
     */
    public static class CreditInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GrantedCreditQuota")
        private Double grantedCreditQuota;

        @com.aliyun.core.annotation.NameInMap("GrantedCreditQuotaUsage")
        private Double grantedCreditQuotaUsage;

        @com.aliyun.core.annotation.NameInMap("PackCreditQuota")
        private Double packCreditQuota;

        @com.aliyun.core.annotation.NameInMap("PackCreditQuotaUsage")
        private Double packCreditQuotaUsage;

        @com.aliyun.core.annotation.NameInMap("ResourceCreditQuota")
        private Double resourceCreditQuota;

        @com.aliyun.core.annotation.NameInMap("ResourceCreditQuotaUsage")
        private Double resourceCreditQuotaUsage;

        private CreditInfo(Builder builder) {
            this.grantedCreditQuota = builder.grantedCreditQuota;
            this.grantedCreditQuotaUsage = builder.grantedCreditQuotaUsage;
            this.packCreditQuota = builder.packCreditQuota;
            this.packCreditQuotaUsage = builder.packCreditQuotaUsage;
            this.resourceCreditQuota = builder.resourceCreditQuota;
            this.resourceCreditQuotaUsage = builder.resourceCreditQuotaUsage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CreditInfo create() {
            return builder().build();
        }

        /**
         * @return grantedCreditQuota
         */
        public Double getGrantedCreditQuota() {
            return this.grantedCreditQuota;
        }

        /**
         * @return grantedCreditQuotaUsage
         */
        public Double getGrantedCreditQuotaUsage() {
            return this.grantedCreditQuotaUsage;
        }

        /**
         * @return packCreditQuota
         */
        public Double getPackCreditQuota() {
            return this.packCreditQuota;
        }

        /**
         * @return packCreditQuotaUsage
         */
        public Double getPackCreditQuotaUsage() {
            return this.packCreditQuotaUsage;
        }

        /**
         * @return resourceCreditQuota
         */
        public Double getResourceCreditQuota() {
            return this.resourceCreditQuota;
        }

        /**
         * @return resourceCreditQuotaUsage
         */
        public Double getResourceCreditQuotaUsage() {
            return this.resourceCreditQuotaUsage;
        }

        public static final class Builder {
            private Double grantedCreditQuota; 
            private Double grantedCreditQuotaUsage; 
            private Double packCreditQuota; 
            private Double packCreditQuotaUsage; 
            private Double resourceCreditQuota; 
            private Double resourceCreditQuotaUsage; 

            private Builder() {
            } 

            private Builder(CreditInfo model) {
                this.grantedCreditQuota = model.grantedCreditQuota;
                this.grantedCreditQuotaUsage = model.grantedCreditQuotaUsage;
                this.packCreditQuota = model.packCreditQuota;
                this.packCreditQuotaUsage = model.packCreditQuotaUsage;
                this.resourceCreditQuota = model.resourceCreditQuota;
                this.resourceCreditQuotaUsage = model.resourceCreditQuotaUsage;
            } 

            /**
             * GrantedCreditQuota.
             */
            public Builder grantedCreditQuota(Double grantedCreditQuota) {
                this.grantedCreditQuota = grantedCreditQuota;
                return this;
            }

            /**
             * GrantedCreditQuotaUsage.
             */
            public Builder grantedCreditQuotaUsage(Double grantedCreditQuotaUsage) {
                this.grantedCreditQuotaUsage = grantedCreditQuotaUsage;
                return this;
            }

            /**
             * PackCreditQuota.
             */
            public Builder packCreditQuota(Double packCreditQuota) {
                this.packCreditQuota = packCreditQuota;
                return this;
            }

            /**
             * PackCreditQuotaUsage.
             */
            public Builder packCreditQuotaUsage(Double packCreditQuotaUsage) {
                this.packCreditQuotaUsage = packCreditQuotaUsage;
                return this;
            }

            /**
             * ResourceCreditQuota.
             */
            public Builder resourceCreditQuota(Double resourceCreditQuota) {
                this.resourceCreditQuota = resourceCreditQuota;
                return this;
            }

            /**
             * ResourceCreditQuotaUsage.
             */
            public Builder resourceCreditQuotaUsage(Double resourceCreditQuotaUsage) {
                this.resourceCreditQuotaUsage = resourceCreditQuotaUsage;
                return this;
            }

            public CreditInfo build() {
                return new CreditInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetYikeAccountCreditResponseBody} extends {@link TeaModel}
     *
     * <p>GetYikeAccountCreditResponseBody</p>
     */
    public static class MembershipInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("Membership")
        private String membership;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        private MembershipInfo(Builder builder) {
            this.endTime = builder.endTime;
            this.membership = builder.membership;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MembershipInfo create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return membership
         */
        public String getMembership() {
            return this.membership;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private String endTime; 
            private String membership; 
            private String startTime; 

            private Builder() {
            } 

            private Builder(MembershipInfo model) {
                this.endTime = model.endTime;
                this.membership = model.membership;
                this.startTime = model.startTime;
            } 

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * Membership.
             */
            public Builder membership(String membership) {
                this.membership = membership;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            public MembershipInfo build() {
                return new MembershipInfo(this);
            } 

        } 

    }
}
