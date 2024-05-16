// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * The time when the compute engine instance was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * test table
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetMetaDBInfoResponseBody build() {
            return new GetMetaDBInfoResponseBody(this);
        } 

    } 

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
             * The display name of the workspace.
             */
            public Builder appGuid(String appGuid) {
                this.appGuid = appGuid;
                return this;
            }

            /**
             * The time when the compute engine instance was modified. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.
             */
            public Builder clusterBizId(String clusterBizId) {
                this.clusterBizId = clusterBizId;
                return this;
            }

            /**
             * The name of the workspace.
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * The name of the workspace owner.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The ID of the tenant.
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * The ID of the EMR cluster. This parameter is returned only for an EMR compute engine instance.
             */
            public Builder envType(Integer envType) {
                this.envType = envType;
                return this;
            }

            /**
             * Location.
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * ModifyTime.
             */
            public Builder modifyTime(Long modifyTime) {
                this.modifyTime = modifyTime;
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
             * The endpoint of the service.
             */
            public Builder ownerId(String ownerId) {
                this.ownerId = ownerId;
                return this;
            }

            /**
             * Test items
             */
            public Builder ownerName(String ownerName) {
                this.ownerName = ownerName;
                return this;
            }

            /**
             * The ID of the Alibaba Cloud account used by the workspace owner.
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * The type of the environment. Valid values: 0 and 1. The value 0 indicates the development environment. The value 1 indicates the production environment.
             */
            public Builder projectName(String projectName) {
                this.projectName = projectName;
                return this;
            }

            /**
             * The name of the metadatabase.
             */
            public Builder projectNameCn(String projectNameCn) {
                this.projectNameCn = projectNameCn;
                return this;
            }

            /**
             * TenantId.
             */
            public Builder tenantId(Long tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            /**
             * The ID of the workspace.
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
