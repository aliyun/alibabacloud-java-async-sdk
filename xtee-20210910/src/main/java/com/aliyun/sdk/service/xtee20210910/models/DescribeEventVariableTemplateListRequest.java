// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEventVariableTemplateListRequest} extends {@link RequestModel}
 *
 * <p>DescribeEventVariableTemplateListRequest</p>
 */
public class DescribeEventVariableTemplateListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("inputs")
    private String inputs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    private String regId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("templateCode")
    private String templateCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private DescribeEventVariableTemplateListRequest(Builder builder) {
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

    public static DescribeEventVariableTemplateListRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeEventVariableTemplateListRequest, Builder> {
        private String lang; 
        private String inputs; 
        private String regId; 
        private String templateCode; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(DescribeEventVariableTemplateListRequest request) {
            super(request);
            this.lang = request.lang;
            this.inputs = request.inputs;
            this.regId = request.regId;
            this.templateCode = request.templateCode;
            this.type = request.type;
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
         * inputs.
         */
        public Builder inputs(String inputs) {
            this.putQueryParameter("inputs", inputs);
            this.inputs = inputs;
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
         * templateCode.
         */
        public Builder templateCode(String templateCode) {
            this.putQueryParameter("templateCode", templateCode);
            this.templateCode = templateCode;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.putQueryParameter("type", type);
            this.type = type;
            return this;
        }

        @Override
        public DescribeEventVariableTemplateListRequest build() {
            return new DescribeEventVariableTemplateListRequest(this);
        } 

    } 

}
