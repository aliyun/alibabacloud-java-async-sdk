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
 * {@link SearchShareLinkResponseBody} extends {@link TeaModel}
 *
 * <p>SearchShareLinkResponseBody</p>
 */
public class SearchShareLinkResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("items")
    private java.util.List<ShareLink> items;

    @com.aliyun.core.annotation.NameInMap("next_marker")
    private String nextMarker;

    @com.aliyun.core.annotation.NameInMap("total_count")
    private Long totalCount;

    private SearchShareLinkResponseBody(Builder builder) {
        this.items = builder.items;
        this.nextMarker = builder.nextMarker;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchShareLinkResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return items
     */
    public java.util.List<ShareLink> getItems() {
        return this.items;
    }

    /**
     * @return nextMarker
     */
    public String getNextMarker() {
        return this.nextMarker;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<ShareLink> items; 
        private String nextMarker; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(SearchShareLinkResponseBody model) {
            this.items = model.items;
            this.nextMarker = model.nextMarker;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The share URLs.</p>
         */
        public Builder items(java.util.List<ShareLink> items) {
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

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>101</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public SearchShareLinkResponseBody build() {
            return new SearchShareLinkResponseBody(this);
        } 

    } 

}
