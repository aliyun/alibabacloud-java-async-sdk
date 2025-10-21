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
 * {@link FetchResult} extends {@link TeaModel}
 *
 * <p>FetchResult</p>
 */
public class FetchResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("resultMessage")
    private String resultMessage;

    @com.aliyun.core.annotation.NameInMap("resultType")
    private String resultType;

    @com.aliyun.core.annotation.NameInMap("tableResults")
    private java.util.List<TableResult> tableResults;

    private FetchResult(Builder builder) {
        this.resultMessage = builder.resultMessage;
        this.resultType = builder.resultType;
        this.tableResults = builder.tableResults;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FetchResult create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return resultMessage
     */
    public String getResultMessage() {
        return this.resultMessage;
    }

    /**
     * @return resultType
     */
    public String getResultType() {
        return this.resultType;
    }

    /**
     * @return tableResults
     */
    public java.util.List<TableResult> getTableResults() {
        return this.tableResults;
    }

    public static final class Builder {
        private String resultMessage; 
        private String resultType; 
        private java.util.List<TableResult> tableResults; 

        private Builder() {
        } 

        private Builder(FetchResult model) {
            this.resultMessage = model.resultMessage;
            this.resultType = model.resultType;
            this.tableResults = model.tableResults;
        } 

        /**
         * resultMessage.
         */
        public Builder resultMessage(String resultMessage) {
            this.resultMessage = resultMessage;
            return this;
        }

        /**
         * resultType.
         */
        public Builder resultType(String resultType) {
            this.resultType = resultType;
            return this;
        }

        /**
         * tableResults.
         */
        public Builder tableResults(java.util.List<TableResult> tableResults) {
            this.tableResults = tableResults;
            return this;
        }

        public FetchResult build() {
            return new FetchResult(this);
        } 

    } 

}
