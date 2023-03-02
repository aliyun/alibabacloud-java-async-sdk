// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMetaDBInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetMetaDBInfoResponseBody</p>
 */
public class GetMetaDBInfoResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
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
         * The business data returned.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The ID of the request.
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
        @NameInMap("AppGuid")
        private String appGuid;

        @NameInMap("ClusterBizId")
        private String clusterBizId;

        @NameInMap("Comment")
        private String comment;

        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("Endpoint")
        private String endpoint;

        @NameInMap("EnvType")
        private Integer envType;

        @NameInMap("Location")
        private String location;

        @NameInMap("ModifyTime")
        private Long modifyTime;

        @NameInMap("Name")
        private String name;

        @NameInMap("OwnerId")
        private String ownerId;

        @NameInMap("OwnerName")
        private String ownerName;

        @NameInMap("ProjectId")
        private Long projectId;

        @NameInMap("ProjectName")
        private String projectName;

        @NameInMap("ProjectNameCn")
        private String projectNameCn;

        @NameInMap("TenantId")
        private Long tenantId;

        @NameInMap("Type")
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
             * The ID of the compute engine instance. The ID is in the Engine type.Engine name format.
             */
            public Builder appGuid(String appGuid) {
                this.appGuid = appGuid;
                return this;
            }

            /**
             * The ID of the EMR cluster. This parameter is returned only for an EMR compute engine instance.
             */
            public Builder clusterBizId(String clusterBizId) {
                this.clusterBizId = clusterBizId;
                return this;
            }

            /**
             * The comment.
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * The time when the compute engine instance was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The endpoint of the service.
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * The type of the environment. Valid values: 0 and 1. The value 0 indicates the development environment. The value 1 indicates the production environment.
             */
            public Builder envType(Integer envType) {
                this.envType = envType;
                return this;
            }

            /**
             * The storage path of the metadatabase of the EMR cluster.
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * The time when the compute engine instance was modified. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.
             */
            public Builder modifyTime(Long modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * The name of the metadatabase.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The ID of the Alibaba Cloud account used by the workspace owner.
             */
            public Builder ownerId(String ownerId) {
                this.ownerId = ownerId;
                return this;
            }

            /**
             * The name of the workspace owner.
             */
            public Builder ownerName(String ownerName) {
                this.ownerName = ownerName;
                return this;
            }

            /**
             * The ID of the workspace.
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * The name of the workspace.
             */
            public Builder projectName(String projectName) {
                this.projectName = projectName;
                return this;
            }

            /**
             * The display name of the workspace.
             */
            public Builder projectNameCn(String projectNameCn) {
                this.projectNameCn = projectNameCn;
                return this;
            }

            /**
             * The ID of the tenant.
             */
            public Builder tenantId(Long tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            /**
             * The type of the metadatabase. Only hive is supported.
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
