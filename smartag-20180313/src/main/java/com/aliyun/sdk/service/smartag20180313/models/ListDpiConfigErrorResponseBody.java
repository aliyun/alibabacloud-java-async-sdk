// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.smartag20180313.models;

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
 * {@link ListDpiConfigErrorResponseBody} extends {@link TeaModel}
 *
 * <p>ListDpiConfigErrorResponseBody</p>
 */
public class ListDpiConfigErrorResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DpiConfigError")
    private java.util.List<DpiConfigError> dpiConfigError;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Integer total;

    private ListDpiConfigErrorResponseBody(Builder builder) {
        this.dpiConfigError = builder.dpiConfigError;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDpiConfigErrorResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dpiConfigError
     */
    public java.util.List<DpiConfigError> getDpiConfigError() {
        return this.dpiConfigError;
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
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private java.util.List<DpiConfigError> dpiConfigError; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer total; 

        private Builder() {
        } 

        private Builder(ListDpiConfigErrorResponseBody model) {
            this.dpiConfigError = model.dpiConfigError;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.total = model.total;
        } 

        /**
         * <p>The information about the configuration errors.</p>
         */
        public Builder dpiConfigError(java.util.List<DpiConfigError> dpiConfigError) {
            this.dpiConfigError = dpiConfigError;
            return this;
        }

        /**
         * <p>The maximum number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The token that was used to query the next page.</p>
         * 
         * <strong>example:</strong>
         * <p>caeba0bbb2be03f84eb48b699f0a****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>F47B5293-27B6-48EF-A9C6-E90A41449813</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public ListDpiConfigErrorResponseBody build() {
            return new ListDpiConfigErrorResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDpiConfigErrorResponseBody} extends {@link TeaModel}
     *
     * <p>ListDpiConfigErrorResponseBody</p>
     */
    public static class RuleConfigErrorList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DpiGroupIds")
        private java.util.List<String> dpiGroupIds;

        @com.aliyun.core.annotation.NameInMap("DpiSignatureIds")
        private java.util.List<String> dpiSignatureIds;

        @com.aliyun.core.annotation.NameInMap("RuleId")
        private String ruleId;

        private RuleConfigErrorList(Builder builder) {
            this.dpiGroupIds = builder.dpiGroupIds;
            this.dpiSignatureIds = builder.dpiSignatureIds;
            this.ruleId = builder.ruleId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RuleConfigErrorList create() {
            return builder().build();
        }

        /**
         * @return dpiGroupIds
         */
        public java.util.List<String> getDpiGroupIds() {
            return this.dpiGroupIds;
        }

        /**
         * @return dpiSignatureIds
         */
        public java.util.List<String> getDpiSignatureIds() {
            return this.dpiSignatureIds;
        }

        /**
         * @return ruleId
         */
        public String getRuleId() {
            return this.ruleId;
        }

        public static final class Builder {
            private java.util.List<String> dpiGroupIds; 
            private java.util.List<String> dpiSignatureIds; 
            private String ruleId; 

            private Builder() {
            } 

            private Builder(RuleConfigErrorList model) {
                this.dpiGroupIds = model.dpiGroupIds;
                this.dpiSignatureIds = model.dpiSignatureIds;
                this.ruleId = model.ruleId;
            } 

            /**
             * <p>The IDs of the application groups that have configuration errors.</p>
             * <p>You can call the <a href="https://help.aliyun.com/document_detail/196754.html">ListDpiGroups</a> operation to query application group IDs and information about the applications.</p>
             */
            public Builder dpiGroupIds(java.util.List<String> dpiGroupIds) {
                this.dpiGroupIds = dpiGroupIds;
                return this;
            }

            /**
             * <p>The IDs of applications that have configuration errors.</p>
             * <p>You can call the <a href="https://help.aliyun.com/document_detail/196630.html">ListDpiSignatures</a> operation to query application IDs and information about the applications.</p>
             */
            public Builder dpiSignatureIds(java.util.List<String> dpiSignatureIds) {
                this.dpiSignatureIds = dpiSignatureIds;
                return this;
            }

            /**
             * <p>The IDs of rules that are applied to applications with configuration errors.</p>
             * <ul>
             * <li>If you make the request to query configuration errors of ACLs, the IDs of ACL rules that have configuration errors are returned.</li>
             * <li>If you make the request to query configuration errors of QoS polices, the IDs of the 5-tuples in the QoS polices that have configuration errors are returned.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>qospy-axud4s62gz632b****</p>
             */
            public Builder ruleId(String ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            public RuleConfigErrorList build() {
                return new RuleConfigErrorList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDpiConfigErrorResponseBody} extends {@link TeaModel}
     *
     * <p>ListDpiConfigErrorResponseBody</p>
     */
    public static class DpiConfigError extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorType")
        private String errorType;

        @com.aliyun.core.annotation.NameInMap("RuleConfigErrorList")
        private java.util.List<RuleConfigErrorList> ruleConfigErrorList;

        @com.aliyun.core.annotation.NameInMap("SN")
        private String sn;

        @com.aliyun.core.annotation.NameInMap("SmartAGId")
        private String smartAGId;

        private DpiConfigError(Builder builder) {
            this.errorType = builder.errorType;
            this.ruleConfigErrorList = builder.ruleConfigErrorList;
            this.sn = builder.sn;
            this.smartAGId = builder.smartAGId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DpiConfigError create() {
            return builder().build();
        }

        /**
         * @return errorType
         */
        public String getErrorType() {
            return this.errorType;
        }

        /**
         * @return ruleConfigErrorList
         */
        public java.util.List<RuleConfigErrorList> getRuleConfigErrorList() {
            return this.ruleConfigErrorList;
        }

        /**
         * @return sn
         */
        public String getSn() {
            return this.sn;
        }

        /**
         * @return smartAGId
         */
        public String getSmartAGId() {
            return this.smartAGId;
        }

        public static final class Builder {
            private String errorType; 
            private java.util.List<RuleConfigErrorList> ruleConfigErrorList; 
            private String sn; 
            private String smartAGId; 

            private Builder() {
            } 

            private Builder(DpiConfigError model) {
                this.errorType = model.errorType;
                this.ruleConfigErrorList = model.ruleConfigErrorList;
                this.sn = model.sn;
                this.smartAGId = model.smartAGId;
            } 

            /**
             * <p>The type of the configuration error. Valid values:</p>
             * <ul>
             * <li><strong>DeviceNotSupported</strong>: The SAG instance does not support the DPI feature.</li>
             * <li><strong>VersionNotSupported</strong>: The version of the DPI feature is outdated.</li>
             * <li><strong>NotEnable</strong>: The DPI feature is disabled on the SAG instance.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>DeviceNotSupported</p>
             */
            public Builder errorType(String errorType) {
                this.errorType = errorType;
                return this;
            }

            /**
             * <p>The information about the configuration errors.</p>
             */
            public Builder ruleConfigErrorList(java.util.List<RuleConfigErrorList> ruleConfigErrorList) {
                this.ruleConfigErrorList = ruleConfigErrorList;
                return this;
            }

            /**
             * <p>The serial number of the SAG instance.</p>
             * 
             * <strong>example:</strong>
             * <p>sag-2160808****</p>
             */
            public Builder sn(String sn) {
                this.sn = sn;
                return this;
            }

            /**
             * <p>The ID of the SAG instance.</p>
             * 
             * <strong>example:</strong>
             * <p>sag-1e8sgws6b133b8****</p>
             */
            public Builder smartAGId(String smartAGId) {
                this.smartAGId = smartAGId;
                return this;
            }

            public DpiConfigError build() {
                return new DpiConfigError(this);
            } 

        } 

    }
}
