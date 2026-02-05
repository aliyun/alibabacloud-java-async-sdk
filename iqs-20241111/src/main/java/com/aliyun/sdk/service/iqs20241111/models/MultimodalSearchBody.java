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
 * {@link MultimodalSearchBody} extends {@link TeaModel}
 *
 * <p>MultimodalSearchBody</p>
 */
public class MultimodalSearchBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("advancedParams")
    private java.util.Map<String, ?> advancedParams;

    @com.aliyun.core.annotation.NameInMap("query")
    private String query;

    private MultimodalSearchBody(Builder builder) {
        this.advancedParams = builder.advancedParams;
        this.query = builder.query;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MultimodalSearchBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return advancedParams
     */
    public java.util.Map<String, ?> getAdvancedParams() {
        return this.advancedParams;
    }

    /**
     * @return query
     */
    public String getQuery() {
        return this.query;
    }

    public static final class Builder {
        private java.util.Map<String, ?> advancedParams; 
        private String query; 

        private Builder() {
        } 

        private Builder(MultimodalSearchBody model) {
            this.advancedParams = model.advancedParams;
            this.query = model.query;
        } 

        /**
         * advancedParams.
         */
        public Builder advancedParams(java.util.Map<String, ?> advancedParams) {
            this.advancedParams = advancedParams;
            return this;
        }

        /**
         * query.
         */
        public Builder query(String query) {
            this.query = query;
            return this;
        }

        public MultimodalSearchBody build() {
            return new MultimodalSearchBody(this);
        } 

    } 

}
