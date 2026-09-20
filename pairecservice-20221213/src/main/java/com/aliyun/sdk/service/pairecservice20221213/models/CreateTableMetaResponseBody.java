// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

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
 * {@link CreateTableMetaResponseBody} extends {@link TeaModel}
 *
 * <p>CreateTableMetaResponseBody</p>
 */
public class CreateTableMetaResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TableMetaId")
    private String tableMetaId;

    private CreateTableMetaResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.tableMetaId = builder.tableMetaId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTableMetaResponseBody create() {
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
     * @return tableMetaId
     */
    public String getTableMetaId() {
        return this.tableMetaId;
    }

    public static final class Builder {
        private String requestId; 
        private String tableMetaId; 

        private Builder() {
        } 

        private Builder(CreateTableMetaResponseBody model) {
            this.requestId = model.requestId;
            this.tableMetaId = model.tableMetaId;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>728C5E01-ABF6-5AA8-B9FC-B3BA05DECC77</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the data table.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder tableMetaId(String tableMetaId) {
            this.tableMetaId = tableMetaId;
            return this;
        }

        public CreateTableMetaResponseBody build() {
            return new CreateTableMetaResponseBody(this);
        } 

    } 

}
