// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link DeleteAlertRobotsRequest} extends {@link RequestModel}
 *
 * <p>DeleteAlertRobotsRequest</p>
 */
public class DeleteAlertRobotsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("robotIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> robotIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private DeleteAlertRobotsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.robotIds = builder.robotIds;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAlertRobotsRequest create() {
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
     * @return robotIds
     */
    public java.util.List<String> getRobotIds() {
        return this.robotIds;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<DeleteAlertRobotsRequest, Builder> {
        private String regionId; 
        private java.util.List<String> robotIds; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAlertRobotsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.robotIds = request.robotIds;
            this.type = request.type;
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
         * <p>The chatbot ID.</p>
         * <p>This parameter is required.</p>
         */
        public Builder robotIds(java.util.List<String> robotIds) {
            String robotIdsShrink = shrink(robotIds, "robotIds", "json");
            this.putQueryParameter("robotIds", robotIdsShrink);
            this.robotIds = robotIds;
            return this;
        }

        /**
         * <p>The chatbot type.</p>
         * 
         * <strong>example:</strong>
         * <p>DING</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("type", type);
            this.type = type;
            return this;
        }

        @Override
        public DeleteAlertRobotsRequest build() {
            return new DeleteAlertRobotsRequest(this);
        } 

    } 

}
