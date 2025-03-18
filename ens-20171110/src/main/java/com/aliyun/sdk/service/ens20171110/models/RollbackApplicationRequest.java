// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link RollbackApplicationRequest} extends {@link RequestModel}
 *
 * <p>RollbackApplicationRequest</p>
 */
public class RollbackApplicationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FromAppVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fromAppVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Timeout")
    private Integer timeout;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ToAppVersion")
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

        private Builder(RollbackApplicationRequest request) {
            super(request);
            this.appId = request.appId;
            this.fromAppVersion = request.fromAppVersion;
            this.timeout = request.timeout;
            this.toAppVersion = request.toAppVersion;
        } 

        /**
         * <p>The ID of the application.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>474bdef0-d149-4695-abfb-52912d91****</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The current version number.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>v2-1</p>
         */
        public Builder fromAppVersion(String fromAppVersion) {
            this.putQueryParameter("FromAppVersion", fromAppVersion);
            this.fromAppVersion = fromAppVersion;
            return this;
        }

        /**
         * <p>The timeout period of the asynchronous rollback operation. Unit: seconds. Default value: 300.</p>
         * 
         * <strong>example:</strong>
         * <p>1800</p>
         */
        public Builder timeout(Integer timeout) {
            this.putQueryParameter("Timeout", timeout);
            this.timeout = timeout;
            return this;
        }

        /**
         * <p>The target version number. By default, the system automatically rolls back the container version to the previous version.</p>
         * 
         * <strong>example:</strong>
         * <p>v2</p>
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
