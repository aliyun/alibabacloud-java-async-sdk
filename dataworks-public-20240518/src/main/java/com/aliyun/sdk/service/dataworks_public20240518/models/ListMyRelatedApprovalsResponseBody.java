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
 * {@link ListMyRelatedApprovalsResponseBody} extends {@link TeaModel}
 *
 * <p>ListMyRelatedApprovalsResponseBody</p>
 */
public class ListMyRelatedApprovalsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListMyRelatedApprovalsResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMyRelatedApprovalsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(ListMyRelatedApprovalsResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListMyRelatedApprovalsResponseBody build() {
            return new ListMyRelatedApprovalsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListMyRelatedApprovalsResponseBody} extends {@link TeaModel}
     *
     * <p>ListMyRelatedApprovalsResponseBody</p>
     */
    public static class Grantee extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PrincipalId")
        private String principalId;

        @com.aliyun.core.annotation.NameInMap("PrincipalType")
        private String principalType;

        private Grantee(Builder builder) {
            this.principalId = builder.principalId;
            this.principalType = builder.principalType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Grantee create() {
            return builder().build();
        }

        /**
         * @return principalId
         */
        public String getPrincipalId() {
            return this.principalId;
        }

        /**
         * @return principalType
         */
        public String getPrincipalType() {
            return this.principalType;
        }

        public static final class Builder {
            private String principalId; 
            private String principalType; 

            private Builder() {
            } 

            private Builder(Grantee model) {
                this.principalId = model.principalId;
                this.principalType = model.principalType;
            } 

            /**
             * PrincipalId.
             */
            public Builder principalId(String principalId) {
                this.principalId = principalId;
                return this;
            }

            /**
             * PrincipalType.
             */
            public Builder principalType(String principalType) {
                this.principalType = principalType;
                return this;
            }

            public Grantee build() {
                return new Grantee(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListMyRelatedApprovalsResponseBody} extends {@link TeaModel}
     *
     * <p>ListMyRelatedApprovalsResponseBody</p>
     */
    public static class Resource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DefSchema")
        private String defSchema;

        @com.aliyun.core.annotation.NameInMap("DefVersion")
        private String defVersion;

        @com.aliyun.core.annotation.NameInMap("MetaData")
        private java.util.Map<String, ?> metaData;

        private Resource(Builder builder) {
            this.defSchema = builder.defSchema;
            this.defVersion = builder.defVersion;
            this.metaData = builder.metaData;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Resource create() {
            return builder().build();
        }

        /**
         * @return defSchema
         */
        public String getDefSchema() {
            return this.defSchema;
        }

        /**
         * @return defVersion
         */
        public String getDefVersion() {
            return this.defVersion;
        }

        /**
         * @return metaData
         */
        public java.util.Map<String, ?> getMetaData() {
            return this.metaData;
        }

        public static final class Builder {
            private String defSchema; 
            private String defVersion; 
            private java.util.Map<String, ?> metaData; 

            private Builder() {
            } 

            private Builder(Resource model) {
                this.defSchema = model.defSchema;
                this.defVersion = model.defVersion;
                this.metaData = model.metaData;
            } 

            /**
             * DefSchema.
             */
            public Builder defSchema(String defSchema) {
                this.defSchema = defSchema;
                return this;
            }

            /**
             * DefVersion.
             */
            public Builder defVersion(String defVersion) {
                this.defVersion = defVersion;
                return this;
            }

            /**
             * MetaData.
             */
            public Builder metaData(java.util.Map<String, ?> metaData) {
                this.metaData = metaData;
                return this;
            }

            public Resource build() {
                return new Resource(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListMyRelatedApprovalsResponseBody} extends {@link TeaModel}
     *
     * <p>ListMyRelatedApprovalsResponseBody</p>
     */
    public static class Contents extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessTypes")
        private java.util.List<String> accessTypes;

        @com.aliyun.core.annotation.NameInMap("AuthMethod")
        private String authMethod;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("DefSchema")
        private String defSchema;

        @com.aliyun.core.annotation.NameInMap("ExpirationTime")
        private Long expirationTime;

        @com.aliyun.core.annotation.NameInMap("FinalAccessTypes")
        private java.util.List<String> finalAccessTypes;

        @com.aliyun.core.annotation.NameInMap("Grantee")
        private Grantee grantee;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("ProcessInstanceId")
        private String processInstanceId;

        @com.aliyun.core.annotation.NameInMap("Resource")
        private Resource resource;

        @com.aliyun.core.annotation.NameInMap("ResourceName")
        private String resourceName;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TenantId")
        private String tenantId;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private Long updateTime;

        private Contents(Builder builder) {
            this.accessTypes = builder.accessTypes;
            this.authMethod = builder.authMethod;
            this.createTime = builder.createTime;
            this.defSchema = builder.defSchema;
            this.expirationTime = builder.expirationTime;
            this.finalAccessTypes = builder.finalAccessTypes;
            this.grantee = builder.grantee;
            this.id = builder.id;
            this.processInstanceId = builder.processInstanceId;
            this.resource = builder.resource;
            this.resourceName = builder.resourceName;
            this.status = builder.status;
            this.tenantId = builder.tenantId;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Contents create() {
            return builder().build();
        }

        /**
         * @return accessTypes
         */
        public java.util.List<String> getAccessTypes() {
            return this.accessTypes;
        }

        /**
         * @return authMethod
         */
        public String getAuthMethod() {
            return this.authMethod;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return defSchema
         */
        public String getDefSchema() {
            return this.defSchema;
        }

        /**
         * @return expirationTime
         */
        public Long getExpirationTime() {
            return this.expirationTime;
        }

        /**
         * @return finalAccessTypes
         */
        public java.util.List<String> getFinalAccessTypes() {
            return this.finalAccessTypes;
        }

        /**
         * @return grantee
         */
        public Grantee getGrantee() {
            return this.grantee;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return processInstanceId
         */
        public String getProcessInstanceId() {
            return this.processInstanceId;
        }

        /**
         * @return resource
         */
        public Resource getResource() {
            return this.resource;
        }

        /**
         * @return resourceName
         */
        public String getResourceName() {
            return this.resourceName;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tenantId
         */
        public String getTenantId() {
            return this.tenantId;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private java.util.List<String> accessTypes; 
            private String authMethod; 
            private Long createTime; 
            private String defSchema; 
            private Long expirationTime; 
            private java.util.List<String> finalAccessTypes; 
            private Grantee grantee; 
            private String id; 
            private String processInstanceId; 
            private Resource resource; 
            private String resourceName; 
            private String status; 
            private String tenantId; 
            private Long updateTime; 

            private Builder() {
            } 

            private Builder(Contents model) {
                this.accessTypes = model.accessTypes;
                this.authMethod = model.authMethod;
                this.createTime = model.createTime;
                this.defSchema = model.defSchema;
                this.expirationTime = model.expirationTime;
                this.finalAccessTypes = model.finalAccessTypes;
                this.grantee = model.grantee;
                this.id = model.id;
                this.processInstanceId = model.processInstanceId;
                this.resource = model.resource;
                this.resourceName = model.resourceName;
                this.status = model.status;
                this.tenantId = model.tenantId;
                this.updateTime = model.updateTime;
            } 

            /**
             * AccessTypes.
             */
            public Builder accessTypes(java.util.List<String> accessTypes) {
                this.accessTypes = accessTypes;
                return this;
            }

            /**
             * AuthMethod.
             */
            public Builder authMethod(String authMethod) {
                this.authMethod = authMethod;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * DefSchema.
             */
            public Builder defSchema(String defSchema) {
                this.defSchema = defSchema;
                return this;
            }

            /**
             * ExpirationTime.
             */
            public Builder expirationTime(Long expirationTime) {
                this.expirationTime = expirationTime;
                return this;
            }

            /**
             * FinalAccessTypes.
             */
            public Builder finalAccessTypes(java.util.List<String> finalAccessTypes) {
                this.finalAccessTypes = finalAccessTypes;
                return this;
            }

            /**
             * Grantee.
             */
            public Builder grantee(Grantee grantee) {
                this.grantee = grantee;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * ProcessInstanceId.
             */
            public Builder processInstanceId(String processInstanceId) {
                this.processInstanceId = processInstanceId;
                return this;
            }

            /**
             * Resource.
             */
            public Builder resource(Resource resource) {
                this.resource = resource;
                return this;
            }

            /**
             * ResourceName.
             */
            public Builder resourceName(String resourceName) {
                this.resourceName = resourceName;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * TenantId.
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public Contents build() {
                return new Contents(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListMyRelatedApprovalsResponseBody} extends {@link TeaModel}
     *
     * <p>ListMyRelatedApprovalsResponseBody</p>
     */
    public static class DataData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApplicationTime")
        private Long applicationTime;

        @com.aliyun.core.annotation.NameInMap("Contents")
        private java.util.List<Contents> contents;

        @com.aliyun.core.annotation.NameInMap("DefSchema")
        private String defSchema;

        @com.aliyun.core.annotation.NameInMap("ProcessInstanceId")
        private String processInstanceId;

        @com.aliyun.core.annotation.NameInMap("Reason")
        private String reason;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private DataData(Builder builder) {
            this.applicationTime = builder.applicationTime;
            this.contents = builder.contents;
            this.defSchema = builder.defSchema;
            this.processInstanceId = builder.processInstanceId;
            this.reason = builder.reason;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataData create() {
            return builder().build();
        }

        /**
         * @return applicationTime
         */
        public Long getApplicationTime() {
            return this.applicationTime;
        }

        /**
         * @return contents
         */
        public java.util.List<Contents> getContents() {
            return this.contents;
        }

        /**
         * @return defSchema
         */
        public String getDefSchema() {
            return this.defSchema;
        }

        /**
         * @return processInstanceId
         */
        public String getProcessInstanceId() {
            return this.processInstanceId;
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Long applicationTime; 
            private java.util.List<Contents> contents; 
            private String defSchema; 
            private String processInstanceId; 
            private String reason; 
            private String status; 

            private Builder() {
            } 

            private Builder(DataData model) {
                this.applicationTime = model.applicationTime;
                this.contents = model.contents;
                this.defSchema = model.defSchema;
                this.processInstanceId = model.processInstanceId;
                this.reason = model.reason;
                this.status = model.status;
            } 

            /**
             * ApplicationTime.
             */
            public Builder applicationTime(Long applicationTime) {
                this.applicationTime = applicationTime;
                return this;
            }

            /**
             * Contents.
             */
            public Builder contents(java.util.List<Contents> contents) {
                this.contents = contents;
                return this;
            }

            /**
             * DefSchema.
             */
            public Builder defSchema(String defSchema) {
                this.defSchema = defSchema;
                return this;
            }

            /**
             * ProcessInstanceId.
             */
            public Builder processInstanceId(String processInstanceId) {
                this.processInstanceId = processInstanceId;
                return this;
            }

            /**
             * Reason.
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public DataData build() {
                return new DataData(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListMyRelatedApprovalsResponseBody} extends {@link TeaModel}
     *
     * <p>ListMyRelatedApprovalsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Data")
        private java.util.List<DataData> data;

        @com.aliyun.core.annotation.NameInMap("HasMore")
        private Boolean hasMore;

        @com.aliyun.core.annotation.NameInMap("NextToken")
        private String nextToken;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        private Data(Builder builder) {
            this.data = builder.data;
            this.hasMore = builder.hasMore;
            this.nextToken = builder.nextToken;
            this.pageSize = builder.pageSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public java.util.List<DataData> getData() {
            return this.data;
        }

        /**
         * @return hasMore
         */
        public Boolean getHasMore() {
            return this.hasMore;
        }

        /**
         * @return nextToken
         */
        public String getNextToken() {
            return this.nextToken;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        public static final class Builder {
            private java.util.List<DataData> data; 
            private Boolean hasMore; 
            private String nextToken; 
            private Integer pageSize; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.data = model.data;
                this.hasMore = model.hasMore;
                this.nextToken = model.nextToken;
                this.pageSize = model.pageSize;
            } 

            /**
             * Data.
             */
            public Builder data(java.util.List<DataData> data) {
                this.data = data;
                return this;
            }

            /**
             * HasMore.
             */
            public Builder hasMore(Boolean hasMore) {
                this.hasMore = hasMore;
                return this;
            }

            /**
             * NextToken.
             */
            public Builder nextToken(String nextToken) {
                this.nextToken = nextToken;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
