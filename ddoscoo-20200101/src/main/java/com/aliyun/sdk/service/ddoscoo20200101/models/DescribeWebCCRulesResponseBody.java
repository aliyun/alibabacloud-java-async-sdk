// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeWebCCRulesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeWebCCRulesResponseBody</p>
 */
public class DescribeWebCCRulesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    @com.aliyun.core.annotation.NameInMap("WebCCRules")
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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>EAED912D-909E-45F0-AF74-AC0CCDCAE314</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of custom frequency control rules.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>The custom frequency control rule.</p>
         */
        public Builder webCCRules(java.util.List < WebCCRules> webCCRules) {
            this.webCCRules = webCCRules;
            return this;
        }

        public DescribeWebCCRulesResponseBody build() {
            return new DescribeWebCCRulesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeWebCCRulesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeWebCCRulesResponseBody</p>
     */
    public static class WebCCRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Act")
        private String act;

        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("Interval")
        private Integer interval;

        @com.aliyun.core.annotation.NameInMap("Mode")
        private String mode;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Ttl")
        private Integer ttl;

        @com.aliyun.core.annotation.NameInMap("Uri")
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
             * <p>The action triggered if the rule is matched. Valid values:</p>
             * <ul>
             * <li><strong>close</strong>: The requests that match the rule are blocked.</li>
             * <li><strong>captcha</strong>: Completely Automated Public Turing test to tell Computers and Humans Apart (CAPTCHA) verification for the requests that match the rule is implemented.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>close</p>
             */
            public Builder act(String act) {
                this.act = act;
                return this;
            }

            /**
             * <p>The number of requests that are allowed from a single IP address. Valid values: <strong>2</strong> to <strong>2000</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The check interval. Valid values: <strong>5</strong> to <strong>10800</strong>. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder interval(Integer interval) {
                this.interval = interval;
                return this;
            }

            /**
             * <p>The match mode. Valid values:</p>
             * <ul>
             * <li><strong>prefix</strong>: prefix match.</li>
             * <li><strong>match</strong>: exact match.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>prefix</p>
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * <p>The name of the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>wq</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The validity period. Valid values: <strong>1</strong> to <strong>1440</strong>. Unit: minutes.</p>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder ttl(Integer ttl) {
                this.ttl = ttl;
                return this;
            }

            /**
             * <p>The check path.</p>
             * 
             * <strong>example:</strong>
             * <p>/hello</p>
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
