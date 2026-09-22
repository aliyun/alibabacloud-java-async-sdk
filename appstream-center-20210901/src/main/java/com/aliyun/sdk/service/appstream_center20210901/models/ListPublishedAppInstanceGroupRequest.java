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
 * {@link ListPublishedAppInstanceGroupRequest} extends {@link RequestModel}
 *
 * <p>ListPublishedAppInstanceGroupRequest</p>
 */
public class ListPublishedAppInstanceGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppInstanceGroupId")
    private String appInstanceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppInstanceGroupName")
    private String appInstanceGroupName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    private String appName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExcludeUserId")
    private String excludeUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 100, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productType;

    private ListPublishedAppInstanceGroupRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.appInstanceGroupId = builder.appInstanceGroupId;
        this.appInstanceGroupName = builder.appInstanceGroupName;
        this.appName = builder.appName;
        this.excludeUserId = builder.excludeUserId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.productType = builder.productType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPublishedAppInstanceGroupRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return appInstanceGroupId
     */
    public String getAppInstanceGroupId() {
        return this.appInstanceGroupId;
    }

    /**
     * @return appInstanceGroupName
     */
    public String getAppInstanceGroupName() {
        return this.appInstanceGroupName;
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return excludeUserId
     */
    public String getExcludeUserId() {
        return this.excludeUserId;
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

    public static final class Builder extends Request.Builder<ListPublishedAppInstanceGroupRequest, Builder> {
        private String appId; 
        private String appInstanceGroupId; 
        private String appInstanceGroupName; 
        private String appName; 
        private String excludeUserId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String productType; 

        private Builder() {
            super();
        } 

        private Builder(ListPublishedAppInstanceGroupRequest request) {
            super(request);
            this.appId = request.appId;
            this.appInstanceGroupId = request.appInstanceGroupId;
            this.appInstanceGroupName = request.appInstanceGroupName;
            this.appName = request.appName;
            this.excludeUserId = request.excludeUserId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.productType = request.productType;
        } 

        /**
         * <p>The application ID used for filtering delivery groups. Substring matching is supported. The delivery group must contain a deployed application that matches the condition. If this parameter is not specified or is set to an empty string, no filtering by application ID is applied. When specified together with <code>AppName</code>, the same application must satisfy both conditions.</p>
         * <p>This condition does not trim the returned <code>Apps</code> list.</p>
         * 
         * <strong>example:</strong>
         * <p>ca-i87mycyn419nu****</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The delivery group ID used for filtering. Substring matching is supported. You can pass in a full ID or a consecutive segment of the ID. If this parameter is not specified or is set to an empty string, no filtering by ID is applied. This parameter can be used together with other filter conditions. Results must satisfy all conditions simultaneously.</p>
         * 
         * <strong>example:</strong>
         * <p>aig-9ciijz60n4xsv****</p>
         */
        public Builder appInstanceGroupId(String appInstanceGroupId) {
            this.putQueryParameter("AppInstanceGroupId", appInstanceGroupId);
            this.appInstanceGroupId = appInstanceGroupId;
            return this;
        }

        /**
         * <p>The delivery group name used for filtering. Substring matching is supported. For example, if you pass in <code>OfficeApps</code>, delivery groups whose names contain this text are matched. If this parameter is not specified or is set to an empty string, no filtering by name is applied. When specified together with the delivery group ID, both the ID and name must match.</p>
         * 
         * <strong>example:</strong>
         * <p>OfficeApps</p>
         */
        public Builder appInstanceGroupName(String appInstanceGroupName) {
            this.putQueryParameter("AppInstanceGroupName", appInstanceGroupName);
            this.appInstanceGroupName = appInstanceGroupName;
            return this;
        }

        /**
         * <p>The application name used for filtering delivery groups. Substring matching is supported. The delivery group must contain a deployed application whose name includes the specified text. If this parameter is not specified or is set to an empty string, no filtering by application name is applied. When specified together with <code>AppId</code>, the same application must satisfy both conditions.</p>
         * <p>This condition does not trim the returned <code>Apps</code> list.</p>
         * 
         * <strong>example:</strong>
         * <p>OfficeApps</p>
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * <p>The username to exclude based on existing authorization. Exact username matching is used, for example, <code>alice</code>. When specified, delivery groups in which all applications have been directly authorized to this user are excluded. If this parameter is not specified or is set to an empty string, no exclusion based on user authorization is applied.</p>
         * <p><strong>Authorization granted for individual applications only, or access permissions obtained through user groups, is not fully evaluated by this condition.</strong> Do not treat the returned results as a complete list of delivery groups that the user has no access permissions to.</p>
         * 
         * <strong>example:</strong>
         * <p>alice</p>
         */
        public Builder excludeUserId(String excludeUserId) {
            this.putQueryParameter("ExcludeUserId", excludeUserId);
            this.excludeUserId = excludeUserId;
            return this;
        }

        /**
         * <p>The page number. This parameter is required. Start from page <code>1</code> and use this parameter together with <code>PageSize</code>. Keep other filter conditions unchanged when querying subsequent pages.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The maximum number of delivery groups to return per page. This parameter is required. Valid values: <code>1</code> to <code>100</code>. Unit: delivery groups. Specify this value explicitly and do not rely on default values from other query operations.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The product type. This parameter is required. The value must match the product type of the delivery groups you want to query. Only published delivery groups of the specified product type are returned. A parameter error is returned if an unrecognized value is passed in.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><code>CloudApp</code>: WUYING Cloud Application.</li>
         * <li><code>CloudBrowser</code>: Cloud Browser.</li>
         * <li><code>WuyingServer</code>: Enterprise Workstation.</li>
         * <li><code>WuyingWorkstation</code>: Personal Edition Lingjou Container Workstation.</li>
         * <li><code>WuyingWorkstationTeam</code>: Team Edition Lingjou Container Workstation.</li>
         * <li><code>WuyingWorkstationBusiness</code>: Dedicated Edition Lingjou Container Workstation.</li>
         * <li><code>AndroidCloud</code>: Cloud Phone.</li>
         * <li><code>AIAgent</code>: AgentBay (AI agent).</li>
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
        public ListPublishedAppInstanceGroupRequest build() {
            return new ListPublishedAppInstanceGroupRequest(this);
        } 

    } 

}
