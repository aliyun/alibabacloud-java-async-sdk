// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20151123.models;

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
 * {@link UnblockSendingRequest} extends {@link RequestModel}
 *
 * <p>UnblockSendingRequest</p>
 */
public class UnblockSendingRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BlockEmail")
    @com.aliyun.core.annotation.Validation(required = true)
    private String blockEmail;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BlockType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String blockType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SenderEmail")
    @com.aliyun.core.annotation.Validation(required = true)
    private String senderEmail;

    private UnblockSendingRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.blockEmail = builder.blockEmail;
        this.blockType = builder.blockType;
        this.senderEmail = builder.senderEmail;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UnblockSendingRequest create() {
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
     * @return blockEmail
     */
    public String getBlockEmail() {
        return this.blockEmail;
    }

    /**
     * @return blockType
     */
    public String getBlockType() {
        return this.blockType;
    }

    /**
     * @return senderEmail
     */
    public String getSenderEmail() {
        return this.senderEmail;
    }

    public static final class Builder extends Request.Builder<UnblockSendingRequest, Builder> {
        private String regionId; 
        private String blockEmail; 
        private String blockType; 
        private String senderEmail; 

        private Builder() {
            super();
        } 

        private Builder(UnblockSendingRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.blockEmail = request.blockEmail;
            this.blockType = request.blockType;
            this.senderEmail = request.senderEmail;
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
         * <p>Blacklisted recipient&quot;s email address</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:recipient@example.com">recipient@example.com</a></p>
         */
        public Builder blockEmail(String blockEmail) {
            this.putQueryParameter("BlockEmail", blockEmail);
            this.blockEmail = blockEmail;
            return this;
        }

        /**
         * <p>Blacklist type</p>
         * <ul>
         * <li>UNSUB: Unsubscribe</li>
         * <li>REPORT: Report</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>UNSUB</p>
         */
        public Builder blockType(String blockType) {
            this.putQueryParameter("BlockType", blockType);
            this.blockType = blockType;
            return this;
        }

        /**
         * <p>Sender&quot;s email address</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:sender@example.com">sender@example.com</a></p>
         */
        public Builder senderEmail(String senderEmail) {
            this.putQueryParameter("SenderEmail", senderEmail);
            this.senderEmail = senderEmail;
            return this;
        }

        @Override
        public UnblockSendingRequest build() {
            return new UnblockSendingRequest(this);
        } 

    } 

}
