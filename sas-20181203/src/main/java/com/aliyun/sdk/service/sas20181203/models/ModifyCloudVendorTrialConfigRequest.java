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
 * {@link ModifyCloudVendorTrialConfigRequest} extends {@link RequestModel}
 *
 * <p>ModifyCloudVendorTrialConfigRequest</p>
 */
public class ModifyCloudVendorTrialConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long authId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthInfo")
    private String authInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeleteTrail")
    private Boolean deleteTrail;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Vendor")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vendor;

    private ModifyCloudVendorTrialConfigRequest(Builder builder) {
        super(builder);
        this.authId = builder.authId;
        this.authInfo = builder.authInfo;
        this.deleteTrail = builder.deleteTrail;
        this.vendor = builder.vendor;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyCloudVendorTrialConfigRequest create() {
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
     * @return deleteTrail
     */
    public Boolean getDeleteTrail() {
        return this.deleteTrail;
    }

    /**
     * @return vendor
     */
    public String getVendor() {
        return this.vendor;
    }

    public static final class Builder extends Request.Builder<ModifyCloudVendorTrialConfigRequest, Builder> {
        private Long authId; 
        private String authInfo; 
        private Boolean deleteTrail; 
        private String vendor; 

        private Builder() {
            super();
        } 

        private Builder(ModifyCloudVendorTrialConfigRequest request) {
            super(request);
            this.authId = request.authId;
            this.authInfo = request.authInfo;
            this.deleteTrail = request.deleteTrail;
            this.vendor = request.vendor;
        } 

        /**
         * <p>The ID of the audit log configuration to be modified.</p>
         * <blockquote>
         * <p>The ID can be queried via <a href="~~DescribeCloudVendorAccountAKList~~">DescribeCloudVendorAccountAKList</a>.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>23**</p>
         */
        public Builder authId(Long authId) {
            this.putQueryParameter("AuthId", authId);
            this.authId = authId;
            return this;
        }

        /**
         * <p>Enter the multi-cloud configuration information:</p>
         * <ul>
         * <li>AWS: parameters sqsQueueName, sqsRegion</li>
         * <li>Tencent: parameters kafkaUserName, kafkaBootstrapServers, kafkaTopic</li>
         * </ul>
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
         * <p>Whether to delete this audit log configuration:</p>
         * <ul>
         * <li>true: Delete</li>
         * <li>false: Do not delete</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder deleteTrail(Boolean deleteTrail) {
            this.putQueryParameter("DeleteTrail", deleteTrail);
            this.deleteTrail = deleteTrail;
            return this;
        }

        /**
         * <p>Cloud asset vendor. Values:</p>
         * <ul>
         * <li><strong>Tencent</strong>: Tencent Cloud</li>
         * <li><strong>AWS</strong>: AWS</li>
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
        public ModifyCloudVendorTrialConfigRequest build() {
            return new ModifyCloudVendorTrialConfigRequest(this);
        } 

    } 

}
