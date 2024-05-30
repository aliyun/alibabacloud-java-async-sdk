// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyOpenLogShipperRequest} extends {@link RequestModel}
 *
 * <p>ModifyOpenLogShipperRequest</p>
 */
public class ModifyOpenLogShipperRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("From")
    private String from;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceDirectoryAccountId")
    private Long resourceDirectoryAccountId;

    private ModifyOpenLogShipperRequest(Builder builder) {
        super(builder);
        this.from = builder.from;
        this.resourceDirectoryAccountId = builder.resourceDirectoryAccountId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyOpenLogShipperRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return from
     */
    public String getFrom() {
        return this.from;
    }

    /**
     * @return resourceDirectoryAccountId
     */
    public Long getResourceDirectoryAccountId() {
        return this.resourceDirectoryAccountId;
    }

    public static final class Builder extends Request.Builder<ModifyOpenLogShipperRequest, Builder> {
        private String from; 
        private Long resourceDirectoryAccountId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyOpenLogShipperRequest request) {
            super(request);
            this.from = request.from;
            this.resourceDirectoryAccountId = request.resourceDirectoryAccountId;
        } 

        /**
         * The ID of the request source. Default value: **aegis**. Valid values:
         * <p>
         * 
         * *   **aegis**: Server Guard
         * *   **sas**: Security Center
         * 
         * >  If you use Server Guard, set the value to **aegis**. If you use Security Center, set the value to **sas**.
         */
        public Builder from(String from) {
            this.putQueryParameter("From", from);
            this.from = from;
            return this;
        }

        /**
         * ResourceDirectoryAccountId.
         */
        public Builder resourceDirectoryAccountId(Long resourceDirectoryAccountId) {
            this.putQueryParameter("ResourceDirectoryAccountId", resourceDirectoryAccountId);
            this.resourceDirectoryAccountId = resourceDirectoryAccountId;
            return this;
        }

        @Override
        public ModifyOpenLogShipperRequest build() {
            return new ModifyOpenLogShipperRequest(this);
        } 

    } 

}
