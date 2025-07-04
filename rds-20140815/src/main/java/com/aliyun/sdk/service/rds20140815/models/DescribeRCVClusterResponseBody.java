// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link DescribeRCVClusterResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRCVClusterResponseBody</p>
 */
public class DescribeRCVClusterResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("VClusterStatus")
    private String vClusterStatus;

    private DescribeRCVClusterResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.vClusterStatus = builder.vClusterStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRCVClusterResponseBody create() {
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
     * @return vClusterStatus
     */
    public String getVClusterStatus() {
        return this.vClusterStatus;
    }

    public static final class Builder {
        private String requestId; 
        private String vClusterStatus; 

        private Builder() {
        } 

        private Builder(DescribeRCVClusterResponseBody model) {
            this.requestId = model.requestId;
            this.vClusterStatus = model.vClusterStatus;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * VClusterStatus.
         */
        public Builder vClusterStatus(String vClusterStatus) {
            this.vClusterStatus = vClusterStatus;
            return this;
        }

        public DescribeRCVClusterResponseBody build() {
            return new DescribeRCVClusterResponseBody(this);
        } 

    } 

}
