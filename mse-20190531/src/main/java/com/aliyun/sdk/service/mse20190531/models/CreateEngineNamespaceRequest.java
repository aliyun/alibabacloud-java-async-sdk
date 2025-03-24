// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

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
 * {@link CreateEngineNamespaceRequest} extends {@link RequestModel}
 *
 * <p>CreateEngineNamespaceRequest</p>
 */
public class CreateEngineNamespaceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Desc")
    private String desc;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    private String id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceCount")
    private Integer serviceCount;

    private CreateEngineNamespaceRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.clusterId = builder.clusterId;
        this.desc = builder.desc;
        this.id = builder.id;
        this.instanceId = builder.instanceId;
        this.name = builder.name;
        this.serviceCount = builder.serviceCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateEngineNamespaceRequest create() {
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
     * @return desc
     */
    public String getDesc() {
        return this.desc;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return serviceCount
     */
    public Integer getServiceCount() {
        return this.serviceCount;
    }

    public static final class Builder extends Request.Builder<CreateEngineNamespaceRequest, Builder> {
        private String acceptLanguage; 
        private String clusterId; 
        private String desc; 
        private String id; 
        private String instanceId; 
        private String name; 
        private Integer serviceCount; 

        private Builder() {
            super();
        } 

        private Builder(CreateEngineNamespaceRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.clusterId = request.clusterId;
            this.desc = request.desc;
            this.id = request.id;
            this.instanceId = request.instanceId;
            this.name = request.name;
            this.serviceCount = request.serviceCount;
        } 

        /**
         * <p>The language of the response. Valid values:</p>
         * <ul>
         * <li>zh: Chinese</li>
         * <li>en: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>mse-98s****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The description of the namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>Development environment</p>
         */
        public Builder desc(String desc) {
            this.putQueryParameter("Desc", desc);
            this.desc = desc;
            return this;
        }

        /**
         * <p>The custom ID of the namespace. If you do not specify this parameter, the automatically generated Universally Unique Identifier (UUID) is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>f4fa5b81-2f26-4900-833a-7516b315ebb2</p>
         */
        public Builder id(String id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>mse-cn-st21ri2****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The display name of the namespace.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dev</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The maximum number of services that can run in the namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder serviceCount(Integer serviceCount) {
            this.putQueryParameter("ServiceCount", serviceCount);
            this.serviceCount = serviceCount;
            return this;
        }

        @Override
        public CreateEngineNamespaceRequest build() {
            return new CreateEngineNamespaceRequest(this);
        } 

    } 

}
