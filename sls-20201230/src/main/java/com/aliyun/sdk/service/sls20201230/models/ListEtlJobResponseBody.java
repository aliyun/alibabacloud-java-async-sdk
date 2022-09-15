// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link ListEtlJobResponseBody} extends {@link TeaModel}
 *
 * <p>ListEtlJobResponseBody</p>
 */
public class ListEtlJobResponseBody extends TeaModel {
    @NameInMap("count")
    private Integer count;

    @NameInMap("etlJobNameList")
    private java.util.List < String > etlJobNameList;

    @NameInMap("total")
    private Integer total;

    private ListEtlJobResponseBody(Builder builder) {
        this.count = builder.count;
        this.etlJobNameList = builder.etlJobNameList;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEtlJobResponseBody create() {
        return builder().build();
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * @return etlJobNameList
     */
    public java.util.List < String > getEtlJobNameList() {
        return this.etlJobNameList;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private Integer count; 
        private java.util.List < String > etlJobNameList; 
        private Integer total; 

        /**
         * count.
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * etlJobNameList.
         */
        public Builder etlJobNameList(java.util.List < String > etlJobNameList) {
            this.etlJobNameList = etlJobNameList;
            return this;
        }

        /**
         * total.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public ListEtlJobResponseBody build() {
            return new ListEtlJobResponseBody(this);
        } 

    } 

}
