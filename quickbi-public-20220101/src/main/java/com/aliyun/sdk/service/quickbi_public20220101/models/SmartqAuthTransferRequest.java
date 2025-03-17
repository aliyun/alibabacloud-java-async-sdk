// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

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
 * {@link SmartqAuthTransferRequest} extends {@link RequestModel}
 *
 * <p>SmartqAuthTransferRequest</p>
 */
public class SmartqAuthTransferRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OriginUserId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String originUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetUserIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String targetUserIds;

    private SmartqAuthTransferRequest(Builder builder) {
        super(builder);
        this.originUserId = builder.originUserId;
        this.targetUserIds = builder.targetUserIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SmartqAuthTransferRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return originUserId
     */
    public String getOriginUserId() {
        return this.originUserId;
    }

    /**
     * @return targetUserIds
     */
    public String getTargetUserIds() {
        return this.targetUserIds;
    }

    public static final class Builder extends Request.Builder<SmartqAuthTransferRequest, Builder> {
        private String originUserId; 
        private String targetUserIds; 

        private Builder() {
            super();
        } 

        private Builder(SmartqAuthTransferRequest request) {
            super(request);
            this.originUserId = request.originUserId;
            this.targetUserIds = request.targetUserIds;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ASDHASD*************12EASDA</p>
         */
        public Builder originUserId(String originUserId) {
            this.putQueryParameter("OriginUserId", originUserId);
            this.originUserId = originUserId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12313***<em><strong><strong>dasfa,ASDASF</strong></strong></em>SDAFEEG</p>
         */
        public Builder targetUserIds(String targetUserIds) {
            this.putQueryParameter("TargetUserIds", targetUserIds);
            this.targetUserIds = targetUserIds;
            return this;
        }

        @Override
        public SmartqAuthTransferRequest build() {
            return new SmartqAuthTransferRequest(this);
        } 

    } 

}
