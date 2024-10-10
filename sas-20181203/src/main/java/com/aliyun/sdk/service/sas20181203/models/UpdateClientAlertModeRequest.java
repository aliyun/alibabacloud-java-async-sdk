// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateClientAlertModeRequest} extends {@link RequestModel}
 *
 * <p>UpdateClientAlertModeRequest</p>
 */
public class UpdateClientAlertModeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Mode")
    private String mode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Uuids")
    private java.util.List < String > uuids;

    private UpdateClientAlertModeRequest(Builder builder) {
        super(builder);
        this.mode = builder.mode;
        this.uuids = builder.uuids;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateClientAlertModeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return mode
     */
    public String getMode() {
        return this.mode;
    }

    /**
     * @return uuids
     */
    public java.util.List < String > getUuids() {
        return this.uuids;
    }

    public static final class Builder extends Request.Builder<UpdateClientAlertModeRequest, Builder> {
        private String mode; 
        private java.util.List < String > uuids; 

        private Builder() {
            super();
        } 

        private Builder(UpdateClientAlertModeRequest request) {
            super(request);
            this.mode = request.mode;
            this.uuids = request.uuids;
        } 

        /**
         * <p>The protection mode. Valid values:</p>
         * <ul>
         * <li><strong>strict</strong>: The strict mode. False positives may be generated. We recommend that you enable this mode during major events.</li>
         * <li><strong>balance</strong>: The balanced mode. More risks can be detected with less false positives in this mode.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>balance</p>
         */
        public Builder mode(String mode) {
            this.putQueryParameter("Mode", mode);
            this.mode = mode;
            return this;
        }

        /**
         * <p>The UUIDs of servers.</p>
         */
        public Builder uuids(java.util.List < String > uuids) {
            this.putQueryParameter("Uuids", uuids);
            this.uuids = uuids;
            return this;
        }

        @Override
        public UpdateClientAlertModeRequest build() {
            return new UpdateClientAlertModeRequest(this);
        } 

    } 

}
