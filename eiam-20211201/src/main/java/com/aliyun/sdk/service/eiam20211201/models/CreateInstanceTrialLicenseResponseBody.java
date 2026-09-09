// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

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
 * {@link CreateInstanceTrialLicenseResponseBody} extends {@link TeaModel}
 *
 * <p>CreateInstanceTrialLicenseResponseBody</p>
 */
public class CreateInstanceTrialLicenseResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LicenseId")
    private String licenseId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateInstanceTrialLicenseResponseBody(Builder builder) {
        this.licenseId = builder.licenseId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateInstanceTrialLicenseResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return licenseId
     */
    public String getLicenseId() {
        return this.licenseId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String licenseId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateInstanceTrialLicenseResponseBody model) {
            this.licenseId = model.licenseId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The unique identifier of the License.</p>
         * 
         * <strong>example:</strong>
         * <p>license_463hfmewi2njxxxx</p>
         */
        public Builder licenseId(String licenseId) {
            this.licenseId = licenseId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateInstanceTrialLicenseResponseBody build() {
            return new CreateInstanceTrialLicenseResponseBody(this);
        } 

    } 

}
