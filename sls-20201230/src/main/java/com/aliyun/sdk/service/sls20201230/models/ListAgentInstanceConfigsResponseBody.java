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
 * {@link ListAgentInstanceConfigsResponseBody} extends {@link TeaModel}
 *
 * <p>ListAgentInstanceConfigsResponseBody</p>
 */
public class ListAgentInstanceConfigsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("configs")
    private java.util.List<String> configs;

    @com.aliyun.core.annotation.NameInMap("size")
    private Long size;

    @com.aliyun.core.annotation.NameInMap("total")
    private Long total;

    private ListAgentInstanceConfigsResponseBody(Builder builder) {
        this.configs = builder.configs;
        this.size = builder.size;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAgentInstanceConfigsResponseBody create() {
        return builder().build();
    }

    /**
     * @return configs
     */
    public java.util.List<String> getConfigs() {
        return this.configs;
    }

    /**
     * @return size
     */
    public Long getSize() {
        return this.size;
    }

    /**
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    public static final class Builder {
        private java.util.List<String> configs; 
        private Long size; 
        private Long total; 

        /**
         * configs.
         */
        public Builder configs(java.util.List<String> configs) {
            this.configs = configs;
            return this;
        }

        /**
         * size.
         */
        public Builder size(Long size) {
            this.size = size;
            return this;
        }

        /**
         * total.
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public ListAgentInstanceConfigsResponseBody build() {
            return new ListAgentInstanceConfigsResponseBody(this);
        } 

    } 

}
