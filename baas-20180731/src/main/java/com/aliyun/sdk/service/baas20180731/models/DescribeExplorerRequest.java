// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeExplorerRequest} extends {@link RequestModel}
 *
 * <p>DescribeExplorerRequest</p>
 */
public class DescribeExplorerRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExBody")
    private String exBody;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExMethod")
    @com.aliyun.core.annotation.Validation(required = true)
    private String exMethod;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExUrl")
    private String exUrl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OrganizationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String organizationId;

    private DescribeExplorerRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.exBody = builder.exBody;
        this.exMethod = builder.exMethod;
        this.exUrl = builder.exUrl;
        this.organizationId = builder.organizationId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeExplorerRequest create() {
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
     * @return exBody
     */
    public String getExBody() {
        return this.exBody;
    }

    /**
     * @return exMethod
     */
    public String getExMethod() {
        return this.exMethod;
    }

    /**
     * @return exUrl
     */
    public String getExUrl() {
        return this.exUrl;
    }

    /**
     * @return organizationId
     */
    public String getOrganizationId() {
        return this.organizationId;
    }

    public static final class Builder extends Request.Builder<DescribeExplorerRequest, Builder> {
        private String regionId; 
        private String exBody; 
        private String exMethod; 
        private String exUrl; 
        private String organizationId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeExplorerRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.exBody = request.exBody;
            this.exMethod = request.exMethod;
            this.exUrl = request.exUrl;
            this.organizationId = request.organizationId;
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
         * ExBody.
         */
        public Builder exBody(String exBody) {
            this.putQueryParameter("ExBody", exBody);
            this.exBody = exBody;
            return this;
        }

        /**
         * ExMethod.
         */
        public Builder exMethod(String exMethod) {
            this.putQueryParameter("ExMethod", exMethod);
            this.exMethod = exMethod;
            return this;
        }

        /**
         * ExUrl.
         */
        public Builder exUrl(String exUrl) {
            this.putQueryParameter("ExUrl", exUrl);
            this.exUrl = exUrl;
            return this;
        }

        /**
         * OrganizationId.
         */
        public Builder organizationId(String organizationId) {
            this.putBodyParameter("OrganizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        @Override
        public DescribeExplorerRequest build() {
            return new DescribeExplorerRequest(this);
        } 

    } 

}
