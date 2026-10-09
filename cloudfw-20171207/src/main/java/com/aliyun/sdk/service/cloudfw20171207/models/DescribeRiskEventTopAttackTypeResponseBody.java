// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link DescribeRiskEventTopAttackTypeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRiskEventTopAttackTypeResponseBody</p>
 */
public class DescribeRiskEventTopAttackTypeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TopAttackTypeList")
    private java.util.List<TopAttackTypeList> topAttackTypeList;

    @com.aliyun.core.annotation.NameInMap("TotalAttackCnt")
    private Long totalAttackCnt;

    @com.aliyun.core.annotation.NameInMap("TotalProtectCnt")
    private Long totalProtectCnt;

    private DescribeRiskEventTopAttackTypeResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.topAttackTypeList = builder.topAttackTypeList;
        this.totalAttackCnt = builder.totalAttackCnt;
        this.totalProtectCnt = builder.totalProtectCnt;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRiskEventTopAttackTypeResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return topAttackTypeList
     */
    public java.util.List<TopAttackTypeList> getTopAttackTypeList() {
        return this.topAttackTypeList;
    }

    /**
     * @return totalAttackCnt
     */
    public Long getTotalAttackCnt() {
        return this.totalAttackCnt;
    }

    /**
     * @return totalProtectCnt
     */
    public Long getTotalProtectCnt() {
        return this.totalProtectCnt;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<TopAttackTypeList> topAttackTypeList; 
        private Long totalAttackCnt; 
        private Long totalProtectCnt; 

        private Builder() {
        } 

        private Builder(DescribeRiskEventTopAttackTypeResponseBody model) {
            this.requestId = model.requestId;
            this.topAttackTypeList = model.topAttackTypeList;
            this.totalAttackCnt = model.totalAttackCnt;
            this.totalProtectCnt = model.totalProtectCnt;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>BECDBF66-91DA-5B40-8B05-0D26541A****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>A list of the top attack types.</p>
         */
        public Builder topAttackTypeList(java.util.List<TopAttackTypeList> topAttackTypeList) {
            this.topAttackTypeList = topAttackTypeList;
            return this;
        }

        /**
         * <p>The total number of attacks.</p>
         * 
         * <strong>example:</strong>
         * <p>47</p>
         */
        public Builder totalAttackCnt(Long totalAttackCnt) {
            this.totalAttackCnt = totalAttackCnt;
            return this;
        }

        /**
         * <p>The total number of protection triggers.</p>
         * 
         * <strong>example:</strong>
         * <p>65</p>
         */
        public Builder totalProtectCnt(Long totalProtectCnt) {
            this.totalProtectCnt = totalProtectCnt;
            return this;
        }

        public DescribeRiskEventTopAttackTypeResponseBody build() {
            return new DescribeRiskEventTopAttackTypeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeRiskEventTopAttackTypeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRiskEventTopAttackTypeResponseBody</p>
     */
    public static class TopAttackTypeList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AttackCnt")
        private Long attackCnt;

        @com.aliyun.core.annotation.NameInMap("AttackType")
        private Long attackType;

        @com.aliyun.core.annotation.NameInMap("ProtectCnt")
        private Long protectCnt;

        private TopAttackTypeList(Builder builder) {
            this.attackCnt = builder.attackCnt;
            this.attackType = builder.attackType;
            this.protectCnt = builder.protectCnt;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TopAttackTypeList create() {
            return builder().build();
        }

        /**
         * @return attackCnt
         */
        public Long getAttackCnt() {
            return this.attackCnt;
        }

        /**
         * @return attackType
         */
        public Long getAttackType() {
            return this.attackType;
        }

        /**
         * @return protectCnt
         */
        public Long getProtectCnt() {
            return this.protectCnt;
        }

        public static final class Builder {
            private Long attackCnt; 
            private Long attackType; 
            private Long protectCnt; 

            private Builder() {
            } 

            private Builder(TopAttackTypeList model) {
                this.attackCnt = model.attackCnt;
                this.attackType = model.attackType;
                this.protectCnt = model.protectCnt;
            } 

            /**
             * <p>The number of attacks.</p>
             * 
             * <strong>example:</strong>
             * <p>38</p>
             */
            public Builder attackCnt(Long attackCnt) {
                this.attackCnt = attackCnt;
                return this;
            }

            /**
             * <p>The attack type of the intrusion prevention event. Valid values:</p>
             * <ul>
             * <li><p><strong>1</strong>: abnormal connection</p>
             * </li>
             * <li><p><strong>2</strong>: command execution</p>
             * </li>
             * <li><p><strong>3</strong>: brute-force attack</p>
             * </li>
             * <li><p><strong>4</strong>: scan</p>
             * </li>
             * <li><p><strong>5</strong>: other</p>
             * </li>
             * <li><p><strong>6</strong>: information leakage</p>
             * </li>
             * <li><p><strong>7</strong>: DoS attack</p>
             * </li>
             * <li><p><strong>8</strong>: overflow attack</p>
             * </li>
             * <li><p><strong>9</strong>: web attack</p>
             * </li>
             * <li><p><strong>10</strong>: trojan and backdoor</p>
             * </li>
             * <li><p><strong>11</strong>: virus and worm</p>
             * </li>
             * <li><p><strong>12</strong>: cryptomining</p>
             * </li>
             * <li><p><strong>13</strong>: reverse shell</p>
             * </li>
             * </ul>
             * <blockquote>
             * <p>By default, this API queries for all attack types.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder attackType(Long attackType) {
                this.attackType = attackType;
                return this;
            }

            /**
             * <p>The number of protection triggers.</p>
             * 
             * <strong>example:</strong>
             * <p>42</p>
             */
            public Builder protectCnt(Long protectCnt) {
                this.protectCnt = protectCnt;
                return this;
            }

            public TopAttackTypeList build() {
                return new TopAttackTypeList(this);
            } 

        } 

    }
}
