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
 * {@link DescribeRiskEventTopAttackAppResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRiskEventTopAttackAppResponseBody</p>
 */
public class DescribeRiskEventTopAttackAppResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AttackApps")
    private java.util.List<AttackApps> attackApps;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeRiskEventTopAttackAppResponseBody(Builder builder) {
        this.attackApps = builder.attackApps;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRiskEventTopAttackAppResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return attackApps
     */
    public java.util.List<AttackApps> getAttackApps() {
        return this.attackApps;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<AttackApps> attackApps; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeRiskEventTopAttackAppResponseBody model) {
            this.attackApps = model.attackApps;
            this.requestId = model.requestId;
        } 

        /**
         * AttackApps.
         */
        public Builder attackApps(java.util.List<AttackApps> attackApps) {
            this.attackApps = attackApps;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeRiskEventTopAttackAppResponseBody build() {
            return new DescribeRiskEventTopAttackAppResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeRiskEventTopAttackAppResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRiskEventTopAttackAppResponseBody</p>
     */
    public static class AttackApps extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("App")
        private String app;

        @com.aliyun.core.annotation.NameInMap("AttackCnt")
        private Integer attackCnt;

        @com.aliyun.core.annotation.NameInMap("DropCnt")
        private Integer dropCnt;

        private AttackApps(Builder builder) {
            this.app = builder.app;
            this.attackCnt = builder.attackCnt;
            this.dropCnt = builder.dropCnt;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AttackApps create() {
            return builder().build();
        }

        /**
         * @return app
         */
        public String getApp() {
            return this.app;
        }

        /**
         * @return attackCnt
         */
        public Integer getAttackCnt() {
            return this.attackCnt;
        }

        /**
         * @return dropCnt
         */
        public Integer getDropCnt() {
            return this.dropCnt;
        }

        public static final class Builder {
            private String app; 
            private Integer attackCnt; 
            private Integer dropCnt; 

            private Builder() {
            } 

            private Builder(AttackApps model) {
                this.app = model.app;
                this.attackCnt = model.attackCnt;
                this.dropCnt = model.dropCnt;
            } 

            /**
             * App.
             */
            public Builder app(String app) {
                this.app = app;
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
             * DropCnt.
             */
            public Builder dropCnt(Integer dropCnt) {
                this.dropCnt = dropCnt;
                return this;
            }

            public AttackApps build() {
                return new AttackApps(this);
            } 

        } 

    }
}
