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
 * {@link ListAnnotationLabelsResponseBody} extends {@link TeaModel}
 *
 * <p>ListAnnotationLabelsResponseBody</p>
 */
public class ListAnnotationLabelsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private java.util.List<MLLabelParam> data;

    @com.aliyun.core.annotation.NameInMap("total")
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<MLLabelParam> getData() {
        return this.data;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private java.util.List<MLLabelParam> data; 
        private Integer total; 

        private Builder() {
        } 

        private Builder(ListAnnotationLabelsResponseBody model) {
            this.data = model.data;
            this.total = model.total;
        } 

        /**
         * <p>The data returned.</p>
         */
        public Builder data(java.util.List<MLLabelParam> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The total number of tags that meet the query conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
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
