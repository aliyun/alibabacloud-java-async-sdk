// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDDosEventAttackTypeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDDosEventAttackTypeResponseBody</p>
 */
public class DescribeDDosEventAttackTypeResponseBody extends TeaModel {
    @NameInMap("AttackTypes")
    private java.util.List < AttackTypes> attackTypes;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeDDosEventAttackTypeResponseBody(Builder builder) {
        this.attackTypes = builder.attackTypes;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDDosEventAttackTypeResponseBody create() {
        return builder().build();
    }

    /**
     * @return attackTypes
     */
    public java.util.List < AttackTypes> getAttackTypes() {
        return this.attackTypes;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < AttackTypes> attackTypes; 
        private String requestId; 

        /**
         * AttackTypes.
         */
        public Builder attackTypes(java.util.List < AttackTypes> attackTypes) {
            this.attackTypes = attackTypes;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDDosEventAttackTypeResponseBody build() {
            return new DescribeDDosEventAttackTypeResponseBody(this);
        } 

    } 

    public static class AttackTypes extends TeaModel {
        @NameInMap("AttackType")
        private String attackType;

        @NameInMap("InPkts")
        private Long inPkts;

        private AttackTypes(Builder builder) {
            this.attackType = builder.attackType;
            this.inPkts = builder.inPkts;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AttackTypes create() {
            return builder().build();
        }

        /**
         * @return attackType
         */
        public String getAttackType() {
            return this.attackType;
        }

        /**
         * @return inPkts
         */
        public Long getInPkts() {
            return this.inPkts;
        }

        public static final class Builder {
            private String attackType; 
            private Long inPkts; 

            /**
             * AttackType.
             */
            public Builder attackType(String attackType) {
                this.attackType = attackType;
                return this;
            }

            /**
             * InPkts.
             */
            public Builder inPkts(Long inPkts) {
                this.inPkts = inPkts;
                return this;
            }

            public AttackTypes build() {
                return new AttackTypes(this);
            } 

        } 

    }
}
