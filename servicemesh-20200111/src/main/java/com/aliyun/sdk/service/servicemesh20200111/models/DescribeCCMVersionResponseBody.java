// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

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
 * {@link DescribeCCMVersionResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCCMVersionResponseBody</p>
 */
public class DescribeCCMVersionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CCMVersions")
    private java.util.Map<String, CCMVersionsValue> CCMVersions;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeCCMVersionResponseBody(Builder builder) {
        this.CCMVersions = builder.CCMVersions;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCCMVersionResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return CCMVersions
     */
    public java.util.Map<String, CCMVersionsValue> getCCMVersions() {
        return this.CCMVersions;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.Map<String, CCMVersionsValue> CCMVersions; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeCCMVersionResponseBody model) {
            this.CCMVersions = model.CCMVersions;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The versions of the CCM component in all clusters on the data plane.</p>
         */
        public Builder CCMVersions(java.util.Map<String, CCMVersionsValue> CCMVersions) {
            this.CCMVersions = CCMVersions;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>BD65C0AD-D3C6-48D3-8D93-38D2015C****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeCCMVersionResponseBody build() {
            return new DescribeCCMVersionResponseBody(this);
        } 

    } 

}
