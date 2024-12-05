// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ResultDatabasesFunctionsValue} extends {@link TeaModel}
 *
 * <p>ResultDatabasesFunctionsValue</p>
 */
public class ResultDatabasesFunctionsValue extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("signatures")
    private String signatures;

    private ResultDatabasesFunctionsValue(Builder builder) {
        this.name = builder.name;
        this.signatures = builder.signatures;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResultDatabasesFunctionsValue create() {
        return builder().build();
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return signatures
     */
    public String getSignatures() {
        return this.signatures;
    }

    public static final class Builder {
        private String name; 
        private String signatures; 

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * signatures.
         */
        public Builder signatures(String signatures) {
            this.signatures = signatures;
            return this;
        }

        public ResultDatabasesFunctionsValue build() {
            return new ResultDatabasesFunctionsValue(this);
        } 

    } 

}
