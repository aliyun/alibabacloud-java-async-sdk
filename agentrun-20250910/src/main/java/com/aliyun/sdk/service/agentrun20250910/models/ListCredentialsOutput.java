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
 * {@link ListCredentialsOutput} extends {@link TeaModel}
 *
 * <p>ListCredentialsOutput</p>
 */
public class ListCredentialsOutput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("items")
    private CredentialListItem items;

    @com.aliyun.core.annotation.NameInMap("pageNum")
    private String pageNum;

    @com.aliyun.core.annotation.NameInMap("pageSize")
    private String pageSize;

    @com.aliyun.core.annotation.NameInMap("total")
    private String total;

    private ListCredentialsOutput(Builder builder) {
        this.items = builder.items;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCredentialsOutput create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return items
     */
    public CredentialListItem getItems() {
        return this.items;
    }

    /**
     * @return pageNum
     */
    public String getPageNum() {
        return this.pageNum;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return total
     */
    public String getTotal() {
        return this.total;
    }

    public static final class Builder {
        private CredentialListItem items; 
        private String pageNum; 
        private String pageSize; 
        private String total; 

        private Builder() {
        } 

        private Builder(ListCredentialsOutput model) {
            this.items = model.items;
            this.pageNum = model.pageNum;
            this.pageSize = model.pageSize;
            this.total = model.total;
        } 

        /**
         * items.
         */
        public Builder items(CredentialListItem items) {
            this.items = items;
            return this;
        }

        /**
         * pageNum.
         */
        public Builder pageNum(String pageNum) {
            this.pageNum = pageNum;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(String pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * total.
         */
        public Builder total(String total) {
            this.total = total;
            return this;
        }

        public ListCredentialsOutput build() {
            return new ListCredentialsOutput(this);
        } 

    } 

}
