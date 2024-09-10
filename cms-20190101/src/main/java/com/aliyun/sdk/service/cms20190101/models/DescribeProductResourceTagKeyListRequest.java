// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeProductResourceTagKeyListRequest} extends {@link RequestModel}
 *
 * <p>DescribeProductResourceTagKeyListRequest</p>
 */
public class DescribeProductResourceTagKeyListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    private DescribeProductResourceTagKeyListRequest(Builder builder) {
        super(builder);
        this.nextToken = builder.nextToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeProductResourceTagKeyListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    public static final class Builder extends Request.Builder<DescribeProductResourceTagKeyListRequest, Builder> {
        private String nextToken; 

        private Builder() {
            super();
        } 

        private Builder(DescribeProductResourceTagKeyListRequest request) {
            super(request);
            this.nextToken = request.nextToken;
        } 

        /**
         * The pagination cursor.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        @Override
        public DescribeProductResourceTagKeyListRequest build() {
            return new DescribeProductResourceTagKeyListRequest(this);
        } 

    } 

}
