// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
         * <p>The alert type.</p>
         * <ul>
         * <li>Set the value to <strong>sensitiveFile</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>sensitiveFile</p>
         */
        public Builder eventType(String eventType) {
            this.putQueryParameter("EventType", eventType);
            this.eventType = eventType;
            return this;
        }

        /**
         * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese.</li>
         * <li><strong>en</strong>: English.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
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
