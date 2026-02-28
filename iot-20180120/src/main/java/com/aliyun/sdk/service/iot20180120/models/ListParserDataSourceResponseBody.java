// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

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
 * {@link ListParserDataSourceResponseBody} extends {@link TeaModel}
 *
 * <p>ListParserDataSourceResponseBody</p>
 */
public class ListParserDataSourceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("Page")
    private Integer page;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Integer total;

    private ListParserDataSourceResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.page = builder.page;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListParserDataSourceResponseBody create() {
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
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
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
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String errorMessage; 
        private Integer page; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 
        private Integer total; 

        private Builder() {
        } 

        private Builder(ListParserDataSourceResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.errorMessage = model.errorMessage;
            this.page = model.page;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.success = model.success;
            this.total = model.total;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * Page.
         */
        public Builder page(Integer page) {
            this.page = page;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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

        /**
         * Total.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public ListParserDataSourceResponseBody build() {
            return new ListParserDataSourceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListParserDataSourceResponseBody} extends {@link TeaModel}
     *
     * <p>ListParserDataSourceResponseBody</p>
     */
    public static class DataSource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataSourceId")
        private Long dataSourceId;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("UtcCreated")
        private String utcCreated;

        private DataSource(Builder builder) {
            this.dataSourceId = builder.dataSourceId;
            this.description = builder.description;
            this.name = builder.name;
            this.utcCreated = builder.utcCreated;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataSource create() {
            return builder().build();
        }

        /**
         * @return dataSourceId
         */
        public Long getDataSourceId() {
            return this.dataSourceId;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return utcCreated
         */
        public String getUtcCreated() {
            return this.utcCreated;
        }

        public static final class Builder {
            private Long dataSourceId; 
            private String description; 
            private String name; 
            private String utcCreated; 

            private Builder() {
            } 

            private Builder(DataSource model) {
                this.dataSourceId = model.dataSourceId;
                this.description = model.description;
                this.name = model.name;
                this.utcCreated = model.utcCreated;
            } 

            /**
             * DataSourceId.
             */
            public Builder dataSourceId(Long dataSourceId) {
                this.dataSourceId = dataSourceId;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * UtcCreated.
             */
            public Builder utcCreated(String utcCreated) {
                this.utcCreated = utcCreated;
                return this;
            }

            public DataSource build() {
                return new DataSource(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListParserDataSourceResponseBody} extends {@link TeaModel}
     *
     * <p>ListParserDataSourceResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataSource")
        private java.util.List<DataSource> dataSource;

        private Data(Builder builder) {
            this.dataSource = builder.dataSource;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return dataSource
         */
        public java.util.List<DataSource> getDataSource() {
            return this.dataSource;
        }

        public static final class Builder {
            private java.util.List<DataSource> dataSource; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.dataSource = model.dataSource;
            } 

            /**
             * DataSource.
             */
            public Builder dataSource(java.util.List<DataSource> dataSource) {
                this.dataSource = dataSource;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
