// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAnalyticdbByPrimaryDBInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAnalyticdbByPrimaryDBInstanceResponseBody</p>
 */
public class DescribeAnalyticdbByPrimaryDBInstanceResponseBody extends TeaModel {
    @NameInMap("AnalyticDBCount")
    private Integer analyticDBCount;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeAnalyticdbByPrimaryDBInstanceResponseBody(Builder builder) {
        this.analyticDBCount = builder.analyticDBCount;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAnalyticdbByPrimaryDBInstanceResponseBody create() {
        return builder().build();
    }

    /**
     * @return analyticDBCount
     */
    public Integer getAnalyticDBCount() {
        return this.analyticDBCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer analyticDBCount; 
        private String requestId; 

        /**
         * The number of associated analytic instances.
         */
        public Builder analyticDBCount(Integer analyticDBCount) {
            this.analyticDBCount = analyticDBCount;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeAnalyticdbByPrimaryDBInstanceResponseBody build() {
            return new DescribeAnalyticdbByPrimaryDBInstanceResponseBody(this);
        } 

    } 

}
