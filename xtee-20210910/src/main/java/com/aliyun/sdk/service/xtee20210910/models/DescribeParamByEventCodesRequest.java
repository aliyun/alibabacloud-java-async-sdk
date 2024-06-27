// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeParamByEventCodesRequest} extends {@link RequestModel}
 *
 * <p>DescribeParamByEventCodesRequest</p>
 */
public class DescribeParamByEventCodesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("eventCodes")
    @com.aliyun.core.annotation.Validation(required = true)
    private String eventCodes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("parma")
    private String parma;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    private String regId;

    private DescribeParamByEventCodesRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.eventCodes = builder.eventCodes;
        this.parma = builder.parma;
        this.regId = builder.regId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeParamByEventCodesRequest create() {
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
     * @return parma
     */
    public String getParma() {
        return this.parma;
    }

    /**
     * @return regId
     */
    public String getRegId() {
        return this.regId;
    }

    public static final class Builder extends Request.Builder<DescribeParamByEventCodesRequest, Builder> {
        private String lang; 
        private String eventCodes; 
        private String parma; 
        private String regId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeParamByEventCodesRequest request) {
            super(request);
            this.lang = request.lang;
            this.eventCodes = request.eventCodes;
            this.parma = request.parma;
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
         * parma.
         */
        public Builder parma(String parma) {
            this.putQueryParameter("parma", parma);
            this.parma = parma;
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
        public DescribeParamByEventCodesRequest build() {
            return new DescribeParamByEventCodesRequest(this);
        } 

    } 

}
