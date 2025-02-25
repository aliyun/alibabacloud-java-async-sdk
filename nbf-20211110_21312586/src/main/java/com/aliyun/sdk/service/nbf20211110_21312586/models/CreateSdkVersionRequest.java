// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nbf20211110_21312586.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSdkVersionRequest} extends {@link RequestModel}
 *
 * <p>CreateSdkVersionRequest</p>
 */
public class CreateSdkVersionRequest extends Request {
    @Query
    @NameInMap("createSdkCmd")
    private String createSdkCmd;

    private CreateSdkVersionRequest(Builder builder) {
        super(builder);
        this.createSdkCmd = builder.createSdkCmd;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSdkVersionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return createSdkCmd
     */
    public String getCreateSdkCmd() {
        return this.createSdkCmd;
    }

    public static final class Builder extends Request.Builder<CreateSdkVersionRequest, Builder> {
        private String createSdkCmd; 

        private Builder() {
            super();
        } 

        private Builder(CreateSdkVersionRequest request) {
            super(request);
            this.createSdkCmd = request.createSdkCmd;
        } 

        /**
         * createSdkCmd.
         */
        public Builder createSdkCmd(String createSdkCmd) {
            this.putQueryParameter("createSdkCmd", createSdkCmd);
            this.createSdkCmd = createSdkCmd;
            return this;
        }

        @Override
        public CreateSdkVersionRequest build() {
            return new CreateSdkVersionRequest(this);
        } 

    } 

}
