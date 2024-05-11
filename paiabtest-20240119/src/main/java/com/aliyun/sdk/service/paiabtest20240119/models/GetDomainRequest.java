// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiabtest20240119.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDomainRequest} extends {@link RequestModel}
 *
 * <p>GetDomainRequest</p>
 */
public class GetDomainRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("DomainId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainId;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    private String projectId;

    private GetDomainRequest(Builder builder) {
        super(builder);
        this.domainId = builder.domainId;
        this.regionId = builder.regionId;
        this.projectId = builder.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDomainRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainId
     */
    public String getDomainId() {
        return this.domainId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    public static final class Builder extends Request.Builder<GetDomainRequest, Builder> {
        private String domainId; 
        private String regionId; 
        private String projectId; 

        private Builder() {
            super();
        } 

        private Builder(GetDomainRequest request) {
            super(request);
            this.domainId = request.domainId;
            this.regionId = request.regionId;
            this.projectId = request.projectId;
        } 

        /**
         * DomainId.
         */
        public Builder domainId(String domainId) {
            this.putPathParameter("DomainId", domainId);
            this.domainId = domainId;
            return this;
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
         * ProjectId.
         */
        public Builder projectId(String projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        @Override
        public GetDomainRequest build() {
            return new GetDomainRequest(this);
        } 

    } 

}
