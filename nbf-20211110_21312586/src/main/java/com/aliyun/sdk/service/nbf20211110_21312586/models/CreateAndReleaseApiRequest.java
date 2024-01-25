// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nbf20211110_21312586.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAndReleaseApiRequest} extends {@link RequestModel}
 *
 * <p>CreateAndReleaseApiRequest</p>
 */
public class CreateAndReleaseApiRequest extends Request {
    @Query
    @NameInMap("creatApiCmd")
    @Validation(required = true)
    private String creatApiCmd;

    private CreateAndReleaseApiRequest(Builder builder) {
        super(builder);
        this.creatApiCmd = builder.creatApiCmd;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAndReleaseApiRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return creatApiCmd
     */
    public String getCreatApiCmd() {
        return this.creatApiCmd;
    }

    public static final class Builder extends Request.Builder<CreateAndReleaseApiRequest, Builder> {
        private String creatApiCmd; 

        private Builder() {
            super();
        } 

        private Builder(CreateAndReleaseApiRequest request) {
            super(request);
            this.creatApiCmd = request.creatApiCmd;
        } 

        /**
         * creatApiCmd.
         */
        public Builder creatApiCmd(String creatApiCmd) {
            this.putQueryParameter("creatApiCmd", creatApiCmd);
            this.creatApiCmd = creatApiCmd;
            return this;
        }

        @Override
        public CreateAndReleaseApiRequest build() {
            return new CreateAndReleaseApiRequest(this);
        } 

    } 

}
