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
         * ModuleDetails.
         */
        public Builder moduleDetails(java.util.List<ModuleDetails> moduleDetails) {
            this.moduleDetails = moduleDetails;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCredit.
         */
        public Builder totalCredit(Double totalCredit) {
            this.totalCredit = totalCredit;
            return this;
        }

        /**
         * TotalSeCu.
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
             * Credit.
             */
            public Builder credit(Double credit) {
                this.credit = credit;
                return this;
            }

            /**
             * ModuleCode.
             */
            public Builder moduleCode(String moduleCode) {
                this.moduleCode = moduleCode;
                return this;
            }

            /**
             * SeCu.
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
