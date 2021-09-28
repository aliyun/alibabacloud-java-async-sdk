// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link CORSConfiguration} extends {@link TeaModel}
 *
 * <p>CORSConfiguration</p>
 */
public class CORSConfiguration extends TeaModel {
    @NameInMap("CORSRule")
    private java.util.List < CORSRule > CORSRule;

    @NameInMap("ResponseVary")
    private Boolean responseVary;


    private CORSConfiguration(Builder builder) {
        this.CORSRule = builder.CORSRule;
        this.responseVary = builder.responseVary;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CORSConfiguration create() {
        return builder().build();
    }

    /**
     * @return CORSRule
     */
    public java.util.List < CORSRule > CORSRule() {
        return this.CORSRule;
    }

    /**
     * @return responseVary
     */
    public Boolean responseVary() {
        return this.responseVary;
    }

    public static final class Builder {
        private java.util.List < CORSRule > CORSRule; 
        private Boolean responseVary; 

        /**
         * <p>description</p>
         */
        public Builder CORSRule(java.util.List < CORSRule > CORSRule) {
            this.CORSRule = CORSRule;
            return this;
        }

        /**
         * <p>description</p>
         */
        public Builder responseVary(Boolean responseVary) {
            this.responseVary = responseVary;
            return this;
        }

        public CORSConfiguration build() {
            return new CORSConfiguration(this);
        } 

    } 

}
