// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ft20180713.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FtFlowSpecialRequest} extends {@link RequestModel}
 *
 * <p>FtFlowSpecialRequest</p>
 */
public class FtFlowSpecialRequest extends Request {
    @Query
    @NameInMap("Name")
    private String name;

    private FtFlowSpecialRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FtFlowSpecialRequest create() {
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

    public static final class Builder extends Request.Builder<FtFlowSpecialRequest, Builder> {
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(FtFlowSpecialRequest request) {
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
        public FtFlowSpecialRequest build() {
            return new FtFlowSpecialRequest(this);
        } 

    } 

}
