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
 * {@link DescribeEventVariableTemplateBindRequest} extends {@link RequestModel}
 *
 * <p>DescribeEventVariableTemplateBindRequest</p>
 */
public class DescribeEventVariableTemplateBindRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("inputs")
    @com.aliyun.core.annotation.Validation(required = true)
    private String inputs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    private String regId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("templateCode")
    private String templateCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private DescribeEventVariableTemplateBindRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.inputs = builder.inputs;
        this.regId = builder.regId;
        this.templateCode = builder.templateCode;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEventVariableTemplateBindRequest create() {
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
     * @return inputs
     */
    public String getInputs() {
        return this.inputs;
    }

    /**
     * @return regId
     */
    public String getRegId() {
        return this.regId;
    }

    /**
     * @return templateCode
     */
    public String getTemplateCode() {
        return this.templateCode;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<DescribeEventVariableTemplateBindRequest, Builder> {
        private String lang; 
        private String inputs; 
        private String regId; 
        private String templateCode; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(DescribeEventVariableTemplateBindRequest request) {
            super(request);
            this.lang = request.lang;
            this.inputs = request.inputs;
            this.regId = request.regId;
            this.templateCode = request.templateCode;
            this.type = request.type;
        } 

        /**
         * <p>Sets the language type for requests and received messages. Default value is <strong>zh</strong>. Values:</p>
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
         * <p>Input parameters, separated by commas if multiple.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>age,ip</p>
         */
        public Builder inputs(String inputs) {
            this.putQueryParameter("inputs", inputs);
            this.inputs = inputs;
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
         * <p>Template code.</p>
         * 
         * <strong>example:</strong>
         * <p>register</p>
         */
        public Builder templateCode(String templateCode) {
            this.putQueryParameter("templateCode", templateCode);
            this.templateCode = templateCode;
            return this;
        }

        /**
         * <p>Type</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>NATIVE</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("type", type);
            this.type = type;
            return this;
        }

        @Override
        public DescribeEventVariableTemplateBindRequest build() {
            return new DescribeEventVariableTemplateBindRequest(this);
        } 

    } 

}
