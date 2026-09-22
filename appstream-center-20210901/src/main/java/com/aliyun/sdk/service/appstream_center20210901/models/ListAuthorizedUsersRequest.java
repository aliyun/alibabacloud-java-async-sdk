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
         * <p>The application ID. Specifies the application to filter users who are <strong>authorized for that specific application</strong> (authorized through the <a href="~~AuthorizeUsersForApp~~">AuthorizeUsersForApp</a> operation). This parameter applies to delivery groups with the <code>App</code> authorization mode. Obtain the application ID from the Apps list returned by the <a href="~~GetAppInstanceGroup~~">GetAppInstanceGroup</a> operation.</p>
         * <p>If not specified, all authorized users under the delivery group are returned. This parameter is not supported when querying by delivery group set.</p>
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
         * <p>The delivery group ID. Call the <a href="~~ListAppInstanceGroup~~">ListAppInstanceGroup</a> operation to obtain this value. For cloud browser groups, specify the browser group ID returned by the <a href="~~ListBrowserInstanceGroup~~">ListBrowserInstanceGroup</a> operation.</p>
         * <p><strong>Exactly one of this parameter and AppInstanceGroupSetId must be specified.</strong></p>
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
         * <p>The delivery group set ID.</p>
         * <p><strong>Exactly one of this parameter and AppInstanceGroupId must be specified.</strong> When querying by set, do not specify AppId or AppInstancePersistentId. Otherwise, a parameter error is returned.</p>
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
         * <p>The persistent session ID. Specifies the persistent session to filter users who are granted that session. This parameter applies to delivery groups with the <code>Session</code> authorization mode. Call the <a href="~~ListPersistentAppInstances~~">ListPersistentAppInstances</a> operation to obtain this value.</p>
         * <p>If specified, only users granted that session are returned. However, the response parameter AppInstancePersistentIds still lists all persistent sessions granted to each user. This parameter is not supported when querying by delivery group set.</p>
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
         * <p>The username for <strong>exact matching</strong>. If not specified, no filtering by exact username is applied. Can be specified together with UserIdFuzzy, in which case both conditions must be met.</p>
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
         * <p>The page number, starting from 1.</p>
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
         * <p>The number of records per page. Valid values: 1 to 100.</p>
         * <p>When the authorization mode is <code>App</code> or <code>AppInstanceGroup</code>, pagination is based on authorization records. Multiple authorization records for the same user are merged into a single user entry. Therefore, the actual number of users returned on the current page may be less than this value.</p>
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
         * <p>The product type. The value must match the product type of the queried delivery group or delivery group set. If the value does not match, a resource-not-found error code is returned.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>CloudApp: Wuying Cloud Application.</li>
         * <li>CloudBrowser: Cloud Browser.</li>
         * <li>WuyingServer: Enterprise Edition Workstation.</li>
         * <li>WuyingWorkstation: Personal Edition Linggou Container Workstation.</li>
         * <li>WuyingWorkstationTeam: Linggou Team Edition Container Workstation.</li>
         * <li>WuyingWorkstationBusiness: Linggou Dedicated Edition Container Workstation.</li>
         * <li>AndroidCloud: Cloud Phone.</li>
         * <li>AIAgent: AgentBay (AI agent).</li>
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
         * <p>The username keyword for <strong>fuzzy matching</strong>. A match occurs if the username contains this keyword. For example, if you specify <code>ali</code>, both <code>alice</code> and <code>ali.wang</code> are returned. If not specified, no keyword-based filtering is applied.</p>
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
