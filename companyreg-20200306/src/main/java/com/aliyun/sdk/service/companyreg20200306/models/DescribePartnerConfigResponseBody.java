// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.companyreg20200306.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePartnerConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePartnerConfigResponseBody</p>
 */
public class DescribePartnerConfigResponseBody extends TeaModel {
    @NameInMap("Contact")
    private String contact;

    @NameInMap("PartnerCode")
    private String partnerCode;

    @NameInMap("PartnerName")
    private String partnerName;

    @NameInMap("RequestId")
    private String requestId;

    private DescribePartnerConfigResponseBody(Builder builder) {
        this.contact = builder.contact;
        this.partnerCode = builder.partnerCode;
        this.partnerName = builder.partnerName;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePartnerConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return contact
     */
    public String getContact() {
        return this.contact;
    }

    /**
     * @return partnerCode
     */
    public String getPartnerCode() {
        return this.partnerCode;
    }

    /**
     * @return partnerName
     */
    public String getPartnerName() {
        return this.partnerName;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String contact; 
        private String partnerCode; 
        private String partnerName; 
        private String requestId; 

        /**
         * Contact.
         */
        public Builder contact(String contact) {
            this.contact = contact;
            return this;
        }

        /**
         * PartnerCode.
         */
        public Builder partnerCode(String partnerCode) {
            this.partnerCode = partnerCode;
            return this;
        }

        /**
         * PartnerName.
         */
        public Builder partnerName(String partnerName) {
            this.partnerName = partnerName;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribePartnerConfigResponseBody build() {
            return new DescribePartnerConfigResponseBody(this);
        } 

    } 

}
