// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms20250414.models;

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
 * {@link ResetAgenticApiKeyRequest} extends {@link RequestModel}
 *
 * <p>ResetAgenticApiKeyRequest</p>
 */
public class ResetAgenticApiKeyRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExpireAfterSeconds")
    @com.aliyun.core.annotation.Validation(maximum = 31536000, minimum = 1)
    private Integer expireAfterSeconds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long id;

    private ResetAgenticApiKeyRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.expireAfterSeconds = builder.expireAfterSeconds;
        this.id = builder.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResetAgenticApiKeyRequest create() {
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
     * @return expireAfterSeconds
     */
    public Integer getExpireAfterSeconds() {
        return this.expireAfterSeconds;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    public static final class Builder extends Request.Builder<ResetAgenticApiKeyRequest, Builder> {
        private String regionId; 
        private Integer expireAfterSeconds; 
        private Long id; 

        private Builder() {
            super();
        } 

        private Builder(ResetAgenticApiKeyRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.expireAfterSeconds = request.expireAfterSeconds;
            this.id = request.id;
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
         * <p>The validity period of the new Access Token starting from the time of this reset, in seconds. Valid values: 1 to 31536000 (approximately 365 days). If you do not specify this parameter, the original expiration time of the Access Token is retained. This parameter is required when the target Access Token has already expired. Otherwise, the system retains the past expiration time and issues an Access Token that is invalid upon creation, and the request is rejected.</p>
         * 
         * <strong>example:</strong>
         * <p>2592000</p>
         */
        public Builder expireAfterSeconds(Integer expireAfterSeconds) {
            this.putQueryParameter("ExpireAfterSeconds", expireAfterSeconds);
            this.expireAfterSeconds = expireAfterSeconds;
            return this;
        }

        /**
         * <p>The ID of the data gateway Access Token to reset. This value is the same as the Id returned by the create and query operations. Only the creator of the Access Token can reset it, and the target Access Token cannot be in a revoked state.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        @Override
        public ResetAgenticApiKeyRequest build() {
            return new ResetAgenticApiKeyRequest(this);
        } 

    } 

}
