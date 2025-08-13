// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

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
 * {@link DescribeEventDetailByRequestIdRequest} extends {@link RequestModel}
 *
 * <p>DescribeEventDetailByRequestIdRequest</p>
 */
public class DescribeEventDetailByRequestIdRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("eventCode")
    private String eventCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("eventTime")
    private Long eventTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("sRequestId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sRequestId;

    private DescribeEventDetailByRequestIdRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.eventCode = builder.eventCode;
        this.eventTime = builder.eventTime;
        this.regId = builder.regId;
        this.sRequestId = builder.sRequestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEventDetailByRequestIdRequest create() {
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
     * @return eventCode
     */
    public String getEventCode() {
        return this.eventCode;
    }

    /**
     * @return eventTime
     */
    public Long getEventTime() {
        return this.eventTime;
    }

    /**
     * @return regId
     */
    public String getRegId() {
        return this.regId;
    }

    /**
     * @return sRequestId
     */
    public String getSRequestId() {
        return this.sRequestId;
    }

    public static final class Builder extends Request.Builder<DescribeEventDetailByRequestIdRequest, Builder> {
        private String lang; 
        private String eventCode; 
        private Long eventTime; 
        private String regId; 
        private String sRequestId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeEventDetailByRequestIdRequest request) {
            super(request);
            this.lang = request.lang;
            this.eventCode = request.eventCode;
            this.eventTime = request.eventTime;
            this.regId = request.regId;
            this.sRequestId = request.sRequestId;
        } 

        /**
         * <p>Sets the language type for requests and received messages, with a default value of <strong>zh</strong>. Values: </p>
         * <ul>
         * <li><strong>zh</strong>: Chinese</li>
         * <li><strong>en</strong>: English</li>
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

        /**
         * <p>Event code</p>
         * 
         * <strong>example:</strong>
         * <p>de_azywkh7523</p>
         */
        public Builder eventCode(String eventCode) {
            this.putQueryParameter("eventCode", eventCode);
            this.eventCode = eventCode;
            return this;
        }

        /**
         * <p>Event execution time</p>
         * 
         * <strong>example:</strong>
         * <p>1752571330000</p>
         */
        public Builder eventTime(Long eventTime) {
            this.putQueryParameter("eventTime", eventTime);
            this.eventTime = eventTime;
            return this;
        }

        /**
         * <p>Region code</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regId(String regId) {
            this.putQueryParameter("regId", regId);
            this.regId = regId;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>BD6B08EC-1B44-5378-8838-C76A36415C55</p>
         */
        public Builder sRequestId(String sRequestId) {
            this.putQueryParameter("sRequestId", sRequestId);
            this.sRequestId = sRequestId;
            return this;
        }

        @Override
        public DescribeEventDetailByRequestIdRequest build() {
            return new DescribeEventDetailByRequestIdRequest(this);
        } 

    } 

}
