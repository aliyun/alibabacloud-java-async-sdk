// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudcontrol20220830.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPriceRequest} extends {@link RequestModel}
 *
 * <p>GetPriceRequest</p>
 */
public class GetPriceRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("requestPath")
    private String requestPath;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("resourceAttributes")
    private java.util.Map < String, ? > resourceAttributes;

    private GetPriceRequest(Builder builder) {
        super(builder);
        this.requestPath = builder.requestPath;
        this.regionId = builder.regionId;
        this.resourceAttributes = builder.resourceAttributes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPriceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestPath
     */
    public String getRequestPath() {
        return this.requestPath;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceAttributes
     */
    public java.util.Map < String, ? > getResourceAttributes() {
        return this.resourceAttributes;
    }

    public static final class Builder extends Request.Builder<GetPriceRequest, Builder> {
        private String requestPath; 
        private String regionId; 
        private java.util.Map < String, ? > resourceAttributes; 

        private Builder() {
            super();
        } 

        private Builder(GetPriceRequest request) {
            super(request);
            this.requestPath = request.requestPath;
            this.regionId = request.regionId;
            this.resourceAttributes = request.resourceAttributes;
        } 

        /**
         * requestPath.
         */
        public Builder requestPath(String requestPath) {
            this.putPathParameter("requestPath", requestPath);
            this.requestPath = requestPath;
            return this;
        }

        /**
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * resourceAttributes.
         */
        public Builder resourceAttributes(java.util.Map < String, ? > resourceAttributes) {
            String resourceAttributesShrink = shrink(resourceAttributes, "resourceAttributes", "json");
            this.putQueryParameter("resourceAttributes", resourceAttributesShrink);
            this.resourceAttributes = resourceAttributes;
            return this;
        }

        @Override
        public GetPriceRequest build() {
            return new GetPriceRequest(this);
        } 

    } 

}
