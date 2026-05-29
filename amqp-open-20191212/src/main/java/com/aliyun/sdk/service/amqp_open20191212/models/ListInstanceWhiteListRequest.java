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
 * {@link ListInstanceWhiteListRequest} extends {@link RequestModel}
 *
 * <p>ListInstanceWhiteListRequest</p>
 */
public class ListInstanceWhiteListRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("whiteListType")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer whiteListType;

    private ListInstanceWhiteListRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.instanceId = builder.instanceId;
        this.whiteListType = builder.whiteListType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInstanceWhiteListRequest create() {
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
     * @return whiteListType
     */
    public Integer getWhiteListType() {
        return this.whiteListType;
    }

    public static final class Builder extends Request.Builder<ListInstanceWhiteListRequest, Builder> {
        private String regionId; 
        private String instanceId; 
        private Integer whiteListType; 

        private Builder() {
            super();
        } 

        private Builder(ListInstanceWhiteListRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.instanceId = request.instanceId;
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
         * <p>rabbitmq-cn-xxx</p>
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
         * <p>2</p>
         */
        public Builder whiteListType(Integer whiteListType) {
            this.putQueryParameter("whiteListType", whiteListType);
            this.whiteListType = whiteListType;
            return this;
        }

        @Override
        public ListInstanceWhiteListRequest build() {
            return new ListInstanceWhiteListRequest(this);
        } 

    } 

}
