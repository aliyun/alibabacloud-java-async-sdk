// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csasedr20241122.models;

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
 * {@link ListClientRuleStrategyRequest} extends {@link RequestModel}
 *
 * <p>ListClientRuleStrategyRequest</p>
 */
public class ListClientRuleStrategyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyType")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer policyType;

    private ListClientRuleStrategyRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.name = builder.name;
        this.pageSize = builder.pageSize;
        this.policyType = builder.policyType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListClientRuleStrategyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return policyType
     */
    public Integer getPolicyType() {
        return this.policyType;
    }

    public static final class Builder extends Request.Builder<ListClientRuleStrategyRequest, Builder> {
        private Integer currentPage; 
        private String name; 
        private Integer pageSize; 
        private Integer policyType; 

        private Builder() {
            super();
        } 

        private Builder(ListClientRuleStrategyRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.name = request.name;
            this.pageSize = request.pageSize;
            this.policyType = request.policyType;
        } 

        /**
         * <p>The current page number for the paged query with paging. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The policy name for substring matching. If this parameter is not specified, policies are not filtered by name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The number of entries per page for the paged query with paging. Default value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The policy type. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Software hardening.</li>
         * <li><strong>1</strong>: Firewall.</li>
         * <li><strong>2</strong>: Proactive defense.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder policyType(Integer policyType) {
            this.putQueryParameter("PolicyType", policyType);
            this.policyType = policyType;
            return this;
        }

        @Override
        public ListClientRuleStrategyRequest build() {
            return new ListClientRuleStrategyRequest(this);
        } 

    } 

}
