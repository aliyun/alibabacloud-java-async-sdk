// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DescribeAutoDelConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAutoDelConfigResponseBody</p>
 */
public class DescribeAutoDelConfigResponseBody extends TeaModel {
    @NameInMap("Days")
    private Integer days;

    @NameInMap("RequestId")
    private String requestId;


    private DescribeAutoDelConfigResponseBody(Builder builder) {
        this.days = builder.days;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAutoDelConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return days
     */
    public Integer getDays() {
        return this.days;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer days; 
        private String requestId; 

        /**
         * <p>Days.</p>
         */
        public Builder days(Integer days) {
            this.days = days;
            return this;
        }

        /**
         * <p>RequestId.</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeAutoDelConfigResponseBody build() {
            return new DescribeAutoDelConfigResponseBody(this);
        } 

    } 

}
