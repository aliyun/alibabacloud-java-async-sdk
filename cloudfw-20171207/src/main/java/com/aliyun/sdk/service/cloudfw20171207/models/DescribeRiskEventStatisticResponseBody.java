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
 * {@link DescribeRiskEventStatisticResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRiskEventStatisticResponseBody</p>
 */
public class DescribeRiskEventStatisticResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AttackAppCnt")
    private Integer attackAppCnt;

    @com.aliyun.core.annotation.NameInMap("AttackCnt")
    private Integer attackCnt;

    @com.aliyun.core.annotation.NameInMap("AttackIpCnt")
    private Integer attackIpCnt;

    @com.aliyun.core.annotation.NameInMap("DropCnt")
    private Integer dropCnt;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeRiskEventStatisticResponseBody(Builder builder) {
        this.attackAppCnt = builder.attackAppCnt;
        this.attackCnt = builder.attackCnt;
        this.attackIpCnt = builder.attackIpCnt;
        this.dropCnt = builder.dropCnt;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRiskEventStatisticResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return attackAppCnt
     */
    public Integer getAttackAppCnt() {
        return this.attackAppCnt;
    }

    /**
     * @return attackCnt
     */
    public Integer getAttackCnt() {
        return this.attackCnt;
    }

    /**
     * @return attackIpCnt
     */
    public Integer getAttackIpCnt() {
        return this.attackIpCnt;
    }

    /**
     * @return dropCnt
     */
    public Integer getDropCnt() {
        return this.dropCnt;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer attackAppCnt; 
        private Integer attackCnt; 
        private Integer attackIpCnt; 
        private Integer dropCnt; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeRiskEventStatisticResponseBody model) {
            this.attackAppCnt = model.attackAppCnt;
            this.attackCnt = model.attackCnt;
            this.attackIpCnt = model.attackIpCnt;
            this.dropCnt = model.dropCnt;
            this.requestId = model.requestId;
        } 

        /**
         * AttackAppCnt.
         */
        public Builder attackAppCnt(Integer attackAppCnt) {
            this.attackAppCnt = attackAppCnt;
            return this;
        }

        /**
         * AttackCnt.
         */
        public Builder attackCnt(Integer attackCnt) {
            this.attackCnt = attackCnt;
            return this;
        }

        /**
         * AttackIpCnt.
         */
        public Builder attackIpCnt(Integer attackIpCnt) {
            this.attackIpCnt = attackIpCnt;
            return this;
        }

        /**
         * DropCnt.
         */
        public Builder dropCnt(Integer dropCnt) {
            this.dropCnt = dropCnt;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeRiskEventStatisticResponseBody build() {
            return new DescribeRiskEventStatisticResponseBody(this);
        } 

    } 

}
