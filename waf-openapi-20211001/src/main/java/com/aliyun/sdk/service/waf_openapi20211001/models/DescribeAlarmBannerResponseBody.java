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
 * {@link DescribeAlarmBannerResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAlarmBannerResponseBody</p>
 */
public class DescribeAlarmBannerResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BannerStatus")
    private BannerStatus bannerStatus;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeAlarmBannerResponseBody(Builder builder) {
        this.bannerStatus = builder.bannerStatus;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAlarmBannerResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bannerStatus
     */
    public BannerStatus getBannerStatus() {
        return this.bannerStatus;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private BannerStatus bannerStatus; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeAlarmBannerResponseBody model) {
            this.bannerStatus = model.bannerStatus;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The status information of the alert banner.</p>
         */
        public Builder bannerStatus(BannerStatus bannerStatus) {
            this.bannerStatus = bannerStatus;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5555DC36-0CF2-5AA3-B1C7-D6BD8****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeAlarmBannerResponseBody build() {
            return new DescribeAlarmBannerResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAlarmBannerResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAlarmBannerResponseBody</p>
     */
    public static class BannerStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cause")
        private String cause;

        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Boolean status;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private BannerStatus(Builder builder) {
            this.cause = builder.cause;
            this.count = builder.count;
            this.status = builder.status;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BannerStatus create() {
            return builder().build();
        }

        /**
         * @return cause
         */
        public String getCause() {
            return this.cause;
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return status
         */
        public Boolean getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String cause; 
            private Integer count; 
            private Boolean status; 
            private String type; 

            private Builder() {
            } 

            private Builder(BannerStatus model) {
                this.cause = model.cause;
                this.count = model.count;
                this.status = model.status;
                this.type = model.type;
            } 

            /**
             * <p>The cause of the alert. If <strong>Type</strong> is set to <strong>sandbox</strong>, valid values:</p>
             * <ul>
             * <li><p><strong>fivefold</strong>: The queries per second (QPS) of your service exceeds five times the upper limit of your plan.</p>
             * </li>
             * <li><p><strong>4count</strong>: The QPS of your service has exceeded the upper limit of your plan for four or more days.</p>
             * </li>
             * <li><p><strong>exceed10w</strong>: The peak QPS of your service exceeds 100,000.</p>
             * </li>
             * <li><p><strong>costProtection</strong>: Billing protection is triggered.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>4count</p>
             */
            public Builder cause(String cause) {
                this.cause = cause;
                return this;
            }

            /**
             * <p>The count associated with the alert at the time it was triggered.</p>
             * <ul>
             * <li>If <strong>Type</strong> is set to <strong>sandbox</strong>, this parameter indicates the number of days that the QPS has exceeded the upper limit of your plan.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>9008</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>Indicates whether an alert is triggered. Valid values:</p>
             * <ul>
             * <li><p><strong>true</strong>: An alert is triggered. If <strong>Type</strong> is set to <strong>sandbox</strong>, the instance is in the sandbox.</p>
             * </li>
             * <li><p><strong>false</strong>: No alert is triggered. If <strong>Type</strong> is set to <strong>sandbox</strong>, the instance is not in the sandbox.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder status(Boolean status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The alert type. Valid value:</p>
             * <ul>
             * <li><strong>sandbox</strong>: a sandbox alert.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>sandbox</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public BannerStatus build() {
                return new BannerStatus(this);
            } 

        } 

    }
}
