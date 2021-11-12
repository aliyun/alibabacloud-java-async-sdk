// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DescribeSummaryInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSummaryInfoResponseBody</p>
 */
public class DescribeSummaryInfoResponseBody extends TeaModel {
    @NameInMap("AegisClientOfflineCount")
    private Integer aegisClientOfflineCount;

    @NameInMap("AegisClientOnlineCount")
    private Integer aegisClientOnlineCount;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SecurityScore")
    private Integer securityScore;

    @NameInMap("Success")
    private Boolean success;


    private DescribeSummaryInfoResponseBody(Builder builder) {
        this.aegisClientOfflineCount = builder.aegisClientOfflineCount;
        this.aegisClientOnlineCount = builder.aegisClientOnlineCount;
        this.requestId = builder.requestId;
        this.securityScore = builder.securityScore;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSummaryInfoResponseBody create() {
        return builder().build();
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Integer aegisClientOfflineCount; 
        private Integer aegisClientOnlineCount; 
        private String requestId; 
        private Integer securityScore; 
        private Boolean success; 

        /**
         * <p>AegisClientOfflineCount.</p>
         */
        public Builder aegisClientOfflineCount(Integer aegisClientOfflineCount) {
            this.aegisClientOfflineCount = aegisClientOfflineCount;
            return this;
        }

        /**
         * <p>AegisClientOnlineCount.</p>
         */
        public Builder aegisClientOnlineCount(Integer aegisClientOnlineCount) {
            this.aegisClientOnlineCount = aegisClientOnlineCount;
            return this;
        }

        /**
         * <p>RequestId.</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>SecurityScore.</p>
         */
        public Builder securityScore(Integer securityScore) {
            this.securityScore = securityScore;
            return this;
        }

        /**
         * <p>Success.</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeSummaryInfoResponseBody build() {
            return new DescribeSummaryInfoResponseBody(this);
        } 

    } 

}
