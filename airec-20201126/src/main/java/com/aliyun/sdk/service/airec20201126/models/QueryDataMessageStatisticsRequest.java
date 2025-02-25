// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20201126.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QueryDataMessageStatisticsRequest} extends {@link RequestModel}
 *
 * <p>QueryDataMessageStatisticsRequest</p>
 */
public class QueryDataMessageStatisticsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("table")
    @com.aliyun.core.annotation.Validation(required = true)
    private String table;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("bhvType")
    private String bhvType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("cmdType")
    private String cmdType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("endTime")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 4102416000D, minimum = 946656000)
    private Long endTime;

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
    @com.aliyun.core.annotation.NameInMap("messageSource")
    private String messageSource;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("sceneId")
    private String sceneId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("startTime")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 4102416000D, minimum = 946656000)
    private Long startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("traceId")
    private String traceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("userId")
    private String userId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("userType")
    private String userType;

    private QueryDataMessageStatisticsRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.table = builder.table;
        this.bhvType = builder.bhvType;
        this.cmdType = builder.cmdType;
        this.endTime = builder.endTime;
        this.imei = builder.imei;
        this.itemId = builder.itemId;
        this.itemType = builder.itemType;
        this.messageSource = builder.messageSource;
        this.sceneId = builder.sceneId;
        this.startTime = builder.startTime;
        this.traceId = builder.traceId;
        this.userId = builder.userId;
        this.userType = builder.userType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDataMessageStatisticsRequest create() {
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
     * @return bhvType
     */
    public String getBhvType() {
        return this.bhvType;
    }

    /**
     * @return cmdType
     */
    public String getCmdType() {
        return this.cmdType;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
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
     * @return messageSource
     */
    public String getMessageSource() {
        return this.messageSource;
    }

    /**
     * @return sceneId
     */
    public String getSceneId() {
        return this.sceneId;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return traceId
     */
    public String getTraceId() {
        return this.traceId;
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

    public static final class Builder extends Request.Builder<QueryDataMessageStatisticsRequest, Builder> {
        private String instanceId; 
        private String table; 
        private String bhvType; 
        private String cmdType; 
        private Long endTime; 
        private String imei; 
        private String itemId; 
        private String itemType; 
        private String messageSource; 
        private String sceneId; 
        private Long startTime; 
        private String traceId; 
        private String userId; 
        private String userType; 

        private Builder() {
            super();
        } 

        private Builder(QueryDataMessageStatisticsRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.table = request.table;
            this.bhvType = request.bhvType;
            this.cmdType = request.cmdType;
            this.endTime = request.endTime;
            this.imei = request.imei;
            this.itemId = request.itemId;
            this.itemType = request.itemType;
            this.messageSource = request.messageSource;
            this.sceneId = request.sceneId;
            this.startTime = request.startTime;
            this.traceId = request.traceId;
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
         * <p>The type of behaviors. Valid values: expose, click, like, comment, collect, stay, cart, buy, and evaluate.</p>
         * 
         * <strong>example:</strong>
         * <p>expose</p>
         */
        public Builder bhvType(String bhvType) {
            this.putQueryParameter("bhvType", bhvType);
            this.bhvType = bhvType;
            return this;
        }

        /**
         * <p>The type of the operation. Valid values: update, delete, and add.</p>
         * 
         * <strong>example:</strong>
         * <p>update</p>
         */
        public Builder cmdType(String cmdType) {
            this.putQueryParameter("cmdType", cmdType);
            this.cmdType = cmdType;
            return this;
        }

        /**
         * <p>The end time. The value is a timestamp in seconds.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1586673466</p>
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("endTime", endTime);
            this.endTime = endTime;
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
         * <p>The ID of the item. This parameter is required when the value of table is set to item.</p>
         * 
         * <strong>example:</strong>
         * <p>111</p>
         */
        public Builder itemId(String itemId) {
            this.putQueryParameter("itemId", itemId);
            this.itemId = itemId;
            return this;
        }

        /**
         * <p>The type of the item. This parameter is required when the value of table is set to item.</p>
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
         * <p>The source of the operation. Valid values:</p>
         * <p>CONSOLE and FEEDER.</p>
         * 
         * <strong>example:</strong>
         * <p>FEEDER</p>
         */
        public Builder messageSource(String messageSource) {
            this.putQueryParameter("messageSource", messageSource);
            this.messageSource = messageSource;
            return this;
        }

        /**
         * <p>The scene ID.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder sceneId(String sceneId) {
            this.putQueryParameter("sceneId", sceneId);
            this.sceneId = sceneId;
            return this;
        }

        /**
         * <p>The start time. The value is a timestamp in seconds.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1586673466</p>
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("startTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The event tracking ID.</p>
         * 
         * <strong>example:</strong>
         * <p>Alibaba</p>
         */
        public Builder traceId(String traceId) {
            this.putQueryParameter("traceId", traceId);
            this.traceId = traceId;
            return this;
        }

        /**
         * <p>The ID of the user. This parameter is required when the value of table is set to user.</p>
         * 
         * <strong>example:</strong>
         * <p>222</p>
         */
        public Builder userId(String userId) {
            this.putQueryParameter("userId", userId);
            this.userId = userId;
            return this;
        }

        /**
         * <p>The type of the user. This parameter is required when the value of table is set to user.</p>
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
        public QueryDataMessageStatisticsRequest build() {
            return new QueryDataMessageStatisticsRequest(this);
        } 

    } 

}
