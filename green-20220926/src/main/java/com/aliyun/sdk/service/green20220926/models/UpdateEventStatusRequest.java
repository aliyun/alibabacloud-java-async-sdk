// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220926.models;

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
 * {@link UpdateEventStatusRequest} extends {@link RequestModel}
 *
 * <p>UpdateEventStatusRequest</p>
 */
public class UpdateEventStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventIds")
    private java.util.List<String> eventIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OperationCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String operationCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OperationParams")
    private String operationParams;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Source")
    private String source;

    private UpdateEventStatusRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.eventIds = builder.eventIds;
        this.operationCode = builder.operationCode;
        this.operationParams = builder.operationParams;
        this.regionId = builder.regionId;
        this.source = builder.source;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateEventStatusRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return eventIds
     */
    public java.util.List<String> getEventIds() {
        return this.eventIds;
    }

    /**
     * @return operationCode
     */
    public String getOperationCode() {
        return this.operationCode;
    }

    /**
     * @return operationParams
     */
    public String getOperationParams() {
        return this.operationParams;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    public static final class Builder extends Request.Builder<UpdateEventStatusRequest, Builder> {
        private String appId; 
        private java.util.List<String> eventIds; 
        private String operationCode; 
        private String operationParams; 
        private String regionId; 
        private String source; 

        private Builder() {
            super();
        } 

        private Builder(UpdateEventStatusRequest request) {
            super(request);
            this.appId = request.appId;
            this.eventIds = request.eventIds;
            this.operationCode = request.operationCode;
            this.operationParams = request.operationParams;
            this.regionId = request.regionId;
            this.source = request.source;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>id-xxx</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * EventIds.
         */
        public Builder eventIds(java.util.List<String> eventIds) {
            String eventIdsShrink = shrink(eventIds, "EventIds", "json");
            this.putQueryParameter("EventIds", eventIdsShrink);
            this.eventIds = eventIds;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>resolve</p>
         */
        public Builder operationCode(String operationCode) {
            this.putQueryParameter("OperationCode", operationCode);
            this.operationCode = operationCode;
            return this;
        }

        /**
         * OperationParams.
         */
        public Builder operationParams(String operationParams) {
            this.putQueryParameter("OperationParams", operationParams);
            this.operationParams = operationParams;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Source.
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        @Override
        public UpdateEventStatusRequest build() {
            return new UpdateEventStatusRequest(this);
        } 

    } 

}
