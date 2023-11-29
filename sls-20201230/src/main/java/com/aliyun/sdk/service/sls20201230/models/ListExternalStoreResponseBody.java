// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link ListExternalStoreResponseBody} extends {@link TeaModel}
 *
 * <p>ListExternalStoreResponseBody</p>
 */
public class ListExternalStoreResponseBody extends TeaModel {
    @NameInMap("count")
    private Integer count;

    @NameInMap("externalstores")
    private java.util.List < ExternalStore > externalstores;

    @NameInMap("total")
    private Integer total;

    private ListExternalStoreResponseBody(Builder builder) {
        this.count = builder.count;
        this.externalstores = builder.externalstores;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListExternalStoreResponseBody create() {
        return builder().build();
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * @return externalstores
     */
    public java.util.List < ExternalStore > getExternalstores() {
        return this.externalstores;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private Integer count; 
        private java.util.List < ExternalStore > externalstores; 
        private Integer total; 

        /**
         * The number of external stores returned on the current page.
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * The names of the external stores.
         */
        public Builder externalstores(java.util.List < ExternalStore > externalstores) {
            this.externalstores = externalstores;
            return this;
        }

        /**
         * The number of external stores that meet the query conditions.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public ListExternalStoreResponseBody build() {
            return new ListExternalStoreResponseBody(this);
        } 

    } 

}
