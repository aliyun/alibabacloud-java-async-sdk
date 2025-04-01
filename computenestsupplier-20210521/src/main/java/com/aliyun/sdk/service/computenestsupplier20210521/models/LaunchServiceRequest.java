// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenestsupplier20210521.models;

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
 * {@link LaunchServiceRequest} extends {@link RequestModel}
 *
 * <p>LaunchServiceRequest</p>
 */
public class LaunchServiceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Categories")
    private java.util.List<String> categories;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Recommend")
    private Boolean recommend;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceVersion;

    private LaunchServiceRequest(Builder builder) {
        super(builder);
        this.categories = builder.categories;
        this.clientToken = builder.clientToken;
        this.recommend = builder.recommend;
        this.regionId = builder.regionId;
        this.serviceId = builder.serviceId;
        this.serviceVersion = builder.serviceVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LaunchServiceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return categories
     */
    public java.util.List<String> getCategories() {
        return this.categories;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return recommend
     */
    public Boolean getRecommend() {
        return this.recommend;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return serviceId
     */
    public String getServiceId() {
        return this.serviceId;
    }

    /**
     * @return serviceVersion
     */
    public String getServiceVersion() {
        return this.serviceVersion;
    }

    public static final class Builder extends Request.Builder<LaunchServiceRequest, Builder> {
        private java.util.List<String> categories; 
        private String clientToken; 
        private Boolean recommend; 
        private String regionId; 
        private String serviceId; 
        private String serviceVersion; 

        private Builder() {
            super();
        } 

        private Builder(LaunchServiceRequest request) {
            super(request);
            this.categories = request.categories;
            this.clientToken = request.clientToken;
            this.recommend = request.recommend;
            this.regionId = request.regionId;
            this.serviceId = request.serviceId;
            this.serviceVersion = request.serviceVersion;
        } 

        /**
         * <p>The categories of the service.</p>
         */
        public Builder categories(java.util.List<String> categories) {
            this.putQueryParameter("Categories", categories);
            this.categories = categories;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>10CM943JP0EN9D51H</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Whether to set the recommended service publishing to the service directory.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder recommend(Boolean recommend) {
            this.putQueryParameter("Recommend", recommend);
            this.recommend = recommend;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The service ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>service-0e6fca6a51a544xxxxxx</p>
         */
        public Builder serviceId(String serviceId) {
            this.putQueryParameter("ServiceId", serviceId);
            this.serviceId = serviceId;
            return this;
        }

        /**
         * <p>The service version.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        public Builder serviceVersion(String serviceVersion) {
            this.putQueryParameter("ServiceVersion", serviceVersion);
            this.serviceVersion = serviceVersion;
            return this;
        }

        @Override
        public LaunchServiceRequest build() {
            return new LaunchServiceRequest(this);
        } 

    } 

}
