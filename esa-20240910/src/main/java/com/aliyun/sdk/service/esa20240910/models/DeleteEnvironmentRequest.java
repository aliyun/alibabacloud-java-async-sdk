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
 * {@link DeleteEnvironmentRequest} extends {@link RequestModel}
 *
 * <p>DeleteEnvironmentRequest</p>
 */
public class DeleteEnvironmentRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnvironmentName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String environmentName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long siteId;

    private DeleteEnvironmentRequest(Builder builder) {
        super(builder);
        this.environmentName = builder.environmentName;
        this.siteId = builder.siteId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteEnvironmentRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return environmentName
     */
    public String getEnvironmentName() {
        return this.environmentName;
    }

    /**
     * @return siteId
     */
    public Long getSiteId() {
        return this.siteId;
    }

    public static final class Builder extends Request.Builder<DeleteEnvironmentRequest, Builder> {
        private String environmentName; 
        private Long siteId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteEnvironmentRequest request) {
            super(request);
            this.environmentName = request.environmentName;
            this.siteId = request.siteId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder environmentName(String environmentName) {
            this.putQueryParameter("EnvironmentName", environmentName);
            this.environmentName = environmentName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder siteId(Long siteId) {
            this.putQueryParameter("SiteId", siteId);
            this.siteId = siteId;
            return this;
        }

        @Override
        public DeleteEnvironmentRequest build() {
            return new DeleteEnvironmentRequest(this);
        } 

    } 

}
