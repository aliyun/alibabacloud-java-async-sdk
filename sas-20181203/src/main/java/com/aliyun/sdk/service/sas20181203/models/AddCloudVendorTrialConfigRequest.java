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
         * <p>Unique ID of the AK.</p>
         * <blockquote>
         * <h2>You can call <a href="~~DescribeCloudVendorAccountAKList~~">DescribeCloudVendorAccountAKList</a> to get the AuthId.</h2>
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
         * <p>Enter multi-cloud configuration information:</p>
         * <ul>
         * <li><em>AWS</em>: Parameters include sqsQueueName, sqsRegion</li>
         * <li><em>Tencent</em>: Parameters include kafkaUserName, kafkaBootstrapServers, kafkaTopic</li>
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
         * <p>Cloud asset vendor. Values:</p>
         * <ul>
         * <li><strong>Tencent</strong>: Tencent Cloud</li>
         * <li><strong>AWS</strong>: AWS (Note: The original text incorrectly states &quot;Microsoft&quot;, which should be &quot;AWS&quot; based on context.)</li>
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
