// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link ListAnnotationDataResponseBody} extends {@link TeaModel}
 *
 * <p>ListAnnotationDataResponseBody</p>
 */
public class ListAnnotationDataResponseBody extends TeaModel {
    @NameInMap("data")
    private java.util.List < MLDataParam > data;

    @NameInMap("total")
    private Integer total;

    private ListAnnotationDataResponseBody(Builder builder) {
        this.data = builder.data;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAnnotationDataResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < MLDataParam > getData() {
        return this.data;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private java.util.List < MLDataParam > data; 
        private Integer total; 

        /**
         * data.
         */
        public Builder data(java.util.List < MLDataParam > data) {
            this.data = data;
            return this;
        }

        /**
         * total.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public ListAnnotationDataResponseBody build() {
            return new ListAnnotationDataResponseBody(this);
        } 

    } 

}
