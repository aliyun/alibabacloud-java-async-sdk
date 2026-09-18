// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

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
 * {@link GetAgentIndexRealTimeResponseBody} extends {@link TeaModel}
 *
 * <p>GetAgentIndexRealTimeResponseBody</p>
 */
public class GetAgentIndexRealTimeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetAgentIndexRealTimeResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAgentIndexRealTimeResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetAgentIndexRealTimeResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>Status code. A return value of 200 indicates that the request succeeded.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Data list.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Description of the status code.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>EE338D98-9BD3-4413-B165</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the API call succeeded. Valid values:  </p>
         * <ul>
         * <li><strong>true</strong>: Succeeded.  </li>
         * <li><strong>false</strong>: Failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetAgentIndexRealTimeResponseBody build() {
            return new GetAgentIndexRealTimeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAgentIndexRealTimeResponseBody} extends {@link TeaModel}
     *
     * <p>GetAgentIndexRealTimeResponseBody</p>
     */
    public static class Columns extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        private Columns(Builder builder) {
            this.key = builder.key;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Columns create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String key; 
            private String title; 

            private Builder() {
            } 

            private Builder(Columns model) {
                this.key = model.key;
                this.title = model.title;
            } 

            /**
             * <p>Metric.</p>
             * 
             * <strong>example:</strong>
             * <p>客服ID</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>Metric description.</p>
             * 
             * <strong>example:</strong>
             * <p>servicerId</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public Columns build() {
                return new Columns(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAgentIndexRealTimeResponseBody} extends {@link TeaModel}
     *
     * <p>GetAgentIndexRealTimeResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Columns")
        private java.util.List<Columns> columns;

        @com.aliyun.core.annotation.NameInMap("Page")
        private Integer page;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("Rows")
        private java.util.List<java.util.Map<String, ?>> rows;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Integer total;

        private Data(Builder builder) {
            this.columns = builder.columns;
            this.page = builder.page;
            this.pageSize = builder.pageSize;
            this.rows = builder.rows;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return columns
         */
        public java.util.List<Columns> getColumns() {
            return this.columns;
        }

        /**
         * @return page
         */
        public Integer getPage() {
            return this.page;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return rows
         */
        public java.util.List<java.util.Map<String, ?>> getRows() {
            return this.rows;
        }

        /**
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        public static final class Builder {
            private java.util.List<Columns> columns; 
            private Integer page; 
            private Integer pageSize; 
            private java.util.List<java.util.Map<String, ?>> rows; 
            private Integer total; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.columns = model.columns;
                this.page = model.page;
                this.pageSize = model.pageSize;
                this.rows = model.rows;
                this.total = model.total;
            } 

            /**
             * <p>Description of returned columns.</p>
             */
            public Builder columns(java.util.List<Columns> columns) {
                this.columns = columns;
                return this;
            }

            /**
             * <p>Current page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder page(Integer page) {
                this.page = page;
                return this;
            }

            /**
             * <p>Page size.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>Returned data results.</p>
             */
            public Builder rows(java.util.List<java.util.Map<String, ?>> rows) {
                this.rows = rows;
                return this;
            }

            /**
             * <p>Total number of records.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
