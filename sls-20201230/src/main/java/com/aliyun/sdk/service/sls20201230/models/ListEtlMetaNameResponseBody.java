// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link ListEtlMetaNameResponseBody} extends {@link TeaModel}
 *
 * <p>ListEtlMetaNameResponseBody</p>
 */
public class ListEtlMetaNameResponseBody extends TeaModel {
    @NameInMap("count")
    private Integer count;

    @NameInMap("etlMetaNameList")
    private java.util.List < String > etlMetaNameList;

    @NameInMap("total")
    private Integer total;

    private ListEtlMetaNameResponseBody(Builder builder) {
        this.count = builder.count;
        this.etlMetaNameList = builder.etlMetaNameList;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEtlMetaNameResponseBody create() {
        return builder().build();
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * @return etlMetaNameList
     */
    public java.util.List < String > getEtlMetaNameList() {
        return this.etlMetaNameList;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private Integer count; 
        private java.util.List < String > etlMetaNameList; 
        private Integer total; 

        /**
         * count.
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * etlMetaNameList.
         */
        public Builder etlMetaNameList(java.util.List < String > etlMetaNameList) {
            this.etlMetaNameList = etlMetaNameList;
            return this;
        }

        /**
         * total.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public ListEtlMetaNameResponseBody build() {
            return new ListEtlMetaNameResponseBody(this);
        } 

    } 

}
