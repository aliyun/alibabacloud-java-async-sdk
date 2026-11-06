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
 * {@link ListAppRequest} extends {@link RequestModel}
 *
 * <p>ListAppRequest</p>
 */
public class ListAppRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppName")
    private String appName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppType")
    private String appType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BizType")
    private Integer bizType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BizTypeList")
    private java.util.List<Integer> bizTypeList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OriginAppType")
    private String originAppType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OsType")
    private String osType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProductType")
    private String productType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProductTypeList")
    private java.util.List<String> productTypeList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SubAppType")
    private String subAppType;

    private ListAppRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.appId = builder.appId;
        this.appName = builder.appName;
        this.appType = builder.appType;
        this.bizType = builder.bizType;
        this.bizTypeList = builder.bizTypeList;
        this.originAppType = builder.originAppType;
        this.osType = builder.osType;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.productType = builder.productType;
        this.productTypeList = builder.productTypeList;
        this.subAppType = builder.subAppType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAppRequest create() {
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
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return appType
     */
    public String getAppType() {
        return this.appType;
    }

    /**
     * @return bizType
     */
    public Integer getBizType() {
        return this.bizType;
    }

    /**
     * @return bizTypeList
     */
    public java.util.List<Integer> getBizTypeList() {
        return this.bizTypeList;
    }

    /**
     * @return originAppType
     */
    public String getOriginAppType() {
        return this.originAppType;
    }

    /**
     * @return osType
     */
    public String getOsType() {
        return this.osType;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return productType
     */
    public String getProductType() {
        return this.productType;
    }

    /**
     * @return productTypeList
     */
    public java.util.List<String> getProductTypeList() {
        return this.productTypeList;
    }

    /**
     * @return subAppType
     */
    public String getSubAppType() {
        return this.subAppType;
    }

    public static final class Builder extends Request.Builder<ListAppRequest, Builder> {
        private String regionId; 
        private String appId; 
        private String appName; 
        private String appType; 
        private Integer bizType; 
        private java.util.List<Integer> bizTypeList; 
        private String originAppType; 
        private String osType; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String productType; 
        private java.util.List<String> productTypeList; 
        private String subAppType; 

        private Builder() {
            super();
        } 

        private Builder(ListAppRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.appId = request.appId;
            this.appName = request.appName;
            this.appType = request.appType;
            this.bizType = request.bizType;
            this.bizTypeList = request.bizTypeList;
            this.originAppType = request.originAppType;
            this.osType = request.osType;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.productType = request.productType;
            this.productTypeList = request.productTypeList;
            this.subAppType = request.subAppType;
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
         * <p>The application ID for exact query. If this parameter is omitted, applications are not filtered by application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>app-bp1example****</p>
         */
        public Builder appId(String appId) {
            this.putBodyParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The application name filter. Contains matching is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>Business management</p>
         */
        public Builder appName(String appName) {
            this.putBodyParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * <p>The source type of the application. Valid values:</p>
         * <ul>
         * <li><strong>USER_APP</strong>: User-created applications.</li>
         * <li><strong>SYS_APP</strong>: System-provided applications.</li>
         * <li><strong>VIRTUAL_APP</strong>: Virtual applications.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>USER_APP</p>
         */
        public Builder appType(String appType) {
            this.putBodyParameter("AppType", appType);
            this.appType = appType;
            return this;
        }

        /**
         * <p>Filters by a single business type. If specified together with BizTypeList, the intersection is used. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: Basic products.</li>
         * <li><strong>2</strong>: Personal cloud.</li>
         * <li><strong>3</strong>: Cloud office.</li>
         * <li><strong>4</strong>: Cloud Flow.</li>
         * <li><strong>10</strong>: Personal Edition.</li>
         * <li><strong>20</strong>: Business Edition.</li>
         * <li><strong>60</strong>: Linggou Team Edition.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder bizType(Integer bizType) {
            this.putBodyParameter("BizType", bizType);
            this.bizType = bizType;
            return this;
        }

        /**
         * <p>The list of business types for filtering. A match with any business type in the list is considered a match. If specified together with BizType, the single-value condition must still be met.</p>
         */
        public Builder bizTypeList(java.util.List<Integer> bizTypeList) {
            String bizTypeListShrink = shrink(bizTypeList, "BizTypeList", "json");
            this.putBodyParameter("BizTypeList", bizTypeListShrink);
            this.bizTypeList = bizTypeList;
            return this;
        }

        /**
         * <p>The form of the application. Valid values:</p>
         * <ul>
         * <li><strong>CLIENT_BASE</strong>: Client applications.</li>
         * <li><strong>WEB_BASE</strong>: Browser applications.</li>
         * <li><strong>CLOUD_NATIVE_BASE</strong>: Cloud-native applications.</li>
         * <li><strong>PORT_SERVICE_BASE</strong>: Port service applications.</li>
         * <li><strong>AGENT_SERVICE_BASE</strong>: Agent applications.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>WEB_BASE</p>
         */
        public Builder originAppType(String originAppType) {
            this.putBodyParameter("OriginAppType", originAppType);
            this.originAppType = originAppType;
            return this;
        }

        /**
         * <p>The type of operating system used by the application. Valid values:</p>
         * <ul>
         * <li><strong>Unknown</strong>: The operating system is unknown.</li>
         * <li><strong>Windows</strong>: Windows operating system.</li>
         * <li><strong>Linux</strong>: Linux operating system.</li>
         * <li><strong>Android</strong>: Android operating system.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Windows</p>
         */
        public Builder osType(String osType) {
            this.putBodyParameter("OsType", osType);
            this.osType = osType;
            return this;
        }

        /**
         * <p>The page number for the query. Start from 1. If this parameter is omitted, set to 0, or set to 1, the first page is queried.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of records to return on each page. If this parameter is omitted or set to a value less than 1, the value 10 is used.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Filters by a single associated product. If specified together with ProductTypeList, the intersection is used. Valid values:</p>
         * <ul>
         * <li><strong>CloudGame</strong>: Cloud game.</li>
         * <li><strong>CloudApp</strong>: Wuying cloud application.</li>
         * <li><strong>CloudBrowser</strong>: Secure browser.</li>
         * <li><strong>CloudDesktop</strong>: Wuying cloud desktop.</li>
         * <li><strong>ImageBuilder</strong>: Image builder resources.</li>
         * <li><strong>ImageValidate</strong>: Image validation resources.</li>
         * <li><strong>AndroidCloud</strong>: Android cloud.</li>
         * <li><strong>GpuRender</strong>: GPU rendering.</li>
         * <li><strong>AndroidGpuRender</strong>: Android cloud GPU rendering.</li>
         * <li><strong>WuyingServer</strong>: Enterprise Edition workstation.</li>
         * <li><strong>GpuProxy</strong>: GPU remote rendering proxy.</li>
         * <li><strong>GpuCache</strong>: GPU remote rendering cache.</li>
         * <li><strong>AIAgent</strong>: AI Agent service.</li>
         * <li><strong>HostedDesktop</strong>: Hosted desktop.</li>
         * <li><strong>WuyingWorkstation</strong>: Personal Edition container workstation.</li>
         * <li><strong>WuyingWorkstationBusiness</strong>: Business Edition container workstation.</li>
         * <li><strong>WuyingWorkstationTeam</strong>: Linggou Team Edition container workstation.</li>
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

        /**
         * <p>The list of associated products for filtering. A match with any product in the list is considered a match. If specified together with ProductType, the single-value condition must still be met.</p>
         */
        public Builder productTypeList(java.util.List<String> productTypeList) {
            String productTypeListShrink = shrink(productTypeList, "ProductTypeList", "json");
            this.putBodyParameter("ProductTypeList", productTypeListShrink);
            this.productTypeList = productTypeList;
            return this;
        }

        /**
         * <p>The subtype of the application. Valid values:</p>
         * <ul>
         * <li><strong>PWA</strong>: Progressive web applications.</li>
         * <li><strong>SAAS</strong>: Software as a Service (SaaS) applications.</li>
         * <li><strong>SANDBOX</strong>: Sandbox applications.</li>
         * <li><strong>CONTAINER</strong>: Container applications.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SAAS</p>
         */
        public Builder subAppType(String subAppType) {
            this.putBodyParameter("SubAppType", subAppType);
            this.subAppType = subAppType;
            return this;
        }

        @Override
        public ListAppRequest build() {
            return new ListAppRequest(this);
        } 

    } 

}
