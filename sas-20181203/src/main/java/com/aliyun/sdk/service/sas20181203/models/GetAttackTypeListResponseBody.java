// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAttackTypeListResponseBody} extends {@link TeaModel}
 *
 * <p>GetAttackTypeListResponseBody</p>
 */
public class GetAttackTypeListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AttackTypeList")
    private java.util.List < AttackTypeList> attackTypeList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetAttackTypeListResponseBody(Builder builder) {
        this.attackTypeList = builder.attackTypeList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAttackTypeListResponseBody create() {
        return builder().build();
    }

    /**
     * @return attackTypeList
     */
    public java.util.List < AttackTypeList> getAttackTypeList() {
        return this.attackTypeList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < AttackTypeList> attackTypeList; 
        private String requestId; 

        /**
         * AttackTypeList.
         */
        public Builder attackTypeList(java.util.List < AttackTypeList> attackTypeList) {
            this.attackTypeList = attackTypeList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetAttackTypeListResponseBody build() {
            return new GetAttackTypeListResponseBody(this);
        } 

    } 

    public static class AttackTypeList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("Status_Type")
        private String statusType;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private AttackTypeList(Builder builder) {
            this.label = builder.label;
            this.statusType = builder.statusType;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AttackTypeList create() {
            return builder().build();
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * @return statusType
         */
        public String getStatusType() {
            return this.statusType;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String label; 
            private String statusType; 
            private String value; 

            /**
             * Label.
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * Status_Type.
             */
            public Builder statusType(String statusType) {
                this.statusType = statusType;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public AttackTypeList build() {
                return new AttackTypeList(this);
            } 

        } 

    }
}
