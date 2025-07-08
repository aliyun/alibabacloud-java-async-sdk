// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysms20170620.models;

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
 * {@link ExportCardSmsHistoryRequest} extends {@link RequestModel}
 *
 * <p>ExportCardSmsHistoryRequest</p>
 */
public class ExportCardSmsHistoryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApiSend")
    private Long apiSend;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CardTemplateType")
    private String cardTemplateType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GmtCreate")
    @com.aliyun.core.annotation.Validation(required = true)
    private String gmtCreate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReceiveState")
    private Long receiveState;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Receiver")
    private String receiver;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RenderState")
    private Long renderState;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SignName")
    private String signName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TmpCode")
    private String tmpCode;

    private ExportCardSmsHistoryRequest(Builder builder) {
        super(builder);
        this.apiSend = builder.apiSend;
        this.cardTemplateType = builder.cardTemplateType;
        this.gmtCreate = builder.gmtCreate;
        this.receiveState = builder.receiveState;
        this.receiver = builder.receiver;
        this.renderState = builder.renderState;
        this.signName = builder.signName;
        this.tmpCode = builder.tmpCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExportCardSmsHistoryRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiSend
     */
    public Long getApiSend() {
        return this.apiSend;
    }

    /**
     * @return cardTemplateType
     */
    public String getCardTemplateType() {
        return this.cardTemplateType;
    }

    /**
     * @return gmtCreate
     */
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    /**
     * @return receiveState
     */
    public Long getReceiveState() {
        return this.receiveState;
    }

    /**
     * @return receiver
     */
    public String getReceiver() {
        return this.receiver;
    }

    /**
     * @return renderState
     */
    public Long getRenderState() {
        return this.renderState;
    }

    /**
     * @return signName
     */
    public String getSignName() {
        return this.signName;
    }

    /**
     * @return tmpCode
     */
    public String getTmpCode() {
        return this.tmpCode;
    }

    public static final class Builder extends Request.Builder<ExportCardSmsHistoryRequest, Builder> {
        private Long apiSend; 
        private String cardTemplateType; 
        private String gmtCreate; 
        private Long receiveState; 
        private String receiver; 
        private Long renderState; 
        private String signName; 
        private String tmpCode; 

        private Builder() {
            super();
        } 

        private Builder(ExportCardSmsHistoryRequest request) {
            super(request);
            this.apiSend = request.apiSend;
            this.cardTemplateType = request.cardTemplateType;
            this.gmtCreate = request.gmtCreate;
            this.receiveState = request.receiveState;
            this.receiver = request.receiver;
            this.renderState = request.renderState;
            this.signName = request.signName;
            this.tmpCode = request.tmpCode;
        } 

        /**
         * ApiSend.
         */
        public Builder apiSend(Long apiSend) {
            this.putQueryParameter("ApiSend", apiSend);
            this.apiSend = apiSend;
            return this;
        }

        /**
         * CardTemplateType.
         */
        public Builder cardTemplateType(String cardTemplateType) {
            this.putQueryParameter("CardTemplateType", cardTemplateType);
            this.cardTemplateType = cardTemplateType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder gmtCreate(String gmtCreate) {
            this.putQueryParameter("GmtCreate", gmtCreate);
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * ReceiveState.
         */
        public Builder receiveState(Long receiveState) {
            this.putQueryParameter("ReceiveState", receiveState);
            this.receiveState = receiveState;
            return this;
        }

        /**
         * Receiver.
         */
        public Builder receiver(String receiver) {
            this.putQueryParameter("Receiver", receiver);
            this.receiver = receiver;
            return this;
        }

        /**
         * RenderState.
         */
        public Builder renderState(Long renderState) {
            this.putQueryParameter("RenderState", renderState);
            this.renderState = renderState;
            return this;
        }

        /**
         * SignName.
         */
        public Builder signName(String signName) {
            this.putQueryParameter("SignName", signName);
            this.signName = signName;
            return this;
        }

        /**
         * TmpCode.
         */
        public Builder tmpCode(String tmpCode) {
            this.putQueryParameter("TmpCode", tmpCode);
            this.tmpCode = tmpCode;
            return this;
        }

        @Override
        public ExportCardSmsHistoryRequest build() {
            return new ExportCardSmsHistoryRequest(this);
        } 

    } 

}
