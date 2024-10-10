// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The type of proactive defense. Valid values:</p>
         * <ul>
         * <li><strong>auto_breaking</strong>: virus defense</li>
         * <li><strong>ransomware_breaking</strong>: ransomware capture</li>
         * <li><strong>webshell_cloud_breaking</strong>: webshell defense</li>
         * <li><strong>alinet</strong>: malicious behavior defense</li>
         * <li><strong>alisecguard</strong>: client protection</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>alinet</p>
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
