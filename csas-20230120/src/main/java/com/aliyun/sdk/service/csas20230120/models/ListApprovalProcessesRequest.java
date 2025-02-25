// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link ListApprovalProcessesRequest} extends {@link RequestModel}
 *
 * <p>ListApprovalProcessesRequest</p>
 */
public class ListApprovalProcessesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyId")
    private String policyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyType")
    private String policyType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProcessIds")
    private java.util.List<String> processIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProcessName")
    private String processName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SaseUserId")
    private String saseUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Username")
    private String username;

    private ListApprovalProcessesRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.pageSize = builder.pageSize;
        this.policyId = builder.policyId;
        this.policyType = builder.policyType;
        this.processIds = builder.processIds;
        this.processName = builder.processName;
        this.saseUserId = builder.saseUserId;
        this.username = builder.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListApprovalProcessesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public Long getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return policyId
     */
    public String getPolicyId() {
        return this.policyId;
    }

    /**
     * @return policyType
     */
    public String getPolicyType() {
        return this.policyType;
    }

    /**
     * @return processIds
     */
    public java.util.List<String> getProcessIds() {
        return this.processIds;
    }

    /**
     * @return processName
     */
    public String getProcessName() {
        return this.processName;
    }

    /**
     * @return saseUserId
     */
    public String getSaseUserId() {
        return this.saseUserId;
    }

    /**
     * @return username
     */
    public String getUsername() {
        return this.username;
    }

    public static final class Builder extends Request.Builder<ListApprovalProcessesRequest, Builder> {
        private Long currentPage; 
        private Long pageSize; 
        private String policyId; 
        private String policyType; 
        private java.util.List<String> processIds; 
        private String processName; 
        private String saseUserId; 
        private String username; 

        private Builder() {
            super();
        } 

        private Builder(ListApprovalProcessesRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.pageSize = request.pageSize;
            this.policyId = request.policyId;
            this.policyType = request.policyType;
            this.processIds = request.processIds;
            this.processName = request.processName;
            this.saseUserId = request.saseUserId;
            this.username = request.username;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Long currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * PolicyId.
         */
        public Builder policyId(String policyId) {
            this.putQueryParameter("PolicyId", policyId);
            this.policyId = policyId;
            return this;
        }

        /**
         * PolicyType.
         */
        public Builder policyType(String policyType) {
            this.putQueryParameter("PolicyType", policyType);
            this.policyType = policyType;
            return this;
        }

        /**
         * ProcessIds.
         */
        public Builder processIds(java.util.List<String> processIds) {
            this.putQueryParameter("ProcessIds", processIds);
            this.processIds = processIds;
            return this;
        }

        /**
         * ProcessName.
         */
        public Builder processName(String processName) {
            this.putQueryParameter("ProcessName", processName);
            this.processName = processName;
            return this;
        }

        /**
         * SaseUserId.
         */
        public Builder saseUserId(String saseUserId) {
            this.putQueryParameter("SaseUserId", saseUserId);
            this.saseUserId = saseUserId;
            return this;
        }

        /**
         * Username.
         */
        public Builder username(String username) {
            this.putQueryParameter("Username", username);
            this.username = username;
            return this;
        }

        @Override
        public ListApprovalProcessesRequest build() {
            return new ListApprovalProcessesRequest(this);
        } 

    } 

}
