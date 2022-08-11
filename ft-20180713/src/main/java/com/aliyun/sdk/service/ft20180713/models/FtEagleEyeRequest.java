// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ft20180713.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FtEagleEyeRequest} extends {@link RequestModel}
 *
 * <p>FtEagleEyeRequest</p>
 */
public class FtEagleEyeRequest extends Request {
    @Query
    @NameInMap("Name")
    private String name;

    private FtEagleEyeRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FtEagleEyeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<FtEagleEyeRequest, Builder> {
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(FtEagleEyeRequest request) {
            super(request);
            this.name = request.name;
        } 

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        @Override
        public FtEagleEyeRequest build() {
            return new FtEagleEyeRequest(this);
        } 

    } 

}
