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
 * {@link ListAnnotationDataSetsResponseBody} extends {@link TeaModel}
 *
 * <p>ListAnnotationDataSetsResponseBody</p>
 */
public class ListAnnotationDataSetsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private java.util.List<MLDataSetParam> data;

    @com.aliyun.core.annotation.NameInMap("total")
    private Integer total;

    private ListAnnotationDataSetsResponseBody(Builder builder) {
        this.data = builder.data;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAnnotationDataSetsResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List<MLDataSetParam> getData() {
        return this.data;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private java.util.List<MLDataSetParam> data; 
        private Integer total; 

        /**
         * <p>The data returned.</p>
         */
        public Builder data(java.util.List<MLDataSetParam> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public ListAnnotationDataSetsResponseBody build() {
            return new ListAnnotationDataSetsResponseBody(this);
        } 

    } 

}
