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
 * {@link RollbackAppInstancePublishRequest} extends {@link RequestModel}
 *
 * <p>RollbackAppInstancePublishRequest</p>
 */
public class RollbackAppInstancePublishRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("PublishNumber")
    private String publishNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QuickRollback")
    private String quickRollback;

    private RollbackAppInstancePublishRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.bizId = builder.bizId;
        this.deployChannel = builder.deployChannel;
        this.publishNumber = builder.publishNumber;
        this.quickRollback = builder.quickRollback;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RollbackAppInstancePublishRequest create() {
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
     * @return publishNumber
     */
    public String getPublishNumber() {
        return this.publishNumber;
    }

    /**
     * @return quickRollback
     */
    public String getQuickRollback() {
        return this.quickRollback;
    }

    public static final class Builder extends Request.Builder<RollbackAppInstancePublishRequest, Builder> {
        private String regionId; 
        private String bizId; 
        private String deployChannel; 
        private String publishNumber; 
        private String quickRollback; 

        private Builder() {
            super();
        } 

        private Builder(RollbackAppInstancePublishRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.bizId = request.bizId;
            this.deployChannel = request.deployChannel;
            this.publishNumber = request.publishNumber;
            this.quickRollback = request.quickRollback;
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
         * PublishNumber.
         */
        public Builder publishNumber(String publishNumber) {
            this.putQueryParameter("PublishNumber", publishNumber);
            this.publishNumber = publishNumber;
            return this;
        }

        /**
         * QuickRollback.
         */
        public Builder quickRollback(String quickRollback) {
            this.putQueryParameter("QuickRollback", quickRollback);
            this.quickRollback = quickRollback;
            return this;
        }

        @Override
        public RollbackAppInstancePublishRequest build() {
            return new RollbackAppInstancePublishRequest(this);
        } 

    } 

}
