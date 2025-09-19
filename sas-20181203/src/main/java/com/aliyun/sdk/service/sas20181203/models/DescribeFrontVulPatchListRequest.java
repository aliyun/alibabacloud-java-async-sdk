// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeFrontVulPatchListRequest} extends {@link RequestModel}
 *
 * <p>DescribeFrontVulPatchListRequest</p>
 */
public class DescribeFrontVulPatchListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Info")
    @com.aliyun.core.annotation.Validation(required = true)
    private String info;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OperateType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String operateType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The information about the Windows system vulnerability. The value is a JSON string that contains the following fields:</p>
         * <ul>
         * <li><strong>name</strong>: the name of the vulnerability.</li>
         * <li><strong>uuid</strong>: the UUID of the server on which the vulnerability is detected.</li>
         * <li><strong>tag</strong>: the tag that is added to the vulnerability. Set this field to <strong>system</strong>, which indicates Windows system vulnerabilities.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;name&quot;:&quot;5000803&quot;,&quot;uuid&quot;:&quot;026c9296-1234-5678-b937-a7d81f05****&quot;,&quot;tag&quot;:&quot;system&quot;}]</p>
         */
        public Builder info(String info) {
            this.putQueryParameter("Info", info);
            this.info = info;
            return this;
        }

        /**
         * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese</li>
         * <li><strong>en</strong>: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The operation that you want to perform on the vulnerability. Set the value to <strong>vul_fix</strong>, which indicates vulnerability fixing.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vul_fix</p>
         */
        public Builder operateType(String operateType) {
            this.putQueryParameter("OperateType", operateType);
            this.operateType = operateType;
            return this;
        }

        /**
         * <p>The type of the vulnerability. Set the value to <strong>sys</strong>, which indicates Windows system vulnerabilities.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sys</p>
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
