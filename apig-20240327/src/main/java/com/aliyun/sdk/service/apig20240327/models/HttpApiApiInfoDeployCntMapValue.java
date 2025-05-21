// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link HttpApiApiInfoDeployCntMapValue} extends {@link TeaModel}
 *
 * <p>HttpApiApiInfoDeployCntMapValue</p>
 */
public class HttpApiApiInfoDeployCntMapValue extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("deployedCnt")
    private Long deployedCnt;

    @com.aliyun.core.annotation.NameInMap("Cnt")
    private Long cnt;

    private HttpApiApiInfoDeployCntMapValue(Builder builder) {
        this.deployedCnt = builder.deployedCnt;
        this.cnt = builder.cnt;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HttpApiApiInfoDeployCntMapValue create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deployedCnt
     */
    public Long getDeployedCnt() {
        return this.deployedCnt;
    }

    /**
     * @return cnt
     */
    public Long getCnt() {
        return this.cnt;
    }

    public static final class Builder {
        private Long deployedCnt; 
        private Long cnt; 

        private Builder() {
        } 

        private Builder(HttpApiApiInfoDeployCntMapValue model) {
            this.deployedCnt = model.deployedCnt;
            this.cnt = model.cnt;
        } 

        /**
         * deployedCnt.
         */
        public Builder deployedCnt(Long deployedCnt) {
            this.deployedCnt = deployedCnt;
            return this;
        }

        /**
         * Cnt.
         */
        public Builder cnt(Long cnt) {
            this.cnt = cnt;
            return this;
        }

        public HttpApiApiInfoDeployCntMapValue build() {
            return new HttpApiApiInfoDeployCntMapValue(this);
        } 

    } 

}
