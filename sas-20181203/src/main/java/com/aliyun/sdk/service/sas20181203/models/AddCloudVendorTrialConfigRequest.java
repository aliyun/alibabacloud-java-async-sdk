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
         * <p>The AccessKey ID.</p>
         * <blockquote>
         * <p> <a href="#-describecloudvendoraccountaklist--authid"></a>You can call the <a href="~~DescribeCloudVendorAccountAKList~~">DescribeCloudVendorAccountAKList</a> operation to query the AccessKey ID.</p>
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
         * <p>The configurations of the third-party cloud asset. Valid values:</p>
         * <ul>
         * <li><em>AWS</em>: Configure the sqsQueueName and sqsRegion parameters.</li>
         * <li><em>Tencent</em>: Configure the kafkaUserName, kafkaBootstrapServers, and kafkaTopic parameters.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;sqsRegion&quot;:&quot;us-west-2&quot;,&quot;sqsQueueName&quot;:&quot;****&quot;}</p>
         */
        public Builder authInfo(String authInfo) {
            this.putQueryParameter("AuthInfo", authInfo);
            this.authInfo = authInfo;
            return this;
        }

        /**
         * <p>The service provider of the cloud asset. Valid values:</p>
         * <ul>
         * <li><strong>Tencent</strong>: Tencent Cloud.</li>
         * <li><strong>AWS</strong>: Amazon Web Services (AWS).</li>
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
