// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms20250414.models;

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
 * {@link ListDataAgentMcpResponseBody} extends {@link TeaModel}
 *
 * <p>ListDataAgentMcpResponseBody</p>
 */
public class ListDataAgentMcpResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListDataAgentMcpResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDataAgentMcpResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Data data; 
        private String errorCode; 
        private String errorMessage; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListDataAgentMcpResponseBody model) {
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The paging query results of MCP Servers.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The return code. The value is success if the request was successful, or an error code if the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message returned when a system-level request failure occurs.</p>
         * 
         * <strong>example:</strong>
         * <p>Failed to list MCP servers</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The maximum number of records returned in this response.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The token for the next page. This value is empty when no more results are available.</p>
         * 
         * <strong>example:</strong>
         * <p>page-2</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID, which is used to locate this call.</p>
         * 
         * <strong>example:</strong>
         * <p>550e***544</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li>true: Successful.</li>
         * <li>false: Failed.</li>
         * </ul>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListDataAgentMcpResponseBody build() {
            return new ListDataAgentMcpResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDataAgentMcpResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataAgentMcpResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private Object content;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Float pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Float pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalElements")
        private Float totalElements;

        @com.aliyun.core.annotation.NameInMap("TotalPages")
        private Float totalPages;

        private Data(Builder builder) {
            this.content = builder.content;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalElements = builder.totalElements;
            this.totalPages = builder.totalPages;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public Object getContent() {
            return this.content;
        }

        /**
         * @return pageNumber
         */
        public Float getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public Float getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalElements
         */
        public Float getTotalElements() {
            return this.totalElements;
        }

        /**
         * @return totalPages
         */
        public Float getTotalPages() {
            return this.totalPages;
        }

        public static final class Builder {
            private Object content; 
            private Float pageNumber; 
            private Float pageSize; 
            private Float totalElements; 
            private Float totalPages; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.content = model.content;
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.totalElements = model.totalElements;
                this.totalPages = model.totalPages;
            } 

            /**
             * <p>The list of MCP Servers on the current page. Each item contains information such as the service identifier, name, workspace, network, connection method, status, and enabled state.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;uuid&quot;:&quot;44lg<em><strong>z65&quot;,&quot;name&quot;:&quot;analytics&quot;,&quot;workspaceUuid&quot;:&quot;	atvx</strong></em>xmz&quot;,&quot;netType&quot;:&quot;public&quot;,&quot;transportType&quot;:&quot;sse&quot;,&quot;state&quot;:&quot;ready&quot;,&quot;enable&quot;:true}]</p>
             */
            public Builder content(Object content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The current page number, starting from 1.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNumber(Float pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>The number of records per page.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder pageSize(Float pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of records that match the filter conditions.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder totalElements(Float totalElements) {
                this.totalElements = totalElements;
                return this;
            }

            /**
             * <p>The total number of pages that match the filter conditions.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder totalPages(Float totalPages) {
                this.totalPages = totalPages;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
