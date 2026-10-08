// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

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
 * {@link GetSourceTableMetaResponseBody} extends {@link TeaModel}
 *
 * <p>GetSourceTableMetaResponseBody</p>
 */
public class GetSourceTableMetaResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetSourceTableMetaResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSourceTableMetaResponseBody create() {
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
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetSourceTableMetaResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
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
         * Data.
         */
        public Builder data(Data data) {
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

        public GetSourceTableMetaResponseBody build() {
            return new GetSourceTableMetaResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetSourceTableMetaResponseBody} extends {@link TeaModel}
     *
     * <p>GetSourceTableMetaResponseBody</p>
     */
    public static class Columns extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Comment")
        private String comment;

        @com.aliyun.core.annotation.NameInMap("DataType")
        private String dataType;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Pk")
        private Boolean pk;

        @com.aliyun.core.annotation.NameInMap("Pt")
        private Boolean pt;

        @com.aliyun.core.annotation.NameInMap("RawDataType")
        private String rawDataType;

        @com.aliyun.core.annotation.NameInMap("SeqNumber")
        private Integer seqNumber;

        private Columns(Builder builder) {
            this.comment = builder.comment;
            this.dataType = builder.dataType;
            this.name = builder.name;
            this.pk = builder.pk;
            this.pt = builder.pt;
            this.rawDataType = builder.rawDataType;
            this.seqNumber = builder.seqNumber;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Columns create() {
            return builder().build();
        }

        /**
         * @return comment
         */
        public String getComment() {
            return this.comment;
        }

        /**
         * @return dataType
         */
        public String getDataType() {
            return this.dataType;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return pk
         */
        public Boolean getPk() {
            return this.pk;
        }

        /**
         * @return pt
         */
        public Boolean getPt() {
            return this.pt;
        }

        /**
         * @return rawDataType
         */
        public String getRawDataType() {
            return this.rawDataType;
        }

        /**
         * @return seqNumber
         */
        public Integer getSeqNumber() {
            return this.seqNumber;
        }

        public static final class Builder {
            private String comment; 
            private String dataType; 
            private String name; 
            private Boolean pk; 
            private Boolean pt; 
            private String rawDataType; 
            private Integer seqNumber; 

            private Builder() {
            } 

            private Builder(Columns model) {
                this.comment = model.comment;
                this.dataType = model.dataType;
                this.name = model.name;
                this.pk = model.pk;
                this.pt = model.pt;
                this.rawDataType = model.rawDataType;
                this.seqNumber = model.seqNumber;
            } 

            /**
             * Comment.
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * DataType.
             */
            public Builder dataType(String dataType) {
                this.dataType = dataType;
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
             * Pk.
             */
            public Builder pk(Boolean pk) {
                this.pk = pk;
                return this;
            }

            /**
             * Pt.
             */
            public Builder pt(Boolean pt) {
                this.pt = pt;
                return this;
            }

            /**
             * RawDataType.
             */
            public Builder rawDataType(String rawDataType) {
                this.rawDataType = rawDataType;
                return this;
            }

            /**
             * SeqNumber.
             */
            public Builder seqNumber(Integer seqNumber) {
                this.seqNumber = seqNumber;
                return this;
            }

            public Columns build() {
                return new Columns(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetSourceTableMetaResponseBody} extends {@link TeaModel}
     *
     * <p>GetSourceTableMetaResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Columns")
        private java.util.List<Columns> columns;

        @com.aliyun.core.annotation.NameInMap("Guid")
        private String guid;

        @com.aliyun.core.annotation.NameInMap("TableComment")
        private String tableComment;

        @com.aliyun.core.annotation.NameInMap("TableName")
        private String tableName;

        private Data(Builder builder) {
            this.columns = builder.columns;
            this.guid = builder.guid;
            this.tableComment = builder.tableComment;
            this.tableName = builder.tableName;
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
         * @return guid
         */
        public String getGuid() {
            return this.guid;
        }

        /**
         * @return tableComment
         */
        public String getTableComment() {
            return this.tableComment;
        }

        /**
         * @return tableName
         */
        public String getTableName() {
            return this.tableName;
        }

        public static final class Builder {
            private java.util.List<Columns> columns; 
            private String guid; 
            private String tableComment; 
            private String tableName; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.columns = model.columns;
                this.guid = model.guid;
                this.tableComment = model.tableComment;
                this.tableName = model.tableName;
            } 

            /**
             * Columns.
             */
            public Builder columns(java.util.List<Columns> columns) {
                this.columns = columns;
                return this;
            }

            /**
             * Guid.
             */
            public Builder guid(String guid) {
                this.guid = guid;
                return this;
            }

            /**
             * TableComment.
             */
            public Builder tableComment(String tableComment) {
                this.tableComment = tableComment;
                return this;
            }

            /**
             * TableName.
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
