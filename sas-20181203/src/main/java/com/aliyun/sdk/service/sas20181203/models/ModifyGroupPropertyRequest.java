// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyGroupPropertyRequest} extends {@link RequestModel}
 *
 * <p>ModifyGroupPropertyRequest</p>
 */
public class ModifyGroupPropertyRequest extends Request {
    @Query
    @NameInMap("Data")
    @Validation(required = true)
    private String data;

    private ModifyGroupPropertyRequest(Builder builder) {
        super(builder);
        this.data = builder.data;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyGroupPropertyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public String getData() {
        return this.data;
    }

    public static final class Builder extends Request.Builder<ModifyGroupPropertyRequest, Builder> {
        private String data; 

        private Builder() {
            super();
        } 

        private Builder(ModifyGroupPropertyRequest request) {
            super(request);
            this.data = request.data;
        } 

        /**
         * Data.
         */
        public Builder data(String data) {
            this.putQueryParameter("Data", data);
            this.data = data;
            return this;
        }

        @Override
        public ModifyGroupPropertyRequest build() {
            return new ModifyGroupPropertyRequest(this);
        } 

    } 

}
