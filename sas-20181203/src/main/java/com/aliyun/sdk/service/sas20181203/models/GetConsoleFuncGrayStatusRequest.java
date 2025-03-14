// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link GetConsoleFuncGrayStatusRequest} extends {@link RequestModel}
 *
 * <p>GetConsoleFuncGrayStatusRequest</p>
 */
public class GetConsoleFuncGrayStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Condition")
    private String condition;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    private GetConsoleFuncGrayStatusRequest(Builder builder) {
        super(builder);
        this.condition = builder.condition;
        this.lang = builder.lang;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetConsoleFuncGrayStatusRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return condition
     */
    public String getCondition() {
        return this.condition;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    public static final class Builder extends Request.Builder<GetConsoleFuncGrayStatusRequest, Builder> {
        private String condition; 
        private String lang; 

        private Builder() {
            super();
        } 

        private Builder(GetConsoleFuncGrayStatusRequest request) {
            super(request);
            this.condition = request.condition;
            this.lang = request.lang;
        } 

        /**
         * <p>Name of the function module.</p>
         * 
         * <strong>example:</strong>
         * <p>vpcConsoleSwitch</p>
         */
        public Builder condition(String condition) {
            this.putQueryParameter("Condition", condition);
            this.condition = condition;
            return this;
        }

        /**
         * <p>Set the language type for request and response messages. Default value: <strong>zh</strong>. Values:</p>
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

        @Override
        public GetConsoleFuncGrayStatusRequest build() {
            return new GetConsoleFuncGrayStatusRequest(this);
        } 

    } 

}
