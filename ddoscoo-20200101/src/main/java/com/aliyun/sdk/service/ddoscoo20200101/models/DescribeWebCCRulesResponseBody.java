// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeWebCCRulesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeWebCCRulesResponseBody</p>
 */
public class DescribeWebCCRulesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Long totalCount;

    @NameInMap("WebCCRules")
    private java.util.List < WebCCRules> webCCRules;

    private DescribeWebCCRulesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.webCCRules = builder.webCCRules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeWebCCRulesResponseBody create() {
        return builder().build();
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
    public Long getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return webCCRules
     */
    public java.util.List < WebCCRules> getWebCCRules() {
        return this.webCCRules;
    }

    public static final class Builder {
        private String requestId; 
        private Long totalCount; 
        private java.util.List < WebCCRules> webCCRules; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of returned custom frequency control rules.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * An array that consists of the details of the custom frequency control rule.
         */
        public Builder webCCRules(java.util.List < WebCCRules> webCCRules) {
            this.webCCRules = webCCRules;
            return this;
        }

        public DescribeWebCCRulesResponseBody build() {
            return new DescribeWebCCRulesResponseBody(this);
        } 

    } 

    public static class WebCCRules extends TeaModel {
        @NameInMap("Act")
        private String act;

        @NameInMap("Count")
        private Integer count;

        @NameInMap("Interval")
        private Integer interval;

        @NameInMap("Mode")
        private String mode;

        @NameInMap("Name")
        private String name;

        @NameInMap("Ttl")
        private Integer ttl;

        @NameInMap("Uri")
        private String uri;

        private WebCCRules(Builder builder) {
            this.act = builder.act;
            this.count = builder.count;
            this.interval = builder.interval;
            this.mode = builder.mode;
            this.name = builder.name;
            this.ttl = builder.ttl;
            this.uri = builder.uri;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WebCCRules create() {
            return builder().build();
        }

        /**
         * @return act
         */
        public String getAct() {
            return this.act;
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return interval
         */
        public Integer getInterval() {
            return this.interval;
        }

        /**
         * @return mode
         */
        public String getMode() {
            return this.mode;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return ttl
         */
        public Integer getTtl() {
            return this.ttl;
        }

        /**
         * @return uri
         */
        public String getUri() {
            return this.uri;
        }

        public static final class Builder {
            private String act; 
            private Integer count; 
            private Integer interval; 
            private String mode; 
            private String name; 
            private Integer ttl; 
            private String uri; 

            /**
             * The blocking type. Valid values:
             * <p>
             * 
             * *   **close**: blocks requests.
             * *   **captcha**: enables Completely Automated Public Turing test to tell Computers and Humans Apart (CAPTCHA) verification.
             */
            public Builder act(String act) {
                this.act = act;
                return this;
            }

            /**
             * The number of requests that are allowed from an individual IP address. Valid values: **2** to **2000**.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * The check intervals. Valid values: **5** to **10800**. Unit: seconds.
             */
            public Builder interval(Integer interval) {
                this.interval = interval;
                return this;
            }

            /**
             * The match mode. Valid values:
             * <p>
             * 
             * *   **prefix**: prefix match
             * *   **match**: exact match
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * The name of the rule.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The blocking duration. Valid values: **1** to **1440**. Unit: minutes.
             */
            public Builder ttl(Integer ttl) {
                this.ttl = ttl;
                return this;
            }

            /**
             * The check path.
             */
            public Builder uri(String uri) {
                this.uri = uri;
                return this;
            }

            public WebCCRules build() {
                return new WebCCRules(this);
            } 

        } 

    }
}
