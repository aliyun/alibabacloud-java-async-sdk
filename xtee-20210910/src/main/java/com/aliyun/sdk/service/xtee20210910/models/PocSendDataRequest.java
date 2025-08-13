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
 * {@link PocSendDataRequest} extends {@link RequestModel}
 *
 * <p>PocSendDataRequest</p>
 */
public class PocSendDataRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BatchNo")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long batchNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ParamsList")
    @com.aliyun.core.annotation.Validation(required = true)
    private String paramsList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegId")
    private String regId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Token")
    @com.aliyun.core.annotation.Validation(required = true)
    private String token;

    private PocSendDataRequest(Builder builder) {
        super(builder);
        this.batchNo = builder.batchNo;
        this.lang = builder.lang;
        this.paramsList = builder.paramsList;
        this.regId = builder.regId;
        this.token = builder.token;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PocSendDataRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return batchNo
     */
    public Long getBatchNo() {
        return this.batchNo;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return paramsList
     */
    public String getParamsList() {
        return this.paramsList;
    }

    /**
     * @return regId
     */
    public String getRegId() {
        return this.regId;
    }

    /**
     * @return token
     */
    public String getToken() {
        return this.token;
    }

    public static final class Builder extends Request.Builder<PocSendDataRequest, Builder> {
        private Long batchNo; 
        private String lang; 
        private String paramsList; 
        private String regId; 
        private String token; 

        private Builder() {
            super();
        } 

        private Builder(PocSendDataRequest request) {
            super(request);
            this.batchNo = request.batchNo;
            this.lang = request.lang;
            this.paramsList = request.paramsList;
            this.regId = request.regId;
            this.token = request.token;
        } 

        /**
         * <p>Starting position for batch operations, starting from 0.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>d0</p>
         */
        public Builder batchNo(Long batchNo) {
            this.putQueryParameter("BatchNo", batchNo);
            this.batchNo = batchNo;
            return this;
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
         * <p>Return parameters, in JSON format.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c222460c</p>
         */
        public Builder paramsList(String paramsList) {
            this.putQueryParameter("ParamsList", paramsList);
            this.paramsList = paramsList;
            return this;
        }

        /**
         * <p>Region code.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regId(String regId) {
            this.putQueryParameter("RegId", regId);
            this.regId = regId;
            return this;
        }

        /**
         * <p>Task token.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>a471aa421752633438</p>
         */
        public Builder token(String token) {
            this.putQueryParameter("Token", token);
            this.token = token;
            return this;
        }

        @Override
        public PocSendDataRequest build() {
            return new PocSendDataRequest(this);
        } 

    } 

}
