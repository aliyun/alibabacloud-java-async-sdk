// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.websitebuild20250429.models;

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
 * {@link PublishAppInstanceRequest} extends {@link RequestModel}
 *
 * <p>PublishAppInstanceRequest</p>
 */
public class PublishAppInstanceRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizId")
    private String bizId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeployChannel")
    private String deployChannel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LogicalNumber")
    private Integer logicalNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PublishNumber")
    private String publishNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WeappAction")
    private String weappAction;

    private PublishAppInstanceRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.bizId = builder.bizId;
        this.deployChannel = builder.deployChannel;
        this.description = builder.description;
        this.logicalNumber = builder.logicalNumber;
        this.publishNumber = builder.publishNumber;
        this.weappAction = builder.weappAction;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PublishAppInstanceRequest create() {
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
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return deployChannel
     */
    public String getDeployChannel() {
        return this.deployChannel;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return logicalNumber
     */
    public Integer getLogicalNumber() {
        return this.logicalNumber;
    }

    /**
     * @return publishNumber
     */
    public String getPublishNumber() {
        return this.publishNumber;
    }

    /**
     * @return weappAction
     */
    public String getWeappAction() {
        return this.weappAction;
    }

    public static final class Builder extends Request.Builder<PublishAppInstanceRequest, Builder> {
        private String regionId; 
        private String bizId; 
        private String deployChannel; 
        private String description; 
        private Integer logicalNumber; 
        private String publishNumber; 
        private String weappAction; 

        private Builder() {
            super();
        } 

        private Builder(PublishAppInstanceRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.bizId = request.bizId;
            this.deployChannel = request.deployChannel;
            this.description = request.description;
            this.logicalNumber = request.logicalNumber;
            this.publishNumber = request.publishNumber;
            this.weappAction = request.weappAction;
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
         * BizId.
         */
        public Builder bizId(String bizId) {
            this.putQueryParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * DeployChannel.
         */
        public Builder deployChannel(String deployChannel) {
            this.putQueryParameter("DeployChannel", deployChannel);
            this.deployChannel = deployChannel;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * LogicalNumber.
         */
        public Builder logicalNumber(Integer logicalNumber) {
            this.putQueryParameter("LogicalNumber", logicalNumber);
            this.logicalNumber = logicalNumber;
            return this;
        }

        /**
         * PublishNumber.
         */
        public Builder publishNumber(String publishNumber) {
            this.putQueryParameter("PublishNumber", publishNumber);
            this.publishNumber = publishNumber;
            return this;
        }

        /**
         * WeappAction.
         */
        public Builder weappAction(String weappAction) {
            this.putQueryParameter("WeappAction", weappAction);
            this.weappAction = weappAction;
            return this;
        }

        @Override
        public PublishAppInstanceRequest build() {
            return new PublishAppInstanceRequest(this);
        } 

    } 

}
