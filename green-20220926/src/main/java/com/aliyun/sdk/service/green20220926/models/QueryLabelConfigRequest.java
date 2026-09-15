// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220926.models;

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
 * {@link QueryLabelConfigRequest} extends {@link RequestModel}
 *
 * <p>QueryLabelConfigRequest</p>
 */
public class QueryLabelConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Classify")
    private String classify;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    private String resourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceCode")
    private String serviceCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private QueryLabelConfigRequest(Builder builder) {
        super(builder);
        this.classify = builder.classify;
        this.regionId = builder.regionId;
        this.resourceType = builder.resourceType;
        this.serviceCode = builder.serviceCode;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryLabelConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return classify
     */
    public String getClassify() {
        return this.classify;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return serviceCode
     */
    public String getServiceCode() {
        return this.serviceCode;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<QueryLabelConfigRequest, Builder> {
        private String classify; 
        private String regionId; 
        private String resourceType; 
        private String serviceCode; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(QueryLabelConfigRequest request) {
            super(request);
            this.classify = request.classify;
            this.regionId = request.regionId;
            this.resourceType = request.resourceType;
            this.serviceCode = request.serviceCode;
            this.type = request.type;
        } 

        /**
         * <p>The classification. Separate multiple values with commas.</p>
         * 
         * <strong>example:</strong>
         * <p>guard-scene</p>
         */
        public Builder classify(String classify) {
            this.putQueryParameter("Classify", classify);
            this.classify = classify;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The resource type. Separate multiple values with commas.</p>
         * 
         * <strong>example:</strong>
         * <p>image</p>
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * <p>The service code. Separate multiple values with commas.</p>
         * 
         * <strong>example:</strong>
         * <p>baselineCheck</p>
         */
        public Builder serviceCode(String serviceCode) {
            this.putQueryParameter("ServiceCode", serviceCode);
            this.serviceCode = serviceCode;
            return this;
        }

        /**
         * <p>The type. Separate multiple values with commas.
         * content_moderation</p>
         * 
         * <strong>example:</strong>
         * <p>content_moderation</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public QueryLabelConfigRequest build() {
            return new QueryLabelConfigRequest(this);
        } 

    } 

}
