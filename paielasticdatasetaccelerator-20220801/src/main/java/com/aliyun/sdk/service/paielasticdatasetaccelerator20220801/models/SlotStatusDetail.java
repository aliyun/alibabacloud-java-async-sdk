// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paielasticdatasetaccelerator20220801.models;

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
 * {@link SlotStatusDetail} extends {@link TeaModel}
 *
 * <p>SlotStatusDetail</p>
 */
public class SlotStatusDetail extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LoadedFileNum")
    private Long loadedFileNum;

    @com.aliyun.core.annotation.NameInMap("LoadedFileSize")
    private String loadedFileSize;

    @com.aliyun.core.annotation.NameInMap("LoadingTimeCost")
    private Long loadingTimeCost;

    private SlotStatusDetail(Builder builder) {
        this.loadedFileNum = builder.loadedFileNum;
        this.loadedFileSize = builder.loadedFileSize;
        this.loadingTimeCost = builder.loadingTimeCost;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SlotStatusDetail create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return loadedFileNum
     */
    public Long getLoadedFileNum() {
        return this.loadedFileNum;
    }

    /**
     * @return loadedFileSize
     */
    public String getLoadedFileSize() {
        return this.loadedFileSize;
    }

    /**
     * @return loadingTimeCost
     */
    public Long getLoadingTimeCost() {
        return this.loadingTimeCost;
    }

    public static final class Builder {
        private Long loadedFileNum; 
        private String loadedFileSize; 
        private Long loadingTimeCost; 

        private Builder() {
        } 

        private Builder(SlotStatusDetail model) {
            this.loadedFileNum = model.loadedFileNum;
            this.loadedFileSize = model.loadedFileSize;
            this.loadingTimeCost = model.loadingTimeCost;
        } 

        /**
         * LoadedFileNum.
         */
        public Builder loadedFileNum(Long loadedFileNum) {
            this.loadedFileNum = loadedFileNum;
            return this;
        }

        /**
         * LoadedFileSize.
         */
        public Builder loadedFileSize(String loadedFileSize) {
            this.loadedFileSize = loadedFileSize;
            return this;
        }

        /**
         * LoadingTimeCost.
         */
        public Builder loadingTimeCost(Long loadingTimeCost) {
            this.loadingTimeCost = loadingTimeCost;
            return this;
        }

        public SlotStatusDetail build() {
            return new SlotStatusDetail(this);
        } 

    } 

}
