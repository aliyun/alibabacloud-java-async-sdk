// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CheckCdnDomainExistResponseBody} extends {@link TeaModel}
 *
 * <p>CheckCdnDomainExistResponseBody</p>
 */
public class CheckCdnDomainExistResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private CheckCdnDomainExistResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckCdnDomainExistResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String requestId; 
        private String status; 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>64D28B53-5902-409B-94F6-FD46680144FE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The status of the domain name. Valid values:</p>
         * <ul>
         * <li><strong>DomainNotExist</strong>: The domain name is not added.</li>
         * <li><strong>DomainExistOtherUser</strong>: The domain name has been added by another account.</li>
         * <li><strong>DomainExistCdnProduct</strong>: The domain name has been added to Alibaba Cloud CDN.</li>
         * <li><strong>DomainExistDcdnProduct</strong>: The domain name has been added to Dynamic Content Delivery Network (DCDN).</li>
         * <li><strong>DomainExistScdnProduct</strong>: The domain name has been added to Secure CDN (SCDN).</li>
         * <li><strong>DomainExistVodProduct</strong>: The domain name has been added to ApsaraVideo VOD.</li>
         * <li><strong>DomainExistLiveProduct</strong>: The domain name has been added to ApsaraVideo Live.</li>
         * <li><strong>DomainExistDcdnipaProduct</strong>: The domain name has been added to DCDN IP Application Accelerator (IPA).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DomainNotExist</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public CheckCdnDomainExistResponseBody build() {
            return new CheckCdnDomainExistResponseBody(this);
        } 

    } 

}
