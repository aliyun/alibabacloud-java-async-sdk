// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

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
         * <p>The duration for which IP addresses or CIDR blocks are blocked. Unit: seconds. The value <strong>0</strong> specifies that IP addresses or CIDR blocks are permanently blocked. This parameter is available only if you set <strong>OperationType</strong> to <strong>block</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>3000</p>
         */
        public Builder blockInterval(Integer blockInterval) {
            this.putBodyParameter("BlockInterval", blockInterval);
            this.blockInterval = blockInterval;
            return this;
        }

        /**
         * <p>The IP addresses that you want to block or unblock. Separate multiple IP addresses with commas (,). You can specify up to 1,000 IP addresses.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1.XXX.XXX.1,2.XXX.XXX.2</p>
         */
        public Builder IPList(String IPList) {
            this.putBodyParameter("IPList", IPList);
            this.IPList = IPList;
            return this;
        }

        /**
         * <p>The type of the operation.</p>
         * <ul>
         * <li>block</li>
         * <li>unblock</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>block</p>
         */
        public Builder operationType(String operationType) {
            this.putBodyParameter("OperationType", operationType);
            this.operationType = operationType;
            return this;
        }

        /**
         * <p>The type of the blocking duration. This parameter is available only if you set <strong>OperationType</strong> to <strong>block</strong>. Valid values:</p>
         * <ul>
         * <li><strong>cover</strong>: The blocking duration that is specified in the request takes effect.</li>
         * <li><strong>uncover</strong>: The longer one of the blocking duration that is specified in the request and the remaining blocking duration takes effect.</li>
         * <li>Default value: cover.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cover</p>
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
