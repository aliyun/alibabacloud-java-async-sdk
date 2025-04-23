// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

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
 * {@link DescribeBatchResultDetailRequest} extends {@link RequestModel}
 *
 * <p>DescribeBatchResultDetailRequest</p>
 */
public class DescribeBatchResultDetailRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BatchType")
    private String batchType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskId")
    private Long taskId;

    private DescribeBatchResultDetailRequest(Builder builder) {
        super(builder);
        this.batchType = builder.batchType;
        this.lang = builder.lang;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.status = builder.status;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBatchResultDetailRequest create() {
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
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return taskId
     */
    public Long getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<DescribeBatchResultDetailRequest, Builder> {
        private String batchType; 
        private String lang; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String status; 
        private Long taskId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeBatchResultDetailRequest request) {
            super(request);
            this.batchType = request.batchType;
            this.lang = request.lang;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.status = request.status;
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
         * <blockquote>
         * <p> Do not perform filtering when this field is empty.</p>
         * </blockquote>
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
         * <p>The language of the content within the request and response. Default: <strong>zh</strong>. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese</li>
         * <li><strong>en</strong>: English</li>
         * </ul>
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
         * <p>The page number. Default value: <strong>1</strong>.</p>
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
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The execution result. If you do not specify this parameter, all results are returned.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>83618818</p>
         */
        public Builder taskId(Long taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public DescribeBatchResultDetailRequest build() {
            return new DescribeBatchResultDetailRequest(this);
        } 

    } 

}
