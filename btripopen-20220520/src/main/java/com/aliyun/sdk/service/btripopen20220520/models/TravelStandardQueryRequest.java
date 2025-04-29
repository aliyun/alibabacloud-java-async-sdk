// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

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
 * {@link TravelStandardQueryRequest} extends {@link RequestModel}
 *
 * <p>TravelStandardQueryRequest</p>
 */
public class TravelStandardQueryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("from_group")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean fromGroup;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("rule_code")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long ruleCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("service_type_list")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> serviceTypeList;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-btrip-corp-token")
    private String xAcsBtripCorpToken;

    private TravelStandardQueryRequest(Builder builder) {
        super(builder);
        this.fromGroup = builder.fromGroup;
        this.ruleCode = builder.ruleCode;
        this.serviceTypeList = builder.serviceTypeList;
        this.xAcsBtripCorpToken = builder.xAcsBtripCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TravelStandardQueryRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fromGroup
     */
    public Boolean getFromGroup() {
        return this.fromGroup;
    }

    /**
     * @return ruleCode
     */
    public Long getRuleCode() {
        return this.ruleCode;
    }

    /**
     * @return serviceTypeList
     */
    public java.util.List<String> getServiceTypeList() {
        return this.serviceTypeList;
    }

    /**
     * @return xAcsBtripCorpToken
     */
    public String getXAcsBtripCorpToken() {
        return this.xAcsBtripCorpToken;
    }

    public static final class Builder extends Request.Builder<TravelStandardQueryRequest, Builder> {
        private Boolean fromGroup; 
        private Long ruleCode; 
        private java.util.List<String> serviceTypeList; 
        private String xAcsBtripCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(TravelStandardQueryRequest request) {
            super(request);
            this.fromGroup = request.fromGroup;
            this.ruleCode = request.ruleCode;
            this.serviceTypeList = request.serviceTypeList;
            this.xAcsBtripCorpToken = request.xAcsBtripCorpToken;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder fromGroup(Boolean fromGroup) {
            this.putQueryParameter("from_group", fromGroup);
            this.fromGroup = fromGroup;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2006523763</p>
         */
        public Builder ruleCode(Long ruleCode) {
            this.putQueryParameter("rule_code", ruleCode);
            this.ruleCode = ruleCode;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder serviceTypeList(java.util.List<String> serviceTypeList) {
            String serviceTypeListShrink = shrink(serviceTypeList, "service_type_list", "json");
            this.putQueryParameter("service_type_list", serviceTypeListShrink);
            this.serviceTypeList = serviceTypeList;
            return this;
        }

        /**
         * x-acs-btrip-corp-token.
         */
        public Builder xAcsBtripCorpToken(String xAcsBtripCorpToken) {
            this.putHeaderParameter("x-acs-btrip-corp-token", xAcsBtripCorpToken);
            this.xAcsBtripCorpToken = xAcsBtripCorpToken;
            return this;
        }

        @Override
        public TravelStandardQueryRequest build() {
            return new TravelStandardQueryRequest(this);
        } 

    } 

}
