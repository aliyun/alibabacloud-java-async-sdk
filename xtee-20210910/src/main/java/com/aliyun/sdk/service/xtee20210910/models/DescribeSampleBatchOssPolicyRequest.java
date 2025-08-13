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
 * {@link DescribeSampleBatchOssPolicyRequest} extends {@link RequestModel}
 *
 * <p>DescribeSampleBatchOssPolicyRequest</p>
 */
public class DescribeSampleBatchOssPolicyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("batchName")
    private String batchName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    private String regId;

    private DescribeSampleBatchOssPolicyRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.batchName = builder.batchName;
        this.regId = builder.regId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSampleBatchOssPolicyRequest create() {
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
     * @return batchName
     */
    public String getBatchName() {
        return this.batchName;
    }

    /**
     * @return regId
     */
    public String getRegId() {
        return this.regId;
    }

    public static final class Builder extends Request.Builder<DescribeSampleBatchOssPolicyRequest, Builder> {
        private String lang; 
        private String batchName; 
        private String regId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSampleBatchOssPolicyRequest request) {
            super(request);
            this.lang = request.lang;
            this.batchName = request.batchName;
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
         * <p>Sample batch name</p>
         * 
         * <strong>example:</strong>
         * <p>白样本</p>
         */
        public Builder batchName(String batchName) {
            this.putQueryParameter("batchName", batchName);
            this.batchName = batchName;
            return this;
        }

        /**
         * <p>Region code</p>
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
        public DescribeSampleBatchOssPolicyRequest build() {
            return new DescribeSampleBatchOssPolicyRequest(this);
        } 

    } 

}
