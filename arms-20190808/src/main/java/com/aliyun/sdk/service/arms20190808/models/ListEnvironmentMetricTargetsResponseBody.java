// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

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
 * {@link ListEnvironmentMetricTargetsResponseBody} extends {@link TeaModel}
 *
 * <p>ListEnvironmentMetricTargetsResponseBody</p>
 */
public class ListEnvironmentMetricTargetsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListEnvironmentMetricTargetsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEnvironmentMetricTargetsResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Integer code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * <p>The status code. The status code 200 indicates that the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The struct returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>16AF921B-8187-489F-9913-43C808B4****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><code>true</code></li>
         * <li><code>false</code></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListEnvironmentMetricTargetsResponseBody build() {
            return new ListEnvironmentMetricTargetsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListEnvironmentMetricTargetsResponseBody} extends {@link TeaModel}
     *
     * <p>ListEnvironmentMetricTargetsResponseBody</p>
     */
    public static class ActiveTargets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DiscoveredLabels")
        private java.util.Map<String, String> discoveredLabels;

        @com.aliyun.core.annotation.NameInMap("GlobalUrl")
        private String globalUrl;

        @com.aliyun.core.annotation.NameInMap("Health")
        private String health;

        @com.aliyun.core.annotation.NameInMap("Labels")
        private java.util.Map<String, String> labels;

        @com.aliyun.core.annotation.NameInMap("LastError")
        private String lastError;

        @com.aliyun.core.annotation.NameInMap("LastScrape")
        private String lastScrape;

        @com.aliyun.core.annotation.NameInMap("LastScrapeDuration")
        private Double lastScrapeDuration;

        @com.aliyun.core.annotation.NameInMap("LastScrapeSeries")
        private Long lastScrapeSeries;

        @com.aliyun.core.annotation.NameInMap("ScrapePool")
        private String scrapePool;

        @com.aliyun.core.annotation.NameInMap("ScrapeUrl")
        private String scrapeUrl;

        private ActiveTargets(Builder builder) {
            this.discoveredLabels = builder.discoveredLabels;
            this.globalUrl = builder.globalUrl;
            this.health = builder.health;
            this.labels = builder.labels;
            this.lastError = builder.lastError;
            this.lastScrape = builder.lastScrape;
            this.lastScrapeDuration = builder.lastScrapeDuration;
            this.lastScrapeSeries = builder.lastScrapeSeries;
            this.scrapePool = builder.scrapePool;
            this.scrapeUrl = builder.scrapeUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ActiveTargets create() {
            return builder().build();
        }

        /**
         * @return discoveredLabels
         */
        public java.util.Map<String, String> getDiscoveredLabels() {
            return this.discoveredLabels;
        }

        /**
         * @return globalUrl
         */
        public String getGlobalUrl() {
            return this.globalUrl;
        }

        /**
         * @return health
         */
        public String getHealth() {
            return this.health;
        }

        /**
         * @return labels
         */
        public java.util.Map<String, String> getLabels() {
            return this.labels;
        }

        /**
         * @return lastError
         */
        public String getLastError() {
            return this.lastError;
        }

        /**
         * @return lastScrape
         */
        public String getLastScrape() {
            return this.lastScrape;
        }

        /**
         * @return lastScrapeDuration
         */
        public Double getLastScrapeDuration() {
            return this.lastScrapeDuration;
        }

        /**
         * @return lastScrapeSeries
         */
        public Long getLastScrapeSeries() {
            return this.lastScrapeSeries;
        }

        /**
         * @return scrapePool
         */
        public String getScrapePool() {
            return this.scrapePool;
        }

        /**
         * @return scrapeUrl
         */
        public String getScrapeUrl() {
            return this.scrapeUrl;
        }

        public static final class Builder {
            private java.util.Map<String, String> discoveredLabels; 
            private String globalUrl; 
            private String health; 
            private java.util.Map<String, String> labels; 
            private String lastError; 
            private String lastScrape; 
            private Double lastScrapeDuration; 
            private Long lastScrapeSeries; 
            private String scrapePool; 
            private String scrapeUrl; 

            /**
             * <p>The tags used for service discovery.</p>
             */
            public Builder discoveredLabels(java.util.Map<String, String> discoveredLabels) {
                this.discoveredLabels = discoveredLabels;
                return this;
            }

            /**
             * <p>The URL of the target.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://xxx">http://xxx</a></p>
             */
            public Builder globalUrl(String globalUrl) {
                this.globalUrl = globalUrl;
                return this;
            }

            /**
             * <p>The health status.</p>
             * 
             * <strong>example:</strong>
             * <p>up</p>
             */
            public Builder health(String health) {
                this.health = health;
                return this;
            }

            /**
             * <p>The tags.</p>
             */
            public Builder labels(java.util.Map<String, String> labels) {
                this.labels = labels;
                return this;
            }

            /**
             * <p>The last error message.</p>
             * 
             * <strong>example:</strong>
             * <p>Get &quot;<a href="http://172.16.0.86:9104/metrics%5C">http://172.16.0.86:9104/metrics\</a>&quot;: dial tcp 172.16.0.86:9104: connect: connection refused</p>
             */
            public Builder lastError(String lastError) {
                this.lastError = lastError;
                return this;
            }

            /**
             * <p>The last collection time.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-10-12T07:15:47.306691514Z</p>
             */
            public Builder lastScrape(String lastScrape) {
                this.lastScrape = lastScrape;
                return this;
            }

            /**
             * <p>The duration of the last collection.</p>
             * 
             * <strong>example:</strong>
             * <p>0.00127593</p>
             */
            public Builder lastScrapeDuration(Double lastScrapeDuration) {
                this.lastScrapeDuration = lastScrapeDuration;
                return this;
            }

            /**
             * <p>The amount of metrics in the last collection.</p>
             * 
             * <strong>example:</strong>
             * <p>122</p>
             */
            public Builder lastScrapeSeries(Long lastScrapeSeries) {
                this.lastScrapeSeries = lastScrapeSeries;
                return this;
            }

            /**
             * <p>The name of the collection.</p>
             * 
             * <strong>example:</strong>
             * <p>arms-prom/mysql-exporter-mysql-1694429267986-sm/0&quot;</p>
             */
            public Builder scrapePool(String scrapePool) {
                this.scrapePool = scrapePool;
                return this;
            }

            /**
             * <p>The URL of the collection.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://xxxx">http://xxxx</a></p>
             */
            public Builder scrapeUrl(String scrapeUrl) {
                this.scrapeUrl = scrapeUrl;
                return this;
            }

            public ActiveTargets build() {
                return new ActiveTargets(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListEnvironmentMetricTargetsResponseBody} extends {@link TeaModel}
     *
     * <p>ListEnvironmentMetricTargetsResponseBody</p>
     */
    public static class DroppedTargets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DiscoveredLabels")
        private java.util.Map<String, String> discoveredLabels;

        @com.aliyun.core.annotation.NameInMap("GlobalUrl")
        private String globalUrl;

        @com.aliyun.core.annotation.NameInMap("Health")
        private String health;

        @com.aliyun.core.annotation.NameInMap("Labels")
        private java.util.Map<String, String> labels;

        @com.aliyun.core.annotation.NameInMap("LastError")
        private String lastError;

        @com.aliyun.core.annotation.NameInMap("LastScrape")
        private String lastScrape;

        @com.aliyun.core.annotation.NameInMap("LastScrapeDuration")
        private Double lastScrapeDuration;

        @com.aliyun.core.annotation.NameInMap("LastScrapeSeries")
        private Long lastScrapeSeries;

        @com.aliyun.core.annotation.NameInMap("ScrapePool")
        private String scrapePool;

        @com.aliyun.core.annotation.NameInMap("ScrapeUrl")
        private String scrapeUrl;

        private DroppedTargets(Builder builder) {
            this.discoveredLabels = builder.discoveredLabels;
            this.globalUrl = builder.globalUrl;
            this.health = builder.health;
            this.labels = builder.labels;
            this.lastError = builder.lastError;
            this.lastScrape = builder.lastScrape;
            this.lastScrapeDuration = builder.lastScrapeDuration;
            this.lastScrapeSeries = builder.lastScrapeSeries;
            this.scrapePool = builder.scrapePool;
            this.scrapeUrl = builder.scrapeUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DroppedTargets create() {
            return builder().build();
        }

        /**
         * @return discoveredLabels
         */
        public java.util.Map<String, String> getDiscoveredLabels() {
            return this.discoveredLabels;
        }

        /**
         * @return globalUrl
         */
        public String getGlobalUrl() {
            return this.globalUrl;
        }

        /**
         * @return health
         */
        public String getHealth() {
            return this.health;
        }

        /**
         * @return labels
         */
        public java.util.Map<String, String> getLabels() {
            return this.labels;
        }

        /**
         * @return lastError
         */
        public String getLastError() {
            return this.lastError;
        }

        /**
         * @return lastScrape
         */
        public String getLastScrape() {
            return this.lastScrape;
        }

        /**
         * @return lastScrapeDuration
         */
        public Double getLastScrapeDuration() {
            return this.lastScrapeDuration;
        }

        /**
         * @return lastScrapeSeries
         */
        public Long getLastScrapeSeries() {
            return this.lastScrapeSeries;
        }

        /**
         * @return scrapePool
         */
        public String getScrapePool() {
            return this.scrapePool;
        }

        /**
         * @return scrapeUrl
         */
        public String getScrapeUrl() {
            return this.scrapeUrl;
        }

        public static final class Builder {
            private java.util.Map<String, String> discoveredLabels; 
            private String globalUrl; 
            private String health; 
            private java.util.Map<String, String> labels; 
            private String lastError; 
            private String lastScrape; 
            private Double lastScrapeDuration; 
            private Long lastScrapeSeries; 
            private String scrapePool; 
            private String scrapeUrl; 

            /**
             * <p>The tags used for service discovery.</p>
             */
            public Builder discoveredLabels(java.util.Map<String, String> discoveredLabels) {
                this.discoveredLabels = discoveredLabels;
                return this;
            }

            /**
             * <p>The URL of the target.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://xxx">http://xxx</a></p>
             */
            public Builder globalUrl(String globalUrl) {
                this.globalUrl = globalUrl;
                return this;
            }

            /**
             * <p>The health status.</p>
             * 
             * <strong>example:</strong>
             * <p>up</p>
             */
            public Builder health(String health) {
                this.health = health;
                return this;
            }

            /**
             * <p>The tags.</p>
             */
            public Builder labels(java.util.Map<String, String> labels) {
                this.labels = labels;
                return this;
            }

            /**
             * <p>The last error message.</p>
             * 
             * <strong>example:</strong>
             * <p>Get &quot;<a href="http://172.16.0.86:9104/metrics%5C">http://172.16.0.86:9104/metrics\</a>&quot;: dial tcp 172.16.0.86:9104: connect: connection refused</p>
             */
            public Builder lastError(String lastError) {
                this.lastError = lastError;
                return this;
            }

            /**
             * <p>The last collection time.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-10-12T07:15:47.306691514Z</p>
             */
            public Builder lastScrape(String lastScrape) {
                this.lastScrape = lastScrape;
                return this;
            }

            /**
             * <p>The duration of the last collection.</p>
             * 
             * <strong>example:</strong>
             * <p>0.00127593</p>
             */
            public Builder lastScrapeDuration(Double lastScrapeDuration) {
                this.lastScrapeDuration = lastScrapeDuration;
                return this;
            }

            /**
             * <p>The amount of metrics in the last collection.</p>
             * 
             * <strong>example:</strong>
             * <p>122</p>
             */
            public Builder lastScrapeSeries(Long lastScrapeSeries) {
                this.lastScrapeSeries = lastScrapeSeries;
                return this;
            }

            /**
             * <p>The name of the collection.</p>
             * 
             * <strong>example:</strong>
             * <p>arms-prom/mysql-exporter-mysql-1694429267986-sm/0&quot;</p>
             */
            public Builder scrapePool(String scrapePool) {
                this.scrapePool = scrapePool;
                return this;
            }

            /**
             * <p>The URL of the collection.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://xxxx">http://xxxx</a></p>
             */
            public Builder scrapeUrl(String scrapeUrl) {
                this.scrapeUrl = scrapeUrl;
                return this;
            }

            public DroppedTargets build() {
                return new DroppedTargets(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListEnvironmentMetricTargetsResponseBody} extends {@link TeaModel}
     *
     * <p>ListEnvironmentMetricTargetsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActiveTargets")
        private java.util.List<ActiveTargets> activeTargets;

        @com.aliyun.core.annotation.NameInMap("DroppedTargets")
        private java.util.List<DroppedTargets> droppedTargets;

        private Data(Builder builder) {
            this.activeTargets = builder.activeTargets;
            this.droppedTargets = builder.droppedTargets;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return activeTargets
         */
        public java.util.List<ActiveTargets> getActiveTargets() {
            return this.activeTargets;
        }

        /**
         * @return droppedTargets
         */
        public java.util.List<DroppedTargets> getDroppedTargets() {
            return this.droppedTargets;
        }

        public static final class Builder {
            private java.util.List<ActiveTargets> activeTargets; 
            private java.util.List<DroppedTargets> droppedTargets; 

            /**
             * <p>The active targets.</p>
             */
            public Builder activeTargets(java.util.List<ActiveTargets> activeTargets) {
                this.activeTargets = activeTargets;
                return this;
            }

            /**
             * <p>The deleted targets.</p>
             */
            public Builder droppedTargets(java.util.List<DroppedTargets> droppedTargets) {
                this.droppedTargets = droppedTargets;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
