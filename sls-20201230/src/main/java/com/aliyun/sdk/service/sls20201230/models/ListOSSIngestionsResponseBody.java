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
 * {@link ListOSSIngestionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListOSSIngestionsResponseBody</p>
 */
public class ListOSSIngestionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("count")
    private Integer count;

    @com.aliyun.core.annotation.NameInMap("results")
    private java.util.List<OSSIngestion> results;

    @com.aliyun.core.annotation.NameInMap("total")
    private Integer total;

    private ListOSSIngestionsResponseBody(Builder builder) {
        this.count = builder.count;
        this.results = builder.results;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListOSSIngestionsResponseBody create() {
        return builder().build();
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * @return results
     */
    public java.util.List<OSSIngestion> getResults() {
        return this.results;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private Integer count; 
        private java.util.List<OSSIngestion> results; 
        private Integer total; 

        /**
         * <p>The number of OSS data import jobs that are returned.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * <p>The OSS data import jobs.</p>
         */
        public Builder results(java.util.List<OSSIngestion> results) {
            this.results = results;
            return this;
        }

        /**
         * <p>The total number of OSS data import jobs in the project.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public ListOSSIngestionsResponseBody build() {
            return new ListOSSIngestionsResponseBody(this);
        } 

    } 

}
