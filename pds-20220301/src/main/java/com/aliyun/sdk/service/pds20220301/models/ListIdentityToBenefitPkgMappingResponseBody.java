// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

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
 * {@link ListIdentityToBenefitPkgMappingResponseBody} extends {@link TeaModel}
 *
 * <p>ListIdentityToBenefitPkgMappingResponseBody</p>
 */
public class ListIdentityToBenefitPkgMappingResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("items")
    private java.util.List<IdentityToBenefitPkgMapping> items;

    private ListIdentityToBenefitPkgMappingResponseBody(Builder builder) {
        this.items = builder.items;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListIdentityToBenefitPkgMappingResponseBody create() {
        return builder().build();
    }

    /**
     * @return items
     */
    public java.util.List<IdentityToBenefitPkgMapping> getItems() {
        return this.items;
    }

    public static final class Builder {
        private java.util.List<IdentityToBenefitPkgMapping> items; 

        /**
         * <p>The information about the benefit packages that are associated with an entity.</p>
         */
        public Builder items(java.util.List<IdentityToBenefitPkgMapping> items) {
            this.items = items;
            return this;
        }

        public ListIdentityToBenefitPkgMappingResponseBody build() {
            return new ListIdentityToBenefitPkgMappingResponseBody(this);
        } 

    } 

}
