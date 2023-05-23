// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateEngineNamespaceRequest} extends {@link RequestModel}
 *
 * <p>CreateEngineNamespaceRequest</p>
 */
public class CreateEngineNamespaceRequest extends Request {
    @Query
    @NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @Query
    @NameInMap("ClusterId")
    private String clusterId;

    @Query
    @NameInMap("Desc")
    private String desc;

    @Query
    @NameInMap("Id")
    private String id;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("ServiceCount")
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
         * 返回结果显示的语言。取值：zh（默认值）：中文，en：英文
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * The description of the namespace.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The ID of the instance.
         */
        public Builder desc(String desc) {
            this.putQueryParameter("Desc", desc);
            this.desc = desc;
            return this;
        }

        /**
         * Creates a namespace in a Nacos instance.
         */
        public Builder id(String id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * The details of the data.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Development environment
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The ID of the request.
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
