// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link ListAnnotationLabelsResponseBody} extends {@link TeaModel}
 *
 * <p>ListAnnotationLabelsResponseBody</p>
 */
public class ListAnnotationLabelsResponseBody extends TeaModel {
    @NameInMap("data")
    private java.util.List < MLLabelParam > data;

    @NameInMap("total")
    private Integer total;

    private ListAnnotationLabelsResponseBody(Builder builder) {
        this.data = builder.data;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAnnotationLabelsResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < MLLabelParam > getData() {
        return this.data;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private java.util.List < MLLabelParam > data; 
        private Integer total; 

        /**
         * data.
         */
        public Builder data(java.util.List < MLLabelParam > data) {
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

        public ListAnnotationLabelsResponseBody build() {
            return new ListAnnotationLabelsResponseBody(this);
        } 

    } 

}
