// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

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
 * {@link ListTrustedOriginsResponseBody} extends {@link TeaModel}
 *
 * <p>ListTrustedOriginsResponseBody</p>
 */
public class ListTrustedOriginsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("TrustedOrigins")
    private java.util.List<TrustedOrigins> trustedOrigins;

    private ListTrustedOriginsResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.trustedOrigins = builder.trustedOrigins;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTrustedOriginsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return trustedOrigins
     */
    public java.util.List<TrustedOrigins> getTrustedOrigins() {
        return this.trustedOrigins;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 
        private java.util.List<TrustedOrigins> trustedOrigins; 

        private Builder() {
        } 

        private Builder(ListTrustedOriginsResponseBody model) {
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
            this.trustedOrigins = model.trustedOrigins;
        } 

        /**
         * <p>The number of entries per page that takes effect for this request.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The token for the next page query.</p>
         * 
         * <strong>example:</strong>
         * <p>NT_example</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0441BD79-example</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>The list of trusted origins.</p>
         */
        public Builder trustedOrigins(java.util.List<TrustedOrigins> trustedOrigins) {
            this.trustedOrigins = trustedOrigins;
            return this;
        }

        public ListTrustedOriginsResponseBody build() {
            return new ListTrustedOriginsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListTrustedOriginsResponseBody} extends {@link TeaModel}
     *
     * <p>ListTrustedOriginsResponseBody</p>
     */
    public static class TrustedOrigins extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Origin")
        private String origin;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TrustOriginName")
        private String trustOriginName;

        @com.aliyun.core.annotation.NameInMap("TrustedOriginId")
        private String trustedOriginId;

        @com.aliyun.core.annotation.NameInMap("TrustedOriginScene")
        private java.util.List<String> trustedOriginScene;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        private TrustedOrigins(Builder builder) {
            this.createTime = builder.createTime;
            this.instanceId = builder.instanceId;
            this.origin = builder.origin;
            this.status = builder.status;
            this.trustOriginName = builder.trustOriginName;
            this.trustedOriginId = builder.trustedOriginId;
            this.trustedOriginScene = builder.trustedOriginScene;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TrustedOrigins create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return origin
         */
        public String getOrigin() {
            return this.origin;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return trustOriginName
         */
        public String getTrustOriginName() {
            return this.trustOriginName;
        }

        /**
         * @return trustedOriginId
         */
        public String getTrustedOriginId() {
            return this.trustedOriginId;
        }

        /**
         * @return trustedOriginScene
         */
        public java.util.List<String> getTrustedOriginScene() {
            return this.trustedOriginScene;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String createTime; 
            private String instanceId; 
            private String origin; 
            private String status; 
            private String trustOriginName; 
            private String trustedOriginId; 
            private java.util.List<String> trustedOriginScene; 
            private String updateTime; 

            private Builder() {
            } 

            private Builder(TrustedOrigins model) {
                this.createTime = model.createTime;
                this.instanceId = model.instanceId;
                this.origin = model.origin;
                this.status = model.status;
                this.trustOriginName = model.trustOriginName;
                this.trustedOriginId = model.trustedOriginId;
                this.trustedOriginScene = model.trustedOriginScene;
                this.updateTime = model.updateTime;
            } 

            /**
             * <p>The creation time.</p>
             * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
             * 
             * <strong>example:</strong>
             * <p>2026-08-20T08:00:00Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>idaas_example</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The browser origin.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://console.qoder.com">https://console.qoder.com</a></p>
             */
            public Builder origin(String origin) {
                this.origin = origin;
                return this;
            }

            /**
             * <p>The status.</p>
             * 
             * <strong>example:</strong>
             * <p>Enabled</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The trusted origin name.</p>
             * 
             * <strong>example:</strong>
             * <p>Qoder Production Console</p>
             */
            public Builder trustOriginName(String trustOriginName) {
                this.trustOriginName = trustOriginName;
                return this;
            }

            /**
             * <p>The trusted origin ID.</p>
             * 
             * <strong>example:</strong>
             * <p>to_example</p>
             */
            public Builder trustedOriginId(String trustedOriginId) {
                this.trustedOriginId = trustedOriginId;
                return this;
            }

            /**
             * <p>The trusted origin scene.</p>
             */
            public Builder trustedOriginScene(java.util.List<String> trustedOriginScene) {
                this.trustedOriginScene = trustedOriginScene;
                return this;
            }

            /**
             * <p>The update time.</p>
             * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
             * 
             * <strong>example:</strong>
             * <p>2026-08-20T08:00:00Z</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public TrustedOrigins build() {
                return new TrustedOrigins(this);
            } 

        } 

    }
}
