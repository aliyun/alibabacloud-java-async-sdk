// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nbf20211110_21312586.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAndReleaseApiRequest} extends {@link RequestModel}
 *
 * <p>UpdateAndReleaseApiRequest</p>
 */
public class UpdateAndReleaseApiRequest extends Request {
    @Query
    @NameInMap("updateApiCmd")
    private String updateApiCmd;

    private UpdateAndReleaseApiRequest(Builder builder) {
        super(builder);
        this.updateApiCmd = builder.updateApiCmd;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAndReleaseApiRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return updateApiCmd
     */
    public String getUpdateApiCmd() {
        return this.updateApiCmd;
    }

    public static final class Builder extends Request.Builder<UpdateAndReleaseApiRequest, Builder> {
        private String updateApiCmd; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAndReleaseApiRequest request) {
            super(request);
            this.updateApiCmd = request.updateApiCmd;
        } 

        /**
         * updateApiCmd.
         */
        public Builder updateApiCmd(String updateApiCmd) {
            this.putQueryParameter("updateApiCmd", updateApiCmd);
            this.updateApiCmd = updateApiCmd;
            return this;
        }

        @Override
        public UpdateAndReleaseApiRequest build() {
            return new UpdateAndReleaseApiRequest(this);
        } 

    } 

}
