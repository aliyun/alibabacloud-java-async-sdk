// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link ListContainerDefenseRuleClustersResponseBody} extends {@link TeaModel}
 *
 * <p>ListContainerDefenseRuleClustersResponseBody</p>
 */
public class ListContainerDefenseRuleClustersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ClusterList")
    private java.util.List<ClusterList> clusterList;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Count")
    private Integer count;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListContainerDefenseRuleClustersResponseBody(Builder builder) {
        this.clusterList = builder.clusterList;
        this.code = builder.code;
        this.count = builder.count;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListContainerDefenseRuleClustersResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterList
     */
    public java.util.List<ClusterList> getClusterList() {
        return this.clusterList;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
        private java.util.List<ClusterList> clusterList; 
        private String code; 
        private Integer count; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListContainerDefenseRuleClustersResponseBody model) {
            this.clusterList = model.clusterList;
            this.code = model.code;
            this.count = model.count;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The clusters.</p>
         */
        public Builder clusterList(java.util.List<ClusterList> clusterList) {
            this.clusterList = clusterList;
            return this;
        }

        /**
         * <p>The response code. The status code <strong>200</strong> indicates that the request was successful. Other status codes indicate that the request failed. You can identify the cause of the failure based on the status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * <p>The HTTP status code that is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1F995515-CAF3-5F84-8D82-C9F706AD5070</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListContainerDefenseRuleClustersResponseBody build() {
            return new ListContainerDefenseRuleClustersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListContainerDefenseRuleClustersResponseBody} extends {@link TeaModel}
     *
     * <p>ListContainerDefenseRuleClustersResponseBody</p>
     */
    public static class ClusterList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllNamespace")
        private Integer allNamespace;

        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("Namespaces")
        private java.util.List<String> namespaces;

        @com.aliyun.core.annotation.NameInMap("RuleId")
        private Long ruleId;

        private ClusterList(Builder builder) {
            this.allNamespace = builder.allNamespace;
            this.clusterId = builder.clusterId;
            this.namespaces = builder.namespaces;
            this.ruleId = builder.ruleId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClusterList create() {
            return builder().build();
        }

        /**
         * @return allNamespace
         */
        public Integer getAllNamespace() {
            return this.allNamespace;
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return namespaces
         */
        public java.util.List<String> getNamespaces() {
            return this.namespaces;
        }

        /**
         * @return ruleId
         */
        public Long getRuleId() {
            return this.ruleId;
        }

        public static final class Builder {
            private Integer allNamespace; 
            private String clusterId; 
            private java.util.List<String> namespaces; 
            private Long ruleId; 

            private Builder() {
            } 

            private Builder(ClusterList model) {
                this.allNamespace = model.allNamespace;
                this.clusterId = model.clusterId;
                this.namespaces = model.namespaces;
                this.ruleId = model.ruleId;
            } 

            /**
             * <p>Indicates whether all namespaces are included. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: no</li>
             * <li><strong>1</strong>: yes</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder allNamespace(Integer allNamespace) {
                this.allNamespace = allNamespace;
                return this;
            }

            /**
             * <p>The ID of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>cfeb7a9f99ce740e98c5595d0fe37****</p>
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * <p>The namespaces.</p>
             */
            public Builder namespaces(java.util.List<String> namespaces) {
                this.namespaces = namespaces;
                return this;
            }

            /**
             * <p>The ID of the rule.</p>
             * <blockquote>
             * <p> You can call the <a href="https://help.aliyun.com/document_detail/2590599.html">ListInterceptionRulePage</a> operation to query the IDs of rules.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>403178</p>
             */
            public Builder ruleId(Long ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            public ClusterList build() {
                return new ClusterList(this);
            } 

        } 

    }
}
