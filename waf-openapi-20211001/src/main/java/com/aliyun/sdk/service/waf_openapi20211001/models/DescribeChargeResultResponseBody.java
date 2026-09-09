// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

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
 * {@link DescribeChargeResultResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeChargeResultResponseBody</p>
 */
public class DescribeChargeResultResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ModuleDetails")
    private java.util.List<ModuleDetails> moduleDetails;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCredit")
    private Double totalCredit;

    @com.aliyun.core.annotation.NameInMap("TotalSeCu")
    private Double totalSeCu;

    private DescribeChargeResultResponseBody(Builder builder) {
        this.moduleDetails = builder.moduleDetails;
        this.requestId = builder.requestId;
        this.totalCredit = builder.totalCredit;
        this.totalSeCu = builder.totalSeCu;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeChargeResultResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return moduleDetails
     */
    public java.util.List<ModuleDetails> getModuleDetails() {
        return this.moduleDetails;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCredit
     */
    public Double getTotalCredit() {
        return this.totalCredit;
    }

    /**
     * @return totalSeCu
     */
    public Double getTotalSeCu() {
        return this.totalSeCu;
    }

    public static final class Builder {
        private java.util.List<ModuleDetails> moduleDetails; 
        private String requestId; 
        private Double totalCredit; 
        private Double totalSeCu; 

        private Builder() {
        } 

        private Builder(DescribeChargeResultResponseBody model) {
            this.moduleDetails = model.moduleDetails;
            this.requestId = model.requestId;
            this.totalCredit = model.totalCredit;
            this.totalSeCu = model.totalSeCu;
        } 

        /**
         * <p>The calculation results.</p>
         */
        public Builder moduleDetails(java.util.List<ModuleDetails> moduleDetails) {
            this.moduleDetails = moduleDetails;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D7861F61-5B61-46CE-A47C-6B19160D5EB0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of calculated Credits.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder totalCredit(Double totalCredit) {
            this.totalCredit = totalCredit;
            return this;
        }

        /**
         * <p>The total number of calculated SeCUs.</p>
         * 
         * <strong>example:</strong>
         * <p>1080</p>
         */
        public Builder totalSeCu(Double totalSeCu) {
            this.totalSeCu = totalSeCu;
            return this;
        }

        public DescribeChargeResultResponseBody build() {
            return new DescribeChargeResultResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeChargeResultResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeChargeResultResponseBody</p>
     */
    public static class ModuleDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Credit")
        private Double credit;

        @com.aliyun.core.annotation.NameInMap("ModuleCode")
        private String moduleCode;

        @com.aliyun.core.annotation.NameInMap("SeCu")
        private Double seCu;

        private ModuleDetails(Builder builder) {
            this.credit = builder.credit;
            this.moduleCode = builder.moduleCode;
            this.seCu = builder.seCu;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ModuleDetails create() {
            return builder().build();
        }

        /**
         * @return credit
         */
        public Double getCredit() {
            return this.credit;
        }

        /**
         * @return moduleCode
         */
        public String getModuleCode() {
            return this.moduleCode;
        }

        /**
         * @return seCu
         */
        public Double getSeCu() {
            return this.seCu;
        }

        public static final class Builder {
            private Double credit; 
            private String moduleCode; 
            private Double seCu; 

            private Builder() {
            } 

            private Builder(ModuleDetails model) {
                this.credit = model.credit;
                this.moduleCode = model.moduleCode;
                this.seCu = model.seCu;
            } 

            /**
             * <p>The number of Credits for the pricing module.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder credit(Double credit) {
                this.credit = credit;
                return this;
            }

            /**
             * <p>The pricing module identifier.</p>
             * 
             * <strong>example:</strong>
             * <p>domainCount</p>
             */
            public Builder moduleCode(String moduleCode) {
                this.moduleCode = moduleCode;
                return this;
            }

            /**
             * <p>The number of SeCUs for the pricing module.</p>
             * 
             * <strong>example:</strong>
             * <p>1080</p>
             */
            public Builder seCu(Double seCu) {
                this.seCu = seCu;
                return this;
            }

            public ModuleDetails build() {
                return new ModuleDetails(this);
            } 

        } 

    }
}
