// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RestartAppInstanceRequest} extends {@link RequestModel}
 *
 * <p>RestartAppInstanceRequest</p>
 */
public class RestartAppInstanceRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private Long appId;

    @Query
    @NameInMap("AppInstanceIdList")
    @Validation(required = true)
    private java.util.List < Long > appInstanceIdList;

    @Query
    @NameInMap("EnvId")
    @Validation(required = true)
    private Long envId;

    private RestartAppInstanceRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.appInstanceIdList = builder.appInstanceIdList;
        this.envId = builder.envId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RestartAppInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public Long getAppId() {
        return this.appId;
    }

    /**
     * @return appInstanceIdList
     */
    public java.util.List < Long > getAppInstanceIdList() {
        return this.appInstanceIdList;
    }

    /**
     * @return envId
     */
    public Long getEnvId() {
        return this.envId;
    }

    public static final class Builder extends Request.Builder<RestartAppInstanceRequest, Builder> {
        private Long appId; 
        private java.util.List < Long > appInstanceIdList; 
        private Long envId; 

        private Builder() {
            super();
        } 

        private Builder(RestartAppInstanceRequest request) {
            super(request);
            this.appId = request.appId;
            this.appInstanceIdList = request.appInstanceIdList;
            this.envId = request.envId;
        } 

        /**
         * AppId.
         */
        public Builder appId(Long appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * AppInstanceIdList.
         */
        public Builder appInstanceIdList(java.util.List < Long > appInstanceIdList) {
            this.putQueryParameter("AppInstanceIdList", appInstanceIdList);
            this.appInstanceIdList = appInstanceIdList;
            return this;
        }

        /**
         * EnvId.
         */
        public Builder envId(Long envId) {
            this.putQueryParameter("EnvId", envId);
            this.envId = envId;
            return this;
        }

        @Override
        public RestartAppInstanceRequest build() {
            return new RestartAppInstanceRequest(this);
        } 

    } 

}
