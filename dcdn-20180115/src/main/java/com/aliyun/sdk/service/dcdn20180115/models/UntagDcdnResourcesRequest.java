// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UntagDcdnResourcesRequest} extends {@link RequestModel}
 *
 * <p>UntagDcdnResourcesRequest</p>
 */
public class UntagDcdnResourcesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("All")
    private Boolean all;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > resourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TagKey")
    private java.util.List < String > tagKey;

    private UntagDcdnResourcesRequest(Builder builder) {
        super(builder);
        this.all = builder.all;
        this.resourceId = builder.resourceId;
        this.resourceType = builder.resourceType;
        this.tagKey = builder.tagKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UntagDcdnResourcesRequest create() {
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
     * @return tagKey
     */
    public java.util.List < String > getTagKey() {
        return this.tagKey;
    }

    public static final class Builder extends Request.Builder<UntagDcdnResourcesRequest, Builder> {
        private Boolean all; 
        private java.util.List < String > resourceId; 
        private String resourceType; 
        private java.util.List < String > tagKey; 

        private Builder() {
            super();
        } 

        private Builder(UntagDcdnResourcesRequest request) {
            super(request);
            this.all = request.all;
            this.resourceId = request.resourceId;
            this.resourceType = request.resourceType;
            this.tagKey = request.tagKey;
        } 

        /**
         * <p>Specifies whether to delete all tags. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * <p>Default value: <strong>false</strong></p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder all(Boolean all) {
            this.putQueryParameter("All", all);
            this.all = all;
            return this;
        }

        /**
         * <p>The ID of the resource. Valid values of N: <strong>1</strong> to <strong>50</strong>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder resourceId(java.util.List < String > resourceId) {
            this.putQueryParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * <p>The type of the resource. Set the value to <strong>DOMAIN</strong>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DOMAIN</p>
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * <p>The key of the tag. Valid values of N: <strong>1</strong> to <strong>20</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>env</p>
         */
        public Builder tagKey(java.util.List < String > tagKey) {
            this.putQueryParameter("TagKey", tagKey);
            this.tagKey = tagKey;
            return this;
        }

        @Override
        public UntagDcdnResourcesRequest build() {
            return new UntagDcdnResourcesRequest(this);
        } 

    } 

}
