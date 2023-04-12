// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcedirectorymaster20220419.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTargetAttachmentsForControlPolicyRequest} extends {@link RequestModel}
 *
 * <p>ListTargetAttachmentsForControlPolicyRequest</p>
 */
public class ListTargetAttachmentsForControlPolicyRequest extends Request {
    @Query
    @NameInMap("PageNumber")
    @Validation(maximum = 200000, minimum = 1)
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    @Validation(maximum = 100, minimum = 1)
    private Integer pageSize;

    @Query
    @NameInMap("PolicyId")
    @Validation(required = true)
    private String policyId;

    private ListTargetAttachmentsForControlPolicyRequest(Builder builder) {
        super(builder);
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.policyId = builder.policyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTargetAttachmentsForControlPolicyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return policyId
     */
    public String getPolicyId() {
        return this.policyId;
    }

    public static final class Builder extends Request.Builder<ListTargetAttachmentsForControlPolicyRequest, Builder> {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String policyId; 

        private Builder() {
            super();
        } 

        private Builder(ListTargetAttachmentsForControlPolicyRequest request) {
            super(request);
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.policyId = request.policyId;
        } 

        /**
         * The number of the page to return.
         * <p>
         * 
         * Pages start from page 1. Default value: 1.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries to return on each page.
         * <p>
         * 
         * Valid values: 1 to 100. Default value: 10.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the access control policy.
         */
        public Builder policyId(String policyId) {
            this.putQueryParameter("PolicyId", policyId);
            this.policyId = policyId;
            return this;
        }

        @Override
        public ListTargetAttachmentsForControlPolicyRequest build() {
            return new ListTargetAttachmentsForControlPolicyRequest(this);
        } 

    } 

}
