// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.safe20220117.models;

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
 * {@link SafeChangeQueryRequest} extends {@link RequestModel}
 *
 * <p>SafeChangeQueryRequest</p>
 */
public class SafeChangeQueryRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AuthKey")
    private String authKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AuthSign")
    private String authSign;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NeedValidate")
    private Boolean needValidate;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("QueryType")
    private String queryType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ReqTimestamp")
    private Long reqTimestamp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReturnType")
    private Boolean returnType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SourceOrderId")
    private String sourceOrderId;

    private SafeChangeQueryRequest(Builder builder) {
        super(builder);
        this.authKey = builder.authKey;
        this.authSign = builder.authSign;
        this.needValidate = builder.needValidate;
        this.queryType = builder.queryType;
        this.reqTimestamp = builder.reqTimestamp;
        this.returnType = builder.returnType;
        this.sourceOrderId = builder.sourceOrderId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SafeChangeQueryRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authKey
     */
    public String getAuthKey() {
        return this.authKey;
    }

    /**
     * @return authSign
     */
    public String getAuthSign() {
        return this.authSign;
    }

    /**
     * @return needValidate
     */
    public Boolean getNeedValidate() {
        return this.needValidate;
    }

    /**
     * @return queryType
     */
    public String getQueryType() {
        return this.queryType;
    }

    /**
     * @return reqTimestamp
     */
    public Long getReqTimestamp() {
        return this.reqTimestamp;
    }

    /**
     * @return returnType
     */
    public Boolean getReturnType() {
        return this.returnType;
    }

    /**
     * @return sourceOrderId
     */
    public String getSourceOrderId() {
        return this.sourceOrderId;
    }

    public static final class Builder extends Request.Builder<SafeChangeQueryRequest, Builder> {
        private String authKey; 
        private String authSign; 
        private Boolean needValidate; 
        private String queryType; 
        private Long reqTimestamp; 
        private Boolean returnType; 
        private String sourceOrderId; 

        private Builder() {
            super();
        } 

        private Builder(SafeChangeQueryRequest request) {
            super(request);
            this.authKey = request.authKey;
            this.authSign = request.authSign;
            this.needValidate = request.needValidate;
            this.queryType = request.queryType;
            this.reqTimestamp = request.reqTimestamp;
            this.returnType = request.returnType;
            this.sourceOrderId = request.sourceOrderId;
        } 

        /**
         * AuthKey.
         */
        public Builder authKey(String authKey) {
            this.putBodyParameter("AuthKey", authKey);
            this.authKey = authKey;
            return this;
        }

        /**
         * AuthSign.
         */
        public Builder authSign(String authSign) {
            this.putBodyParameter("AuthSign", authSign);
            this.authSign = authSign;
            return this;
        }

        /**
         * NeedValidate.
         */
        public Builder needValidate(Boolean needValidate) {
            this.putBodyParameter("NeedValidate", needValidate);
            this.needValidate = needValidate;
            return this;
        }

        /**
         * QueryType.
         */
        public Builder queryType(String queryType) {
            this.putBodyParameter("QueryType", queryType);
            this.queryType = queryType;
            return this;
        }

        /**
         * ReqTimestamp.
         */
        public Builder reqTimestamp(Long reqTimestamp) {
            this.putBodyParameter("ReqTimestamp", reqTimestamp);
            this.reqTimestamp = reqTimestamp;
            return this;
        }

        /**
         * ReturnType.
         */
        public Builder returnType(Boolean returnType) {
            this.putQueryParameter("ReturnType", returnType);
            this.returnType = returnType;
            return this;
        }

        /**
         * SourceOrderId.
         */
        public Builder sourceOrderId(String sourceOrderId) {
            this.putBodyParameter("SourceOrderId", sourceOrderId);
            this.sourceOrderId = sourceOrderId;
            return this;
        }

        @Override
        public SafeChangeQueryRequest build() {
            return new SafeChangeQueryRequest(this);
        } 

    } 

}
