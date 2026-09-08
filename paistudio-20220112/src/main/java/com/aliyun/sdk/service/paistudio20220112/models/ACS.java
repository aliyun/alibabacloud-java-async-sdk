// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

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
 * {@link ACS} extends {@link TeaModel}
 *
 * <p>ACS</p>
 */
public class ACS extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ACSQuotaId")
    private String ACSQuotaId;

    @com.aliyun.core.annotation.NameInMap("AssociatedProducts")
    private java.util.List<String> associatedProducts;

    private ACS(Builder builder) {
        this.ACSQuotaId = builder.ACSQuotaId;
        this.associatedProducts = builder.associatedProducts;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ACS create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ACSQuotaId
     */
    public String getACSQuotaId() {
        return this.ACSQuotaId;
    }

    /**
     * @return associatedProducts
     */
    public java.util.List<String> getAssociatedProducts() {
        return this.associatedProducts;
    }

    public static final class Builder {
        private String ACSQuotaId; 
        private java.util.List<String> associatedProducts; 

        private Builder() {
        } 

        private Builder(ACS model) {
            this.ACSQuotaId = model.ACSQuotaId;
            this.associatedProducts = model.associatedProducts;
        } 

        /**
         * <p>ACS resource ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rq-3kbt2gtimmyw7fgfgothocvh</p>
         */
        public Builder ACSQuotaId(String ACSQuotaId) {
            this.ACSQuotaId = ACSQuotaId;
            return this;
        }

        /**
         * <p>Product codes that can use the ACS Quota.</p>
         * <p>Constraints:<br>You can select multiple sub-products, but some sub-products are mutually exclusive. The following combinations can be selected simultaneously:  </p>
         * <ul>
         * <li>PAI-DLC, PAI-DSW  </li>
         * <li>PAI-EAS</li>
         * </ul>
         */
        public Builder associatedProducts(java.util.List<String> associatedProducts) {
            this.associatedProducts = associatedProducts;
            return this;
        }

        public ACS build() {
            return new ACS(this);
        } 

    } 

}
