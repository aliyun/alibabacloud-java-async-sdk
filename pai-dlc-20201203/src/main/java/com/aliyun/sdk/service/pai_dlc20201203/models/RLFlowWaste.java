// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

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
 * {@link RLFlowWaste} extends {@link TeaModel}
 *
 * <p>RLFlowWaste</p>
 */
public class RLFlowWaste extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("UsefulSec")
    private Long usefulSec;

    private RLFlowWaste(Builder builder) {
        this.usefulSec = builder.usefulSec;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RLFlowWaste create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return usefulSec
     */
    public Long getUsefulSec() {
        return this.usefulSec;
    }

    public static final class Builder {
        private Long usefulSec; 

        private Builder() {
        } 

        private Builder(RLFlowWaste model) {
            this.usefulSec = model.usefulSec;
        } 

        /**
         * <p>已训练轨迹的累计耗时（秒）</p>
         * 
         * <strong>example:</strong>
         * <p>183</p>
         */
        public Builder usefulSec(Long usefulSec) {
            this.usefulSec = usefulSec;
            return this;
        }

        public RLFlowWaste build() {
            return new RLFlowWaste(this);
        } 

    } 

}
