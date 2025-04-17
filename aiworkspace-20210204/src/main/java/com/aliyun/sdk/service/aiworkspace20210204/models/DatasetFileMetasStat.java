// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

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
 * {@link DatasetFileMetasStat} extends {@link TeaModel}
 *
 * <p>DatasetFileMetasStat</p>
 */
public class DatasetFileMetasStat extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Count")
    private Integer count;

    @com.aliyun.core.annotation.NameInMap("Key")
    private String key;

    private DatasetFileMetasStat(Builder builder) {
        this.count = builder.count;
        this.key = builder.key;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DatasetFileMetasStat create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * @return key
     */
    public String getKey() {
        return this.key;
    }

    public static final class Builder {
        private Integer count; 
        private String key; 

        private Builder() {
        } 

        private Builder(DatasetFileMetasStat model) {
            this.count = model.count;
            this.key = model.key;
        } 

        /**
         * Count.
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * Key.
         */
        public Builder key(String key) {
            this.key = key;
            return this;
        }

        public DatasetFileMetasStat build() {
            return new DatasetFileMetasStat(this);
        } 

    } 

}
