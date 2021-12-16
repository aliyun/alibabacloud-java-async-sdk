// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ListLogStoresResponseBody} extends {@link TeaModel}
 *
 * <p>ListLogStoresResponseBody</p>
 */
public class ListLogStoresResponseBody extends TeaModel {
    @NameInMap("logstores")
    private java.util.List < String > logstores;

    @NameInMap("total")
    private Integer total;


    private ListLogStoresResponseBody(Builder builder) {
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
        private java.util.List < String > logstores; 
        private Integer total; 

        /**
         * <p>logstores.</p>
         */
        public Builder logstores(java.util.List < String > logstores) {
            this.logstores = logstores;
            return this;
        }

        /**
         * <p>total.</p>
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
