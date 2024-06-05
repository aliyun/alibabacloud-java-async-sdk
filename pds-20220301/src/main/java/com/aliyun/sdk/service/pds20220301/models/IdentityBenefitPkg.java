// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link IdentityBenefitPkg} extends {@link TeaModel}
 *
 * <p>IdentityBenefitPkg</p>
 */
public class IdentityBenefitPkg extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("benefit_pkg_id")
    private String benefitPkgId;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    private IdentityBenefitPkg(Builder builder) {
        this.benefitPkgId = builder.benefitPkgId;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static IdentityBenefitPkg create() {
        return builder().build();
    }

    /**
     * @return benefitPkgId
     */
    public String getBenefitPkgId() {
        return this.benefitPkgId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder {
        private String benefitPkgId; 
        private String name; 

        /**
         * benefit_pkg_id.
         */
        public Builder benefitPkgId(String benefitPkgId) {
            this.benefitPkgId = benefitPkgId;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public IdentityBenefitPkg build() {
            return new IdentityBenefitPkg(this);
        } 

    } 

}
