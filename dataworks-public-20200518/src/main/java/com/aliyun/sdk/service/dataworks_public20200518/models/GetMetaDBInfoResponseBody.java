// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetMetaDBInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetMetaDBInfoResponseBody</p>
 */
public class GetMetaDBInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetMetaDBInfoResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMetaDBInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * <p>The basic metadata information.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0bc1411515937****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetMetaDBInfoResponseBody build() {
            return new GetMetaDBInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetMetaDBInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetMetaDBInfoResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppGuid")
        private String appGuid;

        @com.aliyun.core.annotation.NameInMap("ClusterBizId")
        private String clusterBizId;

        @com.aliyun.core.annotation.NameInMap("Comment")
        private String comment;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("Endpoint")
        private String endpoint;

        @com.aliyun.core.annotation.NameInMap("EnvType")
        private Integer envType;

        @com.aliyun.core.annotation.NameInMap("Location")
        private String location;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private Long modifyTime;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("OwnerId")
        private String ownerId;

        @com.aliyun.core.annotation.NameInMap("OwnerName")
        private String ownerName;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private Long projectId;

        @com.aliyun.core.annotation.NameInMap("ProjectName")
        private String projectName;

        @com.aliyun.core.annotation.NameInMap("ProjectNameCn")
        private String projectNameCn;

        @com.aliyun.core.annotation.NameInMap("TenantId")
        private Long tenantId;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Data(Builder builder) {
            this.appGuid = builder.appGuid;
            this.clusterBizId = builder.clusterBizId;
            this.comment = builder.comment;
            this.createTime = builder.createTime;
            this.endpoint = builder.endpoint;
            this.envType = builder.envType;
            this.location = builder.location;
            this.modifyTime = builder.modifyTime;
            this.name = builder.name;
            this.ownerId = builder.ownerId;
            this.ownerName = builder.ownerName;
            this.projectId = builder.projectId;
            this.projectName = builder.projectName;
            this.projectNameCn = builder.projectNameCn;
            this.tenantId = builder.tenantId;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return appGuid
         */
        public String getAppGuid() {
            return this.appGuid;
        }

        /**
         * @return clusterBizId
         */
        public String getClusterBizId() {
            return this.clusterBizId;
        }

        /**
         * @return comment
         */
        public String getComment() {
            return this.comment;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return endpoint
         */
        public String getEndpoint() {
            return this.endpoint;
        }

        /**
         * @return envType
         */
        public Integer getEnvType() {
            return this.envType;
        }

        /**
         * @return location
         */
        public String getLocation() {
            return this.location;
        }

        /**
         * @return modifyTime
         */
        public Long getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return ownerId
         */
        public String getOwnerId() {
            return this.ownerId;
        }

        /**
         * @return ownerName
         */
        public String getOwnerName() {
            return this.ownerName;
        }

        /**
         * @return projectId
         */
        public Long getProjectId() {
            return this.projectId;
        }

        /**
         * @return projectName
         */
        public String getProjectName() {
            return this.projectName;
        }

        /**
         * @return projectNameCn
         */
        public String getProjectNameCn() {
            return this.projectNameCn;
        }

        /**
         * @return tenantId
         */
        public Long getTenantId() {
            return this.tenantId;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String appGuid; 
            private String clusterBizId; 
            private String comment; 
            private Long createTime; 
            private String endpoint; 
            private Integer envType; 
            private String location; 
            private Long modifyTime; 
            private String name; 
            private String ownerId; 
            private String ownerName; 
            private Long projectId; 
            private String projectName; 
            private String projectNameCn; 
            private Long tenantId; 
            private String type; 

            /**
             * <p>The compute engine instance ID. Specify the ID in the <code>Engine type.Engine name</code> format.</p>
             * 
             * <strong>example:</strong>
             * <p>odps.engine_name</p>
             */
            public Builder appGuid(String appGuid) {
                this.appGuid = appGuid;
                return this;
            }

            /**
             * <p>The EMR cluster ID.</p>
             * 
             * <strong>example:</strong>
             * <p>abc</p>
             */
            public Builder clusterBizId(String clusterBizId) {
                this.clusterBizId = clusterBizId;
                return this;
            }

            /**
             * <p>The comment.</p>
             * 
             * <strong>example:</strong>
             * <p>The ID of the compute engine instance. The ID is in the Engine type.Engine name format.</p>
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * <p>The time when the compute engine instance was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1541576644000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The endpoint of the service.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://service.odpsstg.aliyun-inc.com/">http://service.odpsstg.aliyun-inc.com/</a></p>
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * <p>The type of the environment. Valid values: 0 and 1. The value 0 indicates the development environment. The value 1 indicates the production environment.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder envType(Integer envType) {
                this.envType = envType;
                return this;
            }

            /**
             * <p>The storage path of the metadatabase of the EMR cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>hdfs://</p>
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * <p>The time when the compute engine instance was modified.</p>
             * 
             * <strong>example:</strong>
             * <p>1541576644000</p>
             */
            public Builder modifyTime(Long modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * <p>The name of the database.</p>
             * 
             * <strong>example:</strong>
             * <p>abc</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account used by the workspace owner.</p>
             * 
             * <strong>example:</strong>
             * <p>23</p>
             */
            public Builder ownerId(String ownerId) {
                this.ownerId = ownerId;
                return this;
            }

            /**
             * <p>The name of the workspace owner.</p>
             * 
             * <strong>example:</strong>
             * <p>323</p>
             */
            public Builder ownerName(String ownerName) {
                this.ownerName = ownerName;
                return this;
            }

            /**
             * <p>The workspace ID.</p>
             * 
             * <strong>example:</strong>
             * <p>22</p>
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * <p>The name of the workspace.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder projectName(String projectName) {
                this.projectName = projectName;
                return this;
            }

            /**
             * <p>The display name of the workspace.</p>
             * 
             * <strong>example:</strong>
             * <p>The storage path of the metadatabase of the EMR cluster.</p>
             */
            public Builder projectNameCn(String projectNameCn) {
                this.projectNameCn = projectNameCn;
                return this;
            }

            /**
             * <p>The tenant ID.</p>
             * 
             * <strong>example:</strong>
             * <p>233</p>
             */
            public Builder tenantId(Long tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            /**
             * <p>The type of the metadatabase.</p>
             * 
             * <strong>example:</strong>
             * <p>hive</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
