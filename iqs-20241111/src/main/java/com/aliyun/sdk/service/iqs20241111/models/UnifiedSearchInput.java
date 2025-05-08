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
 * {@link UnifiedSearchInput} extends {@link TeaModel}
 *
 * <p>UnifiedSearchInput</p>
 */
public class UnifiedSearchInput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("category")
    private String category;

    @com.aliyun.core.annotation.NameInMap("contents")
    private RequestContents contents;

    @com.aliyun.core.annotation.NameInMap("engineType")
    private String engineType;

    @com.aliyun.core.annotation.NameInMap("query")
    private String query;

    @com.aliyun.core.annotation.NameInMap("timeRange")
    private String timeRange;

    private UnifiedSearchInput(Builder builder) {
        this.category = builder.category;
        this.contents = builder.contents;
        this.engineType = builder.engineType;
        this.query = builder.query;
        this.timeRange = builder.timeRange;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UnifiedSearchInput create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return category
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * @return contents
     */
    public RequestContents getContents() {
        return this.contents;
    }

    /**
     * @return engineType
     */
    public String getEngineType() {
        return this.engineType;
    }

    /**
     * @return query
     */
    public String getQuery() {
        return this.query;
    }

    /**
     * @return timeRange
     */
    public String getTimeRange() {
        return this.timeRange;
    }

    public static final class Builder {
        private String category; 
        private RequestContents contents; 
        private String engineType; 
        private String query; 
        private String timeRange; 

        private Builder() {
        } 

        private Builder(UnifiedSearchInput model) {
            this.category = model.category;
            this.contents = model.contents;
            this.engineType = model.engineType;
            this.query = model.query;
            this.timeRange = model.timeRange;
        } 

        /**
         * category.
         */
        public Builder category(String category) {
            this.category = category;
            return this;
        }

        /**
         * contents.
         */
        public Builder contents(RequestContents contents) {
            this.contents = contents;
            return this;
        }

        /**
         * engineType.
         */
        public Builder engineType(String engineType) {
            this.engineType = engineType;
            return this;
        }

        /**
         * query.
         */
        public Builder query(String query) {
            this.query = query;
            return this;
        }

        /**
         * timeRange.
         */
        public Builder timeRange(String timeRange) {
            this.timeRange = timeRange;
            return this;
        }

        public UnifiedSearchInput build() {
            return new UnifiedSearchInput(this);
        } 

    } 

}
