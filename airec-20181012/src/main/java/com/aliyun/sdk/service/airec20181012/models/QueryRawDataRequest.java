// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20181012.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryRawDataRequest} extends {@link RequestModel}
 *
 * <p>QueryRawDataRequest</p>
 */
public class QueryRawDataRequest extends Request {
    @Path
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Path
    @NameInMap("Table")
    @Validation(required = true)
    private String table;

    @Query
    @NameInMap("ItemId")
    private String itemId;

    @Query
    @NameInMap("ItemType")
    private String itemType;

    @Query
    @NameInMap("UserId")
    private String userId;

    @Query
    @NameInMap("UserType")
    private String userType;

    private QueryRawDataRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.table = builder.table;
        this.itemId = builder.itemId;
        this.itemType = builder.itemType;
        this.userId = builder.userId;
        this.userType = builder.userType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryRawDataRequest create() {
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
     * @return table
     */
    public String getTable() {
        return this.table;
    }

    /**
     * @return itemId
     */
    public String getItemId() {
        return this.itemId;
    }

    /**
     * @return itemType
     */
    public String getItemType() {
        return this.itemType;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * @return userType
     */
    public String getUserType() {
        return this.userType;
    }

    public static final class Builder extends Request.Builder<QueryRawDataRequest, Builder> {
        private String instanceId; 
        private String table; 
        private String itemId; 
        private String itemType; 
        private String userId; 
        private String userType; 

        private Builder() {
            super();
        } 

        private Builder(QueryRawDataRequest response) {
            super(response);
            this.instanceId = response.instanceId;
            this.table = response.table;
            this.itemId = response.itemId;
            this.itemType = response.itemType;
            this.userId = response.userId;
            this.userType = response.userType;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Table.
         */
        public Builder table(String table) {
            this.putPathParameter("Table", table);
            this.table = table;
            return this;
        }

        /**
         * ItemId.
         */
        public Builder itemId(String itemId) {
            this.putQueryParameter("ItemId", itemId);
            this.itemId = itemId;
            return this;
        }

        /**
         * ItemType.
         */
        public Builder itemType(String itemType) {
            this.putQueryParameter("ItemType", itemType);
            this.itemType = itemType;
            return this;
        }

        /**
         * UserId.
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        /**
         * UserType.
         */
        public Builder userType(String userType) {
            this.putQueryParameter("UserType", userType);
            this.userType = userType;
            return this;
        }

        @Override
        public QueryRawDataRequest build() {
            return new QueryRawDataRequest(this);
        } 

    } 

}
