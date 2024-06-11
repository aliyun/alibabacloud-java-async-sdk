// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.beian20160810.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitAccessorFullDomainsOssListRequest} extends {@link RequestModel}
 *
 * <p>SubmitAccessorFullDomainsOssListRequest</p>
 */
public class SubmitAccessorFullDomainsOssListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Caller")
    @com.aliyun.core.annotation.Validation(required = true)
    private String caller;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OssList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > ossList;

    private SubmitAccessorFullDomainsOssListRequest(Builder builder) {
        super(builder);
        this.caller = builder.caller;
        this.ossList = builder.ossList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitAccessorFullDomainsOssListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return caller
     */
    public String getCaller() {
        return this.caller;
    }

    /**
     * @return ossList
     */
    public java.util.List < String > getOssList() {
        return this.ossList;
    }

    public static final class Builder extends Request.Builder<SubmitAccessorFullDomainsOssListRequest, Builder> {
        private String caller; 
        private java.util.List < String > ossList; 

        private Builder() {
            super();
        } 

        private Builder(SubmitAccessorFullDomainsOssListRequest request) {
            super(request);
            this.caller = request.caller;
            this.ossList = request.ossList;
        } 

        /**
         * Caller.
         */
        public Builder caller(String caller) {
            this.putQueryParameter("Caller", caller);
            this.caller = caller;
            return this;
        }

        /**
         * OssList.
         */
        public Builder ossList(java.util.List < String > ossList) {
            this.putQueryParameter("OssList", ossList);
            this.ossList = ossList;
            return this;
        }

        @Override
        public SubmitAccessorFullDomainsOssListRequest build() {
            return new SubmitAccessorFullDomainsOssListRequest(this);
        } 

    } 

}
