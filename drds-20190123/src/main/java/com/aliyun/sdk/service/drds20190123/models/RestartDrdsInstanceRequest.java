// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RestartDrdsInstanceRequest} extends {@link RequestModel}
 *
 * <p>RestartDrdsInstanceRequest</p>
 */
public class RestartDrdsInstanceRequest extends Request {
    @Query
    @NameInMap("DrdsInstanceId")
    @Validation(required = true)
    private String drdsInstanceId;

    private RestartDrdsInstanceRequest(Builder builder) {
        super(builder);
        this.drdsInstanceId = builder.drdsInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RestartDrdsInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return drdsInstanceId
     */
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    public static final class Builder extends Request.Builder<RestartDrdsInstanceRequest, Builder> {
        private String drdsInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(RestartDrdsInstanceRequest request) {
            super(request);
            this.drdsInstanceId = request.drdsInstanceId;
        } 

        /**
         * The ID of a DRDS instance.
         */
        public Builder drdsInstanceId(String drdsInstanceId) {
            this.putQueryParameter("DrdsInstanceId", drdsInstanceId);
            this.drdsInstanceId = drdsInstanceId;
            return this;
        }

        @Override
        public RestartDrdsInstanceRequest build() {
            return new RestartDrdsInstanceRequest(this);
        } 

    } 

}
