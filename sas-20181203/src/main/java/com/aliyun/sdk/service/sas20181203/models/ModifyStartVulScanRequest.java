// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyStartVulScanRequest} extends {@link RequestModel}
 *
 * <p>ModifyStartVulScanRequest</p>
 */
public class ModifyStartVulScanRequest extends Request {
    @Query
    @NameInMap("Types")
    private String types;

    @Query
    @NameInMap("Uuids")
    private String uuids;

    private ModifyStartVulScanRequest(Builder builder) {
        super(builder);
        this.types = builder.types;
        this.uuids = builder.uuids;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyStartVulScanRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return types
     */
    public String getTypes() {
        return this.types;
    }

    /**
     * @return uuids
     */
    public String getUuids() {
        return this.uuids;
    }

    public static final class Builder extends Request.Builder<ModifyStartVulScanRequest, Builder> {
        private String types; 
        private String uuids; 

        private Builder() {
            super();
        } 

        private Builder(ModifyStartVulScanRequest request) {
            super(request);
            this.types = request.types;
            this.uuids = request.uuids;
        } 

        /**
         * The types of vulnerabilities that can be detected. Valid values:
         * <p>
         * 
         * *   **cve**: Linux software vulnerabilities
         * *   **sys**: Windows system vulnerabilities
         * *   **cms**: Web-CMS vulnerabilities
         * *   **app**: application vulnerabilities
         * *   **emg**: urgent vulnerabilities
         * *   **image**: container image vulnerabilities
         * *   **sca**: vulnerabilities that are detected based on software component analysis
         * 
         * > If you leave this parameter empty, all types of vulnerabilities can be detected.
         */
        public Builder types(String types) {
            this.putQueryParameter("Types", types);
            this.types = types;
            return this;
        }

        /**
         * The UUIDs of servers.
         */
        public Builder uuids(String uuids) {
            this.putQueryParameter("Uuids", uuids);
            this.uuids = uuids;
            return this;
        }

        @Override
        public ModifyStartVulScanRequest build() {
            return new ModifyStartVulScanRequest(this);
        } 

    } 

}
