// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dlfnext20250310.models;

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
 * {@link IcebergPartitionField} extends {@link TeaModel}
 *
 * <p>IcebergPartitionField</p>
 */
public class IcebergPartitionField extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("fieldId")
    private Long fieldId;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("sourceId")
    private Long sourceId;

    @com.aliyun.core.annotation.NameInMap("transform")
    private String transform;

    private IcebergPartitionField(Builder builder) {
        this.fieldId = builder.fieldId;
        this.name = builder.name;
        this.sourceId = builder.sourceId;
        this.transform = builder.transform;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static IcebergPartitionField create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fieldId
     */
    public Long getFieldId() {
        return this.fieldId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return sourceId
     */
    public Long getSourceId() {
        return this.sourceId;
    }

    /**
     * @return transform
     */
    public String getTransform() {
        return this.transform;
    }

    public static final class Builder {
        private Long fieldId; 
        private String name; 
        private Long sourceId; 
        private String transform; 

        private Builder() {
        } 

        private Builder(IcebergPartitionField model) {
            this.fieldId = model.fieldId;
            this.name = model.name;
            this.sourceId = model.sourceId;
            this.transform = model.transform;
        } 

        /**
         * fieldId.
         */
        public Builder fieldId(Long fieldId) {
            this.fieldId = fieldId;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * sourceId.
         */
        public Builder sourceId(Long sourceId) {
            this.sourceId = sourceId;
            return this;
        }

        /**
         * transform.
         */
        public Builder transform(String transform) {
            this.transform = transform;
            return this;
        }

        public IcebergPartitionField build() {
            return new IcebergPartitionField(this);
        } 

    } 

}
