// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20171228.models;

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
 * {@link DescribeLogStoreExistStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLogStoreExistStatusResponseBody</p>
 */
public class DescribeLogStoreExistStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ExistStatus")
    private Boolean existStatus;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeLogStoreExistStatusResponseBody(Builder builder) {
        this.existStatus = builder.existStatus;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLogStoreExistStatusResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return existStatus
     */
    public Boolean getExistStatus() {
        return this.existStatus;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Boolean existStatus; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeLogStoreExistStatusResponseBody model) {
            this.existStatus = model.existStatus;
            this.requestId = model.requestId;
        } 

        /**
         * ExistStatus.
         */
        public Builder existStatus(Boolean existStatus) {
            this.existStatus = existStatus;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeLogStoreExistStatusResponseBody build() {
            return new DescribeLogStoreExistStatusResponseBody(this);
        } 

    } 

}
