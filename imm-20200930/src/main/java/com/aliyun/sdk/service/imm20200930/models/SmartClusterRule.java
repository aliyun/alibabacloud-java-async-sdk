// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SmartClusterRule} extends {@link TeaModel}
 *
 * <p>SmartClusterRule</p>
 */
public class SmartClusterRule extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Keywords")
    private java.util.List < String > keywords;

    @com.aliyun.core.annotation.NameInMap("Sensitivity")
    private Float sensitivity;

    private SmartClusterRule(Builder builder) {
        this.keywords = builder.keywords;
        this.sensitivity = builder.sensitivity;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SmartClusterRule create() {
        return builder().build();
    }

    /**
     * @return keywords
     */
    public java.util.List < String > getKeywords() {
        return this.keywords;
    }

    /**
     * @return sensitivity
     */
    public Float getSensitivity() {
        return this.sensitivity;
    }

    public static final class Builder {
        private java.util.List < String > keywords; 
        private Float sensitivity; 

        /**
         * Keywords.
         */
        public Builder keywords(java.util.List < String > keywords) {
            this.keywords = keywords;
            return this;
        }

        /**
         * Sensitivity.
         */
        public Builder sensitivity(Float sensitivity) {
            this.sensitivity = sensitivity;
            return this;
        }

        public SmartClusterRule build() {
            return new SmartClusterRule(this);
        } 

    } 

}
