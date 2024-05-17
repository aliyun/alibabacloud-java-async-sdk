// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMaskingRulesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMaskingRulesResponseBody</p>
 */
public class DescribeMaskingRulesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    private String DBClusterId;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeMaskingRulesResponseBody(Builder builder) {
        this.DBClusterId = builder.DBClusterId;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMaskingRulesResponseBody create() {
        return builder().build();
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
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
        private String DBClusterId; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * The ID of the cluster.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * The result data that is returned.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The message that is returned for the request.
         * <p>
         * 
         * > If the request is successful, Successful is returned. If the request fails, an error message such as an error code is returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request is successful. Valid value:
         * <p>
         * 
         * *   **true**
         * *   **false**
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeMaskingRulesResponseBody build() {
            return new DescribeMaskingRulesResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RuleList")
        private java.util.List < String > ruleList;

        @com.aliyun.core.annotation.NameInMap("RuleVersion")
        private String ruleVersion;

        private Data(Builder builder) {
            this.ruleList = builder.ruleList;
            this.ruleVersion = builder.ruleVersion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return ruleList
         */
        public java.util.List < String > getRuleList() {
            return this.ruleList;
        }

        /**
         * @return ruleVersion
         */
        public String getRuleVersion() {
            return this.ruleVersion;
        }

        public static final class Builder {
            private java.util.List < String > ruleList; 
            private String ruleVersion; 

            /**
             * Details about the masking rules.
             */
            public Builder ruleList(java.util.List < String > ruleList) {
                this.ruleList = ruleList;
                return this;
            }

            /**
             * RuleVersion.
             */
            public Builder ruleVersion(String ruleVersion) {
                this.ruleVersion = ruleVersion;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
