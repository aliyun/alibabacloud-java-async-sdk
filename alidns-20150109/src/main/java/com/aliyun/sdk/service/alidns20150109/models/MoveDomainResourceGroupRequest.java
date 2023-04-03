// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link MoveDomainResourceGroupRequest} extends {@link RequestModel}
 *
 * <p>MoveDomainResourceGroupRequest</p>
 */
public class MoveDomainResourceGroupRequest extends Request {
    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("NewResourceGroupId")
    @Validation(required = true)
    private String newResourceGroupId;

    @Query
    @NameInMap("ResourceId")
    @Validation(required = true)
    private String resourceId;

    private MoveDomainResourceGroupRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.newResourceGroupId = builder.newResourceGroupId;
        this.resourceId = builder.resourceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MoveDomainResourceGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return newResourceGroupId
     */
    public String getNewResourceGroupId() {
        return this.newResourceGroupId;
    }

    /**
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
    }

    public static final class Builder extends Request.Builder<MoveDomainResourceGroupRequest, Builder> {
        private String lang; 
        private String newResourceGroupId; 
        private String resourceId; 

        private Builder() {
            super();
        } 

        private Builder(MoveDomainResourceGroupRequest request) {
            super(request);
            this.lang = request.lang;
            this.newResourceGroupId = request.newResourceGroupId;
            this.resourceId = request.resourceId;
        } 

        /**
         * The language of some returned parameters. Default value: en. Valid values: en, zh, and ja.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The ID of the resource group.
         */
        public Builder newResourceGroupId(String newResourceGroupId) {
            this.putQueryParameter("NewResourceGroupId", newResourceGroupId);
            this.newResourceGroupId = newResourceGroupId;
            return this;
        }

        /**
         * The domain name.
         */
        public Builder resourceId(String resourceId) {
            this.putQueryParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        @Override
        public MoveDomainResourceGroupRequest build() {
            return new MoveDomainResourceGroupRequest(this);
        } 

    } 

}
