// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
 * {@link DescribeSparkSQLDiagnosisAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSparkSQLDiagnosisAttributeResponseBody</p>
 */
public class DescribeSparkSQLDiagnosisAttributeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    @com.aliyun.core.annotation.NameInMap("DiagnosisInfos")
    private java.util.List<Adb4MysqlSparkDiagnosisInfo> diagnosisInfos;

    @com.aliyun.core.annotation.NameInMap("ElapsedTime")
    private Long elapsedTime;

    @com.aliyun.core.annotation.NameInMap("InnerQueryId")
    private Long innerQueryId;

    @com.aliyun.core.annotation.NameInMap("OperatorListSortedByMetrics")
    private OperatorListSortedByMetrics operatorListSortedByMetrics;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Root")
    private OperatorNode root;

    private DescribeSparkSQLDiagnosisAttributeResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.appId = builder.appId;
        this.diagnosisInfos = builder.diagnosisInfos;
        this.elapsedTime = builder.elapsedTime;
        this.innerQueryId = builder.innerQueryId;
        this.operatorListSortedByMetrics = builder.operatorListSortedByMetrics;
        this.requestId = builder.requestId;
        this.root = builder.root;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSparkSQLDiagnosisAttributeResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return diagnosisInfos
     */
    public java.util.List<Adb4MysqlSparkDiagnosisInfo> getDiagnosisInfos() {
        return this.diagnosisInfos;
    }

    /**
     * @return elapsedTime
     */
    public Long getElapsedTime() {
        return this.elapsedTime;
    }

    /**
     * @return innerQueryId
     */
    public Long getInnerQueryId() {
        return this.innerQueryId;
    }

    /**
     * @return operatorListSortedByMetrics
     */
    public OperatorListSortedByMetrics getOperatorListSortedByMetrics() {
        return this.operatorListSortedByMetrics;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return root
     */
    public OperatorNode getRoot() {
        return this.root;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private String appId; 
        private java.util.List<Adb4MysqlSparkDiagnosisInfo> diagnosisInfos; 
        private Long elapsedTime; 
        private Long innerQueryId; 
        private OperatorListSortedByMetrics operatorListSortedByMetrics; 
        private String requestId; 
        private OperatorNode root; 

        private Builder() {
        } 

        private Builder(DescribeSparkSQLDiagnosisAttributeResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.appId = model.appId;
            this.diagnosisInfos = model.diagnosisInfos;
            this.elapsedTime = model.elapsedTime;
            this.innerQueryId = model.innerQueryId;
            this.operatorListSortedByMetrics = model.operatorListSortedByMetrics;
            this.requestId = model.requestId;
            this.root = model.root;
        } 

        /**
         * <p>The information about the request denial.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>The application ID.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/612475.html">ListSparkApps</a> operation to query a list of Spark application IDs.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>s202411071444hzdvk486d9d2001****</p>
         */
        public Builder appId(String appId) {
            this.appId = appId;
            return this;
        }

        /**
         * <p>The queried diagnostic information.</p>
         */
        public Builder diagnosisInfos(java.util.List<Adb4MysqlSparkDiagnosisInfo> diagnosisInfos) {
            this.diagnosisInfos = diagnosisInfos;
            return this;
        }

        /**
         * <p>The execution duration of the query. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder elapsedTime(Long elapsedTime) {
            this.elapsedTime = elapsedTime;
            return this;
        }

        /**
         * <p>The ID of the query executed within the Spark application.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder innerQueryId(Long innerQueryId) {
            this.innerQueryId = innerQueryId;
            return this;
        }

        /**
         * <p>The operators sorted by metrics.</p>
         */
        public Builder operatorListSortedByMetrics(OperatorListSortedByMetrics operatorListSortedByMetrics) {
            this.operatorListSortedByMetrics = operatorListSortedByMetrics;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1AD222E9-E606-4A42-BF6D-8A4442913CEF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The Spark execution plan tree.</p>
         */
        public Builder root(OperatorNode root) {
            this.root = root;
            return this;
        }

        public DescribeSparkSQLDiagnosisAttributeResponseBody build() {
            return new DescribeSparkSQLDiagnosisAttributeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSparkSQLDiagnosisAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSparkSQLDiagnosisAttributeResponseBody</p>
     */
    public static class OperatorListSortedByMetrics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OperatorListSortedByExclusiveTime")
        private java.util.List<SparkOperatorInfo> operatorListSortedByExclusiveTime;

        @com.aliyun.core.annotation.NameInMap("OperatorListSortedByMaxMemory")
        private java.util.List<SparkOperatorInfo> operatorListSortedByMaxMemory;

        private OperatorListSortedByMetrics(Builder builder) {
            this.operatorListSortedByExclusiveTime = builder.operatorListSortedByExclusiveTime;
            this.operatorListSortedByMaxMemory = builder.operatorListSortedByMaxMemory;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OperatorListSortedByMetrics create() {
            return builder().build();
        }

        /**
         * @return operatorListSortedByExclusiveTime
         */
        public java.util.List<SparkOperatorInfo> getOperatorListSortedByExclusiveTime() {
            return this.operatorListSortedByExclusiveTime;
        }

        /**
         * @return operatorListSortedByMaxMemory
         */
        public java.util.List<SparkOperatorInfo> getOperatorListSortedByMaxMemory() {
            return this.operatorListSortedByMaxMemory;
        }

        public static final class Builder {
            private java.util.List<SparkOperatorInfo> operatorListSortedByExclusiveTime; 
            private java.util.List<SparkOperatorInfo> operatorListSortedByMaxMemory; 

            private Builder() {
            } 

            private Builder(OperatorListSortedByMetrics model) {
                this.operatorListSortedByExclusiveTime = model.operatorListSortedByExclusiveTime;
                this.operatorListSortedByMaxMemory = model.operatorListSortedByMaxMemory;
            } 

            /**
             * <p>The operators sorted by the execution duration.</p>
             */
            public Builder operatorListSortedByExclusiveTime(java.util.List<SparkOperatorInfo> operatorListSortedByExclusiveTime) {
                this.operatorListSortedByExclusiveTime = operatorListSortedByExclusiveTime;
                return this;
            }

            /**
             * <p>The operators sorted by the maximum memory used.</p>
             */
            public Builder operatorListSortedByMaxMemory(java.util.List<SparkOperatorInfo> operatorListSortedByMaxMemory) {
                this.operatorListSortedByMaxMemory = operatorListSortedByMaxMemory;
                return this;
            }

            public OperatorListSortedByMetrics build() {
                return new OperatorListSortedByMetrics(this);
            } 

        } 

    }
}
