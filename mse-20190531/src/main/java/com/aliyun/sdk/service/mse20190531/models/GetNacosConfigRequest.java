// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetNacosConfigRequest} extends {@link RequestModel}
 *
 * <p>GetNacosConfigRequest</p>
 */
public class GetNacosConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Beta")
    private Boolean beta;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dataId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Group")
    @com.aliyun.core.annotation.Validation(required = true)
    private String group;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NamespaceId")
    private String namespaceId;

    private GetNacosConfigRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.beta = builder.beta;
        this.dataId = builder.dataId;
        this.group = builder.group;
        this.instanceId = builder.instanceId;
        this.namespaceId = builder.namespaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetNacosConfigRequest create() {
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
     * @return beta
     */
    public Boolean getBeta() {
        return this.beta;
    }

    /**
     * @return dataId
     */
    public String getDataId() {
        return this.dataId;
    }

    /**
     * @return group
     */
    public String getGroup() {
        return this.group;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return namespaceId
     */
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public static final class Builder extends Request.Builder<GetNacosConfigRequest, Builder> {
        private String acceptLanguage; 
        private Boolean beta; 
        private String dataId; 
        private String group; 
        private String instanceId; 
        private String namespaceId; 

        private Builder() {
            super();
        } 

        private Builder(GetNacosConfigRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.beta = request.beta;
            this.dataId = request.dataId;
            this.group = request.group;
            this.instanceId = request.instanceId;
            this.namespaceId = request.namespaceId;
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
         * Specifies whether to perform a beta release. Valid values:
         * <p>
         * 
         * *   `true`: yes
         * *   `false`: no
         */
        public Builder beta(Boolean beta) {
            this.putQueryParameter("Beta", beta);
            this.beta = beta;
            return this;
        }

        /**
         * The ID of the data.
         */
        public Builder dataId(String dataId) {
            this.putQueryParameter("DataId", dataId);
            this.dataId = dataId;
            return this;
        }

        /**
         * The name of the configuration group.
         */
        public Builder group(String group) {
            this.putQueryParameter("Group", group);
            this.group = group;
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
         * The ID of the namespace.
         */
        public Builder namespaceId(String namespaceId) {
            this.putQueryParameter("NamespaceId", namespaceId);
            this.namespaceId = namespaceId;
            return this;
        }

        @Override
        public GetNacosConfigRequest build() {
            return new GetNacosConfigRequest(this);
        } 

    } 

}
