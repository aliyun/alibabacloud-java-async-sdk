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
 * {@link DLPartitionInput} extends {@link TeaModel}
 *
 * <p>DLPartitionInput</p>
 */
public class DLPartitionInput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private Integer createTime;

    @com.aliyun.core.annotation.NameInMap("LastAccessTime")
    private Integer lastAccessTime;

    @com.aliyun.core.annotation.NameInMap("Parameters")
    private java.util.Map<String, String> parameters;

    @com.aliyun.core.annotation.NameInMap("StorageDescriptor")
    private DLStorageDescriptor storageDescriptor;

    @com.aliyun.core.annotation.NameInMap("Values")
    private java.util.List<String> values;

    private DLPartitionInput(Builder builder) {
        this.createTime = builder.createTime;
        this.lastAccessTime = builder.lastAccessTime;
        this.parameters = builder.parameters;
        this.storageDescriptor = builder.storageDescriptor;
        this.values = builder.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DLPartitionInput create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return createTime
     */
    public Integer getCreateTime() {
        return this.createTime;
    }

    /**
     * @return lastAccessTime
     */
    public Integer getLastAccessTime() {
        return this.lastAccessTime;
    }

    /**
     * @return parameters
     */
    public java.util.Map<String, String> getParameters() {
        return this.parameters;
    }

    /**
     * @return storageDescriptor
     */
    public DLStorageDescriptor getStorageDescriptor() {
        return this.storageDescriptor;
    }

    /**
     * @return values
     */
    public java.util.List<String> getValues() {
        return this.values;
    }

    public static final class Builder {
        private Integer createTime; 
        private Integer lastAccessTime; 
        private java.util.Map<String, String> parameters; 
        private DLStorageDescriptor storageDescriptor; 
        private java.util.List<String> values; 

        private Builder() {
        } 

        private Builder(DLPartitionInput model) {
            this.createTime = model.createTime;
            this.lastAccessTime = model.lastAccessTime;
            this.parameters = model.parameters;
            this.storageDescriptor = model.storageDescriptor;
            this.values = model.values;
        } 

        /**
         * CreateTime.
         */
        public Builder createTime(Integer createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * LastAccessTime.
         */
        public Builder lastAccessTime(Integer lastAccessTime) {
            this.lastAccessTime = lastAccessTime;
            return this;
        }

        /**
         * Parameters.
         */
        public Builder parameters(java.util.Map<String, String> parameters) {
            this.parameters = parameters;
            return this;
        }

        /**
         * StorageDescriptor.
         */
        public Builder storageDescriptor(DLStorageDescriptor storageDescriptor) {
            this.storageDescriptor = storageDescriptor;
            return this;
        }

        /**
         * Values.
         */
        public Builder values(java.util.List<String> values) {
            this.values = values;
            return this;
        }

        public DLPartitionInput build() {
            return new DLPartitionInput(this);
        } 

    } 

}
