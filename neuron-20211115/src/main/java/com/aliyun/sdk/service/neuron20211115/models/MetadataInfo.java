// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.neuron20211115.models;

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
 * {@link MetadataInfo} extends {@link TeaModel}
 *
 * <p>MetadataInfo</p>
 */
public class MetadataInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("enterpriseId")
    private Long enterpriseId;

    @com.aliyun.core.annotation.NameInMap("env")
    @com.aliyun.core.annotation.Validation(required = true)
    private String env;

    @com.aliyun.core.annotation.NameInMap("id")
    private Long id;

    @com.aliyun.core.annotation.NameInMap("instanceId")
    private Long instanceId;

    @com.aliyun.core.annotation.NameInMap("namespaceId")
    private Long namespaceId;

    @com.aliyun.core.annotation.NameInMap("namespaceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespaceName;

    @com.aliyun.core.annotation.NameInMap("orgId")
    private Integer orgId;

    private MetadataInfo(Builder builder) {
        this.enterpriseId = builder.enterpriseId;
        this.env = builder.env;
        this.id = builder.id;
        this.instanceId = builder.instanceId;
        this.namespaceId = builder.namespaceId;
        this.namespaceName = builder.namespaceName;
        this.orgId = builder.orgId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MetadataInfo create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return enterpriseId
     */
    public Long getEnterpriseId() {
        return this.enterpriseId;
    }

    /**
     * @return env
     */
    public String getEnv() {
        return this.env;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return instanceId
     */
    public Long getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return namespaceId
     */
    public Long getNamespaceId() {
        return this.namespaceId;
    }

    /**
     * @return namespaceName
     */
    public String getNamespaceName() {
        return this.namespaceName;
    }

    /**
     * @return orgId
     */
    public Integer getOrgId() {
        return this.orgId;
    }

    public static final class Builder {
        private Long enterpriseId; 
        private String env; 
        private Long id; 
        private Long instanceId; 
        private Long namespaceId; 
        private String namespaceName; 
        private Integer orgId; 

        private Builder() {
        } 

        private Builder(MetadataInfo model) {
            this.enterpriseId = model.enterpriseId;
            this.env = model.env;
            this.id = model.id;
            this.instanceId = model.instanceId;
            this.namespaceId = model.namespaceId;
            this.namespaceName = model.namespaceName;
            this.orgId = model.orgId;
        } 

        /**
         * enterpriseId.
         */
        public Builder enterpriseId(Long enterpriseId) {
            this.enterpriseId = enterpriseId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder env(String env) {
            this.env = env;
            return this;
        }

        /**
         * id.
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * instanceId.
         */
        public Builder instanceId(Long instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * namespaceId.
         */
        public Builder namespaceId(Long namespaceId) {
            this.namespaceId = namespaceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>product</p>
         */
        public Builder namespaceName(String namespaceName) {
            this.namespaceName = namespaceName;
            return this;
        }

        /**
         * orgId.
         */
        public Builder orgId(Integer orgId) {
            this.orgId = orgId;
            return this;
        }

        public MetadataInfo build() {
            return new MetadataInfo(this);
        } 

    } 

}
