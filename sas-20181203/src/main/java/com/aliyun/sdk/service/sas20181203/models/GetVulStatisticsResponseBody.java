// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link GetVulStatisticsResponseBody} extends {@link TeaModel}
 *
 * <p>GetVulStatisticsResponseBody</p>
 */
public class GetVulStatisticsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("VulAsapSum")
    private Integer vulAsapSum;

    @com.aliyun.core.annotation.NameInMap("VulLaterSum")
    private Integer vulLaterSum;

    @com.aliyun.core.annotation.NameInMap("VulNntfSum")
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
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>3FE272FA-7263-4554-A90F-A7857945A6D5</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The number of vulnerabilities that have the high priority.</p>
         * 
         * <strong>example:</strong>
         * <p>16</p>
         */
        public Builder vulAsapSum(Integer vulAsapSum) {
            this.vulAsapSum = vulAsapSum;
            return this;
        }

        /**
         * <p>The number of vulnerabilities that have the medium priority.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder vulLaterSum(Integer vulLaterSum) {
            this.vulLaterSum = vulLaterSum;
            return this;
        }

        /**
         * <p>The number of vulnerabilities that have the low priority.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
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
