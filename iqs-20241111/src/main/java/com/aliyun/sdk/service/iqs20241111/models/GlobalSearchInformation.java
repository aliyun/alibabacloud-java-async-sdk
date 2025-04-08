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
 * {@link GlobalSearchInformation} extends {@link TeaModel}
 *
 * <p>GlobalSearchInformation</p>
 */
public class GlobalSearchInformation extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("searchTime")
    private Long searchTime;

    @com.aliyun.core.annotation.NameInMap("total")
    private Long total;

    private GlobalSearchInformation(Builder builder) {
        this.searchTime = builder.searchTime;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GlobalSearchInformation create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return searchTime
     */
    public Long getSearchTime() {
        return this.searchTime;
    }

    /**
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    public static final class Builder {
        private Long searchTime; 
        private Long total; 

        private Builder() {
        } 

        private Builder(GlobalSearchInformation model) {
            this.searchTime = model.searchTime;
            this.total = model.total;
        } 

        /**
         * searchTime.
         */
        public Builder searchTime(Long searchTime) {
            this.searchTime = searchTime;
            return this;
        }

        /**
         * total.
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public GlobalSearchInformation build() {
            return new GlobalSearchInformation(this);
        } 

    } 

}
