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
         * <p>The available quota.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder availableAuthorizeNum(Integer availableAuthorizeNum) {
            this.availableAuthorizeNum = availableAuthorizeNum;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7BC55C8F-226E-5AF5-9A2C-2EC43864****</p>
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
