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
 * {@link AddCloudVendorTrialConfigRequest} extends {@link RequestModel}
 *
 * <p>AddCloudVendorTrialConfigRequest</p>
 */
public class AddCloudVendorTrialConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long authId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthInfo")
    @com.aliyun.core.annotation.Validation(required = true)
    private String authInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Vendor")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vendor;

    private AddCloudVendorTrialConfigRequest(Builder builder) {
        super(builder);
        this.authId = builder.authId;
        this.authInfo = builder.authInfo;
        this.vendor = builder.vendor;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddCloudVendorTrialConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authId
     */
    public Long getAuthId() {
        return this.authId;
    }

    /**
     * @return authInfo
     */
    public String getAuthInfo() {
        return this.authInfo;
    }

    /**
     * @return vendor
     */
    public String getVendor() {
        return this.vendor;
    }

    public static final class Builder extends Request.Builder<AddCloudVendorTrialConfigRequest, Builder> {
        private Long authId; 
        private String authInfo; 
        private String vendor; 

        private Builder() {
            super();
        } 

        private Builder(AddCloudVendorTrialConfigRequest request) {
            super(request);
            this.authId = request.authId;
            this.authInfo = request.authInfo;
            this.vendor = request.vendor;
        } 

        /**
         * <p>The unique ID of the AccessKey pair.</p>
         * <blockquote>
         * <h2>You can call <a href="~~DescribeCloudVendorAccountAKList~~">DescribeCloudVendorAccountAKList</a> to obtain the AuthId.</h2>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2363</p>
         */
        public Builder authId(Long authId) {
            this.putQueryParameter("AuthId", authId);
            this.authId = authId;
            return this;
        }

        /**
         * <p>The multi-cloud configuration information:</p>
         * <ul>
         * <li><em>AWS</em>: Input parameters sqsQueueName and sqsRegion.</li>
         * <li><em>Tencent</em>: Input parameters kafkaUserName, kafkaBootstrapServers, and kafkaTopic.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;sqsRegion\&quot;:\&quot;us-west-2\&quot;,\&quot;sqsQueueName\&quot;:\&quot;****\&quot;}</p>
         */
        public Builder authInfo(String authInfo) {
            this.putQueryParameter("AuthInfo", authInfo);
            this.authInfo = authInfo;
            return this;
        }

        /**
         * <p>The cloud asset vendor. Valid values:</p>
         * <ul>
         * <li><strong>Tencent</strong>: Tencent Cloud.</li>
         * <li><strong>HUAWEICLOUD</strong>: Huawei Cloud.</li>
         * <li><strong>Azure</strong>: Azure.</li>
         * <li><strong>AWS</strong>: AWS.</li>
         * <li><strong>VOLCENGINE</strong>: Volcengine.</li>
         * <li><strong>google</strong>: Google Cloud.</li>
         * <li><strong>CHAITIN</strong>: Chaitin Technology.</li>
         * <li><strong>FORTINET</strong>: Fortinet.</li>
         * <li><strong>THREATBOOK</strong>: ThreatBook.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Tencent</p>
         */
        public Builder vendor(String vendor) {
            this.putQueryParameter("Vendor", vendor);
            this.vendor = vendor;
            return this;
        }

        @Override
        public AddCloudVendorTrialConfigRequest build() {
            return new AddCloudVendorTrialConfigRequest(this);
        } 

    } 

}
