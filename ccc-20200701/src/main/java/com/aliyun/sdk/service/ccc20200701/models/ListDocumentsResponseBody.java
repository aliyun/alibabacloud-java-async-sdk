// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

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
 * {@link ListDocumentsResponseBody} extends {@link TeaModel}
 *
 * <p>ListDocumentsResponseBody</p>
 */
public class ListDocumentsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Params")
    private java.util.List<String> params;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListDocumentsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.params = builder.params;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDocumentsResponseBody create() {
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
     * @return params
     */
    public java.util.List<String> getParams() {
        return this.params;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private java.util.List<String> params; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListDocumentsResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.params = model.params;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The response code.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
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
         * <p>The response message.</p>
         * 
         * <strong>example:</strong>
         * <p>无</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The response parameters.</p>
         */
        public Builder params(java.util.List<String> params) {
            this.params = params;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7BEEA660-A45A-45E3-98CC-AFC65E715C23</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListDocumentsResponseBody build() {
            return new ListDocumentsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDocumentsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDocumentsResponseBody</p>
     */
    public static class Schema extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreatedTime")
        private String createdTime;

        @com.aliyun.core.annotation.NameInMap("Deleted")
        private Boolean deleted;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Properties")
        private java.util.Map<String, DataSchemaPropertiesValue> properties;

        @com.aliyun.core.annotation.NameInMap("UpdatedTime")
        private String updatedTime;

        private Schema(Builder builder) {
            this.createdTime = builder.createdTime;
            this.deleted = builder.deleted;
            this.description = builder.description;
            this.id = builder.id;
            this.instanceId = builder.instanceId;
            this.properties = builder.properties;
            this.updatedTime = builder.updatedTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Schema create() {
            return builder().build();
        }

        /**
         * @return createdTime
         */
        public String getCreatedTime() {
            return this.createdTime;
        }

        /**
         * @return deleted
         */
        public Boolean getDeleted() {
            return this.deleted;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return properties
         */
        public java.util.Map<String, DataSchemaPropertiesValue> getProperties() {
            return this.properties;
        }

        /**
         * @return updatedTime
         */
        public String getUpdatedTime() {
            return this.updatedTime;
        }

        public static final class Builder {
            private String createdTime; 
            private Boolean deleted; 
            private String description; 
            private String id; 
            private String instanceId; 
            private java.util.Map<String, DataSchemaPropertiesValue> properties; 
            private String updatedTime; 

            private Builder() {
            } 

            private Builder(Schema model) {
                this.createdTime = model.createdTime;
                this.deleted = model.deleted;
                this.description = model.description;
                this.id = model.id;
                this.instanceId = model.instanceId;
                this.properties = model.properties;
                this.updatedTime = model.updatedTime;
            } 

            /**
             * <p>The time when the schema was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-10-14T09:53:53Z</p>
             */
            public Builder createdTime(String createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * <p>Indicates whether the schema is deleted.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder deleted(Boolean deleted) {
                this.deleted = deleted;
                return this;
            }

            /**
             * <p>The description.</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The schema ID.</p>
             * 
             * <strong>example:</strong>
             * <p>profile</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>87b12784-8ce2-40b6-b21f-c49cb3b5501e</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The list of fields.</p>
             */
            public Builder properties(java.util.Map<String, DataSchemaPropertiesValue> properties) {
                this.properties = properties;
                return this;
            }

            /**
             * <p>The time when the schema was last updated.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-10-14T09:53:53Z</p>
             */
            public Builder updatedTime(String updatedTime) {
                this.updatedTime = updatedTime;
                return this;
            }

            public Schema build() {
                return new Schema(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDocumentsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDocumentsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Documents")
        private java.util.List<java.util.Map<String, ?>> documents;

        @com.aliyun.core.annotation.NameInMap("NextPageToken")
        private String nextPageToken;

        @com.aliyun.core.annotation.NameInMap("Schema")
        private Schema schema;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

        private Data(Builder builder) {
            this.documents = builder.documents;
            this.nextPageToken = builder.nextPageToken;
            this.schema = builder.schema;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return documents
         */
        public java.util.List<java.util.Map<String, ?>> getDocuments() {
            return this.documents;
        }

        /**
         * @return nextPageToken
         */
        public String getNextPageToken() {
            return this.nextPageToken;
        }

        /**
         * @return schema
         */
        public Schema getSchema() {
            return this.schema;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List<java.util.Map<String, ?>> documents; 
            private String nextPageToken; 
            private Schema schema; 
            private Long totalCount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.documents = model.documents;
                this.nextPageToken = model.nextPageToken;
                this.schema = model.schema;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The list of documents.</p>
             */
            public Builder documents(java.util.List<java.util.Map<String, ?>> documents) {
                this.documents = documents;
                return this;
            }

            /**
             * <p>The token for the next page of results.</p>
             * 
             * <strong>example:</strong>
             * <p>54d1a616d95a4a01ba58967a9115b649</p>
             */
            public Builder nextPageToken(String nextPageToken) {
                this.nextPageToken = nextPageToken;
                return this;
            }

            /**
             * <p>The schema.</p>
             */
            public Builder schema(Schema schema) {
                this.schema = schema;
                return this;
            }

            /**
             * <p>The total number of entries.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
