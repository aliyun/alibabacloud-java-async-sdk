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
 * {@link ListMyDrivesResponseBody} extends {@link TeaModel}
 *
 * <p>ListMyDrivesResponseBody</p>
 */
public class ListMyDrivesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("items")
    private java.util.List<Drive> items;

    @com.aliyun.core.annotation.NameInMap("next_marker")
    private String nextMarker;

    private ListMyDrivesResponseBody(Builder builder) {
        this.items = builder.items;
        this.nextMarker = builder.nextMarker;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMyDrivesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return items
     */
    public java.util.List<Drive> getItems() {
        return this.items;
    }

    /**
     * @return nextMarker
     */
    public String getNextMarker() {
        return this.nextMarker;
    }

    public static final class Builder {
        private java.util.List<Drive> items; 
        private String nextMarker; 

        private Builder() {
        } 

        private Builder(ListMyDrivesResponseBody model) {
            this.items = model.items;
            this.nextMarker = model.nextMarker;
        } 

        /**
         * <p>The queried drives.</p>
         */
        public Builder items(java.util.List<Drive> items) {
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

        public ListMyDrivesResponseBody build() {
            return new ListMyDrivesResponseBody(this);
        } 

    } 

}
