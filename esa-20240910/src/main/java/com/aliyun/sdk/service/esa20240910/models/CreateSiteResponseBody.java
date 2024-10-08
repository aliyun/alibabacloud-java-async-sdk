// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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

        /**
         * NameServerList.
         */
        public Builder nameServerList(String nameServerList) {
            this.nameServerList = nameServerList;
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
         * SiteId.
         */
        public Builder siteId(Long siteId) {
            this.siteId = siteId;
            return this;
        }

        /**
         * VerifyCode.
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
