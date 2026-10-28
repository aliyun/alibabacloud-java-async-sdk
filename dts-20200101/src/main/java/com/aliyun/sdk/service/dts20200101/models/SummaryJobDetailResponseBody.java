// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

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
 * {@link SummaryJobDetailResponseBody} extends {@link TeaModel}
 *
 * <p>SummaryJobDetailResponseBody</p>
 */
public class SummaryJobDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("JobId")
    private String jobId;

    @com.aliyun.core.annotation.NameInMap("ProgressSummaryDetails")
    private java.util.List<ProgressSummaryDetails> progressSummaryDetails;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private SummaryJobDetailResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.jobId = builder.jobId;
        this.progressSummaryDetails = builder.progressSummaryDetails;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SummaryJobDetailResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    /**
     * @return progressSummaryDetails
     */
    public java.util.List<ProgressSummaryDetails> getProgressSummaryDetails() {
        return this.progressSummaryDetails;
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
        private String code; 
        private Integer httpStatusCode; 
        private String jobId; 
        private java.util.List<ProgressSummaryDetails> progressSummaryDetails; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(SummaryJobDetailResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.jobId = model.jobId;
            this.progressSummaryDetails = model.progressSummaryDetails;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The ID of the migration or synchronization task.</p>
         * 
         * <strong>example:</strong>
         * <p>l3m1213ye7l****</p>
         */
        public Builder jobId(String jobId) {
            this.jobId = jobId;
            return this;
        }

        /**
         * <p>The returned information about the array of migrated objects.</p>
         * <blockquote>
         * <p>The array is returned in the following format: [{&quot;key&quot;:&quot;Function&quot;,&quot;state&quot;:5,&quot;totalCount&quot;:22},{&quot;key&quot;:&quot;Procedure&quot;,&quot;state&quot;:5,&quot;totalCount&quot;:26},{&quot;key&quot;:&quot;Table&quot;,&quot;state&quot;:0,&quot;totalCount&quot;:68},{&quot;key&quot;:&quot;View&quot;,&quot;state&quot;:5,&quot;totalCount&quot;:100}\].</p>
         * </blockquote>
         */
        public Builder progressSummaryDetails(java.util.List<ProgressSummaryDetails> progressSummaryDetails) {
            this.progressSummaryDetails = progressSummaryDetails;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9033138C-5AB3-5EB7-BA78-43131F19297C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The request was successful.</li>
         * <li><strong>false</strong>: The request failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public SummaryJobDetailResponseBody build() {
            return new SummaryJobDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link SummaryJobDetailResponseBody} extends {@link TeaModel}
     *
     * <p>SummaryJobDetailResponseBody</p>
     */
    public static class ProgressSummaryDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("State")
        private Integer state;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

        private ProgressSummaryDetails(Builder builder) {
            this.key = builder.key;
            this.state = builder.state;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProgressSummaryDetails create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return state
         */
        public Integer getState() {
            return this.state;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private String key; 
            private Integer state; 
            private Long totalCount; 

            private Builder() {
            } 

            private Builder(ProgressSummaryDetails model) {
                this.key = model.key;
                this.state = model.state;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The migrated object type. Valid values: <strong>Table</strong> (table), <strong>Constraint</strong> (constraint), <strong>Index</strong> (index), <strong>View</strong> (view), <strong>Materialize View</strong> (materialized view), <strong>Type</strong> (custom type), <strong>Synonym</strong> (synonym), <strong>Trigger</strong> (trigger), <strong>Function</strong> (function), <strong>Procedure</strong> (stored procedure), <strong>Package</strong> (package), <strong>Default</strong> (default value), <strong>Rule</strong> (rule), <strong>PlanGuide</strong> (execute plan), and <strong>Sequence</strong> (sequence).</p>
             * 
             * <strong>example:</strong>
             * <p>Table</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The migration status. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: finish (completed).</li>
             * <li><strong>1</strong>: catched (waiting for synchronization).</li>
             * <li><strong>2</strong>: init (initializing).</li>
             * <li><strong>3</strong>: running (synchronizing).</li>
             * <li><strong>4</strong>: warning (error).</li>
             * <li><strong>5</strong>: failed (failed).</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder state(Integer state) {
                this.state = state;
                return this;
            }

            /**
             * <p>The total number of migrated objects.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public ProgressSummaryDetails build() {
                return new ProgressSummaryDetails(this);
            } 

        } 

    }
}
