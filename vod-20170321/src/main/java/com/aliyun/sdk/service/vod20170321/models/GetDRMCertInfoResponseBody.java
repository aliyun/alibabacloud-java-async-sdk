// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link GetDRMCertInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetDRMCertInfoResponseBody</p>
 */
public class GetDRMCertInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DRMCertInfo")
    private String DRMCertInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetDRMCertInfoResponseBody(Builder builder) {
        this.DRMCertInfo = builder.DRMCertInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDRMCertInfoResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DRMCertInfo
     */
    public String getDRMCertInfo() {
        return this.DRMCertInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String DRMCertInfo; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetDRMCertInfoResponseBody model) {
            this.DRMCertInfo = model.DRMCertInfo;
            this.requestId = model.requestId;
        } 

        /**
         * DRMCertInfo.
         */
        public Builder DRMCertInfo(String DRMCertInfo) {
            this.DRMCertInfo = DRMCertInfo;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetDRMCertInfoResponseBody build() {
            return new GetDRMCertInfoResponseBody(this);
        } 

    } 

}
