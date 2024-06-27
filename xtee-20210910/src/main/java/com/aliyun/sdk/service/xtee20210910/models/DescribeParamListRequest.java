// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeParamListRequest} extends {@link RequestModel}
 *
 * <p>DescribeParamListRequest</p>
 */
public class DescribeParamListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("fileUrl")
    private String fileUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    private String regId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("serviceCode")
    private String serviceCode;

    private DescribeParamListRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.fileUrl = builder.fileUrl;
        this.regId = builder.regId;
        this.serviceCode = builder.serviceCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeParamListRequest create() {
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
     * @return fileUrl
     */
    public String getFileUrl() {
        return this.fileUrl;
    }

    /**
     * @return regId
     */
    public String getRegId() {
        return this.regId;
    }

    /**
     * @return serviceCode
     */
    public String getServiceCode() {
        return this.serviceCode;
    }

    public static final class Builder extends Request.Builder<DescribeParamListRequest, Builder> {
        private String lang; 
        private String fileUrl; 
        private String regId; 
        private String serviceCode; 

        private Builder() {
            super();
        } 

        private Builder(DescribeParamListRequest request) {
            super(request);
            this.lang = request.lang;
            this.fileUrl = request.fileUrl;
            this.regId = request.regId;
            this.serviceCode = request.serviceCode;
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
         * fileUrl.
         */
        public Builder fileUrl(String fileUrl) {
            this.putQueryParameter("fileUrl", fileUrl);
            this.fileUrl = fileUrl;
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
         * serviceCode.
         */
        public Builder serviceCode(String serviceCode) {
            this.putQueryParameter("serviceCode", serviceCode);
            this.serviceCode = serviceCode;
            return this;
        }

        @Override
        public DescribeParamListRequest build() {
            return new DescribeParamListRequest(this);
        } 

    } 

}
