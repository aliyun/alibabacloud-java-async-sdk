// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyEventStatusRequest} extends {@link RequestModel}
 *
 * <p>ModifyEventStatusRequest</p>
 */
public class ModifyEventStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("createType")
    private String createType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("eventCode")
    private String eventCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("fromEventSatus")
    private String fromEventSatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    private String regId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("toEventSatus")
    private String toEventSatus;

    private ModifyEventStatusRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.createType = builder.createType;
        this.eventCode = builder.eventCode;
        this.fromEventSatus = builder.fromEventSatus;
        this.regId = builder.regId;
        this.toEventSatus = builder.toEventSatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyEventStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return createType
     */
    public String getCreateType() {
        return this.createType;
    }

    /**
     * @return eventCode
     */
    public String getEventCode() {
        return this.eventCode;
    }

    /**
     * @return fromEventSatus
     */
    public String getFromEventSatus() {
        return this.fromEventSatus;
    }

    /**
     * @return regId
     */
    public String getRegId() {
        return this.regId;
    }

    /**
     * @return toEventSatus
     */
    public String getToEventSatus() {
        return this.toEventSatus;
    }

    public static final class Builder extends Request.Builder<ModifyEventStatusRequest, Builder> {
        private String lang; 
        private String createType; 
        private String eventCode; 
        private String fromEventSatus; 
        private String regId; 
        private String toEventSatus; 

        private Builder() {
            super();
        } 

        private Builder(ModifyEventStatusRequest request) {
            super(request);
            this.lang = request.lang;
            this.createType = request.createType;
            this.eventCode = request.eventCode;
            this.fromEventSatus = request.fromEventSatus;
            this.regId = request.regId;
            this.toEventSatus = request.toEventSatus;
        } 

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * createType.
         */
        public Builder createType(String createType) {
            this.putQueryParameter("createType", createType);
            this.createType = createType;
            return this;
        }

        /**
         * eventCode.
         */
        public Builder eventCode(String eventCode) {
            this.putQueryParameter("eventCode", eventCode);
            this.eventCode = eventCode;
            return this;
        }

        /**
         * fromEventSatus.
         */
        public Builder fromEventSatus(String fromEventSatus) {
            this.putQueryParameter("fromEventSatus", fromEventSatus);
            this.fromEventSatus = fromEventSatus;
            return this;
        }

        /**
         * regId.
         */
        public Builder regId(String regId) {
            this.putQueryParameter("regId", regId);
            this.regId = regId;
            return this;
        }

        /**
         * toEventSatus.
         */
        public Builder toEventSatus(String toEventSatus) {
            this.putQueryParameter("toEventSatus", toEventSatus);
            this.toEventSatus = toEventSatus;
            return this;
        }

        @Override
        public ModifyEventStatusRequest build() {
            return new ModifyEventStatusRequest(this);
        } 

    } 

}
