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
 * {@link OperationCancelIgnoreSuspEventRequest} extends {@link RequestModel}
 *
 * <p>OperationCancelIgnoreSuspEventRequest</p>
 */
public class OperationCancelIgnoreSuspEventRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Remark")
    private String remark;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityEventIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Long> securityEventIds;

    private OperationCancelIgnoreSuspEventRequest(Builder builder) {
        super(builder);
        this.remark = builder.remark;
        this.securityEventIds = builder.securityEventIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OperationCancelIgnoreSuspEventRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * @return securityEventIds
     */
    public java.util.List<Long> getSecurityEventIds() {
        return this.securityEventIds;
    }

    public static final class Builder extends Request.Builder<OperationCancelIgnoreSuspEventRequest, Builder> {
        private String remark; 
        private java.util.List<Long> securityEventIds; 

        private Builder() {
            super();
        } 

        private Builder(OperationCancelIgnoreSuspEventRequest request) {
            super(request);
            this.remark = request.remark;
            this.securityEventIds = request.securityEventIds;
        } 

        /**
         * <p>The remarks.</p>
         * 
         * <strong>example:</strong>
         * <p>remark text</p>
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * <p>The IDs of alert events.</p>
         * <p>This parameter is required.</p>
         */
        public Builder securityEventIds(java.util.List<Long> securityEventIds) {
            this.putQueryParameter("SecurityEventIds", securityEventIds);
            this.securityEventIds = securityEventIds;
            return this;
        }

        @Override
        public OperationCancelIgnoreSuspEventRequest build() {
            return new OperationCancelIgnoreSuspEventRequest(this);
        } 

    } 

}
