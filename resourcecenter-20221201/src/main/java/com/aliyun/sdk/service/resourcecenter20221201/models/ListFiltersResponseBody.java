// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcecenter20221201.models;

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
 * {@link ListFiltersResponseBody} extends {@link TeaModel}
 *
 * <p>ListFiltersResponseBody</p>
 */
public class ListFiltersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DefaultFilterName")
    private String defaultFilterName;

    @com.aliyun.core.annotation.NameInMap("Filters")
    private java.util.List<Filters> filters;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListFiltersResponseBody(Builder builder) {
        this.defaultFilterName = builder.defaultFilterName;
        this.filters = builder.filters;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFiltersResponseBody create() {
        return builder().build();
    }

    /**
     * @return defaultFilterName
     */
    public String getDefaultFilterName() {
        return this.defaultFilterName;
    }

    /**
     * @return filters
     */
    public java.util.List<Filters> getFilters() {
        return this.filters;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String defaultFilterName; 
        private java.util.List<Filters> filters; 
        private String requestId; 

        /**
         * <p>The name of the default filter.</p>
         * 
         * <strong>example:</strong>
         * <p>My Filters</p>
         */
        public Builder defaultFilterName(String defaultFilterName) {
            this.defaultFilterName = defaultFilterName;
            return this;
        }

        /**
         * <p>The configurations of the filter.</p>
         */
        public Builder filters(java.util.List<Filters> filters) {
            this.filters = filters;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>AA39FB9C-CB74-5E73-8DFE-3A2B096F0759</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListFiltersResponseBody build() {
            return new ListFiltersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListFiltersResponseBody} extends {@link TeaModel}
     *
     * <p>ListFiltersResponseBody</p>
     */
    public static class Filters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FilterConfiguration")
        @com.aliyun.core.annotation.Validation(required = true)
        private String filterConfiguration;

        @com.aliyun.core.annotation.NameInMap("FilterName")
        private String filterName;

        private Filters(Builder builder) {
            this.filterConfiguration = builder.filterConfiguration;
            this.filterName = builder.filterName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Filters create() {
            return builder().build();
        }

        /**
         * @return filterConfiguration
         */
        public String getFilterConfiguration() {
            return this.filterConfiguration;
        }

        /**
         * @return filterName
         */
        public String getFilterName() {
            return this.filterName;
        }

        public static final class Builder {
            private String filterConfiguration; 
            private String filterName; 

            /**
             * <p>The configurations of the filter.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *   &quot;regions&quot;: [],
             *   &quot;tagFilters&quot;: [
             *     [{ &quot;type&quot;: &quot;notContainTagKey&quot;, &quot;tagKey&quot;: &quot;xxx&quot;, &quot;tagValue&quot;: &quot;&quot; }],
             *     [{ &quot;tagKey&quot;: &quot;xxx&quot;, &quot;tagValue&quot;: &quot;xxx&quot; }]
             *   ],
             *   &quot;resourceTypes&quot;: [
             *     &quot;ACS::ECS::AutoSnapshotPolicy&quot;
             *   ]
             * }</p>
             */
            public Builder filterConfiguration(String filterConfiguration) {
                this.filterConfiguration = filterConfiguration;
                return this;
            }

            /**
             * <p>The name of the filter.</p>
             * 
             * <strong>example:</strong>
             * <p>My devices</p>
             */
            public Builder filterName(String filterName) {
                this.filterName = filterName;
                return this;
            }

            public Filters build() {
                return new Filters(this);
            } 

        } 

    }
}
