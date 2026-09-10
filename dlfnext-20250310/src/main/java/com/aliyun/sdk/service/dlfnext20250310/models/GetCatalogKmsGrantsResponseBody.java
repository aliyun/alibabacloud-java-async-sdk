// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dlfnext20250310.models;

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
 * {@link GetCatalogKmsGrantsResponseBody} extends {@link TeaModel}
 *
 * <p>GetCatalogKmsGrantsResponseBody</p>
 */
public class GetCatalogKmsGrantsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("dataAccessRoleArn")
    private String dataAccessRoleArn;

    @com.aliyun.core.annotation.NameInMap("keyPolicyStatement")
    private String keyPolicyStatement;

    @com.aliyun.core.annotation.NameInMap("region")
    private String region;

    @com.aliyun.core.annotation.NameInMap("workflowRoleArn")
    private String workflowRoleArn;

    private GetCatalogKmsGrantsResponseBody(Builder builder) {
        this.dataAccessRoleArn = builder.dataAccessRoleArn;
        this.keyPolicyStatement = builder.keyPolicyStatement;
        this.region = builder.region;
        this.workflowRoleArn = builder.workflowRoleArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCatalogKmsGrantsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataAccessRoleArn
     */
    public String getDataAccessRoleArn() {
        return this.dataAccessRoleArn;
    }

    /**
     * @return keyPolicyStatement
     */
    public String getKeyPolicyStatement() {
        return this.keyPolicyStatement;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return workflowRoleArn
     */
    public String getWorkflowRoleArn() {
        return this.workflowRoleArn;
    }

    public static final class Builder {
        private String dataAccessRoleArn; 
        private String keyPolicyStatement; 
        private String region; 
        private String workflowRoleArn; 

        private Builder() {
        } 

        private Builder(GetCatalogKmsGrantsResponseBody model) {
            this.dataAccessRoleArn = model.dataAccessRoleArn;
            this.keyPolicyStatement = model.keyPolicyStatement;
            this.region = model.region;
            this.workflowRoleArn = model.workflowRoleArn;
        } 

        /**
         * <p>The ARN of the RAM role used by DLF to access catalog data. When configuring the KMS key policy, you must grant this role permissions to use the customer master key.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::123456789012****:role/AliyunDlfNextDataAccessRole</p>
         */
        public Builder dataAccessRoleArn(String dataAccessRoleArn) {
            this.dataAccessRoleArn = dataAccessRoleArn;
            return this;
        }

        /**
         * <p>The authorization statement that must be added to the customer master key policy. This statement grants the DLF data access role corresponding to dataAccessRoleArn the KMS permissions required for data encryption and decryption.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Sid&quot;:&quot;AllowDLFDataAccess&quot;,&quot;Effect&quot;:&quot;Allow&quot;,&quot;Principal&quot;:{&quot;RAM&quot;:[&quot;acs:ram::123456789012****:role/
         *   AliyunDlfNextDataAccessRole&quot;]},&quot;Action&quot;:[&quot;kms:Decrypt&quot;,&quot;kms:GenerateDataKey&quot;],&quot;Resource&quot;:[&quot;*&quot;]}</p>
         */
        public Builder keyPolicyStatement(String keyPolicyStatement) {
            this.keyPolicyStatement = keyPolicyStatement;
            return this;
        }

        /**
         * <p>The region ID to which the catalog belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder region(String region) {
            this.region = region;
            return this;
        }

        /**
         * <p>The DLF workflow role ARN. In the current version, the workflow role is not granted customer master key access permissions based on the least privilege principle. Therefore, this field returns an empty value.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        public Builder workflowRoleArn(String workflowRoleArn) {
            this.workflowRoleArn = workflowRoleArn;
            return this;
        }

        public GetCatalogKmsGrantsResponseBody build() {
            return new GetCatalogKmsGrantsResponseBody(this);
        } 

    } 

}
