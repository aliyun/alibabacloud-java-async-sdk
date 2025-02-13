// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

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
 * {@link DLFunctionInput} extends {@link TeaModel}
 *
 * <p>DLFunctionInput</p>
 */
public class DLFunctionInput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ClassName")
    private String className;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private Integer createTime;

    @com.aliyun.core.annotation.NameInMap("CreatorId")
    private Long creatorId;

    @com.aliyun.core.annotation.NameInMap("FunctionName")
    private String functionName;

    @com.aliyun.core.annotation.NameInMap("FunctionType")
    private String functionType;

    @com.aliyun.core.annotation.NameInMap("ModifierId")
    private Long modifierId;

    @com.aliyun.core.annotation.NameInMap("OwnerName")
    private String ownerName;

    @com.aliyun.core.annotation.NameInMap("OwnerType")
    private String ownerType;

    @com.aliyun.core.annotation.NameInMap("ResourceUris")
    private java.util.List<DLResourceUri> resourceUris;

    private DLFunctionInput(Builder builder) {
        this.className = builder.className;
        this.createTime = builder.createTime;
        this.creatorId = builder.creatorId;
        this.functionName = builder.functionName;
        this.functionType = builder.functionType;
        this.modifierId = builder.modifierId;
        this.ownerName = builder.ownerName;
        this.ownerType = builder.ownerType;
        this.resourceUris = builder.resourceUris;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DLFunctionInput create() {
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
     * @return creatorId
     */
    public Long getCreatorId() {
        return this.creatorId;
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
     * @return modifierId
     */
    public Long getModifierId() {
        return this.modifierId;
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
     * @return resourceUris
     */
    public java.util.List<DLResourceUri> getResourceUris() {
        return this.resourceUris;
    }

    public static final class Builder {
        private String className; 
        private Integer createTime; 
        private Long creatorId; 
        private String functionName; 
        private String functionType; 
        private Long modifierId; 
        private String ownerName; 
        private String ownerType; 
        private java.util.List<DLResourceUri> resourceUris; 

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
         * CreatorId.
         */
        public Builder creatorId(Long creatorId) {
            this.creatorId = creatorId;
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
         * ModifierId.
         */
        public Builder modifierId(Long modifierId) {
            this.modifierId = modifierId;
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
         * ResourceUris.
         */
        public Builder resourceUris(java.util.List<DLResourceUri> resourceUris) {
            this.resourceUris = resourceUris;
            return this;
        }

        public DLFunctionInput build() {
            return new DLFunctionInput(this);
        } 

    } 

}
