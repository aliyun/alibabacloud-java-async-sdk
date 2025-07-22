// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link CreateSubnetResponseBody} extends {@link TeaModel}
 *
 * <p>CreateSubnetResponseBody</p>
 */
public class CreateSubnetResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SubnetId")
    private String subnetId;

    private CreateSubnetResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.subnetId = builder.subnetId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSubnetResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return subnetId
     */
    public String getSubnetId() {
        return this.subnetId;
    }

    public static final class Builder {
        private String requestId; 
        private String subnetId; 

        private Builder() {
        } 

        private Builder(CreateSubnetResponseBody model) {
            this.requestId = model.requestId;
            this.subnetId = model.subnetId;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SubnetId.
         */
        public Builder subnetId(String subnetId) {
            this.subnetId = subnetId;
            return this;
        }

        public CreateSubnetResponseBody build() {
            return new CreateSubnetResponseBody(this);
        } 

    } 

}
