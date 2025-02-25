// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.sdk.gateway.sls.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * 
 * {@link ListDomainsResponseBody} extends {@link TeaModel}
 *
 * <p>ListDomainsResponseBody</p>
 */
public class ListDomainsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("count")
    private Long count;

    @com.aliyun.core.annotation.NameInMap("domains")
    private java.util.List<String> domains;

    @com.aliyun.core.annotation.NameInMap("total")
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
    public java.util.List<String> getDomains() {
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
        private java.util.List<String> domains; 
        private Long total; 

        /**
         * <p>The number of domain names that are returned on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder count(Long count) {
            this.count = count;
            return this;
        }

        /**
         * <p>The domain names.</p>
         */
        public Builder domains(java.util.List<String> domains) {
            this.domains = domains;
            return this;
        }

        /**
         * <p>The total number of domain names that are returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
