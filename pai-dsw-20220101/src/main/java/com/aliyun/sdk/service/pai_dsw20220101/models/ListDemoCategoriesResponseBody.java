// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dsw20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDemoCategoriesResponseBody} extends {@link TeaModel}
 *
 * <p>ListDemoCategoriesResponseBody</p>
 */
public class ListDemoCategoriesResponseBody extends TeaModel {
    @NameInMap("Categories")
    private java.util.List < DemoCategory > categories;

    @NameInMap("RequestId")
    private String requestId;

    private ListDemoCategoriesResponseBody(Builder builder) {
        this.categories = builder.categories;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDemoCategoriesResponseBody create() {
        return builder().build();
    }

    /**
     * @return categories
     */
    public java.util.List < DemoCategory > getCategories() {
        return this.categories;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < DemoCategory > categories; 
        private String requestId; 

        /**
         * 样例列表
         */
        public Builder categories(java.util.List < DemoCategory > categories) {
            this.categories = categories;
            return this;
        }

        /**
         * 请求Id
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListDemoCategoriesResponseBody build() {
            return new ListDemoCategoriesResponseBody(this);
        } 

    } 

}
