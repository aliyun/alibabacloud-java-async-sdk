// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UdfClass} extends {@link TeaModel}
 *
 * <p>UdfClass</p>
 */
public class UdfClass extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("className")
    private String className;

    @com.aliyun.core.annotation.NameInMap("classType")
    private String classType;

    @com.aliyun.core.annotation.NameInMap("functionNames")
    private java.util.List < String > functionNames;

    @com.aliyun.core.annotation.NameInMap("udfArtifactName")
    private String udfArtifactName;

    private UdfClass(Builder builder) {
        this.className = builder.className;
        this.classType = builder.classType;
        this.functionNames = builder.functionNames;
        this.udfArtifactName = builder.udfArtifactName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UdfClass create() {
        return builder().build();
    }

    /**
     * @return className
     */
    public String getClassName() {
        return this.className;
    }

    /**
     * @return classType
     */
    public String getClassType() {
        return this.classType;
    }

    /**
     * @return functionNames
     */
    public java.util.List < String > getFunctionNames() {
        return this.functionNames;
    }

    /**
     * @return udfArtifactName
     */
    public String getUdfArtifactName() {
        return this.udfArtifactName;
    }

    public static final class Builder {
        private String className; 
        private String classType; 
        private java.util.List < String > functionNames; 
        private String udfArtifactName; 

        /**
         * className.
         */
        public Builder className(String className) {
            this.className = className;
            return this;
        }

        /**
         * classType.
         */
        public Builder classType(String classType) {
            this.classType = classType;
            return this;
        }

        /**
         * functionNames.
         */
        public Builder functionNames(java.util.List < String > functionNames) {
            this.functionNames = functionNames;
            return this;
        }

        /**
         * udfArtifactName.
         */
        public Builder udfArtifactName(String udfArtifactName) {
            this.udfArtifactName = udfArtifactName;
            return this;
        }

        public UdfClass build() {
            return new UdfClass(this);
        } 

    } 

}
