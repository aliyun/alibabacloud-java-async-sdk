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
 * {@link UnifiedSearchInformation} extends {@link TeaModel}
 *
 * <p>UnifiedSearchInformation</p>
 */
public class UnifiedSearchInformation extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("searchTime")
    private Long searchTime;

    private UnifiedSearchInformation(Builder builder) {
        this.searchTime = builder.searchTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UnifiedSearchInformation create() {
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

    public static final class Builder {
        private Long searchTime; 

        private Builder() {
        } 

        private Builder(UnifiedSearchInformation model) {
            this.searchTime = model.searchTime;
        } 

        /**
         * searchTime.
         */
        public Builder searchTime(Long searchTime) {
            this.searchTime = searchTime;
            return this;
        }

        public UnifiedSearchInformation build() {
            return new UnifiedSearchInformation(this);
        } 

    } 

}
