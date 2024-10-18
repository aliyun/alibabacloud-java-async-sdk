// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListDatasetsResponseBody} extends {@link TeaModel}
 *
 * <p>ListDatasetsResponseBody</p>
 */
public class ListDatasetsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Datasets")
    private java.util.List < Dataset > datasets;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListDatasetsResponseBody(Builder builder) {
        this.datasets = builder.datasets;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDatasetsResponseBody create() {
        return builder().build();
    }

    /**
     * @return datasets
     */
    public java.util.List < Dataset > getDatasets() {
        return this.datasets;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Dataset > datasets; 
        private String nextToken; 
        private String requestId; 

        /**
         * <p>The list of datasets.</p>
         */
        public Builder datasets(java.util.List < Dataset > datasets) {
            this.datasets = datasets;
            return this;
        }

        /**
         * <p>The pagination token. If the total number of datasets is greater than the value of MaxResults, you must specify this parameter. This parameter has a value only if not all the datasets that meet the conditions are returned.</p>
         * <p>Pass this value as the value of NextToken in the next call to query subsequent datasets.</p>
         * 
         * <strong>example:</strong>
         * <p>12345678:immtest:dataset002</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>FEEDE356-C928-4A36-951A-6EB5A592****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListDatasetsResponseBody build() {
            return new ListDatasetsResponseBody(this);
        } 

    } 

}
