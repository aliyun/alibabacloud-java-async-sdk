// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link ListProductAbilitiesResponseBody} extends {@link TeaModel}
 *
 * <p>ListProductAbilitiesResponseBody</p>
 */
public class ListProductAbilitiesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ProductAbilities")
    private java.util.List<String> productAbilities;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListProductAbilitiesResponseBody(Builder builder) {
        this.productAbilities = builder.productAbilities;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProductAbilitiesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return productAbilities
     */
    public java.util.List<String> getProductAbilities() {
        return this.productAbilities;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<String> productAbilities; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListProductAbilitiesResponseBody model) {
            this.productAbilities = model.productAbilities;
            this.requestId = model.requestId;
        } 

        /**
         * ProductAbilities.
         */
        public Builder productAbilities(java.util.List<String> productAbilities) {
            this.productAbilities = productAbilities;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListProductAbilitiesResponseBody build() {
            return new ListProductAbilitiesResponseBody(this);
        } 

    } 

}
