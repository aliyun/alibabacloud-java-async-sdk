// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.miniapplcdp20200113.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GenerateAppUserPasswordRequest} extends {@link RequestModel}
 *
 * <p>GenerateAppUserPasswordRequest</p>
 */
public class GenerateAppUserPasswordRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Query
    @NameInMap("EnvId")
    @Validation(required = true)
    private String envId;

    @Query
    @NameInMap("Source")
    private String source;

    @Query
    @NameInMap("UserName")
    @Validation(required = true)
    private String userName;

    private GenerateAppUserPasswordRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.envId = builder.envId;
        this.source = builder.source;
        this.userName = builder.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateAppUserPasswordRequest create() {
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
     * @return envId
     */
    public String getEnvId() {
        return this.envId;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    public static final class Builder extends Request.Builder<GenerateAppUserPasswordRequest, Builder> {
        private String appId; 
        private String envId; 
        private String source; 
        private String userName; 

        private Builder() {
            super();
        } 

        private Builder(GenerateAppUserPasswordRequest request) {
            super(request);
            this.appId = request.appId;
            this.envId = request.envId;
            this.source = request.source;
            this.userName = request.userName;
        } 

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * EnvId.
         */
        public Builder envId(String envId) {
            this.putQueryParameter("EnvId", envId);
            this.envId = envId;
            return this;
        }

        /**
         * Source.
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        /**
         * UserName.
         */
        public Builder userName(String userName) {
            this.putQueryParameter("UserName", userName);
            this.userName = userName;
            return this;
        }

        @Override
        public GenerateAppUserPasswordRequest build() {
            return new GenerateAppUserPasswordRequest(this);
        } 

    } 

}
