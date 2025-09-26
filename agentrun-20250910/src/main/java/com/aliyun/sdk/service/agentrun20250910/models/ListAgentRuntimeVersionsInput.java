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
 * {@link ListAgentRuntimeVersionsInput} extends {@link TeaModel}
 *
 * <p>ListAgentRuntimeVersionsInput</p>
 */
public class ListAgentRuntimeVersionsInput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("pageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    private ListAgentRuntimeVersionsInput(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAgentRuntimeVersionsInput create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 

        private Builder() {
        } 

        private Builder(ListAgentRuntimeVersionsInput model) {
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
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

        public ListAgentRuntimeVersionsInput build() {
            return new ListAgentRuntimeVersionsInput(this);
        } 

    } 

}
