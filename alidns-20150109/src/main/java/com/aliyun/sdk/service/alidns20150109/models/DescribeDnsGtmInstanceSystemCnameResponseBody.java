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
 * {@link DescribeDnsGtmInstanceSystemCnameResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDnsGtmInstanceSystemCnameResponseBody</p>
 */
public class DescribeDnsGtmInstanceSystemCnameResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SystemCname")
    private String systemCname;

    private DescribeDnsGtmInstanceSystemCnameResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.systemCname = builder.systemCname;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDnsGtmInstanceSystemCnameResponseBody create() {
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

        private Builder(DescribeDnsGtmInstanceSystemCnameResponseBody model) {
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
         * <p>The CNAME domain name assigned by the system.</p>
         * 
         * <strong>example:</strong>
         * <p>gtminstance.com</p>
         */
        public Builder systemCname(String systemCname) {
            this.systemCname = systemCname;
            return this;
        }

        public DescribeDnsGtmInstanceSystemCnameResponseBody build() {
            return new DescribeDnsGtmInstanceSystemCnameResponseBody(this);
        } 

    } 

}
