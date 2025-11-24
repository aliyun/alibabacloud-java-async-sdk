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

    @com.aliyun.core.annotation.NameInMap("liteAdvancedTextSearch")
    private Integer liteAdvancedTextSearch;

    private SearchCredits(Builder builder) {
        this.genericTextSearch = builder.genericTextSearch;
        this.liteAdvancedTextSearch = builder.liteAdvancedTextSearch;
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

    /**
     * @return liteAdvancedTextSearch
     */
    public Integer getLiteAdvancedTextSearch() {
        return this.liteAdvancedTextSearch;
    }

    public static final class Builder {
        private Integer genericTextSearch; 
        private Integer liteAdvancedTextSearch; 

        private Builder() {
        } 

        private Builder(SearchCredits model) {
            this.genericTextSearch = model.genericTextSearch;
            this.liteAdvancedTextSearch = model.liteAdvancedTextSearch;
        } 

        /**
         * genericTextSearch.
         */
        public Builder genericTextSearch(Integer genericTextSearch) {
            this.genericTextSearch = genericTextSearch;
            return this;
        }

        /**
         * liteAdvancedTextSearch.
         */
        public Builder liteAdvancedTextSearch(Integer liteAdvancedTextSearch) {
            this.liteAdvancedTextSearch = liteAdvancedTextSearch;
            return this;
        }

        public SearchCredits build() {
            return new SearchCredits(this);
        } 

    } 

}
