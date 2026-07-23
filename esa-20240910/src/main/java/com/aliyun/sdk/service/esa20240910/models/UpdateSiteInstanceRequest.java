// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link UpdateSiteInstanceRequest} extends {@link RequestModel}
 *
 * <p>UpdateSiteInstanceRequest</p>
 */
public class UpdateSiteInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NewInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String newInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwner")
    private Long resourceOwner;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long siteId;

    private UpdateSiteInstanceRequest(Builder builder) {
        super(builder);
        this.newInstanceId = builder.newInstanceId;
        this.resourceOwner = builder.resourceOwner;
        this.siteId = builder.siteId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSiteInstanceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return newInstanceId
     */
    public String getNewInstanceId() {
        return this.newInstanceId;
    }

    /**
     * @return resourceOwner
     */
    public Long getResourceOwner() {
        return this.resourceOwner;
    }

    /**
     * @return siteId
     */
    public Long getSiteId() {
        return this.siteId;
    }

    public static final class Builder extends Request.Builder<UpdateSiteInstanceRequest, Builder> {
        private String newInstanceId; 
        private Long resourceOwner; 
        private Long siteId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateSiteInstanceRequest request) {
            super(request);
            this.newInstanceId = request.newInstanceId;
            this.resourceOwner = request.resourceOwner;
            this.siteId = request.siteId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>esa-site-bckh96ri1eyo</p>
         */
        public Builder newInstanceId(String newInstanceId) {
            this.putQueryParameter("NewInstanceId", newInstanceId);
            this.newInstanceId = newInstanceId;
            return this;
        }

        /**
         * ResourceOwner.
         */
        public Builder resourceOwner(Long resourceOwner) {
            this.putQueryParameter("ResourceOwner", resourceOwner);
            this.resourceOwner = resourceOwner;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>901109460617712</p>
         */
        public Builder siteId(Long siteId) {
            this.putQueryParameter("SiteId", siteId);
            this.siteId = siteId;
            return this;
        }

        @Override
        public UpdateSiteInstanceRequest build() {
            return new UpdateSiteInstanceRequest(this);
        } 

    } 

}
