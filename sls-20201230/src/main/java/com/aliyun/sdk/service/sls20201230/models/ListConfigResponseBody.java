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
 * {@link ListConfigResponseBody} extends {@link TeaModel}
 *
 * <p>ListConfigResponseBody</p>
 */
public class ListConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("configs")
    private java.util.List<String> configs;

    @com.aliyun.core.annotation.NameInMap("count")
    private Integer count;

    @com.aliyun.core.annotation.NameInMap("total")
    private Integer total;

    private ListConfigResponseBody(Builder builder) {
        this.configs = builder.configs;
        this.count = builder.count;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return configs
     */
    public java.util.List<String> getConfigs() {
        return this.configs;
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private java.util.List<String> configs; 
        private Integer count; 
        private Integer total; 

        /**
         * <p>The Logtail configurations that are returned on the current page.</p>
         */
        public Builder configs(java.util.List<String> configs) {
            this.configs = configs;
            return this;
        }

        /**
         * <p>The number of Logtail configurations that are returned on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * <p>The total number of Logtail configurations that meet the query conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public ListConfigResponseBody build() {
            return new ListConfigResponseBody(this);
        } 

    } 

}
