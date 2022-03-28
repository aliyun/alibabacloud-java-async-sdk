// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetDcdnFullDomainsBlockIPRequest} extends {@link RequestModel}
 *
 * <p>SetDcdnFullDomainsBlockIPRequest</p>
 */
public class SetDcdnFullDomainsBlockIPRequest extends Request {
    @Body
    @NameInMap("BlockInterval")
    private Integer blockInterval;

    @Body
    @NameInMap("IPList")
    @Validation(required = true)
    private String IPList;

    @Body
    @NameInMap("OperationType")
    @Validation(required = true)
    private String operationType;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    private SetDcdnFullDomainsBlockIPRequest(Builder builder) {
        super(builder);
        this.blockInterval = builder.blockInterval;
        this.IPList = builder.IPList;
        this.operationType = builder.operationType;
        this.ownerId = builder.ownerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetDcdnFullDomainsBlockIPRequest create() {
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
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    public static final class Builder extends Request.Builder<SetDcdnFullDomainsBlockIPRequest, Builder> {
        private Integer blockInterval; 
        private String IPList; 
        private String operationType; 
        private Long ownerId; 

        private Builder() {
            super();
        } 

        private Builder(SetDcdnFullDomainsBlockIPRequest request) {
            super(request);
            this.blockInterval = request.blockInterval;
            this.IPList = request.IPList;
            this.operationType = request.operationType;
            this.ownerId = request.ownerId;
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
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        @Override
        public SetDcdnFullDomainsBlockIPRequest build() {
            return new SetDcdnFullDomainsBlockIPRequest(this);
        } 

    } 

}
