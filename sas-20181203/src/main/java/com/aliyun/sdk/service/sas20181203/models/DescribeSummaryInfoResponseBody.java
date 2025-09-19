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
 * {@link DescribeSummaryInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSummaryInfoResponseBody</p>
 */
public class DescribeSummaryInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AegisClientOfflineCount")
    private Integer aegisClientOfflineCount;

    @com.aliyun.core.annotation.NameInMap("AegisClientOnlineCount")
    private Integer aegisClientOnlineCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SecurityScore")
    private Integer securityScore;

    @com.aliyun.core.annotation.NameInMap("Success")
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

        private Builder() {
        } 

        private Builder(DescribeSummaryInfoResponseBody model) {
            this.aegisClientOfflineCount = model.aegisClientOfflineCount;
            this.aegisClientOnlineCount = model.aegisClientOnlineCount;
            this.requestId = model.requestId;
            this.securityScore = model.securityScore;
            this.success = model.success;
        } 

        /**
         * <p>The number of unprotected assets.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        public Builder aegisClientOfflineCount(Integer aegisClientOfflineCount) {
            this.aegisClientOfflineCount = aegisClientOfflineCount;
            return this;
        }

        /**
         * <p>The number of protected assets.</p>
         * 
         * <strong>example:</strong>
         * <p>127</p>
         */
        public Builder aegisClientOnlineCount(Integer aegisClientOnlineCount) {
            this.aegisClientOnlineCount = aegisClientOnlineCount;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>D40198E1-6EA8-482E-B3C7-D9573D75C0CA</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The security score of the assets. Valid values:</p>
         * <ul>
         * <li>95 to 100: The assets are secure.</li>
         * <li>85 to 94: The assets are exposed to a few security risks. We recommend that you reinforce your security system in a timely manner.</li>
         * <li>70 to 84: The assets are exposed to multiple security risks. We recommend that you reinforce your security system in a timely manner.</li>
         * <li>69 or lower: The current security system is unable to protect the assets against intrusions. We recommend that you reinforce your security system at the earliest opportunity.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>44</p>
         */
        public Builder securityScore(Integer securityScore) {
            this.securityScore = securityScore;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: yes</li>
         * <li><strong>false</strong>: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
