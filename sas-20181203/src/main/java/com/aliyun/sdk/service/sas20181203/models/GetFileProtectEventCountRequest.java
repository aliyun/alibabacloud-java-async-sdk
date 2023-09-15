// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetFileProtectEventCountRequest} extends {@link RequestModel}
 *
 * <p>GetFileProtectEventCountRequest</p>
 */
public class GetFileProtectEventCountRequest extends Request {
    @Query
    @NameInMap("Status")
    private Integer status;

    private GetFileProtectEventCountRequest(Builder builder) {
        super(builder);
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFileProtectEventCountRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<GetFileProtectEventCountRequest, Builder> {
        private Integer status; 

        private Builder() {
            super();
        } 

        private Builder(GetFileProtectEventCountRequest request) {
            super(request);
            this.status = request.status;
        } 

        /**
         * Status.
         */
        public Builder status(Integer status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public GetFileProtectEventCountRequest build() {
            return new GetFileProtectEventCountRequest(this);
        } 

    } 

}
