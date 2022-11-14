// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alinlp20200629.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InsertCustomRequest} extends {@link RequestModel}
 *
 * <p>InsertCustomRequest</p>
 */
public class InsertCustomRequest extends Request {
    @Body
    @NameInMap("ApiId")
    @Validation(required = true, maximum = 10000000)
    private Integer apiId;

    @Body
    @NameInMap("CustomFileName")
    @Validation(required = true)
    private String customFileName;

    @Body
    @NameInMap("CustomUrl")
    @Validation(required = true)
    private String customUrl;

    @Body
    @NameInMap("RegFileName")
    @Validation(required = true)
    private String regFileName;

    @Body
    @NameInMap("RegUrl")
    @Validation(required = true)
    private String regUrl;

    @Body
    @NameInMap("ServiceCode")
    @Validation(required = true)
    private String serviceCode;

    private InsertCustomRequest(Builder builder) {
        super(builder);
        this.apiId = builder.apiId;
        this.customFileName = builder.customFileName;
        this.customUrl = builder.customUrl;
        this.regFileName = builder.regFileName;
        this.regUrl = builder.regUrl;
        this.serviceCode = builder.serviceCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InsertCustomRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiId
     */
    public Integer getApiId() {
        return this.apiId;
    }

    /**
     * @return customFileName
     */
    public String getCustomFileName() {
        return this.customFileName;
    }

    /**
     * @return customUrl
     */
    public String getCustomUrl() {
        return this.customUrl;
    }

    /**
     * @return regFileName
     */
    public String getRegFileName() {
        return this.regFileName;
    }

    /**
     * @return regUrl
     */
    public String getRegUrl() {
        return this.regUrl;
    }

    /**
     * @return serviceCode
     */
    public String getServiceCode() {
        return this.serviceCode;
    }

    public static final class Builder extends Request.Builder<InsertCustomRequest, Builder> {
        private Integer apiId; 
        private String customFileName; 
        private String customUrl; 
        private String regFileName; 
        private String regUrl; 
        private String serviceCode; 

        private Builder() {
            super();
        } 

        private Builder(InsertCustomRequest request) {
            super(request);
            this.apiId = request.apiId;
            this.customFileName = request.customFileName;
            this.customUrl = request.customUrl;
            this.regFileName = request.regFileName;
            this.regUrl = request.regUrl;
            this.serviceCode = request.serviceCode;
        } 

        /**
         * ApiId.
         */
        public Builder apiId(Integer apiId) {
            this.putBodyParameter("ApiId", apiId);
            this.apiId = apiId;
            return this;
        }

        /**
         * CustomFileName.
         */
        public Builder customFileName(String customFileName) {
            this.putBodyParameter("CustomFileName", customFileName);
            this.customFileName = customFileName;
            return this;
        }

        /**
         * CustomUrl.
         */
        public Builder customUrl(String customUrl) {
            this.putBodyParameter("CustomUrl", customUrl);
            this.customUrl = customUrl;
            return this;
        }

        /**
         * RegFileName.
         */
        public Builder regFileName(String regFileName) {
            this.putBodyParameter("RegFileName", regFileName);
            this.regFileName = regFileName;
            return this;
        }

        /**
         * RegUrl.
         */
        public Builder regUrl(String regUrl) {
            this.putBodyParameter("RegUrl", regUrl);
            this.regUrl = regUrl;
            return this;
        }

        /**
         * ServiceCode.
         */
        public Builder serviceCode(String serviceCode) {
            this.putBodyParameter("ServiceCode", serviceCode);
            this.serviceCode = serviceCode;
            return this;
        }

        @Override
        public InsertCustomRequest build() {
            return new InsertCustomRequest(this);
        } 

    } 

}
