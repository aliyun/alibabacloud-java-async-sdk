// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RollbackApplicationRequest} extends {@link RequestModel}
 *
 * <p>RollbackApplicationRequest</p>
 */
public class RollbackApplicationRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Query
    @NameInMap("FromAppVersion")
    @Validation(required = true)
    private String fromAppVersion;

    @Query
    @NameInMap("Timeout")
    private Integer timeout;

    @Query
    @NameInMap("ToAppVersion")
    private String toAppVersion;

    private RollbackApplicationRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.fromAppVersion = builder.fromAppVersion;
        this.timeout = builder.timeout;
        this.toAppVersion = builder.toAppVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RollbackApplicationRequest create() {
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
     * @return fromAppVersion
     */
    public String getFromAppVersion() {
        return this.fromAppVersion;
    }

    /**
     * @return timeout
     */
    public Integer getTimeout() {
        return this.timeout;
    }

    /**
     * @return toAppVersion
     */
    public String getToAppVersion() {
        return this.toAppVersion;
    }

    public static final class Builder extends Request.Builder<RollbackApplicationRequest, Builder> {
        private String appId; 
        private String fromAppVersion; 
        private Integer timeout; 
        private String toAppVersion; 

        private Builder() {
            super();
        } 

        private Builder(RollbackApplicationRequest response) {
            super(response);
            this.appId = response.appId;
            this.fromAppVersion = response.fromAppVersion;
            this.timeout = response.timeout;
            this.toAppVersion = response.toAppVersion;
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
         * FromAppVersion.
         */
        public Builder fromAppVersion(String fromAppVersion) {
            this.putQueryParameter("FromAppVersion", fromAppVersion);
            this.fromAppVersion = fromAppVersion;
            return this;
        }

        /**
         * Timeout.
         */
        public Builder timeout(Integer timeout) {
            this.putQueryParameter("Timeout", timeout);
            this.timeout = timeout;
            return this;
        }

        /**
         * ToAppVersion.
         */
        public Builder toAppVersion(String toAppVersion) {
            this.putQueryParameter("ToAppVersion", toAppVersion);
            this.toAppVersion = toAppVersion;
            return this;
        }

        @Override
        public RollbackApplicationRequest build() {
            return new RollbackApplicationRequest(this);
        } 

    } 

}
