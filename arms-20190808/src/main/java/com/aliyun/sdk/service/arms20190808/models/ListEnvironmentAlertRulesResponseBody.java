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
 * {@link ListEnvironmentAlertRulesResponseBody} extends {@link TeaModel}
 *
 * <p>ListEnvironmentAlertRulesResponseBody</p>
 */
public class ListEnvironmentAlertRulesResponseBody extends TeaModel {
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

    private ListEnvironmentAlertRulesResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEnvironmentAlertRulesResponseBody create() {
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
         * <p>The status code. The status code 200 indicates that the request was successful. Other status codes indicate that the request failed.</p>
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
         * <p>message</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4C518054-852F-4023-ABC1-4AF95FF7****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListEnvironmentAlertRulesResponseBody build() {
            return new ListEnvironmentAlertRulesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListEnvironmentAlertRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListEnvironmentAlertRulesResponseBody</p>
     */
    public static class Rules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlertId")
        private Long alertId;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private Rules(Builder builder) {
            this.alertId = builder.alertId;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Rules create() {
            return builder().build();
        }

        /**
         * @return alertId
         */
        public Long getAlertId() {
            return this.alertId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private Long alertId; 
            private String name; 

            /**
             * <p>The ID of the alert rule.</p>
             * 
             * <strong>example:</strong>
             * <p>9502571</p>
             */
            public Builder alertId(Long alertId) {
                this.alertId = alertId;
                return this;
            }

            /**
             * <p>The name of the alert rule.</p>
             * 
             * <strong>example:</strong>
             * <p>mysql-CS-MySQLInnoDBLogWaits_lu</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Rules build() {
                return new Rules(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListEnvironmentAlertRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListEnvironmentAlertRulesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Groups")
        private java.util.List<String> groups;

        @com.aliyun.core.annotation.NameInMap("Rules")
        private java.util.List<Rules> rules;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Long total;

        private Data(Builder builder) {
            this.groups = builder.groups;
            this.rules = builder.rules;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return groups
         */
        public java.util.List<String> getGroups() {
            return this.groups;
        }

        /**
         * @return rules
         */
        public java.util.List<Rules> getRules() {
            return this.rules;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        public static final class Builder {
            private java.util.List<String> groups; 
            private java.util.List<Rules> rules; 
            private Long total; 

            /**
             * <p>The queried alert groups.</p>
             */
            public Builder groups(java.util.List<String> groups) {
                this.groups = groups;
                return this;
            }

            /**
             * <p>The queried rules.</p>
             */
            public Builder rules(java.util.List<Rules> rules) {
                this.rules = rules;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>26</p>
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
