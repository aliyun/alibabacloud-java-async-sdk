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
 * {@link ListLineageResponseBody} extends {@link TeaModel}
 *
 * <p>ListLineageResponseBody</p>
 */
public class ListLineageResponseBody extends TeaModel {
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

    private ListLineageResponseBody(Builder builder) {
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

    public static ListLineageResponseBody create() {
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

        private Builder(ListLineageResponseBody model) {
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.httpStatusCode = model.httpStatusCode;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The structure returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>1010040007</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>qualifiedName should be in format as entity-table.entity-guid</p>
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
         * <p>64B-587A-8CED-969E1973887FXXX-TT</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListLineageResponseBody build() {
            return new ListLineageResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListLineageResponseBody} extends {@link TeaModel}
     *
     * <p>ListLineageResponseBody</p>
     */
    public static class RelationList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Channel")
        private String channel;

        @com.aliyun.core.annotation.NameInMap("Datasource")
        private String datasource;

        @com.aliyun.core.annotation.NameInMap("Guid")
        private String guid;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private RelationList(Builder builder) {
            this.channel = builder.channel;
            this.datasource = builder.datasource;
            this.guid = builder.guid;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RelationList create() {
            return builder().build();
        }

        /**
         * @return channel
         */
        public String getChannel() {
            return this.channel;
        }

        /**
         * @return datasource
         */
        public String getDatasource() {
            return this.datasource;
        }

        /**
         * @return guid
         */
        public String getGuid() {
            return this.guid;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String channel; 
            private String datasource; 
            private String guid; 
            private String type; 

            private Builder() {
            } 

            private Builder(RelationList model) {
                this.channel = model.channel;
                this.datasource = model.datasource;
                this.guid = model.guid;
                this.type = model.type;
            } 

            /**
             * <p>The data channel. Valid values:</p>
             * <ul>
             * <li><strong>FIRST_PARTY: DataWorks platform</strong></li>
             * <li><strong>THIRD_PARTY: user registration</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>THIRD_PARTY</p>
             */
            public Builder channel(String channel) {
                this.channel = channel;
                return this;
            }

            /**
             * <p>The data source.</p>
             * 
             * <strong>example:</strong>
             * <p>mysql</p>
             */
            public Builder datasource(String datasource) {
                this.datasource = datasource;
                return this;
            }

            /**
             * <p>The unique relationship ID.</p>
             * 
             * <strong>example:</strong>
             * <p>aaabbccddguid</p>
             */
            public Builder guid(String guid) {
                this.guid = guid;
                return this;
            }

            /**
             * <p>The task type, which is used to describe the relationship between entities, such as SQL-based calculation, mapping based on report fields, or API operation definition.</p>
             * 
             * <strong>example:</strong>
             * <p>sql</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public RelationList build() {
                return new RelationList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListLineageResponseBody} extends {@link TeaModel}
     *
     * <p>ListLineageResponseBody</p>
     */
    public static class DataEntityList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTimestamp")
        private Long createTimestamp;

        @com.aliyun.core.annotation.NameInMap("Entity")
        private Entity entity;

        @com.aliyun.core.annotation.NameInMap("RelationList")
        private java.util.List<RelationList> relationList;

        private DataEntityList(Builder builder) {
            this.createTimestamp = builder.createTimestamp;
            this.entity = builder.entity;
            this.relationList = builder.relationList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataEntityList create() {
            return builder().build();
        }

        /**
         * @return createTimestamp
         */
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        /**
         * @return entity
         */
        public Entity getEntity() {
            return this.entity;
        }

        /**
         * @return relationList
         */
        public java.util.List<RelationList> getRelationList() {
            return this.relationList;
        }

        public static final class Builder {
            private Long createTimestamp; 
            private Entity entity; 
            private java.util.List<RelationList> relationList; 

            private Builder() {
            } 

            private Builder(DataEntityList model) {
                this.createTimestamp = model.createTimestamp;
                this.entity = model.entity;
                this.relationList = model.relationList;
            } 

            /**
             * <p>The time when the lineage was generated.</p>
             * 
             * <strong>example:</strong>
             * <p>1686215809269</p>
             */
            public Builder createTimestamp(Long createTimestamp) {
                this.createTimestamp = createTimestamp;
                return this;
            }

            /**
             * <p>The information about the entity.</p>
             */
            public Builder entity(Entity entity) {
                this.entity = entity;
                return this;
            }

            /**
             * <p>The array of the relationship structure.</p>
             */
            public Builder relationList(java.util.List<RelationList> relationList) {
                this.relationList = relationList;
                return this;
            }

            public DataEntityList build() {
                return new DataEntityList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListLineageResponseBody} extends {@link TeaModel}
     *
     * <p>ListLineageResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataEntityList")
        private java.util.List<DataEntityList> dataEntityList;

        @com.aliyun.core.annotation.NameInMap("NextToken")
        private String nextToken;

        private Data(Builder builder) {
            this.dataEntityList = builder.dataEntityList;
            this.nextToken = builder.nextToken;
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
         * @return nextToken
         */
        public String getNextToken() {
            return this.nextToken;
        }

        public static final class Builder {
            private java.util.List<DataEntityList> dataEntityList; 
            private String nextToken; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.dataEntityList = model.dataEntityList;
                this.nextToken = model.nextToken;
            } 

            /**
             * <p>The array of the entity structure.</p>
             */
            public Builder dataEntityList(java.util.List<DataEntityList> dataEntityList) {
                this.dataEntityList = dataEntityList;
                return this;
            }

            /**
             * <p>A pagination token. It can be used in the next request to retrieve a new page of results.</p>
             * 
             * <strong>example:</strong>
             * <p>nextTokenFromRequest-xxxsd-ff</p>
             */
            public Builder nextToken(String nextToken) {
                this.nextToken = nextToken;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
