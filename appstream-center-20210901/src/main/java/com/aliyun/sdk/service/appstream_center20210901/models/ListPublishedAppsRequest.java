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
 * {@link ListPublishedAppsRequest} extends {@link RequestModel}
 *
 * <p>ListPublishedAppsRequest</p>
 */
public class ListPublishedAppsRequest extends Request {
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

    private ListPublishedAppsRequest(Builder builder) {
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

    public static ListPublishedAppsRequest create() {
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

    public static final class Builder extends Request.Builder<ListPublishedAppsRequest, Builder> {
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

        private Builder(ListPublishedAppsRequest request) {
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
         * <p>The ID of the application used for filtering. Substring matching is supported. You can pass the complete ID or a continuous segment of it. If this parameter is not specified or an empty string is passed, filtering is not performed based on the application ID. If this parameter and <code>AppName</code> are specified at the same time, both conditions must be met by the same application.</p>
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
         * <p>The ID of the delivery group used for filtering. Substring matching is supported. You can pass the complete ID or a continuous segment of it. If this parameter is not specified or an empty string is passed, filtering is not performed based on the delivery group ID. You can call the <a href="~~ListAppInstanceGroup~~">ListAppInstanceGroup</a> operation to obtain the delivery group ID. This parameter can be used together with other filter conditions, and all conditions must be met.</p>
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
         * <p>The name of the delivery group used for filtering. Substring matching is supported. For example, if you pass <code>Office applications</code>, delivery groups whose names contain this text are matched. If this parameter is not specified or an empty string is passed, filtering is not performed based on the delivery group name. If this parameter and the delivery group ID are specified at the same time, both conditions must be met.</p>
         * 
         * <strong>example:</strong>
         * <p>Office applications</p>
         */
        public Builder appInstanceGroupName(String appInstanceGroupName) {
            this.putQueryParameter("AppInstanceGroupName", appInstanceGroupName);
            this.appInstanceGroupName = appInstanceGroupName;
            return this;
        }

        /**
         * <p>The name of the application used for filtering. Substring matching is supported. For example, if you pass <code>Office applications</code>, applications whose names contain this text are matched. If this parameter is not specified or an empty string is passed, filtering is not performed based on the application name. If this parameter and <code>AppId</code> are specified at the same time, both conditions must be met by the same application.</p>
         * 
         * <strong>example:</strong>
         * <p>Office applications</p>
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * <p>The username to be excluded. Exact matching is performed based on the full username, such as <code>alice</code>. If this parameter is specified, applications that have been authorized for this user on a per-application basis through <a href="~~AuthorizeUsersForApp~~">AuthorizeUsersForApp</a> are not returned. This can be used to find applications that can still be authorized for the user. If this parameter is not specified or an empty string is passed, filtering is not performed based on user authorization.</p>
         * <p><strong>Access permissions obtained through overall delivery group authorization or user groups are not evaluated by this condition.</strong> Do not equate the returned results with a list of applications that the user has absolutely no access to.</p>
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
         * <p>The page number. This parameter is required. Start the query from page <code>1</code> and use it in conjunction with <code>PageSize</code>. Keep other filter conditions unchanged when querying subsequent pages. If the value is invalid, the error code <code>InvalidParameter.PageNumber</code> is returned.</p>
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
         * <p>The maximum number of application records to return per page. This parameter is required. Valid values: <code>1</code> to <code>100</code>. If the value is out of range, the error code <code>InvalidParameter.PageSize</code> is returned.</p>
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
         * <p>The product type. This parameter is required and is not case-sensitive. Only applications in published delivery groups of this product type are returned. If an unrecognized value is passed, the error code <code>InvalidParameter.ProductType</code> is returned. Filtering and statistics related to per-application authorization (<code>ExcludeUserId</code> and <code>AuthorizedUserCount</code>) are primarily used in WUYING Cloud App scenarios.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><code>CloudApp</code>: WUYING Cloud App.</li>
         * <li><code>CloudBrowser</code>: Cloud browser.</li>
         * <li><code>WuyingServer</code>: Enterprise Edition workstation.</li>
         * <li><code>WuyingWorkstation</code>: Personal Edition Linggou container workstation.</li>
         * <li><code>WuyingWorkstationTeam</code>: Team Edition Linggou container workstation.</li>
         * <li><code>WuyingWorkstationBusiness</code>: Dedicated Edition Linggou container workstation.</li>
         * <li><code>AndroidCloud</code>: Cloud phone.</li>
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
        public ListPublishedAppsRequest build() {
            return new ListPublishedAppsRequest(this);
        } 

    } 

}
