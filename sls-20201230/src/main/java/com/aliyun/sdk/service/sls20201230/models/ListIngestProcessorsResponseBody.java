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
 * {@link ListIngestProcessorsResponseBody} extends {@link TeaModel}
 *
 * <p>ListIngestProcessorsResponseBody</p>
 */
public class ListIngestProcessorsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("count")
    private Integer count;

    @com.aliyun.core.annotation.NameInMap("processors")
    private java.util.List<IngestProcessor> processors;

    @com.aliyun.core.annotation.NameInMap("total")
    private Integer total;

    private ListIngestProcessorsResponseBody(Builder builder) {
        this.count = builder.count;
        this.processors = builder.processors;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListIngestProcessorsResponseBody create() {
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
    public java.util.List<IngestProcessor> getProcessors() {
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
        private java.util.List<IngestProcessor> processors; 
        private Integer total; 

        private Builder() {
        } 

        private Builder(ListIngestProcessorsResponseBody model) {
            this.count = model.count;
            this.processors = model.processors;
            this.total = model.total;
        } 

        /**
         * <p>The number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * <p>The ingest processors that are returned.</p>
         */
        public Builder processors(java.util.List<IngestProcessor> processors) {
            this.processors = processors;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public ListIngestProcessorsResponseBody build() {
            return new ListIngestProcessorsResponseBody(this);
        } 

    } 

}
