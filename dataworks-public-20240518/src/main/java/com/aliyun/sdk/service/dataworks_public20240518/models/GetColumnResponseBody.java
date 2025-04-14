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
 * {@link GetColumnResponseBody} extends {@link TeaModel}
 *
 * <p>GetColumnResponseBody</p>
 */
public class GetColumnResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Column")
    private Column column;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetColumnResponseBody(Builder builder) {
        this.column = builder.column;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetColumnResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return column
     */
    public Column getColumn() {
        return this.column;
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

    public static final class Builder {
        private Column column; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetColumnResponseBody model) {
            this.column = model.column;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Column.
         */
        public Builder column(Column column) {
            this.column = column;
            return this;
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

        public GetColumnResponseBody build() {
            return new GetColumnResponseBody(this);
        } 

    } 

}
