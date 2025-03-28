// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

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
 * {@link GetMetaTableChangeLogResponseBody} extends {@link TeaModel}
 *
 * <p>GetMetaTableChangeLogResponseBody</p>
 */
public class GetMetaTableChangeLogResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetMetaTableChangeLogResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMetaTableChangeLogResponseBody create() {
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
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
        private Integer httpStatusCode; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetMetaTableChangeLogResponseBody model) {
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.httpStatusCode = model.httpStatusCode;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The business data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>Invalid.Tenant.ConnectionNotExists</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>The connection does not exist.</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0bc1ec92159376</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetMetaTableChangeLogResponseBody build() {
            return new GetMetaTableChangeLogResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetMetaTableChangeLogResponseBody} extends {@link TeaModel}
     *
     * <p>GetMetaTableChangeLogResponseBody</p>
     */
    public static class DataEntityList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChangeContent")
        private String changeContent;

        @com.aliyun.core.annotation.NameInMap("ChangeType")
        private String changeType;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("ModifiedTime")
        private Long modifiedTime;

        @com.aliyun.core.annotation.NameInMap("ObjectType")
        private String objectType;

        @com.aliyun.core.annotation.NameInMap("Operator")
        private String operator;

        private DataEntityList(Builder builder) {
            this.changeContent = builder.changeContent;
            this.changeType = builder.changeType;
            this.createTime = builder.createTime;
            this.modifiedTime = builder.modifiedTime;
            this.objectType = builder.objectType;
            this.operator = builder.operator;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataEntityList create() {
            return builder().build();
        }

        /**
         * @return changeContent
         */
        public String getChangeContent() {
            return this.changeContent;
        }

        /**
         * @return changeType
         */
        public String getChangeType() {
            return this.changeType;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return modifiedTime
         */
        public Long getModifiedTime() {
            return this.modifiedTime;
        }

        /**
         * @return objectType
         */
        public String getObjectType() {
            return this.objectType;
        }

        /**
         * @return operator
         */
        public String getOperator() {
            return this.operator;
        }

        public static final class Builder {
            private String changeContent; 
            private String changeType; 
            private Long createTime; 
            private Long modifiedTime; 
            private String objectType; 
            private String operator; 

            private Builder() {
            } 

            private Builder(DataEntityList model) {
                this.changeContent = model.changeContent;
                this.changeType = model.changeType;
                this.createTime = model.createTime;
                this.modifiedTime = model.modifiedTime;
                this.objectType = model.objectType;
                this.operator = model.operator;
            } 

            /**
             * <p>The content of the change.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;[{&quot;action&quot;:&quot;ADD_COLUMN&quot;,&quot;value&quot;:[{&quot;originName&quot;:&quot;&quot;,&quot;originType&quot;:&quot;&quot;,&quot;originComment&quot;:&quot;&quot;,&quot;name&quot;:&quot;id&quot;,&quot;type&quot;:&quot;struct<a href="name:string">name:string</a>&quot;,&quot;comment&quot;:&quot;&quot;}]}]&quot;,</p>
             */
            public Builder changeContent(String changeContent) {
                this.changeContent = changeContent;
                return this;
            }

            /**
             * <p>The type of the change.</p>
             * 
             * <strong>example:</strong>
             * <p>CREATE_TABLE</p>
             */
            public Builder changeType(String changeType) {
                this.changeType = changeType;
                return this;
            }

            /**
             * <p>The time when the metatable was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1590722845000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The time when the metatable was modified.</p>
             * 
             * <strong>example:</strong>
             * <p>1590722845000</p>
             */
            public Builder modifiedTime(Long modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * <p>The entity on which the change was made. Valid values: TABLE and PARTITION.</p>
             * 
             * <strong>example:</strong>
             * <p>TABLE</p>
             */
            public Builder objectType(String objectType) {
                this.objectType = objectType;
                return this;
            }

            /**
             * <p>The name of the operator.</p>
             * 
             * <strong>example:</strong>
             * <p>abc</p>
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            public DataEntityList build() {
                return new DataEntityList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetMetaTableChangeLogResponseBody} extends {@link TeaModel}
     *
     * <p>GetMetaTableChangeLogResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataEntityList")
        private java.util.List<DataEntityList> dataEntityList;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

        private Data(Builder builder) {
            this.dataEntityList = builder.dataEntityList;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return dataEntityList
         */
        public java.util.List<DataEntityList> getDataEntityList() {
            return this.dataEntityList;
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
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List<DataEntityList> dataEntityList; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Long totalCount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.dataEntityList = model.dataEntityList;
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The list of instances.</p>
             */
            public Builder dataEntityList(java.util.List<DataEntityList> dataEntityList) {
                this.dataEntityList = dataEntityList;
                return this;
            }

            /**
             * <p>The page number.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>The number of entries per page. Default value: 10. Maximum value: 100.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of metatables.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
