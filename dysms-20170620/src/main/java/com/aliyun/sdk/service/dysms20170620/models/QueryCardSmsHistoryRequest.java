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
 * {@link QueryCardSmsHistoryRequest} extends {@link RequestModel}
 *
 * <p>QueryCardSmsHistoryRequest</p>
 */
public class QueryCardSmsHistoryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApiSend")
    private Long apiSend;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CardTemplateType")
    private String cardTemplateType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GmtCreate")
    private String gmtCreate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxId")
    private Long maxId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MinId")
    private Long minId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNo")
    @com.aliyun.core.annotation.Validation(maximum = 20000000)
    private Long pageNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 10000)
    private Long pageSize;

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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private Long type;

    private QueryCardSmsHistoryRequest(Builder builder) {
        super(builder);
        this.apiSend = builder.apiSend;
        this.cardTemplateType = builder.cardTemplateType;
        this.gmtCreate = builder.gmtCreate;
        this.maxId = builder.maxId;
        this.minId = builder.minId;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.receiveState = builder.receiveState;
        this.receiver = builder.receiver;
        this.renderState = builder.renderState;
        this.signName = builder.signName;
        this.tmpCode = builder.tmpCode;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryCardSmsHistoryRequest create() {
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
     * @return maxId
     */
    public Long getMaxId() {
        return this.maxId;
    }

    /**
     * @return minId
     */
    public Long getMinId() {
        return this.minId;
    }

    /**
     * @return pageNo
     */
    public Long getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
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

    /**
     * @return type
     */
    public Long getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<QueryCardSmsHistoryRequest, Builder> {
        private Long apiSend; 
        private String cardTemplateType; 
        private String gmtCreate; 
        private Long maxId; 
        private Long minId; 
        private Long pageNo; 
        private Long pageSize; 
        private Long receiveState; 
        private String receiver; 
        private Long renderState; 
        private String signName; 
        private String tmpCode; 
        private Long type; 

        private Builder() {
            super();
        } 

        private Builder(QueryCardSmsHistoryRequest request) {
            super(request);
            this.apiSend = request.apiSend;
            this.cardTemplateType = request.cardTemplateType;
            this.gmtCreate = request.gmtCreate;
            this.maxId = request.maxId;
            this.minId = request.minId;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.receiveState = request.receiveState;
            this.receiver = request.receiver;
            this.renderState = request.renderState;
            this.signName = request.signName;
            this.tmpCode = request.tmpCode;
            this.type = request.type;
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
         * GmtCreate.
         */
        public Builder gmtCreate(String gmtCreate) {
            this.putQueryParameter("GmtCreate", gmtCreate);
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * MaxId.
         */
        public Builder maxId(Long maxId) {
            this.putQueryParameter("MaxId", maxId);
            this.maxId = maxId;
            return this;
        }

        /**
         * MinId.
         */
        public Builder minId(Long minId) {
            this.putQueryParameter("MinId", minId);
            this.minId = minId;
            return this;
        }

        /**
         * PageNo.
         */
        public Builder pageNo(Long pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
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

        /**
         * Type.
         */
        public Builder type(Long type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public QueryCardSmsHistoryRequest build() {
            return new QueryCardSmsHistoryRequest(this);
        } 

    } 

}
