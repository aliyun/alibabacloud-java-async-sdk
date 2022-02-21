// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20180713.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeOrderInstanceListRequest} extends {@link RequestModel}
 *
 * <p>DescribeOrderInstanceListRequest</p>
 */
public class DescribeOrderInstanceListRequest extends Request {
    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    @Query
    @NameInMap("StartIndex")
    @Validation(required = true)
    private Integer startIndex;

    private DescribeOrderInstanceListRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.sourceIp = builder.sourceIp;
        this.startIndex = builder.startIndex;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeOrderInstanceListRequest create() {
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

    /**
     * @return startIndex
     */
    public Integer getStartIndex() {
        return this.startIndex;
    }

    public static final class Builder extends Request.Builder<DescribeOrderInstanceListRequest, Builder> {
        private String lang; 
        private String sourceIp; 
        private Integer startIndex; 

        private Builder() {
            super();
        } 

        private Builder(DescribeOrderInstanceListRequest response) {
            super(response);
            this.lang = response.lang;
            this.sourceIp = response.sourceIp;
            this.startIndex = response.startIndex;
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
         * SourceIp.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * StartIndex.
         */
        public Builder startIndex(Integer startIndex) {
            this.putQueryParameter("StartIndex", startIndex);
            this.startIndex = startIndex;
            return this;
        }

        @Override
        public DescribeOrderInstanceListRequest build() {
            return new DescribeOrderInstanceListRequest(this);
        } 

    } 

}
