// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

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
 * {@link PersonalSpaceInfo} extends {@link TeaModel}
 *
 * <p>PersonalSpaceInfo</p>
 */
public class PersonalSpaceInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("total_size")
    private Long totalSize;

    @com.aliyun.core.annotation.NameInMap("used_size")
    private Long usedSize;

    private PersonalSpaceInfo(Builder builder) {
        this.totalSize = builder.totalSize;
        this.usedSize = builder.usedSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PersonalSpaceInfo create() {
        return builder().build();
    }

    /**
     * @return totalSize
     */
    public Long getTotalSize() {
        return this.totalSize;
    }

    /**
     * @return usedSize
     */
    public Long getUsedSize() {
        return this.usedSize;
    }

    public static final class Builder {
        private Long totalSize; 
        private Long usedSize; 

        /**
         * total_size.
         */
        public Builder totalSize(Long totalSize) {
            this.totalSize = totalSize;
            return this;
        }

        /**
         * used_size.
         */
        public Builder usedSize(Long usedSize) {
            this.usedSize = usedSize;
            return this;
        }

        public PersonalSpaceInfo build() {
            return new PersonalSpaceInfo(this);
        } 

    } 

}
