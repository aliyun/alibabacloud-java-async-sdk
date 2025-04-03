// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

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
 * {@link ListRemediationTemplatesRequest} extends {@link RequestModel}
 *
 * <p>ListRemediationTemplatesRequest</p>
 */
public class ListRemediationTemplatesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ManagedRuleIdentifier")
    private String managedRuleIdentifier;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RemediationType")
    private String remediationType;

    private ListRemediationTemplatesRequest(Builder builder) {
        super(builder);
        this.managedRuleIdentifier = builder.managedRuleIdentifier;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.remediationType = builder.remediationType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRemediationTemplatesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return managedRuleIdentifier
     */
    public String getManagedRuleIdentifier() {
        return this.managedRuleIdentifier;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return remediationType
     */
    public String getRemediationType() {
        return this.remediationType;
    }

    public static final class Builder extends Request.Builder<ListRemediationTemplatesRequest, Builder> {
        private String managedRuleIdentifier; 
        private Long pageNumber; 
        private Long pageSize; 
        private String remediationType; 

        private Builder() {
            super();
        } 

        private Builder(ListRemediationTemplatesRequest request) {
            super(request);
            this.managedRuleIdentifier = request.managedRuleIdentifier;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.remediationType = request.remediationType;
        } 

        /**
         * <p>The identifier of the managed rule.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/261176.html">ListCompliancePackTemplates</a> operation to obtain the managed rule identifier.</p>
         * 
         * <strong>example:</strong>
         * <p>oss-bucket-public-write-prohibited</p>
         */
        public Builder managedRuleIdentifier(String managedRuleIdentifier) {
            this.putQueryParameter("ManagedRuleIdentifier", managedRuleIdentifier);
            this.managedRuleIdentifier = managedRuleIdentifier;
            return this;
        }

        /**
         * <p>The page number. Pages start from 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Long pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Valid values: 1 to 100.</p>
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
         * <p>The type of the remediation template. Valid value: OOS, which stands for Operation Orchestration Service.</p>
         * 
         * <strong>example:</strong>
         * <p>OOS</p>
         */
        public Builder remediationType(String remediationType) {
            this.putQueryParameter("RemediationType", remediationType);
            this.remediationType = remediationType;
            return this;
        }

        @Override
        public ListRemediationTemplatesRequest build() {
            return new ListRemediationTemplatesRequest(this);
        } 

    } 

}
