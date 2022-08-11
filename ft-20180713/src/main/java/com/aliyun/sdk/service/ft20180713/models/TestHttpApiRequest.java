// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ft20180713.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TestHttpApiRequest} extends {@link RequestModel}
 *
 * <p>TestHttpApiRequest</p>
 */
public class TestHttpApiRequest extends Request {
    @Query
    @NameInMap("BooleanParam")
    private Boolean booleanParam;

    @Query
    @NameInMap("DefaultValue")
    private java.util.Map < String, ? > defaultValue;

    @Query
    @NameInMap("OtherParam")
    private java.util.Map < String, ? > otherParam;

    @Query
    @NameInMap("StringValue")
    private java.util.Map < String, ? > stringValue;

    private TestHttpApiRequest(Builder builder) {
        super(builder);
        this.booleanParam = builder.booleanParam;
        this.defaultValue = builder.defaultValue;
        this.otherParam = builder.otherParam;
        this.stringValue = builder.stringValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TestHttpApiRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return booleanParam
     */
    public Boolean getBooleanParam() {
        return this.booleanParam;
    }

    /**
     * @return defaultValue
     */
    public java.util.Map < String, ? > getDefaultValue() {
        return this.defaultValue;
    }

    /**
     * @return otherParam
     */
    public java.util.Map < String, ? > getOtherParam() {
        return this.otherParam;
    }

    /**
     * @return stringValue
     */
    public java.util.Map < String, ? > getStringValue() {
        return this.stringValue;
    }

    public static final class Builder extends Request.Builder<TestHttpApiRequest, Builder> {
        private Boolean booleanParam; 
        private java.util.Map < String, ? > defaultValue; 
        private java.util.Map < String, ? > otherParam; 
        private java.util.Map < String, ? > stringValue; 

        private Builder() {
            super();
        } 

        private Builder(TestHttpApiRequest request) {
            super(request);
            this.booleanParam = request.booleanParam;
            this.defaultValue = request.defaultValue;
            this.otherParam = request.otherParam;
            this.stringValue = request.stringValue;
        } 

        /**
         * BooleanParam.
         */
        public Builder booleanParam(Boolean booleanParam) {
            this.putQueryParameter("BooleanParam", booleanParam);
            this.booleanParam = booleanParam;
            return this;
        }

        /**
         * DefaultValue.
         */
        public Builder defaultValue(java.util.Map < String, ? > defaultValue) {
            String defaultValueShrink = shrink(defaultValue, "DefaultValue", "json");
            this.putQueryParameter("DefaultValue", defaultValueShrink);
            this.defaultValue = defaultValue;
            return this;
        }

        /**
         * OtherParam.
         */
        public Builder otherParam(java.util.Map < String, ? > otherParam) {
            String otherParamShrink = shrink(otherParam, "OtherParam", "json");
            this.putQueryParameter("OtherParam", otherParamShrink);
            this.otherParam = otherParam;
            return this;
        }

        /**
         * StringValue.
         */
        public Builder stringValue(java.util.Map < String, ? > stringValue) {
            String stringValueShrink = shrink(stringValue, "StringValue", "json");
            this.putQueryParameter("StringValue", stringValueShrink);
            this.stringValue = stringValue;
            return this;
        }

        @Override
        public TestHttpApiRequest build() {
            return new TestHttpApiRequest(this);
        } 

    } 

}
