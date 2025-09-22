// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeExcuteNumResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeExcuteNumResponseBody</p>
 */
public class DescribeExcuteNumResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Categories")
    private java.util.List<String> categories;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<String> data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeExcuteNumResponseBody(Builder builder) {
        this.categories = builder.categories;
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeExcuteNumResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return categories
     */
    public java.util.List<String> getCategories() {
        return this.categories;
    }

    /**
     * @return data
     */
    public java.util.List<String> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<String> categories; 
        private java.util.List<String> data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeExcuteNumResponseBody model) {
            this.categories = model.categories;
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Service category names.</p>
         */
        public Builder categories(java.util.List<String> categories) {
            this.categories = categories;
            return this;
        }

        /**
         * <p>Returned data.</p>
         */
        public Builder data(java.util.List<String> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A32FE941-35F2-5378-B37C-4B8FDB16F094</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeExcuteNumResponseBody build() {
            return new DescribeExcuteNumResponseBody(this);
        } 

    } 

}
