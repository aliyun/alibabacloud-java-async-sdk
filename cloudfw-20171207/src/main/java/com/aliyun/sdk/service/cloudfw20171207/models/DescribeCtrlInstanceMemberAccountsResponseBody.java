// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link DescribeCtrlInstanceMemberAccountsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCtrlInstanceMemberAccountsResponseBody</p>
 */
public class DescribeCtrlInstanceMemberAccountsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceMemberCount")
    private Long instanceMemberCount;

    @com.aliyun.core.annotation.NameInMap("MaxInstanceMemberNum")
    private Long maxInstanceMemberNum;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeCtrlInstanceMemberAccountsResponseBody(Builder builder) {
        this.instanceMemberCount = builder.instanceMemberCount;
        this.maxInstanceMemberNum = builder.maxInstanceMemberNum;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCtrlInstanceMemberAccountsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceMemberCount
     */
    public Long getInstanceMemberCount() {
        return this.instanceMemberCount;
    }

    /**
     * @return maxInstanceMemberNum
     */
    public Long getMaxInstanceMemberNum() {
        return this.maxInstanceMemberNum;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Long instanceMemberCount; 
        private Long maxInstanceMemberNum; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeCtrlInstanceMemberAccountsResponseBody model) {
            this.instanceMemberCount = model.instanceMemberCount;
            this.maxInstanceMemberNum = model.maxInstanceMemberNum;
            this.requestId = model.requestId;
        } 

        /**
         * InstanceMemberCount.
         */
        public Builder instanceMemberCount(Long instanceMemberCount) {
            this.instanceMemberCount = instanceMemberCount;
            return this;
        }

        /**
         * MaxInstanceMemberNum.
         */
        public Builder maxInstanceMemberNum(Long maxInstanceMemberNum) {
            this.maxInstanceMemberNum = maxInstanceMemberNum;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeCtrlInstanceMemberAccountsResponseBody build() {
            return new DescribeCtrlInstanceMemberAccountsResponseBody(this);
        } 

    } 

}
