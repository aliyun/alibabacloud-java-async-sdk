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
 * {@link ListAgentRuntimesInput} extends {@link TeaModel}
 *
 * <p>ListAgentRuntimesInput</p>
 */
public class ListAgentRuntimesInput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("agentRuntimeName")
    private String agentRuntimeName;

    @com.aliyun.core.annotation.NameInMap("pageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("statuses")
    private java.util.List<String> statuses;

    private ListAgentRuntimesInput(Builder builder) {
        this.agentRuntimeName = builder.agentRuntimeName;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.statuses = builder.statuses;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAgentRuntimesInput create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentRuntimeName
     */
    public String getAgentRuntimeName() {
        return this.agentRuntimeName;
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
     * @return statuses
     */
    public java.util.List<String> getStatuses() {
        return this.statuses;
    }

    public static final class Builder {
        private String agentRuntimeName; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private java.util.List<String> statuses; 

        private Builder() {
        } 

        private Builder(ListAgentRuntimesInput model) {
            this.agentRuntimeName = model.agentRuntimeName;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.statuses = model.statuses;
        } 

        /**
         * <p>按名称过滤</p>
         */
        public Builder agentRuntimeName(String agentRuntimeName) {
            this.agentRuntimeName = agentRuntimeName;
            return this;
        }

        /**
         * <p>页码</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>每页记录数</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>按状态过滤</p>
         */
        public Builder statuses(java.util.List<String> statuses) {
            this.statuses = statuses;
            return this;
        }

        public ListAgentRuntimesInput build() {
            return new ListAgentRuntimesInput(this);
        } 

    } 

}
