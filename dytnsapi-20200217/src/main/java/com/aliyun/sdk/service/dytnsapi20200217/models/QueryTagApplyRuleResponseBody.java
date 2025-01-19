// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dytnsapi20200217.models;

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
 * {@link QueryTagApplyRuleResponseBody} extends {@link TeaModel}
 *
 * <p>QueryTagApplyRuleResponseBody</p>
 */
public class QueryTagApplyRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryTagApplyRuleResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryTagApplyRuleResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * <p>The response code. <strong>OK</strong> indicates that the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>CC3BB6D2-<strong><strong>-</strong></strong>-9DCE-B38165CE4C47</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryTagApplyRuleResponseBody build() {
            return new QueryTagApplyRuleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryTagApplyRuleResponseBody} extends {@link TeaModel}
     *
     * <p>QueryTagApplyRuleResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApplyMaterialDesc")
        private String applyMaterialDesc;

        @com.aliyun.core.annotation.NameInMap("AutoAudit")
        private Long autoAudit;

        @com.aliyun.core.annotation.NameInMap("ChargingStandardLink")
        private String chargingStandardLink;

        @com.aliyun.core.annotation.NameInMap("EncryptedQuery")
        private Long encryptedQuery;

        @com.aliyun.core.annotation.NameInMap("NeedApplyMaterial")
        private Long needApplyMaterial;

        @com.aliyun.core.annotation.NameInMap("SlaLink")
        private String slaLink;

        private Data(Builder builder) {
            this.applyMaterialDesc = builder.applyMaterialDesc;
            this.autoAudit = builder.autoAudit;
            this.chargingStandardLink = builder.chargingStandardLink;
            this.encryptedQuery = builder.encryptedQuery;
            this.needApplyMaterial = builder.needApplyMaterial;
            this.slaLink = builder.slaLink;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return applyMaterialDesc
         */
        public String getApplyMaterialDesc() {
            return this.applyMaterialDesc;
        }

        /**
         * @return autoAudit
         */
        public Long getAutoAudit() {
            return this.autoAudit;
        }

        /**
         * @return chargingStandardLink
         */
        public String getChargingStandardLink() {
            return this.chargingStandardLink;
        }

        /**
         * @return encryptedQuery
         */
        public Long getEncryptedQuery() {
            return this.encryptedQuery;
        }

        /**
         * @return needApplyMaterial
         */
        public Long getNeedApplyMaterial() {
            return this.needApplyMaterial;
        }

        /**
         * @return slaLink
         */
        public String getSlaLink() {
            return this.slaLink;
        }

        public static final class Builder {
            private String applyMaterialDesc; 
            private Long autoAudit; 
            private String chargingStandardLink; 
            private Long encryptedQuery; 
            private Long needApplyMaterial; 
            private String slaLink; 

            /**
             * <p>The requirements for application materials.</p>
             * 
             * <strong>example:</strong>
             * <p>Requirements for application materials</p>
             */
            public Builder applyMaterialDesc(String applyMaterialDesc) {
                this.applyMaterialDesc = applyMaterialDesc;
                return this;
            }

            /**
             * <p>Indicates whether the application is automatically approved.</p>
             * 
             * <strong>example:</strong>
             * <p>16</p>
             */
            public Builder autoAudit(Long autoAudit) {
                this.autoAudit = autoAudit;
                return this;
            }

            /**
             * <p>The URL for the billing documentation.</p>
             * 
             * <strong>example:</strong>
             * <p>aliyundoc.com</p>
             */
            public Builder chargingStandardLink(String chargingStandardLink) {
                this.chargingStandardLink = chargingStandardLink;
                return this;
            }

            /**
             * <p>indicates whether encrypted queries are supported.</p>
             * 
             * <strong>example:</strong>
             * <p>99</p>
             */
            public Builder encryptedQuery(Long encryptedQuery) {
                this.encryptedQuery = encryptedQuery;
                return this;
            }

            /**
             * <p>Indicates whether application materials are required.</p>
             * 
             * <strong>example:</strong>
             * <p>46</p>
             */
            public Builder needApplyMaterial(Long needApplyMaterial) {
                this.needApplyMaterial = needApplyMaterial;
                return this;
            }

            /**
             * <p>The URL for the service agreement.</p>
             * 
             * <strong>example:</strong>
             * <p>example.aliyundoc.com</p>
             */
            public Builder slaLink(String slaLink) {
                this.slaLink = slaLink;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
