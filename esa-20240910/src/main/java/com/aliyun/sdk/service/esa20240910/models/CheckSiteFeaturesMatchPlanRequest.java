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
 * {@link CheckSiteFeaturesMatchPlanRequest} extends {@link RequestModel}
 *
 * <p>CheckSiteFeaturesMatchPlanRequest</p>
 */
public class CheckSiteFeaturesMatchPlanRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NewInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String newInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long siteId;

    private CheckSiteFeaturesMatchPlanRequest(Builder builder) {
        super(builder);
        this.newInstanceId = builder.newInstanceId;
        this.siteId = builder.siteId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckSiteFeaturesMatchPlanRequest create() {
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
     * @return siteId
     */
    public Long getSiteId() {
        return this.siteId;
    }

    public static final class Builder extends Request.Builder<CheckSiteFeaturesMatchPlanRequest, Builder> {
        private String newInstanceId; 
        private Long siteId; 

        private Builder() {
            super();
        } 

        private Builder(CheckSiteFeaturesMatchPlanRequest request) {
            super(request);
            this.newInstanceId = request.newInstanceId;
            this.siteId = request.siteId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>esa-site-b0bivjxucjk0</p>
         */
        public Builder newInstanceId(String newInstanceId) {
            this.putQueryParameter("NewInstanceId", newInstanceId);
            this.newInstanceId = newInstanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>861405331573200</p>
         */
        public Builder siteId(Long siteId) {
            this.putQueryParameter("SiteId", siteId);
            this.siteId = siteId;
            return this;
        }

        @Override
        public CheckSiteFeaturesMatchPlanRequest build() {
            return new CheckSiteFeaturesMatchPlanRequest(this);
        } 

    } 

}
