// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link ListDomainsResponseBody} extends {@link TeaModel}
 *
 * <p>ListDomainsResponseBody</p>
 */
public class ListDomainsResponseBody extends TeaModel {
    @NameInMap("count")
    private Long count;

    @NameInMap("domains")
    private java.util.List < String > domains;

    @NameInMap("total")
    private Long total;

    private ListDomainsResponseBody(Builder builder) {
        this.count = builder.count;
        this.domains = builder.domains;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDomainsResponseBody create() {
        return builder().build();
    }

    /**
     * @return count
     */
    public Long getCount() {
        return this.count;
    }

    /**
     * @return domains
     */
    public java.util.List < String > getDomains() {
        return this.domains;
    }

    /**
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    public static final class Builder {
        private Long count; 
        private java.util.List < String > domains; 
        private Long total; 

        /**
         * The number of domain names that are returned on the current page.
         */
        public Builder count(Long count) {
            this.count = count;
            return this;
        }

        /**
         * The domain names.
         */
        public Builder domains(java.util.List < String > domains) {
            this.domains = domains;
            return this;
        }

        /**
         * The total number of domain names that are returned.
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public ListDomainsResponseBody build() {
            return new ListDomainsResponseBody(this);
        } 

    } 

}
