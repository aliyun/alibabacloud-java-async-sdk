// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExportNacosConfigRequest} extends {@link RequestModel}
 *
 * <p>ExportNacosConfigRequest</p>
 */
public class ExportNacosConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    @Deprecated
    private String appName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataId")
    @Deprecated
    private String dataId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataIds")
    private String dataIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Group")
    @Deprecated
    private String group;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ids")
    @Deprecated
    private String ids;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NamespaceId")
    private String namespaceId;

    private ExportNacosConfigRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.appName = builder.appName;
        this.dataId = builder.dataId;
        this.dataIds = builder.dataIds;
        this.group = builder.group;
        this.ids = builder.ids;
        this.instanceId = builder.instanceId;
        this.namespaceId = builder.namespaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExportNacosConfigRequest create() {
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
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return dataId
     */
    public String getDataId() {
        return this.dataId;
    }

    /**
     * @return dataIds
     */
    public String getDataIds() {
        return this.dataIds;
    }

    /**
     * @return group
     */
    public String getGroup() {
        return this.group;
    }

    /**
     * @return ids
     */
    public String getIds() {
        return this.ids;
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

    public static final class Builder extends Request.Builder<ExportNacosConfigRequest, Builder> {
        private String acceptLanguage; 
        private String appName; 
        private String dataId; 
        private String dataIds; 
        private String group; 
        private String ids; 
        private String instanceId; 
        private String namespaceId; 

        private Builder() {
            super();
        } 

        private Builder(ExportNacosConfigRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.appName = request.appName;
            this.dataId = request.dataId;
            this.dataIds = request.dataIds;
            this.group = request.group;
            this.ids = request.ids;
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
         * The application tag.
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * The ID of the data that you want to export.
         * <p>
         * 
         * > 
         * 
         * *   Multiple export methods are supported.
         * 
         * *   If you want to export a single configuration, you must leave the Ids parameter empty and specify the DataID and Group parameters.
         */
        public Builder dataId(String dataId) {
            this.putQueryParameter("DataId", dataId);
            this.dataId = dataId;
            return this;
        }

        /**
         * The configuration group name and the ID of the configuration that you want to export. Separate multiple configurations with comma (,).
         */
        public Builder dataIds(String dataIds) {
            this.putQueryParameter("DataIds", dataIds);
            this.dataIds = dataIds;
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
         * The ID of the primary key of a configuration item.
         * <p>
         * 
         * >  - Multiple export methods are supported. You must specify this parameter if you want to export multiple configurations. - You can obtain the value of this parameter by calling the ListNacosConfigs operation. - If you specify this parameter, multiple configurations are exported. The DataId and Group parameters are invalid.
         */
        public Builder ids(String ids) {
            this.putQueryParameter("Ids", ids);
            this.ids = ids;
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
        public ExportNacosConfigRequest build() {
            return new ExportNacosConfigRequest(this);
        } 

    } 

}
