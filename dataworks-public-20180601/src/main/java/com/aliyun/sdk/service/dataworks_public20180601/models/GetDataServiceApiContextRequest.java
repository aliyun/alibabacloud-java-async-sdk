// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20180601.models;

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
 * {@link GetDataServiceApiContextRequest} extends {@link RequestModel}
 *
 * <p>GetDataServiceApiContextRequest</p>
 */
public class GetDataServiceApiContextRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApiId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long apiId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApiStatus")
    private Integer apiStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CacheKey")
    private String cacheKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ForPrivateResGroup")
    private Boolean forPrivateResGroup;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Verbose")
    private Boolean verbose;

    private GetDataServiceApiContextRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.apiId = builder.apiId;
        this.apiStatus = builder.apiStatus;
        this.cacheKey = builder.cacheKey;
        this.forPrivateResGroup = builder.forPrivateResGroup;
        this.verbose = builder.verbose;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDataServiceApiContextRequest create() {
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
     * @return apiId
     */
    public Long getApiId() {
        return this.apiId;
    }

    /**
     * @return apiStatus
     */
    public Integer getApiStatus() {
        return this.apiStatus;
    }

    /**
     * @return cacheKey
     */
    public String getCacheKey() {
        return this.cacheKey;
    }

    /**
     * @return forPrivateResGroup
     */
    public Boolean getForPrivateResGroup() {
        return this.forPrivateResGroup;
    }

    /**
     * @return verbose
     */
    public Boolean getVerbose() {
        return this.verbose;
    }

    public static final class Builder extends Request.Builder<GetDataServiceApiContextRequest, Builder> {
        private String regionId; 
        private Long apiId; 
        private Integer apiStatus; 
        private String cacheKey; 
        private Boolean forPrivateResGroup; 
        private Boolean verbose; 

        private Builder() {
            super();
        } 

        private Builder(GetDataServiceApiContextRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.apiId = request.apiId;
            this.apiStatus = request.apiStatus;
            this.cacheKey = request.cacheKey;
            this.forPrivateResGroup = request.forPrivateResGroup;
            this.verbose = request.verbose;
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
         * <p>apiId</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        public Builder apiId(Long apiId) {
            this.putQueryParameter("ApiId", apiId);
            this.apiId = apiId;
            return this;
        }

        /**
         * ApiStatus.
         */
        public Builder apiStatus(Integer apiStatus) {
            this.putQueryParameter("ApiStatus", apiStatus);
            this.apiStatus = apiStatus;
            return this;
        }

        /**
         * CacheKey.
         */
        public Builder cacheKey(String cacheKey) {
            this.putQueryParameter("CacheKey", cacheKey);
            this.cacheKey = cacheKey;
            return this;
        }

        /**
         * ForPrivateResGroup.
         */
        public Builder forPrivateResGroup(Boolean forPrivateResGroup) {
            this.putQueryParameter("ForPrivateResGroup", forPrivateResGroup);
            this.forPrivateResGroup = forPrivateResGroup;
            return this;
        }

        /**
         * Verbose.
         */
        public Builder verbose(Boolean verbose) {
            this.putQueryParameter("Verbose", verbose);
            this.verbose = verbose;
            return this;
        }

        @Override
        public GetDataServiceApiContextRequest build() {
            return new GetDataServiceApiContextRequest(this);
        } 

    } 

}
