// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysms20170620.models;

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
 * {@link CreateShortUrlNewResponseBody} extends {@link TeaModel}
 *
 * <p>CreateShortUrlNewResponseBody</p>
 */
public class CreateShortUrlNewResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EventName")
    private String eventName;

    @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
    private String gmtCreateTime;

    @com.aliyun.core.annotation.NameInMap("GmtInvalidTime")
    private String gmtInvalidTime;

    @com.aliyun.core.annotation.NameInMap("Id")
    private String id;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ShortUrl")
    private String shortUrl;

    @com.aliyun.core.annotation.NameInMap("SourceUrl")
    private String sourceUrl;

    private CreateShortUrlNewResponseBody(Builder builder) {
        this.eventName = builder.eventName;
        this.gmtCreateTime = builder.gmtCreateTime;
        this.gmtInvalidTime = builder.gmtInvalidTime;
        this.id = builder.id;
        this.requestId = builder.requestId;
        this.shortUrl = builder.shortUrl;
        this.sourceUrl = builder.sourceUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateShortUrlNewResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return eventName
     */
    public String getEventName() {
        return this.eventName;
    }

    /**
     * @return gmtCreateTime
     */
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    /**
     * @return gmtInvalidTime
     */
    public String getGmtInvalidTime() {
        return this.gmtInvalidTime;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return shortUrl
     */
    public String getShortUrl() {
        return this.shortUrl;
    }

    /**
     * @return sourceUrl
     */
    public String getSourceUrl() {
        return this.sourceUrl;
    }

    public static final class Builder {
        private String eventName; 
        private String gmtCreateTime; 
        private String gmtInvalidTime; 
        private String id; 
        private String requestId; 
        private String shortUrl; 
        private String sourceUrl; 

        private Builder() {
        } 

        private Builder(CreateShortUrlNewResponseBody model) {
            this.eventName = model.eventName;
            this.gmtCreateTime = model.gmtCreateTime;
            this.gmtInvalidTime = model.gmtInvalidTime;
            this.id = model.id;
            this.requestId = model.requestId;
            this.shortUrl = model.shortUrl;
            this.sourceUrl = model.sourceUrl;
        } 

        /**
         * EventName.
         */
        public Builder eventName(String eventName) {
            this.eventName = eventName;
            return this;
        }

        /**
         * GmtCreateTime.
         */
        public Builder gmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }

        /**
         * GmtInvalidTime.
         */
        public Builder gmtInvalidTime(String gmtInvalidTime) {
            this.gmtInvalidTime = gmtInvalidTime;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ShortUrl.
         */
        public Builder shortUrl(String shortUrl) {
            this.shortUrl = shortUrl;
            return this;
        }

        /**
         * SourceUrl.
         */
        public Builder sourceUrl(String sourceUrl) {
            this.sourceUrl = sourceUrl;
            return this;
        }

        public CreateShortUrlNewResponseBody build() {
            return new CreateShortUrlNewResponseBody(this);
        } 

    } 

}
