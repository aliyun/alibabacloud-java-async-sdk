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
 * {@link CreateDynamicDictRequest} extends {@link RequestModel}
 *
 * <p>CreateDynamicDictRequest</p>
 */
public class CreateDynamicDictRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Override")
    private Boolean override;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    private String sourceIp;

    private CreateDynamicDictRequest(Builder builder) {
        super(builder);
        this.override = builder.override;
        this.sourceIp = builder.sourceIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDynamicDictRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return override
     */
    public Boolean getOverride() {
        return this.override;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    public static final class Builder extends Request.Builder<CreateDynamicDictRequest, Builder> {
        private Boolean override; 
        private String sourceIp; 

        private Builder() {
            super();
        } 

        private Builder(CreateDynamicDictRequest request) {
            super(request);
            this.override = request.override;
            this.sourceIp = request.sourceIp;
        } 

        /**
         * <p>Specifies whether to overwrite existing data. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder override(Boolean override) {
            this.putQueryParameter("Override", override);
            this.override = override;
            return this;
        }

        /**
         * <p>The source IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>123.103.9.***</p>
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        @Override
        public CreateDynamicDictRequest build() {
            return new CreateDynamicDictRequest(this);
        } 

    } 

}
