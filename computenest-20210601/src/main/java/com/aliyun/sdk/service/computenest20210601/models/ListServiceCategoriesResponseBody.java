// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenest20210601.models;

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
 * {@link ListServiceCategoriesResponseBody} extends {@link TeaModel}
 *
 * <p>ListServiceCategoriesResponseBody</p>
 */
public class ListServiceCategoriesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Categories")
    private java.util.List<String> categories;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListServiceCategoriesResponseBody(Builder builder) {
        this.categories = builder.categories;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListServiceCategoriesResponseBody create() {
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<String> categories; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListServiceCategoriesResponseBody model) {
            this.categories = model.categories;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The category list of the service.</p>
         */
        public Builder categories(java.util.List<String> categories) {
            this.categories = categories;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>13FE89A5-C036-56BF-A0FF-A31C59819FD7</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListServiceCategoriesResponseBody build() {
            return new ListServiceCategoriesResponseBody(this);
        } 

    } 

}
