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
 * {@link ListConsumeProcessorsResponseBody} extends {@link TeaModel}
 *
 * <p>ListConsumeProcessorsResponseBody</p>
 */
public class ListConsumeProcessorsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("count")
    private Integer count;

    @com.aliyun.core.annotation.NameInMap("processors")
    private java.util.List<ConsumeProcessor> processors;

    @com.aliyun.core.annotation.NameInMap("total")
    private Integer total;

    private ListConsumeProcessorsResponseBody(Builder builder) {
        this.count = builder.count;
        this.processors = builder.processors;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListConsumeProcessorsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * @return processors
     */
    public java.util.List<ConsumeProcessor> getProcessors() {
        return this.processors;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private Integer count; 
        private java.util.List<ConsumeProcessor> processors; 
        private Integer total; 

        private Builder() {
        } 

        private Builder(ListConsumeProcessorsResponseBody model) {
            this.count = model.count;
            this.processors = model.processors;
            this.total = model.total;
        } 

        /**
         * <p>The number of consumption processors for offset.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * <p>The list of consumption processor information.</p>
         */
        public Builder processors(java.util.List<ConsumeProcessor> processors) {
            this.processors = processors;
            return this;
        }

        /**
         * <p>The total number of consumption processors that meet the query conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public ListConsumeProcessorsResponseBody build() {
            return new ListConsumeProcessorsResponseBody(this);
        } 

    } 

}
