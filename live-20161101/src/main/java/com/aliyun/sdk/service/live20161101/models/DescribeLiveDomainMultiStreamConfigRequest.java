// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link DescribeLiveDomainMultiStreamConfigRequest} extends {@link RequestModel}
 *
 * <p>DescribeLiveDomainMultiStreamConfigRequest</p>
 */
public class DescribeLiveDomainMultiStreamConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Domain")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domain;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    private DescribeLiveDomainMultiStreamConfigRequest(Builder builder) {
        super(builder);
        this.domain = builder.domain;
        this.ownerId = builder.ownerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLiveDomainMultiStreamConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    public static final class Builder extends Request.Builder<DescribeLiveDomainMultiStreamConfigRequest, Builder> {
        private String domain; 
        private Long ownerId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeLiveDomainMultiStreamConfigRequest request) {
            super(request);
            this.domain = request.domain;
            this.ownerId = request.ownerId;
        } 

        /**
         * <p>The main streaming domain.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pliveplay.gstv.com.cn</p>
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
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
        public DescribeLiveDomainMultiStreamConfigRequest build() {
            return new DescribeLiveDomainMultiStreamConfigRequest(this);
        } 

    } 

}
