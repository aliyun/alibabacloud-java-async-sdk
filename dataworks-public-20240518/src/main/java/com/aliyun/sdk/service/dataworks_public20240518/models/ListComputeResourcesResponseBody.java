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
 * {@link ListComputeResourcesResponseBody} extends {@link TeaModel}
 *
 * <p>ListComputeResourcesResponseBody</p>
 */
public class ListComputeResourcesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PagingInfo")
    private PagingInfo pagingInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListComputeResourcesResponseBody(Builder builder) {
        this.pagingInfo = builder.pagingInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListComputeResourcesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pagingInfo
     */
    public PagingInfo getPagingInfo() {
        return this.pagingInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private PagingInfo pagingInfo; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListComputeResourcesResponseBody model) {
            this.pagingInfo = model.pagingInfo;
            this.requestId = model.requestId;
        } 

        /**
         * PagingInfo.
         */
        public Builder pagingInfo(PagingInfo pagingInfo) {
            this.pagingInfo = pagingInfo;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListComputeResourcesResponseBody build() {
            return new ListComputeResourcesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListComputeResourcesResponseBody} extends {@link TeaModel}
     *
     * <p>ListComputeResourcesResponseBody</p>
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
                this.whetherDefault = model.whetherDefault;
            } 

            /**
             * ConnectionProperties.
             */
            public Builder connectionProperties(Object connectionProperties) {
                this.connectionProperties = connectionProperties;
                return this;
            }

            /**
             * ConnectionPropertiesMode.
             */
            public Builder connectionPropertiesMode(String connectionPropertiesMode) {
                this.connectionPropertiesMode = connectionPropertiesMode;
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
             * CreateUser.
             */
            public Builder createUser(String createUser) {
                this.createUser = createUser;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
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
             * ModifyTime.
             */
            public Builder modifyTime(Long modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * ModifyUser.
             */
            public Builder modifyUser(String modifyUser) {
                this.modifyUser = modifyUser;
                return this;
            }

            /**
             * WhetherDefault.
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
    /**
     * 
     * {@link ListComputeResourcesResponseBody} extends {@link TeaModel}
     *
     * <p>ListComputeResourcesResponseBody</p>
     */
    public static class ComputeResources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ComputeResource")
        private java.util.List<ComputeResource> computeResource;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private ComputeResources(Builder builder) {
            this.computeResource = builder.computeResource;
            this.name = builder.name;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ComputeResources create() {
            return builder().build();
        }

        /**
         * @return computeResource
         */
        public java.util.List<ComputeResource> getComputeResource() {
            return this.computeResource;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private java.util.List<ComputeResource> computeResource; 
            private String name; 
            private String type; 

            private Builder() {
            } 

            private Builder(ComputeResources model) {
                this.computeResource = model.computeResource;
                this.name = model.name;
                this.type = model.type;
            } 

            /**
             * ComputeResource.
             */
            public Builder computeResource(java.util.List<ComputeResource> computeResource) {
                this.computeResource = computeResource;
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
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public ComputeResources build() {
                return new ComputeResources(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListComputeResourcesResponseBody} extends {@link TeaModel}
     *
     * <p>ListComputeResourcesResponseBody</p>
     */
    public static class PagingInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ComputeResources")
        private java.util.List<ComputeResources> computeResources;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Long pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Long pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

        private PagingInfo(Builder builder) {
            this.computeResources = builder.computeResources;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PagingInfo create() {
            return builder().build();
        }

        /**
         * @return computeResources
         */
        public java.util.List<ComputeResources> getComputeResources() {
            return this.computeResources;
        }

        /**
         * @return pageNumber
         */
        public Long getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public Long getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List<ComputeResources> computeResources; 
            private Long pageNumber; 
            private Long pageSize; 
            private Long totalCount; 

            private Builder() {
            } 

            private Builder(PagingInfo model) {
                this.computeResources = model.computeResources;
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * ComputeResources.
             */
            public Builder computeResources(java.util.List<ComputeResources> computeResources) {
                this.computeResources = computeResources;
                return this;
            }

            /**
             * PageNumber.
             */
            public Builder pageNumber(Long pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PagingInfo build() {
                return new PagingInfo(this);
            } 

        } 

    }
}
