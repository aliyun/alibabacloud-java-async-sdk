// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

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
 * {@link AddInboundNumberRequest} extends {@link RequestModel}
 *
 * <p>AddInboundNumberRequest</p>
 */
public class AddInboundNumberRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String applicationCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InboundNumbers")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> inboundNumbers;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InboundType")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long inboundType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LineCode")
    private String lineCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private AddInboundNumberRequest(Builder builder) {
        super(builder);
        this.applicationCode = builder.applicationCode;
        this.inboundNumbers = builder.inboundNumbers;
        this.inboundType = builder.inboundType;
        this.lineCode = builder.lineCode;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddInboundNumberRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationCode
     */
    public String getApplicationCode() {
        return this.applicationCode;
    }

    /**
     * @return inboundNumbers
     */
    public java.util.List<String> getInboundNumbers() {
        return this.inboundNumbers;
    }

    /**
     * @return inboundType
     */
    public Long getInboundType() {
        return this.inboundType;
    }

    /**
     * @return lineCode
     */
    public String getLineCode() {
        return this.lineCode;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static final class Builder extends Request.Builder<AddInboundNumberRequest, Builder> {
        private String applicationCode; 
        private java.util.List<String> inboundNumbers; 
        private Long inboundType; 
        private String lineCode; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(AddInboundNumberRequest request) {
            super(request);
            this.applicationCode = request.applicationCode;
            this.inboundNumbers = request.inboundNumbers;
            this.inboundType = request.inboundType;
            this.lineCode = request.lineCode;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DLWERWLD</p>
         */
        public Builder applicationCode(String applicationCode) {
            this.putQueryParameter("ApplicationCode", applicationCode);
            this.applicationCode = applicationCode;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder inboundNumbers(java.util.List<String> inboundNumbers) {
            String inboundNumbersShrink = shrink(inboundNumbers, "InboundNumbers", "json");
            this.putQueryParameter("InboundNumbers", inboundNumbersShrink);
            this.inboundNumbers = inboundNumbers;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        public Builder inboundType(Long inboundType) {
            this.putQueryParameter("InboundType", inboundType);
            this.inboundType = inboundType;
            return this;
        }

        /**
         * LineCode.
         */
        public Builder lineCode(String lineCode) {
            this.putQueryParameter("LineCode", lineCode);
            this.lineCode = lineCode;
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

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        @Override
        public AddInboundNumberRequest build() {
            return new AddInboundNumberRequest(this);
        } 

    } 

}
