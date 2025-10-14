// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link ListRoutineRoutesResponseBody} extends {@link TeaModel}
 *
 * <p>ListRoutineRoutesResponseBody</p>
 */
public class ListRoutineRoutesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Configs")
    private java.util.List<Configs> configs;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("TotalPage")
    private Integer totalPage;

    private ListRoutineRoutesResponseBody(Builder builder) {
        this.configs = builder.configs;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.totalPage = builder.totalPage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRoutineRoutesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return configs
     */
    public java.util.List<Configs> getConfigs() {
        return this.configs;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
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
     * @return totalPage
     */
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static final class Builder {
        private java.util.List<Configs> configs; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 
        private Integer totalPage; 

        private Builder() {
        } 

        private Builder(ListRoutineRoutesResponseBody model) {
            this.configs = model.configs;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
            this.totalPage = model.totalPage;
        } 

        /**
         * <p>The returned configurations.</p>
         */
        public Builder configs(java.util.List<Configs> configs) {
            this.configs = configs;
            return this;
        }

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>83</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder totalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }

        public ListRoutineRoutesResponseBody build() {
            return new ListRoutineRoutesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListRoutineRoutesResponseBody} extends {@link TeaModel}
     *
     * <p>ListRoutineRoutesResponseBody</p>
     */
    public static class Configs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bypass")
        private String bypass;

        @com.aliyun.core.annotation.NameInMap("ConfigId")
        private Long configId;

        @com.aliyun.core.annotation.NameInMap("ConfigType")
        private String configType;

        @com.aliyun.core.annotation.NameInMap("Fallback")
        private String fallback;

        @com.aliyun.core.annotation.NameInMap("Mode")
        private String mode;

        @com.aliyun.core.annotation.NameInMap("RouteEnable")
        private String routeEnable;

        @com.aliyun.core.annotation.NameInMap("RouteName")
        private String routeName;

        @com.aliyun.core.annotation.NameInMap("RoutineName")
        private String routineName;

        @com.aliyun.core.annotation.NameInMap("Rule")
        private String rule;

        @com.aliyun.core.annotation.NameInMap("Sequence")
        private Integer sequence;

        @com.aliyun.core.annotation.NameInMap("SiteId")
        private Long siteId;

        @com.aliyun.core.annotation.NameInMap("SiteName")
        private String siteName;

        @com.aliyun.core.annotation.NameInMap("SiteVersion")
        private Integer siteVersion;

        private Configs(Builder builder) {
            this.bypass = builder.bypass;
            this.configId = builder.configId;
            this.configType = builder.configType;
            this.fallback = builder.fallback;
            this.mode = builder.mode;
            this.routeEnable = builder.routeEnable;
            this.routeName = builder.routeName;
            this.routineName = builder.routineName;
            this.rule = builder.rule;
            this.sequence = builder.sequence;
            this.siteId = builder.siteId;
            this.siteName = builder.siteName;
            this.siteVersion = builder.siteVersion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Configs create() {
            return builder().build();
        }

        /**
         * @return bypass
         */
        public String getBypass() {
            return this.bypass;
        }

        /**
         * @return configId
         */
        public Long getConfigId() {
            return this.configId;
        }

        /**
         * @return configType
         */
        public String getConfigType() {
            return this.configType;
        }

        /**
         * @return fallback
         */
        public String getFallback() {
            return this.fallback;
        }

        /**
         * @return mode
         */
        public String getMode() {
            return this.mode;
        }

        /**
         * @return routeEnable
         */
        public String getRouteEnable() {
            return this.routeEnable;
        }

        /**
         * @return routeName
         */
        public String getRouteName() {
            return this.routeName;
        }

        /**
         * @return routineName
         */
        public String getRoutineName() {
            return this.routineName;
        }

        /**
         * @return rule
         */
        public String getRule() {
            return this.rule;
        }

        /**
         * @return sequence
         */
        public Integer getSequence() {
            return this.sequence;
        }

        /**
         * @return siteId
         */
        public Long getSiteId() {
            return this.siteId;
        }

        /**
         * @return siteName
         */
        public String getSiteName() {
            return this.siteName;
        }

        /**
         * @return siteVersion
         */
        public Integer getSiteVersion() {
            return this.siteVersion;
        }

        public static final class Builder {
            private String bypass; 
            private Long configId; 
            private String configType; 
            private String fallback; 
            private String mode; 
            private String routeEnable; 
            private String routeName; 
            private String routineName; 
            private String rule; 
            private Integer sequence; 
            private Long siteId; 
            private String siteName; 
            private Integer siteVersion; 

            private Builder() {
            } 

            private Builder(Configs model) {
                this.bypass = model.bypass;
                this.configId = model.configId;
                this.configType = model.configType;
                this.fallback = model.fallback;
                this.mode = model.mode;
                this.routeEnable = model.routeEnable;
                this.routeName = model.routeName;
                this.routineName = model.routineName;
                this.rule = model.rule;
                this.sequence = model.sequence;
                this.siteId = model.siteId;
                this.siteName = model.siteName;
                this.siteVersion = model.siteVersion;
            } 

            /**
             * <p>Bypass mode. Valid values:</p>
             * <ul>
             * <li>on</li>
             * <li>off</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>on</p>
             */
            public Builder bypass(String bypass) {
                this.bypass = bypass;
                return this;
            }

            /**
             * <p>The configuration ID.</p>
             * 
             * <strong>example:</strong>
             * <p>35281609698****</p>
             */
            public Builder configId(Long configId) {
                this.configId = configId;
                return this;
            }

            /**
             * <p>The configuration type to query. Valid values:</p>
             * <ul>
             * <li>global: global configurations.</li>
             * <li>rule: queries rule configurations.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>global</p>
             */
            public Builder configType(String configType) {
                this.configType = configType;
                return this;
            }

            /**
             * <p>The exception origin switch. After you turn on this switch, if a function exception occurs, such as CPU usage exceeding the upper limit, requests are sent back to the origin. Valid values:</p>
             * <ul>
             * <li>on</li>
             * <li>off</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>on</p>
             */
            public Builder fallback(String fallback) {
                this.fallback = fallback;
                return this;
            }

            /**
             * <p>The configuration mode. Valid values:</p>
             * <ul>
             * <li>simple: Simple mode.</li>
             * <li>custom: Custom mode.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>simple</p>
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * <p>The route switch. Valid values:</p>
             * <ul>
             * <li>on</li>
             * <li>off</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>on</p>
             */
            public Builder routeEnable(String routeEnable) {
                this.routeEnable = routeEnable;
                return this;
            }

            /**
             * <p>The route name.</p>
             * 
             * <strong>example:</strong>
             * <p>test_route</p>
             */
            public Builder routeName(String routeName) {
                this.routeName = routeName;
                return this;
            }

            /**
             * <p>The routine name.</p>
             * 
             * <strong>example:</strong>
             * <p>test-routine1</p>
             */
            public Builder routineName(String routineName) {
                this.routineName = routineName;
                return this;
            }

            /**
             * <p>The rule content.</p>
             * 
             * <strong>example:</strong>
             * <p>(http.host eq &quot;video.example.com&quot;)</p>
             */
            public Builder rule(String rule) {
                this.rule = rule;
                return this;
            }

            /**
             * <p>The order in which the rule is executed.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder sequence(Integer sequence) {
                this.sequence = sequence;
                return this;
            }

            /**
             * <p>The website ID.</p>
             * 
             * <strong>example:</strong>
             * <p>554889455535696</p>
             */
            public Builder siteId(Long siteId) {
                this.siteId = siteId;
                return this;
            }

            /**
             * <p>The website name.</p>
             * 
             * <strong>example:</strong>
             * <p>test.com</p>
             */
            public Builder siteName(String siteName) {
                this.siteName = siteName;
                return this;
            }

            /**
             * <p>The version number of the website configurations.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder siteVersion(Integer siteVersion) {
                this.siteVersion = siteVersion;
                return this;
            }

            public Configs build() {
                return new Configs(this);
            } 

        } 

    }
}
