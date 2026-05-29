// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.amqp_open20191212.models;

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
 * {@link RemoveInstanceWhiteListRequest} extends {@link RequestModel}
 *
 * <p>RemoveInstanceWhiteListRequest</p>
 */
public class RemoveInstanceWhiteListRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("whiteListItemId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long whiteListItemId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("whiteListType")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer whiteListType;

    private RemoveInstanceWhiteListRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.instanceId = builder.instanceId;
        this.whiteListItemId = builder.whiteListItemId;
        this.whiteListType = builder.whiteListType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveInstanceWhiteListRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return whiteListItemId
     */
    public Long getWhiteListItemId() {
        return this.whiteListItemId;
    }

    /**
     * @return whiteListType
     */
    public Integer getWhiteListType() {
        return this.whiteListType;
    }

    public static final class Builder extends Request.Builder<RemoveInstanceWhiteListRequest, Builder> {
        private String regionId; 
        private String instanceId; 
        private Long whiteListItemId; 
        private Integer whiteListType; 

        private Builder() {
            super();
        } 

        private Builder(RemoveInstanceWhiteListRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.instanceId = request.instanceId;
            this.whiteListItemId = request.whiteListItemId;
            this.whiteListType = request.whiteListType;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>amqp-cn-5yd3aw******</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>420</p>
         */
        public Builder whiteListItemId(Long whiteListItemId) {
            this.putQueryParameter("whiteListItemId", whiteListItemId);
            this.whiteListItemId = whiteListItemId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder whiteListType(Integer whiteListType) {
            this.putQueryParameter("whiteListType", whiteListType);
            this.whiteListType = whiteListType;
            return this;
        }

        @Override
        public RemoveInstanceWhiteListRequest build() {
            return new RemoveInstanceWhiteListRequest(this);
        } 

    } 

}
