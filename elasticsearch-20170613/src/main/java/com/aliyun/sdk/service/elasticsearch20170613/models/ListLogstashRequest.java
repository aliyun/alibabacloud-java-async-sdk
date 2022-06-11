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
    @Body
    @NameInMap("body")
    private String body;

    @Query
    @NameInMap("description")
    private String description;

    @Query
    @NameInMap("instanceId")
    private String instanceId;

    @Query
    @NameInMap("ownerId")
    private String ownerId;

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
    @NameInMap("version")
    private String version;

    private ListLogstashRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
        this.description = builder.description;
        this.instanceId = builder.instanceId;
        this.ownerId = builder.ownerId;
        this.page = builder.page;
        this.resourceGroupId = builder.resourceGroupId;
        this.size = builder.size;
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
     * @return body
     */
    public String getBody() {
        return this.body;
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
     * @return ownerId
     */
    public String getOwnerId() {
        return this.ownerId;
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
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder extends Request.Builder<ListLogstashRequest, Builder> {
        private String body; 
        private String description; 
        private String instanceId; 
        private String ownerId; 
        private Integer page; 
        private String resourceGroupId; 
        private Integer size; 
        private String version; 

        private Builder() {
            super();
        } 

        private Builder(ListLogstashRequest request) {
            super(request);
            this.body = request.body;
            this.description = request.description;
            this.instanceId = request.instanceId;
            this.ownerId = request.ownerId;
            this.page = request.page;
            this.resourceGroupId = request.resourceGroupId;
            this.size = request.size;
            this.version = request.version;
        } 

        /**
         * body.
         */
        public Builder body(String body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.putQueryParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * instanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * ownerId.
         */
        public Builder ownerId(String ownerId) {
            this.putQueryParameter("ownerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * page.
         */
        public Builder page(Integer page) {
            this.putQueryParameter("page", page);
            this.page = page;
            return this;
        }

        /**
         * resourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("resourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * size.
         */
        public Builder size(Integer size) {
            this.putQueryParameter("size", size);
            this.size = size;
            return this;
        }

        /**
         * version.
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
