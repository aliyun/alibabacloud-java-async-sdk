// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPolicesForPrivateAccessApplicationRequest} extends {@link RequestModel}
 *
 * <p>ListPolicesForPrivateAccessApplicationRequest</p>
 */
public class ListPolicesForPrivateAccessApplicationRequest extends Request {
    @Query
    @NameInMap("ApplicationIds")
    @Validation(required = true)
    private java.util.List < String > applicationIds;

    private ListPolicesForPrivateAccessApplicationRequest(Builder builder) {
        super(builder);
        this.applicationIds = builder.applicationIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPolicesForPrivateAccessApplicationRequest create() {
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

    public static final class Builder extends Request.Builder<ListPolicesForPrivateAccessApplicationRequest, Builder> {
        private java.util.List < String > applicationIds; 

        private Builder() {
            super();
        } 

        private Builder(ListPolicesForPrivateAccessApplicationRequest request) {
            super(request);
            this.applicationIds = request.applicationIds;
        } 

        /**
         * ApplicationIds.
         */
        public Builder applicationIds(java.util.List < String > applicationIds) {
            this.putQueryParameter("ApplicationIds", applicationIds);
            this.applicationIds = applicationIds;
            return this;
        }

        @Override
        public ListPolicesForPrivateAccessApplicationRequest build() {
            return new ListPolicesForPrivateAccessApplicationRequest(this);
        } 

    } 

}
