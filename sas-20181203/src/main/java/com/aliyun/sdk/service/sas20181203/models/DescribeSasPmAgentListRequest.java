// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSasPmAgentListRequest} extends {@link RequestModel}
 *
 * <p>DescribeSasPmAgentListRequest</p>
 */
public class DescribeSasPmAgentListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Uuids")
    @com.aliyun.core.annotation.Validation(required = true)
    private String uuids;

    private DescribeSasPmAgentListRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.uuids = builder.uuids;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSasPmAgentListRequest create() {
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
     * @return uuids
     */
    public String getUuids() {
        return this.uuids;
    }

    public static final class Builder extends Request.Builder<DescribeSasPmAgentListRequest, Builder> {
        private String lang; 
        private String uuids; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSasPmAgentListRequest request) {
            super(request);
            this.lang = request.lang;
            this.uuids = request.uuids;
        } 

        /**
         * The language of the content within the request and response. Default value: **zh**. Valid values:
         * <p>
         * 
         * *   **zh**: Chinese
         * *   **en**: English
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The UUID of the server. Separate multiple UUIDs with commas (,).
         */
        public Builder uuids(String uuids) {
            this.putQueryParameter("Uuids", uuids);
            this.uuids = uuids;
            return this;
        }

        @Override
        public DescribeSasPmAgentListRequest build() {
            return new DescribeSasPmAgentListRequest(this);
        } 

    } 

}
