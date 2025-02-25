// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FileCnt} extends {@link TeaModel}
 *
 * <p>FileCnt</p>
 */
public class FileCnt extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Large")
    private Long large;

    @com.aliyun.core.annotation.NameInMap("Middle")
    private Long middle;

    @com.aliyun.core.annotation.NameInMap("Small")
    private Long small;

    @com.aliyun.core.annotation.NameInMap("Tiny")
    private Long tiny;

    private FileCnt(Builder builder) {
        this.large = builder.large;
        this.middle = builder.middle;
        this.small = builder.small;
        this.tiny = builder.tiny;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FileCnt create() {
        return builder().build();
    }

    /**
     * @return large
     */
    public Long getLarge() {
        return this.large;
    }

    /**
     * @return middle
     */
    public Long getMiddle() {
        return this.middle;
    }

    /**
     * @return small
     */
    public Long getSmall() {
        return this.small;
    }

    /**
     * @return tiny
     */
    public Long getTiny() {
        return this.tiny;
    }

    public static final class Builder {
        private Long large; 
        private Long middle; 
        private Long small; 
        private Long tiny; 

        /**
         * Large.
         */
        public Builder large(Long large) {
            this.large = large;
            return this;
        }

        /**
         * Middle.
         */
        public Builder middle(Long middle) {
            this.middle = middle;
            return this;
        }

        /**
         * Small.
         */
        public Builder small(Long small) {
            this.small = small;
            return this;
        }

        /**
         * Tiny.
         */
        public Builder tiny(Long tiny) {
            this.tiny = tiny;
            return this;
        }

        public FileCnt build() {
            return new FileCnt(this);
        } 

    } 

}
