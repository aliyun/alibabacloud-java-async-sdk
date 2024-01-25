// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mindlive20210301.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResetDeviceRequest} extends {@link RequestModel}
 *
 * <p>ResetDeviceRequest</p>
 */
public class ResetDeviceRequest extends Request {
    @Query
    @NameInMap("Code")
    @Validation(required = true)
    private String code;

    private ResetDeviceRequest(Builder builder) {
        super(builder);
        this.code = builder.code;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResetDeviceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    public static final class Builder extends Request.Builder<ResetDeviceRequest, Builder> {
        private String code; 

        private Builder() {
            super();
        } 

        private Builder(ResetDeviceRequest request) {
            super(request);
            this.code = request.code;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.putQueryParameter("Code", code);
            this.code = code;
            return this;
        }

        @Override
        public ResetDeviceRequest build() {
            return new ResetDeviceRequest(this);
        } 

    } 

}
