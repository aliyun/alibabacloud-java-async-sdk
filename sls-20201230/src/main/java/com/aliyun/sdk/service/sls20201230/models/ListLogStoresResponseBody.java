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
 * {@link ListLogStoresResponseBody} extends {@link TeaModel}
 *
 * <p>ListLogStoresResponseBody</p>
 */
public class ListLogStoresResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("count")
    private Integer count;

    @com.aliyun.core.annotation.NameInMap("logstores")
    private java.util.List<String> logstores;

    @com.aliyun.core.annotation.NameInMap("total")
    private Integer total;

    private ListLogStoresResponseBody(Builder builder) {
        this.count = builder.count;
        this.logstores = builder.logstores;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListLogStoresResponseBody create() {
        return builder().build();
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * @return logstores
     */
    public java.util.List<String> getLogstores() {
        return this.logstores;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private Integer count; 
        private java.util.List<String> logstores; 
        private Integer total; 

        /**
         * <p>The number of entries returned on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * <p>The Logstores that meet the query conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;test-1&quot;,&quot;test-2&quot;]</p>
         */
        public Builder logstores(java.util.List<String> logstores) {
            this.logstores = logstores;
            return this;
        }

        /**
         * <p>The number of the Logstores that meet the query conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public ListLogStoresResponseBody build() {
            return new ListLogStoresResponseBody(this);
        } 

    } 

}
