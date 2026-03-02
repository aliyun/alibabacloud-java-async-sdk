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
 * {@link DqlResult} extends {@link TeaModel}
 *
 * <p>DqlResult</p>
 */
public class DqlResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("statementIndex")
    private Integer statementIndex;

    @com.aliyun.core.annotation.NameInMap("submitPreviewResult")
    private SubmitPreviewResult submitPreviewResult;

    @com.aliyun.core.annotation.NameInMap("tableResults")
    private java.util.List<TableResult> tableResults;

    private DqlResult(Builder builder) {
        this.statementIndex = builder.statementIndex;
        this.submitPreviewResult = builder.submitPreviewResult;
        this.tableResults = builder.tableResults;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DqlResult create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return statementIndex
     */
    public Integer getStatementIndex() {
        return this.statementIndex;
    }

    /**
     * @return submitPreviewResult
     */
    public SubmitPreviewResult getSubmitPreviewResult() {
        return this.submitPreviewResult;
    }

    /**
     * @return tableResults
     */
    public java.util.List<TableResult> getTableResults() {
        return this.tableResults;
    }

    public static final class Builder {
        private Integer statementIndex; 
        private SubmitPreviewResult submitPreviewResult; 
        private java.util.List<TableResult> tableResults; 

        private Builder() {
        } 

        private Builder(DqlResult model) {
            this.statementIndex = model.statementIndex;
            this.submitPreviewResult = model.submitPreviewResult;
            this.tableResults = model.tableResults;
        } 

        /**
         * statementIndex.
         */
        public Builder statementIndex(Integer statementIndex) {
            this.statementIndex = statementIndex;
            return this;
        }

        /**
         * submitPreviewResult.
         */
        public Builder submitPreviewResult(SubmitPreviewResult submitPreviewResult) {
            this.submitPreviewResult = submitPreviewResult;
            return this;
        }

        /**
         * tableResults.
         */
        public Builder tableResults(java.util.List<TableResult> tableResults) {
            this.tableResults = tableResults;
            return this;
        }

        public DqlResult build() {
            return new DqlResult(this);
        } 

    } 

}
