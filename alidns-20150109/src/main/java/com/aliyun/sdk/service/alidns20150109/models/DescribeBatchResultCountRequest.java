// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBatchResultCountRequest} extends {@link RequestModel}
 *
 * <p>DescribeBatchResultCountRequest</p>
 */
public class DescribeBatchResultCountRequest extends Request {
    @Query
    @NameInMap("BatchType")
    private String batchType;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("TaskId")
    private Long taskId;

    private DescribeBatchResultCountRequest(Builder builder) {
        super(builder);
        this.batchType = builder.batchType;
        this.lang = builder.lang;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBatchResultCountRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return batchType
     */
    public String getBatchType() {
        return this.batchType;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return taskId
     */
    public Long getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<DescribeBatchResultCountRequest, Builder> {
        private String batchType; 
        private String lang; 
        private Long taskId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeBatchResultCountRequest request) {
            super(request);
            this.batchType = request.batchType;
            this.lang = request.lang;
            this.taskId = request.taskId;
        } 

        /**
         * The type of the batch operation. Valid values:
         * <p>
         * 
         * *   **DOMAIN_ADD**: adds domain names in batches.
         * *   **DOMAIN_DEL**: deletes domain names in batches.
         * *   **RR_ADD**: adds DNS records in batches.
         * *   **RR_DEL**: deletes DNS records in batches.
         */
        public Builder batchType(String batchType) {
            this.putQueryParameter("BatchType", batchType);
            this.batchType = batchType;
            return this;
        }

        /**
         * The language type.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The ID of the task.
         * <p>
         * 
         * If you specify TaskId, the execution result of the specified task is returned. If you do not specify TaskId, the execution result of the last task is returned.
         */
        public Builder taskId(Long taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public DescribeBatchResultCountRequest build() {
            return new DescribeBatchResultCountRequest(this);
        } 

    } 

}
