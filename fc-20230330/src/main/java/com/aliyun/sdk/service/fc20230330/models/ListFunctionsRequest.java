// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

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
 * {@link ListFunctionsRequest} extends {@link RequestModel}
 *
 * <p>ListFunctionsRequest</p>
 */
public class ListFunctionsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("fcVersion")
    private String fcVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("limit")
    private Integer limit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("prefix")
    private String prefix;

    private ListFunctionsRequest(Builder builder) {
        super(builder);
        this.fcVersion = builder.fcVersion;
        this.limit = builder.limit;
        this.nextToken = builder.nextToken;
        this.prefix = builder.prefix;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFunctionsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fcVersion
     */
    public String getFcVersion() {
        return this.fcVersion;
    }

    /**
     * @return limit
     */
    public Integer getLimit() {
        return this.limit;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return prefix
     */
    public String getPrefix() {
        return this.prefix;
    }

    public static final class Builder extends Request.Builder<ListFunctionsRequest, Builder> {
        private String fcVersion; 
        private Integer limit; 
        private String nextToken; 
        private String prefix; 

        private Builder() {
            super();
        } 

        private Builder(ListFunctionsRequest request) {
            super(request);
            this.fcVersion = request.fcVersion;
            this.limit = request.limit;
            this.nextToken = request.nextToken;
            this.prefix = request.prefix;
        } 

        /**
         * <p>The version of Function Compute to which the functions belong. Valid values: v3 and v2. v3: only lists functions of Function Compute 3.0. v2: only lists functions of Function Compute 2.0. By default, this parameter is left empty and functions in both Function Compute 2.0 and Function Compute 3.0 are listed.</p>
         * 
         * <strong>example:</strong>
         * <p>v3</p>
         */
        public Builder fcVersion(String fcVersion) {
            this.putQueryParameter("fcVersion", fcVersion);
            this.fcVersion = fcVersion;
            return this;
        }

        /**
         * <p>The number of functions to return. The minimum value is 1 and the maximum value is 100.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder limit(Integer limit) {
            this.putQueryParameter("limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * <p>The pagination token.</p>
         * 
         * <strong>example:</strong>
         * <p>MTIzNCNhYmM=</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("nextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The prefix of the function name.</p>
         * 
         * <strong>example:</strong>
         * <p>my-func</p>
         */
        public Builder prefix(String prefix) {
            this.putQueryParameter("prefix", prefix);
            this.prefix = prefix;
            return this;
        }

        @Override
        public ListFunctionsRequest build() {
            return new ListFunctionsRequest(this);
        } 

    } 

}
