// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeFieldListRequest} extends {@link RequestModel}
 *
 * <p>DescribeFieldListRequest</p>
 */
public class DescribeFieldListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("condition")
    private String condition;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("inputs")
    private String inputs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regId;

    private DescribeFieldListRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.condition = builder.condition;
        this.inputs = builder.inputs;
        this.regId = builder.regId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFieldListRequest create() {
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
     * @return condition
     */
    public String getCondition() {
        return this.condition;
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

    public static final class Builder extends Request.Builder<DescribeFieldListRequest, Builder> {
        private String lang; 
        private String condition; 
        private String inputs; 
        private String regId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeFieldListRequest request) {
            super(request);
            this.lang = request.lang;
            this.condition = request.condition;
            this.inputs = request.inputs;
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
         * condition.
         */
        public Builder condition(String condition) {
            this.putQueryParameter("condition", condition);
            this.condition = condition;
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

        @Override
        public DescribeFieldListRequest build() {
            return new DescribeFieldListRequest(this);
        } 

    } 

}
