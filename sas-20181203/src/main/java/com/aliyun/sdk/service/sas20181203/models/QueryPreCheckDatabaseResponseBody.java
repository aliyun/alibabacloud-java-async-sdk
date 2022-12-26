// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryPreCheckDatabaseResponseBody} extends {@link TeaModel}
 *
 * <p>QueryPreCheckDatabaseResponseBody</p>
 */
public class QueryPreCheckDatabaseResponseBody extends TeaModel {
    @NameInMap("CompletedTime")
    private Long completedTime;

    @NameInMap("CreatedTime")
    private Long createdTime;

    @NameInMap("Description")
    private String description;

    @NameInMap("Progress")
    private Integer progress;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private String result;

    @NameInMap("UpdatedTime")
    private Long updatedTime;

    private QueryPreCheckDatabaseResponseBody(Builder builder) {
        this.completedTime = builder.completedTime;
        this.createdTime = builder.createdTime;
        this.description = builder.description;
        this.progress = builder.progress;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.updatedTime = builder.updatedTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryPreCheckDatabaseResponseBody create() {
        return builder().build();
    }

    /**
     * @return completedTime
     */
    public Long getCompletedTime() {
        return this.completedTime;
    }

    /**
     * @return createdTime
     */
    public Long getCreatedTime() {
        return this.createdTime;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return progress
     */
    public Integer getProgress() {
        return this.progress;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public String getResult() {
        return this.result;
    }

    /**
     * @return updatedTime
     */
    public Long getUpdatedTime() {
        return this.updatedTime;
    }

    public static final class Builder {
        private Long completedTime; 
        private Long createdTime; 
        private String description; 
        private Integer progress; 
        private String requestId; 
        private String result; 
        private Long updatedTime; 

        /**
         * CompletedTime.
         */
        public Builder completedTime(Long completedTime) {
            this.completedTime = completedTime;
            return this;
        }

        /**
         * CreatedTime.
         */
        public Builder createdTime(Long createdTime) {
            this.createdTime = createdTime;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * Progress.
         */
        public Builder progress(Integer progress) {
            this.progress = progress;
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
         * Result.
         */
        public Builder result(String result) {
            this.result = result;
            return this;
        }

        /**
         * UpdatedTime.
         */
        public Builder updatedTime(Long updatedTime) {
            this.updatedTime = updatedTime;
            return this;
        }

        public QueryPreCheckDatabaseResponseBody build() {
            return new QueryPreCheckDatabaseResponseBody(this);
        } 

    } 

}
