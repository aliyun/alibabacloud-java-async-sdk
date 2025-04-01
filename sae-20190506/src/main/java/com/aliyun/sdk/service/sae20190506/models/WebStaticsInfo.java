// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

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
 * {@link WebStaticsInfo} extends {@link TeaModel}
 *
 * <p>WebStaticsInfo</p>
 */
public class WebStaticsInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CpuUsage")
    private Long cpuUsage;

    @com.aliyun.core.annotation.NameInMap("InternetTrafficOut")
    private Long internetTrafficOut;

    @com.aliyun.core.annotation.NameInMap("Invocations")
    private Long invocations;

    @com.aliyun.core.annotation.NameInMap("MemoryUsage")
    private Long memoryUsage;

    private WebStaticsInfo(Builder builder) {
        this.cpuUsage = builder.cpuUsage;
        this.internetTrafficOut = builder.internetTrafficOut;
        this.invocations = builder.invocations;
        this.memoryUsage = builder.memoryUsage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static WebStaticsInfo create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cpuUsage
     */
    public Long getCpuUsage() {
        return this.cpuUsage;
    }

    /**
     * @return internetTrafficOut
     */
    public Long getInternetTrafficOut() {
        return this.internetTrafficOut;
    }

    /**
     * @return invocations
     */
    public Long getInvocations() {
        return this.invocations;
    }

    /**
     * @return memoryUsage
     */
    public Long getMemoryUsage() {
        return this.memoryUsage;
    }

    public static final class Builder {
        private Long cpuUsage; 
        private Long internetTrafficOut; 
        private Long invocations; 
        private Long memoryUsage; 

        private Builder() {
        } 

        private Builder(WebStaticsInfo model) {
            this.cpuUsage = model.cpuUsage;
            this.internetTrafficOut = model.internetTrafficOut;
            this.invocations = model.invocations;
            this.memoryUsage = model.memoryUsage;
        } 

        /**
         * CpuUsage.
         */
        public Builder cpuUsage(Long cpuUsage) {
            this.cpuUsage = cpuUsage;
            return this;
        }

        /**
         * InternetTrafficOut.
         */
        public Builder internetTrafficOut(Long internetTrafficOut) {
            this.internetTrafficOut = internetTrafficOut;
            return this;
        }

        /**
         * Invocations.
         */
        public Builder invocations(Long invocations) {
            this.invocations = invocations;
            return this;
        }

        /**
         * MemoryUsage.
         */
        public Builder memoryUsage(Long memoryUsage) {
            this.memoryUsage = memoryUsage;
            return this;
        }

        public WebStaticsInfo build() {
            return new WebStaticsInfo(this);
        } 

    } 

}
