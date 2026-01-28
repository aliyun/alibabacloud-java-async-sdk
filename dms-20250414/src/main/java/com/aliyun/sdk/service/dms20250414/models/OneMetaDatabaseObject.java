// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms20250414.models;

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
 * {@link OneMetaDatabaseObject} extends {@link TeaModel}
 *
 * <p>OneMetaDatabaseObject</p>
 */
public class OneMetaDatabaseObject extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ObjectName")
    private String objectName;

    @com.aliyun.core.annotation.NameInMap("ObjectQualifiedName")
    private String objectQualifiedName;

    @com.aliyun.core.annotation.NameInMap("ObjectType")
    private String objectType;

    private OneMetaDatabaseObject(Builder builder) {
        this.objectName = builder.objectName;
        this.objectQualifiedName = builder.objectQualifiedName;
        this.objectType = builder.objectType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OneMetaDatabaseObject create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return objectName
     */
    public String getObjectName() {
        return this.objectName;
    }

    /**
     * @return objectQualifiedName
     */
    public String getObjectQualifiedName() {
        return this.objectQualifiedName;
    }

    /**
     * @return objectType
     */
    public String getObjectType() {
        return this.objectType;
    }

    public static final class Builder {
        private String objectName; 
        private String objectQualifiedName; 
        private String objectType; 

        private Builder() {
        } 

        private Builder(OneMetaDatabaseObject model) {
            this.objectName = model.objectName;
            this.objectQualifiedName = model.objectQualifiedName;
            this.objectType = model.objectType;
        } 

        /**
         * ObjectName.
         */
        public Builder objectName(String objectName) {
            this.objectName = objectName;
            return this;
        }

        /**
         * ObjectQualifiedName.
         */
        public Builder objectQualifiedName(String objectQualifiedName) {
            this.objectQualifiedName = objectQualifiedName;
            return this;
        }

        /**
         * ObjectType.
         */
        public Builder objectType(String objectType) {
            this.objectType = objectType;
            return this;
        }

        public OneMetaDatabaseObject build() {
            return new OneMetaDatabaseObject(this);
        } 

    } 

}
