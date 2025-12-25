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
         * BannerStatus.
         */
        public Builder bannerStatus(BannerStatus bannerStatus) {
            this.bannerStatus = bannerStatus;
            return this;
        }

        /**
         * RequestId.
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
             * Cause.
             */
            public Builder cause(String cause) {
                this.cause = cause;
                return this;
            }

            /**
             * Count.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Boolean status) {
                this.status = status;
                return this;
            }

            /**
             * Type.
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
