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
 * {@link AddInstanceWhiteListRequest} extends {@link RequestModel}
 *
 * <p>AddInstanceWhiteListRequest</p>
 */
public class AddInstanceWhiteListRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WhiteListItem")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> whiteListItem;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WhiteListType")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer whiteListType;

    private AddInstanceWhiteListRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.instanceId = builder.instanceId;
        this.whiteListItem = builder.whiteListItem;
        this.whiteListType = builder.whiteListType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddInstanceWhiteListRequest create() {
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
     * @return whiteListItem
     */
    public java.util.List<String> getWhiteListItem() {
        return this.whiteListItem;
    }

    /**
     * @return whiteListType
     */
    public Integer getWhiteListType() {
        return this.whiteListType;
    }

    public static final class Builder extends Request.Builder<AddInstanceWhiteListRequest, Builder> {
        private String regionId; 
        private String instanceId; 
        private java.util.List<String> whiteListItem; 
        private Integer whiteListType; 

        private Builder() {
            super();
        } 

        private Builder(AddInstanceWhiteListRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.instanceId = request.instanceId;
            this.whiteListItem = request.whiteListItem;
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
         * <p>172.0.0.20/30</p>
         */
        public Builder whiteListItem(java.util.List<String> whiteListItem) {
            String whiteListItemShrink = shrink(whiteListItem, "WhiteListItem", "json");
            this.putQueryParameter("WhiteListItem", whiteListItemShrink);
            this.whiteListItem = whiteListItem;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder whiteListType(Integer whiteListType) {
            this.putQueryParameter("WhiteListType", whiteListType);
            this.whiteListType = whiteListType;
            return this;
        }

        @Override
        public AddInstanceWhiteListRequest build() {
            return new AddInstanceWhiteListRequest(this);
        } 

    } 

}
