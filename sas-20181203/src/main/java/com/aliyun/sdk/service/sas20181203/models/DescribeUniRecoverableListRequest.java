// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DescribeUniRecoverableListRequest} extends {@link RequestModel}
 *
 * <p>DescribeUniRecoverableListRequest</p>
 */
public class DescribeUniRecoverableListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Database")
    private String database;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long policyId;

    private DescribeUniRecoverableListRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.database = builder.database;
        this.pageSize = builder.pageSize;
        this.policyId = builder.policyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUniRecoverableListRequest create() {
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
     * @return database
     */
    public String getDatabase() {
        return this.database;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return policyId
     */
    public Long getPolicyId() {
        return this.policyId;
    }

    public static final class Builder extends Request.Builder<DescribeUniRecoverableListRequest, Builder> {
        private Integer currentPage; 
        private String database; 
        private Integer pageSize; 
        private Long policyId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeUniRecoverableListRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.database = request.database;
            this.pageSize = request.pageSize;
            this.policyId = request.policyId;
        } 

        /**
         * <p>The number of the page to return. Default value: <strong>1</strong>.</p>
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
         * <p>The name of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>msdb</p>
         */
        public Builder database(String database) {
            this.putQueryParameter("Database", database);
            this.database = database;
            return this;
        }

        /**
         * <p>The number of entries to return on each page. Default value: 20. If you leave this parameter empty, 20 entries are returned on each page.</p>
         * <blockquote>
         * <p>We recommend that you do not leave this parameter empty.</p>
         * </blockquote>
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
         * <p>The ID of the anti-ransomware policy.</p>
         * <blockquote>
         * <p>You can call the <a href="~~DescribeUniBackupPolicies~~">DescribeUniBackupPolicies</a> operation to query the IDs of anti-ransomware policies.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder policyId(Long policyId) {
            this.putQueryParameter("PolicyId", policyId);
            this.policyId = policyId;
            return this;
        }

        @Override
        public DescribeUniRecoverableListRequest build() {
            return new DescribeUniRecoverableListRequest(this);
        } 

    } 

}
