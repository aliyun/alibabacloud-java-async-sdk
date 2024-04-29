// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeImageEventOperationConditionRequest} extends {@link RequestModel}
 *
 * <p>DescribeImageEventOperationConditionRequest</p>
 */
public class DescribeImageEventOperationConditionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventType")
    private String eventType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
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
         * The alert type.
         * <p>
         * 
         * *   Set the value to **sensitiveFile**.
         */
        public Builder eventType(String eventType) {
            this.putQueryParameter("EventType", eventType);
            this.eventType = eventType;
            return this;
        }

        /**
         * The language of the content within the request and response. Default value: **zh**. Valid values:
         * <p>
         * 
         * *   **zh**: Chinese.
         * *   **en**: English.
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
