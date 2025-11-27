// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpcinstant20230701.models;

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
 * {@link SynchronizeAppRequest} extends {@link RequestModel}
 *
 * <p>SynchronizeAppRequest</p>
 */
public class SynchronizeAppRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetRegionIds")
    private java.util.List<String> targetRegionIds;

    private SynchronizeAppRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.targetRegionIds = builder.targetRegionIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SynchronizeAppRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return targetRegionIds
     */
    public java.util.List<String> getTargetRegionIds() {
        return this.targetRegionIds;
    }

    public static final class Builder extends Request.Builder<SynchronizeAppRequest, Builder> {
        private String appId; 
        private java.util.List<String> targetRegionIds; 

        private Builder() {
            super();
        } 

        private Builder(SynchronizeAppRequest request) {
            super(request);
            this.appId = request.appId;
            this.targetRegionIds = request.targetRegionIds;
        } 

        /**
         * <p>The application ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ci-vm-rYfypJKwlN9Y</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The list of arrays that are synchronized to the specified region. If &quot;all&quot; is included, it is synchronized to all other unsynchronized regions by default.</p>
         */
        public Builder targetRegionIds(java.util.List<String> targetRegionIds) {
            String targetRegionIdsShrink = shrink(targetRegionIds, "TargetRegionIds", "json");
            this.putQueryParameter("TargetRegionIds", targetRegionIdsShrink);
            this.targetRegionIds = targetRegionIds;
            return this;
        }

        @Override
        public SynchronizeAppRequest build() {
            return new SynchronizeAppRequest(this);
        } 

    } 

}
