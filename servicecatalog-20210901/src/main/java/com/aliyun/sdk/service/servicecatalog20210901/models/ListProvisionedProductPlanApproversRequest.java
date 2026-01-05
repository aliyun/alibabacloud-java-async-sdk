// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicecatalog20210901.models;

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
 * {@link ListProvisionedProductPlanApproversRequest} extends {@link RequestModel}
 *
 * <p>ListProvisionedProductPlanApproversRequest</p>
 */
public class ListProvisionedProductPlanApproversRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccessLevelFilter")
    private String accessLevelFilter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApprovalFilter")
    private String approvalFilter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Filters")
    private java.util.List<Filters> filters;

    private ListProvisionedProductPlanApproversRequest(Builder builder) {
        super(builder);
        this.accessLevelFilter = builder.accessLevelFilter;
        this.approvalFilter = builder.approvalFilter;
        this.filters = builder.filters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProvisionedProductPlanApproversRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessLevelFilter
     */
    public String getAccessLevelFilter() {
        return this.accessLevelFilter;
    }

    /**
     * @return approvalFilter
     */
    public String getApprovalFilter() {
        return this.approvalFilter;
    }

    /**
     * @return filters
     */
    public java.util.List<Filters> getFilters() {
        return this.filters;
    }

    public static final class Builder extends Request.Builder<ListProvisionedProductPlanApproversRequest, Builder> {
        private String accessLevelFilter; 
        private String approvalFilter; 
        private java.util.List<Filters> filters; 

        private Builder() {
            super();
        } 

        private Builder(ListProvisionedProductPlanApproversRequest request) {
            super(request);
            this.accessLevelFilter = request.accessLevelFilter;
            this.approvalFilter = request.approvalFilter;
            this.filters = request.filters;
        } 

        /**
         * <p>The access filter. Valid values:</p>
         * <ul>
         * <li>User (default): queries the plans that are created by the current requester.</li>
         * <li>Account: queries the plans that belong to the current Alibaba Cloud account.</li>
         * <li>ResourceDirectory: queries the plans that belong to the current resource directory.</li>
         * </ul>
         * <blockquote>
         * <p> You must specify one of the <code>ApprovalFilter</code> and <code>AccessLevelFilter</code> parameters, but not both.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>User</p>
         */
        public Builder accessLevelFilter(String accessLevelFilter) {
            this.putQueryParameter("AccessLevelFilter", accessLevelFilter);
            this.accessLevelFilter = accessLevelFilter;
            return this;
        }

        /**
         * <p>The access filter of the review dimension. Valid values:</p>
         * <ul>
         * <li>AccountRequests: queries all reviewed plans that belong to the current Alibaba Cloud account.</li>
         * <li>ResourceDirectoryRequests: queries all plans that belong to the current resource directory.</li>
         * </ul>
         * <blockquote>
         * <p> You must specify one of the <code>ApprovalFilter</code> and <code>AccessLevelFilter</code> parameters, but not both.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>AccountRequests</p>
         */
        public Builder approvalFilter(String approvalFilter) {
            this.putQueryParameter("ApprovalFilter", approvalFilter);
            this.approvalFilter = approvalFilter;
            return this;
        }

        /**
         * <p>An array that consists of filter conditions.</p>
         */
        public Builder filters(java.util.List<Filters> filters) {
            this.putQueryParameter("Filters", filters);
            this.filters = filters;
            return this;
        }

        @Override
        public ListProvisionedProductPlanApproversRequest build() {
            return new ListProvisionedProductPlanApproversRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListProvisionedProductPlanApproversRequest} extends {@link TeaModel}
     *
     * <p>ListProvisionedProductPlanApproversRequest</p>
     */
    public static class Filters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Filters(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Filters create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(Filters model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The name of the filter condition. Valid values:</p>
             * <ul>
             * <li>ProvisionedProductPlanApproverName: performs fuzzy match by reviewer name.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ProvisionedProductPlanApproverName</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the filter condition.</p>
             * 
             * <strong>example:</strong>
             * <p>approver</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Filters build() {
                return new Filters(this);
            } 

        } 

    }
}
