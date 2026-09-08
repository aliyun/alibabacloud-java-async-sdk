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
 * {@link ListDocumentsRequest} extends {@link RequestModel}
 *
 * <p>ListDocumentsRequest</p>
 */
public class ListDocumentsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NextPageToken")
    private String nextPageToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SchemaId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String schemaId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SearchPattern")
    private String searchPattern;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Sorts")
    private java.util.List<Sorts> sorts;

    private ListDocumentsRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.nextPageToken = builder.nextPageToken;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.schemaId = builder.schemaId;
        this.searchPattern = builder.searchPattern;
        this.sorts = builder.sorts;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDocumentsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return nextPageToken
     */
    public String getNextPageToken() {
        return this.nextPageToken;
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
     * @return schemaId
     */
    public String getSchemaId() {
        return this.schemaId;
    }

    /**
     * @return searchPattern
     */
    public String getSearchPattern() {
        return this.searchPattern;
    }

    /**
     * @return sorts
     */
    public java.util.List<Sorts> getSorts() {
        return this.sorts;
    }

    public static final class Builder extends Request.Builder<ListDocumentsRequest, Builder> {
        private String instanceId; 
        private String nextPageToken; 
        private Integer pageSize; 
        private String requestId; 
        private String schemaId; 
        private String searchPattern; 
        private java.util.List<Sorts> sorts; 

        private Builder() {
            super();
        } 

        private Builder(ListDocumentsRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.nextPageToken = request.nextPageToken;
            this.pageSize = request.pageSize;
            this.requestId = request.requestId;
            this.schemaId = request.schemaId;
            this.searchPattern = request.searchPattern;
            this.sorts = request.sorts;
        } 

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>d278629c-c687-4aa3-b044-4fe9b012e7ef</p>
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The token for the next page of results.</p>
         * 
         * <strong>example:</strong>
         * <p>eyJ0YWJsZUlkIjoiY2Y2MTQxYjA5NDY0NDUxMzk5YjFjMTA5YTMxZWNkMzEiLCJ0b2tlbiI6IjAwMDAwMDAwMDAwNzAzNzcifQ==</p>
         */
        public Builder nextPageToken(String nextPageToken) {
            this.putBodyParameter("NextPageToken", nextPageToken);
            this.nextPageToken = nextPageToken;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>EAF3C248-E123-441B-A545-B6CD02E98EED</p>
         */
        public Builder requestId(String requestId) {
            this.putBodyParameter("RequestId", requestId);
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The schema ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>profile</p>
         */
        public Builder schemaId(String schemaId) {
            this.putBodyParameter("SchemaId", schemaId);
            this.schemaId = schemaId;
            return this;
        }

        /**
         * <p>The search conditional expression.</p>
         * 
         * <strong>example:</strong>
         * <p>支持Lucene搜索语法</p>
         */
        public Builder searchPattern(String searchPattern) {
            this.putBodyParameter("SearchPattern", searchPattern);
            this.searchPattern = searchPattern;
            return this;
        }

        /**
         * <p>The custom sorting value.</p>
         */
        public Builder sorts(java.util.List<Sorts> sorts) {
            String sortsShrink = shrink(sorts, "Sorts", "json");
            this.putBodyParameter("Sorts", sortsShrink);
            this.sorts = sorts;
            return this;
        }

        @Override
        public ListDocumentsRequest build() {
            return new ListDocumentsRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListDocumentsRequest} extends {@link TeaModel}
     *
     * <p>ListDocumentsRequest</p>
     */
    public static class Sorts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Order")
        private String order;

        @com.aliyun.core.annotation.NameInMap("PropertyName")
        private String propertyName;

        private Sorts(Builder builder) {
            this.order = builder.order;
            this.propertyName = builder.propertyName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Sorts create() {
            return builder().build();
        }

        /**
         * @return order
         */
        public String getOrder() {
            return this.order;
        }

        /**
         * @return propertyName
         */
        public String getPropertyName() {
            return this.propertyName;
        }

        public static final class Builder {
            private String order; 
            private String propertyName; 

            private Builder() {
            } 

            private Builder(Sorts model) {
                this.order = model.order;
                this.propertyName = model.propertyName;
            } 

            /**
             * <p>The sorting order. Valid values:</p>
             * <ul>
             * <li><p>ASC (default): ascending order.</p>
             * </li>
             * <li><p>DESC: descending order.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>desc</p>
             */
            public Builder order(String order) {
                this.order = order;
                return this;
            }

            /**
             * <p>The field name.</p>
             * 
             * <strong>example:</strong>
             * <p>name</p>
             */
            public Builder propertyName(String propertyName) {
                this.propertyName = propertyName;
                return this;
            }

            public Sorts build() {
                return new Sorts(this);
            } 

        } 

    }
}
