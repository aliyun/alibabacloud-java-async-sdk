// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link MoveGtmResourceGroupRequest} extends {@link RequestModel}
 *
 * <p>MoveGtmResourceGroupRequest</p>
 */
public class MoveGtmResourceGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NewResourceGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String newResourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceId;

    private MoveGtmResourceGroupRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.newResourceGroupId = builder.newResourceGroupId;
        this.resourceId = builder.resourceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MoveGtmResourceGroupRequest create() {
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

    public static final class Builder extends Request.Builder<MoveGtmResourceGroupRequest, Builder> {
        private String lang; 
        private String newResourceGroupId; 
        private String resourceId; 

        private Builder() {
            super();
        } 

        private Builder(MoveGtmResourceGroupRequest request) {
            super(request);
            this.lang = request.lang;
            this.newResourceGroupId = request.newResourceGroupId;
            this.resourceId = request.resourceId;
        } 

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * NewResourceGroupId.
         */
        public Builder newResourceGroupId(String newResourceGroupId) {
            this.putQueryParameter("NewResourceGroupId", newResourceGroupId);
            this.newResourceGroupId = newResourceGroupId;
            return this;
        }

        /**
         * ResourceId.
         */
        public Builder resourceId(String resourceId) {
            this.putQueryParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        @Override
        public MoveGtmResourceGroupRequest build() {
            return new MoveGtmResourceGroupRequest(this);
        } 

    } 

}
