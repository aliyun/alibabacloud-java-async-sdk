// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link CompleteMultipartUpload} extends {@link TeaModel}
 *
 * <p>CompleteMultipartUpload</p>
 */
public class CompleteMultipartUpload extends TeaModel {
    @NameInMap("Part")
    private java.util.List < Part > part;


    private CompleteMultipartUpload(Builder builder) {
        this.part = builder.part;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CompleteMultipartUpload create() {
        return builder().build();
    }

    /**
     * @return part
     */
    public java.util.List < Part > getPart() {
        return this.part;
    }

    public static final class Builder {
        private java.util.List < Part > part; 

        /**
         * <p>description</p>
         */
        public Builder part(java.util.List < Part > part) {
            this.part = part;
            return this;
        }

        public CompleteMultipartUpload build() {
            return new CompleteMultipartUpload(this);
        } 

    } 

}
