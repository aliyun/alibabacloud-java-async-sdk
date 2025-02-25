// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCustVariableConfigListRequest} extends {@link RequestModel}
 *
 * <p>DescribeCustVariableConfigListRequest</p>
 */
public class DescribeCustVariableConfigListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("bizType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bizType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    private String regId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("timeType")
    private String timeType;

    private DescribeCustVariableConfigListRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.bizType = builder.bizType;
        this.regId = builder.regId;
        this.timeType = builder.timeType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCustVariableConfigListRequest create() {
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
     * @return bizType
     */
    public String getBizType() {
        return this.bizType;
    }

    /**
     * @return regId
     */
    public String getRegId() {
        return this.regId;
    }

    /**
     * @return timeType
     */
    public String getTimeType() {
        return this.timeType;
    }

    public static final class Builder extends Request.Builder<DescribeCustVariableConfigListRequest, Builder> {
        private String lang; 
        private String bizType; 
        private String regId; 
        private String timeType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCustVariableConfigListRequest request) {
            super(request);
            this.lang = request.lang;
            this.bizType = request.bizType;
            this.regId = request.regId;
            this.timeType = request.timeType;
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
         * bizType.
         */
        public Builder bizType(String bizType) {
            this.putQueryParameter("bizType", bizType);
            this.bizType = bizType;
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
         * timeType.
         */
        public Builder timeType(String timeType) {
            this.putQueryParameter("timeType", timeType);
            this.timeType = timeType;
            return this;
        }

        @Override
        public DescribeCustVariableConfigListRequest build() {
            return new DescribeCustVariableConfigListRequest(this);
        } 

    } 

}
