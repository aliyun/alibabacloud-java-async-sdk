// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetNacosHistoryConfigRequest} extends {@link RequestModel}
 *
 * <p>GetNacosHistoryConfigRequest</p>
 */
public class GetNacosHistoryConfigRequest extends Request {
    @Query
    @NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @Query
    @NameInMap("DataId")
    @Validation(required = true)
    private String dataId;

    @Query
    @NameInMap("Group")
    @Validation(required = true)
    private String group;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("NamespaceId")
    private String namespaceId;

    @Query
    @NameInMap("Nid")
    @Validation(required = true)
    private String nid;

    private GetNacosHistoryConfigRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.dataId = builder.dataId;
        this.group = builder.group;
        this.instanceId = builder.instanceId;
        this.namespaceId = builder.namespaceId;
        this.nid = builder.nid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetNacosHistoryConfigRequest create() {
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

    /**
     * @return nid
     */
    public String getNid() {
        return this.nid;
    }

    public static final class Builder extends Request.Builder<GetNacosHistoryConfigRequest, Builder> {
        private String acceptLanguage; 
        private String dataId; 
        private String group; 
        private String instanceId; 
        private String namespaceId; 
        private String nid; 

        private Builder() {
            super();
        } 

        private Builder(GetNacosHistoryConfigRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.dataId = request.dataId;
            this.group = request.group;
            this.instanceId = request.instanceId;
            this.namespaceId = request.namespaceId;
            this.nid = request.nid;
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
         * The ID of the data.
         */
        public Builder dataId(String dataId) {
            this.putQueryParameter("DataId", dataId);
            this.dataId = dataId;
            return this;
        }

        /**
         * The name of the group.
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

        /**
         * The version ID of the configuration.
         */
        public Builder nid(String nid) {
            this.putQueryParameter("Nid", nid);
            this.nid = nid;
            return this;
        }

        @Override
        public GetNacosHistoryConfigRequest build() {
            return new GetNacosHistoryConfigRequest(this);
        } 

    } 

}
