// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link ListEtlMetaResponseBody} extends {@link TeaModel}
 *
 * <p>ListEtlMetaResponseBody</p>
 */
public class ListEtlMetaResponseBody extends TeaModel {
    @NameInMap("etlMetaList")
    private java.util.List < EtlMeta > etlMetaList;

    @NameInMap("total")
    private Integer total;

    private ListEtlMetaResponseBody(Builder builder) {
        this.etlMetaList = builder.etlMetaList;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEtlMetaResponseBody create() {
        return builder().build();
    }

    /**
     * @return etlMetaList
     */
    public java.util.List < EtlMeta > getEtlMetaList() {
        return this.etlMetaList;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private java.util.List < EtlMeta > etlMetaList; 
        private Integer total; 

        /**
         * etlMetaList.
         */
        public Builder etlMetaList(java.util.List < EtlMeta > etlMetaList) {
            this.etlMetaList = etlMetaList;
            return this;
        }

        /**
         * total.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public ListEtlMetaResponseBody build() {
            return new ListEtlMetaResponseBody(this);
        } 

    } 

}
