// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetDIJobRequest} extends {@link RequestModel}
 *
 * <p>GetDIJobRequest</p>
 */
public class GetDIJobRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DIJobId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DIJobId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WithDetails")
    private Boolean withDetails;

    private GetDIJobRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.DIJobId = builder.DIJobId;
        this.withDetails = builder.withDetails;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDIJobRequest create() {
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
     * @return DIJobId
     */
    public String getDIJobId() {
        return this.DIJobId;
    }

    /**
     * @return withDetails
     */
    public Boolean getWithDetails() {
        return this.withDetails;
    }

    public static final class Builder extends Request.Builder<GetDIJobRequest, Builder> {
        private String regionId; 
        private String DIJobId; 
        private Boolean withDetails; 

        private Builder() {
            super();
        } 

        private Builder(GetDIJobRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.DIJobId = request.DIJobId;
            this.withDetails = request.withDetails;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>11588</p>
         */
        public Builder DIJobId(String DIJobId) {
            this.putQueryParameter("DIJobId", DIJobId);
            this.DIJobId = DIJobId;
            return this;
        }

        /**
         * WithDetails.
         */
        public Builder withDetails(Boolean withDetails) {
            this.putQueryParameter("WithDetails", withDetails);
            this.withDetails = withDetails;
            return this;
        }

        @Override
        public GetDIJobRequest build() {
            return new GetDIJobRequest(this);
        } 

    } 

}
