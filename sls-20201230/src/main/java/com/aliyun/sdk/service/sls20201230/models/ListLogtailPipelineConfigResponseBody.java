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
 * {@link ListLogtailPipelineConfigResponseBody} extends {@link TeaModel}
 *
 * <p>ListLogtailPipelineConfigResponseBody</p>
 */
public class ListLogtailPipelineConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("configs")
    private java.util.List<String> configs;

    @com.aliyun.core.annotation.NameInMap("count")
    private Integer count;

    @com.aliyun.core.annotation.NameInMap("total")
    private Integer total;

    private ListLogtailPipelineConfigResponseBody(Builder builder) {
        this.configs = builder.configs;
        this.count = builder.count;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListLogtailPipelineConfigResponseBody create() {
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
         * <p>The Logtail pipeline configurations that are returned on the current page.</p>
         */
        public Builder configs(java.util.List<String> configs) {
            this.configs = configs;
            return this;
        }

        /**
         * <p>The number of Logtail pipeline configurations that are returned on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * <p>The total number of Logtail pipeline configurations in the current project.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public ListLogtailPipelineConfigResponseBody build() {
            return new ListLogtailPipelineConfigResponseBody(this);
        } 

    } 

}
