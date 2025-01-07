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
 * {@link DescribeCanTrySasResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCanTrySasResponseBody</p>
 */
public class DescribeCanTrySasResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CanTry")
    private Integer canTry;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeCanTrySasResponseBody(Builder builder) {
        this.canTry = builder.canTry;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCanTrySasResponseBody create() {
        return builder().build();
    }

    /**
     * @return canTry
     */
    public Integer getCanTry() {
        return this.canTry;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer canTry; 
        private String requestId; 

        /**
         * <p>Indicates whether you have the permissions on the trial use of Security Center. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: yes</li>
         * <li><strong>0</strong>: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder canTry(Integer canTry) {
            this.canTry = canTry;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>E90DE229-9FC6-58F6-BF4B-03AD6179****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeCanTrySasResponseBody build() {
            return new DescribeCanTrySasResponseBody(this);
        } 

    } 

}
