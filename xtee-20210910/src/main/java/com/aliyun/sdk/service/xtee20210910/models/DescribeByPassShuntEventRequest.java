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
 * {@link DescribeByPassShuntEventRequest} extends {@link RequestModel}
 *
 * <p>DescribeByPassShuntEventRequest</p>
 */
public class DescribeByPassShuntEventRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("eventId")
    private Long eventId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    private String regId;

    private DescribeByPassShuntEventRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.eventId = builder.eventId;
        this.regId = builder.regId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeByPassShuntEventRequest create() {
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
     * @return eventId
     */
    public Long getEventId() {
        return this.eventId;
    }

    /**
     * @return regId
     */
    public String getRegId() {
        return this.regId;
    }

    public static final class Builder extends Request.Builder<DescribeByPassShuntEventRequest, Builder> {
        private String lang; 
        private Long eventId; 
        private String regId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeByPassShuntEventRequest request) {
            super(request);
            this.lang = request.lang;
            this.eventId = request.eventId;
            this.regId = request.regId;
        } 

        /**
         * <p>Sets the language type for requests and received messages, default value is <strong>zh</strong>. Values:</p>
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
         * <p>Event ID.</p>
         * 
         * <strong>example:</strong>
         * <p>25</p>
         */
        public Builder eventId(Long eventId) {
            this.putQueryParameter("eventId", eventId);
            this.eventId = eventId;
            return this;
        }

        /**
         * <p>Region code</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regId(String regId) {
            this.putQueryParameter("regId", regId);
            this.regId = regId;
            return this;
        }

        @Override
        public DescribeByPassShuntEventRequest build() {
            return new DescribeByPassShuntEventRequest(this);
        } 

    } 

}
