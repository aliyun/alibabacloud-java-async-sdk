// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeBatchResultCountRequest} extends {@link RequestModel}
 *
 * <p>DescribeBatchResultCountRequest</p>
 */
public class DescribeBatchResultCountRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BatchType")
    private String batchType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskId")
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
         * <p>The type of the batch operation. Valid values:</p>
         * <ul>
         * <li><strong>DOMAIN_ADD</strong>: adds domain names in batches.</li>
         * <li><strong>DOMAIN_DEL</strong>: deletes domain names in batches.</li>
         * <li><strong>RR_ADD</strong>: adds Domain Name System (DNS) records in batches.</li>
         * <li><strong>RR_DEL</strong>: deletes DNS records in batches.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DOMAIN_ADD</p>
         */
        public Builder batchType(String batchType) {
            this.putQueryParameter("BatchType", batchType);
            this.batchType = batchType;
            return this;
        }

        /**
         * <p>The language.</p>
         * 
         * <strong>example:</strong>
         * <p>en</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The task ID.</p>
         * <p>If you specify TaskId, the execution result of the specified task is returned. If you do not specify TaskId, the execution result of the last task is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
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
