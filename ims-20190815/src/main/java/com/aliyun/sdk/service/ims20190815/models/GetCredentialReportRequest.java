// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

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
         * <p>The number of entries per page. If a response is truncated because it reaches the value of <code>MaxItems</code>, the value of <code>IsTruncated</code> will be true.</p>
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
         * <p>The token that is used to initiate the next request if the response of the current request is truncated. You can use the token to initiate another request and obtain the remaining records.``</p>
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
