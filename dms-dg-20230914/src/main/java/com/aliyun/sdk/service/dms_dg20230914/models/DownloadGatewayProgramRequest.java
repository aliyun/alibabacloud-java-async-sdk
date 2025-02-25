// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_dg20230914.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DownloadGatewayProgramRequest} extends {@link RequestModel}
 *
 * <p>DownloadGatewayProgramRequest</p>
 */
public class DownloadGatewayProgramRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DgVersion")
    private String dgVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserOS")
    private String userOS;

    private DownloadGatewayProgramRequest(Builder builder) {
        super(builder);
        this.dgVersion = builder.dgVersion;
        this.userOS = builder.userOS;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DownloadGatewayProgramRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dgVersion
     */
    public String getDgVersion() {
        return this.dgVersion;
    }

    /**
     * @return userOS
     */
    public String getUserOS() {
        return this.userOS;
    }

    public static final class Builder extends Request.Builder<DownloadGatewayProgramRequest, Builder> {
        private String dgVersion; 
        private String userOS; 

        private Builder() {
            super();
        } 

        private Builder(DownloadGatewayProgramRequest request) {
            super(request);
            this.dgVersion = request.dgVersion;
            this.userOS = request.userOS;
        } 

        /**
         * DgVersion.
         */
        public Builder dgVersion(String dgVersion) {
            this.putBodyParameter("DgVersion", dgVersion);
            this.dgVersion = dgVersion;
            return this;
        }

        /**
         * UserOS.
         */
        public Builder userOS(String userOS) {
            this.putBodyParameter("UserOS", userOS);
            this.userOS = userOS;
            return this;
        }

        @Override
        public DownloadGatewayProgramRequest build() {
            return new DownloadGatewayProgramRequest(this);
        } 

    } 

}
