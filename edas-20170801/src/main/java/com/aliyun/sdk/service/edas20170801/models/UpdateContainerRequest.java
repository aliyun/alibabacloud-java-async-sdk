// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateContainerRequest} extends {@link RequestModel}
 *
 * <p>UpdateContainerRequest</p>
 */
public class UpdateContainerRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Query
    @NameInMap("BuildPackId")
    @Validation(required = true)
    private Integer buildPackId;

    private UpdateContainerRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.buildPackId = builder.buildPackId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateContainerRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return buildPackId
     */
    public Integer getBuildPackId() {
        return this.buildPackId;
    }

    public static final class Builder extends Request.Builder<UpdateContainerRequest, Builder> {
        private String appId; 
        private Integer buildPackId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateContainerRequest request) {
            super(request);
            this.appId = request.appId;
            this.buildPackId = request.buildPackId;
        } 

        /**
         * The ID of the application.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * The build package number of EDAS Container. You can obtain the build package number in the Build package number column in the EDAS Container release notes table. For more information, see [Release notes for EDAS Container](~~92614~~).
         */
        public Builder buildPackId(Integer buildPackId) {
            this.putQueryParameter("BuildPackId", buildPackId);
            this.buildPackId = buildPackId;
            return this;
        }

        @Override
        public UpdateContainerRequest build() {
            return new UpdateContainerRequest(this);
        } 

    } 

}
