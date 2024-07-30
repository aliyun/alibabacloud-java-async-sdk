// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenestsupplier20210521.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListServiceCategoriesResponseBody} extends {@link TeaModel}
 *
 * <p>ListServiceCategoriesResponseBody</p>
 */
public class ListServiceCategoriesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Categories")
    private java.util.List < String > categories;

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

    /**
     * @return categories
     */
    public java.util.List < String > getCategories() {
        return this.categories;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < String > categories; 
        private String requestId; 

        /**
         * The category list of the service.
         */
        public Builder categories(java.util.List < String > categories) {
            this.categories = categories;
            return this;
        }

        /**
         * Id of the request
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
