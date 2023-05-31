// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeFrontVulPatchListRequest} extends {@link RequestModel}
 *
 * <p>DescribeFrontVulPatchListRequest</p>
 */
public class DescribeFrontVulPatchListRequest extends Request {
    @Query
    @NameInMap("Info")
    @Validation(required = true)
    private String info;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("OperateType")
    @Validation(required = true)
    private String operateType;

    @Query
    @NameInMap("Type")
    @Validation(required = true)
    private String type;

    private DescribeFrontVulPatchListRequest(Builder builder) {
        super(builder);
        this.info = builder.info;
        this.lang = builder.lang;
        this.operateType = builder.operateType;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFrontVulPatchListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return info
     */
    public String getInfo() {
        return this.info;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return operateType
     */
    public String getOperateType() {
        return this.operateType;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<DescribeFrontVulPatchListRequest, Builder> {
        private String info; 
        private String lang; 
        private String operateType; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(DescribeFrontVulPatchListRequest request) {
            super(request);
            this.info = request.info;
            this.lang = request.lang;
            this.operateType = request.operateType;
            this.type = request.type;
        } 

        /**
         * The information about the Windows system vulnerability. The value is a JSON string that contains the following fields:
         * <p>
         * 
         * *   **name**: the name of the vulnerability.
         * *   **uuid**: the UUID of the server on which the vulnerability is detected.
         * *   **tag**: the tag that is added to the vulnerability. Set this field to **system**, which indicates Windows system vulnerabilities.
         */
        public Builder info(String info) {
            this.putQueryParameter("Info", info);
            this.info = info;
            return this;
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
         * The operation that you want to perform on the vulnerability. Set the value to **vul_fix**, which indicates vulnerability fixing.
         */
        public Builder operateType(String operateType) {
            this.putQueryParameter("OperateType", operateType);
            this.operateType = operateType;
            return this;
        }

        /**
         * The type of the vulnerability. Set the value to **sys**, which indicates Windows system vulnerabilities.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public DescribeFrontVulPatchListRequest build() {
            return new DescribeFrontVulPatchListRequest(this);
        } 

    } 

}
