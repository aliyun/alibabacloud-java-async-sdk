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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetAttackTypeListResponseBody model) {
            this.attackTypeList = model.attackTypeList;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The list of attack types.</p>
         */
        public Builder attackTypeList(java.util.List<AttackTypeList> attackTypeList) {
            this.attackTypeList = attackTypeList;
            return this;
        }

        /**
         * <p>The request ID. Alibaba Cloud generates a unique identifier for each request. You can use the request ID to troubleshoot issues.</p>
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

            private Builder() {
            } 

            private Builder(AttackTypeList model) {
                this.label = model.label;
                this.statusType = model.statusType;
                this.value = model.value;
            } 

            /**
             * <p>The internationalization (i18n) translation key of the attack type, such as sas.attack.type.type12. The caller must resolve this key by using internationalization resources to obtain a human-readable attack type name.</p>
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
             * <li><strong>cfw</strong>: Cloud Firewall.</li>
             * <li><strong>alinet</strong>: Network defense plugin.</li>
             * <li><strong>waf</strong>: Web Application Firewall (WAF).</li>
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
             * <p>The type value.</p>
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
