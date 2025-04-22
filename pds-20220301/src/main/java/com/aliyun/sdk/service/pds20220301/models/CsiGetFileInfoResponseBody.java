// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

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
 * {@link CsiGetFileInfoResponseBody} extends {@link TeaModel}
 *
 * <p>CsiGetFileInfoResponseBody</p>
 */
public class CsiGetFileInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("investigation_info")
    private InvestigationInfo investigationInfo;

    @com.aliyun.core.annotation.NameInMap("url")
    private String url;

    private CsiGetFileInfoResponseBody(Builder builder) {
        this.investigationInfo = builder.investigationInfo;
        this.url = builder.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CsiGetFileInfoResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return investigationInfo
     */
    public InvestigationInfo getInvestigationInfo() {
        return this.investigationInfo;
    }

    /**
     * @return url
     */
    public String getUrl() {
        return this.url;
    }

    public static final class Builder {
        private InvestigationInfo investigationInfo; 
        private String url; 

        private Builder() {
        } 

        private Builder(CsiGetFileInfoResponseBody model) {
            this.investigationInfo = model.investigationInfo;
            this.url = model.url;
        } 

        /**
         * investigation_info.
         */
        public Builder investigationInfo(InvestigationInfo investigationInfo) {
            this.investigationInfo = investigationInfo;
            return this;
        }

        /**
         * url.
         */
        public Builder url(String url) {
            this.url = url;
            return this;
        }

        public CsiGetFileInfoResponseBody build() {
            return new CsiGetFileInfoResponseBody(this);
        } 

    } 

}
