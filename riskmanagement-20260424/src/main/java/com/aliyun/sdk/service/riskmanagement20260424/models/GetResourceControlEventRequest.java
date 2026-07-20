// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.riskmanagement20260424.models;

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
 * {@link GetResourceControlEventRequest} extends {@link RequestModel}
 *
 * <p>GetResourceControlEventRequest</p>
 */
public class GetResourceControlEventRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AliyunLang")
    private String aliyunLang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String eventId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventIdList")
    private java.util.List<String> eventIdList;

    private GetResourceControlEventRequest(Builder builder) {
        super(builder);
        this.aliyunLang = builder.aliyunLang;
        this.eventId = builder.eventId;
        this.eventIdList = builder.eventIdList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetResourceControlEventRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aliyunLang
     */
    public String getAliyunLang() {
        return this.aliyunLang;
    }

    /**
     * @return eventId
     */
    public String getEventId() {
        return this.eventId;
    }

    /**
     * @return eventIdList
     */
    public java.util.List<String> getEventIdList() {
        return this.eventIdList;
    }

    public static final class Builder extends Request.Builder<GetResourceControlEventRequest, Builder> {
        private String aliyunLang; 
        private String eventId; 
        private java.util.List<String> eventIdList; 

        private Builder() {
            super();
        } 

        private Builder(GetResourceControlEventRequest request) {
            super(request);
            this.aliyunLang = request.aliyunLang;
            this.eventId = request.eventId;
            this.eventIdList = request.eventIdList;
        } 

        /**
         * AliyunLang.
         */
        public Builder aliyunLang(String aliyunLang) {
            this.putQueryParameter("AliyunLang", aliyunLang);
            this.aliyunLang = aliyunLang;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>09C-2PpwIzkpx2zG2fuFrAH55CpJaTK</p>
         */
        public Builder eventId(String eventId) {
            this.putQueryParameter("EventId", eventId);
            this.eventId = eventId;
            return this;
        }

        /**
         * EventIdList.
         */
        public Builder eventIdList(java.util.List<String> eventIdList) {
            String eventIdListShrink = shrink(eventIdList, "EventIdList", "json");
            this.putQueryParameter("EventIdList", eventIdListShrink);
            this.eventIdList = eventIdList;
            return this;
        }

        @Override
        public GetResourceControlEventRequest build() {
            return new GetResourceControlEventRequest(this);
        } 

    } 

}
