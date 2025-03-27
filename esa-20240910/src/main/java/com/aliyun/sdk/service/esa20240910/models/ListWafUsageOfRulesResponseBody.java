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
 * {@link ListWafUsageOfRulesResponseBody} extends {@link TeaModel}
 *
 * <p>ListWafUsageOfRulesResponseBody</p>
 */
public class ListWafUsageOfRulesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Sites")
    private java.util.List<Sites> sites;

    private ListWafUsageOfRulesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.sites = builder.sites;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListWafUsageOfRulesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sites
     */
    public java.util.List<Sites> getSites() {
        return this.sites;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<Sites> sites; 

        private Builder() {
        } 

        private Builder(ListWafUsageOfRulesResponseBody model) {
            this.requestId = model.requestId;
            this.sites = model.sites;
        } 

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>36af3fcc-43d0-441c-86b1-428951dc8225</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>List of site usage.</p>
         */
        public Builder sites(java.util.List<Sites> sites) {
            this.sites = sites;
            return this;
        }

        public ListWafUsageOfRulesResponseBody build() {
            return new ListWafUsageOfRulesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListWafUsageOfRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListWafUsageOfRulesResponseBody</p>
     */
    public static class Sites extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Usage")
        private Long usage;

        private Sites(Builder builder) {
            this.id = builder.id;
            this.name = builder.name;
            this.usage = builder.usage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Sites create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return usage
         */
        public Long getUsage() {
            return this.usage;
        }

        public static final class Builder {
            private Long id; 
            private String name; 
            private Long usage; 

            private Builder() {
            } 

            private Builder(Sites model) {
                this.id = model.id;
                this.name = model.name;
                this.usage = model.usage;
            } 

            /**
             * <p>Site ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Site name.</p>
             * 
             * <strong>example:</strong>
             * <p>example.com</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Usage of WAF rules/WAF rule sets.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder usage(Long usage) {
                this.usage = usage;
                return this;
            }

            public Sites build() {
                return new Sites(this);
            } 

        } 

    }
}
