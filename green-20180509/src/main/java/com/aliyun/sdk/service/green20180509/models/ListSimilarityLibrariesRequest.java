// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20180509.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSimilarityLibrariesRequest} extends {@link RequestModel}
 *
 * <p>ListSimilarityLibrariesRequest</p>
 */
public class ListSimilarityLibrariesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientInfo")
    private String clientInfo;

    private ListSimilarityLibrariesRequest(Builder builder) {
        super(builder);
        this.clientInfo = builder.clientInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSimilarityLibrariesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientInfo
     */
    public String getClientInfo() {
        return this.clientInfo;
    }

    public static final class Builder extends Request.Builder<ListSimilarityLibrariesRequest, Builder> {
        private String clientInfo; 

        private Builder() {
            super();
        } 

        private Builder(ListSimilarityLibrariesRequest request) {
            super(request);
            this.clientInfo = request.clientInfo;
        } 

        /**
         * ClientInfo.
         */
        public Builder clientInfo(String clientInfo) {
            this.putQueryParameter("ClientInfo", clientInfo);
            this.clientInfo = clientInfo;
            return this;
        }

        @Override
        public ListSimilarityLibrariesRequest build() {
            return new ListSimilarityLibrariesRequest(this);
        } 

    } 

}
