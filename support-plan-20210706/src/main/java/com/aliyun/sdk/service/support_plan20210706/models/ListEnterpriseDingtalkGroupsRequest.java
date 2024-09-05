// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.support_plan20210706.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListEnterpriseDingtalkGroupsRequest} extends {@link RequestModel}
 *
 * <p>ListEnterpriseDingtalkGroupsRequest</p>
 */
public class ListEnterpriseDingtalkGroupsRequest extends Request {
    private ListEnterpriseDingtalkGroupsRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEnterpriseDingtalkGroupsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<ListEnterpriseDingtalkGroupsRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(ListEnterpriseDingtalkGroupsRequest request) {
            super(request);
        } 

        @Override
        public ListEnterpriseDingtalkGroupsRequest build() {
            return new ListEnterpriseDingtalkGroupsRequest(this);
        } 

    } 

}
