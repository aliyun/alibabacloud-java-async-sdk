// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.lhm20250116.models;

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
 * {@link GetSqlConversionResultRequest} extends {@link RequestModel}
 *
 * <p>GetSqlConversionResultRequest</p>
 */
public class GetSqlConversionResultRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("page")
    private Integer page;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("size")
    private Integer size;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("taskId")
    private Long taskId;

    private GetSqlConversionResultRequest(Builder builder) {
        super(builder);
        this.page = builder.page;
        this.size = builder.size;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSqlConversionResultRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return page
     */
    public Integer getPage() {
        return this.page;
    }

    /**
     * @return size
     */
    public Integer getSize() {
        return this.size;
    }

    /**
     * @return taskId
     */
    public Long getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<GetSqlConversionResultRequest, Builder> {
        private Integer page; 
        private Integer size; 
        private Long taskId; 

        private Builder() {
            super();
        } 

        private Builder(GetSqlConversionResultRequest request) {
            super(request);
            this.page = request.page;
            this.size = request.size;
            this.taskId = request.taskId;
        } 

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder page(Integer page) {
            this.putBodyParameter("page", page);
            this.page = page;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder size(Integer size) {
            this.putBodyParameter("size", size);
            this.size = size;
            return this;
        }

        /**
         * <p>The task ID that uniquely identifies a task.</p>
         * 
         * <strong>example:</strong>
         * <p>10001</p>
         */
        public Builder taskId(Long taskId) {
            this.putBodyParameter("taskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public GetSqlConversionResultRequest build() {
            return new GetSqlConversionResultRequest(this);
        } 

    } 

}
