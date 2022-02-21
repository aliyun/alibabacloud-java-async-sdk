// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20181012.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDataMessageStatisticsRequest} extends {@link RequestModel}
 *
 * <p>QueryDataMessageStatisticsRequest</p>
 */
public class QueryDataMessageStatisticsRequest extends Request {
    @Path
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Path
    @NameInMap("Table")
    @Validation(required = true)
    private String table;

    @Query
    @NameInMap("BhvType")
    private String bhvType;

    @Query
    @NameInMap("CmdType")
    private String cmdType;

    @Query
    @NameInMap("EndTime")
    @Validation(required = true, maximum = 4102416000D, minimum = 946656000)
    private Long endTime;

    @Query
    @NameInMap("ItemId")
    private String itemId;

    @Query
    @NameInMap("ItemType")
    private String itemType;

    @Query
    @NameInMap("MessageSource")
    private String messageSource;

    @Query
    @NameInMap("SceneId")
    private String sceneId;

    @Query
    @NameInMap("StartTime")
    @Validation(required = true, maximum = 4102416000D, minimum = 946656000)
    private Long startTime;

    @Query
    @NameInMap("TraceId")
    private String traceId;

    @Query
    @NameInMap("UserId")
    private String userId;

    @Query
    @NameInMap("UserType")
    private String userType;

    private QueryDataMessageStatisticsRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.table = builder.table;
        this.bhvType = builder.bhvType;
        this.cmdType = builder.cmdType;
        this.endTime = builder.endTime;
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

        private Builder(QueryDataMessageStatisticsRequest response) {
            super(response);
            this.instanceId = response.instanceId;
            this.table = response.table;
            this.bhvType = response.bhvType;
            this.cmdType = response.cmdType;
            this.endTime = response.endTime;
            this.itemId = response.itemId;
            this.itemType = response.itemType;
            this.messageSource = response.messageSource;
            this.sceneId = response.sceneId;
            this.startTime = response.startTime;
            this.traceId = response.traceId;
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
         * BhvType.
         */
        public Builder bhvType(String bhvType) {
            this.putQueryParameter("BhvType", bhvType);
            this.bhvType = bhvType;
            return this;
        }

        /**
         * CmdType.
         */
        public Builder cmdType(String cmdType) {
            this.putQueryParameter("CmdType", cmdType);
            this.cmdType = cmdType;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
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
         * MessageSource.
         */
        public Builder messageSource(String messageSource) {
            this.putQueryParameter("MessageSource", messageSource);
            this.messageSource = messageSource;
            return this;
        }

        /**
         * SceneId.
         */
        public Builder sceneId(String sceneId) {
            this.putQueryParameter("SceneId", sceneId);
            this.sceneId = sceneId;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * TraceId.
         */
        public Builder traceId(String traceId) {
            this.putQueryParameter("TraceId", traceId);
            this.traceId = traceId;
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
        public QueryDataMessageStatisticsRequest build() {
            return new QueryDataMessageStatisticsRequest(this);
        } 

    } 

}
