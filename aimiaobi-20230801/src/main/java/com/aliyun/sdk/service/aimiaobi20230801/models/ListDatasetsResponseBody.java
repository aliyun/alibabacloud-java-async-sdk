// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

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
 * {@link ListDatasetsResponseBody} extends {@link TeaModel}
 *
 * <p>ListDatasetsResponseBody</p>
 */
public class ListDatasetsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListDatasetsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDatasetsResponseBody create() {
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
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
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
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private java.util.List<Data> data; 
        private Integer httpStatusCode; 
        private String message; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListDatasetsResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.success = model.success;
            this.totalCount = model.totalCount;
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
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
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
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListDatasetsResponseBody build() {
            return new ListDatasetsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDatasetsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDatasetsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("CreateUser")
        private String createUser;

        @com.aliyun.core.annotation.NameInMap("DatasetDescription")
        private String datasetDescription;

        @com.aliyun.core.annotation.NameInMap("DatasetId")
        private Long datasetId;

        @com.aliyun.core.annotation.NameInMap("DatasetName")
        private String datasetName;

        @com.aliyun.core.annotation.NameInMap("DatasetType")
        private String datasetType;

        @com.aliyun.core.annotation.NameInMap("SearchDatasetEnable")
        private Integer searchDatasetEnable;

        private Data(Builder builder) {
            this.createTime = builder.createTime;
            this.createUser = builder.createUser;
            this.datasetDescription = builder.datasetDescription;
            this.datasetId = builder.datasetId;
            this.datasetName = builder.datasetName;
            this.datasetType = builder.datasetType;
            this.searchDatasetEnable = builder.searchDatasetEnable;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return createUser
         */
        public String getCreateUser() {
            return this.createUser;
        }

        /**
         * @return datasetDescription
         */
        public String getDatasetDescription() {
            return this.datasetDescription;
        }

        /**
         * @return datasetId
         */
        public Long getDatasetId() {
            return this.datasetId;
        }

        /**
         * @return datasetName
         */
        public String getDatasetName() {
            return this.datasetName;
        }

        /**
         * @return datasetType
         */
        public String getDatasetType() {
            return this.datasetType;
        }

        /**
         * @return searchDatasetEnable
         */
        public Integer getSearchDatasetEnable() {
            return this.searchDatasetEnable;
        }

        public static final class Builder {
            private String createTime; 
            private String createUser; 
            private String datasetDescription; 
            private Long datasetId; 
            private String datasetName; 
            private String datasetType; 
            private Integer searchDatasetEnable; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.createTime = model.createTime;
                this.createUser = model.createUser;
                this.datasetDescription = model.datasetDescription;
                this.datasetId = model.datasetId;
                this.datasetName = model.datasetName;
                this.datasetType = model.datasetType;
                this.searchDatasetEnable = model.searchDatasetEnable;
            } 

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * CreateUser.
             */
            public Builder createUser(String createUser) {
                this.createUser = createUser;
                return this;
            }

            /**
             * DatasetDescription.
             */
            public Builder datasetDescription(String datasetDescription) {
                this.datasetDescription = datasetDescription;
                return this;
            }

            /**
             * DatasetId.
             */
            public Builder datasetId(Long datasetId) {
                this.datasetId = datasetId;
                return this;
            }

            /**
             * DatasetName.
             */
            public Builder datasetName(String datasetName) {
                this.datasetName = datasetName;
                return this;
            }

            /**
             * DatasetType.
             */
            public Builder datasetType(String datasetType) {
                this.datasetType = datasetType;
                return this;
            }

            /**
             * SearchDatasetEnable.
             */
            public Builder searchDatasetEnable(Integer searchDatasetEnable) {
                this.searchDatasetEnable = searchDatasetEnable;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
