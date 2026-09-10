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
 * {@link ListDataCheckConfigRequest} extends {@link RequestModel}
 *
 * <p>ListDataCheckConfigRequest</p>
 */
public class ListDataCheckConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageIndex")
    private Integer pageIndex;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("srcTable")
    private String srcTable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("taskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long taskId;

    private ListDataCheckConfigRequest(Builder builder) {
        super(builder);
        this.pageIndex = builder.pageIndex;
        this.pageSize = builder.pageSize;
        this.srcTable = builder.srcTable;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDataCheckConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pageIndex
     */
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return srcTable
     */
    public String getSrcTable() {
        return this.srcTable;
    }

    /**
     * @return taskId
     */
    public Long getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<ListDataCheckConfigRequest, Builder> {
        private Integer pageIndex; 
        private Integer pageSize; 
        private String srcTable; 
        private Long taskId; 

        private Builder() {
            super();
        } 

        private Builder(ListDataCheckConfigRequest request) {
            super(request);
            this.pageIndex = request.pageIndex;
            this.pageSize = request.pageSize;
            this.srcTable = request.srcTable;
            this.taskId = request.taskId;
        } 

        /**
         * pageIndex.
         */
        public Builder pageIndex(Integer pageIndex) {
            this.putQueryParameter("pageIndex", pageIndex);
            this.pageIndex = pageIndex;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * srcTable.
         */
        public Builder srcTable(String srcTable) {
            this.putQueryParameter("srcTable", srcTable);
            this.srcTable = srcTable;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10001</p>
         */
        public Builder taskId(Long taskId) {
            this.putQueryParameter("taskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public ListDataCheckConfigRequest build() {
            return new ListDataCheckConfigRequest(this);
        } 

    } 

}
