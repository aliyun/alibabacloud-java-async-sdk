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

    @Body
    @NameInMap("UpdateType")
    private String updateType;

    private SetDcdnFullDomainsBlockIPRequest(Builder builder) {
        super(builder);
        this.blockInterval = builder.blockInterval;
        this.IPList = builder.IPList;
        this.operationType = builder.operationType;
        this.updateType = builder.updateType;
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
     * @return updateType
     */
    public String getUpdateType() {
        return this.updateType;
    }

    public static final class Builder extends Request.Builder<SetDcdnFullDomainsBlockIPRequest, Builder> {
        private Integer blockInterval; 
        private String IPList; 
        private String operationType; 
        private String updateType; 

        private Builder() {
            super();
        } 

        private Builder(SetDcdnFullDomainsBlockIPRequest request) {
            super(request);
            this.blockInterval = request.blockInterval;
            this.IPList = request.IPList;
            this.operationType = request.operationType;
            this.updateType = request.updateType;
        } 

        /**
         * The duration for which IP addresses or CIDR blocks are blocked. Unit: seconds. The value **0** specifies that IP addresses or CIDR blocks are permanently blocked. This parameter is available only if you set **OperationType** to **block**.
         */
        public Builder blockInterval(Integer blockInterval) {
            this.putBodyParameter("BlockInterval", blockInterval);
            this.blockInterval = blockInterval;
            return this;
        }

        /**
         * The IP addresses that you want to block or unblock. Separate multiple IP addresses with commas (,). You can specify up to 1,000 IP addresses.
         */
        public Builder IPList(String IPList) {
            this.putBodyParameter("IPList", IPList);
            this.IPList = IPList;
            return this;
        }

        /**
         * The action that you want to perform. Valid values:
         * <p>
         * 
         * *   **block**
         * *   **unblock**
         */
        public Builder operationType(String operationType) {
            this.putBodyParameter("OperationType", operationType);
            this.operationType = operationType;
            return this;
        }

        /**
         * The type of the blocking duration. This parameter is available only if you set **OperationType** to **block**. Valid values:
         * <p>
         * 
         * *   **cover**: the blocking duration that is specified in the request takes effect.
         * *   **uncover**: the longer one of the blocking duration that is specified in the request and the remaining blocking duration takes effect.
         * *   Default value: cover.
         */
        public Builder updateType(String updateType) {
            this.putBodyParameter("UpdateType", updateType);
            this.updateType = updateType;
            return this;
        }

        @Override
        public SetDcdnFullDomainsBlockIPRequest build() {
            return new SetDcdnFullDomainsBlockIPRequest(this);
        } 

    } 

}
