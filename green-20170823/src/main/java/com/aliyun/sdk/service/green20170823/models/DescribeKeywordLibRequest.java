// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20170823.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeKeywordLibRequest} extends {@link RequestModel}
 *
 * <p>DescribeKeywordLibRequest</p>
 */
public class DescribeKeywordLibRequest extends Request {
    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("ServiceModule")
    @Validation(required = true)
    private String serviceModule;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    private DescribeKeywordLibRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.serviceModule = builder.serviceModule;
        this.sourceIp = builder.sourceIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeKeywordLibRequest create() {
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
     * @return serviceModule
     */
    public String getServiceModule() {
        return this.serviceModule;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    public static final class Builder extends Request.Builder<DescribeKeywordLibRequest, Builder> {
        private String lang; 
        private String serviceModule; 
        private String sourceIp; 

        private Builder() {
            super();
        } 

        private Builder(DescribeKeywordLibRequest request) {
            super(request);
            this.lang = request.lang;
            this.serviceModule = request.serviceModule;
            this.sourceIp = request.sourceIp;
        } 

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * ServiceModule.
         */
        public Builder serviceModule(String serviceModule) {
            this.putQueryParameter("ServiceModule", serviceModule);
            this.serviceModule = serviceModule;
            return this;
        }

        /**
         * SourceIp.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        @Override
        public DescribeKeywordLibRequest build() {
            return new DescribeKeywordLibRequest(this);
        } 

    } 

}
