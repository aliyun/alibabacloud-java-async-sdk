// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

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
 * {@link GetCredentialReportRequest} extends {@link RequestModel}
 *
 * <p>GetCredentialReportRequest</p>
 */
public class GetCredentialReportRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxItems")
    private String maxItems;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    private GetCredentialReportRequest(Builder builder) {
        super(builder);
        this.maxItems = builder.maxItems;
        this.nextToken = builder.nextToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCredentialReportRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return maxItems
     */
    public String getMaxItems() {
        return this.maxItems;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    public static final class Builder extends Request.Builder<GetCredentialReportRequest, Builder> {
        private String maxItems; 
        private String nextToken; 

        private Builder() {
            super();
        } 

        private Builder(GetCredentialReportRequest request) {
            super(request);
            this.maxItems = request.maxItems;
            this.nextToken = request.nextToken;
        } 

        /**
         * <p>The maximum number of items to return. When the response is truncated because the maximum number of items is reached, the IsTruncated parameter is set to true.</p>
         * <p>Valid values: 1 to 3501. Default value: 3501.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder maxItems(String maxItems) {
            this.putQueryParameter("MaxItems", maxItems);
            this.maxItems = maxItems;
            return this;
        }

        /**
         * <p>The token used to retrieve the next set of results when the response is truncated.</p>
         * 
         * <strong>example:</strong>
         * <p>EXAMPLE</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        @Override
        public GetCredentialReportRequest build() {
            return new GetCredentialReportRequest(this);
        } 

    } 

}
