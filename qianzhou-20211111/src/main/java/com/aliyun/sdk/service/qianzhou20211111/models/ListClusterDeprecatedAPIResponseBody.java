// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qianzhou20211111.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListClusterDeprecatedAPIResponseBody} extends {@link TeaModel}
 *
 * <p>ListClusterDeprecatedAPIResponseBody</p>
 */
public class ListClusterDeprecatedAPIResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("datas")
    private Datas datas;

    @com.aliyun.core.annotation.NameInMap("msg")
    private String msg;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private ListClusterDeprecatedAPIResponseBody(Builder builder) {
        this.code = builder.code;
        this.datas = builder.datas;
        this.msg = builder.msg;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListClusterDeprecatedAPIResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return datas
     */
    public Datas getDatas() {
        return this.datas;
    }

    /**
     * @return msg
     */
    public String getMsg() {
        return this.msg;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer code; 
        private Datas datas; 
        private String msg; 
        private String requestId; 

        /**
         * code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * datas.
         */
        public Builder datas(Datas datas) {
            this.datas = datas;
            return this;
        }

        /**
         * msg.
         */
        public Builder msg(String msg) {
            this.msg = msg;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListClusterDeprecatedAPIResponseBody build() {
            return new ListClusterDeprecatedAPIResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListClusterDeprecatedAPIResponseBody} extends {@link TeaModel}
     *
     * <p>ListClusterDeprecatedAPIResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cluster_id")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("current_version")
        private String currentVersion;

        @com.aliyun.core.annotation.NameInMap("deprecated_k8s_version")
        private String deprecatedK8sVersion;

        @com.aliyun.core.annotation.NameInMap("ds")
        private String ds;

        @com.aliyun.core.annotation.NameInMap("label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("last_time")
        private String lastTime;

        @com.aliyun.core.annotation.NameInMap("request_uri")
        private String requestUri;

        @com.aliyun.core.annotation.NameInMap("source_ips")
        private String sourceIps;

        @com.aliyun.core.annotation.NameInMap("target_version")
        private String targetVersion;

        @com.aliyun.core.annotation.NameInMap("user_agent")
        private String userAgent;

        private Data(Builder builder) {
            this.clusterId = builder.clusterId;
            this.content = builder.content;
            this.count = builder.count;
            this.currentVersion = builder.currentVersion;
            this.deprecatedK8sVersion = builder.deprecatedK8sVersion;
            this.ds = builder.ds;
            this.label = builder.label;
            this.lastTime = builder.lastTime;
            this.requestUri = builder.requestUri;
            this.sourceIps = builder.sourceIps;
            this.targetVersion = builder.targetVersion;
            this.userAgent = builder.userAgent;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return currentVersion
         */
        public String getCurrentVersion() {
            return this.currentVersion;
        }

        /**
         * @return deprecatedK8sVersion
         */
        public String getDeprecatedK8sVersion() {
            return this.deprecatedK8sVersion;
        }

        /**
         * @return ds
         */
        public String getDs() {
            return this.ds;
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * @return lastTime
         */
        public String getLastTime() {
            return this.lastTime;
        }

        /**
         * @return requestUri
         */
        public String getRequestUri() {
            return this.requestUri;
        }

        /**
         * @return sourceIps
         */
        public String getSourceIps() {
            return this.sourceIps;
        }

        /**
         * @return targetVersion
         */
        public String getTargetVersion() {
            return this.targetVersion;
        }

        /**
         * @return userAgent
         */
        public String getUserAgent() {
            return this.userAgent;
        }

        public static final class Builder {
            private String clusterId; 
            private String content; 
            private Integer count; 
            private String currentVersion; 
            private String deprecatedK8sVersion; 
            private String ds; 
            private String label; 
            private String lastTime; 
            private String requestUri; 
            private String sourceIps; 
            private String targetVersion; 
            private String userAgent; 

            /**
             * cluster_id.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * count.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * current_version.
             */
            public Builder currentVersion(String currentVersion) {
                this.currentVersion = currentVersion;
                return this;
            }

            /**
             * deprecated_k8s_version.
             */
            public Builder deprecatedK8sVersion(String deprecatedK8sVersion) {
                this.deprecatedK8sVersion = deprecatedK8sVersion;
                return this;
            }

            /**
             * ds.
             */
            public Builder ds(String ds) {
                this.ds = ds;
                return this;
            }

            /**
             * label.
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * last_time.
             */
            public Builder lastTime(String lastTime) {
                this.lastTime = lastTime;
                return this;
            }

            /**
             * request_uri.
             */
            public Builder requestUri(String requestUri) {
                this.requestUri = requestUri;
                return this;
            }

            /**
             * source_ips.
             */
            public Builder sourceIps(String sourceIps) {
                this.sourceIps = sourceIps;
                return this;
            }

            /**
             * target_version.
             */
            public Builder targetVersion(String targetVersion) {
                this.targetVersion = targetVersion;
                return this;
            }

            /**
             * user_agent.
             */
            public Builder userAgent(String userAgent) {
                this.userAgent = userAgent;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListClusterDeprecatedAPIResponseBody} extends {@link TeaModel}
     *
     * <p>ListClusterDeprecatedAPIResponseBody</p>
     */
    public static class Datas extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("current")
        private Integer current;

        @com.aliyun.core.annotation.NameInMap("data")
        private java.util.List < Data> data;

        @com.aliyun.core.annotation.NameInMap("pageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("total")
        private Integer total;

        private Datas(Builder builder) {
            this.current = builder.current;
            this.data = builder.data;
            this.pageSize = builder.pageSize;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Datas create() {
            return builder().build();
        }

        /**
         * @return current
         */
        public Integer getCurrent() {
            return this.current;
        }

        /**
         * @return data
         */
        public java.util.List < Data> getData() {
            return this.data;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        public static final class Builder {
            private Integer current; 
            private java.util.List < Data> data; 
            private Integer pageSize; 
            private Integer total; 

            /**
             * current.
             */
            public Builder current(Integer current) {
                this.current = current;
                return this;
            }

            /**
             * data.
             */
            public Builder data(java.util.List < Data> data) {
                this.data = data;
                return this;
            }

            /**
             * pageSize.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * total.
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            public Datas build() {
                return new Datas(this);
            } 

        } 

    }
}
