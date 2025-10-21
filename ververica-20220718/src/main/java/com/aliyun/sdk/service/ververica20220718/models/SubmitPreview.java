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
 * {@link SubmitPreview} extends {@link TeaModel}
 *
 * <p>SubmitPreview</p>
 */
public class SubmitPreview extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("queryName")
    private String queryName;

    @com.aliyun.core.annotation.NameInMap("sessionId")
    private String sessionId;

    @com.aliyun.core.annotation.NameInMap("tableSchemas")
    private java.util.List<TableSchema> tableSchemas;

    private SubmitPreview(Builder builder) {
        this.queryName = builder.queryName;
        this.sessionId = builder.sessionId;
        this.tableSchemas = builder.tableSchemas;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitPreview create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return queryName
     */
    public String getQueryName() {
        return this.queryName;
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
        private String queryName; 
        private String sessionId; 
        private java.util.List<TableSchema> tableSchemas; 

        private Builder() {
        } 

        private Builder(SubmitPreview model) {
            this.queryName = model.queryName;
            this.sessionId = model.sessionId;
            this.tableSchemas = model.tableSchemas;
        } 

        /**
         * queryName.
         */
        public Builder queryName(String queryName) {
            this.queryName = queryName;
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

        public SubmitPreview build() {
            return new SubmitPreview(this);
        } 

    } 

}
