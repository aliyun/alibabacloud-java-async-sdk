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
 * {@link DescribeInvadeEventStatisticResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInvadeEventStatisticResponseBody</p>
 */
public class DescribeInvadeEventStatisticResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("HighOpenEventCnt")
    private Integer highOpenEventCnt;

    @com.aliyun.core.annotation.NameInMap("LowOpenEventCnt")
    private Integer lowOpenEventCnt;

    @com.aliyun.core.annotation.NameInMap("MiddleOpenEventCnt")
    private Integer middleOpenEventCnt;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalOpenEventCnt")
    private Integer totalOpenEventCnt;

    private DescribeInvadeEventStatisticResponseBody(Builder builder) {
        this.highOpenEventCnt = builder.highOpenEventCnt;
        this.lowOpenEventCnt = builder.lowOpenEventCnt;
        this.middleOpenEventCnt = builder.middleOpenEventCnt;
        this.requestId = builder.requestId;
        this.totalOpenEventCnt = builder.totalOpenEventCnt;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInvadeEventStatisticResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return highOpenEventCnt
     */
    public Integer getHighOpenEventCnt() {
        return this.highOpenEventCnt;
    }

    /**
     * @return lowOpenEventCnt
     */
    public Integer getLowOpenEventCnt() {
        return this.lowOpenEventCnt;
    }

    /**
     * @return middleOpenEventCnt
     */
    public Integer getMiddleOpenEventCnt() {
        return this.middleOpenEventCnt;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalOpenEventCnt
     */
    public Integer getTotalOpenEventCnt() {
        return this.totalOpenEventCnt;
    }

    public static final class Builder {
        private Integer highOpenEventCnt; 
        private Integer lowOpenEventCnt; 
        private Integer middleOpenEventCnt; 
        private String requestId; 
        private Integer totalOpenEventCnt; 

        private Builder() {
        } 

        private Builder(DescribeInvadeEventStatisticResponseBody model) {
            this.highOpenEventCnt = model.highOpenEventCnt;
            this.lowOpenEventCnt = model.lowOpenEventCnt;
            this.middleOpenEventCnt = model.middleOpenEventCnt;
            this.requestId = model.requestId;
            this.totalOpenEventCnt = model.totalOpenEventCnt;
        } 

        /**
         * HighOpenEventCnt.
         */
        public Builder highOpenEventCnt(Integer highOpenEventCnt) {
            this.highOpenEventCnt = highOpenEventCnt;
            return this;
        }

        /**
         * LowOpenEventCnt.
         */
        public Builder lowOpenEventCnt(Integer lowOpenEventCnt) {
            this.lowOpenEventCnt = lowOpenEventCnt;
            return this;
        }

        /**
         * MiddleOpenEventCnt.
         */
        public Builder middleOpenEventCnt(Integer middleOpenEventCnt) {
            this.middleOpenEventCnt = middleOpenEventCnt;
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
         * TotalOpenEventCnt.
         */
        public Builder totalOpenEventCnt(Integer totalOpenEventCnt) {
            this.totalOpenEventCnt = totalOpenEventCnt;
            return this;
        }

        public DescribeInvadeEventStatisticResponseBody build() {
            return new DescribeInvadeEventStatisticResponseBody(this);
        } 

    } 

}
