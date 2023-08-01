// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link ListLogStoresResponseBody} extends {@link TeaModel}
 *
 * <p>ListLogStoresResponseBody</p>
 */
public class ListLogStoresResponseBody extends TeaModel {
    @NameInMap("count")
    private Integer count;

    @NameInMap("logstores")
    private java.util.List < String > logstores;

    @NameInMap("total")
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
    public java.util.List < String > getLogstores() {
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
        private java.util.List < String > logstores; 
        private Integer total; 

        /**
         * count.
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * logstores.
         */
        public Builder logstores(java.util.List < String > logstores) {
            this.logstores = logstores;
            return this;
        }

        /**
         * total.
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
