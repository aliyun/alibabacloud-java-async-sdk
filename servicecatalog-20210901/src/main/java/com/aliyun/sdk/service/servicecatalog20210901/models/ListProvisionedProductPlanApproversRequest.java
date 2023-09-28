// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicecatalog20210901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListProvisionedProductPlanApproversRequest} extends {@link RequestModel}
 *
 * <p>ListProvisionedProductPlanApproversRequest</p>
 */
public class ListProvisionedProductPlanApproversRequest extends Request {
    @Query
    @NameInMap("AccessLevelFilter")
    private String accessLevelFilter;

    @Query
    @NameInMap("ApprovalFilter")
    private String approvalFilter;

    @Query
    @NameInMap("Filters")
    private java.util.List < Filters> filters;

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
    public java.util.List < Filters> getFilters() {
        return this.filters;
    }

    public static final class Builder extends Request.Builder<ListProvisionedProductPlanApproversRequest, Builder> {
        private String accessLevelFilter; 
        private String approvalFilter; 
        private java.util.List < Filters> filters; 

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
         * The access filter. Valid values:
         * <p>
         * 
         * *   User (default): queries the plans that are created by the current requester.
         * *   Account: queries the plans that belong to the current Alibaba Cloud account.
         * *   ResourceDirectory: queries the plans that belong to the current resource directory.
         * 
         * >  You must specify one of the `ApprovalFilter` and `AccessLevelFilter` parameters, but not both.
         */
        public Builder accessLevelFilter(String accessLevelFilter) {
            this.putQueryParameter("AccessLevelFilter", accessLevelFilter);
            this.accessLevelFilter = accessLevelFilter;
            return this;
        }

        /**
         * The access filter of the review dimension. Valid values:
         * <p>
         * 
         * *   AccountRequests: queries all reviewed plans that belong to the current Alibaba Cloud account.
         * *   ResourceDirectoryRequests: queries all plans that belong to the current resource directory.
         * 
         * >  You must specify one of the `ApprovalFilter` and `AccessLevelFilter` parameters, but not both.
         */
        public Builder approvalFilter(String approvalFilter) {
            this.putQueryParameter("ApprovalFilter", approvalFilter);
            this.approvalFilter = approvalFilter;
            return this;
        }

        /**
         * An array that consists of filter conditions.
         */
        public Builder filters(java.util.List < Filters> filters) {
            this.putQueryParameter("Filters", filters);
            this.filters = filters;
            return this;
        }

        @Override
        public ListProvisionedProductPlanApproversRequest build() {
            return new ListProvisionedProductPlanApproversRequest(this);
        } 

    } 

    public static class Filters extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
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

            /**
             * The name of the filter condition. Valid values:
             * <p>
             * 
             * *   ProvisionedProductPlanApproverName: performs fuzzy match by reviewer name.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of the filter condition.
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
