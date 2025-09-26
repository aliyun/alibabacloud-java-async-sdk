// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentrun20250910.models;

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
 * {@link ListCodeInterpretersRequest} extends {@link RequestModel}
 *
 * <p>ListCodeInterpretersRequest</p>
 */
public class ListCodeInterpretersRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("codeInterpreterName")
    private String codeInterpreterName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    private ListCodeInterpretersRequest(Builder builder) {
        super(builder);
        this.codeInterpreterName = builder.codeInterpreterName;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCodeInterpretersRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return codeInterpreterName
     */
    public String getCodeInterpreterName() {
        return this.codeInterpreterName;
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

    public static final class Builder extends Request.Builder<ListCodeInterpretersRequest, Builder> {
        private String codeInterpreterName; 
        private Integer pageNumber; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(ListCodeInterpretersRequest request) {
            super(request);
            this.codeInterpreterName = request.codeInterpreterName;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
        } 

        /**
         * <p>根据代码解释器实例名称进行模糊匹配过滤</p>
         * 
         * <strong>example:</strong>
         * <p>code</p>
         */
        public Builder codeInterpreterName(String codeInterpreterName) {
            this.putQueryParameter("codeInterpreterName", codeInterpreterName);
            this.codeInterpreterName = codeInterpreterName;
            return this;
        }

        /**
         * <p>当前页码，从1开始计数</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("pageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>每页返回的记录数量</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public ListCodeInterpretersRequest build() {
            return new ListCodeInterpretersRequest(this);
        } 

    } 

}
