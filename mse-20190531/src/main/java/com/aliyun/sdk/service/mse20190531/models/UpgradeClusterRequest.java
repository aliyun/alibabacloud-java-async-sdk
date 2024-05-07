// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpgradeClusterRequest} extends {@link RequestModel}
 *
 * <p>UpgradeClusterRequest</p>
 */
public class UpgradeClusterRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RequestPars")
    private String requestPars;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UpgradeVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String upgradeVersion;

    private UpgradeClusterRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.instanceId = builder.instanceId;
        this.requestPars = builder.requestPars;
        this.upgradeVersion = builder.upgradeVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpgradeClusterRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceptLanguage
     */
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return requestPars
     */
    public String getRequestPars() {
        return this.requestPars;
    }

    /**
     * @return upgradeVersion
     */
    public String getUpgradeVersion() {
        return this.upgradeVersion;
    }

    public static final class Builder extends Request.Builder<UpgradeClusterRequest, Builder> {
        private String acceptLanguage; 
        private String instanceId; 
        private String requestPars; 
        private String upgradeVersion; 

        private Builder() {
            super();
        } 

        private Builder(UpgradeClusterRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.instanceId = request.instanceId;
            this.requestPars = request.requestPars;
            this.upgradeVersion = request.upgradeVersion;
        } 

        /**
         * The language of the response. Valid values:
         * <p>
         * 
         * *   zh: Chinese
         * *   en: English
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * The ID of the instance.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The extended request parameters in the JSON format.
         */
        public Builder requestPars(String requestPars) {
            this.putQueryParameter("RequestPars", requestPars);
            this.requestPars = requestPars;
            return this;
        }

        /**
         * The destination version.
         */
        public Builder upgradeVersion(String upgradeVersion) {
            this.putQueryParameter("UpgradeVersion", upgradeVersion);
            this.upgradeVersion = upgradeVersion;
            return this;
        }

        @Override
        public UpgradeClusterRequest build() {
            return new UpgradeClusterRequest(this);
        } 

    } 

}
