// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.neuron20211115.models;

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
 * {@link ListBucUserEnterpriseRequest} extends {@link RequestModel}
 *
 * <p>ListBucUserEnterpriseRequest</p>
 */
public class ListBucUserEnterpriseRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("empId")
    private String empId;

    private ListBucUserEnterpriseRequest(Builder builder) {
        super(builder);
        this.empId = builder.empId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListBucUserEnterpriseRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return empId
     */
    public String getEmpId() {
        return this.empId;
    }

    public static final class Builder extends Request.Builder<ListBucUserEnterpriseRequest, Builder> {
        private String empId; 

        private Builder() {
            super();
        } 

        private Builder(ListBucUserEnterpriseRequest request) {
            super(request);
            this.empId = request.empId;
        } 

        /**
         * empId.
         */
        public Builder empId(String empId) {
            this.putQueryParameter("empId", empId);
            this.empId = empId;
            return this;
        }

        @Override
        public ListBucUserEnterpriseRequest build() {
            return new ListBucUserEnterpriseRequest(this);
        } 

    } 

}
