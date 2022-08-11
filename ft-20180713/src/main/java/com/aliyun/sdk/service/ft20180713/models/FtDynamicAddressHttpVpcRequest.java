// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ft20180713.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FtDynamicAddressHttpVpcRequest} extends {@link RequestModel}
 *
 * <p>FtDynamicAddressHttpVpcRequest</p>
 */
public class FtDynamicAddressHttpVpcRequest extends Request {
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
    @NameInMap("P1")
    private String p1;

    @Query
    @NameInMap("StringValue")
    private java.util.Map < String, ? > stringValue;

    private FtDynamicAddressHttpVpcRequest(Builder builder) {
        super(builder);
        this.booleanParam = builder.booleanParam;
        this.defaultValue = builder.defaultValue;
        this.otherParam = builder.otherParam;
        this.p1 = builder.p1;
        this.stringValue = builder.stringValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FtDynamicAddressHttpVpcRequest create() {
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
     * @return p1
     */
    public String getP1() {
        return this.p1;
    }

    /**
     * @return stringValue
     */
    public java.util.Map < String, ? > getStringValue() {
        return this.stringValue;
    }

    public static final class Builder extends Request.Builder<FtDynamicAddressHttpVpcRequest, Builder> {
        private Boolean booleanParam; 
        private java.util.Map < String, ? > defaultValue; 
        private java.util.Map < String, ? > otherParam; 
        private String p1; 
        private java.util.Map < String, ? > stringValue; 

        private Builder() {
            super();
        } 

        private Builder(FtDynamicAddressHttpVpcRequest request) {
            super(request);
            this.booleanParam = request.booleanParam;
            this.defaultValue = request.defaultValue;
            this.otherParam = request.otherParam;
            this.p1 = request.p1;
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
         * P1.
         */
        public Builder p1(String p1) {
            this.putQueryParameter("P1", p1);
            this.p1 = p1;
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
        public FtDynamicAddressHttpVpcRequest build() {
            return new FtDynamicAddressHttpVpcRequest(this);
        } 

    } 

}
