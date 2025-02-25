// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20201126.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QueryDataMessageRequest} extends {@link RequestModel}
 *
 * <p>QueryDataMessageRequest</p>
 */
public class QueryDataMessageRequest extends Request {
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
    @com.aliyun.core.annotation.Validation(required = true, maximum = 4102416000D, minimum = 1565193600)
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
    @com.aliyun.core.annotation.NameInMap("page")
    @com.aliyun.core.annotation.Validation(maximum = 2147483647, minimum = 1)
    private Integer page;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("sceneId")
    private String sceneId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("size")
    @com.aliyun.core.annotation.Validation(maximum = 2147483647, minimum = 1)
    private Integer size;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("startTime")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 4102416000D, minimum = 1565193600)
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

    private QueryDataMessageRequest(Builder builder) {
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
        this.page = builder.page;
        this.sceneId = builder.sceneId;
        this.size = builder.size;
        this.startTime = builder.startTime;
        this.traceId = builder.traceId;
        this.userId = builder.userId;
        this.userType = builder.userType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDataMessageRequest create() {
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
     * @return page
     */
    public Integer getPage() {
        return this.page;
    }

    /**
     * @return sceneId
     */
    public String getSceneId() {
        return this.sceneId;
    }

    /**
     * @return size
     */
    public Integer getSize() {
        return this.size;
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

    public static final class Builder extends Request.Builder<QueryDataMessageRequest, Builder> {
        private String instanceId; 
        private String table; 
        private String bhvType; 
        private String cmdType; 
        private Long endTime; 
        private String imei; 
        private String itemId; 
        private String itemType; 
        private String messageSource; 
        private Integer page; 
        private String sceneId; 
        private Integer size; 
        private Long startTime; 
        private String traceId; 
        private String userId; 
        private String userType; 

        private Builder() {
            super();
        } 

        private Builder(QueryDataMessageRequest request) {
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
            this.page = request.page;
            this.sceneId = request.sceneId;
            this.size = request.size;
            this.startTime = request.startTime;
            this.traceId = request.traceId;
            this.userId = request.userId;
            this.userType = request.userType;
        } 

        /**
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
         * bhvType.
         */
        public Builder bhvType(String bhvType) {
            this.putQueryParameter("bhvType", bhvType);
            this.bhvType = bhvType;
            return this;
        }

        /**
         * cmdType.
         */
        public Builder cmdType(String cmdType) {
            this.putQueryParameter("cmdType", cmdType);
            this.cmdType = cmdType;
            return this;
        }

        /**
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
         * itemId.
         */
        public Builder itemId(String itemId) {
            this.putQueryParameter("itemId", itemId);
            this.itemId = itemId;
            return this;
        }

        /**
         * itemType.
         */
        public Builder itemType(String itemType) {
            this.putQueryParameter("itemType", itemType);
            this.itemType = itemType;
            return this;
        }

        /**
         * messageSource.
         */
        public Builder messageSource(String messageSource) {
            this.putQueryParameter("messageSource", messageSource);
            this.messageSource = messageSource;
            return this;
        }

        /**
         * page.
         */
        public Builder page(Integer page) {
            this.putQueryParameter("page", page);
            this.page = page;
            return this;
        }

        /**
         * sceneId.
         */
        public Builder sceneId(String sceneId) {
            this.putQueryParameter("sceneId", sceneId);
            this.sceneId = sceneId;
            return this;
        }

        /**
         * size.
         */
        public Builder size(Integer size) {
            this.putQueryParameter("size", size);
            this.size = size;
            return this;
        }

        /**
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
         * traceId.
         */
        public Builder traceId(String traceId) {
            this.putQueryParameter("traceId", traceId);
            this.traceId = traceId;
            return this;
        }

        /**
         * userId.
         */
        public Builder userId(String userId) {
            this.putQueryParameter("userId", userId);
            this.userId = userId;
            return this;
        }

        /**
         * userType.
         */
        public Builder userType(String userType) {
            this.putQueryParameter("userType", userType);
            this.userType = userType;
            return this;
        }

        @Override
        public QueryDataMessageRequest build() {
            return new QueryDataMessageRequest(this);
        } 

    } 

}
