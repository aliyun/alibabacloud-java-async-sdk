// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

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
 * {@link ListPhoneNumbersRequest} extends {@link RequestModel}
 *
 * <p>ListPhoneNumbersRequest</p>
 */
public class ListPhoneNumbersRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OutboundOnly")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean outboundOnly;

    private ListPhoneNumbersRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.outboundOnly = builder.outboundOnly;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPhoneNumbersRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return outboundOnly
     */
    public Boolean getOutboundOnly() {
        return this.outboundOnly;
    }

    public static final class Builder extends Request.Builder<ListPhoneNumbersRequest, Builder> {
        private String instanceId; 
        private Boolean outboundOnly; 

        private Builder() {
            super();
        } 

        private Builder(ListPhoneNumbersRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.outboundOnly = request.outboundOnly;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder outboundOnly(Boolean outboundOnly) {
            this.putQueryParameter("OutboundOnly", outboundOnly);
            this.outboundOnly = outboundOnly;
            return this;
        }

        @Override
        public ListPhoneNumbersRequest build() {
            return new ListPhoneNumbersRequest(this);
        } 

    } 

}
