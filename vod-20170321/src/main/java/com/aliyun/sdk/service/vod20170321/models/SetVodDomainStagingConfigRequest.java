// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link SetVodDomainStagingConfigRequest} extends {@link RequestModel}
 *
 * <p>SetVodDomainStagingConfigRequest</p>
 */
public class SetVodDomainStagingConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Functions")
    @com.aliyun.core.annotation.Validation(required = true)
    private String functions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    private SetVodDomainStagingConfigRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.functions = builder.functions;
        this.ownerId = builder.ownerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetVodDomainStagingConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return functions
     */
    public String getFunctions() {
        return this.functions;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    public static final class Builder extends Request.Builder<SetVodDomainStagingConfigRequest, Builder> {
        private String domainName; 
        private String functions; 
        private Long ownerId; 

        private Builder() {
            super();
        } 

        private Builder(SetVodDomainStagingConfigRequest request) {
            super(request);
            this.domainName = request.domainName;
            this.functions = request.functions;
            this.ownerId = request.ownerId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder functions(String functions) {
            this.putQueryParameter("Functions", functions);
            this.functions = functions;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        @Override
        public SetVodDomainStagingConfigRequest build() {
            return new SetVodDomainStagingConfigRequest(this);
        } 

    } 

}
