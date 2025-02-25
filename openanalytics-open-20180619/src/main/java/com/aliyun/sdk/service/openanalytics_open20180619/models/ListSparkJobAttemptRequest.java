// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.openanalytics_open20180619.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListSparkJobAttemptRequest} extends {@link RequestModel}
 *
 * <p>ListSparkJobAttemptRequest</p>
 */
public class ListSparkJobAttemptRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Condition")
    private java.util.Map < String, ? > condition;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String jobId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 1000, minimum = 1)
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 100, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VcName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vcName;

    private ListSparkJobAttemptRequest(Builder builder) {
        super(builder);
        this.condition = builder.condition;
        this.jobId = builder.jobId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.vcName = builder.vcName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSparkJobAttemptRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return condition
     */
    public java.util.Map < String, ? > getCondition() {
        return this.condition;
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return vcName
     */
    public String getVcName() {
        return this.vcName;
    }

    public static final class Builder extends Request.Builder<ListSparkJobAttemptRequest, Builder> {
        private java.util.Map < String, ? > condition; 
        private String jobId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String vcName; 

        private Builder() {
            super();
        } 

        private Builder(ListSparkJobAttemptRequest request) {
            super(request);
            this.condition = request.condition;
            this.jobId = request.jobId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.vcName = request.vcName;
        } 

        /**
         * Condition.
         */
        public Builder condition(java.util.Map < String, ? > condition) {
            String conditionShrink = shrink(condition, "Condition", "json");
            this.putQueryParameter("Condition", conditionShrink);
            this.condition = condition;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>j202105272322hangzhou5d64f1560000128</p>
         */
        public Builder jobId(String jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>release-test</p>
         */
        public Builder vcName(String vcName) {
            this.putQueryParameter("VcName", vcName);
            this.vcName = vcName;
            return this;
        }

        @Override
        public ListSparkJobAttemptRequest build() {
            return new ListSparkJobAttemptRequest(this);
        } 

    } 

}
