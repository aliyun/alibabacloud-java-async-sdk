// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveEventRequest} extends {@link RequestModel}
 *
 * <p>RemoveEventRequest</p>
 */
public class RemoveEventRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("id")
    private Long id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    private String regId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("templateCode")
    private String templateCode;

    private RemoveEventRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.createType = builder.createType;
        this.eventCode = builder.eventCode;
        this.id = builder.id;
        this.regId = builder.regId;
        this.templateCode = builder.templateCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveEventRequest create() {
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
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return regId
     */
    public String getRegId() {
        return this.regId;
    }

    /**
     * @return templateCode
     */
    public String getTemplateCode() {
        return this.templateCode;
    }

    public static final class Builder extends Request.Builder<RemoveEventRequest, Builder> {
        private String lang; 
        private String createType; 
        private String eventCode; 
        private Long id; 
        private String regId; 
        private String templateCode; 

        private Builder() {
            super();
        } 

        private Builder(RemoveEventRequest request) {
            super(request);
            this.lang = request.lang;
            this.createType = request.createType;
            this.eventCode = request.eventCode;
            this.id = request.id;
            this.regId = request.regId;
            this.templateCode = request.templateCode;
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
         * id.
         */
        public Builder id(Long id) {
            this.putQueryParameter("id", id);
            this.id = id;
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
         * templateCode.
         */
        public Builder templateCode(String templateCode) {
            this.putQueryParameter("templateCode", templateCode);
            this.templateCode = templateCode;
            return this;
        }

        @Override
        public RemoveEventRequest build() {
            return new RemoveEventRequest(this);
        } 

    } 

}
