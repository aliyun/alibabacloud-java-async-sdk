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
 * {@link SearchDomainsResponseBody} extends {@link TeaModel}
 *
 * <p>SearchDomainsResponseBody</p>
 */
public class SearchDomainsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("items")
    private java.util.List<Domain> items;

    @com.aliyun.core.annotation.NameInMap("next_marker")
    private String nextMarker;

    private SearchDomainsResponseBody(Builder builder) {
        this.items = builder.items;
        this.nextMarker = builder.nextMarker;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchDomainsResponseBody create() {
        return builder().build();
    }

    /**
     * @return items
     */
    public java.util.List<Domain> getItems() {
        return this.items;
    }

    /**
     * @return nextMarker
     */
    public String getNextMarker() {
        return this.nextMarker;
    }

    public static final class Builder {
        private java.util.List<Domain> items; 
        private String nextMarker; 

        /**
         * <p>The queried domains.</p>
         */
        public Builder items(java.util.List<Domain> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>A pagination token. It can be used in the next request to retrieve a new page of results. If next_marker is empty, no next page exists.</p>
         * 
         * <strong>example:</strong>
         * <p>NWQ1Yjk4YmI1ZDRlYmU1Y2E0YWE0NmJhYWJmODBhNDQ2NzhlMTRhMg</p>
         */
        public Builder nextMarker(String nextMarker) {
            this.nextMarker = nextMarker;
            return this;
        }

        public SearchDomainsResponseBody build() {
            return new SearchDomainsResponseBody(this);
        } 

    } 

}
