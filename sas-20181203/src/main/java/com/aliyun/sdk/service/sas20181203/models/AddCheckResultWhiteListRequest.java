// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddCheckResultWhiteListRequest} extends {@link RequestModel}
 *
 * <p>AddCheckResultWhiteListRequest</p>
 */
public class AddCheckResultWhiteListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CheckIds")
    private java.util.List < Long > checkIds;

    private AddCheckResultWhiteListRequest(Builder builder) {
        super(builder);
        this.checkIds = builder.checkIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddCheckResultWhiteListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return checkIds
     */
    public java.util.List < Long > getCheckIds() {
        return this.checkIds;
    }

    public static final class Builder extends Request.Builder<AddCheckResultWhiteListRequest, Builder> {
        private java.util.List < Long > checkIds; 

        private Builder() {
            super();
        } 

        private Builder(AddCheckResultWhiteListRequest request) {
            super(request);
            this.checkIds = request.checkIds;
        } 

        /**
         * The IDs of the check items.
         */
        public Builder checkIds(java.util.List < Long > checkIds) {
            this.putQueryParameter("CheckIds", checkIds);
            this.checkIds = checkIds;
            return this;
        }

        @Override
        public AddCheckResultWhiteListRequest build() {
            return new AddCheckResultWhiteListRequest(this);
        } 

    } 

}
