// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

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
 * {@link SubmitPreviewResult} extends {@link TeaModel}
 *
 * <p>SubmitPreviewResult</p>
 */
public class SubmitPreviewResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("queryId")
    private String queryId;

    @com.aliyun.core.annotation.NameInMap("sessionId")
    private String sessionId;

    @com.aliyun.core.annotation.NameInMap("tableSchemas")
    private java.util.List<TableSchema> tableSchemas;

    private SubmitPreviewResult(Builder builder) {
        this.queryId = builder.queryId;
        this.sessionId = builder.sessionId;
        this.tableSchemas = builder.tableSchemas;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitPreviewResult create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return queryId
     */
    public String getQueryId() {
        return this.queryId;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return tableSchemas
     */
    public java.util.List<TableSchema> getTableSchemas() {
        return this.tableSchemas;
    }

    public static final class Builder {
        private String queryId; 
        private String sessionId; 
        private java.util.List<TableSchema> tableSchemas; 

        private Builder() {
        } 

        private Builder(SubmitPreviewResult model) {
            this.queryId = model.queryId;
            this.sessionId = model.sessionId;
            this.tableSchemas = model.tableSchemas;
        } 

        /**
         * queryId.
         */
        public Builder queryId(String queryId) {
            this.queryId = queryId;
            return this;
        }

        /**
         * sessionId.
         */
        public Builder sessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }

        /**
         * tableSchemas.
         */
        public Builder tableSchemas(java.util.List<TableSchema> tableSchemas) {
            this.tableSchemas = tableSchemas;
            return this;
        }

        public SubmitPreviewResult build() {
            return new SubmitPreviewResult(this);
        } 

    } 

}
