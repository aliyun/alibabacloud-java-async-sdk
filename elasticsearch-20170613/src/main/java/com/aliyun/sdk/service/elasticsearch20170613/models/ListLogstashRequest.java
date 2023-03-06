// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListLogstashRequest} extends {@link RequestModel}
 *
 * <p>ListLogstashRequest</p>
 */
public class ListLogstashRequest extends Request {
    @Query
    @NameInMap("description")
    private String description;

    @Query
    @NameInMap("instanceId")
    private String instanceId;

    @Query
    @NameInMap("page")
    private Integer page;

    @Query
    @NameInMap("resourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("size")
    private Integer size;

    @Query
    @NameInMap("tags")
    private String tags;

    @Query
    @NameInMap("version")
    private String version;

    private ListLogstashRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.instanceId = builder.instanceId;
        this.page = builder.page;
        this.resourceGroupId = builder.resourceGroupId;
        this.size = builder.size;
        this.tags = builder.tags;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListLogstashRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return page
     */
    public Integer getPage() {
        return this.page;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return size
     */
    public Integer getSize() {
        return this.size;
    }

    /**
     * @return tags
     */
    public String getTags() {
        return this.tags;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder extends Request.Builder<ListLogstashRequest, Builder> {
        private String description; 
        private String instanceId; 
        private Integer page; 
        private String resourceGroupId; 
        private Integer size; 
        private String tags; 
        private String version; 

        private Builder() {
            super();
        } 

        private Builder(ListLogstashRequest request) {
            super(request);
            this.description = request.description;
            this.instanceId = request.instanceId;
            this.page = request.page;
            this.resourceGroupId = request.resourceGroupId;
            this.size = request.size;
            this.tags = request.tags;
            this.version = request.version;
        } 

        /**
         * ls-cn-abc
         */
        public Builder description(String description) {
            this.putQueryParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * ls-cn-n6w1o5jq\*\*\*\*
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * 1
         */
        public Builder page(Integer page) {
            this.putQueryParameter("page", page);
            this.page = page;
            return this;
        }

        /**
         * rg-acfm2h5vbzd\*\*\*\*
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("resourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * 10
         */
        public Builder size(Integer size) {
            this.putQueryParameter("size", size);
            this.size = size;
            return this;
        }

        /**
         * \[{"tagKey":"key1","tagValue":"value1"}]
         */
        public Builder tags(String tags) {
            this.putQueryParameter("tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * 5.5.3\_with_X-Pack
         */
        public Builder version(String version) {
            this.putQueryParameter("version", version);
            this.version = version;
            return this;
        }

        @Override
        public ListLogstashRequest build() {
            return new ListLogstashRequest(this);
        } 

    } 

}
