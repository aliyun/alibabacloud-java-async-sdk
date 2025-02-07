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
 * {@link DeleteHttpsApplicationConfigurationRequest} extends {@link RequestModel}
 *
 * <p>DeleteHttpsApplicationConfigurationRequest</p>
 */
public class DeleteHttpsApplicationConfigurationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConfigId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long configId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long siteId;

    private DeleteHttpsApplicationConfigurationRequest(Builder builder) {
        super(builder);
        this.configId = builder.configId;
        this.siteId = builder.siteId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteHttpsApplicationConfigurationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return configId
     */
    public Long getConfigId() {
        return this.configId;
    }

    /**
     * @return siteId
     */
    public Long getSiteId() {
        return this.siteId;
    }

    public static final class Builder extends Request.Builder<DeleteHttpsApplicationConfigurationRequest, Builder> {
        private Long configId; 
        private Long siteId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteHttpsApplicationConfigurationRequest request) {
            super(request);
            this.configId = request.configId;
            this.siteId = request.siteId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>35281609698****</p>
         */
        public Builder configId(Long configId) {
            this.putQueryParameter("ConfigId", configId);
            this.configId = configId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123456****</p>
         */
        public Builder siteId(Long siteId) {
            this.putQueryParameter("SiteId", siteId);
            this.siteId = siteId;
            return this;
        }

        @Override
        public DeleteHttpsApplicationConfigurationRequest build() {
            return new DeleteHttpsApplicationConfigurationRequest(this);
        } 

    } 

}
