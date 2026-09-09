// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

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
 * {@link DescribeUserWafLogStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUserWafLogStatusResponseBody</p>
 */
public class DescribeUserWafLogStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LogRegionId")
    private String logRegionId;

    @com.aliyun.core.annotation.NameInMap("LogStatus")
    private String logStatus;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StatusUpdateTime")
    private Long statusUpdateTime;

    private DescribeUserWafLogStatusResponseBody(Builder builder) {
        this.logRegionId = builder.logRegionId;
        this.logStatus = builder.logStatus;
        this.requestId = builder.requestId;
        this.statusUpdateTime = builder.statusUpdateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUserWafLogStatusResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return logRegionId
     */
    public String getLogRegionId() {
        return this.logRegionId;
    }

    /**
     * @return logStatus
     */
    public String getLogStatus() {
        return this.logStatus;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return statusUpdateTime
     */
    public Long getStatusUpdateTime() {
        return this.statusUpdateTime;
    }

    public static final class Builder {
        private String logRegionId; 
        private String logStatus; 
        private String requestId; 
        private Long statusUpdateTime; 

        private Builder() {
        } 

        private Builder(DescribeUserWafLogStatusResponseBody model) {
            this.logRegionId = model.logRegionId;
            this.logStatus = model.logStatus;
            this.requestId = model.requestId;
            this.statusUpdateTime = model.statusUpdateTime;
        } 

        /**
         * <p>The ID of the region where logs are stored. Valid values:</p>
         * <ul>
         * <li><p><strong>cn-hangzhou</strong>: indicates China East 1 (Hangzhou).</p>
         * </li>
         * <li><p><strong>cn-beijing</strong>: indicates China North 2 (Beijing).</p>
         * </li>
         * <li><p><strong>cn-hongkong</strong>: indicates China (Hong Kong).</p>
         * </li>
         * <li><p><strong>ap-southeast-1</strong>: indicates Singapore.</p>
         * </li>
         * <li><p><strong>ap-southeast-3</strong>: indicates Malaysia (Kuala Lumpur).</p>
         * </li>
         * <li><p><strong>ap-southeast-5</strong>: indicates Indonesia (Jakarta).</p>
         * </li>
         * <li><p><strong>ap-southeast-6</strong>: indicates Philippines (Manila).</p>
         * </li>
         * <li><p><strong>ap-southeast-7</strong>: indicates Thailand (Bangkok).</p>
         * </li>
         * <li><p><strong>me-east-1</strong>: indicates UAE (Dubai).</p>
         * </li>
         * <li><p><strong>eu-central-1</strong>: indicates Germany (Frankfurt).</p>
         * </li>
         * <li><p><strong>us-east-1</strong>: indicates US (Virginia).</p>
         * </li>
         * <li><p><strong>us-west-1</strong>: indicates US (Silicon Valley).</p>
         * </li>
         * <li><p><strong>ap-northeast-1</strong>: indicates Japan (Tokyo).</p>
         * </li>
         * <li><p><strong>ap-northeast-2</strong>: indicates South Korea (Seoul).</p>
         * </li>
         * <li><p><strong>eu-west-1</strong>: indicates UK (London).</p>
         * </li>
         * <li><p><strong>cn-hangzhou-finance</strong>: indicates China East 1 Hangzhou Finance Cloud.</p>
         * </li>
         * <li><p><strong>cn-shanghai-finance-1</strong>: indicates China East 2 Shanghai Finance Cloud.</p>
         * </li>
         * <li><p><strong>cn-shenzhen-finance</strong>: indicates China South 1 Shenzhen Finance Cloud.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>The Finance Cloud regions are available only to Finance Cloud users, and Finance Cloud users can obtain only these regions.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder logRegionId(String logRegionId) {
            this.logRegionId = logRegionId;
            return this;
        }

        /**
         * <p>The status of WAF logs.</p>
         * <ul>
         * <li><p><strong>initializing</strong>: The logs are being initialized.</p>
         * </li>
         * <li><p><strong>initialize_failed</strong>: The initialization failed.</p>
         * </li>
         * <li><p><strong>normal</strong>: The logs are running properly.</p>
         * </li>
         * <li><p><strong>releasing</strong>: The logs are being released.</p>
         * </li>
         * <li><p><strong>release_failed</strong>: The release failed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        public Builder logStatus(String logStatus) {
            this.logStatus = logStatus;
            return this;
        }

        /**
         * <p>The request ID, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>D7861F61-5B61-46CE-A47C-6B19160D5EB0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The time when the log status was modified. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1706771796859</p>
         */
        public Builder statusUpdateTime(Long statusUpdateTime) {
            this.statusUpdateTime = statusUpdateTime;
            return this;
        }

        public DescribeUserWafLogStatusResponseBody build() {
            return new DescribeUserWafLogStatusResponseBody(this);
        } 

    } 

}
