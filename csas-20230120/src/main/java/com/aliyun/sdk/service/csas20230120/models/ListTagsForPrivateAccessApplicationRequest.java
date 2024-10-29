// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListTagsForPrivateAccessApplicationRequest} extends {@link RequestModel}
 *
 * <p>ListTagsForPrivateAccessApplicationRequest</p>
 */
public class ListTagsForPrivateAccessApplicationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > applicationIds;

    private ListTagsForPrivateAccessApplicationRequest(Builder builder) {
        super(builder);
        this.applicationIds = builder.applicationIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTagsForPrivateAccessApplicationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationIds
     */
    public java.util.List < String > getApplicationIds() {
        return this.applicationIds;
    }

    public static final class Builder extends Request.Builder<ListTagsForPrivateAccessApplicationRequest, Builder> {
        private java.util.List < String > applicationIds; 

        private Builder() {
            super();
        } 

        private Builder(ListTagsForPrivateAccessApplicationRequest request) {
            super(request);
            this.applicationIds = request.applicationIds;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder applicationIds(java.util.List < String > applicationIds) {
            this.putQueryParameter("ApplicationIds", applicationIds);
            this.applicationIds = applicationIds;
            return this;
        }

        @Override
        public ListTagsForPrivateAccessApplicationRequest build() {
            return new ListTagsForPrivateAccessApplicationRequest(this);
        } 

    } 

}
