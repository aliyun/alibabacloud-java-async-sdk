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
 * {@link DescribeAutoDelConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAutoDelConfigResponseBody</p>
 */
public class DescribeAutoDelConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Days")
    private Integer days;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The number of days during which a detected vulnerability is retained before the vulnerability is automatically deleted.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder days(Integer days) {
            this.days = days;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>C56F66FD-C4EE-4813-ABDC-4FF94B6C384E</p>
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
