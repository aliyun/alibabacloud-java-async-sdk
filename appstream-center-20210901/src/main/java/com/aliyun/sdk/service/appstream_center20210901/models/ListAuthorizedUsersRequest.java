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
 * {@link ListAuthorizedUsersRequest} extends {@link RequestModel}
 *
 * <p>ListAuthorizedUsersRequest</p>
 */
public class ListAuthorizedUsersRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppInstanceGroupId")
    private String appInstanceGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppInstanceGroupSetId")
    private String appInstanceGroupSetId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppInstancePersistentId")
    private String appInstancePersistentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndUserId")
    private String endUserId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageNumber;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 100)
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProductType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserIdFuzzy")
    private String userIdFuzzy;

    private ListAuthorizedUsersRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.appInstanceGroupId = builder.appInstanceGroupId;
        this.appInstanceGroupSetId = builder.appInstanceGroupSetId;
        this.appInstancePersistentId = builder.appInstancePersistentId;
        this.endUserId = builder.endUserId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.productType = builder.productType;
        this.userIdFuzzy = builder.userIdFuzzy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAuthorizedUsersRequest create() {
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
     * @return appInstanceGroupSetId
     */
    public String getAppInstanceGroupSetId() {
        return this.appInstanceGroupSetId;
    }

    /**
     * @return appInstancePersistentId
     */
    public String getAppInstancePersistentId() {
        return this.appInstancePersistentId;
    }

    /**
     * @return endUserId
     */
    public String getEndUserId() {
        return this.endUserId;
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
     * @return userIdFuzzy
     */
    public String getUserIdFuzzy() {
        return this.userIdFuzzy;
    }

    public static final class Builder extends Request.Builder<ListAuthorizedUsersRequest, Builder> {
        private String appId; 
        private String appInstanceGroupId; 
        private String appInstanceGroupSetId; 
        private String appInstancePersistentId; 
        private String endUserId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String productType; 
        private String userIdFuzzy; 

        private Builder() {
            super();
        } 

        private Builder(ListAuthorizedUsersRequest request) {
            super(request);
            this.appId = request.appId;
            this.appInstanceGroupId = request.appInstanceGroupId;
            this.appInstanceGroupSetId = request.appInstanceGroupSetId;
            this.appInstancePersistentId = request.appInstancePersistentId;
            this.endUserId = request.endUserId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.productType = request.productType;
            this.userIdFuzzy = request.userIdFuzzy;
        } 

        /**
         * <p>The application ID. This parameter is used to filter users who are <strong>specifically authorized for this application</strong> (authorized through the <a href="~~AuthorizeUsersForApp~~">AuthorizeUsersForApp</a> operation). This parameter applies to app instance groups whose authorization mode is <code>App</code>. You can obtain the application ID from the Apps list returned by the <a href="~~GetAppInstanceGroup~~">GetAppInstanceGroup</a> operation.</p>
         * <p>If this parameter is not specified, all authorized users under the app instance group are returned. This parameter is not supported when querying by app instance group set.</p>
         * 
         * <strong>example:</strong>
         * <p>ca-i87mycyn419nu****</p>
         */
        public Builder appId(String appId) {
            this.putBodyParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The app instance group ID. You can call the <a href="~~ListAppInstanceGroup~~">ListAppInstanceGroup</a> operation to obtain the ID. For cloud browser groups, specify the browser group ID returned by the <a href="~~ListBrowserInstanceGroup~~">ListBrowserInstanceGroup</a> operation.</p>
         * <p><strong>You must specify either this parameter or AppInstanceGroupSetId, but not both.</strong></p>
         * 
         * <strong>example:</strong>
         * <p>aig-9ciijz60n4xsv****</p>
         */
        public Builder appInstanceGroupId(String appInstanceGroupId) {
            this.putBodyParameter("AppInstanceGroupId", appInstanceGroupId);
            this.appInstanceGroupId = appInstanceGroupId;
            return this;
        }

        /**
         * <p>The app instance group set ID.</p>
         * <p><strong>You must specify either this parameter or AppInstanceGroupId, but not both.</strong> When querying by set, do not specify AppId or AppInstancePersistentId. Otherwise, a parameter error is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>set-3jm9d0abc00example</p>
         */
        public Builder appInstanceGroupSetId(String appInstanceGroupSetId) {
            this.putBodyParameter("AppInstanceGroupSetId", appInstanceGroupSetId);
            this.appInstanceGroupSetId = appInstanceGroupSetId;
            return this;
        }

        /**
         * <p>The persistent session ID. This parameter is used to filter users who are granted this persistent session. This parameter applies to app instance groups whose authorization mode is <code>Session</code>. You can call the <a href="~~ListPersistentAppInstances~~">ListPersistentAppInstances</a> operation to obtain the ID.</p>
         * <p>If this parameter is specified, only the users granted this session are returned. However, the AppInstancePersistentIds response parameter still lists all persistent sessions granted to the user. This parameter is not supported when querying by app instance group set.</p>
         * 
         * <strong>example:</strong>
         * <p>p-0cc7s3mw2fg4j****</p>
         */
        public Builder appInstancePersistentId(String appInstancePersistentId) {
            this.putBodyParameter("AppInstancePersistentId", appInstancePersistentId);
            this.appInstancePersistentId = appInstancePersistentId;
            return this;
        }

        /**
         * <p>The username. Performs <strong>exact match</strong> by username. If this parameter is not specified, filtering by full username is not applied. This parameter can be specified together with UserIdFuzzy, and both conditions must be met.</p>
         * 
         * <strong>example:</strong>
         * <p>alice</p>
         */
        public Builder endUserId(String endUserId) {
            this.putQueryParameter("EndUserId", endUserId);
            this.endUserId = endUserId;
            return this;
        }

        /**
         * <p>The page number. Pages start from 1.</p>
         * <p>This parameter is required.</p>
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
         * <p>The number of records returned per page. Valid values: 1 to 100.</p>
         * <p>When the authorization mode is <code>App</code> or <code>AppInstanceGroup</code>, pagination is based on authorization records. Multiple authorization records for the same user are merged into one user in the response. Therefore, the actual number of users returned on the current page may be less than this value.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The product type. The value must be consistent with the product type of the queried app instance group or app instance group set. If they are inconsistent, a resource not found error code is returned.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>CloudApp: Wuying Cloud App</li>
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
            this.putBodyParameter("ProductType", productType);
            this.productType = productType;
            return this;
        }

        /**
         * <p>The username keyword. Performs <strong>fuzzy match</strong> by username. A hit occurs if the username contains this keyword. For example, if you specify <code>ali</code>, both <code>alice</code> and <code>ali.wang</code> are matched. If this parameter is not specified, filtering by keyword is not applied.</p>
         * 
         * <strong>example:</strong>
         * <p>ali</p>
         */
        public Builder userIdFuzzy(String userIdFuzzy) {
            this.putQueryParameter("UserIdFuzzy", userIdFuzzy);
            this.userIdFuzzy = userIdFuzzy;
            return this;
        }

        @Override
        public ListAuthorizedUsersRequest build() {
            return new ListAuthorizedUsersRequest(this);
        } 

    } 

}
