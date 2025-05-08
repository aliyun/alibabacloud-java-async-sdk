// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iqs20241111.models;

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
 * {@link SearchCredits} extends {@link TeaModel}
 *
 * <p>SearchCredits</p>
 */
public class SearchCredits extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("genericTextSearch")
    private Integer genericTextSearch;

    private SearchCredits(Builder builder) {
        this.genericTextSearch = builder.genericTextSearch;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchCredits create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return genericTextSearch
     */
    public Integer getGenericTextSearch() {
        return this.genericTextSearch;
    }

    public static final class Builder {
        private Integer genericTextSearch; 

        private Builder() {
        } 

        private Builder(SearchCredits model) {
            this.genericTextSearch = model.genericTextSearch;
        } 

        /**
         * genericTextSearch.
         */
        public Builder genericTextSearch(Integer genericTextSearch) {
            this.genericTextSearch = genericTextSearch;
            return this;
        }

        public SearchCredits build() {
            return new SearchCredits(this);
        } 

    } 

}
