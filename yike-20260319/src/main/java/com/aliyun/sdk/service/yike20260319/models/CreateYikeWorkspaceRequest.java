// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yike20260319.models;

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
 * {@link CreateYikeWorkspaceRequest} extends {@link RequestModel}
 *
 * <p>CreateYikeWorkspaceRequest</p>
 */
public class CreateYikeWorkspaceRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Title")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 50)
    private String title;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserCountLimit")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 1000, minimum = 2)
    private Long userCountLimit;

    private CreateYikeWorkspaceRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.title = builder.title;
        this.userCountLimit = builder.userCountLimit;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateYikeWorkspaceRequest create() {
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
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * @return userCountLimit
     */
    public Long getUserCountLimit() {
        return this.userCountLimit;
    }

    public static final class Builder extends Request.Builder<CreateYikeWorkspaceRequest, Builder> {
        private String regionId; 
        private String title; 
        private Long userCountLimit; 

        private Builder() {
            super();
        } 

        private Builder(CreateYikeWorkspaceRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.title = request.title;
            this.userCountLimit = request.userCountLimit;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>title</p>
         */
        public Builder title(String title) {
            this.putQueryParameter("Title", title);
            this.title = title;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder userCountLimit(Long userCountLimit) {
            this.putQueryParameter("UserCountLimit", userCountLimit);
            this.userCountLimit = userCountLimit;
            return this;
        }

        @Override
        public CreateYikeWorkspaceRequest build() {
            return new CreateYikeWorkspaceRequest(this);
        } 

    } 

}
