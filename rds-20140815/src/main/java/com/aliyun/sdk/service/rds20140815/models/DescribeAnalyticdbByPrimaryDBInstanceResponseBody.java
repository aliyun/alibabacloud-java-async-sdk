// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeAnalyticdbByPrimaryDBInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAnalyticdbByPrimaryDBInstanceResponseBody</p>
 */
public class DescribeAnalyticdbByPrimaryDBInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AnalyticDBCount")
    private Integer analyticDBCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The number of associated analytic instances.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder analyticDBCount(Integer analyticDBCount) {
            this.analyticDBCount = analyticDBCount;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>77862BFF-ED59-552A-A2E8-692FEAFC9527</p>
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
