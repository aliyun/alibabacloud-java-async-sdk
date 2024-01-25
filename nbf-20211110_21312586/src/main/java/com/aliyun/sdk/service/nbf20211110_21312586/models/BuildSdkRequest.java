// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nbf20211110_21312586.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BuildSdkRequest} extends {@link RequestModel}
 *
 * <p>BuildSdkRequest</p>
 */
public class BuildSdkRequest extends Request {
    @Query
    @NameInMap("buildCmd")
    private String buildCmd;

    private BuildSdkRequest(Builder builder) {
        super(builder);
        this.buildCmd = builder.buildCmd;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BuildSdkRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return buildCmd
     */
    public String getBuildCmd() {
        return this.buildCmd;
    }

    public static final class Builder extends Request.Builder<BuildSdkRequest, Builder> {
        private String buildCmd; 

        private Builder() {
            super();
        } 

        private Builder(BuildSdkRequest request) {
            super(request);
            this.buildCmd = request.buildCmd;
        } 

        /**
         * buildCmd.
         */
        public Builder buildCmd(String buildCmd) {
            this.putQueryParameter("buildCmd", buildCmd);
            this.buildCmd = buildCmd;
            return this;
        }

        @Override
        public BuildSdkRequest build() {
            return new BuildSdkRequest(this);
        } 

    } 

}
