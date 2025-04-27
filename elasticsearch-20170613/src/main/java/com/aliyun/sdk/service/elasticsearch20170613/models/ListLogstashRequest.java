// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

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
 * {@link ListLogstashRequest} extends {@link RequestModel}
 *
 * <p>ListLogstashRequest</p>
 */
public class ListLogstashRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("instanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("page")
    private Integer page;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("resourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("size")
    private Integer size;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tags")
    private String tags;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("version")
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
         * <p>rg-acfm2h5vbzd****</p>
         * 
         * <strong>example:</strong>
         * <p>ls-cn-abc</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>[{&quot;tagKey&quot;:&quot;key1&quot;,&quot;tagValue&quot;:&quot;value1&quot;}]</p>
         * 
         * <strong>example:</strong>
         * <p>ls-cn-n6w1o5jq****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>ls-cn-n6w1o5jq****</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder page(Integer page) {
            this.putQueryParameter("page", page);
            this.page = page;
            return this;
        }

        /**
         * <p>Details of the request header.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfm2h5vbzd****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("resourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>5.5.3_with_X-Pack</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder size(Integer size) {
            this.putQueryParameter("size", size);
            this.size = size;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;tagKey&quot;:&quot;key1&quot;,&quot;tagValue&quot;:&quot;value1&quot;}]</p>
         */
        public Builder tags(String tags) {
            this.putQueryParameter("tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>5.5.3_with_X-Pack</p>
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
