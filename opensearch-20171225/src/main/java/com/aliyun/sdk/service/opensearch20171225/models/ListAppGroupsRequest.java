// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAppGroupsRequest} extends {@link RequestModel}
 *
 * <p>ListAppGroupsRequest</p>
 */
public class ListAppGroupsRequest extends Request {
    @Query
    @NameInMap("instanceId")
    private String instanceId;

    @Query
    @NameInMap("name")
    private String name;

    @Query
    @NameInMap("pageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("pageSize")
    private Integer pageSize;

    @Query
    @NameInMap("resourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("sortBy")
    private Integer sortBy;

    @Query
    @NameInMap("tags")
    private java.util.List < Tags> tags;

    @Query
    @NameInMap("type")
    private String type;

    private ListAppGroupsRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.name = builder.name;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.resourceGroupId = builder.resourceGroupId;
        this.sortBy = builder.sortBy;
        this.tags = builder.tags;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAppGroupsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return sortBy
     */
    public Integer getSortBy() {
        return this.sortBy;
    }

    /**
     * @return tags
     */
    public java.util.List < Tags> getTags() {
        return this.tags;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<ListAppGroupsRequest, Builder> {
        private String instanceId; 
        private String name; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String resourceGroupId; 
        private Integer sortBy; 
        private java.util.List < Tags> tags; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(ListAppGroupsRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.name = request.name;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.resourceGroupId = request.resourceGroupId;
            this.sortBy = request.sortBy;
            this.tags = request.tags;
            this.type = request.type;
        } 

        /**
         * ops-cn-xxxx
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * my_name
         */
        public Builder name(String name) {
            this.putQueryParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * 1
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("pageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * 10
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * ""
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("resourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * 0
         */
        public Builder sortBy(Integer sortBy) {
            this.putQueryParameter("sortBy", sortBy);
            this.sortBy = sortBy;
            return this;
        }

        /**
         * tags.
         */
        public Builder tags(java.util.List < Tags> tags) {
            String tagsShrink = shrink(tags, "tags", "json");
            this.putQueryParameter("tags", tagsShrink);
            this.tags = tags;
            return this;
        }

        /**
         * standard
         */
        public Builder type(String type) {
            this.putQueryParameter("type", type);
            this.type = type;
            return this;
        }

        @Override
        public ListAppGroupsRequest build() {
            return new ListAppGroupsRequest(this);
        } 

    } 

    public static class Tags extends TeaModel {
        @NameInMap("key")
        private String key;

        @NameInMap("value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
}
