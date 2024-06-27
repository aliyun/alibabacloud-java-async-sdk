// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRuleListByEventCodesListRequest} extends {@link RequestModel}
 *
 * <p>DescribeRuleListByEventCodesListRequest</p>
 */
public class DescribeRuleListByEventCodesListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("eventCodes")
    @com.aliyun.core.annotation.Validation(required = true)
    private String eventCodes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regId;

    private DescribeRuleListByEventCodesListRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.eventCodes = builder.eventCodes;
        this.regId = builder.regId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRuleListByEventCodesListRequest create() {
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
     * @return eventCodes
     */
    public String getEventCodes() {
        return this.eventCodes;
    }

    /**
     * @return regId
     */
    public String getRegId() {
        return this.regId;
    }

    public static final class Builder extends Request.Builder<DescribeRuleListByEventCodesListRequest, Builder> {
        private String lang; 
        private String eventCodes; 
        private String regId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeRuleListByEventCodesListRequest request) {
            super(request);
            this.lang = request.lang;
            this.eventCodes = request.eventCodes;
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
         * eventCodes.
         */
        public Builder eventCodes(String eventCodes) {
            this.putQueryParameter("eventCodes", eventCodes);
            this.eventCodes = eventCodes;
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
        public DescribeRuleListByEventCodesListRequest build() {
            return new DescribeRuleListByEventCodesListRequest(this);
        } 

    } 

}
