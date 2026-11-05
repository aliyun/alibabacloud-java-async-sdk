// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link ListRegionIdRequest} extends {@link RequestModel}
 *
 * <p>ListRegionIdRequest</p>
 */
public class ListRegionIdRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProductType")
    private String productType;

    private ListRegionIdRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.productType = builder.productType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRegionIdRequest create() {
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
     * @return productType
     */
    public String getProductType() {
        return this.productType;
    }

    public static final class Builder extends Request.Builder<ListRegionIdRequest, Builder> {
        private String regionId; 
        private String productType; 

        private Builder() {
            super();
        } 

        private Builder(ListRegionIdRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.productType = request.productType;
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
         * <p>The product type for querying available image regions. If this parameter is omitted, the query defaults to CloudApp. Valid values:</p>
         * <ul>
         * <li><strong>CloudGame</strong>: cloud gaming</li>
         * <li><strong>CloudApp</strong>: WUYING Cloud Application</li>
         * <li><strong>CloudBrowser</strong>: secure browser</li>
         * <li><strong>CloudDesktop</strong>: WUYING Cloud Desktop</li>
         * <li><strong>ImageBuilder</strong>: image creation resources</li>
         * <li><strong>ImageValidate</strong>: image validation resources</li>
         * <li><strong>AndroidCloud</strong>: Android cloud</li>
         * <li><strong>GpuRender</strong>: GPU rendering</li>
         * <li><strong>AndroidGpuRender</strong>: Android cloud GPU rendering</li>
         * <li><strong>WuyingServer</strong>: enterprise edition workstation</li>
         * <li><strong>GpuProxy</strong>: GPU remote rendering proxy</li>
         * <li><strong>GpuCache</strong>: GPU remote rendering cache</li>
         * <li><strong>AIAgent</strong>: AI agent service</li>
         * <li><strong>HostedDesktop</strong>: hosted desktop</li>
         * <li><strong>WuyingWorkstation</strong>: personal edition container workstation</li>
         * <li><strong>WuyingWorkstationBusiness</strong>: business edition container workstation</li>
         * <li><strong>WuyingWorkstationTeam</strong>: Linggou container workstation team edition</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CloudApp</p>
         */
        public Builder productType(String productType) {
            this.putBodyParameter("ProductType", productType);
            this.productType = productType;
            return this;
        }

        @Override
        public ListRegionIdRequest build() {
            return new ListRegionIdRequest(this);
        } 

    } 

}
