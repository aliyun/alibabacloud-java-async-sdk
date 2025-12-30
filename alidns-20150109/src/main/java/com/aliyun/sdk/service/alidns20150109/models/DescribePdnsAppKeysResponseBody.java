// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

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
 * {@link DescribePdnsAppKeysResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePdnsAppKeysResponseBody</p>
 */
public class DescribePdnsAppKeysResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AppKeys")
    private java.util.List<AppKeys> appKeys;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribePdnsAppKeysResponseBody(Builder builder) {
        this.appKeys = builder.appKeys;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePdnsAppKeysResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appKeys
     */
    public java.util.List<AppKeys> getAppKeys() {
        return this.appKeys;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<AppKeys> appKeys; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribePdnsAppKeysResponseBody model) {
            this.appKeys = model.appKeys;
            this.requestId = model.requestId;
        } 

        /**
         * AppKeys.
         */
        public Builder appKeys(java.util.List<AppKeys> appKeys) {
            this.appKeys = appKeys;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribePdnsAppKeysResponseBody build() {
            return new DescribePdnsAppKeysResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribePdnsAppKeysResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePdnsAppKeysResponseBody</p>
     */
    public static class BindEdgeDnsClusters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("ClusterName")
        private String clusterName;

        @com.aliyun.core.annotation.NameInMap("ClusterUserId")
        private String clusterUserId;

        private BindEdgeDnsClusters(Builder builder) {
            this.clusterId = builder.clusterId;
            this.clusterName = builder.clusterName;
            this.clusterUserId = builder.clusterUserId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BindEdgeDnsClusters create() {
            return builder().build();
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return clusterName
         */
        public String getClusterName() {
            return this.clusterName;
        }

        /**
         * @return clusterUserId
         */
        public String getClusterUserId() {
            return this.clusterUserId;
        }

        public static final class Builder {
            private String clusterId; 
            private String clusterName; 
            private String clusterUserId; 

            private Builder() {
            } 

            private Builder(BindEdgeDnsClusters model) {
                this.clusterId = model.clusterId;
                this.clusterName = model.clusterName;
                this.clusterUserId = model.clusterUserId;
            } 

            /**
             * ClusterId.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * ClusterName.
             */
            public Builder clusterName(String clusterName) {
                this.clusterName = clusterName;
                return this;
            }

            /**
             * ClusterUserId.
             */
            public Builder clusterUserId(String clusterUserId) {
                this.clusterUserId = clusterUserId;
                return this;
            }

            public BindEdgeDnsClusters build() {
                return new BindEdgeDnsClusters(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribePdnsAppKeysResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePdnsAppKeysResponseBody</p>
     */
    public static class AppKeys extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppKeyId")
        private String appKeyId;

        @com.aliyun.core.annotation.NameInMap("BindEdgeDnsClusters")
        private java.util.List<BindEdgeDnsClusters> bindEdgeDnsClusters;

        @com.aliyun.core.annotation.NameInMap("CreateDate")
        private String createDate;

        @com.aliyun.core.annotation.NameInMap("CreateTimestamp")
        private Long createTimestamp;

        @com.aliyun.core.annotation.NameInMap("Remark")
        private String remark;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        private AppKeys(Builder builder) {
            this.appKeyId = builder.appKeyId;
            this.bindEdgeDnsClusters = builder.bindEdgeDnsClusters;
            this.createDate = builder.createDate;
            this.createTimestamp = builder.createTimestamp;
            this.remark = builder.remark;
            this.state = builder.state;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AppKeys create() {
            return builder().build();
        }

        /**
         * @return appKeyId
         */
        public String getAppKeyId() {
            return this.appKeyId;
        }

        /**
         * @return bindEdgeDnsClusters
         */
        public java.util.List<BindEdgeDnsClusters> getBindEdgeDnsClusters() {
            return this.bindEdgeDnsClusters;
        }

        /**
         * @return createDate
         */
        public String getCreateDate() {
            return this.createDate;
        }

        /**
         * @return createTimestamp
         */
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        public static final class Builder {
            private String appKeyId; 
            private java.util.List<BindEdgeDnsClusters> bindEdgeDnsClusters; 
            private String createDate; 
            private Long createTimestamp; 
            private String remark; 
            private String state; 

            private Builder() {
            } 

            private Builder(AppKeys model) {
                this.appKeyId = model.appKeyId;
                this.bindEdgeDnsClusters = model.bindEdgeDnsClusters;
                this.createDate = model.createDate;
                this.createTimestamp = model.createTimestamp;
                this.remark = model.remark;
                this.state = model.state;
            } 

            /**
             * AppKeyId.
             */
            public Builder appKeyId(String appKeyId) {
                this.appKeyId = appKeyId;
                return this;
            }

            /**
             * BindEdgeDnsClusters.
             */
            public Builder bindEdgeDnsClusters(java.util.List<BindEdgeDnsClusters> bindEdgeDnsClusters) {
                this.bindEdgeDnsClusters = bindEdgeDnsClusters;
                return this;
            }

            /**
             * CreateDate.
             */
            public Builder createDate(String createDate) {
                this.createDate = createDate;
                return this;
            }

            /**
             * CreateTimestamp.
             */
            public Builder createTimestamp(Long createTimestamp) {
                this.createTimestamp = createTimestamp;
                return this;
            }

            /**
             * Remark.
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * State.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            public AppKeys build() {
                return new AppKeys(this);
            } 

        } 

    }
}
