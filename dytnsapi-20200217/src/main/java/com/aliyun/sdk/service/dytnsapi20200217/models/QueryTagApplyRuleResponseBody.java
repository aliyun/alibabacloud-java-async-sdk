// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dytnsapi20200217.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryTagApplyRuleResponseBody} extends {@link TeaModel}
 *
 * <p>QueryTagApplyRuleResponseBody</p>
 */
public class QueryTagApplyRuleResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
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
         * The response code. **OK** indicates that the request is successful.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The returned data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The returned message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request is successful. Valid values:
         * <p>
         * 
         * *   true
         * *   false
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryTagApplyRuleResponseBody build() {
            return new QueryTagApplyRuleResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("ApplyMaterialDesc")
        private String applyMaterialDesc;

        @NameInMap("AutoAudit")
        private Long autoAudit;

        @NameInMap("ChargingStandardLink")
        private String chargingStandardLink;

        @NameInMap("EncryptedQuery")
        private Long encryptedQuery;

        @NameInMap("NeedApplyMaterial")
        private Long needApplyMaterial;

        @NameInMap("SlaLink")
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
             * The requirements for application materials.
             */
            public Builder applyMaterialDesc(String applyMaterialDesc) {
                this.applyMaterialDesc = applyMaterialDesc;
                return this;
            }

            /**
             * Indicates whether the application is automatically approved.
             */
            public Builder autoAudit(Long autoAudit) {
                this.autoAudit = autoAudit;
                return this;
            }

            /**
             * The URL for the billing documentation.
             */
            public Builder chargingStandardLink(String chargingStandardLink) {
                this.chargingStandardLink = chargingStandardLink;
                return this;
            }

            /**
             * indicates whether encrypted queries are supported.
             */
            public Builder encryptedQuery(Long encryptedQuery) {
                this.encryptedQuery = encryptedQuery;
                return this;
            }

            /**
             * Indicates whether application materials are required.
             */
            public Builder needApplyMaterial(Long needApplyMaterial) {
                this.needApplyMaterial = needApplyMaterial;
                return this;
            }

            /**
             * The URL for the service agreement.
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
