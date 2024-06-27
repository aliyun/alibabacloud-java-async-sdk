// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ImportTemplateEventRequest} extends {@link RequestModel}
 *
 * <p>ImportTemplateEventRequest</p>
 */
public class ImportTemplateEventRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("eventTemplateIds")
    private String eventTemplateIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    private String regId;

    private ImportTemplateEventRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.eventTemplateIds = builder.eventTemplateIds;
        this.regId = builder.regId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ImportTemplateEventRequest create() {
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
     * @return eventTemplateIds
     */
    public String getEventTemplateIds() {
        return this.eventTemplateIds;
    }

    /**
     * @return regId
     */
    public String getRegId() {
        return this.regId;
    }

    public static final class Builder extends Request.Builder<ImportTemplateEventRequest, Builder> {
        private String lang; 
        private String eventTemplateIds; 
        private String regId; 

        private Builder() {
            super();
        } 

        private Builder(ImportTemplateEventRequest request) {
            super(request);
            this.lang = request.lang;
            this.eventTemplateIds = request.eventTemplateIds;
            this.regId = request.regId;
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
         * eventTemplateIds.
         */
        public Builder eventTemplateIds(String eventTemplateIds) {
            this.putQueryParameter("eventTemplateIds", eventTemplateIds);
            this.eventTemplateIds = eventTemplateIds;
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

        @Override
        public ImportTemplateEventRequest build() {
            return new ImportTemplateEventRequest(this);
        } 

    } 

}
