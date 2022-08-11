// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ft20180713.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FTApiAliasApiRequest} extends {@link RequestModel}
 *
 * <p>FTApiAliasApiRequest</p>
 */
public class FTApiAliasApiRequest extends Request {
    @Query
    @NameInMap("Name")
    private String name;

    private FTApiAliasApiRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FTApiAliasApiRequest create() {
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

    public static final class Builder extends Request.Builder<FTApiAliasApiRequest, Builder> {
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(FTApiAliasApiRequest request) {
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
        public FTApiAliasApiRequest build() {
            return new FTApiAliasApiRequest(this);
        } 

    } 

}
