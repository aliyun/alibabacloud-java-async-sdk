// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAccessChannelOfStagingRequest} extends {@link RequestModel}
 *
 * <p>GetAccessChannelOfStagingRequest</p>
 */
public class GetAccessChannelOfStagingRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SearchPattern")
    private String searchPattern;

    private GetAccessChannelOfStagingRequest(Builder builder) {
        super(builder);
        this.searchPattern = builder.searchPattern;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAccessChannelOfStagingRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return searchPattern
     */
    public String getSearchPattern() {
        return this.searchPattern;
    }

    public static final class Builder extends Request.Builder<GetAccessChannelOfStagingRequest, Builder> {
        private String searchPattern; 

        private Builder() {
            super();
        } 

        private Builder(GetAccessChannelOfStagingRequest request) {
            super(request);
            this.searchPattern = request.searchPattern;
        } 

        /**
         * SearchPattern.
         */
        public Builder searchPattern(String searchPattern) {
            this.putQueryParameter("SearchPattern", searchPattern);
            this.searchPattern = searchPattern;
            return this;
        }

        @Override
        public GetAccessChannelOfStagingRequest build() {
            return new GetAccessChannelOfStagingRequest(this);
        } 

    } 

}
