// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

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
 * {@link DescribeGtmInstanceSystemCnameResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeGtmInstanceSystemCnameResponseBody</p>
 */
public class DescribeGtmInstanceSystemCnameResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SystemCname")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeGtmInstanceSystemCnameResponseBody model) {
            this.requestId = model.requestId;
            this.systemCname = model.systemCname;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>6856BCF6-11D6-4D7E-AC53-FD579933522B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The CNAME record assigned by the system.</p>
         * 
         * <strong>example:</strong>
         * <p>gtm-cn-mp91004xxxx.gtm-a2b4.com</p>
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
