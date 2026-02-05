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
 * {@link MultimodalQueryContext} extends {@link TeaModel}
 *
 * <p>MultimodalQueryContext</p>
 */
public class MultimodalQueryContext extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("originalQuery")
    private MultimodalOriginalQuery originalQuery;

    private MultimodalQueryContext(Builder builder) {
        this.originalQuery = builder.originalQuery;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MultimodalQueryContext create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return originalQuery
     */
    public MultimodalOriginalQuery getOriginalQuery() {
        return this.originalQuery;
    }

    public static final class Builder {
        private MultimodalOriginalQuery originalQuery; 

        private Builder() {
        } 

        private Builder(MultimodalQueryContext model) {
            this.originalQuery = model.originalQuery;
        } 

        /**
         * originalQuery.
         */
        public Builder originalQuery(MultimodalOriginalQuery originalQuery) {
            this.originalQuery = originalQuery;
            return this;
        }

        public MultimodalQueryContext build() {
            return new MultimodalQueryContext(this);
        } 

    } 

}
