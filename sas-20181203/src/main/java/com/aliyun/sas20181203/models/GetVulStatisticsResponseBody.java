// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetVulStatisticsResponseBody} extends {@link TeaModel}
 *
 * <p>GetVulStatisticsResponseBody</p>
 */
public class GetVulStatisticsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("VulAsapSum")
    private Integer vulAsapSum;

    @NameInMap("VulLaterSum")
    private Integer vulLaterSum;

    @NameInMap("VulNntfSum")
    private Integer vulNntfSum;

    private GetVulStatisticsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.vulAsapSum = builder.vulAsapSum;
        this.vulLaterSum = builder.vulLaterSum;
        this.vulNntfSum = builder.vulNntfSum;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetVulStatisticsResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return vulAsapSum
     */
    public Integer getVulAsapSum() {
        return this.vulAsapSum;
    }

    /**
     * @return vulLaterSum
     */
    public Integer getVulLaterSum() {
        return this.vulLaterSum;
    }

    /**
     * @return vulNntfSum
     */
    public Integer getVulNntfSum() {
        return this.vulNntfSum;
    }

    public static final class Builder {
        private String requestId; 
        private Integer vulAsapSum; 
        private Integer vulLaterSum; 
        private Integer vulNntfSum; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * VulAsapSum.
         */
        public Builder vulAsapSum(Integer vulAsapSum) {
            this.vulAsapSum = vulAsapSum;
            return this;
        }

        /**
         * VulLaterSum.
         */
        public Builder vulLaterSum(Integer vulLaterSum) {
            this.vulLaterSum = vulLaterSum;
            return this;
        }

        /**
         * VulNntfSum.
         */
        public Builder vulNntfSum(Integer vulNntfSum) {
            this.vulNntfSum = vulNntfSum;
            return this;
        }

        public GetVulStatisticsResponseBody build() {
            return new GetVulStatisticsResponseBody(this);
        } 

    } 

}
