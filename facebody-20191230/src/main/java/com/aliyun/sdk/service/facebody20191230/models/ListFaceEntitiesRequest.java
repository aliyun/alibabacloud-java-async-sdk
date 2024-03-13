// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.facebody20191230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFaceEntitiesRequest} extends {@link RequestModel}
 *
 * <p>ListFaceEntitiesRequest</p>
 */
public class ListFaceEntitiesRequest extends Request {
    @Body
    @NameInMap("DbName")
    @Validation(required = true)
    private String dbName;

    @Body
    @NameInMap("EntityIdPrefix")
    private String entityIdPrefix;

    @Body
    @NameInMap("Labels")
    private String labels;

    @Body
    @NameInMap("Limit")
    private Integer limit;

    @Body
    @NameInMap("Offset")
    private Integer offset;

    @Body
    @NameInMap("Order")
    private String order;

    @Body
    @NameInMap("Token")
    private String token;

    private ListFaceEntitiesRequest(Builder builder) {
        super(builder);
        this.dbName = builder.dbName;
        this.entityIdPrefix = builder.entityIdPrefix;
        this.labels = builder.labels;
        this.limit = builder.limit;
        this.offset = builder.offset;
        this.order = builder.order;
        this.token = builder.token;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFaceEntitiesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dbName
     */
    public String getDbName() {
        return this.dbName;
    }

    /**
     * @return entityIdPrefix
     */
    public String getEntityIdPrefix() {
        return this.entityIdPrefix;
    }

    /**
     * @return labels
     */
    public String getLabels() {
        return this.labels;
    }

    /**
     * @return limit
     */
    public Integer getLimit() {
        return this.limit;
    }

    /**
     * @return offset
     */
    public Integer getOffset() {
        return this.offset;
    }

    /**
     * @return order
     */
    public String getOrder() {
        return this.order;
    }

    /**
     * @return token
     */
    public String getToken() {
        return this.token;
    }

    public static final class Builder extends Request.Builder<ListFaceEntitiesRequest, Builder> {
        private String dbName; 
        private String entityIdPrefix; 
        private String labels; 
        private Integer limit; 
        private Integer offset; 
        private String order; 
        private String token; 

        private Builder() {
            super();
        } 

        private Builder(ListFaceEntitiesRequest request) {
            super(request);
            this.dbName = request.dbName;
            this.entityIdPrefix = request.entityIdPrefix;
            this.labels = request.labels;
            this.limit = request.limit;
            this.offset = request.offset;
            this.order = request.order;
            this.token = request.token;
        } 

        /**
         * DbName.
         */
        public Builder dbName(String dbName) {
            this.putBodyParameter("DbName", dbName);
            this.dbName = dbName;
            return this;
        }

        /**
         * EntityIdPrefix.
         */
        public Builder entityIdPrefix(String entityIdPrefix) {
            this.putBodyParameter("EntityIdPrefix", entityIdPrefix);
            this.entityIdPrefix = entityIdPrefix;
            return this;
        }

        /**
         * Labels.
         */
        public Builder labels(String labels) {
            this.putBodyParameter("Labels", labels);
            this.labels = labels;
            return this;
        }

        /**
         * Limit.
         */
        public Builder limit(Integer limit) {
            this.putBodyParameter("Limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * Offset.
         */
        public Builder offset(Integer offset) {
            this.putBodyParameter("Offset", offset);
            this.offset = offset;
            return this;
        }

        /**
         * Order.
         */
        public Builder order(String order) {
            this.putBodyParameter("Order", order);
            this.order = order;
            return this;
        }

        /**
         * Token.
         */
        public Builder token(String token) {
            this.putBodyParameter("Token", token);
            this.token = token;
            return this;
        }

        @Override
        public ListFaceEntitiesRequest build() {
            return new ListFaceEntitiesRequest(this);
        } 

    } 

}
