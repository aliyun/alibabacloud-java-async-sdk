// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20171228.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLayer7CCRulesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLayer7CCRulesResponseBody</p>
 */
public class DescribeLayer7CCRulesResponseBody extends TeaModel {
    @NameInMap("Layer7CCRules")
    private java.util.List < Layer7CCRules> layer7CCRules;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Total")
    private Long total;

    private DescribeLayer7CCRulesResponseBody(Builder builder) {
        this.layer7CCRules = builder.layer7CCRules;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLayer7CCRulesResponseBody create() {
        return builder().build();
    }

    /**
     * @return layer7CCRules
     */
    public java.util.List < Layer7CCRules> getLayer7CCRules() {
        return this.layer7CCRules;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    public static final class Builder {
        private java.util.List < Layer7CCRules> layer7CCRules; 
        private String requestId; 
        private Long total; 

        /**
         * Layer7CCRules.
         */
        public Builder layer7CCRules(java.util.List < Layer7CCRules> layer7CCRules) {
            this.layer7CCRules = layer7CCRules;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Total.
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public DescribeLayer7CCRulesResponseBody build() {
            return new DescribeLayer7CCRulesResponseBody(this);
        } 

    } 

    public static class Layer7CCRules extends TeaModel {
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

        private Layer7CCRules(Builder builder) {
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

        public static Layer7CCRules create() {
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
             * Act.
             */
            public Builder act(String act) {
                this.act = act;
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
             * Interval.
             */
            public Builder interval(Integer interval) {
                this.interval = interval;
                return this;
            }

            /**
             * Mode.
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Ttl.
             */
            public Builder ttl(Integer ttl) {
                this.ttl = ttl;
                return this;
            }

            /**
             * Uri.
             */
            public Builder uri(String uri) {
                this.uri = uri;
                return this;
            }

            public Layer7CCRules build() {
                return new Layer7CCRules(this);
            } 

        } 

    }
}
