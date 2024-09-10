// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSuspiciousUUIDConfigRequest} extends {@link RequestModel}
 *
 * <p>DescribeSuspiciousUUIDConfigRequest</p>
 */
public class DescribeSuspiciousUUIDConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private DescribeSuspiciousUUIDConfigRequest(Builder builder) {
        super(builder);
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSuspiciousUUIDConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<DescribeSuspiciousUUIDConfigRequest, Builder> {
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSuspiciousUUIDConfigRequest request) {
            super(request);
            this.type = request.type;
        } 

        /**
         * The type of proactive defense. Valid values:
         * <p>
         * 
         * *   **auto_breaking**: virus defense
         * *   **ransomware_breaking**: ransomware capture
         * *   **webshell_cloud_breaking**: webshell defense
         * *   **alinet**: malicious behavior defense
         * *   **alisecguard**: client protection
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public DescribeSuspiciousUUIDConfigRequest build() {
            return new DescribeSuspiciousUUIDConfigRequest(this);
        } 

    } 

}
