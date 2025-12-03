// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20210114.models;

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
 * {@link DescribeScreenSummaryInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeScreenSummaryInfoResponseBody</p>
 */
public class DescribeScreenSummaryInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AegisClientOfflineCount")
    private Integer aegisClientOfflineCount;

    @com.aliyun.core.annotation.NameInMap("AegisClientOnlineCount")
    private Integer aegisClientOnlineCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SecurityScore")
    private Integer securityScore;

    private DescribeScreenSummaryInfoResponseBody(Builder builder) {
        this.aegisClientOfflineCount = builder.aegisClientOfflineCount;
        this.aegisClientOnlineCount = builder.aegisClientOnlineCount;
        this.requestId = builder.requestId;
        this.securityScore = builder.securityScore;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeScreenSummaryInfoResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aegisClientOfflineCount
     */
    public Integer getAegisClientOfflineCount() {
        return this.aegisClientOfflineCount;
    }

    /**
     * @return aegisClientOnlineCount
     */
    public Integer getAegisClientOnlineCount() {
        return this.aegisClientOnlineCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return securityScore
     */
    public Integer getSecurityScore() {
        return this.securityScore;
    }

    public static final class Builder {
        private Integer aegisClientOfflineCount; 
        private Integer aegisClientOnlineCount; 
        private String requestId; 
        private Integer securityScore; 

        private Builder() {
        } 

        private Builder(DescribeScreenSummaryInfoResponseBody model) {
            this.aegisClientOfflineCount = model.aegisClientOfflineCount;
            this.aegisClientOnlineCount = model.aegisClientOnlineCount;
            this.requestId = model.requestId;
            this.securityScore = model.securityScore;
        } 

        /**
         * AegisClientOfflineCount.
         */
        public Builder aegisClientOfflineCount(Integer aegisClientOfflineCount) {
            this.aegisClientOfflineCount = aegisClientOfflineCount;
            return this;
        }

        /**
         * AegisClientOnlineCount.
         */
        public Builder aegisClientOnlineCount(Integer aegisClientOnlineCount) {
            this.aegisClientOnlineCount = aegisClientOnlineCount;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SecurityScore.
         */
        public Builder securityScore(Integer securityScore) {
            this.securityScore = securityScore;
            return this;
        }

        public DescribeScreenSummaryInfoResponseBody build() {
            return new DescribeScreenSummaryInfoResponseBody(this);
        } 

    } 

}
