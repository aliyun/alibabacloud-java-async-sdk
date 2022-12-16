// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryConfigRequest} extends {@link RequestModel}
 *
 * <p>QueryConfigRequest</p>
 */
public class QueryConfigRequest extends Request {
    @Query
    @NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @Query
    @NameInMap("ClusterId")
    private String clusterId;

    @Query
    @NameInMap("ConfigType")
    private String configType;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("NeedRunningConf")
    private Boolean needRunningConf;

    @Query
    @NameInMap("RequestPars")
    private String requestPars;

    private QueryConfigRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.clusterId = builder.clusterId;
        this.configType = builder.configType;
        this.instanceId = builder.instanceId;
        this.needRunningConf = builder.needRunningConf;
        this.requestPars = builder.requestPars;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryConfigRequest create() {
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
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return configType
     */
    public String getConfigType() {
        return this.configType;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return needRunningConf
     */
    public Boolean getNeedRunningConf() {
        return this.needRunningConf;
    }

    /**
     * @return requestPars
     */
    public String getRequestPars() {
        return this.requestPars;
    }

    public static final class Builder extends Request.Builder<QueryConfigRequest, Builder> {
        private String acceptLanguage; 
        private String clusterId; 
        private String configType; 
        private String instanceId; 
        private Boolean needRunningConf; 
        private String requestPars; 

        private Builder() {
            super();
        } 

        private Builder(QueryConfigRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.clusterId = request.clusterId;
            this.configType = request.configType;
            this.instanceId = request.instanceId;
            this.needRunningConf = request.needRunningConf;
            this.requestPars = request.requestPars;
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
         * The ID of the cluster.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The format of the configuration. Supported formats include TEXT, JSON, XML, and HTML.
         */
        public Builder configType(String configType) {
            this.putQueryParameter("ConfigType", configType);
            this.configType = configType;
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
         * NeedRunningConf.
         */
        public Builder needRunningConf(Boolean needRunningConf) {
            this.putQueryParameter("NeedRunningConf", needRunningConf);
            this.needRunningConf = needRunningConf;
            return this;
        }

        /**
         * The extended request parameter in the JSON format.
         */
        public Builder requestPars(String requestPars) {
            this.putQueryParameter("RequestPars", requestPars);
            this.requestPars = requestPars;
            return this;
        }

        @Override
        public QueryConfigRequest build() {
            return new QueryConfigRequest(this);
        } 

    } 

}
