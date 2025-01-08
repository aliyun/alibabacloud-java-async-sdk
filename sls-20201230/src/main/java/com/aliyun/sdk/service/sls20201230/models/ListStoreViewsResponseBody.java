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
 * {@link ListStoreViewsResponseBody} extends {@link TeaModel}
 *
 * <p>ListStoreViewsResponseBody</p>
 */
public class ListStoreViewsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("count")
    private Integer count;

    @com.aliyun.core.annotation.NameInMap("storeviews")
    private java.util.List<String> storeviews;

    @com.aliyun.core.annotation.NameInMap("total")
    private Integer total;

    private ListStoreViewsResponseBody(Builder builder) {
        this.count = builder.count;
        this.storeviews = builder.storeviews;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListStoreViewsResponseBody create() {
        return builder().build();
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * @return storeviews
     */
    public java.util.List<String> getStoreviews() {
        return this.storeviews;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private Integer count; 
        private java.util.List<String> storeviews; 
        private Integer total; 

        /**
         * <p>The number of returned datasets.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * <p>The dataset names.</p>
         */
        public Builder storeviews(java.util.List<String> storeviews) {
            this.storeviews = storeviews;
            return this;
        }

        /**
         * <p>The total number of datasets in the project.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public ListStoreViewsResponseBody build() {
            return new ListStoreViewsResponseBody(this);
        } 

    } 

}
