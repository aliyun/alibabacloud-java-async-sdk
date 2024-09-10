// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeWhiteListAuthorizeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeWhiteListAuthorizeResponseBody</p>
 */
public class DescribeWhiteListAuthorizeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AvailableAuthorizeNum")
    private Integer availableAuthorizeNum;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeWhiteListAuthorizeResponseBody(Builder builder) {
        this.availableAuthorizeNum = builder.availableAuthorizeNum;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeWhiteListAuthorizeResponseBody create() {
        return builder().build();
    }

    /**
     * @return availableAuthorizeNum
     */
    public Integer getAvailableAuthorizeNum() {
        return this.availableAuthorizeNum;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer availableAuthorizeNum; 
        private String requestId; 

        /**
         * The available quota.
         */
        public Builder availableAuthorizeNum(Integer availableAuthorizeNum) {
            this.availableAuthorizeNum = availableAuthorizeNum;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeWhiteListAuthorizeResponseBody build() {
            return new DescribeWhiteListAuthorizeResponseBody(this);
        } 

    } 

}
