// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

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
 * {@link DescribeApisRequest} extends {@link RequestModel}
 *
 * <p>DescribeApisRequest</p>
 */
public class DescribeApisRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("apiGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String apiGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("apiRegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String apiRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("apiType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String apiType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    private String regId;

    private DescribeApisRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.apiGroupId = builder.apiGroupId;
        this.apiRegionId = builder.apiRegionId;
        this.apiType = builder.apiType;
        this.regId = builder.regId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApisRequest create() {
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
     * @return apiGroupId
     */
    public String getApiGroupId() {
        return this.apiGroupId;
    }

    /**
     * @return apiRegionId
     */
    public String getApiRegionId() {
        return this.apiRegionId;
    }

    /**
     * @return apiType
     */
    public String getApiType() {
        return this.apiType;
    }

    /**
     * @return regId
     */
    public String getRegId() {
        return this.regId;
    }

    public static final class Builder extends Request.Builder<DescribeApisRequest, Builder> {
        private String lang; 
        private String apiGroupId; 
        private String apiRegionId; 
        private String apiType; 
        private String regId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeApisRequest request) {
            super(request);
            this.lang = request.lang;
            this.apiGroupId = request.apiGroupId;
            this.apiRegionId = request.apiRegionId;
            this.apiType = request.apiType;
            this.regId = request.regId;
        } 

        /**
         * <p>Set the language type for requests and received messages, default value is <strong>zh</strong>. Values:</p>
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
         * <p>API group ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3309b0f4b1e243cd8bd9dd029f9c5f0a</p>
         */
        public Builder apiGroupId(String apiGroupId) {
            this.putQueryParameter("apiGroupId", apiGroupId);
            this.apiGroupId = apiGroupId;
            return this;
        }

        /**
         * <p>Region ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou、cn-shanghai</p>
         */
        public Builder apiRegionId(String apiRegionId) {
            this.putQueryParameter("apiRegionId", apiRegionId);
            this.apiRegionId = apiRegionId;
            return this;
        }

        /**
         * <p>API type.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SELF</p>
         */
        public Builder apiType(String apiType) {
            this.putQueryParameter("apiType", apiType);
            this.apiType = apiType;
            return this;
        }

        /**
         * <p>Region code.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regId(String regId) {
            this.putQueryParameter("regId", regId);
            this.regId = regId;
            return this;
        }

        @Override
        public DescribeApisRequest build() {
            return new DescribeApisRequest(this);
        } 

    } 

}
