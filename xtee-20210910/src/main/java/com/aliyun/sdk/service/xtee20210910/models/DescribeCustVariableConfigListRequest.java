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
         * <p>Set the language type for requests and received messages, default value is <strong>zh</strong>. Values: </p>
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
         * <p>Configuration type</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>TIME_TYPE</p>
         */
        public Builder bizType(String bizType) {
            this.putQueryParameter("bizType", bizType);
            this.bizType = bizType;
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

        /**
         * <p>Time type</p>
         * 
         * <strong>example:</strong>
         * <p>CURRENT</p>
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
