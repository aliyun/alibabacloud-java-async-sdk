// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20170823.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAuditSettingRequest} extends {@link RequestModel}
 *
 * <p>UpdateAuditSettingRequest</p>
 */
public class UpdateAuditSettingRequest extends Request {
    @Query
    @NameInMap("AuditRange")
    private String auditRange;

    @Query
    @NameInMap("Callback")
    private String callback;

    @Query
    @NameInMap("Seed")
    private String seed;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    private UpdateAuditSettingRequest(Builder builder) {
        super(builder);
        this.auditRange = builder.auditRange;
        this.callback = builder.callback;
        this.seed = builder.seed;
        this.sourceIp = builder.sourceIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAuditSettingRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return auditRange
     */
    public String getAuditRange() {
        return this.auditRange;
    }

    /**
     * @return callback
     */
    public String getCallback() {
        return this.callback;
    }

    /**
     * @return seed
     */
    public String getSeed() {
        return this.seed;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    public static final class Builder extends Request.Builder<UpdateAuditSettingRequest, Builder> {
        private String auditRange; 
        private String callback; 
        private String seed; 
        private String sourceIp; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAuditSettingRequest request) {
            super(request);
            this.auditRange = request.auditRange;
            this.callback = request.callback;
            this.seed = request.seed;
            this.sourceIp = request.sourceIp;
        } 

        /**
         * AuditRange.
         */
        public Builder auditRange(String auditRange) {
            this.putQueryParameter("AuditRange", auditRange);
            this.auditRange = auditRange;
            return this;
        }

        /**
         * Callback.
         */
        public Builder callback(String callback) {
            this.putQueryParameter("Callback", callback);
            this.callback = callback;
            return this;
        }

        /**
         * Seed.
         */
        public Builder seed(String seed) {
            this.putQueryParameter("Seed", seed);
            this.seed = seed;
            return this;
        }

        /**
         * SourceIp.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        @Override
        public UpdateAuditSettingRequest build() {
            return new UpdateAuditSettingRequest(this);
        } 

    } 

}
