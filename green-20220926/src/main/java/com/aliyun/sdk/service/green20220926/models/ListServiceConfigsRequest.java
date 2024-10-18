// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220926.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListServiceConfigsRequest} extends {@link RequestModel}
 *
 * <p>ListServiceConfigsRequest</p>
 */
public class ListServiceConfigsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Classify")
    private String classify;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    private String resourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UseStatus")
    private String useStatus;

    private ListServiceConfigsRequest(Builder builder) {
        super(builder);
        this.classify = builder.classify;
        this.regionId = builder.regionId;
        this.resourceType = builder.resourceType;
        this.useStatus = builder.useStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListServiceConfigsRequest create() {
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
     * @return useStatus
     */
    public String getUseStatus() {
        return this.useStatus;
    }

    public static final class Builder extends Request.Builder<ListServiceConfigsRequest, Builder> {
        private String classify; 
        private String regionId; 
        private String resourceType; 
        private String useStatus; 

        private Builder() {
            super();
        } 

        private Builder(ListServiceConfigsRequest request) {
            super(request);
            this.classify = request.classify;
            this.regionId = request.regionId;
            this.resourceType = request.resourceType;
            this.useStatus = request.useStatus;
        } 

        /**
         * Classify.
         */
        public Builder classify(String classify) {
            this.putQueryParameter("Classify", classify);
            this.classify = classify;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceType.
         */
        public Builder resourceType(String resourceType) {
            this.putBodyParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * UseStatus.
         */
        public Builder useStatus(String useStatus) {
            this.putQueryParameter("UseStatus", useStatus);
            this.useStatus = useStatus;
            return this;
        }

        @Override
        public ListServiceConfigsRequest build() {
            return new ListServiceConfigsRequest(this);
        } 

    } 

}
