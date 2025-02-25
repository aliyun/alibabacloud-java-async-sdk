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
 * {@link ListSavedSearchResponseBody} extends {@link TeaModel}
 *
 * <p>ListSavedSearchResponseBody</p>
 */
public class ListSavedSearchResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("count")
    private Integer count;

    @com.aliyun.core.annotation.NameInMap("savedsearchItems")
    private java.util.List<SavedSearch> savedsearchItems;

    @com.aliyun.core.annotation.NameInMap("total")
    private Integer total;

    private ListSavedSearchResponseBody(Builder builder) {
        this.count = builder.count;
        this.savedsearchItems = builder.savedsearchItems;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSavedSearchResponseBody create() {
        return builder().build();
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * @return savedsearchItems
     */
    public java.util.List<SavedSearch> getSavedsearchItems() {
        return this.savedsearchItems;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private Integer count; 
        private java.util.List<SavedSearch> savedsearchItems; 
        private Integer total; 

        /**
         * <p>The number of saved searches returned on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * <p>The saved searches.</p>
         * 
         * <strong>example:</strong>
         * <p>[ &quot;test-1&quot;, &quot;test-2&quot; ]</p>
         */
        public Builder savedsearchItems(java.util.List<SavedSearch> savedsearchItems) {
            this.savedsearchItems = savedsearchItems;
            return this;
        }

        /**
         * <p>The total number of saved searches that meet the query conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public ListSavedSearchResponseBody build() {
            return new ListSavedSearchResponseBody(this);
        } 

    } 

}
