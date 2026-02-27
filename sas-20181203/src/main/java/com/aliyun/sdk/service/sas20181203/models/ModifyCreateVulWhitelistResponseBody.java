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
 * {@link ModifyCreateVulWhitelistResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyCreateVulWhitelistResponseBody</p>
 */
public class ModifyCreateVulWhitelistResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("VulWhitelistList")
    private VulWhitelistList vulWhitelistList;

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
     * @return vulWhitelistList
     */
    public VulWhitelistList getVulWhitelistList() {
        return this.vulWhitelistList;
    }

    public static final class Builder {
        private String requestId; 
        private VulWhitelistList vulWhitelistList; 

        private Builder() {
        } 

        private Builder(ModifyCreateVulWhitelistResponseBody model) {
            this.requestId = model.requestId;
            this.vulWhitelistList = model.vulWhitelistList;
        } 

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>6B23A612-D997-5176-8C3B-D640DFD65772</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Vulnerability whitelist information. 
         * <notice> This data is not returned when adding or updating the vulnerability whitelist in batches, it is only returned when adding or updating a single vulnerability whitelist entry. </notice></p>
         */
        public Builder vulWhitelistList(VulWhitelistList vulWhitelistList) {
            this.vulWhitelistList = vulWhitelistList;
            return this;
        }

        public ModifyCreateVulWhitelistResponseBody build() {
            return new ModifyCreateVulWhitelistResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ModifyCreateVulWhitelistResponseBody} extends {@link TeaModel}
     *
     * <p>ModifyCreateVulWhitelistResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(VulWhitelistList model) {
                this.id = model.id;
            } 

            /**
             * <p>Vulnerability whitelist ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1002</p>
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
