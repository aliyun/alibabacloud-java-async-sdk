// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSimulationPreditInfoRequest} extends {@link RequestModel}
 *
 * <p>DescribeSimulationPreditInfoRequest</p>
 */
public class DescribeSimulationPreditInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("eventCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String eventCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    private String regId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("rulesStr")
    @com.aliyun.core.annotation.Validation(required = true)
    private String rulesStr;

    private DescribeSimulationPreditInfoRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.eventCode = builder.eventCode;
        this.regId = builder.regId;
        this.rulesStr = builder.rulesStr;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSimulationPreditInfoRequest create() {
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
     * @return regId
     */
    public String getRegId() {
        return this.regId;
    }

    /**
     * @return rulesStr
     */
    public String getRulesStr() {
        return this.rulesStr;
    }

    public static final class Builder extends Request.Builder<DescribeSimulationPreditInfoRequest, Builder> {
        private String lang; 
        private String eventCode; 
        private String regId; 
        private String rulesStr; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSimulationPreditInfoRequest request) {
            super(request);
            this.lang = request.lang;
            this.eventCode = request.eventCode;
            this.regId = request.regId;
            this.rulesStr = request.rulesStr;
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
         * eventCode.
         */
        public Builder eventCode(String eventCode) {
            this.putQueryParameter("eventCode", eventCode);
            this.eventCode = eventCode;
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
         * rulesStr.
         */
        public Builder rulesStr(String rulesStr) {
            this.putQueryParameter("rulesStr", rulesStr);
            this.rulesStr = rulesStr;
            return this;
        }

        @Override
        public DescribeSimulationPreditInfoRequest build() {
            return new DescribeSimulationPreditInfoRequest(this);
        } 

    } 

}
