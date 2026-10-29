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
    @com.aliyun.core.annotation.NameInMap("OfficeSiteId")
    private String officeSiteId;

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
        this.officeSiteId = builder.officeSiteId;
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
     * @return officeSiteId
     */
    public String getOfficeSiteId() {
        return this.officeSiteId;
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
        private String officeSiteId; 
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
            this.officeSiteId = request.officeSiteId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.productType = request.productType;
        } 

        /**
         * <p>The ID of the application used to filter delivery groups. Partial matching is supported. The delivery group must contain a deployed application that meets the condition. If this parameter is not specified or is set to an empty string, the results are not filtered by application ID. If this parameter is specified together with <code>AppName</code>, both conditions must be met by the same application.</p>
         * <p>This condition does not restrict the returned <code>Apps</code> list to the matched applications.</p>
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
         * <p>The ID of the delivery group used for filtering. Partial matching is supported. You can pass the complete ID or a continuous segment of it. If this parameter is not specified or is set to an empty string, the results are not filtered by ID. This parameter can be used together with other filter conditions, and the results must meet all conditions.</p>
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
         * <p>The name of the delivery group used for filtering. Partial matching is supported. For example, if you pass <code>Office applications</code>, delivery groups whose names contain this text are matched. If this parameter is not specified or is set to an empty string, the results are not filtered by name. If this parameter is specified together with the delivery group ID, both the ID and the name must be matched.</p>
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
         * <p>The name of the application used to filter delivery groups. Partial matching is supported. The delivery group must contain a deployed application whose name contains the specified text. If this parameter is not specified or is set to an empty string, the results are not filtered by application name. If this parameter is specified together with <code>AppId</code>, both conditions must be met by the same application.</p>
         * <p>This condition does not restrict the returned <code>Apps</code> list to the matched applications.</p>
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
         * <p>The username to be excluded based on existing authorizations. Exact match by full username is supported, such as <code>alice</code>. If this parameter is specified, delivery groups for which all applications have been directly authorized to the user are excluded. If this parameter is not specified or is set to an empty string, the results are not filtered by user authorization status.</p>
         * <p><strong>Authorizations for a single application or access permissions obtained through user groups are not fully evaluated by this condition.</strong> Do not equate the returned results with a list of delivery groups to which the user has no access at all.</p>
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
         * <p>The ID of the office network.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing+dir-172301****</p>
         */
        public Builder officeSiteId(String officeSiteId) {
            this.putQueryParameter("OfficeSiteId", officeSiteId);
            this.officeSiteId = officeSiteId;
            return this;
        }

        /**
         * <p>The page number. This parameter is required. Start the query from page <code>1</code> and use it in conjunction with <code>PageSize</code>. Keep other filter conditions unchanged when querying subsequent pages.</p>
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
         * <p>The maximum number of delivery groups to return per page. This parameter is required. Valid values: <code>1</code> to <code>100</code>. Explicitly specify this parameter and do not use the default values of other query operations.</p>
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
         * <p>The product type. This parameter is required. The value must be the same as the product type of the delivery groups to be queried. Only published delivery groups of this product type are returned. If an unrecognized value is passed, a parameter error is returned.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><code>CloudApp</code>: Wuying Cloud App.</li>
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
        public ListPublishedAppInstanceGroupRequest build() {
            return new ListPublishedAppInstanceGroupRequest(this);
        } 

    } 

}
