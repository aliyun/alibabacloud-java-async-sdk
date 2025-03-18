// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link DataDisk} extends {@link TeaModel}
 *
 * <p>DataDisk</p>
 */
public class DataDisk extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Size")
    private Long size;

    private DataDisk(Builder builder) {
        this.size = builder.size;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DataDisk create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return size
     */
    public Long getSize() {
        return this.size;
    }

    public static final class Builder {
        private Long size; 

        private Builder() {
        } 

        private Builder(DataDisk model) {
            this.size = model.size;
        } 

        /**
         * Size.
         */
        public Builder size(Long size) {
            this.size = size;
            return this;
        }

        public DataDisk build() {
            return new DataDisk(this);
        } 

    } 

}
