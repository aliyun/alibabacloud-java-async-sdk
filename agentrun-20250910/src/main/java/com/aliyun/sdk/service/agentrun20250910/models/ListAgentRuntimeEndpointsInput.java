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
 * {@link ListAgentRuntimeEndpointsInput} extends {@link TeaModel}
 *
 * <p>ListAgentRuntimeEndpointsInput</p>
 */
public class ListAgentRuntimeEndpointsInput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("endpointName")
    private String endpointName;

    @com.aliyun.core.annotation.NameInMap("pageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("statuses")
    private java.util.List<String> statuses;

    private ListAgentRuntimeEndpointsInput(Builder builder) {
        this.endpointName = builder.endpointName;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.statuses = builder.statuses;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAgentRuntimeEndpointsInput create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endpointName
     */
    public String getEndpointName() {
        return this.endpointName;
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
        private String endpointName; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private java.util.List<String> statuses; 

        private Builder() {
        } 

        private Builder(ListAgentRuntimeEndpointsInput model) {
            this.endpointName = model.endpointName;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.statuses = model.statuses;
        } 

        /**
         * <p>按端点名称过滤</p>
         */
        public Builder endpointName(String endpointName) {
            this.endpointName = endpointName;
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

        public ListAgentRuntimeEndpointsInput build() {
            return new ListAgentRuntimeEndpointsInput(this);
        } 

    } 

}
