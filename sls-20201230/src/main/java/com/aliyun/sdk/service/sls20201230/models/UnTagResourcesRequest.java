// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link UnTagResourcesRequest} extends {@link RequestModel}
 *
 * <p>UnTagResourcesRequest</p>
 */
public class UnTagResourcesRequest extends Request {
    @Body
    @NameInMap("all")
    private Boolean all;

    @Body
    @NameInMap("resourceId")
    private java.util.List < String > resourceId;

    @Body
    @NameInMap("resourceType")
    @Validation(required = true)
    private String resourceType;

    @Body
    @NameInMap("tags")
    private java.util.List < String > tags;

    private UnTagResourcesRequest(Builder builder) {
        super(builder);
        this.all = builder.all;
        this.resourceId = builder.resourceId;
        this.resourceType = builder.resourceType;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UnTagResourcesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return all
     */
    public Boolean getAll() {
        return this.all;
    }

    /**
     * @return resourceId
     */
    public java.util.List < String > getResourceId() {
        return this.resourceId;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return tags
     */
    public java.util.List < String > getTags() {
        return this.tags;
    }

    public static final class Builder extends Request.Builder<UnTagResourcesRequest, Builder> {
        private Boolean all; 
        private java.util.List < String > resourceId; 
        private String resourceType; 
        private java.util.List < String > tags; 

        private Builder() {
            super();
        } 

        private Builder(UnTagResourcesRequest request) {
            super(request);
            this.all = request.all;
            this.resourceId = request.resourceId;
            this.resourceType = request.resourceType;
            this.tags = request.tags;
        } 

        /**
         * 是否删除所有标签，默认为 false，表示仅删除 tags 列表中的标签项。值为 true 时删除资源上绑定的所有标签。
         */
        public Builder all(Boolean all) {
            this.putBodyParameter("all", all);
            this.all = all;
            return this;
        }

        /**
         * 资源的 id 列表，可以一次为多个同类型资源删除相同的标签。当 all 为 false 时生效。
         */
        public Builder resourceId(java.util.List < String > resourceId) {
            this.putBodyParameter("resourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * 资源的类型。目前取值范围 ： project。
         */
        public Builder resourceType(String resourceType) {
            this.putBodyParameter("resourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * 标签 key 列表。当 all 为 false 时，仅删除列表中的标签。
         */
        public Builder tags(java.util.List < String > tags) {
            this.putBodyParameter("tags", tags);
            this.tags = tags;
            return this;
        }

        @Override
        public UnTagResourcesRequest build() {
            return new UnTagResourcesRequest(this);
        } 

    } 

}
