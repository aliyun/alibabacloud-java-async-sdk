// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link HotUpdateJobParams} extends {@link TeaModel}
 *
 * <p>HotUpdateJobParams</p>
 */
public class HotUpdateJobParams extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("rescaleJobParam")
    private RescaleJobParam rescaleJobParam;

    @com.aliyun.core.annotation.NameInMap("updateJobConfigParam")
    private UpdateJobConfigParam updateJobConfigParam;

    private HotUpdateJobParams(Builder builder) {
        this.rescaleJobParam = builder.rescaleJobParam;
        this.updateJobConfigParam = builder.updateJobConfigParam;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HotUpdateJobParams create() {
        return builder().build();
    }

    /**
     * @return rescaleJobParam
     */
    public RescaleJobParam getRescaleJobParam() {
        return this.rescaleJobParam;
    }

    /**
     * @return updateJobConfigParam
     */
    public UpdateJobConfigParam getUpdateJobConfigParam() {
        return this.updateJobConfigParam;
    }

    public static final class Builder {
        private RescaleJobParam rescaleJobParam; 
        private UpdateJobConfigParam updateJobConfigParam; 

        /**
         * rescaleJobParam.
         */
        public Builder rescaleJobParam(RescaleJobParam rescaleJobParam) {
            this.rescaleJobParam = rescaleJobParam;
            return this;
        }

        /**
         * updateJobConfigParam.
         */
        public Builder updateJobConfigParam(UpdateJobConfigParam updateJobConfigParam) {
            this.updateJobConfigParam = updateJobConfigParam;
            return this;
        }

        public HotUpdateJobParams build() {
            return new HotUpdateJobParams(this);
        } 

    } 

}
