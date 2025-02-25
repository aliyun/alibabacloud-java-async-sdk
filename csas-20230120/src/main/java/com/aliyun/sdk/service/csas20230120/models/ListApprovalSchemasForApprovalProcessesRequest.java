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
 * {@link ListApprovalSchemasForApprovalProcessesRequest} extends {@link RequestModel}
 *
 * <p>ListApprovalSchemasForApprovalProcessesRequest</p>
 */
public class ListApprovalSchemasForApprovalProcessesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProcessIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> processIds;

    private ListApprovalSchemasForApprovalProcessesRequest(Builder builder) {
        super(builder);
        this.processIds = builder.processIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListApprovalSchemasForApprovalProcessesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return processIds
     */
    public java.util.List<String> getProcessIds() {
        return this.processIds;
    }

    public static final class Builder extends Request.Builder<ListApprovalSchemasForApprovalProcessesRequest, Builder> {
        private java.util.List<String> processIds; 

        private Builder() {
            super();
        } 

        private Builder(ListApprovalSchemasForApprovalProcessesRequest request) {
            super(request);
            this.processIds = request.processIds;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder processIds(java.util.List<String> processIds) {
            this.putQueryParameter("ProcessIds", processIds);
            this.processIds = processIds;
            return this;
        }

        @Override
        public ListApprovalSchemasForApprovalProcessesRequest build() {
            return new ListApprovalSchemasForApprovalProcessesRequest(this);
        } 

    } 

}
