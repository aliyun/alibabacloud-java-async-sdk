// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20151123.models;

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
 * {@link GetDedicatedIpWarmUpDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetDedicatedIpWarmUpDetailResponseBody</p>
 */
public class GetDedicatedIpWarmUpDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Detail")
    private java.util.List<Detail> detail;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetDedicatedIpWarmUpDetailResponseBody(Builder builder) {
        this.detail = builder.detail;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDedicatedIpWarmUpDetailResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return detail
     */
    public java.util.List<Detail> getDetail() {
        return this.detail;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Detail> detail; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetDedicatedIpWarmUpDetailResponseBody model) {
            this.detail = model.detail;
            this.requestId = model.requestId;
        } 

        /**
         * Detail.
         */
        public Builder detail(java.util.List<Detail> detail) {
            this.detail = detail;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetDedicatedIpWarmUpDetailResponseBody build() {
            return new GetDedicatedIpWarmUpDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDedicatedIpWarmUpDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetDedicatedIpWarmUpDetailResponseBody</p>
     */
    public static class Detail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DayMark")
        private Long dayMark;

        @com.aliyun.core.annotation.NameInMap("DeliverCounts")
        private Long deliverCounts;

        @com.aliyun.core.annotation.NameInMap("Esp")
        private String esp;

        @com.aliyun.core.annotation.NameInMap("SendCounts")
        private Long sendCounts;

        private Detail(Builder builder) {
            this.dayMark = builder.dayMark;
            this.deliverCounts = builder.deliverCounts;
            this.esp = builder.esp;
            this.sendCounts = builder.sendCounts;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Detail create() {
            return builder().build();
        }

        /**
         * @return dayMark
         */
        public Long getDayMark() {
            return this.dayMark;
        }

        /**
         * @return deliverCounts
         */
        public Long getDeliverCounts() {
            return this.deliverCounts;
        }

        /**
         * @return esp
         */
        public String getEsp() {
            return this.esp;
        }

        /**
         * @return sendCounts
         */
        public Long getSendCounts() {
            return this.sendCounts;
        }

        public static final class Builder {
            private Long dayMark; 
            private Long deliverCounts; 
            private String esp; 
            private Long sendCounts; 

            private Builder() {
            } 

            private Builder(Detail model) {
                this.dayMark = model.dayMark;
                this.deliverCounts = model.deliverCounts;
                this.esp = model.esp;
                this.sendCounts = model.sendCounts;
            } 

            /**
             * DayMark.
             */
            public Builder dayMark(Long dayMark) {
                this.dayMark = dayMark;
                return this;
            }

            /**
             * DeliverCounts.
             */
            public Builder deliverCounts(Long deliverCounts) {
                this.deliverCounts = deliverCounts;
                return this;
            }

            /**
             * Esp.
             */
            public Builder esp(String esp) {
                this.esp = esp;
                return this;
            }

            /**
             * SendCounts.
             */
            public Builder sendCounts(Long sendCounts) {
                this.sendCounts = sendCounts;
                return this;
            }

            public Detail build() {
                return new Detail(this);
            } 

        } 

    }
}
