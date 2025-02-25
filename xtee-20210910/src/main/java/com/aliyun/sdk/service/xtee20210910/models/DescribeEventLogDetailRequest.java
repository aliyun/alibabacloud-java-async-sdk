// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEventLogDetailRequest} extends {@link RequestModel}
 *
 * <p>DescribeEventLogDetailRequest</p>
 */
public class DescribeEventLogDetailRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    private String regId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("reqIdByLog")
    @com.aliyun.core.annotation.Validation(required = true)
    private String reqIdByLog;

    private DescribeEventLogDetailRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.regId = builder.regId;
        this.reqIdByLog = builder.reqIdByLog;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEventLogDetailRequest create() {
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
     * @return regId
     */
    public String getRegId() {
        return this.regId;
    }

    /**
     * @return reqIdByLog
     */
    public String getReqIdByLog() {
        return this.reqIdByLog;
    }

    public static final class Builder extends Request.Builder<DescribeEventLogDetailRequest, Builder> {
        private String lang; 
        private String regId; 
        private String reqIdByLog; 

        private Builder() {
            super();
        } 

        private Builder(DescribeEventLogDetailRequest request) {
            super(request);
            this.lang = request.lang;
            this.regId = request.regId;
            this.reqIdByLog = request.reqIdByLog;
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
         * regId.
         */
        public Builder regId(String regId) {
            this.putQueryParameter("regId", regId);
            this.regId = regId;
            return this;
        }

        /**
         * reqIdByLog.
         */
        public Builder reqIdByLog(String reqIdByLog) {
            this.putQueryParameter("reqIdByLog", reqIdByLog);
            this.reqIdByLog = reqIdByLog;
            return this;
        }

        @Override
        public DescribeEventLogDetailRequest build() {
            return new DescribeEventLogDetailRequest(this);
        } 

    } 

}
