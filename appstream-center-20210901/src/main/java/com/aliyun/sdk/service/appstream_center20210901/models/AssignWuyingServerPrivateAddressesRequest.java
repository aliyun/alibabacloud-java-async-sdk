// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link AssignWuyingServerPrivateAddressesRequest} extends {@link RequestModel}
 *
 * <p>AssignWuyingServerPrivateAddressesRequest</p>
 */
public class AssignWuyingServerPrivateAddressesRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SecondaryPrivateIpAddressCount")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer secondaryPrivateIpAddressCount;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WuyingServerId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String wuyingServerId;

    private AssignWuyingServerPrivateAddressesRequest(Builder builder) {
        super(builder);
        this.secondaryPrivateIpAddressCount = builder.secondaryPrivateIpAddressCount;
        this.wuyingServerId = builder.wuyingServerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AssignWuyingServerPrivateAddressesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return secondaryPrivateIpAddressCount
     */
    public Integer getSecondaryPrivateIpAddressCount() {
        return this.secondaryPrivateIpAddressCount;
    }

    /**
     * @return wuyingServerId
     */
    public String getWuyingServerId() {
        return this.wuyingServerId;
    }

    public static final class Builder extends Request.Builder<AssignWuyingServerPrivateAddressesRequest, Builder> {
        private Integer secondaryPrivateIpAddressCount; 
        private String wuyingServerId; 

        private Builder() {
            super();
        } 

        private Builder(AssignWuyingServerPrivateAddressesRequest request) {
            super(request);
            this.secondaryPrivateIpAddressCount = request.secondaryPrivateIpAddressCount;
            this.wuyingServerId = request.wuyingServerId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder secondaryPrivateIpAddressCount(Integer secondaryPrivateIpAddressCount) {
            this.putBodyParameter("SecondaryPrivateIpAddressCount", secondaryPrivateIpAddressCount);
            this.secondaryPrivateIpAddressCount = secondaryPrivateIpAddressCount;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-bp1234567890abcde</p>
         */
        public Builder wuyingServerId(String wuyingServerId) {
            this.putBodyParameter("WuyingServerId", wuyingServerId);
            this.wuyingServerId = wuyingServerId;
            return this;
        }

        @Override
        public AssignWuyingServerPrivateAddressesRequest build() {
            return new AssignWuyingServerPrivateAddressesRequest(this);
        } 

    } 

}
