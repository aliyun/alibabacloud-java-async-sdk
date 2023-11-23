// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dypls20170830.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryInvoiceInfoByRequestNoRequest} extends {@link RequestModel}
 *
 * <p>QueryInvoiceInfoByRequestNoRequest</p>
 */
public class QueryInvoiceInfoByRequestNoRequest extends Request {
    @Body
    @NameInMap("AppCode")
    private String appCode;

    @Body
    @NameInMap("EncryptProps")
    private java.util.Map < String, String > encryptProps;

    @Body
    @NameInMap("Language")
    private String language;

    @Body
    @NameInMap("RelatedSystem")
    private String relatedSystem;

    @Body
    @NameInMap("RequestNo")
    private String requestNo;

    @Body
    @NameInMap("Sign")
    private String sign;

    @Body
    @NameInMap("Uuid")
    private String uuid;

    private QueryInvoiceInfoByRequestNoRequest(Builder builder) {
        super(builder);
        this.appCode = builder.appCode;
        this.encryptProps = builder.encryptProps;
        this.language = builder.language;
        this.relatedSystem = builder.relatedSystem;
        this.requestNo = builder.requestNo;
        this.sign = builder.sign;
        this.uuid = builder.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryInvoiceInfoByRequestNoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appCode
     */
    public String getAppCode() {
        return this.appCode;
    }

    /**
     * @return encryptProps
     */
    public java.util.Map < String, String > getEncryptProps() {
        return this.encryptProps;
    }

    /**
     * @return language
     */
    public String getLanguage() {
        return this.language;
    }

    /**
     * @return relatedSystem
     */
    public String getRelatedSystem() {
        return this.relatedSystem;
    }

    /**
     * @return requestNo
     */
    public String getRequestNo() {
        return this.requestNo;
    }

    /**
     * @return sign
     */
    public String getSign() {
        return this.sign;
    }

    /**
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    public static final class Builder extends Request.Builder<QueryInvoiceInfoByRequestNoRequest, Builder> {
        private String appCode; 
        private java.util.Map < String, String > encryptProps; 
        private String language; 
        private String relatedSystem; 
        private String requestNo; 
        private String sign; 
        private String uuid; 

        private Builder() {
            super();
        } 

        private Builder(QueryInvoiceInfoByRequestNoRequest request) {
            super(request);
            this.appCode = request.appCode;
            this.encryptProps = request.encryptProps;
            this.language = request.language;
            this.relatedSystem = request.relatedSystem;
            this.requestNo = request.requestNo;
            this.sign = request.sign;
            this.uuid = request.uuid;
        } 

        /**
         * AppCode.
         */
        public Builder appCode(String appCode) {
            this.putBodyParameter("AppCode", appCode);
            this.appCode = appCode;
            return this;
        }

        /**
         * EncryptProps.
         */
        public Builder encryptProps(java.util.Map < String, String > encryptProps) {
            this.putBodyParameter("EncryptProps", encryptProps);
            this.encryptProps = encryptProps;
            return this;
        }

        /**
         * Language.
         */
        public Builder language(String language) {
            this.putBodyParameter("Language", language);
            this.language = language;
            return this;
        }

        /**
         * RelatedSystem.
         */
        public Builder relatedSystem(String relatedSystem) {
            this.putBodyParameter("RelatedSystem", relatedSystem);
            this.relatedSystem = relatedSystem;
            return this;
        }

        /**
         * RequestNo.
         */
        public Builder requestNo(String requestNo) {
            this.putBodyParameter("RequestNo", requestNo);
            this.requestNo = requestNo;
            return this;
        }

        /**
         * Sign.
         */
        public Builder sign(String sign) {
            this.putBodyParameter("Sign", sign);
            this.sign = sign;
            return this;
        }

        /**
         * Uuid.
         */
        public Builder uuid(String uuid) {
            this.putBodyParameter("Uuid", uuid);
            this.uuid = uuid;
            return this;
        }

        @Override
        public QueryInvoiceInfoByRequestNoRequest build() {
            return new QueryInvoiceInfoByRequestNoRequest(this);
        } 

    } 

}
