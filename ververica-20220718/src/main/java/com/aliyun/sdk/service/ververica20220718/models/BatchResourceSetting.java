// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link BatchResourceSetting} extends {@link TeaModel}
 *
 * <p>BatchResourceSetting</p>
 */
public class BatchResourceSetting extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("basicResourceSetting")
    private BasicResourceSetting basicResourceSetting;

    @com.aliyun.core.annotation.NameInMap("maxSlot")
    private Long maxSlot;

    private BatchResourceSetting(Builder builder) {
        this.basicResourceSetting = builder.basicResourceSetting;
        this.maxSlot = builder.maxSlot;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchResourceSetting create() {
        return builder().build();
    }

    /**
     * @return basicResourceSetting
     */
    public BasicResourceSetting getBasicResourceSetting() {
        return this.basicResourceSetting;
    }

    /**
     * @return maxSlot
     */
    public Long getMaxSlot() {
        return this.maxSlot;
    }

    public static final class Builder {
        private BasicResourceSetting basicResourceSetting; 
        private Long maxSlot; 

        /**
         * basicResourceSetting.
         */
        public Builder basicResourceSetting(BasicResourceSetting basicResourceSetting) {
            this.basicResourceSetting = basicResourceSetting;
            return this;
        }

        /**
         * maxSlot.
         */
        public Builder maxSlot(Long maxSlot) {
            this.maxSlot = maxSlot;
            return this;
        }

        public BatchResourceSetting build() {
            return new BatchResourceSetting(this);
        } 

    } 

}
