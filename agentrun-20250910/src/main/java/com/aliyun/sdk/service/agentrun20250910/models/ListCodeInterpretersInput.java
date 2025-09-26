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
 * {@link ListCodeInterpretersInput} extends {@link TeaModel}
 *
 * <p>ListCodeInterpretersInput</p>
 */
public class ListCodeInterpretersInput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("codeInterpreterName")
    private String codeInterpreterName;

    @com.aliyun.core.annotation.NameInMap("pageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    private ListCodeInterpretersInput(Builder builder) {
        this.codeInterpreterName = builder.codeInterpreterName;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCodeInterpretersInput create() {
        return builder().build();
    }

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

    public static final class Builder {
        private String codeInterpreterName; 
        private Integer pageNumber; 
        private Integer pageSize; 

        private Builder() {
        } 

        private Builder(ListCodeInterpretersInput model) {
            this.codeInterpreterName = model.codeInterpreterName;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
        } 

        /**
         * <p>按代码解释器名称过滤</p>
         */
        public Builder codeInterpreterName(String codeInterpreterName) {
            this.codeInterpreterName = codeInterpreterName;
            return this;
        }

        /**
         * pageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        public ListCodeInterpretersInput build() {
            return new ListCodeInterpretersInput(this);
        } 

    } 

}
