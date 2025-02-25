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
 * {@link ListFacegroupsResponseBody} extends {@link TeaModel}
 *
 * <p>ListFacegroupsResponseBody</p>
 */
public class ListFacegroupsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("items")
    private java.util.List<FaceGroup> items;

    @com.aliyun.core.annotation.NameInMap("next_marker")
    private String nextMarker;

    @com.aliyun.core.annotation.NameInMap("total_count")
    private Long totalCount;

    private ListFacegroupsResponseBody(Builder builder) {
        this.items = builder.items;
        this.nextMarker = builder.nextMarker;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFacegroupsResponseBody create() {
        return builder().build();
    }

    /**
     * @return items
     */
    public java.util.List<FaceGroup> getItems() {
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
        private java.util.List<FaceGroup> items; 
        private String nextMarker; 
        private Long totalCount; 

        /**
         * <p>The information about the face-based groups.</p>
         */
        public Builder items(java.util.List<FaceGroup> items) {
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
         * total_count.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListFacegroupsResponseBody build() {
            return new ListFacegroupsResponseBody(this);
        } 

    } 

}
