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
 * {@link ListFunagentsInput} extends {@link TeaModel}
 *
 * <p>ListFunagentsInput</p>
 */
public class ListFunagentsInput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("funagentName")
    private String funagentName;

    @com.aliyun.core.annotation.NameInMap("pageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    private ListFunagentsInput(Builder builder) {
        this.funagentName = builder.funagentName;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFunagentsInput create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return funagentName
     */
    public String getFunagentName() {
        return this.funagentName;
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

    public static final class Builder {
        private String funagentName; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String status; 

        private Builder() {
        } 

        private Builder(ListFunagentsInput model) {
            this.funagentName = model.funagentName;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.status = model.status;
        } 

        /**
         * funagentName.
         */
        public Builder funagentName(String funagentName) {
            this.funagentName = funagentName;
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

        /**
         * status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public ListFunagentsInput build() {
            return new ListFunagentsInput(this);
        } 

    } 

}
