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
 * {@link SafeChangeCancelRequest} extends {@link RequestModel}
 *
 * <p>SafeChangeCancelRequest</p>
 */
public class SafeChangeCancelRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AuthKey")
    private String authKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AuthSign")
    private String authSign;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BgVid")
    private String bgVid;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OperateEmpNo")
    private String operateEmpNo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ReqTimestamp")
    private Long reqTimestamp;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SourceOrderId")
    private String sourceOrderId;

    private SafeChangeCancelRequest(Builder builder) {
        super(builder);
        this.authKey = builder.authKey;
        this.authSign = builder.authSign;
        this.bgVid = builder.bgVid;
        this.operateEmpNo = builder.operateEmpNo;
        this.reqTimestamp = builder.reqTimestamp;
        this.sourceOrderId = builder.sourceOrderId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SafeChangeCancelRequest create() {
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
     * @return bgVid
     */
    public String getBgVid() {
        return this.bgVid;
    }

    /**
     * @return operateEmpNo
     */
    public String getOperateEmpNo() {
        return this.operateEmpNo;
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

    public static final class Builder extends Request.Builder<SafeChangeCancelRequest, Builder> {
        private String authKey; 
        private String authSign; 
        private String bgVid; 
        private String operateEmpNo; 
        private Long reqTimestamp; 
        private String sourceOrderId; 

        private Builder() {
            super();
        } 

        private Builder(SafeChangeCancelRequest request) {
            super(request);
            this.authKey = request.authKey;
            this.authSign = request.authSign;
            this.bgVid = request.bgVid;
            this.operateEmpNo = request.operateEmpNo;
            this.reqTimestamp = request.reqTimestamp;
            this.sourceOrderId = request.sourceOrderId;
        } 

        /**
         * AuthKey.
         */
        public Builder authKey(String authKey) {
            this.putBodyParameter("AuthKey", authKey);
            this.authKey = authKey;
            return this;
        }

        /**
         * AuthSign.
         */
        public Builder authSign(String authSign) {
            this.putBodyParameter("AuthSign", authSign);
            this.authSign = authSign;
            return this;
        }

        /**
         * BgVid.
         */
        public Builder bgVid(String bgVid) {
            this.putBodyParameter("BgVid", bgVid);
            this.bgVid = bgVid;
            return this;
        }

        /**
         * OperateEmpNo.
         */
        public Builder operateEmpNo(String operateEmpNo) {
            this.putBodyParameter("OperateEmpNo", operateEmpNo);
            this.operateEmpNo = operateEmpNo;
            return this;
        }

        /**
         * ReqTimestamp.
         */
        public Builder reqTimestamp(Long reqTimestamp) {
            this.putBodyParameter("ReqTimestamp", reqTimestamp);
            this.reqTimestamp = reqTimestamp;
            return this;
        }

        /**
         * SourceOrderId.
         */
        public Builder sourceOrderId(String sourceOrderId) {
            this.putBodyParameter("SourceOrderId", sourceOrderId);
            this.sourceOrderId = sourceOrderId;
            return this;
        }

        @Override
        public SafeChangeCancelRequest build() {
            return new SafeChangeCancelRequest(this);
        } 

    } 

}
