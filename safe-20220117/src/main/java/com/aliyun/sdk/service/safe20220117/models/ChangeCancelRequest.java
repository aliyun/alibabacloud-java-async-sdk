// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.safe20220117.models;

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
 * {@link ChangeCancelRequest} extends {@link RequestModel}
 *
 * <p>ChangeCancelRequest</p>
 */
public class ChangeCancelRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthKey")
    private String authKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthSign")
    private String authSign;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReqTimestamp")
    private Long reqTimestamp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceOrderId")
    private String sourceOrderId;

    private ChangeCancelRequest(Builder builder) {
        super(builder);
        this.authKey = builder.authKey;
        this.authSign = builder.authSign;
        this.reqTimestamp = builder.reqTimestamp;
        this.sourceOrderId = builder.sourceOrderId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ChangeCancelRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authKey
     */
    public String getAuthKey() {
        return this.authKey;
    }

    /**
     * @return authSign
     */
    public String getAuthSign() {
        return this.authSign;
    }

    /**
     * @return reqTimestamp
     */
    public Long getReqTimestamp() {
        return this.reqTimestamp;
    }

    /**
     * @return sourceOrderId
     */
    public String getSourceOrderId() {
        return this.sourceOrderId;
    }

    public static final class Builder extends Request.Builder<ChangeCancelRequest, Builder> {
        private String authKey; 
        private String authSign; 
        private Long reqTimestamp; 
        private String sourceOrderId; 

        private Builder() {
            super();
        } 

        private Builder(ChangeCancelRequest request) {
            super(request);
            this.authKey = request.authKey;
            this.authSign = request.authSign;
            this.reqTimestamp = request.reqTimestamp;
            this.sourceOrderId = request.sourceOrderId;
        } 

        /**
         * AuthKey.
         */
        public Builder authKey(String authKey) {
            this.putQueryParameter("AuthKey", authKey);
            this.authKey = authKey;
            return this;
        }

        /**
         * AuthSign.
         */
        public Builder authSign(String authSign) {
            this.putQueryParameter("AuthSign", authSign);
            this.authSign = authSign;
            return this;
        }

        /**
         * ReqTimestamp.
         */
        public Builder reqTimestamp(Long reqTimestamp) {
            this.putQueryParameter("ReqTimestamp", reqTimestamp);
            this.reqTimestamp = reqTimestamp;
            return this;
        }

        /**
         * SourceOrderId.
         */
        public Builder sourceOrderId(String sourceOrderId) {
            this.putQueryParameter("SourceOrderId", sourceOrderId);
            this.sourceOrderId = sourceOrderId;
            return this;
        }

        @Override
        public ChangeCancelRequest build() {
            return new ChangeCancelRequest(this);
        } 

    } 

}
