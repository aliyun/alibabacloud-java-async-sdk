// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FunctionInput} extends {@link TeaModel}
 *
 * <p>FunctionInput</p>
 */
public class FunctionInput extends TeaModel {
    @NameInMap("ClassName")
    private String className;

    @NameInMap("CreateTime")
    private Integer createTime;

    @NameInMap("FunctionName")
    private String functionName;

    @NameInMap("FunctionType")
    private String functionType;

    @NameInMap("OwnerName")
    private String ownerName;

    @NameInMap("OwnerType")
    private String ownerType;

    @NameInMap("ResourceUri")
    private java.util.List < ResourceUri > resourceUri;

    private FunctionInput(Builder builder) {
        this.className = builder.className;
        this.createTime = builder.createTime;
        this.functionName = builder.functionName;
        this.functionType = builder.functionType;
        this.ownerName = builder.ownerName;
        this.ownerType = builder.ownerType;
        this.resourceUri = builder.resourceUri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FunctionInput create() {
        return builder().build();
    }

    /**
     * @return className
     */
    public String getClassName() {
        return this.className;
    }

    /**
     * @return createTime
     */
    public Integer getCreateTime() {
        return this.createTime;
    }

    /**
     * @return functionName
     */
    public String getFunctionName() {
        return this.functionName;
    }

    /**
     * @return functionType
     */
    public String getFunctionType() {
        return this.functionType;
    }

    /**
     * @return ownerName
     */
    public String getOwnerName() {
        return this.ownerName;
    }

    /**
     * @return ownerType
     */
    public String getOwnerType() {
        return this.ownerType;
    }

    /**
     * @return resourceUri
     */
    public java.util.List < ResourceUri > getResourceUri() {
        return this.resourceUri;
    }

    public static final class Builder {
        private String className; 
        private Integer createTime; 
        private String functionName; 
        private String functionType; 
        private String ownerName; 
        private String ownerType; 
        private java.util.List < ResourceUri > resourceUri; 

        /**
         * ClassName.
         */
        public Builder className(String className) {
            this.className = className;
            return this;
        }

        /**
         * CreateTime.
         */
        public Builder createTime(Integer createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * FunctionName.
         */
        public Builder functionName(String functionName) {
            this.functionName = functionName;
            return this;
        }

        /**
         * FunctionType.
         */
        public Builder functionType(String functionType) {
            this.functionType = functionType;
            return this;
        }

        /**
         * OwnerName.
         */
        public Builder ownerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }

        /**
         * OwnerType.
         */
        public Builder ownerType(String ownerType) {
            this.ownerType = ownerType;
            return this;
        }

        /**
         * ResourceUri.
         */
        public Builder resourceUri(java.util.List < ResourceUri > resourceUri) {
            this.resourceUri = resourceUri;
            return this;
        }

        public FunctionInput build() {
            return new FunctionInput(this);
        } 

    } 

}
