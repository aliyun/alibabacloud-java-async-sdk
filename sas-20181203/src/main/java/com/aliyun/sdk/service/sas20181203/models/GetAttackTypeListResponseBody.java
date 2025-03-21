// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link GetAttackTypeListResponseBody} extends {@link TeaModel}
 *
 * <p>GetAttackTypeListResponseBody</p>
 */
public class GetAttackTypeListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AttackTypeList")
    private java.util.List<AttackTypeList> attackTypeList;

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
    public java.util.List<AttackTypeList> getAttackTypeList() {
        return this.attackTypeList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<AttackTypeList> attackTypeList; 
        private String requestId; 

        /**
         * <p>The attack types.</p>
         */
        public Builder attackTypeList(java.util.List<AttackTypeList> attackTypeList) {
            this.attackTypeList = attackTypeList;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>CE500770-42D3-442E-9DDD-156E0F9F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetAttackTypeListResponseBody build() {
            return new GetAttackTypeListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAttackTypeListResponseBody} extends {@link TeaModel}
     *
     * <p>GetAttackTypeListResponseBody</p>
     */
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
             * <p>The description of the attack type.</p>
             * 
             * <strong>example:</strong>
             * <p>sas.attack.type.type12</p>
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * <p>The attack source. Valid values:</p>
             * <ul>
             * <li><strong>cfw</strong>: Cloud Firewall</li>
             * <li><strong>alinet</strong>: network defense plug-in</li>
             * <li><strong>waf</strong>: Web Application Firewall (WAF)</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>alinet</p>
             */
            public Builder statusType(String statusType) {
                this.statusType = statusType;
                return this;
            }

            /**
             * <p>The value of the attack type.</p>
             * 
             * <strong>example:</strong>
             * <p>upload</p>
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
