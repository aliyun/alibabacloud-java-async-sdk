// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link SasInstallCodeRequest} extends {@link RequestModel}
 *
 * <p>SasInstallCodeRequest</p>
 */
public class SasInstallCodeRequest extends Request {
    @Query
    @NameInMap("SourceIp")
    private String sourceIp;


    private SasInstallCodeRequest(Builder builder) {
        super(builder);
        this.sourceIp = builder.sourceIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SasInstallCodeRequest create() {
        return builder().build();
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    public static final class Builder extends Request.Builder {
        private String sourceIp; 

        /**
         * <p>SourceIp.</p>
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        public SasInstallCodeRequest build() {
            return new SasInstallCodeRequest(this);
        } 

    } 

}
