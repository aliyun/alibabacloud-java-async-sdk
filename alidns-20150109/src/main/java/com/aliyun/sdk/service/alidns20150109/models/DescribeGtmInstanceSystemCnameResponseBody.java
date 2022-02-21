// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeGtmInstanceSystemCnameResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeGtmInstanceSystemCnameResponseBody</p>
 */
public class DescribeGtmInstanceSystemCnameResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SystemCname")
    private String systemCname;

    private DescribeGtmInstanceSystemCnameResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.systemCname = builder.systemCname;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGtmInstanceSystemCnameResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return systemCname
     */
    public String getSystemCname() {
        return this.systemCname;
    }

    public static final class Builder {
        private String requestId; 
        private String systemCname; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SystemCname.
         */
        public Builder systemCname(String systemCname) {
            this.systemCname = systemCname;
            return this;
        }

        public DescribeGtmInstanceSystemCnameResponseBody build() {
            return new DescribeGtmInstanceSystemCnameResponseBody(this);
        } 

    } 

}
