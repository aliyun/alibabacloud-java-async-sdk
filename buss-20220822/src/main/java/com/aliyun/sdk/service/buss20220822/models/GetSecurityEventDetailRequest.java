// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.buss20220822.models;

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
 * {@link GetSecurityEventDetailRequest} extends {@link RequestModel}
 *
 * <p>GetSecurityEventDetailRequest</p>
 */
public class GetSecurityEventDetailRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AliUid")
    private String aliUid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventId")
    private String eventId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("callerParentId")
    private Long callerParentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("callerType")
    private String callerType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("callerUid")
    private Long callerUid;

    private GetSecurityEventDetailRequest(Builder builder) {
        super(builder);
        this.aliUid = builder.aliUid;
        this.eventId = builder.eventId;
        this.callerParentId = builder.callerParentId;
        this.callerType = builder.callerType;
        this.callerUid = builder.callerUid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSecurityEventDetailRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aliUid
     */
    public String getAliUid() {
        return this.aliUid;
    }

    /**
     * @return eventId
     */
    public String getEventId() {
        return this.eventId;
    }

    /**
     * @return callerParentId
     */
    public Long getCallerParentId() {
        return this.callerParentId;
    }

    /**
     * @return callerType
     */
    public String getCallerType() {
        return this.callerType;
    }

    /**
     * @return callerUid
     */
    public Long getCallerUid() {
        return this.callerUid;
    }

    public static final class Builder extends Request.Builder<GetSecurityEventDetailRequest, Builder> {
        private String aliUid; 
        private String eventId; 
        private Long callerParentId; 
        private String callerType; 
        private Long callerUid; 

        private Builder() {
            super();
        } 

        private Builder(GetSecurityEventDetailRequest request) {
            super(request);
            this.aliUid = request.aliUid;
            this.eventId = request.eventId;
            this.callerParentId = request.callerParentId;
            this.callerType = request.callerType;
            this.callerUid = request.callerUid;
        } 

        /**
         * AliUid.
         */
        public Builder aliUid(String aliUid) {
            this.putQueryParameter("AliUid", aliUid);
            this.aliUid = aliUid;
            return this;
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
         * callerParentId.
         */
        public Builder callerParentId(Long callerParentId) {
            this.putQueryParameter("callerParentId", callerParentId);
            this.callerParentId = callerParentId;
            return this;
        }

        /**
         * callerType.
         */
        public Builder callerType(String callerType) {
            this.putQueryParameter("callerType", callerType);
            this.callerType = callerType;
            return this;
        }

        /**
         * callerUid.
         */
        public Builder callerUid(Long callerUid) {
            this.putQueryParameter("callerUid", callerUid);
            this.callerUid = callerUid;
            return this;
        }

        @Override
        public GetSecurityEventDetailRequest build() {
            return new GetSecurityEventDetailRequest(this);
        } 

    } 

}
