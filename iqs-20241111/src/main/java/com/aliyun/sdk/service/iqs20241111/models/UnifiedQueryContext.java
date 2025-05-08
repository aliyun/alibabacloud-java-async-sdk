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
 * {@link UnifiedQueryContext} extends {@link TeaModel}
 *
 * <p>UnifiedQueryContext</p>
 */
public class UnifiedQueryContext extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("engineType")
    private String engineType;

    @com.aliyun.core.annotation.NameInMap("originalQuery")
    private UnifiedOriginalQuery originalQuery;

    @com.aliyun.core.annotation.NameInMap("rewrite")
    private UnifiedRewrite rewrite;

    private UnifiedQueryContext(Builder builder) {
        this.engineType = builder.engineType;
        this.originalQuery = builder.originalQuery;
        this.rewrite = builder.rewrite;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UnifiedQueryContext create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return engineType
     */
    public String getEngineType() {
        return this.engineType;
    }

    /**
     * @return originalQuery
     */
    public UnifiedOriginalQuery getOriginalQuery() {
        return this.originalQuery;
    }

    /**
     * @return rewrite
     */
    public UnifiedRewrite getRewrite() {
        return this.rewrite;
    }

    public static final class Builder {
        private String engineType; 
        private UnifiedOriginalQuery originalQuery; 
        private UnifiedRewrite rewrite; 

        private Builder() {
        } 

        private Builder(UnifiedQueryContext model) {
            this.engineType = model.engineType;
            this.originalQuery = model.originalQuery;
            this.rewrite = model.rewrite;
        } 

        /**
         * engineType.
         */
        public Builder engineType(String engineType) {
            this.engineType = engineType;
            return this;
        }

        /**
         * originalQuery.
         */
        public Builder originalQuery(UnifiedOriginalQuery originalQuery) {
            this.originalQuery = originalQuery;
            return this;
        }

        /**
         * rewrite.
         */
        public Builder rewrite(UnifiedRewrite rewrite) {
            this.rewrite = rewrite;
            return this;
        }

        public UnifiedQueryContext build() {
            return new UnifiedQueryContext(this);
        } 

    } 

}
