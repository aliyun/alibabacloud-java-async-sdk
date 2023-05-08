// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSummaryInfoRequest} extends {@link RequestModel}
 *
 * <p>DescribeSummaryInfoRequest</p>
 */
public class DescribeSummaryInfoRequest extends Request {
    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    private DescribeSummaryInfoRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.sourceIp = builder.sourceIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSummaryInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    public static final class Builder extends Request.Builder<DescribeSummaryInfoRequest, Builder> {
        private String lang; 
        private String sourceIp; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSummaryInfoRequest request) {
            super(request);
            this.lang = request.lang;
            this.sourceIp = request.sourceIp;
        } 

        /**
         * 192.168.XX.XX
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The source IP address of the request.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        @Override
        public DescribeSummaryInfoRequest build() {
            return new DescribeSummaryInfoRequest(this);
        } 

    } 

}
