// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link VerifyCheckResultRequest} extends {@link RequestModel}
 *
 * <p>VerifyCheckResultRequest</p>
 */
public class VerifyCheckResultRequest extends Request {
    @Query
    @NameInMap("CheckIds")
    private java.util.List < Long > checkIds;

    private VerifyCheckResultRequest(Builder builder) {
        super(builder);
        this.checkIds = builder.checkIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VerifyCheckResultRequest create() {
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

    public static final class Builder extends Request.Builder<VerifyCheckResultRequest, Builder> {
        private java.util.List < Long > checkIds; 

        private Builder() {
            super();
        } 

        private Builder(VerifyCheckResultRequest request) {
            super(request);
            this.checkIds = request.checkIds;
        } 

        /**
         * An array that consists of the IDs of risk items.
         */
        public Builder checkIds(java.util.List < Long > checkIds) {
            this.putQueryParameter("CheckIds", checkIds);
            this.checkIds = checkIds;
            return this;
        }

        @Override
        public VerifyCheckResultRequest build() {
            return new VerifyCheckResultRequest(this);
        } 

    } 

}
