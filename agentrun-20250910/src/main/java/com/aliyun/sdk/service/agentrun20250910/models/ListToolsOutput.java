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
 * {@link ListToolsOutput} extends {@link TeaModel}
 *
 * <p>ListToolsOutput</p>
 */
public class ListToolsOutput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private java.util.List<ToolListItem> data;

    @com.aliyun.core.annotation.NameInMap("pageNum")
    private Integer pageNum;

    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("total")
    private Integer total;

    private ListToolsOutput(Builder builder) {
        this.data = builder.data;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListToolsOutput create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<ToolListItem> getData() {
        return this.data;
    }

    /**
     * @return pageNum
     */
    public Integer getPageNum() {
        return this.pageNum;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private java.util.List<ToolListItem> data; 
        private Integer pageNum; 
        private Integer pageSize; 
        private Integer total; 

        private Builder() {
        } 

        private Builder(ListToolsOutput model) {
            this.data = model.data;
            this.pageNum = model.pageNum;
            this.pageSize = model.pageSize;
            this.total = model.total;
        } 

        /**
         * data.
         */
        public Builder data(java.util.List<ToolListItem> data) {
            this.data = data;
            return this;
        }

        /**
         * pageNum.
         */
        public Builder pageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * total.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public ListToolsOutput build() {
            return new ListToolsOutput(this);
        } 

    } 

}
