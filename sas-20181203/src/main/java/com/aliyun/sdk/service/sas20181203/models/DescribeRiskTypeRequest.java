// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRiskTypeRequest} extends {@link RequestModel}
 *
 * <p>DescribeRiskTypeRequest</p>
 */
public class DescribeRiskTypeRequest extends Request {
    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("Source")
    private String source;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    private DescribeRiskTypeRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.source = builder.source;
        this.sourceIp = builder.sourceIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRiskTypeRequest create() {
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
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    public static final class Builder extends Request.Builder<DescribeRiskTypeRequest, Builder> {
        private String lang; 
        private String source; 
        private String sourceIp; 

        private Builder() {
            super();
        } 

        private Builder(DescribeRiskTypeRequest request) {
            super(request);
            this.lang = request.lang;
            this.source = request.source;
            this.sourceIp = request.sourceIp;
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
         * Source.
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
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
        public DescribeRiskTypeRequest build() {
            return new DescribeRiskTypeRequest(this);
        } 

    } 

}
