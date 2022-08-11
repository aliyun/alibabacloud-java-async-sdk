// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ft20180713.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FtDynamicAddressDubboRequest} extends {@link RequestModel}
 *
 * <p>FtDynamicAddressDubboRequest</p>
 */
public class FtDynamicAddressDubboRequest extends Request {
    @Query
    @NameInMap("IntValue")
    private Integer intValue;

    @Query
    @NameInMap("StringValue")
    private String stringValue;

    private FtDynamicAddressDubboRequest(Builder builder) {
        super(builder);
        this.intValue = builder.intValue;
        this.stringValue = builder.stringValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FtDynamicAddressDubboRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return intValue
     */
    public Integer getIntValue() {
        return this.intValue;
    }

    /**
     * @return stringValue
     */
    public String getStringValue() {
        return this.stringValue;
    }

    public static final class Builder extends Request.Builder<FtDynamicAddressDubboRequest, Builder> {
        private Integer intValue; 
        private String stringValue; 

        private Builder() {
            super();
        } 

        private Builder(FtDynamicAddressDubboRequest request) {
            super(request);
            this.intValue = request.intValue;
            this.stringValue = request.stringValue;
        } 

        /**
         * IntValue.
         */
        public Builder intValue(Integer intValue) {
            this.putQueryParameter("IntValue", intValue);
            this.intValue = intValue;
            return this;
        }

        /**
         * StringValue.
         */
        public Builder stringValue(String stringValue) {
            this.putQueryParameter("StringValue", stringValue);
            this.stringValue = stringValue;
            return this;
        }

        @Override
        public FtDynamicAddressDubboRequest build() {
            return new FtDynamicAddressDubboRequest(this);
        } 

    } 

}
