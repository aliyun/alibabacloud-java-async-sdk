// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link GetTableResponseBody} extends {@link TeaModel}
 *
 * <p>GetTableResponseBody</p>
 */
public class GetTableResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("Table")
    private Table table;

    private GetTableResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.table = builder.table;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTableResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return table
     */
    public Table getTable() {
        return this.table;
    }

    public static final class Builder {
        private String requestId; 
        private Boolean success; 
        private Table table; 

        private Builder() {
        } 

        private Builder(GetTableResponseBody model) {
            this.requestId = model.requestId;
            this.success = model.success;
            this.table = model.table;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * Table.
         */
        public Builder table(Table table) {
            this.table = table;
            return this;
        }

        public GetTableResponseBody build() {
            return new GetTableResponseBody(this);
        } 

    } 

}
