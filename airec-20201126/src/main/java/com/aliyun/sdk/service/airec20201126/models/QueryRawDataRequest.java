// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20201126.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QueryRawDataRequest} extends {@link RequestModel}
 *
 * <p>QueryRawDataRequest</p>
 */
public class QueryRawDataRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("table")
    @com.aliyun.core.annotation.Validation(required = true)
    private String table;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("imei")
    private String imei;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("itemId")
    private String itemId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("itemType")
    private String itemType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("userId")
    private String userId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("userType")
    private String userType;

    private QueryRawDataRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.table = builder.table;
        this.imei = builder.imei;
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
     * @return imei
     */
    public String getImei() {
        return this.imei;
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
        private String imei; 
        private String itemId; 
        private String itemType; 
        private String userId; 
        private String userType; 

        private Builder() {
            super();
        } 

        private Builder(QueryRawDataRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.table = request.table;
            this.imei = request.imei;
            this.itemId = request.itemId;
            this.itemType = request.itemType;
            this.userId = request.userId;
            this.userType = request.userType;
        } 

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>airec-cn-o400whm78004</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The name of the table. Valid values: item and user.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>item</p>
         */
        public Builder table(String table) {
            this.putPathParameter("table", table);
            this.table = table;
            return this;
        }

        /**
         * imei.
         */
        public Builder imei(String imei) {
            this.putQueryParameter("imei", imei);
            this.imei = imei;
            return this;
        }

        /**
         * <p>The item ID. This parameter is required when the table parameter is set to item.</p>
         * 
         * <strong>example:</strong>
         * <p>112</p>
         */
        public Builder itemId(String itemId) {
            this.putQueryParameter("itemId", itemId);
            this.itemId = itemId;
            return this;
        }

        /**
         * <p>The type of the item. This parameter is required when the table parameter is set to item.</p>
         * 
         * <strong>example:</strong>
         * <p>video</p>
         */
        public Builder itemType(String itemType) {
            this.putQueryParameter("itemType", itemType);
            this.itemType = itemType;
            return this;
        }

        /**
         * <p>The user ID. This parameter is required when the table parameter is set to user.</p>
         * 
         * <strong>example:</strong>
         * <p>111</p>
         */
        public Builder userId(String userId) {
            this.putQueryParameter("userId", userId);
            this.userId = userId;
            return this;
        }

        /**
         * <p>The type of the user. This parameter is required when the table parameter is set to user.</p>
         * 
         * <strong>example:</strong>
         * <p>app</p>
         */
        public Builder userType(String userType) {
            this.putQueryParameter("userType", userType);
            this.userType = userType;
            return this;
        }

        @Override
        public QueryRawDataRequest build() {
            return new QueryRawDataRequest(this);
        } 

    } 

}
