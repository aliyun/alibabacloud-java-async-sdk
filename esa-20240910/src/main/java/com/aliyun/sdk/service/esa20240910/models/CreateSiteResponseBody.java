// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link CreateSiteResponseBody} extends {@link TeaModel}
 *
 * <p>CreateSiteResponseBody</p>
 */
public class CreateSiteResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NameServerList")
    private String nameServerList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SiteId")
    private Long siteId;

    @com.aliyun.core.annotation.NameInMap("VerifyCode")
    private String verifyCode;

    private CreateSiteResponseBody(Builder builder) {
        this.nameServerList = builder.nameServerList;
        this.requestId = builder.requestId;
        this.siteId = builder.siteId;
        this.verifyCode = builder.verifyCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSiteResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return nameServerList
     */
    public String getNameServerList() {
        return this.nameServerList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return siteId
     */
    public Long getSiteId() {
        return this.siteId;
    }

    /**
     * @return verifyCode
     */
    public String getVerifyCode() {
        return this.verifyCode;
    }

    public static final class Builder {
        private String nameServerList; 
        private String requestId; 
        private Long siteId; 
        private String verifyCode; 

        private Builder() {
        } 

        private Builder(CreateSiteResponseBody model) {
            this.nameServerList = model.nameServerList;
            this.requestId = model.requestId;
            this.siteId = model.siteId;
            this.verifyCode = model.verifyCode;
        } 

        /**
         * <p>The list of NS records assigned to the site, separated by commas (,). This field has a value when the access type of the site is NS. You must change the DNS servers of the site to these NS records. Then you can verify the site ownership and activate the site.</p>
         * 
         * <strong>example:</strong>
         * <p>ns1.example.com,ns2.example.com</p>
         */
        public Builder nameServerList(String nameServerList) {
            this.nameServerList = nameServerList;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>CB1A380B-09F0-41BB-3C82-72F8FD6DA2FE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The site ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567890123</p>
         */
        public Builder siteId(Long siteId) {
            this.siteId = siteId;
            return this;
        }

        /**
         * <p>The verification code of the site. When the access type of the site is CNAME, you must add a TXT record to the DNS server of the site with the record name <strong>_esaauth.[site name]</strong> and the record value set to the <strong>verification code</strong>. Then you can verify the site ownership and activate the site.</p>
         * 
         * <strong>example:</strong>
         * <p>verify_aah9dioasmov****</p>
         */
        public Builder verifyCode(String verifyCode) {
            this.verifyCode = verifyCode;
            return this;
        }

        public CreateSiteResponseBody build() {
            return new CreateSiteResponseBody(this);
        } 

    } 

}
