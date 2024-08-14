// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveEntityTagsRequest} extends {@link RequestModel}
 *
 * <p>RemoveEntityTagsRequest</p>
 */
public class RemoveEntityTagsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QualifiedName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String qualifiedName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TagKeys")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > tagKeys;

    private RemoveEntityTagsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.qualifiedName = builder.qualifiedName;
        this.tagKeys = builder.tagKeys;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveEntityTagsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return qualifiedName
     */
    public String getQualifiedName() {
        return this.qualifiedName;
    }

    /**
     * @return tagKeys
     */
    public java.util.List < String > getTagKeys() {
        return this.tagKeys;
    }

    public static final class Builder extends Request.Builder<RemoveEntityTagsRequest, Builder> {
        private String regionId; 
        private String qualifiedName; 
        private java.util.List < String > tagKeys; 

        private Builder() {
            super();
        } 

        private Builder(RemoveEntityTagsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.qualifiedName = request.qualifiedName;
            this.tagKeys = request.tagKeys;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The unique identifier of the entity. Example: maxcompute-table.projectA.tableA.
         */
        public Builder qualifiedName(String qualifiedName) {
            this.putQueryParameter("QualifiedName", qualifiedName);
            this.qualifiedName = qualifiedName;
            return this;
        }

        /**
         * The tag keys.
         */
        public Builder tagKeys(java.util.List < String > tagKeys) {
            String tagKeysShrink = shrink(tagKeys, "TagKeys", "json");
            this.putBodyParameter("TagKeys", tagKeysShrink);
            this.tagKeys = tagKeys;
            return this;
        }

        @Override
        public RemoveEntityTagsRequest build() {
            return new RemoveEntityTagsRequest(this);
        } 

    } 

}
