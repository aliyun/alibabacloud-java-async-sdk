// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

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
 * {@link ResizeDiskParameters} extends {@link TeaModel}
 *
 * <p>ResizeDiskParameters</p>
 */
public class ResizeDiskParameters extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NewDiskSize")
    private String newDiskSize;

    private ResizeDiskParameters(Builder builder) {
        this.newDiskSize = builder.newDiskSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResizeDiskParameters create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return newDiskSize
     */
    public String getNewDiskSize() {
        return this.newDiskSize;
    }

    public static final class Builder {
        private String newDiskSize; 

        private Builder() {
        } 

        private Builder(ResizeDiskParameters model) {
            this.newDiskSize = model.newDiskSize;
        } 

        /**
         * <p>The target disk capacity after the change.</p>
         */
        public Builder newDiskSize(String newDiskSize) {
            this.newDiskSize = newDiskSize;
            return this;
        }

        public ResizeDiskParameters build() {
            return new ResizeDiskParameters(this);
        } 

    } 

}
