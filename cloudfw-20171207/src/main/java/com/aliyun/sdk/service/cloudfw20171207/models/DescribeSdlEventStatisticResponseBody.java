// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link DescribeSdlEventStatisticResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSdlEventStatisticResponseBody</p>
 */
public class DescribeSdlEventStatisticResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AiSensitiveDataCount")
    private Long aiSensitiveDataCount;

    @com.aliyun.core.annotation.NameInMap("AssetCount")
    private Long assetCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SensitiveDataCount")
    private Long sensitiveDataCount;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    @com.aliyun.core.annotation.NameInMap("TotalTraffic")
    private Long totalTraffic;

    private DescribeSdlEventStatisticResponseBody(Builder builder) {
        this.aiSensitiveDataCount = builder.aiSensitiveDataCount;
        this.assetCount = builder.assetCount;
        this.requestId = builder.requestId;
        this.sensitiveDataCount = builder.sensitiveDataCount;
        this.totalCount = builder.totalCount;
        this.totalTraffic = builder.totalTraffic;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSdlEventStatisticResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aiSensitiveDataCount
     */
    public Long getAiSensitiveDataCount() {
        return this.aiSensitiveDataCount;
    }

    /**
     * @return assetCount
     */
    public Long getAssetCount() {
        return this.assetCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sensitiveDataCount
     */
    public Long getSensitiveDataCount() {
        return this.sensitiveDataCount;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return totalTraffic
     */
    public Long getTotalTraffic() {
        return this.totalTraffic;
    }

    public static final class Builder {
        private Long aiSensitiveDataCount; 
        private Long assetCount; 
        private String requestId; 
        private Long sensitiveDataCount; 
        private Long totalCount; 
        private Long totalTraffic; 

        private Builder() {
        } 

        private Builder(DescribeSdlEventStatisticResponseBody model) {
            this.aiSensitiveDataCount = model.aiSensitiveDataCount;
            this.assetCount = model.assetCount;
            this.requestId = model.requestId;
            this.sensitiveDataCount = model.sensitiveDataCount;
            this.totalCount = model.totalCount;
            this.totalTraffic = model.totalTraffic;
        } 

        /**
         * AiSensitiveDataCount.
         */
        public Builder aiSensitiveDataCount(Long aiSensitiveDataCount) {
            this.aiSensitiveDataCount = aiSensitiveDataCount;
            return this;
        }

        /**
         * AssetCount.
         */
        public Builder assetCount(Long assetCount) {
            this.assetCount = assetCount;
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
         * SensitiveDataCount.
         */
        public Builder sensitiveDataCount(Long sensitiveDataCount) {
            this.sensitiveDataCount = sensitiveDataCount;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * TotalTraffic.
         */
        public Builder totalTraffic(Long totalTraffic) {
            this.totalTraffic = totalTraffic;
            return this;
        }

        public DescribeSdlEventStatisticResponseBody build() {
            return new DescribeSdlEventStatisticResponseBody(this);
        } 

    } 

}
