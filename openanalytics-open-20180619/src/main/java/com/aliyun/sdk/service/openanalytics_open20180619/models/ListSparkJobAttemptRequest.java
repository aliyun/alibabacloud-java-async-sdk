// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.openanalytics_open20180619.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSparkJobAttemptRequest} extends {@link RequestModel}
 *
 * <p>ListSparkJobAttemptRequest</p>
 */
public class ListSparkJobAttemptRequest extends Request {
    @Query
    @NameInMap("Condition")
    private java.util.Map < String, ? > condition;

    @Query
    @NameInMap("JobId")
    @Validation(required = true)
    private String jobId;

    @Query
    @NameInMap("PageNumber")
    @Validation(required = true, maximum = 1000, minimum = 1)
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true, maximum = 100, minimum = 1)
    private Integer pageSize;

    @Query
    @NameInMap("VcName")
    @Validation(required = true)
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

        private Builder(ListSparkJobAttemptRequest response) {
            super(response);
            this.condition = response.condition;
            this.jobId = response.jobId;
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
            this.vcName = response.vcName;
        } 

        /**
         * Condition.
         */
        public Builder condition(java.util.Map < String, ? > condition) {
            this.putQueryParameter("Condition", condition);
            this.condition = condition;
            return this;
        }

        /**
         * JobId.
         */
        public Builder jobId(String jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * VcName.
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
