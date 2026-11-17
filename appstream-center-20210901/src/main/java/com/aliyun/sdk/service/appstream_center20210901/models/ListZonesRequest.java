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
 * {@link ListZonesRequest} extends {@link RequestModel}
 *
 * <p>ListZonesRequest</p>
 */
public class ListZonesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizRegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bizRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OsType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String osType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productType;

    private ListZonesRequest(Builder builder) {
        super(builder);
        this.bizRegionId = builder.bizRegionId;
        this.osType = builder.osType;
        this.productType = builder.productType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListZonesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizRegionId
     */
    public String getBizRegionId() {
        return this.bizRegionId;
    }

    /**
     * @return osType
     */
    public String getOsType() {
        return this.osType;
    }

    /**
     * @return productType
     */
    public String getProductType() {
        return this.productType;
    }

    public static final class Builder extends Request.Builder<ListZonesRequest, Builder> {
        private String bizRegionId; 
        private String osType; 
        private String productType; 

        private Builder() {
            super();
        } 

        private Builder(ListZonesRequest request) {
            super(request);
            this.bizRegionId = request.bizRegionId;
            this.osType = request.osType;
            this.productType = request.productType;
        } 

        /**
         * <p>The region ID. Required. Specifies the region for which you want to query available zones. All returned zones are located in this region.</p>
         * <p>The value must be a region ID supported by App Streaming. You can call <a href="~~ListRegions~~">ListRegions</a> to query the supported region IDs. If you specify an unsupported region, the error code InvalidParameter.ValueInvalid is returned.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder bizRegionId(String bizRegionId) {
            this.putQueryParameter("BizRegionId", bizRegionId);
            this.bizRegionId = bizRegionId;
            return this;
        }

        /**
         * <p>The operating system type. Required. Specifies the operating system used by the resource. This parameter and ProductType together determine the available zones. The value is case-insensitive. Use one of the following values:</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Windows: Windows operating system</li>
         * <li>Linux: Linux operating system</li>
         * <li>Android: Android operating system</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Windows</p>
         */
        public Builder osType(String osType) {
            this.putQueryParameter("OsType", osType);
            this.osType = osType;
            return this;
        }

        /**
         * <p>The product type. Required. Specifies the product for which you want to query available zones. The list of available zones is returned based on the available resources of the product in the specified region. The value is case-insensitive. Use one of the following values:</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>CloudApp: App Streaming</li>
         * <li>CloudBrowser: Cloud Browser</li>
         * <li>WuyingServer: Enterprise Edition workstation</li>
         * <li>WuyingWorkstation: Personal Edition Linggou container workstation</li>
         * <li>WuyingWorkstationTeam: Team Edition Linggou container workstation</li>
         * <li>WuyingWorkstationBusiness: Dedicated Edition Linggou container workstation</li>
         * <li>AndroidCloud: Cloud Phone</li>
         * <li>AIAgent: AgentBay (AI agent)</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CloudApp</p>
         */
        public Builder productType(String productType) {
            this.putQueryParameter("ProductType", productType);
            this.productType = productType;
            return this;
        }

        @Override
        public ListZonesRequest build() {
            return new ListZonesRequest(this);
        } 

    } 

}
