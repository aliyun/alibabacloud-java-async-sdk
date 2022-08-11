// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UntagResourcesRequest} extends {@link RequestModel}
 *
 * <p>UntagResourcesRequest</p>
 */
public class UntagResourcesRequest extends Request {
    @Query
    @NameInMap("all")
    private Boolean all;

    @Query
    @NameInMap("region_id")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("resource_ids")
    @Validation(required = true)
    private java.util.List < String > resourceIds;

    @Query
    @NameInMap("resource_type")
    @Validation(required = true)
    private String resourceType;

    @Query
    @NameInMap("tag_keys")
    @Validation(required = true)
    private java.util.List < String > tagKeys;

    private UntagResourcesRequest(Builder builder) {
        super(builder);
        this.all = builder.all;
        this.regionId = builder.regionId;
        this.resourceIds = builder.resourceIds;
        this.resourceType = builder.resourceType;
        this.tagKeys = builder.tagKeys;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UntagResourcesRequest create() {
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceIds
     */
    public java.util.List < String > getResourceIds() {
        return this.resourceIds;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return tagKeys
     */
    public java.util.List < String > getTagKeys() {
        return this.tagKeys;
    }

    public static final class Builder extends Request.Builder<UntagResourcesRequest, Builder> {
        private Boolean all; 
        private String regionId; 
        private java.util.List < String > resourceIds; 
        private String resourceType; 
        private java.util.List < String > tagKeys; 

        private Builder() {
            super();
        } 

        private Builder(UntagResourcesRequest request) {
            super(request);
            this.all = request.all;
            this.regionId = request.regionId;
            this.resourceIds = request.resourceIds;
            this.resourceType = request.resourceType;
            this.tagKeys = request.tagKeys;
        } 

        /**
         * 是否删除全部自定义标签，仅当tag_keys为空时生效，取值：[true,false]。
         */
        public Builder all(Boolean all) {
            this.putQueryParameter("all", all);
            this.all = all;
            return this;
        }

        /**
         * 资源所属的地域ID
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("region_id", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * 资源ID。数组长度取值范围为：1~50
         */
        public Builder resourceIds(java.util.List < String > resourceIds) {
            this.putQueryParameter("resource_ids", resourceIds);
            this.resourceIds = resourceIds;
            return this;
        }

        /**
         * 资源类型定义。取值范围： 只支持CLUSTER这一种资源类型
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("resource_type", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * 资源的标签键。N的取值范围：1~20
         */
        public Builder tagKeys(java.util.List < String > tagKeys) {
            this.putQueryParameter("tag_keys", tagKeys);
            this.tagKeys = tagKeys;
            return this;
        }

        @Override
        public UntagResourcesRequest build() {
            return new UntagResourcesRequest(this);
        } 

    } 

}
