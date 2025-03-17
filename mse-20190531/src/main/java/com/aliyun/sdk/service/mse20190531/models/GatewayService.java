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
 * {@link GatewayService} extends {@link TeaModel}
 *
 * <p>GatewayService</p>
 */
public class GatewayService extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("GatewayTrafficPolicy")
    private TrafficPolicy gatewayTrafficPolicy;

    @com.aliyun.core.annotation.NameInMap("GatewayUniqueId")
    private String gatewayUniqueId;

    @com.aliyun.core.annotation.NameInMap("GroupName")
    private String groupName;

    @com.aliyun.core.annotation.NameInMap("Id")
    private Long id;

    @com.aliyun.core.annotation.NameInMap("MetaInfo")
    private String metaInfo;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("Namespace")
    private String namespace;

    @com.aliyun.core.annotation.NameInMap("SourceType")
    private String sourceType;

    private GatewayService(Builder builder) {
        this.gatewayTrafficPolicy = builder.gatewayTrafficPolicy;
        this.gatewayUniqueId = builder.gatewayUniqueId;
        this.groupName = builder.groupName;
        this.id = builder.id;
        this.metaInfo = builder.metaInfo;
        this.name = builder.name;
        this.namespace = builder.namespace;
        this.sourceType = builder.sourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GatewayService create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return gatewayTrafficPolicy
     */
    public TrafficPolicy getGatewayTrafficPolicy() {
        return this.gatewayTrafficPolicy;
    }

    /**
     * @return gatewayUniqueId
     */
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    /**
     * @return groupName
     */
    public String getGroupName() {
        return this.groupName;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return metaInfo
     */
    public String getMetaInfo() {
        return this.metaInfo;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return sourceType
     */
    public String getSourceType() {
        return this.sourceType;
    }

    public static final class Builder {
        private TrafficPolicy gatewayTrafficPolicy; 
        private String gatewayUniqueId; 
        private String groupName; 
        private Long id; 
        private String metaInfo; 
        private String name; 
        private String namespace; 
        private String sourceType; 

        private Builder() {
        } 

        private Builder(GatewayService model) {
            this.gatewayTrafficPolicy = model.gatewayTrafficPolicy;
            this.gatewayUniqueId = model.gatewayUniqueId;
            this.groupName = model.groupName;
            this.id = model.id;
            this.metaInfo = model.metaInfo;
            this.name = model.name;
            this.namespace = model.namespace;
            this.sourceType = model.sourceType;
        } 

        /**
         * GatewayTrafficPolicy.
         */
        public Builder gatewayTrafficPolicy(TrafficPolicy gatewayTrafficPolicy) {
            this.gatewayTrafficPolicy = gatewayTrafficPolicy;
            return this;
        }

        /**
         * GatewayUniqueId.
         */
        public Builder gatewayUniqueId(String gatewayUniqueId) {
            this.gatewayUniqueId = gatewayUniqueId;
            return this;
        }

        /**
         * GroupName.
         */
        public Builder groupName(String groupName) {
            this.groupName = groupName;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * MetaInfo.
         */
        public Builder metaInfo(String metaInfo) {
            this.metaInfo = metaInfo;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Namespace.
         */
        public Builder namespace(String namespace) {
            this.namespace = namespace;
            return this;
        }

        /**
         * SourceType.
         */
        public Builder sourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }

        public GatewayService build() {
            return new GatewayService(this);
        } 

    } 

}
