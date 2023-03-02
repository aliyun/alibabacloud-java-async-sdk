// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ft20150303.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateInsRequest} extends {@link RequestModel}
 *
 * <p>CreateInsRequest</p>
 */
public class CreateInsRequest extends Request {
    @Query
    @NameInMap("Success")
    private String success;

    private CreateInsRequest(Builder builder) {
        super(builder);
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateInsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return success
     */
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder extends Request.Builder<CreateInsRequest, Builder> {
        private String success; 

        private Builder() {
            super();
        } 

        private Builder(CreateInsRequest request) {
            super(request);
            this.success = request.success;
        } 

        /**
         * Success.
         */
        public Builder success(String success) {
            this.putQueryParameter("Success", success);
            this.success = success;
            return this;
        }

        @Override
        public CreateInsRequest build() {
            return new CreateInsRequest(this);
        } 

    } 

}
