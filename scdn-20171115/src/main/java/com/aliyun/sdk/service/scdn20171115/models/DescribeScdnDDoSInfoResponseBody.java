// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.scdn20171115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeScdnDDoSInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeScdnDDoSInfoResponseBody</p>
 */
public class DescribeScdnDDoSInfoResponseBody extends TeaModel {
    @NameInMap("ElasticBandwidth")
    private Integer elasticBandwidth;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SecBandwidth")
    private Integer secBandwidth;

    private DescribeScdnDDoSInfoResponseBody(Builder builder) {
        this.elasticBandwidth = builder.elasticBandwidth;
        this.requestId = builder.requestId;
        this.secBandwidth = builder.secBandwidth;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeScdnDDoSInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return elasticBandwidth
     */
    public Integer getElasticBandwidth() {
        return this.elasticBandwidth;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return secBandwidth
     */
    public Integer getSecBandwidth() {
        return this.secBandwidth;
    }

    public static final class Builder {
        private Integer elasticBandwidth; 
        private String requestId; 
        private Integer secBandwidth; 

        /**
         * ElasticBandwidth.
         */
        public Builder elasticBandwidth(Integer elasticBandwidth) {
            this.elasticBandwidth = elasticBandwidth;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SecBandwidth.
         */
        public Builder secBandwidth(Integer secBandwidth) {
            this.secBandwidth = secBandwidth;
            return this;
        }

        public DescribeScdnDDoSInfoResponseBody build() {
            return new DescribeScdnDDoSInfoResponseBody(this);
        } 

    } 

}
