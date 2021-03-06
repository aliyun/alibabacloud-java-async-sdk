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

        private Builder(DescribeBatchResultCountRequest response) {
            super(response);
            this.batchType = response.batchType;
            this.lang = response.lang;
            this.taskId = response.taskId;
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
         * TaskId.
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
