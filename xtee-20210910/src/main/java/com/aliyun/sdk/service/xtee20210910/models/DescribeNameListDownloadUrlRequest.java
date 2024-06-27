// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeNameListDownloadUrlRequest} extends {@link RequestModel}
 *
 * <p>DescribeNameListDownloadUrlRequest</p>
 */
public class DescribeNameListDownloadUrlRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    private String regId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("variableId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long variableId;

    private DescribeNameListDownloadUrlRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.regId = builder.regId;
        this.variableId = builder.variableId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNameListDownloadUrlRequest create() {
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
     * @return regId
     */
    public String getRegId() {
        return this.regId;
    }

    /**
     * @return variableId
     */
    public Long getVariableId() {
        return this.variableId;
    }

    public static final class Builder extends Request.Builder<DescribeNameListDownloadUrlRequest, Builder> {
        private String lang; 
        private String regId; 
        private Long variableId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeNameListDownloadUrlRequest request) {
            super(request);
            this.lang = request.lang;
            this.regId = request.regId;
            this.variableId = request.variableId;
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
         * regId.
         */
        public Builder regId(String regId) {
            this.putQueryParameter("regId", regId);
            this.regId = regId;
            return this;
        }

        /**
         * variableId.
         */
        public Builder variableId(Long variableId) {
            this.putQueryParameter("variableId", variableId);
            this.variableId = variableId;
            return this;
        }

        @Override
        public DescribeNameListDownloadUrlRequest build() {
            return new DescribeNameListDownloadUrlRequest(this);
        } 

    } 

}
