// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLogstoreStorageRequest} extends {@link RequestModel}
 *
 * <p>DescribeLogstoreStorageRequest</p>
 */
public class DescribeLogstoreStorageRequest extends Request {
    @Query
    @NameInMap("From")
    private String from;

    @Query
    @NameInMap("Lang")
    private String lang;

    private DescribeLogstoreStorageRequest(Builder builder) {
        super(builder);
        this.from = builder.from;
        this.lang = builder.lang;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLogstoreStorageRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return from
     */
    public String getFrom() {
        return this.from;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    public static final class Builder extends Request.Builder<DescribeLogstoreStorageRequest, Builder> {
        private String from; 
        private String lang; 

        private Builder() {
            super();
        } 

        private Builder(DescribeLogstoreStorageRequest request) {
            super(request);
            this.from = request.from;
            this.lang = request.lang;
        } 

        /**
         * From.
         */
        public Builder from(String from) {
            this.putQueryParameter("From", from);
            this.from = from;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        @Override
        public DescribeLogstoreStorageRequest build() {
            return new DescribeLogstoreStorageRequest(this);
        } 

    } 

}
