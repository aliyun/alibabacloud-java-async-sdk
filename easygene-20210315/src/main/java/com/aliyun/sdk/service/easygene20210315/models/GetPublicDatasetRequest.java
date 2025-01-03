// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.easygene20210315.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetPublicDatasetRequest} extends {@link RequestModel}
 *
 * <p>GetPublicDatasetRequest</p>
 */
public class GetPublicDatasetRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Attributes")
    private java.util.List < String > attributes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DatasetName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String datasetName;

    private GetPublicDatasetRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.attributes = builder.attributes;
        this.datasetName = builder.datasetName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPublicDatasetRequest create() {
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
     * @return attributes
     */
    public java.util.List < String > getAttributes() {
        return this.attributes;
    }

    /**
     * @return datasetName
     */
    public String getDatasetName() {
        return this.datasetName;
    }

    public static final class Builder extends Request.Builder<GetPublicDatasetRequest, Builder> {
        private String regionId; 
        private java.util.List < String > attributes; 
        private String datasetName; 

        private Builder() {
            super();
        } 

        private Builder(GetPublicDatasetRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.attributes = request.attributes;
            this.datasetName = request.datasetName;
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
         * Attributes.
         */
        public Builder attributes(java.util.List < String > attributes) {
            String attributesShrink = shrink(attributes, "Attributes", "json");
            this.putQueryParameter("Attributes", attributesShrink);
            this.attributes = attributes;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>西蒙斯基因组多样性计划</p>
         */
        public Builder datasetName(String datasetName) {
            this.putQueryParameter("DatasetName", datasetName);
            this.datasetName = datasetName;
            return this;
        }

        @Override
        public GetPublicDatasetRequest build() {
            return new GetPublicDatasetRequest(this);
        } 

    } 

}
