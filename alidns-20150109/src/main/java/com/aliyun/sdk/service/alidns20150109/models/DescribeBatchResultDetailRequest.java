// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBatchResultDetailRequest} extends {@link RequestModel}
 *
 * <p>DescribeBatchResultDetailRequest</p>
 */
public class DescribeBatchResultDetailRequest extends Request {
    @Query
    @NameInMap("BatchType")
    private String batchType;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("Status")
    private String status;

    @Query
    @NameInMap("TaskId")
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
         * BatchType.
         */
        public Builder batchType(String batchType) {
            this.putQueryParameter("BatchType", batchType);
            this.batchType = batchType;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
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
         * Status.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * TaskId.
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
