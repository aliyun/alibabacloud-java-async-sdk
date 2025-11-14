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
 * {@link DescribeClusterScannerListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeClusterScannerListResponseBody</p>
 */
public class DescribeClusterScannerListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstalledCount")
    private Integer installedCount;

    @com.aliyun.core.annotation.NameInMap("List")
    private java.util.List<List> list;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeClusterScannerListResponseBody(Builder builder) {
        this.installedCount = builder.installedCount;
        this.list = builder.list;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeClusterScannerListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return installedCount
     */
    public Integer getInstalledCount() {
        return this.installedCount;
    }

    /**
     * @return list
     */
    public java.util.List<List> getList() {
        return this.list;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer installedCount; 
        private java.util.List<List> list; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeClusterScannerListResponseBody model) {
            this.installedCount = model.installedCount;
            this.list = model.list;
            this.requestId = model.requestId;
        } 

        /**
         * InstalledCount.
         */
        public Builder installedCount(Integer installedCount) {
            this.installedCount = installedCount;
            return this;
        }

        /**
         * List.
         */
        public Builder list(java.util.List<List> list) {
            this.list = list;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeClusterScannerListResponseBody build() {
            return new DescribeClusterScannerListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeClusterScannerListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeClusterScannerListResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LastTime")
        private Long lastTime;

        @com.aliyun.core.annotation.NameInMap("NeedUpdate")
        private Boolean needUpdate;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        @com.aliyun.core.annotation.NameInMap("WebhookOpen")
        private Integer webhookOpen;

        @com.aliyun.core.annotation.NameInMap("WebhookStatus")
        private String webhookStatus;

        private List(Builder builder) {
            this.lastTime = builder.lastTime;
            this.needUpdate = builder.needUpdate;
            this.status = builder.status;
            this.version = builder.version;
            this.webhookOpen = builder.webhookOpen;
            this.webhookStatus = builder.webhookStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return lastTime
         */
        public Long getLastTime() {
            return this.lastTime;
        }

        /**
         * @return needUpdate
         */
        public Boolean getNeedUpdate() {
            return this.needUpdate;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        /**
         * @return webhookOpen
         */
        public Integer getWebhookOpen() {
            return this.webhookOpen;
        }

        /**
         * @return webhookStatus
         */
        public String getWebhookStatus() {
            return this.webhookStatus;
        }

        public static final class Builder {
            private Long lastTime; 
            private Boolean needUpdate; 
            private String status; 
            private String version; 
            private Integer webhookOpen; 
            private String webhookStatus; 

            private Builder() {
            } 

            private Builder(List model) {
                this.lastTime = model.lastTime;
                this.needUpdate = model.needUpdate;
                this.status = model.status;
                this.version = model.version;
                this.webhookOpen = model.webhookOpen;
                this.webhookStatus = model.webhookStatus;
            } 

            /**
             * LastTime.
             */
            public Builder lastTime(Long lastTime) {
                this.lastTime = lastTime;
                return this;
            }

            /**
             * NeedUpdate.
             */
            public Builder needUpdate(Boolean needUpdate) {
                this.needUpdate = needUpdate;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            /**
             * WebhookOpen.
             */
            public Builder webhookOpen(Integer webhookOpen) {
                this.webhookOpen = webhookOpen;
                return this;
            }

            /**
             * WebhookStatus.
             */
            public Builder webhookStatus(String webhookStatus) {
                this.webhookStatus = webhookStatus;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
}
