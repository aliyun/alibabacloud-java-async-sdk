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
 * {@link GetParserDataSourceResponseBody} extends {@link TeaModel}
 *
 * <p>GetParserDataSourceResponseBody</p>
 */
public class GetParserDataSourceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("DataSource")
    private DataSource dataSource;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetParserDataSourceResponseBody(Builder builder) {
        this.code = builder.code;
        this.dataSource = builder.dataSource;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetParserDataSourceResponseBody create() {
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
     * @return dataSource
     */
    public DataSource getDataSource() {
        return this.dataSource;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
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
        private DataSource dataSource; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetParserDataSourceResponseBody model) {
            this.code = model.code;
            this.dataSource = model.dataSource;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * DataSource.
         */
        public Builder dataSource(DataSource dataSource) {
            this.dataSource = dataSource;
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

        public GetParserDataSourceResponseBody build() {
            return new GetParserDataSourceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetParserDataSourceResponseBody} extends {@link TeaModel}
     *
     * <p>GetParserDataSourceResponseBody</p>
     */
    public static class DataSource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateUserId")
        private Long createUserId;

        @com.aliyun.core.annotation.NameInMap("DataSourceId")
        private Long dataSourceId;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("UtcCreated")
        private String utcCreated;

        private DataSource(Builder builder) {
            this.createUserId = builder.createUserId;
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
         * @return createUserId
         */
        public Long getCreateUserId() {
            return this.createUserId;
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
            private Long createUserId; 
            private Long dataSourceId; 
            private String description; 
            private String name; 
            private String utcCreated; 

            private Builder() {
            } 

            private Builder(DataSource model) {
                this.createUserId = model.createUserId;
                this.dataSourceId = model.dataSourceId;
                this.description = model.description;
                this.name = model.name;
                this.utcCreated = model.utcCreated;
            } 

            /**
             * CreateUserId.
             */
            public Builder createUserId(Long createUserId) {
                this.createUserId = createUserId;
                return this;
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
}
