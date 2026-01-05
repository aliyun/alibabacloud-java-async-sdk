// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link GetComputeResourceResponseBody} extends {@link TeaModel}
 *
 * <p>GetComputeResourceResponseBody</p>
 */
public class GetComputeResourceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ComputeResource")
    private ComputeResource computeResource;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetComputeResourceResponseBody(Builder builder) {
        this.computeResource = builder.computeResource;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetComputeResourceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return computeResource
     */
    public ComputeResource getComputeResource() {
        return this.computeResource;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ComputeResource computeResource; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetComputeResourceResponseBody model) {
            this.computeResource = model.computeResource;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The details of the computing resource.</p>
         */
        public Builder computeResource(ComputeResource computeResource) {
            this.computeResource = computeResource;
            return this;
        }

        /**
         * <p>The request ID. You can use the request ID to locate logs and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>9252F32F-D855-549E-8898-61CF5A733050</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetComputeResourceResponseBody build() {
            return new GetComputeResourceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetComputeResourceResponseBody} extends {@link TeaModel}
     *
     * <p>GetComputeResourceResponseBody</p>
     */
    public static class ComputeResource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConnectionProperties")
        private Object connectionProperties;

        @com.aliyun.core.annotation.NameInMap("ConnectionPropertiesMode")
        private String connectionPropertiesMode;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("CreateUser")
        private String createUser;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private Long modifyTime;

        @com.aliyun.core.annotation.NameInMap("ModifyUser")
        private String modifyUser;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private Long projectId;

        @com.aliyun.core.annotation.NameInMap("QualifiedName")
        private String qualifiedName;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("WhetherDefault")
        private Boolean whetherDefault;

        private ComputeResource(Builder builder) {
            this.connectionProperties = builder.connectionProperties;
            this.connectionPropertiesMode = builder.connectionPropertiesMode;
            this.createTime = builder.createTime;
            this.createUser = builder.createUser;
            this.description = builder.description;
            this.id = builder.id;
            this.modifyTime = builder.modifyTime;
            this.modifyUser = builder.modifyUser;
            this.name = builder.name;
            this.projectId = builder.projectId;
            this.qualifiedName = builder.qualifiedName;
            this.type = builder.type;
            this.whetherDefault = builder.whetherDefault;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ComputeResource create() {
            return builder().build();
        }

        /**
         * @return connectionProperties
         */
        public Object getConnectionProperties() {
            return this.connectionProperties;
        }

        /**
         * @return connectionPropertiesMode
         */
        public String getConnectionPropertiesMode() {
            return this.connectionPropertiesMode;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return createUser
         */
        public String getCreateUser() {
            return this.createUser;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return modifyTime
         */
        public Long getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return modifyUser
         */
        public String getModifyUser() {
            return this.modifyUser;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return projectId
         */
        public Long getProjectId() {
            return this.projectId;
        }

        /**
         * @return qualifiedName
         */
        public String getQualifiedName() {
            return this.qualifiedName;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return whetherDefault
         */
        public Boolean getWhetherDefault() {
            return this.whetherDefault;
        }

        public static final class Builder {
            private Object connectionProperties; 
            private String connectionPropertiesMode; 
            private Long createTime; 
            private String createUser; 
            private String description; 
            private Long id; 
            private Long modifyTime; 
            private String modifyUser; 
            private String name; 
            private Long projectId; 
            private String qualifiedName; 
            private String type; 
            private Boolean whetherDefault; 

            private Builder() {
            } 

            private Builder(ComputeResource model) {
                this.connectionProperties = model.connectionProperties;
                this.connectionPropertiesMode = model.connectionPropertiesMode;
                this.createTime = model.createTime;
                this.createUser = model.createUser;
                this.description = model.description;
                this.id = model.id;
                this.modifyTime = model.modifyTime;
                this.modifyUser = model.modifyUser;
                this.name = model.name;
                this.projectId = model.projectId;
                this.qualifiedName = model.qualifiedName;
                this.type = model.type;
                this.whetherDefault = model.whetherDefault;
            } 

            /**
             * <p>The specific connection configuration details for the computing resource, including the connection address, access identity, and environment information. envType, which specifies the computing resource environment, is a property of this object. Valid values:</p>
             * <ul>
             * <li>Dev</li>
             * <li>Prod Different types of computing resources have different attribute specifications under various configuration modes (ConnectionPropertiesMode).</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>{
             *     &quot;envType&quot;: &quot;Prod&quot;,
             *     &quot;regionId&quot;: &quot;cn-beijing&quot;,
             *     &quot;instanceId&quot;: &quot;hgprecn-cn-x0r3oun4k001&quot;,
             *     &quot;database&quot;: &quot;testdb&quot;,
             *     &quot;securityProtocol&quot;: &quot;authTypeNone&quot;,
             *     &quot;authType&quot;: &quot;Executor&quot;,
             *     &quot;authIdentity&quot;: &quot;1107550004253538&quot;
             * }</p>
             */
            public Builder connectionProperties(Object connectionProperties) {
                this.connectionProperties = connectionProperties;
                return this;
            }

            /**
             * <p>The addition category of the computing resource. Different types will have different subtypes, each with corresponding parameter constraints. For instance:</p>
             * <ul>
             * <li>InstanceMode: Instance mode</li>
             * <li>UrlMode: Connection String Mode</li>
             * <li>CdhMode: CDH mode</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>InstanceMode</p>
             */
            public Builder connectionPropertiesMode(String connectionPropertiesMode) {
                this.connectionPropertiesMode = connectionPropertiesMode;
                return this;
            }

            /**
             * <p>The creation time, in timestamp format.</p>
             * 
             * <strong>example:</strong>
             * <p>1698286929333</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The ID of the creator.</p>
             * 
             * <strong>example:</strong>
             * <p>1107550004253538</p>
             */
            public Builder createUser(String createUser) {
                this.createUser = createUser;
                return this;
            }

            /**
             * <p>The description of the computing resource.</p>
             * 
             * <strong>example:</strong>
             * <p>My Description</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The ID of the computing resource.</p>
             * 
             * <strong>example:</strong>
             * <p>16738</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The last modification time, in timestamp format.</p>
             * 
             * <strong>example:</strong>
             * <p>1698286929333</p>
             */
            public Builder modifyTime(Long modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * <p>The ID of the modifier.</p>
             * 
             * <strong>example:</strong>
             * <p>1107550004253538</p>
             */
            public Builder modifyUser(String modifyUser) {
                this.modifyUser = modifyUser;
                return this;
            }

            /**
             * <p>The name of the computing resource.</p>
             * 
             * <strong>example:</strong>
             * <p>MyCs</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The ID of the workspace to which the computing resource belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>52660</p>
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * <p>The business unique key for the computing resource. For example, the format for Hologres is ${tenantOwnerId}:${regionId}:${type}:${instanceId}:${database}.</p>
             * 
             * <strong>example:</strong>
             * <p>1107550004253538:cn-beijing:holo:hgprecn-cn-x0r3oun4k001:testdb</p>
             */
            public Builder qualifiedName(String qualifiedName) {
                this.qualifiedName = qualifiedName;
                return this;
            }

            /**
             * <p>The type of the computing resource.</p>
             * 
             * <strong>example:</strong>
             * <p>hologres</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>Specifies whether it is the default computing resource.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder whetherDefault(Boolean whetherDefault) {
                this.whetherDefault = whetherDefault;
                return this;
            }

            public ComputeResource build() {
                return new ComputeResource(this);
            } 

        } 

    }
}
