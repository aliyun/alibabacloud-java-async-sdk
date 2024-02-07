// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetLoginPreferenceRequest} extends {@link RequestModel}
 *
 * <p>SetLoginPreferenceRequest</p>
 */
public class SetLoginPreferenceRequest extends Request {
    @Query
    @NameInMap("DirectoryId")
    private String directoryId;

    @Query
    @NameInMap("LoginNetworkMasks")
    private String loginNetworkMasks;

    private SetLoginPreferenceRequest(Builder builder) {
        super(builder);
        this.directoryId = builder.directoryId;
        this.loginNetworkMasks = builder.loginNetworkMasks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetLoginPreferenceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return directoryId
     */
    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * @return loginNetworkMasks
     */
    public String getLoginNetworkMasks() {
        return this.loginNetworkMasks;
    }

    public static final class Builder extends Request.Builder<SetLoginPreferenceRequest, Builder> {
        private String directoryId; 
        private String loginNetworkMasks; 

        private Builder() {
            super();
        } 

        private Builder(SetLoginPreferenceRequest request) {
            super(request);
            this.directoryId = request.directoryId;
            this.loginNetworkMasks = request.loginNetworkMasks;
        } 

        /**
         * DirectoryId.
         */
        public Builder directoryId(String directoryId) {
            this.putQueryParameter("DirectoryId", directoryId);
            this.directoryId = directoryId;
            return this;
        }

        /**
         * LoginNetworkMasks.
         */
        public Builder loginNetworkMasks(String loginNetworkMasks) {
            this.putQueryParameter("LoginNetworkMasks", loginNetworkMasks);
            this.loginNetworkMasks = loginNetworkMasks;
            return this;
        }

        @Override
        public SetLoginPreferenceRequest build() {
            return new SetLoginPreferenceRequest(this);
        } 

    } 

}
