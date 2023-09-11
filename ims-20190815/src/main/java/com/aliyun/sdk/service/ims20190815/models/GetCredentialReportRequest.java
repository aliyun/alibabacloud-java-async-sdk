// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCredentialReportRequest} extends {@link RequestModel}
 *
 * <p>GetCredentialReportRequest</p>
 */
public class GetCredentialReportRequest extends Request {
    @Query
    @NameInMap("MaxItems")
    private String maxItems;

    @Query
    @NameInMap("NextToken")
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
         * MaxItems.
         */
        public Builder maxItems(String maxItems) {
            this.putQueryParameter("MaxItems", maxItems);
            this.maxItems = maxItems;
            return this;
        }

        /**
         * NextToken.
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
