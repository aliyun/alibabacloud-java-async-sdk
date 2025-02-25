// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wyota20210420.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListFbIssueLabelsRequest} extends {@link RequestModel}
 *
 * <p>ListFbIssueLabelsRequest</p>
 */
public class ListFbIssueLabelsRequest extends Request {
    private ListFbIssueLabelsRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFbIssueLabelsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<ListFbIssueLabelsRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(ListFbIssueLabelsRequest request) {
            super(request);
        } 

        @Override
        public ListFbIssueLabelsRequest build() {
            return new ListFbIssueLabelsRequest(this);
        } 

    } 

}
