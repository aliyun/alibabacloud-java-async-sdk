// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link WorkspaceSpec} extends {@link TeaModel}
 *
 * <p>WorkspaceSpec</p>
 */
public class WorkspaceSpec extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("CodeType")
    private String codeType;

    @com.aliyun.core.annotation.NameInMap("IsGuaranteedValid")
    private Boolean isGuaranteedValid;

    @com.aliyun.core.annotation.NameInMap("IsOverSoldValid")
    private Boolean isOverSoldValid;

    @com.aliyun.core.annotation.NameInMap("Reason")
    private String reason;

    @com.aliyun.core.annotation.NameInMap("Spec")
    private ResourceAmount spec;

    @com.aliyun.core.annotation.NameInMap("SpecName")
    private String specName;

    private WorkspaceSpec(Builder builder) {
        this.code = builder.code;
        this.codeType = builder.codeType;
        this.isGuaranteedValid = builder.isGuaranteedValid;
        this.isOverSoldValid = builder.isOverSoldValid;
        this.reason = builder.reason;
        this.spec = builder.spec;
        this.specName = builder.specName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static WorkspaceSpec create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return codeType
     */
    public String getCodeType() {
        return this.codeType;
    }

    /**
     * @return isGuaranteedValid
     */
    public Boolean getIsGuaranteedValid() {
        return this.isGuaranteedValid;
    }

    /**
     * @return isOverSoldValid
     */
    public Boolean getIsOverSoldValid() {
        return this.isOverSoldValid;
    }

    /**
     * @return reason
     */
    public String getReason() {
        return this.reason;
    }

    /**
     * @return spec
     */
    public ResourceAmount getSpec() {
        return this.spec;
    }

    /**
     * @return specName
     */
    public String getSpecName() {
        return this.specName;
    }

    public static final class Builder {
        private String code; 
        private String codeType; 
        private Boolean isGuaranteedValid; 
        private Boolean isOverSoldValid; 
        private String reason; 
        private ResourceAmount spec; 
        private String specName; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * CodeType.
         */
        public Builder codeType(String codeType) {
            this.codeType = codeType;
            return this;
        }

        /**
         * IsGuaranteedValid.
         */
        public Builder isGuaranteedValid(Boolean isGuaranteedValid) {
            this.isGuaranteedValid = isGuaranteedValid;
            return this;
        }

        /**
         * IsOverSoldValid.
         */
        public Builder isOverSoldValid(Boolean isOverSoldValid) {
            this.isOverSoldValid = isOverSoldValid;
            return this;
        }

        /**
         * Reason.
         */
        public Builder reason(String reason) {
            this.reason = reason;
            return this;
        }

        /**
         * Spec.
         */
        public Builder spec(ResourceAmount spec) {
            this.spec = spec;
            return this;
        }

        /**
         * SpecName.
         */
        public Builder specName(String specName) {
            this.specName = specName;
            return this;
        }

        public WorkspaceSpec build() {
            return new WorkspaceSpec(this);
        } 

    } 

}
