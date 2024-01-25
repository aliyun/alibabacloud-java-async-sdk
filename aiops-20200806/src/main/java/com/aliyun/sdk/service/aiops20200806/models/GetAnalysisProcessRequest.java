// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAnalysisProcessRequest} extends {@link RequestModel}
 *
 * <p>GetAnalysisProcessRequest</p>
 */
public class GetAnalysisProcessRequest extends Request {
    @Query
    @NameInMap("EventId")
    private String eventId;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("OperaUid")
    private String operaUid;

    private GetAnalysisProcessRequest(Builder builder) {
        super(builder);
        this.eventId = builder.eventId;
        this.lang = builder.lang;
        this.operaUid = builder.operaUid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAnalysisProcessRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return eventId
     */
    public String getEventId() {
        return this.eventId;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return operaUid
     */
    public String getOperaUid() {
        return this.operaUid;
    }

    public static final class Builder extends Request.Builder<GetAnalysisProcessRequest, Builder> {
        private String eventId; 
        private String lang; 
        private String operaUid; 

        private Builder() {
            super();
        } 

        private Builder(GetAnalysisProcessRequest request) {
            super(request);
            this.eventId = request.eventId;
            this.lang = request.lang;
            this.operaUid = request.operaUid;
        } 

        /**
         * EventId.
         */
        public Builder eventId(String eventId) {
            this.putQueryParameter("EventId", eventId);
            this.eventId = eventId;
            return this;
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
         * OperaUid.
         */
        public Builder operaUid(String operaUid) {
            this.putQueryParameter("OperaUid", operaUid);
            this.operaUid = operaUid;
            return this;
        }

        @Override
        public GetAnalysisProcessRequest build() {
            return new GetAnalysisProcessRequest(this);
        } 

    } 

}
