// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeHttpTriggerConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeHttpTriggerConfigResponseBody</p>
 */
public class DescribeHttpTriggerConfigResponseBody extends TeaModel {
    @NameInMap("CustomDomain")
    private String customDomain;

    @NameInMap("CustomDomainCertificateInfo")
    private String customDomainCertificateInfo;

    @NameInMap("CustomDomainCname")
    private String customDomainCname;

    @NameInMap("DefaultEndpoint")
    private String defaultEndpoint;

    @NameInMap("EnableService")
    private Boolean enableService;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeHttpTriggerConfigResponseBody(Builder builder) {
        this.customDomain = builder.customDomain;
        this.customDomainCertificateInfo = builder.customDomainCertificateInfo;
        this.customDomainCname = builder.customDomainCname;
        this.defaultEndpoint = builder.defaultEndpoint;
        this.enableService = builder.enableService;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHttpTriggerConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return customDomain
     */
    public String getCustomDomain() {
        return this.customDomain;
    }

    /**
     * @return customDomainCertificateInfo
     */
    public String getCustomDomainCertificateInfo() {
        return this.customDomainCertificateInfo;
    }

    /**
     * @return customDomainCname
     */
    public String getCustomDomainCname() {
        return this.customDomainCname;
    }

    /**
     * @return defaultEndpoint
     */
    public String getDefaultEndpoint() {
        return this.defaultEndpoint;
    }

    /**
     * @return enableService
     */
    public Boolean getEnableService() {
        return this.enableService;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String customDomain; 
        private String customDomainCertificateInfo; 
        private String customDomainCname; 
        private String defaultEndpoint; 
        private Boolean enableService; 
        private String requestId; 

        /**
         * CustomDomain.
         */
        public Builder customDomain(String customDomain) {
            this.customDomain = customDomain;
            return this;
        }

        /**
         * CustomDomainCertificateInfo.
         */
        public Builder customDomainCertificateInfo(String customDomainCertificateInfo) {
            this.customDomainCertificateInfo = customDomainCertificateInfo;
            return this;
        }

        /**
         * CustomDomainCname.
         */
        public Builder customDomainCname(String customDomainCname) {
            this.customDomainCname = customDomainCname;
            return this;
        }

        /**
         * DefaultEndpoint.
         */
        public Builder defaultEndpoint(String defaultEndpoint) {
            this.defaultEndpoint = defaultEndpoint;
            return this;
        }

        /**
         * EnableService.
         */
        public Builder enableService(Boolean enableService) {
            this.enableService = enableService;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeHttpTriggerConfigResponseBody build() {
            return new DescribeHttpTriggerConfigResponseBody(this);
        } 

    } 

}
