// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyCreateVulWhitelistResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyCreateVulWhitelistResponseBody</p>
 */
public class ModifyCreateVulWhitelistResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("VulWhitelistList")
    private java.util.List < VulWhitelistList> vulWhitelistList;

    private ModifyCreateVulWhitelistResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.vulWhitelistList = builder.vulWhitelistList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyCreateVulWhitelistResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return vulWhitelistList
     */
    public java.util.List < VulWhitelistList> getVulWhitelistList() {
        return this.vulWhitelistList;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < VulWhitelistList> vulWhitelistList; 

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * An array that consists of the information about the whitelist.
         */
        public Builder vulWhitelistList(java.util.List < VulWhitelistList> vulWhitelistList) {
            this.vulWhitelistList = vulWhitelistList;
            return this;
        }

        public ModifyCreateVulWhitelistResponseBody build() {
            return new ModifyCreateVulWhitelistResponseBody(this);
        } 

    } 

    public static class VulWhitelistList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        private VulWhitelistList(Builder builder) {
            this.id = builder.id;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VulWhitelistList create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        public static final class Builder {
            private Long id; 

            /**
             * The ID of the whitelist.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            public VulWhitelistList build() {
                return new VulWhitelistList(this);
            } 

        } 

    }
}
