// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetCdnFullDomainsBlockIPRequest} extends {@link RequestModel}
 *
 * <p>SetCdnFullDomainsBlockIPRequest</p>
 */
public class SetCdnFullDomainsBlockIPRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BlockInterval")
    private Integer blockInterval;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IPList")
    @com.aliyun.core.annotation.Validation(required = true)
    private String IPList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OperationType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String operationType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UpdateType")
    private String updateType;

    private SetCdnFullDomainsBlockIPRequest(Builder builder) {
        super(builder);
        this.blockInterval = builder.blockInterval;
        this.IPList = builder.IPList;
        this.operationType = builder.operationType;
        this.updateType = builder.updateType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetCdnFullDomainsBlockIPRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return blockInterval
     */
    public Integer getBlockInterval() {
        return this.blockInterval;
    }

    /**
     * @return IPList
     */
    public String getIPList() {
        return this.IPList;
    }

    /**
     * @return operationType
     */
    public String getOperationType() {
        return this.operationType;
    }

    /**
     * @return updateType
     */
    public String getUpdateType() {
        return this.updateType;
    }

    public static final class Builder extends Request.Builder<SetCdnFullDomainsBlockIPRequest, Builder> {
        private Integer blockInterval; 
        private String IPList; 
        private String operationType; 
        private String updateType; 

        private Builder() {
            super();
        } 

        private Builder(SetCdnFullDomainsBlockIPRequest request) {
            super(request);
            this.blockInterval = request.blockInterval;
            this.IPList = request.IPList;
            this.operationType = request.operationType;
            this.updateType = request.updateType;
        } 

        /**
         * BlockInterval.
         */
        public Builder blockInterval(Integer blockInterval) {
            this.putBodyParameter("BlockInterval", blockInterval);
            this.blockInterval = blockInterval;
            return this;
        }

        /**
         * IPList.
         */
        public Builder IPList(String IPList) {
            this.putBodyParameter("IPList", IPList);
            this.IPList = IPList;
            return this;
        }

        /**
         * OperationType.
         */
        public Builder operationType(String operationType) {
            this.putBodyParameter("OperationType", operationType);
            this.operationType = operationType;
            return this;
        }

        /**
         * UpdateType.
         */
        public Builder updateType(String updateType) {
            this.putBodyParameter("UpdateType", updateType);
            this.updateType = updateType;
            return this;
        }

        @Override
        public SetCdnFullDomainsBlockIPRequest build() {
            return new SetCdnFullDomainsBlockIPRequest(this);
        } 

    } 

}
