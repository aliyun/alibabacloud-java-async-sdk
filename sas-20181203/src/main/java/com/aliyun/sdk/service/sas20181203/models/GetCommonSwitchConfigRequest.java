// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCommonSwitchConfigRequest} extends {@link RequestModel}
 *
 * <p>GetCommonSwitchConfigRequest</p>
 */
public class GetCommonSwitchConfigRequest extends Request {
    @Query
    @NameInMap("Type")
    private String type;

    private GetCommonSwitchConfigRequest(Builder builder) {
        super(builder);
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCommonSwitchConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<GetCommonSwitchConfigRequest, Builder> {
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(GetCommonSwitchConfigRequest request) {
            super(request);
            this.type = request.type;
        } 

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public GetCommonSwitchConfigRequest build() {
            return new GetCommonSwitchConfigRequest(this);
        } 

    } 

}
