// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PreCreateEnsServiceResponseBody} extends {@link TeaModel}
 *
 * <p>PreCreateEnsServiceResponseBody</p>
 */
public class PreCreateEnsServiceResponseBody extends TeaModel {
    @NameInMap("BuyResourcesDetail")
    private String buyResourcesDetail;

    @NameInMap("Code")
    private Integer code;

    @NameInMap("EnsServiceId")
    private String ensServiceId;

    @NameInMap("NetLevel")
    private String netLevel;

    @NameInMap("RequestId")
    private String requestId;

    private PreCreateEnsServiceResponseBody(Builder builder) {
        this.buyResourcesDetail = builder.buyResourcesDetail;
        this.code = builder.code;
        this.ensServiceId = builder.ensServiceId;
        this.netLevel = builder.netLevel;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PreCreateEnsServiceResponseBody create() {
        return builder().build();
    }

    /**
     * @return buyResourcesDetail
     */
    public String getBuyResourcesDetail() {
        return this.buyResourcesDetail;
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return ensServiceId
     */
    public String getEnsServiceId() {
        return this.ensServiceId;
    }

    /**
     * @return netLevel
     */
    public String getNetLevel() {
        return this.netLevel;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String buyResourcesDetail; 
        private Integer code; 
        private String ensServiceId; 
        private String netLevel; 
        private String requestId; 

        /**
         * BuyResourcesDetail.
         */
        public Builder buyResourcesDetail(String buyResourcesDetail) {
            this.buyResourcesDetail = buyResourcesDetail;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * EnsServiceId.
         */
        public Builder ensServiceId(String ensServiceId) {
            this.ensServiceId = ensServiceId;
            return this;
        }

        /**
         * NetLevel.
         */
        public Builder netLevel(String netLevel) {
            this.netLevel = netLevel;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public PreCreateEnsServiceResponseBody build() {
            return new PreCreateEnsServiceResponseBody(this);
        } 

    } 

}
