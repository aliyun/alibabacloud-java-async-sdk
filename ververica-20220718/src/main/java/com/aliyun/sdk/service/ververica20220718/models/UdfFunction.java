// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

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
 * {@link UdfFunction} extends {@link TeaModel}
 *
 * <p>UdfFunction</p>
 */
public class UdfFunction extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("className")
    private String className;

    @com.aliyun.core.annotation.NameInMap("functionName")
    private String functionName;

    @com.aliyun.core.annotation.NameInMap("udfArtifactName")
    private String udfArtifactName;

    private UdfFunction(Builder builder) {
        this.className = builder.className;
        this.functionName = builder.functionName;
        this.udfArtifactName = builder.udfArtifactName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UdfFunction create() {
        return builder().build();
    }

    /**
     * @return className
     */
    public String getClassName() {
        return this.className;
    }

    /**
     * @return functionName
     */
    public String getFunctionName() {
        return this.functionName;
    }

    /**
     * @return udfArtifactName
     */
    public String getUdfArtifactName() {
        return this.udfArtifactName;
    }

    public static final class Builder {
        private String className; 
        private String functionName; 
        private String udfArtifactName; 

        /**
         * className.
         */
        public Builder className(String className) {
            this.className = className;
            return this;
        }

        /**
         * functionName.
         */
        public Builder functionName(String functionName) {
            this.functionName = functionName;
            return this;
        }

        /**
         * udfArtifactName.
         */
        public Builder udfArtifactName(String udfArtifactName) {
            this.udfArtifactName = udfArtifactName;
            return this;
        }

        public UdfFunction build() {
            return new UdfFunction(this);
        } 

    } 

}
