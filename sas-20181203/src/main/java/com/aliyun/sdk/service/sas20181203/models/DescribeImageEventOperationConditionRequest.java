// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeImageEventOperationConditionRequest} extends {@link RequestModel}
 *
 * <p>DescribeImageEventOperationConditionRequest</p>
 */
public class DescribeImageEventOperationConditionRequest extends Request {
    @Query
    @NameInMap("EventType")
    private String eventType;

    @Query
    @NameInMap("Lang")
    private String lang;

    private DescribeImageEventOperationConditionRequest(Builder builder) {
        super(builder);
        this.eventType = builder.eventType;
        this.lang = builder.lang;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeImageEventOperationConditionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return eventType
     */
    public String getEventType() {
        return this.eventType;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    public static final class Builder extends Request.Builder<DescribeImageEventOperationConditionRequest, Builder> {
        private String eventType; 
        private String lang; 

        private Builder() {
            super();
        } 

        private Builder(DescribeImageEventOperationConditionRequest request) {
            super(request);
            this.eventType = request.eventType;
            this.lang = request.lang;
        } 

        /**
         * EventType.
         */
        public Builder eventType(String eventType) {
            this.putQueryParameter("EventType", eventType);
            this.eventType = eventType;
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

        @Override
        public DescribeImageEventOperationConditionRequest build() {
            return new DescribeImageEventOperationConditionRequest(this);
        } 

    } 

}
